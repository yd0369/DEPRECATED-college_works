package com.yash_desai.AJP_22517.Practical_24;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Exercise_2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<!DOCTYPE html><html><head><title>Servlet Exercise_2</title>"
                + "</head><body>"
                + request.getHeader("User-Agent")
                + "</body></html>");
    }
}