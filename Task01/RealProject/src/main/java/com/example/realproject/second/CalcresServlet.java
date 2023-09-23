package com.example.realproject.second;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class CalcresServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException {
            response.setContentType("text/html");
            PrintWriter pw = response.getWriter();
            int a = Integer.parseInt(request.getParameter("a"));
            int b = Integer.parseInt(request.getParameter("b"));
            String oper = request.getParameter("oper");
            int res = 0;
            if (oper.equals("+")) {
                res = a + b;
            }else if(oper.equals("-")){
                res = a - b;
            }else if(oper.equals("*")){
                res = a * b;
            }else if(oper.equals("/")){
                res = a / b;
            }
            pw.println("<html><body>");
            pw.println("<h1>" +  res + "</h1>");
            pw.println("<form action ='/calculator'>");
            pw.println("<input type='submit' value='back'>");
            pw.println("</form>");
            pw.println("</body></html>");
    }
}
