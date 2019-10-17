/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletsConsejos;

import grecia.ejbs.EJBoperacionesconsejos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sinahi
 */
@WebServlet(name = "actualizarConsejo", urlPatterns = {"/actualizarConsejo"})
public class actualizarConsejo extends HttpServlet {
      @EJB
    private EJBoperacionesconsejos ejb;

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet actualizarConsejo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet actualizarConsejo at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
       
        //processRequest(request, response);
        
          response.setContentType("application/json;charset-UTF-8");
        response.setHeader("Cache-Control", "no-store");
        PrintWriter p = response.getWriter();
        
        int idconsejo= Integer.parseInt(request.getParameter("idconsejo"));
        String tituloconsejo = request.getParameter("tituloconsejo");
        String descripcionconsejo = request.getParameter("descripcionconsejo");
        String usuarioconsejo = request.getParameter("usuarioconsejo");
        
        p.write(ejb.ActualizaConsejo(idconsejo,tituloconsejo, descripcionconsejo,usuarioconsejo));
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