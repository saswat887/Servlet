import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MySecondServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String lname=req.getParameter("lname");
		String name=lname.toUpperCase();
		ServletContext context=getServletContext();
		String fname=(String) context.getAttribute("firstName");
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		out.println("<h1> Your First Name is: "+fname+"</h1><br>");
		out.println("<h1> Your Last Name is: "+name+"</h1><br>");
		out.println("<h1> Your Full Name is: "+fname+" "+name+"</h1><br>");
		
	}

}
