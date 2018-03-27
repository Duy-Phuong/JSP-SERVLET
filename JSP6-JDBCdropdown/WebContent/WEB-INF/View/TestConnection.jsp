<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1><%= request.getAttribute("myregister") != null ? request.getAttribute("myregister"): " "  %></h1>
	<h2>Form personal</h2>
	<form action="TestconnectionController" method="post">
		
			Student Name: <input type="text" name="studentname"/><br/>
				<h3>Province options</h3>
				<br>
			
				<select name="dropdownprovince">
					<c:forEach items = "${listprovince}" var = "l">
			         <option value="${l.provinceid}">${l.provincename}</option>
			      </c:forEach>
				</select>
			<input type="submit" value="register"/>
		
	</form>
	


	 

</body>
</html>