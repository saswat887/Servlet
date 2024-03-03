<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
		public void jspInit()
		{
			System.out.println("jsp init method");
		}
	%>
	<%
		System.out.println("service method executed");
	%>
	<%!
		public void jspDestroy()
		{
			System.out.println("destroy method executed");
		}
	%>
	

</body>
</html>