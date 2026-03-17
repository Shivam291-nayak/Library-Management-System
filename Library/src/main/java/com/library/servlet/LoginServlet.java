package com.library.servlet;

import com.library.dao.UserDAO;

import com.library.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        UserDAO dao = new UserDAO();
        User user = dao.login(username, password);

        if(user != null){

            HttpSession session = request.getSession();
            session.setAttribute("user", user);

            String role = user.getRole();

            if(role.equals("ADMIN")){
                response.sendRedirect("admin.jsp");
            }
            else if(role.equals("LIBRARIAN")){
                response.sendRedirect("librarian.jsp");
            }
            else if(role.equals("STUDENT")){
                response.sendRedirect("student.jsp");
            }

        }else{

            response.sendRedirect("error.jsp");

        }

    }

}