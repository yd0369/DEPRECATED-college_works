package com.yash_desai.AJP_22517.Practical_23;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Exercise_1 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession SESSION = request.getSession();
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Servlet Exercise_1</title></head><body>"
                    + "<br>Session Creation Time : " +SESSION.getCreationTime()
                    + "<br>Session ID : " +SESSION.getId()
                    + "<br>Session Last Accessed Time : " +SESSION.getLastAccessedTime()
                    + "<br>Session Max Inactive Interval : " +SESSION.getMaxInactiveInterval()
                    + "</body></html>");
        }
    }
}