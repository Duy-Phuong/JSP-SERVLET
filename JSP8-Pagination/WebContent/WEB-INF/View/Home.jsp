<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
  <script src="bootstrap/js/jquery-3.3.1.min.js"></script>
  <script src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Pagination</h2>
  <h3>Page : "${stt}"</h3>
  <h5>table account</h5>
	<table border="1">
	  <tr>
	      <th>
	        id
	      </th>
	      <th>
	        name
	      </th>
	       <th>
	        salary
	      </th>
	  </tr>
	  
	 	<c:forEach items = "${listemp}" var = "l">
         <tr> 
         	<td>
         		 <c:out value = "${l.id}"/>
         	 </td> 
         	 <td>
         		 <c:out value = "${l.name}"/>
         	 </td>
         	 <td>
         		 <c:out value = "${l.salary}"/>
         	 </td> 
          </tr>
      </c:forEach>
	</table> 
 <nav aria-label="Page navigation example">
 
 
  <ul class="pagination">
  <c:if test = "${stt == 1 }">
  
    <li class="page-item disabled">
      <a class="page-link" href="" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
        <span class="sr-only">Previous</span>
      </a>
    </li>
    <li class="page-item"><a class="page-link" href="TestConnectionForward?pageid=1">1</a></li>
    <li class="page-item"><a class="page-link" href="TestConnectionForward?pageid=2">2</a></li>
    <li class="page-item">
      <a class="page-link" href="TestConnectionForward?pageid=${stt+1}" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
        <span class="sr-only">Next</span>
      </a>
    </li>
    </c:if>
    
    <c:if test = "${stt == maxpageid }">
  
    <li class="page-item">
      <a class="page-link" href="TestConnectionForward?pageid=${stt-1}" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
        <span class="sr-only">Previous</span>
      </a>
    </li>
    <li class="page-item"><a class="page-link" href="TestConnectionForward?pageid=1">1</a></li>
    <li class="page-item"><a class="page-link" href="TestConnectionForward?pageid=2">2</a></li>
    <li class="page-item disabled">
      <a class="page-link" href="" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
        <span class="sr-only">Next</span>
      </a>
    </li>
    </c:if>
    
       <c:if test = "${stt < maxpageid && stt > 1 }">
  
    <li class="page-item">
      <a class="page-link" href="TestConnectionForward?pageid=${stt-1}" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
        <span class="sr-only">Previous</span>
      </a>
    </li>
    <li class="page-item"><a class="page-link" href="TestConnectionForward?pageid=1">1</a></li>
    <li class="page-item"><a class="page-link" href="TestConnectionForward?pageid=2">2</a></li>
    <li class="page-item">
      <a class="page-link" href="TestConnectionForward?pageid=${stt+1}" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
        <span class="sr-only">Next</span>
      </a>
    </li>
    </c:if>
  </ul>
  </nav>
</div>


	 

</body>
</html>