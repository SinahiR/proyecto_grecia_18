/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sinahi
 */
@WebServlet(name = "servletParametros1", urlPatterns = {"/servletParametros1"})
public class servletParametros1 extends HttpServlet {

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
            out.println("<title>Servlet servletParametros1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servletParametros1 at " + request.getContextPath() + "</h1>");
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
       // processRequest(request, response);
          
          
        
          String url=null;
          response.setContentType("text/html;charset=UTF-8");
     
  
                        
          
         try (PrintWriter out = response.getWriter()) {
             
      //SESIONES
      
       
              //SIMUMALANDO VALORES PARA QUE EL USUARIO ACCEDA CON SINAHI Y 123
              String usuarioCorrecto="Sinahi";
              String passCorrecto="123";
              
              String regreso="inicio";
               
              String boton=request.getParameter("inicio");
              
              
              String pUsuario=request.getParameter("username");
              String pPassword=request.getParameter("pass");
          
              
              
            //TIPO DE NAVEGADOR  
          String titulo=null, mensaje=null;
          String tipoNavegador=request.getHeader("User-Agent");
          System.out.println("El tipo de navegador es: "+tipoNavegador);
          
         if(tipoNavegador!=null && tipoNavegador.contains("Trident"))
          {
              titulo="Internet Explorer";
              mensaje="Estas navegando en internet Explorer";
          }
          
           if(tipoNavegador!=null && tipoNavegador.contains("Firefox"))
          {
              titulo="Firefox";
               mensaje="Estas navegando en Firefox";
          }
           
             if(tipoNavegador!=null && tipoNavegador.contains("Chrome"))
          {
              titulo="Chrome";
               mensaje="Estas navegando en Chrome";
          }
              
             
             //IF DE VALIDACION DE USUARIO Y CONTRASEÑA
              if((usuarioCorrecto.equals(pUsuario) && passCorrecto.equals(pPassword)) || regreso.equals(boton))
              {
 
                  if( regreso.equals(boton))
                  {
                      pUsuario="Sinahi";
                  }
       HttpSession sesion=request.getSession();
       String tituloSesion=null;
       
       //Pedimos el atributo y verificamos si existe
       Integer contadorVisitas=(Integer) sesion.getAttribute("contadorVisitas");
       
       //Si es igual a nulo, quiere decir que es la primera visita
       
       if(contadorVisitas==null)
       {
           contadorVisitas=new Integer(1);
           tituloSesion="Bienvenido por primera vez";
       }
       else
       {
           //si es distinto de nuelo, incrementamos el contador 
           tituloSesion="Bienvenido nuevamente";
           contadorVisitas=contadorVisitas+1;
       }
       
       //En cualquier caso, asgregamos el valor del contador
       //a la sesion
       sesion.setAttribute("contadorVisitas", contadorVisitas);
       
       //Mostramos los valores en el cliente
      
      /* out.println("T&iacute;tulo:" + tituloSesion);
       out.println("<br>");
       out.println("No. Accesos al recurso: "+ contadorVisitas);
       out.println("<br>");
       out.println("ID de la sesi&oacute;n: "+ sesion.getId());*/
       
                  
            
                 
                  out.println("<html>");
        out.println("<head>");
       out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">"
               + "<link href=\"https://fonts.googleapis.com/css?family=Alegreya|Chilanka|Dancing+Script|Kalam|Pacifico|Satisfy&display=swap\" rel=\"stylesheet\">"
               + "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" +
"  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n" +
"  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n" +
               
"<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n" +
"  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" +
"  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n" +
"  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>"+ 
               " <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilos.css\">"+
               
"  <style>/* Make the image fully responsive */\n" +
"  .carousel-inner img {\n" +
"    width: 100%;\n" +
"    height: 100%;\n" +
               
              
               
"  }\n" +
"  </style>\n" +
"\n" +
"\n" +
"\n" +
"  <title>Grecia</title>\n" +
"\n" +
"  <!-- Custom fonts for this theme -->\n" +
"  <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
"  <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\">\n" +
"  <link href=\"https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\n" +
"\n" +
"  <!-- Theme CSS -->\n" +
"  <link href=\"css/freelancer.css\" rel=\"stylesheet\">\n" +
"  <link href=\"css/estilo-indexp.css\" rel=\"stylesheet\">\n" +
"\n" +
"</head>"+
               "<body id=\"page-top\">"
                 + "<!-- NavBar -->\n" +
"  <nav class=\"navbar navbar-expand-lg bg-secondary text-uppercase fixed-top\" id=\"mainNav\">\n" +
"    <div class=\"container\">\n" +

" <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\" \">Bienvenido</a>\n"+
"<p class=\"usuario\" href=\"#page-top\">"+pUsuario+"</p>"); 
 
       
  out.println(" <button class=\"navbar-toggler navbar-toggler-right text-uppercase font-weight-bold bg-primary text-white rounded\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
"        Menu\n" +
"        <i class=\"fas fa-bars\"></i>\n" +
"      </button>\n" +
"      <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n" +
"        <ul class=\"navbar-nav ml-auto\">\n" +
"          <li class=\"nav-item mx-0 mx-lg-1\">\n" +
"            <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"administracion.html\">Administracion</a>\n" +
"          </li>\n" +
"          <li class=\"nav-item mx-0 mx-lg-1\">\n" +
"            <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"https://www.autoeurope.es/conducir-en-grecia-consejos/\">Reglas de manejo</a>\n" +
"          </li>\n" +
"          <li class=\"nav-item mx-0 mx-lg-1\">\n" +
"            <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"#contact\">Consejos en caso de Accidente</a>\n" +
"          </li>\n" +
"          </li>\n" +
"        </ul>\n" +
          " <ul class=\"navul\" >\n" +
"                        <li class=\"menu-item\"><a href=\"#\">Mas</a>\n" +
"                            <ul class=\"submenu navul\">\n" +
"                                <li class=\"navli\"><a class=\"nava\" href=\"lugaresTur.html\">Lugares Turisticos</li></a>\n" +
"                                <li class=\"navli\"><a class=\"nava\" href=\"consejosManejo.html\">Consejos de Manejo</li></a>\n" +
"                                <li class=\"navli\"><a class=\"nava\" href=\"sugerenciasPagina.html\">Sugerencias</li></a>\n" +
"                            </ul>\n" +
"                        </li>\n" +
"                    </ul>"+
          
"    </div>\n" +

"</div>\n" +
           "<div >\n" +
"<p class=\"cabecero\">Navegador: "+titulo+" \n</p>\n" +
"<p class=\"cabecero\">Visitas: "+contadorVisitas+" \n</p>\n"+
 "<p class=\"cabecero2\">"+tituloSesion+" \n</p>\n"+
"</div> "+
"  </nav>"+ 
  "<div>" + 
    
"  <!--DIV DEL CARRUSEL-->\n" +

"  <div id=\"demo\" class=\"carousel slide\" data-ride=\"carousel\">\n" +
"  <ul class=\"carousel-indicators\">\n" +
"    <li data-target=\"#demo\" data-slide-to=\"0\" class=\"active\"></li>\n" +
"    <li data-target=\"#demo\" data-slide-to=\"1\"></li>\n" +
"    <li data-target=\"#demo\" data-slide-to=\"2\"></li>\n" +
"  </ul>\n" +
"  <div class=\"carousel-inner\">\n" +
"    <div class=\"carousel-item active\">\n" +
"    \n" +
"    <!--Primera imagen-->\n" +
"      <img src=\"https://s1.1zoom.me/big0/358/300903-frederika.jpg\"  width=\"1100\" height=\"500\">\n" +
"      <div class=\"carousel-caption\">\n" +
"        <h3 class=\"colorl\" >El Partenón, Atenas</h3>\n" +
"      </div>   \n" +
"    </div>\n" +
"\n" +
"        <!--Segunda imagen-->\n" +
"    <div class=\"carousel-item\">\n" +
"      <img src=\"http://www.wallpaperk.com/wallpapers/isla-de-grecia-santorini-10974.jpg\"  width=\"1100\" height=\"500\">\n" +
"      <div class=\"carousel-caption\">\n" +
"        <h3 class=\"colorl\">Isla de grecia, Santorini</h3>\n" +
"      </div>   \n" +
"    </div>\n" +
"\n" +
"          <!--Tercera imagen-->\n" +
"    <div class=\"carousel-item\">\n" +
"      <img src=\"https://images3.alphacoders.com/279/279609.jpg\"  width=\"1100\" height=\"500\">\n" +
"      <div class=\"carousel-caption\">\n" +
"        <h3 class=\"colorl\">Islas Griegas de Symi and Rhodes</h3>\n" +
"      </div>   \n" +
"    </div>\n" +
"  </div>\n" +
"\n" +
"  <a class=\"carousel-control-prev\" href=\"#demo\" data-slide=\"prev\">\n" +
"    <span class=\"carousel-control-prev-icon\"></span>\n" +
"  </a>\n" +
"  <a class=\"carousel-control-next\" href=\"#demo\" data-slide=\"next\">\n" +
"    <span class=\"carousel-control-next-icon\"></span>\n" +
"  </a>\n" +
"</div>\n" +
"</div>");
 
  
  out.println("<center><div class=\"container\">\n" +
"<br><br>  <h2>Lugares Mas visitados en Grecia</h2>\n" +
          
"  <div class=\"card\" style=\"width:800px\">\n" +
"    <img src=\"https://www.nationalgeographic.com.es/medio/2014/04/22/161821621_2000x1333.jpg\"  alt=\"Card image\" style=\"width:100%\">\n" +
"    <div class=\"card-body\">\n" +
"      <h4 class=\"card-title\">La Acrópolis y el Partenón</h4>\n" +
"      <p class=\"card-text\">El Partenón, símbolo de Atenas, está emplazado en la cima de la Acrópolis, dominando la ciudad. "
          + "Es el templo sagrado de la diosa Atenea, protectora de la ciudad; con su simple estilo dórico ha inspirado a la"
          + " arquitectura oficial en todo el mundo. Construido casi exclusivamente en mármol blanco, la obra fue iniciada por "
          + "Pericles y realizada entre los años 447 y 432 AC.</p>\n" +
          
          " <p class=\"card-text\">Se llega mediante el metro de la ciudad, está siempre abarrotado de turistas, por eso lo más "
          + "conveniente es visitarlo temprano de mañana o a última hora de la tarde que tiene la ventaja de la puesta de sol.</p>\n" +
          
"      <a href=\"http://www.mujeresdeempresa.com/los-10-principales-atractivos-de-grecia/\" class=\"btn btn-primary\">Ver pagina turistica</a>\n" +
"    </div><br><br>\n" +
          
      "<div class=\"card\" style=\"width:800px\">\n" +
"    <img src=\"https://cdn.ejamo.it/es/wp-content/uploads/sites/49/Fira-Panorama.jpg\"  alt=\"Card image\" style=\"width:100%\">\n" +
"    <div class=\"card-body\">\n" +
"      <h4 class=\"card-title\">Santorini, Grecia</h4>\n" +
"      <p class=\"card-text\">Los hoteles agarrados a los acantilados, los pintorescos caminos tortuosos, un legado volcánico, excelentes vinos y comida locales"
          + " ubican a Santorini en la lista de los lugares a visitar. Ven a isla griega deslumbrante por el mar y disfruta de las mejores vistas de los despeñaderos"
          + " a franjas negras y marrones coronados por lava blanca.\n" +
"\n" +
"Asegúrate de visitar las ruinas de la una vez enterrada ciudad de Akrotiri.</p>\n" +
"      <a href=\"http://www.mujeresdeempresa.com/los-10-principales-atractivos-de-grecia/\" class=\"btn btn-primary\">Ver pagina turistica</a>\n" +
"    </div><br><br>\n" +   
          
          
          
  "<div class=\"card\" style=\"width:800px\">\n" +
"    <img src=\"https://www.101viajes.com/sites/default/files/museo-arqueologico.jpg\"  alt=\"Card image\" style=\"width:100%\">\n" +
"    <div class=\"card-body\">\n" +
"      <h4 class=\"card-title\">Museo Arqueologico de Atenas</h4>\n" +
"      <p class=\"card-text\">Este es el lugar perfecto para una inmersión en la cultura e historia griega. El Museo está"
          + " ubicado en la calle Patision 44 en un espléndido edificio neo clásico.\n" +
"\n" +
"Se destacan dos grandes esculturas de bronce: Poseidón y El joven jinete (también conocido como Jinete de Artemision),"
          + " el oro de la tumba de Agamenón, las esculturas de mármol del período clásico y los frescos de Santorini.</p>\n" +
"      <a href=\"http://www.mujeresdeempresa.com/los-10-principales-atractivos-de-grecia/\" class=\"btn btn-primary\">Ver pagina turistica</a>\n" +
"    </div><br><br>\n" +   
          
          
  "<div class=\"card\" style=\"width:800px\">\n" +
"    <img src=\"http://upload.wikimedia.org/wikipedia/commons/thumb/e/e5/Lake-Melissani.JPG/800px-Lake-Melissani.JPG\"  alt=\"Card image\" style=\"width:100%\">\n" +
"    <div class=\"card-body\">\n" +
"      <h4 class=\"card-title\">Las cuevas de Drogati y Melissani</h4>\n" +
"      <p class=\"card-text\"> Melissani, una cueva subterránea de agua salada que se torna turquesa todos los días cuando el sol alcanza cierto punto.\n" +
"\n" +
"La espectacular cueva de Drogati se destaca por sus estalactitas y tiene una excelente acústica. Además de estas dos maravillas naturales, toda la costa de Cefalonia es de una belleza deslumbrante.\n" +
"\n" +
"Los pueblitos de pescadores de Poros, Asos y Fiskardo son una verdadera delicia.</p>\n" +
"      <a href=\"http://www.mujeresdeempresa.com/los-10-principales-atractivos-de-grecia/\" class=\"btn btn-primary\">Ver pagina turistica</a>\n" +
"    </div>\n" +            
       
"  </div> </center>");
  

  out.println("</body>");
          out.println("</html>");
                    
              }
              
  
              else
              {     //Si usuario y contraseña NO con correctos (sinahi, 123)
                  //respondemos al navegador con un codigo de estado NO AUTORIZADO
               url="index.html";
              response.sendRedirect(url);
                 
              }
     
         }
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


