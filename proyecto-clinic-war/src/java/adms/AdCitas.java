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
import logicanegocio.LnCita;
import modelo.EstadoCita;

/**
 *
 * @author hack_
 */
@Named(value = "adCitas")
@SessionScoped
public class AdCitas implements Serializable {

    @EJB
    private LnCita lnCita;

    /**
     * Creates a new instance of AdCitas
     */
    
    public List<EstadoCita> getEstadoCita(){
        return lnCita.findEstadoCita();
    }
    
    public AdCitas() {
    }
    
}
