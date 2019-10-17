/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grecia.ejbs;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import grecia.entidades.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Sinahi
 */
@Stateless
public class EJBoperaciones {

    @PersistenceContext
    EntityManager em;

    public String NuevoUsuario(String nombre, String correo, String contrasena) {
        Usuario r = new Usuario();
        r.setNombre(nombre);
        r.setCorreo(correo);
        r.setContrasena(contrasena);
        
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
    public String ConsultaUsuario() {
        try {
            Query q;
            List<Usuario> listaRol;
            q = em.createNamedQuery("Usuario.findAll");
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
   public String ActualizaUsuario(int idusuario, String nombre, String correo, String contrasena){
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        String msj;
        Usuario usuario = new Usuario();
        try {
            
            usuario = em.find(Usuario.class,idusuario); 
            usuario.setNombre(nombre);
            usuario.setCorreo(correo);
            usuario.setContrasena(contrasena);
            em.merge(usuario);
            msj = "{\"code\":200,\"msj\":\"La operacion se realiza correctamente\"}";

        } catch (NumberFormatException e) {
            msj = "{\"codigo\":400,\"msj\":\"Error en los tipos de parametros\"}";
        }//fin del try
        
        return msj;
    }//fin de actualiza rol
    
    //ELIMINAR
    public String EliminaUsuario(int idusuario){
        String msj;
        Usuario usuario = new Usuario();
        try{
           usuario = (Usuario) em.createNamedQuery("Usuario.findByIdusuario").setParameter("idusuario", idusuario).getSingleResult();em.remove(usuario);
            msj = "{\"code\":200,\"msj\":\"La operacion se realiza correctamente al eliminar\"}";
            
        }catch(NumberFormatException e) {
            msj = "{\"codigo\":400,\"msj\":\"Error en los tipos de parametros\"}";
        }//fin del try
        
        return msj;
    }


}
