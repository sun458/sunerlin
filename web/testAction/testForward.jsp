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
    <title>测试标准动作 - forward</title>
</head>
<body>
    <%-- forward动作：在JSP页面中进行请求转发。 --%>
    <jsp:forward page="header.jsp">
        <%-- 传递了请求参数 --%>
        <jsp:param name="x" value="10"/>
        <jsp:param name="y" value="5"/>
    </jsp:forward>

</body>
</html>
