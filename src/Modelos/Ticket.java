/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Date;
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
    private java.sql.Timestamp HoraVenta;
    private Float SubTotal;
    private Float IVA;
    private Float Total;

    //Constructor de la clase como null
    public Ticket() {
    }
    
    //Constructor de la clase con todas sus propiedades
    public Ticket(Integer IdTicket, Integer IdUsuario, Date Fecha, Timestamp HoraVenta, Float SubTotal, Float IVA, Float Total) {
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

    public Timestamp getHoraVenta() {
        return HoraVenta;
    }

    public void setHoraVenta(Timestamp HoraVenta) {
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
