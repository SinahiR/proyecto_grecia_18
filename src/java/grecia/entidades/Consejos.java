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
@Table(name = "consejos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Consejos.findAll", query = "SELECT c FROM Consejos c")
    , @NamedQuery(name = "Consejos.findByIdconsejo", query = "SELECT c FROM Consejos c WHERE c.idconsejo = :idconsejo")
    , @NamedQuery(name = "Consejos.findByTituloconsejo", query = "SELECT c FROM Consejos c WHERE c.tituloconsejo = :tituloconsejo")
    , @NamedQuery(name = "Consejos.findByDescripcionconsejo", query = "SELECT c FROM Consejos c WHERE c.descripcionconsejo = :descripcionconsejo")
    , @NamedQuery(name = "Consejos.findByUsuarioconsejo", query = "SELECT c FROM Consejos c WHERE c.usuarioconsejo = :usuarioconsejo")})
public class Consejos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idconsejo")
    private Integer idconsejo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "tituloconsejo")
    private String tituloconsejo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "descripcionconsejo")
    private String descripcionconsejo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "usuarioconsejo")
    private String usuarioconsejo;

    public Consejos() {
    }

    public Consejos(Integer idconsejo) {
        this.idconsejo = idconsejo;
    }

    public Consejos(Integer idconsejo, String tituloconsejo, String descripcionconsejo, String usuarioconsejo) {
        this.idconsejo = idconsejo;
        this.tituloconsejo = tituloconsejo;
        this.descripcionconsejo = descripcionconsejo;
        this.usuarioconsejo = usuarioconsejo;
    }

    public Integer getIdconsejo() {
        return idconsejo;
    }

    public void setIdconsejo(Integer idconsejo) {
        this.idconsejo = idconsejo;
    }

    public String getTituloconsejo() {
        return tituloconsejo;
    }

    public void setTituloconsejo(String tituloconsejo) {
        this.tituloconsejo = tituloconsejo;
    }

    public String getDescripcionconsejo() {
        return descripcionconsejo;
    }

    public void setDescripcionconsejo(String descripcionconsejo) {
        this.descripcionconsejo = descripcionconsejo;
    }

    public String getUsuarioconsejo() {
        return usuarioconsejo;
    }

    public void setUsuarioconsejo(String usuarioconsejo) {
        this.usuarioconsejo = usuarioconsejo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idconsejo != null ? idconsejo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consejos)) {
            return false;
        }
        Consejos other = (Consejos) object;
        if ((this.idconsejo == null && other.idconsejo != null) || (this.idconsejo != null && !this.idconsejo.equals(other.idconsejo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "grecia.entidades.Consejos[ idconsejo=" + idconsejo + " ]";
    }
    
}
