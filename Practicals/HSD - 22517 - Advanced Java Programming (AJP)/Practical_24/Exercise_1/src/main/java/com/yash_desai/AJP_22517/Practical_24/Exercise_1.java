package com.yash_desai.AJP_22517.Practical_24;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Exercise_1 extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.addCookie(new Cookie("__name__",request.getParameter("USER_NAME")));
        response.addCookie(new Cookie("__age__",request.getParameter("USER_AGE")));
        response.addCookie(new Cookie("__phone__",request.getParameter("USER_PHONE")));
        response.addCookie(new Cookie("__mail__",request.getParameter("USER_MAIL")));
        Cookie[] COOKIE_DATA = request.getCookies();
        response.getWriter().println("<!DOCTYPE html><html><head><title>Servlet Exercise_1</title>"
                + "</head><body> From Cookies"
                + "<br>Name : " + (GET_DATA(COOKIE_DATA,"__name__")) 
                + "<br>Age : " + (GET_DATA(COOKIE_DATA,"__age__"))
                + "<br>Phone Number : " + (GET_DATA(COOKIE_DATA,"__phone__"))
                + "<br>E-Mail Address : " + (GET_DATA(COOKIE_DATA,"__mail__"))
                + "</body></html>");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request,response);
    }
    public static String GET_DATA(Cookie[] DATA, String STR) {
        for(Cookie C : DATA)
            if(C.getName().equals(STR)) return C.getValue();
        return "no data found";
    }
}