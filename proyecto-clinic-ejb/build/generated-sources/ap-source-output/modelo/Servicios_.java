package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Cita;
import modelo.Departamento;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-06-01T20:37:10")
@StaticMetamodel(Servicios.class)
public class Servicios_ { 

    public static volatile SingularAttribute<Servicios, String> servicio;
    public static volatile SingularAttribute<Servicios, Integer> costo;
    public static volatile SingularAttribute<Servicios, Integer> idservicios;
    public static volatile SingularAttribute<Servicios, Departamento> departamento;
    public static volatile ListAttribute<Servicios, Cita> citaList;

}