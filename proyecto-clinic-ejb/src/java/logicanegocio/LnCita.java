/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package logicanegocio;

import accesodatos.CitaFacade;
import accesodatos.EstadoCitaFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import modelo.EstadoCita;
import modelo.Cita;

/**
 *
 * @author hack_
 */
@Stateless
@LocalBean
public class LnCita {

    @EJB
    private CitaFacade citaFacade;

    @EJB
    private EstadoCitaFacade estadoCitaFacade;
    public List<Cita> getCitas(){
        return citaFacade.findAll();
    }
    public void addCita(Cita c){
        citaFacade.create(c);
    }
    public void updateCita(Cita c){
        citaFacade.edit(c);
    }
    public Cita findCita(int idCita){
        return citaFacade.find(idCita);
    }
    public List<EstadoCita> findEstadoCita(){
        return estadoCitaFacade.findAll();
    }
    public EstadoCita findEstadocCitaUnidad(int idestadocita){
        return estadoCitaFacade.find(idestadocita);
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
