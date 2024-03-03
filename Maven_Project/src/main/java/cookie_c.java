import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/create")
public class cookie_c extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie1=new Cookie("rollNo", "123");
		Cookie cookie2=new Cookie("Address", "Nayapalli");
		Cookie cookie3=new Cookie("Email", "saswat887@gmail.com");
		Cookie cookie4=new Cookie("Password", "123456");
		Cookie cookie5=new Cookie("message", "Good_Morning");
		cookie5.setMaxAge(10);
		resp.addCookie(cookie1);
		resp.addCookie(cookie2);
		resp.addCookie(cookie3);
		resp.addCookie(cookie4);
		resp.addCookie(cookie5);
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h2>Cookies Added</h2>");
	}
}
