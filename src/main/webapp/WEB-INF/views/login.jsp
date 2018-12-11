<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yahoooo!!!! ${name}</title>
</head>
<body>
<h1>${error}</h1>
	<form action="/login.do" method="post">
		Enter your name <input type="text" name="name" /> Password <input type="text" name="password" />  <input
			type="submit" />
	</form>

</body>
</html>