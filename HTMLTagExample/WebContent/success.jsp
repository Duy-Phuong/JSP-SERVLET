<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HTML Tag Example</title>
    </head>
    <body>
        <b>Feedback Successfully Submitted.</b><br>
        You have submitted the following feedback.
        <table>
            <tr>
                <td>
                    Name :
                </td>
                <td>
                    <bean:write name="feedbackForm" property="name" />
                </td>
            </tr>
            <tr>
                <td>
                    Sex :
                </td>
                <td>
                    <logic:equal name="feedbackForm" property="sex" value="M">
                        Male
                    </logic:equal>
                    <logic:equal name="feedbackForm" property="sex" value="F">
                        Female
                    </logic:equal>
                </td>
            </tr>
            <tr>
                <td>
                    Comments :
                </td>
                <td>
                    <bean:write name="feedbackForm" property="comments" />
                </td>
            </tr>
            
        </table>
    </body>
</html>
