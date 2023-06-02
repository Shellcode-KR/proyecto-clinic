/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package logicanegocio;

import accesodatos.PacienteFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import modelo.Paciente;

/**
 *
 * @author hack_
 */
@Stateless
@LocalBean
public class LnPaciente {

    @EJB
    private PacienteFacade pacienteFacade;

    public void addPaciente(Paciente p){
        pacienteFacade.create(p);
    }
    public void updatePaciente(Paciente p){
        pacienteFacade.edit(p);
    }
    public List<Paciente> getPacientes(){
        return pacienteFacade.findAll();
    }
    public Paciente findPaciente(int idpaciente){
        return pacienteFacade.find(idpaciente);
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
