<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: fabian
  Date: 15/08/2022
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/solve/main">Strona główna</a>
<a href="/solve/all">All Solves</a>
<a href="/pll/main">Algorithm's PLL</a>

<a href="/pll/add">Add PLL algorithm</a>

<table>
    <thead>
        <tr>
            <td>Id</td>
            <td>Name</td>
            <td>Algorithm</td>
            <td>Group</td>
            <td>Delete</td>
            <td>Update</td>
        </tr>
    </thead>
    <tbody>
    <jsp:useBean id="pllAll" scope="request" type="java.util.List"/>
    <c:forEach items="${pllAll}" var="pll">
        <tr>
            <td>${pll.pllId}</td>
            <td>${pll.pllName}</td>
            <td>${pll.pllAlgorithm}</td>
            <td>${pll.pllGroup}</td>
            <td><a href="/pll/delete/${pll.pllId}">Delete</a></td>
            <td><a href="/pll/update/${pll.pllId}">Update</a></td>
        </tr>
    </tbody>
    </c:forEach>

</table>
</body>
</html>
