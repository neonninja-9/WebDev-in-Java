package com.example;
import jakarta.servlet.*;import jakarta.servlet.annotation.WebServlet;import jakarta.servlet.http.*;import java.io.*;
@WebServlet("/lifecycle") public class LifeCycleServlet extends HttpServlet {private int hits;
 public void init(){hits=0;System.out.println("init() called");}
 protected void doGet(HttpServletRequest q,HttpServletResponse r)throws IOException {r.setContentType("text/html;charset=UTF-8");r.getWriter().printf("<h2>Servlet Life Cycle</h2><p>service() dispatches to doGet()</p><p>Requests: %d</p>",++hits);}
 public void destroy(){System.out.println("destroy() called");}}
