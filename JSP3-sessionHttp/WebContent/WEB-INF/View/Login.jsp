<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1><%= request.getAttribute("msg") != null ? request.getAttribute("msg"): " "  %></h1>
	
	<form action="LoginController" method="post">
		<input type="text" name="username"/>
		<br/>
		<input type="password" name="password"/>
		<br/>
		<input type="submit" value="login"/>
	</form>
</body>
</html>