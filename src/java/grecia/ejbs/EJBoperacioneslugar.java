/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grecia.ejbs;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import grecia.entidades.Lugarturistico;
import grecia.entidades.Usuario;
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
public class EJBoperacioneslugar {
     @PersistenceContext
    EntityManager em;
     
     public String NuevoLugar(String nombrelugar, String ubicacion, String descripcionlugar) {
        Lugarturistico r = new Lugarturistico();
        r.setNombrelugar(nombrelugar);
        r.setUbicacion(ubicacion);
        r.setDescripcionlugar(descripcionlugar);
        
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
    public String ConsultaLugar() {
        try {
            Query q;
            List<Lugarturistico> listaRol;
            q = em.createNamedQuery("Lugarturistico.findAll");
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
  public String ActualizaLugar(int idlugar, String nombrelugar, String ubicacion, String descripcionlugar){
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        String msj;
        Lugarturistico lugar = new Lugarturistico();
        try {
            
           
            lugar=em.find(Lugarturistico.class,idlugar);
            lugar.setNombrelugar(nombrelugar);
            lugar.setUbicacion(ubicacion);
            lugar.setDescripcionlugar(descripcionlugar);
            em.merge(lugar);
            msj = "{\"code\":200,\"msj\":\"La operacion se realiza correctamente\"}";

        } catch (NumberFormatException e) {
            msj = "{\"codigo\":400,\"msj\":\"Error en los tipos de parametros\"}";
        }//fin del try
        
        return msj;
    }//fin de actualiza rol
    
    //ELIMINAR
    public String EliminaLugar(int idlugar){
        String msj;
        Lugarturistico lugar = new Lugarturistico();
        try{
           lugar = (Lugarturistico) em.createNamedQuery("Lugarturistico.findByIdlugar").setParameter("idlugar", idlugar).getSingleResult();em.remove(lugar);
            msj = "{\"code\":200,\"msj\":\"La operacion se realiza correctamente al eliminar\"}";
            
        }catch(NumberFormatException e) {
            msj = "{\"codigo\":400,\"msj\":\"Error en los tipos de parametros\"}";
        }//fin del try
        
        return msj;
    }

}
