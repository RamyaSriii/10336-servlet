<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% System.out.println("This is a Login page");%>
	<form action="/MovieTktBooking/LoginServlet" method="post">
		User Name: <input type="text" name="uname"/></br>
		Password:  <input type="password" name="password"/></br>
		
		<input type="submit" />
	</form>
</body>
</html>
