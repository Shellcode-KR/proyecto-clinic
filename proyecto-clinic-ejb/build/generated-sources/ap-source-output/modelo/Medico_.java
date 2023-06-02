package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Cita;
import modelo.Departamento;
import modelo.Usuario;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-06-01T20:37:10")
@StaticMetamodel(Medico.class)
public class Medico_ { 

    public static volatile SingularAttribute<Medico, String> apellidoPaterno;
    public static volatile SingularAttribute<Medico, Departamento> idDepartamento;
    public static volatile ListAttribute<Medico, Departamento> departamentoList;
    public static volatile SingularAttribute<Medico, String> cedula;
    public static volatile SingularAttribute<Medico, Usuario> idUsuario;
    public static volatile SingularAttribute<Medico, Integer> telefono;
    public static volatile SingularAttribute<Medico, String> nombre;
    public static volatile SingularAttribute<Medico, Integer> idmedico;
    public static volatile ListAttribute<Medico, Cita> citaList;
    public static volatile SingularAttribute<Medico, String> apellidoMaterno;

}