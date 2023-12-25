package org.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FortuneTeller extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String[] arr= {"You will be the king in future","Moye Moye","Life long single","jaldi wahan se hatao","you will lost tonka in two days","tommorow you will be meet your future wife","LOL","destroyed in seconds","get out from my mother land","you will get job soon"};
		Random random =new Random();
		int num=random.nextInt(arr.length-1);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>"
				+"<body>"
				+"<center>"
				+"<h1>"
				+ arr[num]
				+"</h1>"
				+"</center>"
				+"</body>"
				+"</html>"
				);

		
		System.out.println(arr[num]);
		
	}

}
