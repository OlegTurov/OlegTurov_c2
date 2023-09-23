package com.example.realproject.first;

import java.io.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<html><body>");
        pw.println("<form action='/result'>");
        pw.println("<input type='text' name='name' size='30'/>");
        pw.println("<input type='submit' value='Say Hi'/>");
        pw.println("</form>");
        pw.println("</body></html>");
    }
    public void destroy() {
    }
}
