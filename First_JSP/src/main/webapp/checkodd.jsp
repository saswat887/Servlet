<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%! boolean b;int num=12; %>
	<% if(num%2==0)
			b=true;
		else
			b=false;
	
		%>
	<%=b %>
	
</body>
</html>