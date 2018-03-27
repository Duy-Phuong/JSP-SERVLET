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

	<form action="TestconnectionController" method="post">
		
	
		<input type="submit" value="Display"/>
		
	</form>
	<br>
	<br>
	<h5>table account</h5>
	<table border="1">
	  <tr>
	      <th>
	        Username
	      </th>
	      <th>
	        Pass
	      </th>
	  </tr>
	  
	 	<c:forEach items = "${listaccount}" var = "l">
         <tr> 
         	<td>
         		 <c:out value = "${l.uname}"/>
         	 </td> 
         	 <td>
         		 <c:out value = "${l.pass}"/>
         	 </td> 
          </tr>
      </c:forEach>
	</table> 
	
	<br>
	<br>
	 

</body>
</html>