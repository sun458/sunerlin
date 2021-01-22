<%--
  Created by IntelliJ IDEA.
  User: 孙二林
  Date: 2021/1/15
  Time: 18:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>失败</title>
</head>
<body>
    <%= request.getAttribute("msg") %>

    <h3 style="color: darkorange">登陆失败</h3>
</body>
</html>
