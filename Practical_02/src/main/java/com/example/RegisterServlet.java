package com.example;
import jakarta.servlet.annotation.WebServlet;import jakarta.servlet.http.*;import java.io.*;
@WebServlet("/register") public class RegisterServlet extends HttpServlet {protected void doPost(HttpServletRequest q,HttpServletResponse r)throws IOException {r.setContentType("text/html;charset=UTF-8");var o=r.getWriter();o.printf("<h2>Registration successful</h2><p>Name: %s</p><p>Email: %s</p><p>Course: %s</p>",q.getParameter("name"),q.getParameter("email"),q.getParameter("course"));}}
