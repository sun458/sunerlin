<%--
  Created by IntelliJ IDEA.
  User: 孙二林
  Date: 2021/1/20
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<%--  登录访问控制 --%>
<%--<%
    User user = (User)session.getAttribute("user");
    if(user==null) {
        request.setAttribute("msg","当前资源必须登录后访问");
        request.getRequestDispatcher(application.getContextPath()+"/userLogin.jsp").forward(request,response);
    }
%>--%>
<%
    for(int i = 0;i<10;i++){
 %>

<h1 style="color:orange"><%=i%></h1>

<%
    }
%>
</>
</body>
</html>
