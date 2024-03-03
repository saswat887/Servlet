<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%String name=request.getParameter("name");
	String age=request.getParameter("age");
	String mobile=request.getParameter("mobile");
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","root");
	PreparedStatement pst=con.prepareStatement("insert into user(name,age,mobile) values (?,?,?)");
	pst.setString(1, name);
	pst.setString(2, age);
	pst.setString(3, mobile);
	pst.execute();
	%>
	<h3>Your Name is :</h3><h1><%out.println(name); %></h1>
	<h3>Your Age is :</h3><h1><%=age %></h1>
	<h3>Your Mobile no is :</h3><h1><%=mobile%></h1>
</body>
</html>