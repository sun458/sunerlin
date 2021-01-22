<%--
  Created by IntelliJ IDEA.
  User: 孙二林
  Date: 2021/1/20
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            color: rebeccapurple;
        }
    </style>
</head>
<body>
<%--<% Object obj = session.getAttribute("user"); %>--%>

<%
    int x = Integer.parseInt(request.getParameter("x"));
    int y = Integer.parseInt(request.getParameter("y"));
%>

<%= x/y %>
</body>
</html>
