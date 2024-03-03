import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/create")
public class create_captcha extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		Random rd=new Random();
		String captcha=""+rd.nextInt(9)+rd.nextInt(9)+rd.nextInt(9)+rd.nextInt(9);
	//	ServletContext context=getServletContext();
		//context.setAttribute("cap", captcha);
		HttpSession session=req.getSession();
		session.setAttribute("cap", captcha);
		out.println("<html>"
				+ "<body>"
				+ "    <h1>"
				+ "        Hey "+name.toUpperCase()
				+ "        <br>"
				+ "        Please Enter the following Captcha "
				+ captcha
				+ "        <form action=\"verify\" method=\"post\">"
				+ "            <input type=\"text\" name=\"captcha\"><br>"
				+ "            <input type=\"submit\">"
				+ "        </form>"
				+ "    </h1>"
				+ "</body>"
				+ "</html>");
		
	}
}
