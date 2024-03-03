import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class Po extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String mobile=req.getParameter("mobile");
		String email=req.getParameter("email");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("doPost");
		out.println("<h1>"+name+"</h1>");
		out.println("<h1>"+age+"</h1>");
		out.println("<h1>"+email+"</h1>");
		out.println("<h1>"+mobile+"</h1>");
		}
		@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String mobile=req.getParameter("mobile");
		String email=req.getParameter("email");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("doGet");
		out.println("<h1>"+name+"</h1>");
		out.println("<h1>"+age+"</h1>");
		out.println("<h1>"+email+"</h1>");
		out.println("<h1>"+mobile+"</h1>");
	}

}
