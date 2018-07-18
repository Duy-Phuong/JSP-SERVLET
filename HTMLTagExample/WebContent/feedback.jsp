<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HTML Tag Example</title>
    </head>
    <body>
        <b>Feedback Form</b>
        <hr>
        <html:form action="/feedbackAction">
            <table>
                <tr>
                    <td>
                        Name :
                    </td>
                    <td>
                        <html:text name="feedbackForm" property="name" />
                    </td>
                </tr>
                <tr>
                    <td>
                        Sex :
                    </td>
                    <td>
                        <html:radio name="feedbackForm" property="sex" value="M" >
                            M
                        </html:radio>
                        <html:radio name="feedbackForm" property="sex" value="F" >
                            F
                        </html:radio>
                    </td>
                </tr>
                <tr>
                    <td>
                        Comments :
                    </td>
                    <td>
                        <html:textarea cols="20" rows="5" name="feedbackForm" property="comments" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <html:submit />
                    </td>
                    <td>
                        <html:reset />
                    </td>
                </tr>
            </table>
        </html:form>
    </body>
</html>
