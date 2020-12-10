/**
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
 * 
 * @since   VER1.0
 */
package Modelos;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 *
 * @author Marco Chavez
 */
public class Ticket {
    //Propiedades de la clase
    private Integer IdTicket;
    private Integer IdUsuario;
    private java.sql.Date Fecha;
    private java.sql.Time HoraVenta;
    private Float SubTotal;
    private Float IVA;
    private Float Total;

    //Constructor de la clase como null
    public Ticket() {
    }
    
    //Constructor de la clase con todas sus propiedades
    public Ticket(Integer IdTicket, Integer IdUsuario, Date Fecha, Time HoraVenta, Float SubTotal, Float IVA, Float Total) {
        this.IdTicket = IdTicket;
        this.IdUsuario = IdUsuario;
        this.Fecha = Fecha;
        this.HoraVenta = HoraVenta;
        this.SubTotal = SubTotal;
        this.IVA = IVA;
        this.Total = Total;
    }
    
    //Metodos Get Y Set de la Clase
    public Integer getIdTicket() {
        return IdTicket;
    }

    public void setIdTicket(Integer IdTicket) {
        this.IdTicket = IdTicket;
    }

    public Integer getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(Integer IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Time getHoraVenta() {
        return HoraVenta;
    }

    public void setHoraVenta(Time HoraVenta) {
        this.HoraVenta = HoraVenta;
    }

    public Float getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(Float SubTotal) {
        this.SubTotal = SubTotal;
    }

    public Float getIVA() {
        return IVA;
    }

    public void setIVA(Float IVA) {
        this.IVA = IVA;
    }

    public Float getTotal() {
        return Total;
    }

    public void setTotal(Float Total) {
        this.Total = Total;
    }
    
    
    
}
