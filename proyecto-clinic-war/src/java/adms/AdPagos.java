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
import logicanegocio.LnPago;
import modelo.MetodoPago;

/**
 *
 * @author hack_
 */
@Named(value = "adPagos")
@SessionScoped
public class AdPagos implements Serializable {

    @EJB
    private LnPago lnPago;

    /**
     * Creates a new instance of AdPagos
     */
    public List<MetodoPago>  getMetodosPago(){
        return lnPago.findMetodos();
    }
    
    public AdPagos() {
    }
    
}
