package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		//String email=req.getParameter("email");
		String password=req.getParameter("password");
		//System.out.println(email);
		System.out.println(password);
		
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body><h1>"+password+"</h1></body></html>");
		
		
		/*RequestDispatcher rd=req.getRequestDispatcher("student");
		rd.forward(req, res);*/
		
		RequestDispatcher rd1=req.getRequestDispatcher("student");
		rd1.include(req, res);	
	}

}
