<%--
  Created by IntelliJ IDEA.
  User: 孙二林
  Date: 2021/1/14
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>登录</title>
</head>
<body>
<%--    <h3 style="color: orangered;">你好，jsp</h3>--%>
    <form action="user" method="get">
        <table align="center">
            <tr>
                <th colspan="2" style="color: darkorange">登陆界面</th>
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
                <td colspan="2" align="center"><input type="submit" value="登录"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
