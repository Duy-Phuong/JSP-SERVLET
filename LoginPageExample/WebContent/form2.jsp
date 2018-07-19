<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

txtCus: <bean:write name="SearchForm"
	property="txtCustomerName"></bean:write>
	<br/>
	
	sex <bean:write name="SearchForm"
	property="cboSex"></bean:write>
	<br/>
	birthday<bean:write name="SearchForm"
	property="txtBirthdayFrom"></bean:write>
	<br/>
	<bean:write name="SearchForm"
	property="txtBirthdayTo"></bean:write>
	<br/>

</body>
</html>