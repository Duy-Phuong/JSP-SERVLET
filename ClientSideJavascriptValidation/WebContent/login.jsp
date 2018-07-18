<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page Validation</title>
    </head>
    <body>
        <html:form action="/Login" onsubmit="validateLoginForm(this);">
            <html:javascript formName="LoginForm" />
            User Name : <html:text name="LoginForm" property="userName" /> <br>
            Password  : <html:password name="LoginForm" property="password" /> <br>
            <html:submit value="Login" />
        </html:form>
    </body>
</html>
