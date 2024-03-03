<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String str=request.getParameter("n");
		int num=Integer.parseInt(str);
		if(num%2==0)
		{
			System.out.println(3/0);
			session.setAttribute("even", num+" is even");
			response.sendRedirect("evenodd.jsp");
		}
		else
		{
			session.setAttribute("odd", num+" is odd");
			response.sendRedirect("evenodd.jsp");
		}
	%>
</body>
</html>