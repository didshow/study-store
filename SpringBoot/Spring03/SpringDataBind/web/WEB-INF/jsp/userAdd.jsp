<%--
  Created by IntelliJ IDEA.
  User: wangchao
  Date: 2021/11/30
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"  %>
<%@taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<html>
<head>
  <meta charset="UTF-8">
    <title>用户添加</title>
</head>
<body>
<form:form modelAttribute="user" method="post" action="${pageContext.request.contextPath}/user/save">
  <fieldset>
    <legend>添加一个用户</legend>
    <p>
      <label>用户名：</label>
      <form:input path="userName"/>
    </p>

    <p>
      <label>爱好：</label>
      <form:checkboxes path="hobby" items="${hobbys}"/>
    </p>

    <p>
      <label>朋友：</label>
      <form:checkbox path="friends" value="张三"/>张三
      <form:checkbox path="friends" value="李四"/>李四
      <form:checkbox path="friends" value="王五"/>王五
      <form:checkbox path="friends" value="赵六"/>赵六
    </p>

    <p>
      <label>职业：</label>
      <form:select path="carrer">
        <option/>请选择职业
        <form:options items="${carrers}"/>
      </form:select>
    </p>

    <p>
      <label>户籍：</label>
      <form:select path="houseRegister">
        <option/>请选择户籍
        <form:options items="${houseRegisters}"/>
      </form:select>
    </p>

    <p>
      <label>个人描述：</label>
      <form:textarea path="remark" rows="5"/>
    </p>

    <p id="buttons">
      <input id="reset" type="reset">
      <input id="submit" type="submit" value="添加">
    </p>
  </fieldset>




</form:form>
</body>
</html>
