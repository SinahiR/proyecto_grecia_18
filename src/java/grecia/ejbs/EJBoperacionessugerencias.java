/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grecia.ejbs;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import grecia.entidades.Sugerencias;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Sinahi
 */
@Stateless
@LocalBean
public class EJBoperacionessugerencias {

@PersistenceContext
    EntityManager em;

    public String NuevaSugerencia( String titulosugerencias, String usuariosugerencias, String descripcionsugerencias) {
        Sugerencias r = new Sugerencias();
        r.setTitulosugerencia(titulosugerencias);
        r.setDescripcionsugerencia(descripcionsugerencias);
        r.setUsuariosugerencia(usuariosugerencias);
        
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
   public String ConsultaSugerencias() {
        try {
            Query q;
            List<Sugerencias> listaRol;
            q = em.createNamedQuery("Sugerencias.findAll");
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
   public String ActualizaSugerencia(int idsugerencias, String titulosugerencia, String descripcionsugerencia, String usuariosugerencia){
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        String msj;
        Sugerencias s = new Sugerencias();
        try {
            
            s = em.find(Sugerencias.class,idsugerencias); 
            s.setTitulosugerencia(titulosugerencia);
            s.setDescripcionsugerencia(descripcionsugerencia);
            s.setUsuariosugerencia(usuariosugerencia);
            em.merge(s);
            msj = "{\"code\":200,\"msj\":\"La operacion se realiza correctamente\"}";

        } catch (NumberFormatException e) {
            msj = "{\"codigo\":400,\"msj\":\"Error en los tipos de parametros\"}";
        }//fin del try
        
        return msj;
    }//fin de actualiza rol
    
    //ELIMINAR
   public String EliminaSugerencia(int idsugerencias){
        String msj;
        Sugerencias s = new Sugerencias();
        try{
           s = (Sugerencias) em.createNamedQuery("Sugerencias.findByIdsugerencias").setParameter("idsugerencias", idsugerencias).getSingleResult();em.remove(s);
            msj = "{\"code\":200,\"msj\":\"La operacion se realiza correctamente al eliminar\"}";
            
        }catch(NumberFormatException e) {
            msj = "{\"codigo\":400,\"msj\":\"Error en los tipos de parametros\"}";
        }//fin del try
        
        return msj;
    } 

}
