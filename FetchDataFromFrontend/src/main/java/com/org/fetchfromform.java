package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class fetchfromform extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String mobile=req.getParameter("mobile");
		res.setContentType("text/html");
		PrintWriter writer=res.getWriter();
		writer.println("<html>"
				+ "    <body>"
				+ "        <h3>Name :</h3><h2>"+name+"</h2>"
				+ "        <h3>Age :</h3><h2>"+age+"</h2>"
				+ "        <h3> Mobile :</h3><h2>"+mobile+"</h2>"
				+ "    </body>"
				+ "</html>");
		
	}

}

