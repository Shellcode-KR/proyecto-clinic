/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author hack_
 */
@Entity
@Table(name = "estado_cita")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoCita.findAll", query = "SELECT e FROM EstadoCita e"),
    @NamedQuery(name = "EstadoCita.findByIdestadoCita", query = "SELECT e FROM EstadoCita e WHERE e.idestadoCita = :idestadoCita"),
    @NamedQuery(name = "EstadoCita.findByEstadoCita", query = "SELECT e FROM EstadoCita e WHERE e.estadoCita = :estadoCita")})
public class EstadoCita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestado_cita")
    private Integer idestadoCita;
    @Size(max = 45)
    @Column(name = "estado_cita")
    private String estadoCita;
    @OneToMany(mappedBy = "idEstadoCita")
    private List<Cita> citaList;

    public EstadoCita() {
    }

    public EstadoCita(Integer idestadoCita) {
        this.idestadoCita = idestadoCita;
    }

    public Integer getIdestadoCita() {
        return idestadoCita;
    }

    public void setIdestadoCita(Integer idestadoCita) {
        this.idestadoCita = idestadoCita;
    }

    public String getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(String estadoCita) {
        this.estadoCita = estadoCita;
    }

    @XmlTransient
    public List<Cita> getCitaList() {
        return citaList;
    }

    public void setCitaList(List<Cita> citaList) {
        this.citaList = citaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestadoCita != null ? idestadoCita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoCita)) {
            return false;
        }
        EstadoCita other = (EstadoCita) object;
        if ((this.idestadoCita == null && other.idestadoCita != null) || (this.idestadoCita != null && !this.idestadoCita.equals(other.idestadoCita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.EstadoCita[ idestadoCita=" + idestadoCita + " ]";
    }
    
}
