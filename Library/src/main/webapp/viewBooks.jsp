<%@ page import="java.util.*,com.library.entity.Book,com.library.dao.BookDAO" %>

<html>
<head>
<title>View Books</title>
<link rel="stylesheet" href="css/style.css">
</head>

<body>
<div class="table-container">
<a href="index.jsp" class="logout-btn">Logout</a>
<h2>Book List</h2>

<table border="1">

<tr>
<th>ID</th>
<th>Title</th>
<th>Author</th>
<th>Quantity</th>
</tr>

<%
BookDAO dao = new BookDAO();
List<Book> books = dao.getAllBooks();

for(Book b : books){
%>

<tr>
<td><%=b.getId()%></td>
<td><%=b.getTitle()%></td>
<td><%=b.getAuthor()%></td>
<td><%=b.getQuantity()%></td>
</tr>

<%
}
%>

</table>

</body>
</html>