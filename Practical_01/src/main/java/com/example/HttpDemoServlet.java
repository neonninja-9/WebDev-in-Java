package com.example;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/http")
public class HttpDemoServlet extends HttpServlet {

    // Handles HTTP GET requests (data arrives in the URL)
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("name");
        if (name == null) name = "Guest";

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>Hello, " + name + "</h2>");
        out.println("<p>Request method : " + req.getMethod() + "</p>");
        out.println("<p>Request URI    : " + req.getRequestURI() + "</p>");
        out.println("<p>Query string   : " + req.getQueryString() + "</p>");
    }

    // Handles HTTP POST requests (data arrives in the request body)
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("name");
        String message = req.getParameter("message");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>POST request received</h2>");
        out.println("<p>Name    : " + name + "</p>");
        out.println("<p>Message : " + message + "</p>");
        out.println("<p>Request method : " + req.getMethod() + "</p>");
    }
}
