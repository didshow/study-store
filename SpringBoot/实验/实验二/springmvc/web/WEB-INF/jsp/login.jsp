<%--
  Created by IntelliJ IDEA.
  User: didshow
  Date: 2022/12/10
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/login" method="post"></form>
    <table>
        <tr>
            <td align="center" colspan="2">登录</td>
        </tr>
        <tr>
            <td>姓名：</td>
            <td><input type="text" name="uname"/></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="upass"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="password" value="提交">
                <input type="reset" value="重置">
            </td>
        </tr>
    </table>
    ${messageError}
</body>
</html>
