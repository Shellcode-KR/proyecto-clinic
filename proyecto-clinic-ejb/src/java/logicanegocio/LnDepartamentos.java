/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package logicanegocio;

import accesodatos.DepartamentoFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import modelo.Departamento;

/**
 *
 * @author hack_
 */
@Stateless
@LocalBean
public class LnDepartamentos {

    @EJB
    private DepartamentoFacade departamentoFacade;

    public List<Departamento> getDepartamentos(){
        return departamentoFacade.findAll();
    }
    public Departamento findDepartamento(int idDepartamento){
       return departamentoFacade.find(idDepartamento);
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
