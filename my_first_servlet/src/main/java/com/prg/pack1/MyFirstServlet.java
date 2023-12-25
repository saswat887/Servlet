package com.prg.pack1;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFirstServlet implements Servlet{
	static {
		System.out.println("Servlet is loaded .this is static block");
	}
	{
		System.out.println("Object Created.This is non static block");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy() executed");
		
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return"This is my first servlet class";
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init() executed");
	//	System.out.println(getServletConfig());
		
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service() executed");
	//	System.out.println(getServletInfo());
		
	}
	

}
