/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package logicanegocio;

import accesodatos.UsuarioFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import modelo.Usuario;

/**
 *
 * @author hack_
 */
@Stateless
@LocalBean
public class LnUsuario {

    @EJB
    private UsuarioFacade usuarioFacade;

    public void addUsuario(Usuario u){
        usuarioFacade.create(u);
    }
    
    public List<Usuario> getUsuarios(){
        return usuarioFacade.findAll();
    }
    public Usuario findUsuario(int idUsuario){
        return usuarioFacade.find(idUsuario);
    }
    public void updateUsuario(Usuario u){
        usuarioFacade.edit(u);
    }
    public List<Usuario> getUsuariobyTipo(int tipousuario){
        return usuarioFacade.getUsuariosbyTipo(tipousuario);
    }
}
