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
import logicanegocio.LnServiciosDep;
import modelo.Departamento;
import modelo.Servicios;

/**
 *
 * @author hack_
 */
@Named(value = "adServicioDep")
@SessionScoped
public class AdServicioDep implements Serializable {

    @EJB
    private LnServiciosDep lnServiciosDep;

    @EJB
    private LnDepartamentos lnDepartamentos;

    /**
     * Creates a new instance of AdServicioDep
     */
    private Servicios servicio;
    private Departamento departamento;

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    

    public Servicios getServicio() {
        return servicio;
    }

    public void setServicio(Servicios servicio) {
        this.servicio = servicio;
    }
    public List<Servicios> getServiciosClinica(){
        return lnServiciosDep.getServicios();
    }
    
    
    public void agregarServicio(){
        departamento = lnDepartamentos.findDepartamento(departamento.getIddepartamento());
        servicio.setDepartamento(departamento);
        lnServiciosDep.addServicio(servicio);
        servicio=new Servicios();
    }
    
    public AdServicioDep() {
        servicio=new Servicios();
        departamento= new Departamento();
    }
    
}
