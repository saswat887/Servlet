package pe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

public class FlappyBird extends JPanel implements ActionListener {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int PIPE_WIDTH = 80;
    private static final int PIPE_HEIGHT = 400;
    private static final int PIPE_GAP = 200;
    private static final int BIRD_SIZE = 40;
    private static final int GRAVITY = 2;
    private static final int FLAP_STRENGTH = 15;
    private static final int PIPE_SPEED = 5;
    private static final int INITIAL_PIPE_POSITION = WIDTH;
    private static final int PIPE_SPACING = 300;
    private static final int TIMER_DELAY = 20;

    private ArrayList<Pipe> pipes;
    private Bird bird;
    private Timer timer;
    private boolean gameOver;
    private int score;

    public FlappyBird() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.cyan);
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE && !gameOver) {
                    bird.flap();
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER && gameOver) {
                    startGame();
                }
            }
        });

        startGame();
    }

    private void startGame() {
        pipes = new ArrayList<>();
        bird = new Bird();
        pipes.add(new Pipe(INITIAL_PIPE_POSITION));
        timer = new Timer(TIMER_DELAY, this);
        score = 0;
        gameOver = false;
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Pipe pipe : pipes) {
            pipe.draw(g);
        }
        bird.draw(g);
        if (gameOver) {
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.BOLD, 50));
            g.drawString("Game Over!", WIDTH / 2 - 150, HEIGHT / 2 - 50);
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.drawString("Score: " + score, WIDTH / 2 - 70, HEIGHT / 2 + 50);
            g.drawString("Press Enter to Restart", WIDTH / 2 - 180, HEIGHT / 2 + 100);
        } else {
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.drawString("Score: " + score, 20, 40);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!gameOver) {
            bird.update();
            for (Pipe pipe : pipes) {
                pipe.update();
                if (pipe.collidesWith(bird)) {
                    gameOver = true;
                    break;
                }
                if (pipe.getX() == bird.getX()) {
                    score++;
                }
            }
            pipes.removeIf(pipe -> pipe.getX() + PIPE_WIDTH < 0);
            if (bird.getY() > HEIGHT || bird.getY() + BIRD_SIZE < 0) {
                gameOver = true;
            }
            if (pipes.get(pipes.size() - 1).getX() < WIDTH - PIPE_SPACING) {
                pipes.add(new Pipe(WIDTH));
            }
        }
        repaint();
    }

    private class Pipe {
        private int x;
        private int gapY;

        public Pipe(int x) {
            this.x = x;
            gapY = new Random().nextInt(HEIGHT - PIPE_GAP);
        }

        public void update() {
            x -= PIPE_SPEED;
        }

        public boolean collidesWith(Bird bird) {
            return bird.getX() + BIRD_SIZE > x && bird.getX() < x + PIPE_WIDTH &&
                    (bird.getY() < gapY || bird.getY() + BIRD_SIZE > gapY + PIPE_GAP);
        }

        public void draw(Graphics g) {
            g.setColor(Color.GREEN);
            g.fillRect(x, 0, PIPE_WIDTH, gapY);
            g.fillRect(x, gapY + PIPE_GAP, PIPE_WIDTH, HEIGHT - gapY - PIPE_GAP);
        }

        public int getX() {
            return x;
        }
    }

    private class Bird {
        private int x;
        private int y;
        private int velocity;

        public Bird() {
            x = WIDTH / 4;
            y = HEIGHT / 2;
        }

        public void flap() {
            velocity = -FLAP_STRENGTH;
        }

        public void update() {
            velocity += GRAVITY;
            y += velocity;
        }

        public void draw(Graphics g) {
            g.setColor(Color.RED);
            g.fillRect(x, y, BIRD_SIZE, BIRD_SIZE);
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Flappy Bird");
        FlappyBird game = new FlappyBird();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
