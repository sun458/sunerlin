<%--
  Created by IntelliJ IDEA.
  User: 孙二林
  Date: 2021/1/20
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>测试静态包含 - include指令</head>
<body>
<%--
        静态包含：
        1.include指令
        2.file属性，包含页面
        3.发生在翻译阶段，将当前包含的页面信息翻译至本页面中
        4.header.jsp?x=10&y=5  此时不允许被发生，file只能直接指定包含的页面名称
    --%>
<%@ include file="header.jsp?x=10&y=5"%>
<h2>111</h2>
<h2>222</h2>
<h2>333</h2>

</body>
</html>
