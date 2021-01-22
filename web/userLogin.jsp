<%@ page import="java.net.URLDecoder" %><%--
  Created by IntelliJ IDEA.
  User: 孙二林
  Date: 2021/1/15
  Time: 18:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
    <%
        //从请求中获得所有的Cookie,从而避免免登录的信息
        String username = null;
        String password = null;

        Cookie[] cookies = request.getCookies();
        if(cookies!=null){
            for (Cookie cookie : cookies) {
                if(cookie!=null){
                    if(cookie.getName().equals("usernameCookie")){
                        //解码
                        username = URLDecoder.decode(cookie.getValue(),"utf-8");
                    }
                    if(cookie.getName().equals("passwordCookie")){
                        password = cookie.getValue();
                    }
                }
            }
        }

        if(username!=null && password!=null){
            request.getRequestDispatcher("user?username="+username+"&password="+password).forward(request,response);
        }
    %>
    <%
        String msg = (String)request.getAttribute("msg");
        if(msg!=null){
    %>
        <h3 style="color: orangered"><%=msg%></h3>
    <%
        }
    %>
    <form id="loginForm" action="user" method="get">
        <table align="center">
            <tr>
                <th colspan="2" style="color: teal">用户登陆界面</th>
            </tr>
            <tr>
                <td>用户名</td>
                <td><input type="text" name="username" placeholder="请输入用户名" /></td>
            </tr>
            <tr>
                <td>密  码</td>
                <td><input type="password" name="password" placeholder="请输入密码"/></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="登录"/>
                    <select name="timeLength">
                        <option value="0">一直登录</option>
                        <option value="7">7天内免登录</option>
                        <option value="15">15天内免登录</option>
                    </select>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
