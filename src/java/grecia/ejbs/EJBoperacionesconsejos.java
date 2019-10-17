/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grecia.ejbs;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import grecia.entidades.Consejos;
import grecia.entidades.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateless
public class EJBoperacionesconsejos {
    
     @PersistenceContext
    EntityManager em;

    public String NuevoConsejo( String tituloconsejo, String descripcionconsejo, String usuarioconsejo ) {
        Consejos r = new Consejos();
        r.setTituloconsejo(tituloconsejo);
        r.setDescripcionconsejo(descripcionconsejo);
        r.setUsuarioconsejo(usuarioconsejo);
        
        String msj;
        try {
            em.persist(r);
            msj = "{\"code\":200,\"msj\":\"La operacion se realiza correctamente\"}";
        } catch (Exception e) {
            msj = "{\"code\":400,\"msj\":\"Error en los tipos de parametros\"}";
        }
        return msj;
    }
    
    //CONSULTA
    public String ConsultaConsejo() {
        try {
            Query q;
            List<Consejos> listaRol;
            q = em.createNamedQuery("Consejos.findAll");
            listaRol = q.getResultList(); // ejecutar consulta
            //onvertir la lista a objetos JSON
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            return gson.toJson(listaRol);
        } catch (Exception e) {
            return "{msg:'Error'}";
        }
    }

    //ACTUALIZAR
   public String ActualizaConsejo(int idconsejo, String tituloconsejo, String descripcionconsejo, String usuarioconsejo){
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        String msj;
        Consejos consejo = new Consejos();
        try {
            
            consejo = em.find(Consejos.class,idconsejo); 
            consejo.setTituloconsejo(tituloconsejo);
            consejo.setDescripcionconsejo(descripcionconsejo);
            consejo.setUsuarioconsejo(usuarioconsejo);
            em.merge(consejo);
            msj = "{\"code\":200,\"msj\":\"La operacion se realiza correctamente\"}";

        } catch (NumberFormatException e) {
            msj = "{\"codigo\":400,\"msj\":\"Error en los tipos de parametros\"}";
        }//fin del try
        
        return msj;
    }//fin de actualiza rol
    
    //ELIMINAR
   public String EliminaConsejos(int idconsejo){
        String msj;
        Consejos consejo= new Consejos();
        try{
           consejo = (Consejos) em.createNamedQuery("Consejos.findByIdconsejo").setParameter("idconsejo", idconsejo).getSingleResult();em.remove(consejo);
            msj = "{\"code\":200,\"msj\":\"La operacion se realiza correctamente al eliminar\"}";
            
        }catch(NumberFormatException e) {
            msj = "{\"codigo\":400,\"msj\":\"Error en los tipos de parametros\"}";
        }//fin del try
        
        return msj;
    } 
   
}
