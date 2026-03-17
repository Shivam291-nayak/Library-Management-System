<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<html>
<head>
<title>Issue Book</title>
<link rel="stylesheet" href="css/style.css">
</head>

<body>
<div class="form-container">
<a href="index.jsp" class="logout-btn">Logout</a>
<h2>Issue Book</h2>

<form action="issueBook" method="post">

User ID
<input type="number" name="userId"><br><br>

Book ID
<input type="number" name="bookId"><br><br>

<input type="submit" value="Issue Book">

</form>

</body>
</html>