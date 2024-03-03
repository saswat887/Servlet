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
	<center><h1 class="p-3 mb-2 bg-primary text-white shadow-lg rounded ">PRIME NUMBER</h1></center>
	<center><p class="font ">Prime numbers are a fascinating mathematical concept that plays a crucial role in number theory and various fields of computer science. These numbers, greater than 1, possess a unique property - they are divisible only by 1 and themselves. This characteristic makes prime numbers fundamental building blocks for other numbers.

The study of prime numbers dates back to ancient times, with mathematicians like Euclid making significant contributions. Prime numbers have a critical role in modern cryptography, where their properties are leveraged for creating secure algorithms and ensuring data privacy.

Understanding prime numbers involves recognizing their distribution and patterns. While there are infinitely many prime numbers, they become less frequent as numbers increase. The prime number theorem, formulated by mathematicians like Gauss and Legendre, provides insights into the distribution of primes.

In computer science, prime numbers find applications in algorithms for hashing, data compression, and random number generation. The uniqueness and unpredictability of prime numbers contribute to their effectiveness in these computational processes.

The search for large prime numbers remains an active area of research, with projects harnessing the power of distributed computing to discover new records. Prime numbers continue to captivate mathematicians, scientists, and enthusiasts alike, showcasing their enduring significance in diverse areas of study.</p></center>
<center>
<div class="card paint-card" style="max-width: 18rem;">
	<form action="primono" method="post">
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