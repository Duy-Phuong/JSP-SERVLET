<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Details</title>
    </head>
    <body>
        <table>
            <tr>
                <td>
                    <logic:present name="UserForm" property="name">
                        The User Name is Vinay.
                    </logic:present>
                    <logic:notPresent name="UserForm" property="name">
                        The User is not Present.
                    </logic:notPresent>
                </td>
            </tr>
            <tr>
                <td>
                    <logic:equal name="UserForm" property="age" value="18">
                        The age is equal to 27.
                    </logic:equal>
                    <logic:notEqual name="UserForm" property="age" value="18">
                        The age is not equal to 27.
                    </logic:notEqual>
                </td>
            </tr>
            <tr>
                <td>
                    <logic:greaterEqual name="UserForm" property="height" value="5.11">
                        The height is greater than or equal to 5.7
                    </logic:greaterEqual>
                    <logic:greaterThan name="UserForm" property="height" value="5.11">
                        The height is greater than 5.11
                    </logic:greaterThan>
                </td>
            </tr>
            <tr>
                <td>
                    <logic:lessEqual name="UserForm" property="weight" value="70">
                        The weight is less than or equal to 70.
                    </logic:lessEqual>
                    <logic:lessThan name="UserForm" property="weight" value="70">
                        The weight is less than 70.
                    </logic:lessThan>
                </td>
            </tr>
            <tr>
                <td>
                    <logic:match name="UserForm" property="favouriteFood" value="Chicken">
                        The user's favourite food includes Chicken.
                    </logic:match>
                    <logic:notMatch name="UserForm" property="favouriteFood" value="Chicken">
                        The user's favourite food does not includes Chicken.
                    </logic:notMatch>
                </td>
            </tr>
            <tr>
                <td>
                    The hobbies are
                    <logic:iterate name="UserForm" property="hobbies" id="data">
                        <bean:write name="data" />
                    </logic:iterate>
                </td>
            </tr>
        </table>
    </body>
</html>
