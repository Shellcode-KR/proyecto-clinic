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
@Table(name = "metodo_pago")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MetodoPago.findAll", query = "SELECT m FROM MetodoPago m"),
    @NamedQuery(name = "MetodoPago.findByIdmetodoPago", query = "SELECT m FROM MetodoPago m WHERE m.idmetodoPago = :idmetodoPago"),
    @NamedQuery(name = "MetodoPago.findByMetodoPagocol", query = "SELECT m FROM MetodoPago m WHERE m.metodoPagocol = :metodoPagocol")})
public class MetodoPago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmetodo_pago")
    private Integer idmetodoPago;
    @Size(max = 45)
    @Column(name = "metodo_pagocol")
    private String metodoPagocol;
    @OneToMany(mappedBy = "metodoPago")
    private List<Pago> pagoList;

    public MetodoPago() {
    }

    public MetodoPago(Integer idmetodoPago) {
        this.idmetodoPago = idmetodoPago;
    }

    public Integer getIdmetodoPago() {
        return idmetodoPago;
    }

    public void setIdmetodoPago(Integer idmetodoPago) {
        this.idmetodoPago = idmetodoPago;
    }

    public String getMetodoPagocol() {
        return metodoPagocol;
    }

    public void setMetodoPagocol(String metodoPagocol) {
        this.metodoPagocol = metodoPagocol;
    }

    @XmlTransient
    public List<Pago> getPagoList() {
        return pagoList;
    }

    public void setPagoList(List<Pago> pagoList) {
        this.pagoList = pagoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmetodoPago != null ? idmetodoPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MetodoPago)) {
            return false;
        }
        MetodoPago other = (MetodoPago) object;
        if ((this.idmetodoPago == null && other.idmetodoPago != null) || (this.idmetodoPago != null && !this.idmetodoPago.equals(other.idmetodoPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.MetodoPago[ idmetodoPago=" + idmetodoPago + " ]";
    }
    
}
