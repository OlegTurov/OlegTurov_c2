package com.example.realproject.first;

import java.io.*;
import javax.servlet.http.*;

public class ResultServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        String name = request.getParameter("name");
        pw.println("<html><body>");
        pw.println("<h1> Hi, " + name + "</h1>");
        pw.println("<form action='/'>");
        pw.println("<input type='submit' value='back'/>");
        pw.println("</form>");
        pw.println("</body></html>");
    }

    public void destroy() {
    }
}
