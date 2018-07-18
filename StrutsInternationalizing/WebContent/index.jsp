<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html>
    <head>
        <title>
        Struts - I18N
        </title>
    </head>
    <body>
        <table>
            <tr>
                <td>
                    Select your language : 
                    <a href="changeLocale.do?method=english">English</a>
                    <a href="changeLocale.do?method=french">French</a>
                    <a href="changeLocale.do?method=german">German</a>
                    <a href="changeLocale.do?method=italian">Italian</a>
                </td>
            </tr>
            <tr>
                <td>
                    <bean:message key="label.welcome" />
                </td>
            </tr>
        </table>
    </body>
</html>
