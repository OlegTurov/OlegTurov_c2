package com.example.realproject.second;

import java.io.*;
import javax.servlet.http.*;

public class CalculatorServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<html><body>");
        pw.println("<form action ='/calcres'>");
        pw.println("<input type='text' name='a' size='30'>");
        pw.println("<input type='text' name='b' size='30'>");
        pw.println("<select name='oper' size='3' multiple>");
        pw.println("<option selected value='plus'>+</option>");
        pw.println("<option value='minus'>-</option>");
        pw.println("<option value='mul'>*</option>");
        pw.println("<option value='div'>/</option>");
        pw.println("<input type='submit' value='count'>");
        pw.println("</form>");
        pw.println("</body></html>");
    }
    public void destroy() {
    }
}

