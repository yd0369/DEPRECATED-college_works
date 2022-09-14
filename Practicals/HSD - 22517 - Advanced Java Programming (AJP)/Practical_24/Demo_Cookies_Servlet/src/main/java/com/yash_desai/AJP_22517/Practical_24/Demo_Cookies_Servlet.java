package com.yash_desai.AJP_22517.Practical_24;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Demo_Cookies_Servlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        response.addCookie(new Cookie("TEST_COOKIE","Yash Desai"));
        out.println("<!DOCTYPE html><html><head><title>Servlet Demo_Cookies_Servlet</title>"
                    + "</head><body>"
                    + "Cookie Data Retrived : "
                    + "<br>Name : "+ request.getCookies()[0].getName()
                    + "<br>Value : "+ request.getCookies()[0].getValue()
                    + "<br>Path : "+ request.getCookies()[0].getPath()
                    + "<br>Domain : "+ request.getCookies()[0].getDomain()
                    + "<br>Comment : "+ request.getCookies()[0].getComment()
                    + "</body></html>");
    }
}
