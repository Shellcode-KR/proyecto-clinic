/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hack_
 */
@Entity
@Table(name = "cita")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cita.findAll", query = "SELECT c FROM Cita c"),
    @NamedQuery(name = "Cita.findByIdcita", query = "SELECT c FROM Cita c WHERE c.idcita = :idcita"),
    @NamedQuery(name = "Cita.findByFechaInicio", query = "SELECT c FROM Cita c WHERE c.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Cita.findByFechaFinal", query = "SELECT c FROM Cita c WHERE c.fechaFinal = :fechaFinal")})
public class Cita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcita")
    private Integer idcita;
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fecha_final")
    @Temporal(TemporalType.DATE)
    private Date fechaFinal;
    @JoinColumn(name = "id_estado_cita", referencedColumnName = "idestado_cita")
    @ManyToOne
    private EstadoCita idEstadoCita;
    @JoinColumn(name = "id_medico", referencedColumnName = "idmedico")
    @ManyToOne
    private Medico idMedico;
    @JoinColumn(name = "id_paciente", referencedColumnName = "idpaciente")
    @ManyToOne
    private Paciente idPaciente;
    @JoinColumn(name = "id_pago", referencedColumnName = "idpago")
    @ManyToOne
    private Pago idPago;
    @JoinColumn(name = "id_servicio", referencedColumnName = "idservicios")
    @ManyToOne
    private Servicios idServicio;

    public Cita() {
    }

    public Cita(Integer idcita) {
        this.idcita = idcita;
    }

    public Integer getIdcita() {
        return idcita;
    }

    public void setIdcita(Integer idcita) {
        this.idcita = idcita;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public EstadoCita getIdEstadoCita() {
        return idEstadoCita;
    }

    public void setIdEstadoCita(EstadoCita idEstadoCita) {
        this.idEstadoCita = idEstadoCita;
    }

    public Medico getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Medico idMedico) {
        this.idMedico = idMedico;
    }

    public Paciente getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Paciente idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Pago getIdPago() {
        return idPago;
    }

    public void setIdPago(Pago idPago) {
        this.idPago = idPago;
    }

    public Servicios getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Servicios idServicio) {
        this.idServicio = idServicio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcita != null ? idcita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cita)) {
            return false;
        }
        Cita other = (Cita) object;
        if ((this.idcita == null && other.idcita != null) || (this.idcita != null && !this.idcita.equals(other.idcita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Cita[ idcita=" + idcita + " ]";
    }
    
}
