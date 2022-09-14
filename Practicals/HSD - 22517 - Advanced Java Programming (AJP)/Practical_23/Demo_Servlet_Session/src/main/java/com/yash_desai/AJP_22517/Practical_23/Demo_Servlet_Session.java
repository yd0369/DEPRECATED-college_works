package com.yash_desai.AJP_22517.Practical_23;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Demo_Servlet_Session extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      HttpSession SESSION = request.getSession(true);
      response.setContentType("text/html");
      response.getWriter().println("<!doctype html><html><head><title>Yash Desai</title></head>"
              + "<body>" +
               "Session ID : "+(SESSION.getId())+
               "<br/>Session Time : "+(SESSION.getCreationTime())+
            "</body></html>");
    }
}
