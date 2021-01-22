<%--
  Created by IntelliJ IDEA.
  User: 孙二林
  Date: 2021/1/20
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试作用域</title>
    <style>
        body{
            color: darkorange;
            font-size: 18px;
        }
    </style>
</head>
<body>
    <%
        //当前作用域
        String name = "八戒";
        pageContext.setAttribute("name", name);
    %>

    ${pageScope.name}

    ${requestScope.name}

    ${sessionScope.name}

    ${applicationScope.name}

    ${name}

    <h1>str:${str}</h1>
</body>
</html>
