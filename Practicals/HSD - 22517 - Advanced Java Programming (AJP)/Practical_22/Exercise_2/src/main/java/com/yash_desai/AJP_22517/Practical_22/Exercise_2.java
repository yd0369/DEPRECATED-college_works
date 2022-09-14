package com.yash_desai.AJP_22517.Practical_22;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Exercise_2 extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html><html><head><title>Servlet Exercise_2</title>");
            out.println("</head><body><table><tr><td><b>Subject</b></td><td><b>Condition</b></td>");
            out.println("</tr><tr><td>Advanced Java Programming [22517]</td>");
            out.println("<td>"+(Validator(request.getParameter("AJP")))+"</td>");
            out.println("</tr><tr><td>Advanced Computer Network [22520]</td>");
            out.println("<td>"+(Validator(request.getParameter("ACN")))+"</td>");
            out.println("</tr><tr><td>Operating System [22516]</td>");
            out.println("<td>"+(Validator(request.getParameter("OSY")))+"</td>");
            out.println("</tr><tr><td>Software Testing [22518]</td>");
            out.println("<td>"+(Validator(request.getParameter("STE")))+"</td>");
            out.println("</tr><tr><td>Environmental Studies [22447]</td>");
            out.println("<td>"+(Validator(request.getParameter("EST")))+"</td>");
            out.println("</table></body></html>");
        }
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
    public static String Validator(String Marks) {
        if(Integer.parseInt(Marks) < 28) return "Fail";
        else return "Pass";
    }
}