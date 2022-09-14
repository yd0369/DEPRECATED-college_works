package com.yash_desai.AJP_22517.Practical_22;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Demo_Servlet_Transaction extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Demo_Servlet_Transaction</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>The User Name Length is  " + request.getParameter("User_Name").length() + "</h1>");
            out.println("</body>");
            out.println("</html>");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    public String getServletInfo() {
        return "Short description";
    }
}
