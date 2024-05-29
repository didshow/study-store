<%--
  Created by IntelliJ IDEA.
  User: wangchao
  Date: 2021/11/30
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>用户列表</title>
</head>
<body>
<h1>用户列表</h1>
<a href="<c:url value="${pageContext.request.contextPath}/user/input"/>" 继续添加></a>
<table>
    <tr>
        <th>用户名</th>
        <th>兴趣爱好</th>
        <th>朋友</th>
        <th>职业</th>
        <th>户籍</th>
        <th>个人描述</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.userName}</td>
            <td>
                <c:forEach items="${user.hobby}" var="hobby">
                    ${hobby}&nbsp;
                </c:forEach>
            </td>
            <td>
                <c:forEach items="${user.friends}" var="friend">
                    ${friend}&nbsp;
                </c:forEach>
            </td>
            <td>
                <c:forEach items="${user.carrer}" var="car">
                    ${car}&nbsp;
                </c:forEach>
            </td>
            <td>${user.houseRegister}</td>
            <td>${user.remark}</td>
        </tr>

    </c:forEach>

</table>


</body>
</html>
