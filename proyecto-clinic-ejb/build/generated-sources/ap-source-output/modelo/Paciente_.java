package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Cita;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-06-01T20:37:10")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile SingularAttribute<Paciente, String> estado;
    public static volatile SingularAttribute<Paciente, String> apelllidoPaterno;
    public static volatile SingularAttribute<Paciente, Integer> codigoPostal;
    public static volatile SingularAttribute<Paciente, String> direccion;
    public static volatile SingularAttribute<Paciente, String> localidad;
    public static volatile SingularAttribute<Paciente, Integer> telefono;
    public static volatile SingularAttribute<Paciente, Integer> idpaciente;
    public static volatile SingularAttribute<Paciente, String> nombre;
    public static volatile ListAttribute<Paciente, Cita> citaList;
    public static volatile SingularAttribute<Paciente, String> apellidoMaterno;

}