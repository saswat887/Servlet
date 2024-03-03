<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%! public boolean isEven(int num)
	{
		if(num%2==0)
			return true;
		else
			return false;
	}
	public boolean isOdd(int num)
	{
		if(num%2!=0)
			return true;
		else
			return false;
	}
	%>
	<%
		
		for(int i=0;i<5;i++)
		{
			out.println("<h1 >SASWAT</h1>");
		}
	%>
	<h1>Hello <%= isEven(11) %></h1>
	<h1><%= isOdd(11) %></h1>
	<h1>SASWAT</h1>
</body>
</html>