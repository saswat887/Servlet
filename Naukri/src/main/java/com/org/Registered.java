package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Registered extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("userName");
		String email=req.getParameter("mail");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1>"
				+ "    Hey "+name+" thanks for applying for job you will received mail on "+email+""
				+ ""
				+ "</h1>");
		
	}

}
