package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.EstadoCita;
import modelo.Medico;
import modelo.Paciente;
import modelo.Pago;
import modelo.Servicios;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-06-01T12:12:15")
@StaticMetamodel(Cita.class)
public class Cita_ { 

    public static volatile SingularAttribute<Cita, Paciente> idPaciente;
    public static volatile SingularAttribute<Cita, Integer> idcita;
    public static volatile SingularAttribute<Cita, Date> fechaInicio;
    public static volatile SingularAttribute<Cita, EstadoCita> idEstadoCita;
    public static volatile SingularAttribute<Cita, Pago> idPago;
    public static volatile SingularAttribute<Cita, Date> fechaFinal;
    public static volatile SingularAttribute<Cita, Medico> idMedico;
    public static volatile SingularAttribute<Cita, Servicios> idServicio;

}