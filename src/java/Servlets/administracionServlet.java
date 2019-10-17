/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sinahi
 */
@WebServlet(name = "administracionServlet", urlPatterns = {"/administracionServlet"})
public class administracionServlet extends HttpServlet {

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
            out.println("<title>Servlet administracionServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet administracionServlet at " + request.getContextPath() + "</h1>");
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
     //    processRequest(request, response);
    
   
              
              //SIMUMLANDO VALORES
              String ejercicio3="Enviar";
              String ejercicio4="Ingresar";
              String ejercicio5="Ir";
               String ejercicio8="Cookies";
              
          
              
              String pUsuario=request.getParameter("usuario");
              String pPassword=request.getParameter("password");
              
              String envio3=request.getParameter("envio3"); //Capturo el valor del input envio3
              
              String envio4=request.getParameter("envio4");
              
              String envio5=request.getParameter("envio5");
              
               String envio8=request.getParameter("envio8");
               
          
               
              
              //EJERCICIO 3
              //Si ejercicio3 recive el valor de envio3(enviar))
              if(ejercicio3.equals(envio3))
              {
             PrintWriter out=response.getWriter(); 
             
             
                           
                  out.println("<html>\n" +
"    <head>\n" +
" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n" +
"           <link href=\"https://fonts.googleapis.com/css?family=Alegreya|Chilanka|Dancing+Script|Kalam|Pacifico|Satisfy&display=swap\" rel=\"stylesheet\">\n" +
"           <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" +
"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script> \n" +
"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n" +
"<style>/* Make the image fully responsive */\n" +
".carousel-inner img {\n" +
"width: 100%;\n" +
"height: 100%;              \n" +
"}\n" +
"</style>\n" +
"\n" +
"<title>Ejercicio 3</title>\n" +
"\n" +
"<!-- Custom fonts for this theme -->\n" +
"<link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
"<link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\">\n" +
"<link href=\"https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\n" +
"\n" +
"<!-- Theme CSS -->\n" +
"<link href=\"css/freelancer.css\" rel=\"stylesheet\">\n" +
"<link href=\"css/estilo-indexp.css\" rel=\"stylesheet\">\n" +
"\n" +
"<!--Tabla de bootstrap-->\n" +
"\n" +
"<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" +
"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n" +
"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n" +
"\n" +
"<link href=\"https://fonts.googleapis.com/css?family=Nunito+Sans&display=swap\" rel=\"stylesheet\">\n" +
"<link href=\"https://fonts.googleapis.com/css?family=Chilanka|Nanum+Gothic:400,700|Source+Sans+Pro&display=swap\" rel=\"stylesheet\">\n" +
"\n" +
"<!--Estilos del formulario 3-->\n" +
"<link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilos.css\">\n" +
"\n" +
"<!--Estilos ejercicio 4-->\n" +
" <script type=\"text/javascript\" src=\"css/funcioness.js\"></script>\n" +
"     <!--Bootstrap formulario-->\n" +
"\n" +
"\n" +
"\n" +
"</head>\n" +
"           \n" +
"\n" +
"<body id=\"page-top\">\n" +
"              <!-- NavBar -->\n" +
"<nav class=\"navbar navbar-expand-lg bg-secondary text-uppercase fixed-top\" id=\"mainNav\">\n" +
"<div class=\"container\">\n" +
"\n" +
" \n" +
"    <form method=\"post\" action=\"servletParametros1\" >\n" +
"    <a class=\"navbar-brand js-scroll-trigger\" >Bienvenido SINAHI</a>\n" +
        " <center>\n" +
"        <button name=\"inicio\" value=\"inicio\" class=\"boton_inicio\">inicio</button>\n" +
"        </center>"+
"    </form>\n" +
"\n" +
"\n" +
"<button class=\"navbar-toggler navbar-toggler-right text-uppercase font-weight-bold bg-primary text-white rounded\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
"\n" +
"    <i class=\"fas fa-bars\"></i>\n" +
"  </button>\n" +
"  <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n" +
"    <ul class=\"navbar-nav ml-auto\">\n" +
"      <li class=\"nav-item mx-0 mx-lg-1\">\n" +
"        <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"administracion.html\">Administracion</a>\n" +
"      </li>\n" +
"      <li class=\"nav-item mx-0 mx-lg-1\">\n" +
"       <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"#about\">Reglas de manejo</a>\n" +
"      </li>\n" +
"      <li class=\"nav-item mx-0 mx-lg-1\">\n" +
"        <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"#contact\">Pruebas de manejo</a>\n" +
"      </li>\n" +
"    </ul>\n" +
"  </div>\n" +
"</div>\n" +
"</nav>\n" +
"</div>\n" +
"</div> <br>\n" +
"<br>\n" +
"<br><br>\n" +
"<br>\n" +
"<br>\n");
            
              out.println("<center>EJERCICIO 3 - MANEJO DE PARAMETROS <br><br>");
             out.println("El parametro de usuario es: "+pUsuario+"<br>");
             out.println("El parametro de password es: "+pPassword+"</center>");
       
          
          
             out.close();
         
              }
              
