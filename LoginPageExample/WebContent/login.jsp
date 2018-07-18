<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tutorials4u Login Page Example</title>
</head>
<body>
<div style="color: red"><html:errors /></div>
<html:form action="/Login">
	<table>
		<tr>
			<td>User Name:</td>
			<td><html:text name="LoginForm" property="userName" /></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><html:password name="LoginForm" property="password" /></td>
		</tr>
		<tr>
			<td colspan="2"><html:submit value="Login" /></td>
		</tr>
	</table>
</html:form>
</body>
</html>
