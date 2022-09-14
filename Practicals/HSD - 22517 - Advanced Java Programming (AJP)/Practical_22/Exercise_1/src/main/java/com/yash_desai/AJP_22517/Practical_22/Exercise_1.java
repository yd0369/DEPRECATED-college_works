package com.yash_desai.AJP_22517.Practical_22;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Exercise_1 extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html><html><head><title>Servlet Exercise_1</title>"
                    + "</head><body>"+
                    "You have Selected Radio "+request.getParameter("Radio_Button").toString()
                    +" and "+request.getParameter("List").toString()+" from the List"
                    +"</body></html>");
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
}
