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
import logicanegocio.LnDepartamentos;
import modelo.Departamento;

/**
 *
 * @author hack_
 */
@Named(value = "adDepartamentos")
@SessionScoped
public class AdDepartamentos implements Serializable {

    @EJB
    private LnDepartamentos lnDepartamentos;
    
    public List<Departamento> getDepartamentosdata(){
       return lnDepartamentos.getDepartamentos();
    }
    /**
     * Creates a new instance of AdDepartamentos
     */
    
    public AdDepartamentos() {
    }
    
}
