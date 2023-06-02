/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package adms;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import logicanegocio.LnCita;
import logicanegocio.LnMedico;
import logicanegocio.LnPaciente;
import logicanegocio.LnServiciosDep;
import modelo.Cita;
import modelo.EstadoCita;
import modelo.Medico;
import modelo.Paciente;
import modelo.Servicios;

/**
 *
 * @author hack_
 */
@Named(value = "adCitas")
@SessionScoped
public class AdCitas implements Serializable {

    @EJB
    private LnServiciosDep lnServiciosDep;

    @EJB
    private LnPaciente lnPaciente;

    @EJB
    private LnMedico lnMedico;

    @EJB
    private LnCita lnCita;

    private Cita cita;
    private Paciente paciente;

    private Servicios servicio;

    public Servicios getServicio() {
        return servicio;
    }

    public void setServicio(Servicios servicio) {
        this.servicio = servicio;
    }
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    private Medico medico;
    private EstadoCita estadoCita;

    public EstadoCita getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(EstadoCita estadoCita) {
        this.estadoCita = estadoCita;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    /**
     * Creates a new instance of AdCitas
     */

    public List<EstadoCita> getEstadoCitas() {
        return lnCita.findEstadoCita();
    }

    public List<Cita> getCitas() {
        return lnCita.getCitas();
    }

    public void nuevacita() {
        
        medico = lnMedico.findMedico(medico.getIdmedico());
        cita.setIdMedico(medico);
        estadoCita = lnCita.findEstadocCitaUnidad(estadoCita.getIdestadoCita());
        cita.setIdEstadoCita(estadoCita);
        paciente= lnPaciente.findPaciente(paciente.getIdpaciente());
        cita.setIdPaciente(paciente);
        servicio= lnServiciosDep.findServicio(servicio.getIdservicios());
        cita.setIdServicio(servicio);
        
        lnCita.addCita(cita);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Cita creado con éxito", "La cita ha sido creado exitosamente."));

        cita=new Cita();
        medico= new Medico();
        estadoCita= new EstadoCita();
        paciente = new Paciente();
    }

    public AdCitas() {
        cita=new Cita();
        medico= new Medico();
        estadoCita= new EstadoCita();
        paciente = new Paciente();
    }

}
