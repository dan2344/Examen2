/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
public class Servlet extends HttpServlet {

    int area;
    double res;
    String Operacion = "";
    int lado1;
    int lado2;
    double pi = 3.14;
    String opc = "";
    int opci;
    public void doGet(HttpServletRequest rqesp, HttpServletResponse rep)
            throws ServletException, IOException {
        lado1 = Integer.parseInt(rqesp.getParameter("txt1"));
        lado2 = Integer.parseInt(rqesp.getParameter("txt2"));
        opci =Integer.parseInt(rqesp.getParameter("op"));
        if (opci == 1) {
            res = lado1 * lado2;
            Operacion = "Area" + res;
        } else if (opci == 2) {
            res = (lado1 * 2) + (lado2 * 2);
            Operacion = "Perimetro" + res;
        }
        else if (opci == 3) {
            res = (lado1 * lado1) * pi;
            Operacion = "Area" + res;
        } else if (opci == 4) {
            res = lado1 * 2 * pi;
            Operacion = "Perimetro" + res;
        }

        rep.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = rep.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>El Resultado del " + Operacion + " es:" + res + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
