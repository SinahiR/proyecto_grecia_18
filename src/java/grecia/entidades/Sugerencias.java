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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sinahi
 */
@Entity
@Table(name = "sugerencias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sugerencias.findAll", query = "SELECT s FROM Sugerencias s")
    , @NamedQuery(name = "Sugerencias.findByIdsugerencias", query = "SELECT s FROM Sugerencias s WHERE s.idsugerencias = :idsugerencias")
    , @NamedQuery(name = "Sugerencias.findByTitulosugerencia", query = "SELECT s FROM Sugerencias s WHERE s.titulosugerencia = :titulosugerencia")
    , @NamedQuery(name = "Sugerencias.findByDescripcionsugerencia", query = "SELECT s FROM Sugerencias s WHERE s.descripcionsugerencia = :descripcionsugerencia")
    , @NamedQuery(name = "Sugerencias.findByUsuariosugerencia", query = "SELECT s FROM Sugerencias s WHERE s.usuariosugerencia = :usuariosugerencia")})
public class Sugerencias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsugerencias")
    private Integer idsugerencias;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "titulosugerencia")
    private String titulosugerencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "descripcionsugerencia")
    private String descripcionsugerencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "usuariosugerencia")
    private String usuariosugerencia;

    public Sugerencias() {
    }

    public Sugerencias(Integer idsugerencias) {
        this.idsugerencias = idsugerencias;
    }

    public Sugerencias(Integer idsugerencias, String titulosugerencia, String descripcionsugerencia, String usuariosugerencia) {
        this.idsugerencias = idsugerencias;
        this.titulosugerencia = titulosugerencia;
        this.descripcionsugerencia = descripcionsugerencia;
        this.usuariosugerencia = usuariosugerencia;
    }

    public Integer getIdsugerencias() {
        return idsugerencias;
    }

    public void setIdsugerencias(Integer idsugerencias) {
        this.idsugerencias = idsugerencias;
    }

    public String getTitulosugerencia() {
        return titulosugerencia;
    }

    public void setTitulosugerencia(String titulosugerencia) {
        this.titulosugerencia = titulosugerencia;
    }

    public String getDescripcionsugerencia() {
        return descripcionsugerencia;
    }

    public void setDescripcionsugerencia(String descripcionsugerencia) {
        this.descripcionsugerencia = descripcionsugerencia;
    }

    public String getUsuariosugerencia() {
        return usuariosugerencia;
    }

    public void setUsuariosugerencia(String usuariosugerencia) {
        this.usuariosugerencia = usuariosugerencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsugerencias != null ? idsugerencias.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sugerencias)) {
            return false;
        }
        Sugerencias other = (Sugerencias) object;
        if ((this.idsugerencias == null && other.idsugerencias != null) || (this.idsugerencias != null && !this.idsugerencias.equals(other.idsugerencias))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "grecia.entidades.Sugerencias[ idsugerencias=" + idsugerencias + " ]";
    }
    
}
