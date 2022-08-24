<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: fabian
  Date: 18/08/2022
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Add Pll to Solve</h1>
<a href="/solve/main">Strona główna</a>
<a href="/solve/all">All Solves</a>
<a href="/pll/main">Algorithm's PLL</a>


<div id="pllAlgorithms">
        <form:form modelAttribute="solve" method="post">
            <form:input path="scrambleAlg"/>
            <form:input path="timeValue"/>
            <input type="submit" value="Add PLL to solve">
        </form:form>
</div>

</body>
</html>
