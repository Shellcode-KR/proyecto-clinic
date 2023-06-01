package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Medico;
import modelo.Servicios;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-06-01T12:12:15")
@StaticMetamodel(Departamento.class)
public class Departamento_ { 

    public static volatile ListAttribute<Departamento, Servicios> serviciosList;
    public static volatile SingularAttribute<Departamento, String> nombreDepartamento;
    public static volatile SingularAttribute<Departamento, Medico> medicoAcargo;
    public static volatile SingularAttribute<Departamento, Integer> iddepartamento;
    public static volatile ListAttribute<Departamento, Medico> medicoList;

}