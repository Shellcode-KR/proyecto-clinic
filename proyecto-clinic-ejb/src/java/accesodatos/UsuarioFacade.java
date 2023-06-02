/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import modelo.Usuario;

/**
 *
 * @author hack_
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "proyecto-clinic-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }

    public List<Usuario> getUsuariosbyTipo(int idtipousuario) {
        TypedQuery<Usuario> query = em.createQuery(
                "SELECT u FROM Usuario u WHERE u.tipoUsuario.idtipoUsuario = :idtipousuario", Usuario.class);
        query.setParameter("idtipousuario", idtipousuario);
        return query.getResultList();
    }

    public Usuario getUsuarioByUsername(String username) {
        TypedQuery<Usuario> query = em.createNamedQuery("Usuario.findByUsuario", Usuario.class);
        query.setParameter("usuario", username);
        List<Usuario> usuarios = query.getResultList();
        if (!usuarios.isEmpty()) {
            return usuarios.get(0);
        }
        return null;
    }
    public Usuario getUltimoUsuario() {
        Query q = em.createQuery("SELECT u FROM Usuario u ORDER BY u.idusuario DESC");
        List<Usuario> usuarios = q.getResultList();
        if (!usuarios.isEmpty()) {
            return usuarios.get(0);
        } else {
            return null;
        }

    }
}
