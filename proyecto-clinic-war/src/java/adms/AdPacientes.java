/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package adms;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import logicanegocio.LnPaciente;
import modelo.Paciente;

/**
 *
 * @author hack_
 */
@Named(value = "adPacientes")
@SessionScoped
public class AdPacientes implements Serializable{

    @EJB
    private LnPaciente lnPaciente;

    private Paciente paciente;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Paciente> getPacientes() {
        return lnPaciente.getPacientes();
    }

    public void nuevoPaciente() {
        lnPaciente.addPaciente(paciente);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Paciente creado con éxito", "El Paciente ha sido creado exitosamente."));

        paciente = new Paciente();
    }

    /**
     * Creates a new instance of AdPacientes
     */
    public AdPacientes() {
        paciente = new Paciente();
    }

}
