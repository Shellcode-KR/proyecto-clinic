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
import logicanegocio.LnMedico;
import modelo.Departamento;
import modelo.Medico;

/**
 *
 * @author hack_
 */
@Named(value = "adMedico")
@SessionScoped
public class AdMedico implements Serializable{

    @EJB
    private LnMedico lnMedico;

    /**
     * Creates a new instance of AdMedico
    */
    private Departamento departamento;

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public List<Medico> getMedicosByDepartamento(){
        return lnMedico.findMedicosByDepa(departamento.getIddepartamento());
    }
    public List<Medico> getMedicos(){
        return lnMedico.findMedicos();
    }
    
    public AdMedico() {
    }
    
}
