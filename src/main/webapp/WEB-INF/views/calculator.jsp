<%--
  Created by IntelliJ IDEA.
  User: kimanh
  Date: 26/12/2023
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Simple Calculator</h1>
<form action="/calculate" method="post">
    <label for="num1">Number 1:</label>
    <input type="number" id="num1" name="num1" required><br><br>

    <label for="num2">Number 2:</label>
    <input type="number" id="num2" name="num2" required><br><br>

    <label for="operator">Operator:</label>
    <select id="operator" name="operator">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select><br><br>

    <button type="submit">Calculate</button>
</form>
</body>
</html>
