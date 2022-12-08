
package com.emergentes.te_primeprog;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Holamundo", urlPatterns = {"/Holamundo"})
public class Holamundo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     //salida HTML
     //JSON
     //excel
     //pdf
     //especificar el tipo de salida
     response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //escribir la salida de acuerdo al tipo ;responde es el objeto,get write es el metodo
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Holamundo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Holamundo desde un servlet</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
