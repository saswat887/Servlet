import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFirstRequest extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String fname=req.getParameter("fname");
		String name=fname.toUpperCase();
		ServletContext context=getServletContext();
		context.setAttribute("firstName", name);
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		out.println("<h1>Your First Name is: "+name+"</h1><br>");
		out.println("<form action='mysec'>"
				+"<input type='text' name='lname' placeholder='Enter Your LastName'>"
				+"<input type='submit'>"
				+"</form>");
		
	}

}
