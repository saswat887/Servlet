package com.pack2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Saswat implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int x=10;
		response.setContentType("text/html");
		PrintWriter p=response.getWriter();
		p.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "    <head>\r\n"
				+ "        <style>\r\n"
				+ "            body{\r\n"
				+ "                background-color: cadetblue;\r\n"
				+ "                font-size: 10px;\r\n"
				+ "            }\r\n"
				+ "            h1{\r\n"
				+ "                font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;\r\n"
				+ "    \r\n"
				+ "            }\r\n"
				+ "        </style>\r\n"
				+ "    </head>\r\n"
				+ "<body>\r\n"
				+ "    <h1>STUDENT DATA</h1>\r\n"
				+ "    <table>\r\n"
				+ "        <tr>\r\n"
				+ "            <th>SL no</th>\r\n"
				+ "            <th>Name</th>\r\n"
				+ "            <th>Marks</th>\r\n"
				+ "        </tr>\r\n"
				+ "        <tr>\r\n"
				+ "            <td>1.</td>\r\n"
				+ "            <td>Saswat</td>\r\n"
				+ "            <td>100</td>\r\n"
				+ "        </tr>\r\n"
				+ "    </table>\r\n"
				+x
				+ "</body>\r\n"
				+ "</html>");
		/*p.println("<body>");
		p.println("<table>");
		p.println("<tr>");
		p.println("");
		p.println("");
		p.println("");
		p.println("");
		p.println("");
		p.println("");
		p.println("");
		p.println("");
		p.println("");
		p.println("");
		p.println("");
		p.println("");*/
		
		
	}

}
