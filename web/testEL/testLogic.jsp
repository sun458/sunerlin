<%@ page import="ch2.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: 孙二林
  Date: 2021/1/20
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试运算符</title>
    <style>
        body{
            color: darkgreen;
        }
    </style>
</head>
<body>
<%
    int x = 10;
    int y = 5;
    boolean flag1 = true;
    boolean flag2 = false;
    pageContext.setAttribute("x",x);
    pageContext.setAttribute("y",y);
    pageContext.setAttribute("flag1",flag1);
    pageContext.setAttribute("flag2",flag2);
%>

<h3>x+y=${x+y}</h3>
<h3>flag1&&flag2=${flag1&&flag2}</h3>
<h3>x>y=${x gt y}</h3>
<%
    User user = new User();
    user.setName("哆啦A梦");
    pageContext.setAttribute("user",user);
%>
${empty user}  <%--  当前为空则是true，不为空则是false   --%>

${user!=null ? user.name:""}
${user ne null ? user.name:""}

</body>
</html>
