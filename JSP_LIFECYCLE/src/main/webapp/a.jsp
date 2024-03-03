<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	table {
	border: 2px solid black;
}
</style>
</head>
<body>
<c:forEach var="j" begin="1" end="3">  
  		<table>
  <tr>
    <th>Company</th>
    <th>Contact</th>
    <th>Country</th>
  </tr>
  <tr>
    <td>Alfreds Futterkiste</td>
    <td>Maria Anders</td>
    <td>Germany</td>
  </tr>
  <tr>
    <td>Centro comercial Moctezuma</td>
    <td>Francisco Chang</td>
    <td>Mexico</td>
  </tr>
</table>
	</c:forEach>  
	<c:forEach var="i" begin="1" end="10">
		<h1>SASWAT NAYAK</h1>
	</c:forEach>
<button onclick="document.getElementById('saswat').innerHTML='SASWAT NAYAK==='">ADD</button>
<h1 id="saswat"></h1>
</body>
</html>