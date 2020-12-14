/**
 *
 * @Autor  Marco Alberto Chávez Fernández
 * @Correo: mchavez297@accitesz.com
 *
 * @Autor José Carlos Esparza de Anda
 * @Correo: jesparza301@accitesz.com
 *
 * @Autor José Ángel Madrigal Plancarte
 * @Correo: jmadrigal323@accitesz.com
 *
 * @Docente: Dr. Francisco Rodríguez Díaz
 * @Asignatura: Ing. de Software
 * @Escuela: Instituto Tecnologico de Estudios Superiores de Zamora
 * @Semestre : 7
 * @Grupo: B
 * @Carrera: Ing. en Sistemas Computacionales
 *
 * La clase Retiro pertenece al paquete de Modelos tiene el proposito de modelar
 * la estructura de la tabla de Retiros asi como los metodos necesarios para el
 * manejo de datos que se intercambien entre las distintas clases
 * @since VER1.0
 *
 */
package Modelos;

import java.sql.Date;
import java.sql.Time;

public class Retiro {

    ///Propiedades de la clase
    private Integer IdRetiro;
    private Integer IdUsuario;
    private Float Monto;
    private java.sql.Time Hora;
    private java.sql.Date Fecha;

    //Constructor de la clase coomo null
    public Retiro() {
    }

    //Constructor de la clase con todas las propiedades
    public Retiro(Integer IdRetiro, Integer IdUsuario, Float Monto, Time Hora,Date Fecha) {
        this.IdRetiro = IdRetiro;
        this.IdUsuario = IdUsuario;
        this.Monto = Monto;
        this.Hora = Hora;
        this.Fecha=Fecha;
    }

    public Integer getIdRetiro() {
        return IdRetiro;
    }

    public void setIdRetiro(Integer IdRetiro) {
        this.IdRetiro = IdRetiro;
    }

    public Integer getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(Integer IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public Float getMonto() {
        return Monto;
    }

    public void setMonto(Float Monto) {
        this.Monto = Monto;
    }

    public Time getHora() {
        return Hora;
    }

    public void setHora(Time Hora) {
        this.Hora = Hora;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
    
    

}
