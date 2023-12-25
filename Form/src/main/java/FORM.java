import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FORM extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		long mobile=Long.parseLong(req.getParameter("mobile"));
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		ServletContext context=getServletContext();
		String driver=context.getInitParameter("driver");
		String url=context.getInitParameter("url");
		String user=context.getInitParameter("user");
		String pass=context.getInitParameter("password");
		
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, user, pass);
			PreparedStatement pst=con.prepareStatement("insert into user(name,age,mobile,email,password) values(?,?,?,?,?)");
			pst.setString(1, name);
			pst.setInt(2, age);
			pst.setLong(3, mobile);
			pst.setString(4, email);
			pst.setString(5, password);
			pst.executeUpdate();
			con.close();
			res.setContentType("text/html");
			PrintWriter p=res.getWriter();
			p.println("<html>"
					+ "    <head>"
					+ "        <style>"
					+ "            body{"
					+ "                background-color: pink;"
					+ "            }"
					+ "            h1{"
					+ "                font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;"
					+ "            }"
					+ "        </style>"
					+ "    </head>"
					+ "    <body>"
					+ "       <center> <h1>DATA INSERTED SUCCESSFULLY</h1></center>"
					+ "    </body>"
					+ "</html>");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			PrintWriter p=res.getWriter();
			p.println("<html>"
					+ "    <head>"
					+ "        <style>"
					+ "            body{"
					+ "                background-color: black;"
					+ "            }"
					+ "            h1{"
					+ "               color:white;"
					+ "            }"
					+ "        </style>"
					+ "    </head>"
					+ "    <body>"
					+ "       <center> <h1>FAILED TO INSERT</h1></center>"
					+ "    </body>"
					+ "</html>");
			e.printStackTrace();
		}
	}

}
