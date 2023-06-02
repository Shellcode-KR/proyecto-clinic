/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package adms;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import logicanegocio.LnDepartamentos;
import logicanegocio.LnMedico;
import logicanegocio.LnUsuario;
import modelo.Departamento;
import modelo.Medico;
import modelo.TipoUsuario;
import modelo.Usuario;

/**
 *
 * @author hack_
 */
@Named(value = "adUsuario")
@SessionScoped
public class AdUsuario implements Serializable {

    @EJB
    private LnMedico lnMedico;

    @EJB
    private LnDepartamentos lnDepartamentos;

    @EJB
    private LnUsuario lnUsuario;
    private Departamento departamento;

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void nuevoMedico() {
        nuevoUsuario();
        departamento = lnDepartamentos.findDepartamento(departamento.getIddepartamento());
        medico.setIdDepartamento(departamento);
        usuarioaux = lnUsuario.getUltimoUsuario();
        medico.setIdUsuario(usuarioaux);
        lnMedico.addMedico(medico);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Médico creado con éxito", "El médico ha sido creado exitosamente."));
        medico = new Medico();

    }

    private Usuario usuario;
    private Usuario usuarioaux;
    private TipoUsuario tipousuario;
    private List<TipoUsuario> tiposusuarios;

    public List<TipoUsuario> getRecuperartipos() {
        return lnUsuario.getTipoUsuarios();
    }

    public TipoUsuario getTipousuario() {
        return tipousuario;
    }

    private Medico medico;

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setTipousuario(TipoUsuario tipousuario) {
        this.tipousuario = tipousuario;
    }

    public void listatablatipo() {
        usuariostipo = lnUsuario.getUsuariobyTipo(tipousuario.getIdtipoUsuario());
    }
    //Abajo no tocar
    private List<Usuario> usuariostipo;

    public List<Usuario> getUsuariostipo() {
        return usuariostipo;
    }

    public void setUsuariostipo(List<Usuario> usuariostipo) {
        this.usuariostipo = usuariostipo;
    }

    public Usuario getUsuarioaux() {
        return usuarioaux;
    }

    public void setUsuarioaux(Usuario usuarioaux) {
        this.usuarioaux = usuarioaux;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String login() {
        usuarioaux = lnUsuario.findUsuarioBynombre(usuario.getUsuario());

        if (usuarioaux == null) {
            // El usuario no existe, mostrar mensaje de error
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario no encontrado", "El usuario ingresado no existe"));
            return null; // Permanecer en la página de inicio de sesión
        } else {
            if (usuarioaux.getContrasena().equals(usuario.getContrasena())) {
                // Inicio de sesión exitoso
                //return "home.xhtml"; // Redireccionar a la página de inicio después del inicio de sesión
                usuario = usuarioaux;

                if (usuarioaux.getTipoUsuario().getIdtipoUsuario() == 1) {
                    usuarioaux = new Usuario();
                    return "vistas/admin";
                } else {
                    usuarioaux = new Usuario();
                    return "vistas/medico";
                }

            } else {
                // Contraseña incorrecta, mostrar mensaje de error
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Contraseña incorrecta", "La contraseña ingresada es incorrecta"));
                return null; // Permanecer en la página de inicio de sesión
            }

        }

    }

    public void nuevoUsuario() {
        tipousuario = lnUsuario.findTipoUser(tipousuario.getIdtipoUsuario());
        usuarioaux.setTipoUsuario(tipousuario);
        lnUsuario.addUsuario(usuarioaux);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario creado con éxito", "El usuario ha sido creado exitosamente."));
        usuarioaux = new Usuario();
    }

    /**
     * Creates a new instance of AdUsuario
     */
    public AdUsuario() {
        usuario = new Usuario();
        usuarioaux = new Usuario();
        tipousuario = new TipoUsuario();
        medico = new Medico();
        departamento = new Departamento();
    }

}
