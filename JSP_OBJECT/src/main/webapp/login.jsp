<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
</style>
</head>
<body>
<h1>
<%--	<%
		String str=(String) application.getAttribute("fail");
		if(str!=null)
		{
			out.println(str);
			application.removeAttribute("fail");
		}
	
	%>--%> 
	<%
		String str=(String) application.getAttribute("fail");
		if(str!=null)
		{%>
			<h1 style="color: red"><%=str %></h1>
		<%
			application.removeAttribute("fail");
		}
	
	%>
</h1>

	<form action="verify.jsp">
		Enter your Mail :-<br>
		<input type="text" name="email"><br>
		Enter your Password:-<br>
		<input type="text" name="password"><br>
		
		<input type="submit" name="Register">
	</form>
</body>
</html>