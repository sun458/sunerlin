<%@ page import="ch2.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: 孙二林
  Date: 2021/1/20
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试C:set标签</title>
</head>
<body>
    <%--
        c:set  给指定作用域中设置值或者替换值
        1.value属性  设置值
        2.scope属性  设置的变量存放的作用域，若不指定则默认存放在当前页作用域
        3.var属性    设置变量的名字
        4.target属性    所要操作的目标对象
        5.property属性  所要操作的目标对象中的哪个属性

        注意：
        1.var 修改对象属性的时候不能修改它所在的容器。var 属性和scope属性必须一起使用。
        2.target属性和property属性是要一起使用的，如果修改的数据不是对象的属性，那么就会报错
    --%>
    <%--  用法一：直接给变量设置值 --%>
    <c:set value="今天星期三" scope="session" var="day"></c:set>
    ${sessionScope.day}

    <%-- 用法二：替换值 --%>
    <%
        User user = new User();
        user.setName("夏洛特");
        pageContext.setAttribute("user",user);
    %>
    <c:set target="${user}" property="name" value="孙二林"></c:set>
    ${user.name}

    <br><hr>

    <%-- c:set 标签 --%>
    <%
        pageContext.setAttribute("str",null);
    %>
    ${str}

    <%--  default设置没有数据的时候，默认输出 --%>
    <c:out value="${str}" default="小黄鸭"></c:out>
    ${str}

    <%-- escapeXml="true" 让浏览器不解析其中的html --%>
    <c:out value="<a href='http://www.baidu.com'>百度一下</a>" escapeXml="false"></c:out>
</body>
</html>
