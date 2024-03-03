<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prime No</title>
<%@ include file="component/allcss.jsp" %>
<%@ include file="component/font.jsp" %>
</head>
<body>
	<center><h1 class="p-3 mb-2 bg-primary text-white shadow-lg rounded ">PALINDROME NUMBER</h1></center>
	<center><p class="font ">A palindrome number is a numerical value that remains the same when its digits are reversed. In other words, it reads the same backward as forward. For example, 121, 1331, and 454 are palindrome numbers, as they maintain their original sequence when their digits are reversed. Palindrome numbers are interesting mathematical and linguistic phenomena and are often explored in various fields, including number theory and recreational mathematics.</p></center>
<center>
<div class="card paint-card" style="max-width: 18rem;">
	<form action="pallindrone" method="post">
	<div class="form-group">
		<label>Enter number</label><input type="text" class="form-control" name="first"><br><br>
	</div>
		<input type="submit" class="btn btn-primary"> 
	</form>
	<%
		String p=(String)session.getAttribute("p");
		if(p!=null)
		{
	%>
		<br>
		<p style="font-size: 15px"><%=p %></p>
	<%
		session.removeAttribute("p");
		}
	%>
</div>
</center>
	
</body>
</html>