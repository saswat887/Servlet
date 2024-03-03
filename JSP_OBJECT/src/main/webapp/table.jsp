<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="tableerror.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="table1.jsp">
		<input type="text" name="num" ><br><br>
		<input type="submit">
	</form>
	<%
		String str=(String)session.getAttribute("snum");
		Integer n=(Integer)session.getAttribute("number");
		if(str!=null){
	%>
		<table style="color: blue;font-size: 50px;font-family: sans-serif;">
			<%
				for(int i=1;i<=10;i++)
				{%>
				<tr>
					<td><%=n %></td>
					<td>x</td>
					<td><%=i %></td>
					<td>=</td>
					<td><%=n*i %></td>
				</tr>
				<%}
			%>
		</table>
	<%
		session.removeAttribute("snum");
		session.removeAttribute("number");
		}
	%>
</body>
</html>