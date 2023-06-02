/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author hack_
 */
@Entity
@Table(name = "tipo_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoUsuario.findAll", query = "SELECT t FROM TipoUsuario t"),
    @NamedQuery(name = "TipoUsuario.findByIdtipoUsuario", query = "SELECT t FROM TipoUsuario t WHERE t.idtipoUsuario = :idtipoUsuario"),
    @NamedQuery(name = "TipoUsuario.findByTipoUsuario", query = "SELECT t FROM TipoUsuario t WHERE t.tipoUsuario = :tipoUsuario")})
public class TipoUsuario implements Serializable {

    @Size(max = 45)
    @Column(name = "tipo_usuario")
    private String tipoUsuario;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipo_usuario")
    private Integer idtipoUsuario;
    @OneToMany(mappedBy = "tipoUsuario")
    private List<Usuario> usuarioList;

    public TipoUsuario() {
    }

    public TipoUsuario(Integer idtipoUsuario) {
        this.idtipoUsuario = idtipoUsuario;
    }

    public Integer getIdtipoUsuario() {
        return idtipoUsuario;
    }

    public void setIdtipoUsuario(Integer idtipoUsuario) {
        this.idtipoUsuario = idtipoUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoUsuario != null ? idtipoUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoUsuario)) {
            return false;
        }
        TipoUsuario other = (TipoUsuario) object;
        if ((this.idtipoUsuario == null && other.idtipoUsuario != null) || (this.idtipoUsuario != null && !this.idtipoUsuario.equals(other.idtipoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.TipoUsuario[ idtipoUsuario=" + idtipoUsuario + " ]";
    }

}
