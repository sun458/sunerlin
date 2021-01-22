<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.TreeMap" %>
<%@ page import="ch2.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: 孙二林
  Date: 2021/1/20
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>解析复杂数据</title>
    <style>
        body{
            color:darkcyan;
        }
    </style>
</head>
<body>
<%-- 1.测试数组 --%>
<%
    int[] arr = {1,2,3,4,5};
    pageContext.setAttribute("arr",arr);
%>
<%-- EL表达式操作时，可以直接使用  数组名[下标] --%>
<h3>通过下标直接操作：${arr[3]}</h3>

%-- 2.测试集合 --%>
<%
    List<String> list = new ArrayList<>();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    pageContext.setAttribute("list",list);
%>
<h3>通过下标直接操作：${list[3]}</h3>

<%
    Map<String,Integer> map = new TreeMap<>();
    map.put("abd",10);
    map.put("abc",20);
    map.put("abb",30);
    pageContext.setAttribute("map",map);
%>
<h3>通过key获得value:${map.abc}</h3>
<h3>通过key获得value:${map["abc"]}</h3>

<%-- 自定义的对象 --%>
<%
    User user = new User();
    user.setName("小红花");
    user.setPwd("123");
    pageContext.setAttribute("user",user);
%>
<h3>${user}</h3>
<h3>${user.name}</h3>
<h3>${user["pwd"]}</h3>

</body>
</html>
