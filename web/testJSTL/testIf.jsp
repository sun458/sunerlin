<%--
  Created by IntelliJ IDEA.
  User: 孙二林
  Date: 2021/1/20
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>testIf</title>
</head>
<body>
    <%--
        c:if 标签   类比Java中的if
        1.test属性  逻辑表达式 EL表达式
        2.scope属性 将结果存在哪个作用域中
        3.var属性   当前表达式的值存储在哪个变量中
    --%>
    <c:if test="${1<2}" scope="session" var="flag">
        <h1 style="color:orangered">此时test表达式成立</h1>
    </c:if>
    requestScope:${requestScope.flag}<br>
    sessionScope:${sessionScope.flag}<br>

    ${sessionScope.day}
</body>
</html>
