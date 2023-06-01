package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Cita;
import modelo.MetodoPago;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-06-01T12:12:15")
@StaticMetamodel(Pago.class)
public class Pago_ { 

    public static volatile SingularAttribute<Pago, MetodoPago> metodoPago;
    public static volatile SingularAttribute<Pago, String> estado;
    public static volatile SingularAttribute<Pago, Integer> idpago;
    public static volatile SingularAttribute<Pago, Integer> importe;
    public static volatile ListAttribute<Pago, Cita> citaList;

}