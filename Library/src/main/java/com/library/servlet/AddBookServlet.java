package com.library.servlet;

import com.library.dao.BookDAO;
import com.library.entity.Book;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/addBook")
public class AddBookServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String title = request.getParameter("title");
        String author = request.getParameter("author");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        Book book = new Book();

        book.setTitle(title);
        book.setAuthor(author);
        book.setQuantity(quantity);

        BookDAO dao = new BookDAO();
        dao.addBook(book);

        response.sendRedirect("admin.jsp");

    }

}