package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Login extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		res.setContentType("text/html");
		PrintWriter p=res.getWriter();
		if(email.equals("admin@gmail.com") && password.equals("admin"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("home.html");
			rd.forward(req, res);
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("Login.html");
			
			rd.include(req, res);
			p.println("<center><h1 style='color:red;'>Invalid Email or Password</h1></center>");
		}
		
	}

}
