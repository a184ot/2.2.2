<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: Eug
  Date: 25.05.2020
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CarList</title>
</head>
<body>
<div align="center">
    <table border="3" width="80%">
        <caption><h1>${car}</h1></caption>
        <tr>
            <th>Brand</th>
            <th>Model</th>
            <th>Year</th>
        </tr>
        <c:forEach var="car" items="${carList}">
            <tr>
                <td><c:out value="${car.brand}"/></td>
                <td><c:out value="${car.model}"/></td>
                <td><c:out value="${car.year}"/></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