                else
              {
                  
                  //EJERCICIO 4
             if(ejercicio4.equals(envio4))  
             {
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String usuario=request.getParameter("usuario");
            String password=request.getParameter("password");
            String[] tecnologias=request.getParameterValues("tecnologias");
            String tec= Arrays.toString(tecnologias);
            String genero=request.getParameter("genero");
            String ocupacion=request.getParameter("ocupacion");
            String musica=request.getParameter("musica");
            String comentarios=request.getParameter("comentarios");
            
          
              
                  out.println("<html>\n" +
"    <head>\n" +
" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n" +
"           <link href=\"https://fonts.googleapis.com/css?family=Alegreya|Chilanka|Dancing+Script|Kalam|Pacifico|Satisfy&display=swap\" rel=\"stylesheet\">\n" +
"           <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" +
"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script> \n" +
"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n" +
"<style>/* Make the image fully responsive */\n" +
".carousel-inner img {\n" +
"width: 100%;\n" +
"height: 100%;              \n" +
"}\n" +
"</style>\n" +
"\n" +
"<title>Ejercicio 4</title>\n" +
"\n" +
"<!-- Custom fonts for this theme -->\n" +
"<link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
"<link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\">\n" +
"<link href=\"https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\n" +
"\n" +
"<!-- Theme CSS -->\n" +
"<link href=\"css/freelancer.css\" rel=\"stylesheet\">\n" +
"<link href=\"css/estilo-indexp.css\" rel=\"stylesheet\">\n" +
"\n" +
"<!--Tabla de bootstrap-->\n" +
"\n" +
"<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" +
"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n" +
"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n" +
"\n" +
"<link href=\"https://fonts.googleapis.com/css?family=Nunito+Sans&display=swap\" rel=\"stylesheet\">\n" +
"<link href=\"https://fonts.googleapis.com/css?family=Chilanka|Nanum+Gothic:400,700|Source+Sans+Pro&display=swap\" rel=\"stylesheet\">\n" +
"\n" +
"<!--Estilos del formulario 3-->\n" +
"<link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilos.css\">\n" +
"\n" +
"<!--Estilos ejercicio 4-->\n" +
" <script type=\"text/javascript\" src=\"css/funcioness.js\"></script>\n" +
"     <!--Bootstrap formulario-->\n" +
"\n" +
"\n" +
"\n" +
"</head>\n" +
"           \n" +
"\n" +
"<body id=\"page-top\">\n" +
"              <!-- NavBar -->\n" +
"<nav class=\"navbar navbar-expand-lg bg-secondary text-uppercase fixed-top\" id=\"mainNav\">\n" +
"<div class=\"container\">\n" +
"\n" +
" \n" +
"    <form method=\"post\" action=\"servletParametros1\" >\n" +
"    <a class=\"navbar-brand js-scroll-trigger\" >Bienvenido SINAHI</a>\n" +
         " <center>\n" +
"        <button name=\"inicio\" value=\"inicio\" class=\"boton_inicio\">inicio</button>\n" +
"        </center>"+
"    </form>\n" +
"\n" +
"\n" +
"<button class=\"navbar-toggler navbar-toggler-right text-uppercase font-weight-bold bg-primary text-white rounded\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
"\n" +
"    <i class=\"fas fa-bars\"></i>\n" +
"  </button>\n" +
"  <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n" +
"    <ul class=\"navbar-nav ml-auto\">\n" +
"      <li class=\"nav-item mx-0 mx-lg-1\">\n" +
"        <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"administracion.html\">Administracion</a>\n" +
"      </li>\n" +
"      <li class=\"nav-item mx-0 mx-lg-1\">\n" +
"       <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"#about\">Reglas de manejo</a>\n" +
"      </li>\n" +
"      <li class=\"nav-item mx-0 mx-lg-1\">\n" +
"        <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"#contact\">Pruebas de manejo</a>\n" +
"      </li>\n" +
"    </ul>\n" +
"  </div>\n" +
"</div>\n" +
"</nav>\n" +
"</div>\n" +
"</div> <br>\n" +
"<br>\n" +
"<br><br>\n" +
"<br>\n" +
"<br>\n");

   //TABLA GENERADA CON LOS PARAMETROS              
                  
  out.println(" <style>"+               
 ".parrafo\n" +
"{\n" +
"    font-size: 25px;\n" +
"    font-family: 'Nunito Sans', sans-serif;\n" +
"    color: #9066BA;\n" +
"    \n" +
"}"+
                     
  ".tabla\n" +
"{\n" +
"    width: 500px;\n" +
"    height: 250px;\n" +
"}"+
"</style>");
             
             
            out.println(""+
                    
                    "<center>"
                    + "<p class=\"parrafo\"> EJERCICIO 4 - MANEJO DE FORMULARIO HTML </p>"+
                    "</center>");
            
             out.println("<div class=\"container\">");
            out.println("<table border=3px align=center class=\"tabla\"> <tr class=\"table-info\">");
            out.println( "<td class=azul>Usuario(*) </td>");
            out.println("<td>" +usuario +"</td></tr>");
            
            out.println("<tr class=\"table-warning\"> <td class=azul>Password(*) </td>");
            out.println("<td>" +password +"</td></tr>");
            
            out.println("<tr class=\"table-info\"><td class=azul>Tecnologia(*) </td>");
            out.println("<td>" +tec+"</td></tr>");
            
            out.println("<tr class=\"table-warning\"><td class=azul>Genero(*) </td>");
            out.println("<td>" +genero +"</td></tr>");
            
            out.println("<tr class=\"table-info\"><td class=azul>Ocupacion(*) </td>");
            out.println("<td>" +ocupacion +"</td></tr>");
            
            out.println("<tr class=\"table-warning\"><td class=azul>Musica </td>");
            out.println("<td>" +musica +"</td></tr>");
            
            out.println("<tr class=\"table-info\"><td class=azul>Los comentarios son</td>");
            out.println("<td>" +comentarios +"</td></tr>");
            
            out.println("</div>");
            
            out.println("</body>");
            out.println("</html>");                 
        }
             }
             else
             {
                 if(ejercicio5.equals(envio5))
                 {
                     response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
        try  {
          
          
            String metodoHTTP=request.getMethod();
            String ur=request.getRequestURI();
            
            
              out.println("<html>\n" +
"    <head>\n" +
" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n" +
"           <link href=\"https://fonts.googleapis.com/css?family=Alegreya|Chilanka|Dancing+Script|Kalam|Pacifico|Satisfy&display=swap\" rel=\"stylesheet\">\n" +
"           <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" +
"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script> \n" +
"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n" +
"<style>/* Make the image fully responsive */\n" +
".carousel-inner img {\n" +
"width: 100%;\n" +
"height: 100%;              \n" +
"}\n" +
"</style>\n" +
"\n" +
"<title>Jercicio 5</title>\n" +
"\n" +
"<!-- Custom fonts for this theme -->\n" +
"<link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
"<link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\">\n" +
"<link href=\"https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\n" +
"\n" +
"<!-- Theme CSS -->\n" +
"<link href=\"css/freelancer.css\" rel=\"stylesheet\">\n" +
"<link href=\"css/estilo-indexp.css\" rel=\"stylesheet\">\n" +
"\n" +
"<!--Tabla de bootstrap-->\n" +
"\n" +
"<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" +
"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n" +
"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n" +
"\n" +
"<link href=\"https://fonts.googleapis.com/css?family=Nunito+Sans&display=swap\" rel=\"stylesheet\">\n" +
"<link href=\"https://fonts.googleapis.com/css?family=Chilanka|Nanum+Gothic:400,700|Source+Sans+Pro&display=swap\" rel=\"stylesheet\">\n" +
"\n" +
"<!--Estilos del formulario 3-->\n" +
"<link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilos.css\">\n" +
"\n" +
"<!--Estilos ejercicio 4-->\n" +
" <script type=\"text/javascript\" src=\"css/funcioness.js\"></script>\n" +
"     <!--Bootstrap formulario-->\n" +
"\n" +
"\n" +
"\n" +
"</head>\n" +
"           \n" +
"\n" +
"<body id=\"page-top\">\n" +
"              <!-- NavBar -->\n" +
"<nav class=\"navbar navbar-expand-lg bg-secondary text-uppercase fixed-top\" id=\"mainNav\">\n" +
"<div class=\"container\">\n" +
"\n" +
" \n" +
"    <form method=\"post\" action=\"servletParametros1\" >\n" +
"    <a class=\"navbar-brand js-scroll-trigger\" >Bienvenido SINAHI</a>\n" +
         " <center>\n" +
"        <button name=\"inicio\" value=\"inicio\" class=\"boton_inicio\">inicio</button>\n" +
"        </center>"+                  
"    </form>\n" +
"\n" +
"\n" +
"<button class=\"navbar-toggler navbar-toggler-right text-uppercase font-weight-bold bg-primary text-white rounded\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
"\n" +
"    <i class=\"fas fa-bars\"></i>\n" +
"  </button>\n" +
"  <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n" +
"    <ul class=\"navbar-nav ml-auto\">\n" +
"      <li class=\"nav-item mx-0 mx-lg-1\">\n" +
"        <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"administracion.html\">Administracion</a>\n" +
"      </li>\n" +
"      <li class=\"nav-item mx-0 mx-lg-1\">\n" +
"       <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"#about\">Reglas de manejo</a>\n" +
"      </li>\n" +
"      <li class=\"nav-item mx-0 mx-lg-1\">\n" +
"        <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"#contact\">Pruebas de manejo</a>\n" +
"      </li>\n" +
"    </ul>\n" +
"  </div>\n" +
"</div>\n" +
"</nav>\n" +
"</div>\n" +
"</div> <br>\n" +
"<br>\n" +
"<br><br>\n" +
"<br>\n" +
"<br>\n");    
            
            //METODOSSS
            out.println("<h1>Metodos de HTTP </h1>");
            out.println("Metodo HTTP:"+metodoHTTP);
            out.print("<br>");
            out.print("Uri solicitado"+ur);
            out.print("<br>");
            out.print("<br>");
            out.println("</body>");
            out.println("</html>");  
            
            Enumeration cabeceros=request.getHeaderNames();
            while(cabeceros.hasMoreElements())
            {
                String nombreCabecero=(String)cabeceros.nextElement();
                out.println("<b>"+nombreCabecero+"</b>");
                out.println(request.getHeader(nombreCabecero));
                out.print("<br>");
                
                
            } //fin While 
           
           
            
            
        } //fin try E5
        
        finally
        {
            out.close();
        }  //fin finally 
  
        } //fin If E5
           
                 
                 
                 
                 //MANEJO DE COOKIES
                 
                  else
        {
            if(ejercicio8.equals(envio8))
            {
                  //Suponemos que el usuario esta visitando por primera vez nuestros sitio
        boolean nuevoUsuario =true;
        
        //obtenemos todas las cookies
        Cookie[] cookies=request.getCookies();
        
        //Buscamos si ya existe una coockie creada con anterioridad
        //llamada visitanteRecurrente
        
        if(cookies != null)
        {
            for(Cookie c : cookies)
            {
                if(c.getName().equals("visitanteRecurrente") && c.getValue().equals("si"))
                {
                    //En caso de que ya exista una cookie indicando 
                    //que ya existe un usuario registrado con anterioridad
                    //ponemos la bandera en falso y salimos del ciclo 
                    nuevoUsuario=false;
                    break;
                }
            }
        }
        
        String mensaje=null;
        if(nuevoUsuario)
        {
            //En caso de ser un usuario nuevo creamos el objeto Cookie
            Cookie visitanteCookie=new Cookie("visitanteRecurrente", "si");
            //Agregamos la cookie en la respuesta
            response.addCookie(visitanteCookie);
            mensaje="Gracias por visitar nuestro sitio";
                    }
        else
        {
            mensaje="Gracias por visitar NUEVAMENTE nuestro sitio";
        }
        
        //Escribimos la salida
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        
          out.println("<html>\n" +
"    <head>\n" +
" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n" +
"           <link href=\"https://fonts.googleapis.com/css?family=Alegreya|Chilanka|Dancing+Script|Kalam|Pacifico|Satisfy&display=swap\" rel=\"stylesheet\">\n" +
"           <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" +
"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script> \n" +
"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n" +
"<style>/* Make the image fully responsive */\n" +
".carousel-inner img {\n" +
"width: 100%;\n" +
"height: 100%;              \n" +
"}\n" +
"</style>\n" +
"\n" +
"<title>Grecia</title>\n" +
"\n" +
"<!-- Custom fonts for this theme -->\n" +
"<link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
"<link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\">\n" +
"<link href=\"https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\n" +
"\n" +
"<!-- Theme CSS -->\n" +
"<link href=\"css/freelancer.css\" rel=\"stylesheet\">\n" +
"<link href=\"css/estilo-indexp.css\" rel=\"stylesheet\">\n" +
"\n" +
"<!--Tabla de bootstrap-->\n" +
"\n" +
"<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" +
"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n" +
"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n" +
"\n" +
"<link href=\"https://fonts.googleapis.com/css?family=Nunito+Sans&display=swap\" rel=\"stylesheet\">\n" +
"<link href=\"https://fonts.googleapis.com/css?family=Chilanka|Nanum+Gothic:400,700|Source+Sans+Pro&display=swap\" rel=\"stylesheet\">\n" +
"\n" +
"<!--Estilos del formulario 3-->\n" +
"<link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilos.css\">\n" +
"\n" +
"<!--Estilos ejercicio 4-->\n" +
" <script type=\"text/javascript\" src=\"css/funcioness.js\"></script>\n" +
"     <!--Bootstrap formulario-->\n" +
"\n" +
"\n" +
"\n" +
"</head>\n" +
"           \n" +
"\n" +
"<body id=\"page-top\">\n" +
"              <!-- NavBar -->\n" +
"<nav class=\"navbar navbar-expand-lg bg-secondary text-uppercase fixed-top\" id=\"mainNav\">\n" +
"<div class=\"container\">\n" +
"\n" +
" \n" +
"    <form method=\"post\" action=\"servletParametros1\" >\n" +
"    <a class=\"navbar-brand js-scroll-trigger\" >Bienvenido SINAHI</a>\n" +
           " <center>\n" +
"        <button name=\"inicio\" value=\"inicio\" class=\"boton_inicio\">inicio</button>\n" +
"        </center>"+               
"    </form>\n" +
"\n" +
"\n" +
"<button class=\"navbar-toggler navbar-toggler-right text-uppercase font-weight-bold bg-primary text-white rounded\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
"\n" +
"    <i class=\"fas fa-bars\"></i>\n" +
"  </button>\n" +
"  <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n" +
"    <ul class=\"navbar-nav ml-auto\">\n" +
"      <li class=\"nav-item mx-0 mx-lg-1\">\n" +
"        <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"administracion.html\">Administracion</a>\n" +
"      </li>\n" +
"      <li class=\"nav-item mx-0 mx-lg-1\">\n" +
"       <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"#about\">Reglas de manejo</a>\n" +
"      </li>\n" +
"      <li class=\"nav-item mx-0 mx-lg-1\">\n" +
"        <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"#contact\">Pruebas de manejo</a>\n" +
"      </li>\n" +
"    </ul>\n" +
"  </div>\n" +
"</div>\n" +
"</nav>\n" +
"</div>\n" +
"</div> <br>\n" +
"<br>\n" +
"<br><br>\n" +
"<br>\n" +
"<br>\n");

        
        //omitimos codigo HTML para simplificar el codigo
        out.println("<center>Mensaje: "+ mensaje+"<center>");
    
          
            } //fin if 8
                
                }//fin else 8
     } //fin Else E5
     } //Fin Else E4         
     } //Fin 
    
    
    

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



