<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
function check(obj) {
    var name = document.myForm.firstname.value;
    if(name == null || name == ""){
    	alert("bạn phải nhập đầy đủ thong tin");
    	return false;
    }
}

</script>
</head>
<body>
	<h2>HTML Forms</h2>

<form action="Demo" method="post" onsubmit="return check()" name="myForm">
  First name:<br>
  <input type="text" name="firstname">
  <br>
  <br><br>
  <input type="submit" value="Submit">
</form> 
</body>
</html>