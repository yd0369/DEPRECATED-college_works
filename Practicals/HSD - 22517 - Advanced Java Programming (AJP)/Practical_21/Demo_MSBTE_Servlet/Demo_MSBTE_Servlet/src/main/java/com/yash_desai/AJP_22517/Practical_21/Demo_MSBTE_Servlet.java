package com.yash_desai.AJP_22517.Practical_21;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Demo_MSBTE_Servlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        out.println("<!DOCTYPE html>"+"<html>"+"<head>"+
                "<title>Hello MSBTE!</title>"+"</head>"+"<body>"+
                "<h1> Welcome at Maharastra State Board of Technical Education!</h1>"+
                "</body>"+"</html>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
