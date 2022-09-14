package com.yash_desai.AJP_22517.Practical_21;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Exercise_2 extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int A = Integer.parseInt(request.getParameter("A"));
        int B = Integer.parseInt(request.getParameter("B"));
        PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html><html><head><title>Servlet Exercise_2</title>"
                    +"</head>"+"<body>"+
                    "The Sum of A["+A+"]"+"and B["+B+"] is "+(A+B));
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
