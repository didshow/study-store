<%--
  Created by IntelliJ IDEA.
  User: didshow
  Date: 2022/12/10
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>register</title>
</head>
<body>
<form action = "${pageContext.request.contextPath}/user/register" method="post" name = "registForm">
    <table border=1>
        <tr>
            <td>姓名：</td>
            <td>
                <input type="text" name = "uname" value = "${user.uname}" />
            </td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="upass"/></td>
        </tr>
        <tr>
            <td>确认密码：</td>
            <td><input type="password" name = "reupass" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="注册"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
