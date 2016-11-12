<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 万洪基
  Date: 2016/11/04
  Time: 21:34
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<hr/>
<h1 align="center">测试</h1>
<hr/>

<c:if test="${username !=null}">
    欢迎你，${username}
    <br>
    <a href="/logout">退出</a>
</c:if>
<c:if test="${username ==null}">
    <a href="/UI/login">登录</a>
</c:if>
<a href="/UI/queryStd">查询</a>
</body>
</html>
