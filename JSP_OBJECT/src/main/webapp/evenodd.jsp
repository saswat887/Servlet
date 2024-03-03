<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Even Odd</title>
</head>
<body>
	
	
	<form action="checkevenodd.jsp">
	<input type="text" name="n" placeholder="Enter number">
	<input type="submit">
	</form>
	<%
		String even=(String) session.getAttribute("even");
		String odd=(String) session.getAttribute("odd");
		if(even!=null){%>
		<h3 style="color: red"><%=even %></h3>
		<%
			session.removeAttribute("even");
		}
		else if(odd!=null){%>
		<h3 style="color: blue"><%=odd %></h3>
		<% 
		session.removeAttribute("odd");
		}
	%>
	
		
</body>
</html>