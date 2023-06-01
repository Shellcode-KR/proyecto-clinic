/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "servicios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servicios.findAll", query = "SELECT s FROM Servicios s"),
    @NamedQuery(name = "Servicios.findByIdservicios", query = "SELECT s FROM Servicios s WHERE s.idservicios = :idservicios"),
    @NamedQuery(name = "Servicios.findByServicio", query = "SELECT s FROM Servicios s WHERE s.servicio = :servicio")})
public class Servicios implements Serializable {

    @Size(max = 45)
    @Column(name = "servicio")
    private String servicio;
    @Column(name = "costo")
    private Integer costo;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idservicios")
    private Integer idservicios;
    @JoinColumn(name = "departamento", referencedColumnName = "iddepartamento")
    @ManyToOne
    private Departamento departamento;
    @OneToMany(mappedBy = "idServicio")
    private List<Cita> citaList;

    public Servicios() {
    }

    public Servicios(Integer idservicios) {
        this.idservicios = idservicios;
    }

    public Integer getIdservicios() {
        return idservicios;
    }

    public void setIdservicios(Integer idservicios) {
        this.idservicios = idservicios;
    }


    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
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
        hash += (idservicios != null ? idservicios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Servicios other = (Servicios) obj;
        if (!Objects.equals(this.servicio, other.servicio)) {
            return false;
        }
        if (!Objects.equals(this.idservicios, other.idservicios)) {
            return false;
        }
        return Objects.equals(this.departamento, other.departamento);
    }

    

    @Override
    public String toString() {
        return "modelo.Servicios[ idservicios=" + idservicios + " ]";
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }
    
}
