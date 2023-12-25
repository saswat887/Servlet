package sercon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DisplayShoes extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		ServletConfig config=getServletConfig();
		String shoe1=config.getInitParameter("shoe1");
		String shoe2=config.getInitParameter("shoe2");
		String shoe3=config.getInitParameter("shoe3");
		String shoe4=config.getInitParameter("shoe4");
		String shoe5=config.getInitParameter("shoe5");
		//System.out.println(shoe5);
		
		String name1=config.getInitParameter("name1");
		String name2=config.getInitParameter("name2");
		String name3=config.getInitParameter("name3");
		String name4=config.getInitParameter("name4");
		String name5=config.getInitParameter("name5");
		
		out.println("<html"
				+"<body>"
				+"<img src='"+shoe1+"' height=200px width=200px><br>"
				+"<h2>"+name1+"</h2>"
				+"<img src='"+shoe2+"' height=200px width=200px><br>"
				+"<h2>"+name2+"</h2>"
				+"<img src='"+shoe3+"' height=200px width=200px><br>"
				+"<h2>"+name3+"</h2>"
				+"<img src='"+shoe4+"' height=200px width=200px><br>"
				+"<h2>"+name4+"</h2>"
				+"<img src='"+shoe5+"' height=200px width=200px><br>"
				+"<h2>"+name5+"</h2>"
				+"</body>"
				+"</html>"
				);
		
	}

}
