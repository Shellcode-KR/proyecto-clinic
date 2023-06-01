/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package logicanegocio;

import accesodatos.ServiciosFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import modelo.Servicios;

/**
 *
 * @author hack_
 */
@Stateless
@LocalBean
public class LnServiciosDep {

    @EJB
    private ServiciosFacade serviciosFacade;
    
    public List<Servicios> getServicios(){
        return serviciosFacade.findAll();
    }

    public void addServicio(Servicios s){
        serviciosFacade.create(s);
    }
    public Servicios findServicio(int idServicio){
        return serviciosFacade.find(idServicio);
    }
    public void updateServicio(Servicios s){
        serviciosFacade.edit(s);
    }
    public List<Servicios> getServiciosByDepartamentoId(int idDepartamento){
        return serviciosFacade.obtenerServiciosPorDepartamento(idDepartamento);
    }
}
