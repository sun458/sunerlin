<%--
  Created by IntelliJ IDEA.
  User: 孙二林
  Date: 2021/1/20
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试包含 - 公共的头部页面</title>
    <style>
        body{
            color:darkslateblue;
        }
    </style>
</head>
<body>
<h2>欢迎</h2>
<%
    int x = Integer.parseInt(request.getParameter("x"));
    int y = Integer.parseInt(request.getParameter("y"));
%>

<h3><%= x/y %></h3>
</body>
</html>
