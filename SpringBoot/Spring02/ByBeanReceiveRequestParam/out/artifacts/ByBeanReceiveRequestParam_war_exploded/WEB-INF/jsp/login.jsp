<%--
  Created by IntelliJ IDEA.
  User: wangchao
  Date: 2021/11/25
  Time: 13:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login" method="post" >

  <table >
    <tr>
      <td align="center" colspan="2">登录</td>
    </tr>

    <tr>
      <td>姓名：</td>
      <td><input type="text" name="uname" ></td>
    </tr>

    <tr>
      <td>密码：</td>
      <td><input type="password" name="upass" ></td>
    </tr>

    <tr>
      <td colspan="2" ><input type="submit" name="提交"></td>
      <td colspan="2" ><input type="reset" name="重置"></td>
    </tr>
  </table>
</form>
</body>
</html>
