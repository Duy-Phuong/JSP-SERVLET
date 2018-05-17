<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<h4><%= request.getAttribute("msg") != null ? request.getAttribute("msg"): " "  %></h4>
	
	<form action="TestconnectionController" method="post">
		
			  <c:forEach items = "${listradio}" var = "l">
			         <p>${l.number}. ${l.question} : </p>
			         <input type="radio" name="ans[${l.number}]" value="A"> ${l.option1}<br>
			          <input type="radio" name="ans[${l.number}]" value="B"> ${l.option2}<br>
			           <input type="radio" name="ans[${l.number}]" value="C"> ${l.option3}<br>
			            <input type="radio" name="ans[${l.number}]" value="D"> ${l.option4}<br>
			      </c:forEach>
			<br/>
			<input type="submit" value="Tabscript"/>  
			 
			
	</form>
	


	 

</body>
</html>