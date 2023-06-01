/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package logicanegocio;

import accesodatos.MetodoPagoFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import modelo.MetodoPago;

/**
 *
 * @author hack_
 */
@Stateless
@LocalBean
public class LnPago {

    @EJB
    private MetodoPagoFacade metodoPagoFacade;

    public List<MetodoPago> findMetodos(){
        return metodoPagoFacade.findAll();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
