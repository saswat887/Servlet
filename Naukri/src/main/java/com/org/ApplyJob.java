package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ApplyJob extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<!DOCTYPE html>"
				+ "<html>"
				+ "<head>"
				+ "    <title>Document</title>"
				+ "</head>"
				+ "<body>"
				+ "    <form action='register'>"
				+ "      Enter your name:<br>  <input type='text' name='userName'><br>"
				+ "      Enter your email:<br>   <input type='text' name='mail'>"
				+ "        <input type='submit'>"
				+ "    </form>"
				+ "</body>"
				+ "</html>");
		
	}

}
