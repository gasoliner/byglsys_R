<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wanhongji
  Date: 2016/11/4
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>queryStd</title>
</head>
<body>

<form action="/queryStd" method="post" >
    ID:<input type="text" name="sid"/>
    <input type="submit" value="查询"/>
</form>

学生列表：
<table width="100%" border="1">
    <tr>
        <td>ID</td>
        <td>Academyid</td>
        <td>Deptid</td>
        <td>Employeenum</td>
        <td>Stdname</td>
        <td>Sex</td>
        <td>Major</td>
        <td>Rankid</td>
        <td>Kind</td>
        <td>Phone</td>
        <td>Email</td>
        <td>Research</td>
        <td>Comments</td>
    </tr>

        <tr>
            <td>${students.uid}</td>
            <td>${students.academyid}</td>
            <td>${students.deptid}</td>
            <td>${students.employeenum}</td>
            <td>${students.stdname}</td>
            <td>${students.sex}</td>
            <td>${students.major}</td>
            <td>${students.rankid}</td>
            <td>${students.kind}</td>
            <td>${students.phone}</td>
            <td>${students.email}</td>
            <td>${students.research}</td>
            <td>${students.comments}</td>
        </tr>

    <%--<c:forEach items="${studentsList}" var="std">--%>
        <%--<tr>--%>
            <%--<td>${std.uid}</td>--%>
            <%--<td>${std.academyid}</td>--%>
            <%--<td>${std.deptid}</td>--%>
            <%--<td>${std.employeenum}</td>--%>
            <%--<td>${std.stdname}</td>--%>
            <%--<td>${std.sex}</td>--%>
            <%--<td>${std.major}</td>--%>
            <%--<td>${std.rankid}</td>--%>
            <%--<td>${std.kind}</td>--%>
            <%--<td>${std.phone}</td>--%>
            <%--<td>${std.email}</td>--%>
            <%--<td>${std.research}</td>--%>
            <%--<td>${std.comments}</td>--%>
        <%--</tr>--%>
    <%--</c:forEach>--%>
</table>
</body>
</html>
