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
			<td>Hidden:</td>
			<td><html:hidden name="LoginForm" property="age" value="5"/></td>
		</tr>
		<html:select property="state" >
			<html:option value="0">Select State</html:option>
			<html:option value="1">Ha noi</html:option>
			<html:option value="2">HCM</html:option>
			
		</html:select>
		<tr>
			<td colspan="2"><html:submit value="Login" property="mode"/></td>
			<td colspan="2"><html:submit value="Save" property="mode"/></td>
		</tr>
	</table>
</html:form>

<hr/>
<html:form action="/T002Search">
	<table>
		<tr>
			<td>txtCustomerName Name:</td>
			<td><html:text name="SearchForm" property="txtCustomerName" /></td>
		</tr>
		<tr>
		<html:select property="cboSex" >
			<html:option value="0"></html:option>
			<html:option value="1">Male</html:option>
			<html:option value="2">Female</html:option>
			
		</html:select>
		</tr>
		<tr>
			<td>Birthday from:</td>
			<td><html:text name="SearchForm" property="txtBirthdayFrom" /></td>
		</tr>
		<tr>
			<td>to:</td>
			<td><html:text name="SearchForm" property="txtBirthdayTo" /></td>
		</tr>
	
	
		<tr>
			<td colspan="2"><html:submit value="Search" /></td>
		</tr>
	</table>
</html:form>
</body>
</html>
