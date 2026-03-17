<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<html>
<head>
<title>Add Book</title>
<link rel="stylesheet" href="css/style.css">
</head>

<body>
<div class="form-container">
<a href="index.jsp" class="logout-btn">Logout</a>
<h2>Add Book</h2>

<form action="addBook" method="post">

Title
<input type="text" name="title"><br><br>

Author
<input type="text" name="author"><br><br>

Quantity
<input type="number" name="quantity"><br><br>

<input type="submit" value="Add Book">

</form>

</body>
</html>