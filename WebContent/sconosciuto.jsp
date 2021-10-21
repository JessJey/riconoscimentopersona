<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		Utente: 
		<br>
		<br>
		<% String rispostaNome= (String)request.getAttribute("rispostaNomeAttribute"); %>
		<% String rispostaCognome= (String)request.getAttribute("rispostaCognomeAttribute"); %>
		
		<%= rispostaNome %>
		<%= rispostaCognome %>
		<br>
		<br>
		sconosciuto.
		<a href="dimmichisei.jsp"> Home </a>
</body>
</html>