/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author josel
 */
public class ShowInfo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");

            // Crear una cadena con los parámetros
            String content = "First Name: " + fname + "\nLast Name: " + lname;
            
            // Guardar los parámetros en un archivo llamado "info.txt"
            SaveInfo.writeToFile("info.txt", content);

            // Imprimir la ubicación del archivo
            String directorioActual = System.getProperty("user.dir");
            String rutaCompleta = directorioActual + File.separator + "info.txt";
            out.println("Archivo guardado en: " + rutaCompleta);
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ShowInfo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ShowInfo at " + request.getContextPath() + "</h1>");
            out.println("<h1>FName " + request.getParameter("fname") + "</h1>");
            out.println("<h1>LName " + request.getParameter("lname") + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
        }
    }
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
