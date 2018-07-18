<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>


<html>
    <head>
        <script type="text/javascript">
            function submitForm()
            {
                document.forms[0].action = "UserAction.do?method=add";
                document.forms[0].submit();
            }
        </script>
    </head>
    <body>
        <html:form action="UserAction" >
            <table>
                <tr>
                    <td>
                        <bean:write name="UserForm" property="message" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <html:submit value="Add" onclick="submitForm()" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <html:submit property="method" value="update" /> 
                    </td>
                </tr>
                <tr>
                    <td>
                        <html:submit  property="method" >delete</html:submit>
                    </td>
                </tr>
            </table>
        </html:form>
    </body>
</html>