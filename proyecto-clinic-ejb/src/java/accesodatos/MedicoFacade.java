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
import modelo.Medico;

/**
 *
 * @author hack_
 */
@Stateless
public class MedicoFacade extends AbstractFacade<Medico> {

    @PersistenceContext(unitName = "proyecto-clinic-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MedicoFacade() {
        super(Medico.class);
    }
    

    public List<Medico> medicosByDepa(int departamentoId) {
        TypedQuery<Medico> query = em.createQuery(
                "SELECT m FROM Medico m WHERE m.idDepartamento = :departamentoId", Medico.class);
        query.setParameter("departamentoId", departamentoId);
        return query.getResultList();
    }
}
