package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class VerifyUser extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		if(email.equals("admin@gmail.com") && password.equals("admin"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("form2.html");
			rd.forward(req, res);
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("Home.html");
			
			rd.include(req, res);
			out.println("<h1 style='color:red;'>Invalid Email or Password</h1>");
		}
		
	}

}
