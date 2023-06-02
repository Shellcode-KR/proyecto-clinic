/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package logicanegocio;

import accesodatos.MedicoFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import modelo.Medico;

/**
 *
 * @author hack_
 */
@Stateless
@LocalBean
public class LnMedico {

    @EJB
    private MedicoFacade medicoFacade;

    public void addMedico(Medico m){
    medicoFacade.create(m);
    }
    public void updateMedico(Medico m){
    medicoFacade.edit(m);
    }
    public List<Medico> findMedicos(){
        return medicoFacade.findAll();
    }
    public Medico findMedico(int idMedico){
        return medicoFacade.find(idMedico);
    }
    public List<Medico> findMedicosByDepa(int idDepa){
        return medicoFacade.medicosByDepa(idDepa);
    }
    
}
