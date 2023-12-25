package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=req.getParameter("email");
		System.out.println(email);
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body><h1>"+email+"</h1></body></html>");
		
	}

}
