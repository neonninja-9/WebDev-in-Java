package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/** Handles the login form; its /auth mapping is declared in WEB-INF/web.xml. */
public class AuthServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "1234".equals(password)) {
            User user = new User();
            user.setUsername(username);
            request.getSession().setAttribute("user", user);
            request.getRequestDispatcher("/welcome.jsp").forward(request, response);
            return;
        }

        request.setAttribute("error", "Invalid username or password");
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }
}
