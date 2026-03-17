<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<html>
<head>
<title>Signup</title>
<link rel="stylesheet" href="css/style.css">
</head>

<body>
<div class="signup-container">
<h2>User Registration</h2>

<form action="signup" method="post">

Username:
<input type="text" name="username" required><br><br>

Password:
<input type="password" name="password" required><br><br>

Role:
<select name="role">
<option value="ADMIN">Admin</option>
<option value="LIBRARIAN">Librarian</option>
<option value="STUDENT">Student</option>
</select>

<br><br>

<input type="submit" value="Signup">

</form>

<br>

<a href="login.jsp">Login</a>

</body>
</html>