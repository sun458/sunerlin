<%--
  Created by IntelliJ IDEA.
  User: 孙二林
  Date: 2021/1/20
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试EL的十一个内置对象</title>
    <style>
        body{
            color: #ff566e;
        }
    </style>
</head>
<body>
    <%-- 1~4 作用域相关的内置对象 --%>
    <%
        pageContext.setAttribute("name","aaa");
        request.setAttribute("name","bbb");
        session.setAttribute("name","ccc");
        application.setAttribute("name","ddd");
    %>

    ${pageScope.name}
    ${requestScope.name}
    ${sessionScope.name}
    ${applicationScope.name}
    <br><hr>

    <%-- 5~6 获取用户提交的请求参数param/paramValues --%>
    <%-- 地址栏输入：http://localhost:8899/testEL/testInnerObject.jsp?name=张三&hobby=music&hobby=game 测试 --%>
    ${param.name}
    ${param.hobby[1]}
    <br><hr>

    <%-- 7~8 获取请求头中的信息 header/headerValues --%>
    ${header}<br>
    ${headerValues.cookie[0]}<br>
    ${headerValues.host[0]}
    <br><hr>

    <%-- 10.pageContext内置对象  --%>
    <%--
        requestScope：
        1.EL直接内置对象
        2.请求域的对象，用来操作请求域中存储的数据

        pageContext.request：
        1.request请求对象，需要从EL内置对象pageContext获取
        2.请求对象，原来Java中请求的所有操作，它都具备
    --%>
    项目路径：${pageContext.request.contextPath}
    项目访问ip：${pageContext.request.remoteAddr}
    <br><hr>

    <%-- 11.initParam内置对象，获取上下文的初始化参数 --%>
    <%--<%= application.getInitParameter("test") %>--%>



</body>
</html>
