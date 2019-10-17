/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grecia.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sinahi
 */
@Entity
@Table(name = "lugarturistico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lugarturistico.findAll", query = "SELECT l FROM Lugarturistico l")
    , @NamedQuery(name = "Lugarturistico.findByIdlugar", query = "SELECT l FROM Lugarturistico l WHERE l.idlugar = :idlugar")
    , @NamedQuery(name = "Lugarturistico.findByNombrelugar", query = "SELECT l FROM Lugarturistico l WHERE l.nombrelugar = :nombrelugar")
    , @NamedQuery(name = "Lugarturistico.findByUbicacion", query = "SELECT l FROM Lugarturistico l WHERE l.ubicacion = :ubicacion")
    , @NamedQuery(name = "Lugarturistico.findByDescripcionlugar", query = "SELECT l FROM Lugarturistico l WHERE l.descripcionlugar = :descripcionlugar")})
public class Lugarturistico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idlugar")
    private Integer idlugar;
    @Size(max = 100)
    @Column(name = "nombrelugar")
    private String nombrelugar;
    @Size(max = 150)
    @Column(name = "ubicacion")
    private String ubicacion;
    @Size(max = 300)
    @Column(name = "descripcionlugar")
    private String descripcionlugar;

    public Lugarturistico() {
    }

    public Lugarturistico(Integer idlugar) {
        this.idlugar = idlugar;
    }

    public Integer getIdlugar() {
        return idlugar;
    }

    public void setIdlugar(Integer idlugar) {
        this.idlugar = idlugar;
    }

    public String getNombrelugar() {
        return nombrelugar;
    }

    public void setNombrelugar(String nombrelugar) {
        this.nombrelugar = nombrelugar;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcionlugar() {
        return descripcionlugar;
    }

    public void setDescripcionlugar(String descripcionlugar) {
        this.descripcionlugar = descripcionlugar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlugar != null ? idlugar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lugarturistico)) {
            return false;
        }
        Lugarturistico other = (Lugarturistico) object;
        if ((this.idlugar == null && other.idlugar != null) || (this.idlugar != null && !this.idlugar.equals(other.idlugar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "grecia.entidades.Lugarturistico[ idlugar=" + idlugar + " ]";
    }
    
}
