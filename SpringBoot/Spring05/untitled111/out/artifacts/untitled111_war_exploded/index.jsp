<%--
  Created by IntelliJ IDEA.
  User: wangchao
  Date: 2021/11/30
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>

    <script type="text/javascript">
        function testJson() {
            //获取输入的值pname为id
            var pname = $("#pname").val();
            var password = $("#password").val();
            var page = $("#page").val();

            // JSON.stringify({pname: pname, password: password, page: page})
            $.ajax(
                    {
                        //请求路径
                        url: "${pageContext.request.contextPath}/testJson",
                        //请求类型
                        type: "post",
                        //data表示发送的数据
                        data: JSON.stringify({pname: pname, password: password, page: page}),
                        //定义发送请求的数据格式为JSON字符串
                        contentType: "application/json;charset=utf-8",
                        //定义回调响应的数据格式为JSON字符串，该属性可以省略
                        dataType: "json",
                        //成功响应的结果
                        success: function (data) {
                            if (data != null) {
                                //返回一个Person对象
                                for (var i = 0; i < data.length; i++) {
                                    alert(data[i].pname);
                                }
                            }
                        }
                    }
            );

        }
    </script>
</head>
<body>
<form action="">
    用户名：<input type="text" name="pname" id="pname"/><br>
    密码：<input type="password" name="password" id="password"/><br>
    年龄：<input type="text" name="page" id="page"/><br>
    <input type="button" value="测试" onclick="testJson()"/><br>

</form>


</body>
</html>
