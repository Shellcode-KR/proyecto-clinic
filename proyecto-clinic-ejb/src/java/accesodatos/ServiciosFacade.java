/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import modelo.Departamento;
import modelo.Servicios;

/**
 *
 * @author hack_
 */
@Stateless
public class ServiciosFacade extends AbstractFacade<Servicios> {

    @PersistenceContext(unitName = "proyecto-clinic-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

  
    public ServiciosFacade() {
        super(Servicios.class);
    }
    
}
