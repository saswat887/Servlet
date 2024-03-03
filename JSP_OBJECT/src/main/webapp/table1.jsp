<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="tableerror.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String str=(String)request.getParameter("num");
		int n=Integer.parseInt(str);
		session.setAttribute("number", n);
		session.setAttribute("snum", str);
		response.sendRedirect("table.jsp");
	%>
</body>
</html>