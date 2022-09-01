<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: fabian
  Date: 15/08/2022
  Time: 11:19
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


<h2>Add new PLL algorithm</h2>
<%--@elvariable id="pllAlg" type="java"--%>
<form:form method="post" modelAttribute="pllAlg">
    <p>Name: </p>
    <form:input path="pllName"></form:input><br>
    <p>Algorithm: </p>
    <form:input path="pllAlgorithm"></form:input><br>
    <p>Group: </p>
    <form:select path="pllGroup">
        <form:option value="0" label="---wybierz---"/>
        <form:option value="Default"/>
        <form:option value="Edges Only"/>
        <form:option value="Diagonal Corner Swap"/>
        <form:option value="Adjacent Corner Swap"/>
    </form:select>
    <input type="submit" value="Add PLL">
</form:form>

</body>
</html>
