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


	
	<form action="TestConnectionForward" method="post">
		
			  <c:forEach items = "${listCorrectAnswer}" var = "listCorrectAnswer">
			      <c:forEach items = "${listAnswerUser}" var = "listAnswerUser">
			      <c:if test = "${listCorrectAnswer.number == listAnswerUser.number}"> <!-- tranh TH nguoi ta lm nguoc tu duoi len -->
			     			       			
			       		
			       		 <c:if test = "${listCorrectAnswer.correctanswer == 'A'}">
			       		
			       			<c:if test = "${listAnswerUser.answer == 'A'}">
			       				 <p>${listCorrectAnswer.number}. ${listCorrectAnswer.question} : </p>
				        		<img src="Image/ok.png" alt=""/>${listCorrectAnswer.option1}<br>
				        		${listCorrectAnswer.option2}<br>
				       	  		${listCorrectAnswer.option3}<br>
				        	    ${listCorrectAnswer.option4}<br>
			       			</c:if>
			       			<c:if test = "${listAnswerUser.answer == 'B'}">
			       				 <p>${listCorrectAnswer.number}. ${listCorrectAnswer.question} : </p>
				        		<img src="Image/ok.png" alt=""/>${listCorrectAnswer.option1}<br>
				        		<img src="Image/cancel.png" alt=""/>${listCorrectAnswer.option2}<br>
				       	  		${listCorrectAnswer.option3}<br>
				        	    ${listCorrectAnswer.option4}<br>
			       			</c:if>
			       			<c:if test = "${listAnswerUser.answer == 'C'}">
			       			 <p>${listCorrectAnswer.number}. ${listCorrectAnswer.question} : </p>
				        		<img src="Image/ok.png" alt=""/>${listCorrectAnswer.option1}<br>
				        		${listCorrectAnswer.option2}<br>
				       	  		<img src="Image/cancel.png" alt=""/>${listCorrectAnswer.option3}<br>
				        	    ${listCorrectAnswer.option4}<br>
				       		</c:if>
				       		<c:if test = "${listAnswerUser.answer == 'D'}">
				       			 <p>${listCorrectAnswer.number}. ${listCorrectAnswer.question} : </p>
				        		<img src="Image/ok.png" alt=""/>${listCorrectAnswer.option1}<br>
				        		${listCorrectAnswer.option2}<br>
				       	  		${listCorrectAnswer.option3}<br>
				        	  <img src="Image/cancel.png" alt=""/>  ${listCorrectAnswer.option4}<br>
				       		</c:if>
			       		</c:if>
			       		<c:if test = "${listCorrectAnswer.correctanswer == 'B'}">
			       			<c:if test = "${listAnswerUser.answer == 'A'}">
			       				 <p>${listCorrectAnswer.number}. ${listCorrectAnswer.question} : </p>
				        		<img src="Image/cancel.png" alt=""/>${listCorrectAnswer.option1}<br>
				        		<img src="Image/ok.png" alt=""/>${listCorrectAnswer.option2}<br>
				       	  		${listCorrectAnswer.option3}<br>
				        	    ${listCorrectAnswer.option4}<br>
			       			</c:if>
			       			<c:if test = "${listAnswerUser.answer == 'B'}">
			       				 <p>${listCorrectAnswer.number}. ${listCorrectAnswer.question} : </p>
				        		${listCorrectAnswer.option1}<br>
				        		<img src="Image/ok.png" alt=""/>${listCorrectAnswer.option2}<br>
				       	  		${listCorrectAnswer.option3}<br>
				        	    ${listCorrectAnswer.option4}<br>
			       			</c:if>
			       			<c:if test = "${listAnswerUser.answer == 'C'}">
			       			 <p>${listCorrectAnswer.number}. ${listCorrectAnswer.question} : </p>
				        		${listCorrectAnswer.option1}<br>
				        		<img src="Image/ok.png" alt=""/>${listCorrectAnswer.option2}<br>
				       	  		<img src="Image/cancel.png" alt=""/>${listCorrectAnswer.option3}<br>
				        	    ${listCorrectAnswer.option4}<br>
				       		</c:if>
				       		<c:if test = "${listAnswerUser.answer == 'D'}">
				       			 <p>${listCorrectAnswer.number}. ${listCorrectAnswer.question} : </p>
				        		<img src="Image/ok.png" alt=""/>${listCorrectAnswer.option1}<br>
				        		${listCorrectAnswer.option2}<br>
				       	  		${listCorrectAnswer.option3}<br>
				        	  <img src="Image/cancel.png" alt=""/>  ${listCorrectAnswer.option4}<br>
				       		</c:if>
			       		</c:if>
			       		<c:if test = "${listCorrectAnswer.correctanswer == 'C'}">
			       			<c:if test = "${listAnswerUser.answer == 'A'}">
			       				 <p>${listCorrectAnswer.number}. ${listCorrectAnswer.question} : </p>
				        		<img src="Image/cancel.png" alt=""/>${listCorrectAnswer.option1}<br>
				        		${listCorrectAnswer.option2}<br>
				       	  		<img src="Image/ok.png" alt=""/>${listCorrectAnswer.option3}<br>
				        	    ${listCorrectAnswer.option4}<br>
			       			</c:if>
			       			<c:if test = "${listAnswerUser.answer == 'B'}">
			       				 <p>${listCorrectAnswer.number}. ${listCorrectAnswer.question} : </p>
				        		${listCorrectAnswer.option1}<br>
				        		<img src="Image/cancel.png" alt=""/>${listCorrectAnswer.option2}<br>
				       	  		<img src="Image/ok.png" alt=""/>${listCorrectAnswer.option3}<br>
				        	    ${listCorrectAnswer.option4}<br>
			       			</c:if>
			       			<c:if test = "${listAnswerUser.answer == 'C'}">
			       			 <p>${listCorrectAnswer.number}. ${listCorrectAnswer.question} : </p>
				        		${listCorrectAnswer.option1}<br>
				        		${listCorrectAnswer.option2}<br>
				       	  		<img src="Image/ok.png" alt=""/>${listCorrectAnswer.option3}<br>
				        	    ${listCorrectAnswer.option4}<br>
				       		</c:if>
				       		<c:if test = "${listAnswerUser.answer == 'D'}">
				       			 <p>${listCorrectAnswer.number}. ${listCorrectAnswer.question} : </p>
				        		${listCorrectAnswer.option1}<br>
				        		${listCorrectAnswer.option2}<br>
				       	  		<img src="Image/ok.png" alt=""/>${listCorrectAnswer.option3}<br>
				        	  <img src="Image/cancel.png" alt=""/>  ${listCorrectAnswer.option4}<br>
				       		</c:if>
			       		</c:if>
			       		<c:if test = "${listCorrectAnswer.correctanswer == 'D'}">
			       			<c:if test = "${listAnswerUser.answer == 'A'}">
			       				 <p>${listCorrectAnswer.number}. ${listCorrectAnswer.question} : </p>
				        		<img src="Image/cancel.png" alt=""/>${listCorrectAnswer.option1}<br>
				        		${listCorrectAnswer.option2}<br>
				       	  		${listCorrectAnswer.option3}<br>
				        	   <img src="Image/ok.png" alt=""/> ${listCorrectAnswer.option4}<br>
			       			</c:if>
			       			<c:if test = "${listAnswerUser.answer == 'B'}">
			       				 <p>${listCorrectAnswer.number}. ${listCorrectAnswer.question} : </p>
				        		${listCorrectAnswer.option1}<br>
				        		<img src="Image/cancel.png" alt=""/>${listCorrectAnswer.option2}<br>
				       	  		${listCorrectAnswer.option3}<br>
				        	    <img src="Image/ok.png" alt=""/>${listCorrectAnswer.option4}<br>
			       			</c:if>
			       			<c:if test = "${listAnswerUser.answer == 'C'}">
			       			 <p>${listCorrectAnswer.number}. ${listCorrectAnswer.question} : </p>
				        		${listCorrectAnswer.option1}<br>
				        		${listCorrectAnswer.option2}<br>
				       	  		<img src="Image/cancel.png" alt=""/>${listCorrectAnswer.option3}<br>
				        	   <img src="Image/ok.png" alt=""/> ${listCorrectAnswer.option4}<br>
				       		</c:if>
				       		<c:if test = "${listAnswerUser.answer == 'D'}">
				       			 <p>${listCorrectAnswer.number}. ${listCorrectAnswer.question} : </p>
				        		${listCorrectAnswer.option1}<br>
				        		${listCorrectAnswer.option2}<br>
				       	  		${listCorrectAnswer.option3}<br>
				        	  <img src="Image/ok.png" alt=""/>  ${listCorrectAnswer.option4}<br>
				       		</c:if>
			       		</c:if>
			       		
			       	</c:if>
			      </c:forEach>
			  </c:forEach>
			  
			 <br/>
			 <br/>
		<input type="submit" value="Again"/>  
	</form>
	


	 

</body>
</html>