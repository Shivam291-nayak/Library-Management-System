package com.library.servlet;

import com.library.dao.IssueBookDAO;
import com.library.entity.IssueBook;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Date;

@WebServlet("/issueBook")
public class IssueBookServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int userId = Integer.parseInt(request.getParameter("userId"));
        int bookId = Integer.parseInt(request.getParameter("bookId"));

        IssueBook issue = new IssueBook();

        issue.setUserId(userId);
        issue.setBookId(bookId);
        issue.setIssueDate(new Date());

        IssueBookDAO dao = new IssueBookDAO();
        dao.issueBook(issue);

        response.sendRedirect("librarian.jsp");
    }
}