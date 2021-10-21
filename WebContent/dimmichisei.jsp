<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Benvenuto</title>
</head>
<body>
	Benvenuto!
	<br>
	<form action="CheckPresenzaServlet" method="post"> Dimmi chi sei: 
	<br> 
	       Nome :   <input type="text" name="nomeInput"> 
	<br>
			Cognome :  <input type="text" name="cognomeInput"> 
	<br>
			<input type="submit" value="Conferma">
	</form>
</body>
</html>