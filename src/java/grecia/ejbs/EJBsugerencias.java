/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grecia.ejbs;

import javax.ejb.Remote;
import javax.ejb.Stateful;

/**
 *
 * @author Sinahi
 */
@Stateful
@Remote (EJBusuarioRemote.class) //BEAN CON SESION
public class EJBsugerencias implements EJBsugerenciasRemote {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
