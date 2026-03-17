package com.library.servlet;

import com.library.dao.UserDAO;
import com.library.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        User user = new User();

        user.setUsername(username);
        user.setPassword(password);
        user.setRole(role);

        UserDAO dao = new UserDAO();
        dao.saveUser(user);

        response.sendRedirect("login.jsp");

    }
}