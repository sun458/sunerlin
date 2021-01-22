<%--
  Created by IntelliJ IDEA.
  User: 孙二林
  Date: 2021/1/20
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试动态包含 - include标准动作</title>
    <style>
        body{
            color: chocolate;
        }
    </style>
</head>
<body>
<%--
        动态包含：
        1.标准动作
        2.page属性，指定包含页面
        3.发生在请求阶段，将包含的jsp文件直接翻译成java文件
        4.header.jsp?x=10&y=2  允许用此种方式传递请求参数
        5.可以使用<jsp:param>子动作，来完成请求参数的传递
    --%>
<%--<jsp:include page="header.jsp?x=10&y=2"></jsp:include>--%>

<jsp:include page="header.jsp">
    <jsp:param name="x" value="6"/>
    <jsp:param name="y" value="2"/>
</jsp:include>

<h3>111</h3>
<h3>111</h3>
<h3>111</h3>
</body>
</html>
