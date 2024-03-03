import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/verify")
public class VerifyCaptcha extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userCaptcha=req.getParameter("captcha");
		//ServletContext context=getServletContext();
		//String genCaptcha=(String)context.getAttribute("cap");
		HttpSession session=req.getSession();
		String genCaptcha=(String)session.getAttribute("cap");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		if(userCaptcha.equals(genCaptcha))
		{
			out.println("<h1>Correct Captcha</h1>");
		}
		else
		{
			out.println("<h1>Wrong Captcha</h1>");
		}
	}
}
