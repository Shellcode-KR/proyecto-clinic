/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.EstadoCita;

/**
 *
 * @author hack_
 */
@Stateless
public class EstadoCitaFacade extends AbstractFacade<EstadoCita> {

    @PersistenceContext(unitName = "proyecto-clinic-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstadoCitaFacade() {
        super(EstadoCita.class);
    }
    
}
