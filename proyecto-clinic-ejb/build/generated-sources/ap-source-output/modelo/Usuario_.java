package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Medico;
import modelo.TipoUsuario;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-06-02T03:35:57")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> usuario;
    public static volatile SingularAttribute<Usuario, String> contrasena;
    public static volatile SingularAttribute<Usuario, TipoUsuario> tipoUsuario;
    public static volatile SingularAttribute<Usuario, String> email;
    public static volatile SingularAttribute<Usuario, Integer> idusuario;
    public static volatile ListAttribute<Usuario, Medico> medicoList;

}