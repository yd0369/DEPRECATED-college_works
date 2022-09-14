package com.yash_desai.AJP_22517.Practical_23;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Exercise_2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession SESSION = request.getSession();
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html><html><head><title>Servlet Exercise_2</title>"
                + "</head><body>" +
        ((SESSION.getMaxInactiveInterval() < (System.currentTimeMillis()-SESSION.getCreationTime()))?
                "Session Expired":"Time Left for Session to Expire is ")+
                (SESSION.getMaxInactiveInterval()-((System.currentTimeMillis()-SESSION.getCreationTime()))) + " out of "+
                SESSION.getMaxInactiveInterval());
            out.println("</body></html>");
    }
}