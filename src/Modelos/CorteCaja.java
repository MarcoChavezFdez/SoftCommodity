/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.*;

/**
 *
 * @author Marco Chavez
 */
public class CorteCaja {
    private Integer IdCorte;
    private Integer IdUsuario;
    private Float FondoInicial;
    private Float TotalVenta;
    private Float TotalRetiros;
    private Float TotalCorte;
    private java.sql.Time HoraInicial;
    private java.sql.Time HoraFinal;
    private String Estatus;
    private java.sql.Date Fecha;

    //Constructor de la clase coomo null
    public CorteCaja() {
    }

    //Constructor de la clase con todas sus propiedades
    public CorteCaja(Integer IdCorte, Integer IdUsuario, Float FondoInicial, Float TotalVenta, Float TotalRetiros, Float TotalCorte, Time HoraInicial, Time HoraFinal, String Estatus, Date Fecha) {
        this.IdCorte = IdCorte;
        this.IdUsuario = IdUsuario;
        this.FondoInicial = FondoInicial;
        this.TotalVenta = TotalVenta;
        this.TotalRetiros = TotalRetiros;
        this.TotalCorte = TotalCorte;
        this.HoraInicial = HoraInicial;
        this.HoraFinal = HoraFinal;
        this.Estatus = Estatus;
        this.Fecha = Fecha;
    }

    
    //Metodos Get y Set de la clase    
    public Integer getIdCorte() {
        return IdCorte;
    }

    public void setIdCorte(Integer IdCorte) {
        this.IdCorte = IdCorte;
    }

    public Integer getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(Integer IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public Float getFondoInicial() {
        return FondoInicial;
    }

    public void setFondoInicial(Float FondoInicial) {
        this.FondoInicial = FondoInicial;
    }

    public Float getTotalVenta() {
        return TotalVenta;
    }

    public void setTotalVenta(Float TotalVenta) {
        this.TotalVenta = TotalVenta;
    }

    public Float getTotalRetiros() {
        return TotalRetiros;
    }

    public void setTotalRetiros(Float TotalRetiros) {
        this.TotalRetiros = TotalRetiros;
    }

    public Float getTotalCorte() {
        return TotalCorte;
    }

    public void setTotalCorte(Float TotalCorte) {
        this.TotalCorte = TotalCorte;
    }

    public Time getHoraInicial() {
        return HoraInicial;
    }

    public void setHoraInicial(Time HoraInicial) {
        this.HoraInicial = HoraInicial;
    }

    public Time getHoraFinal() {
        return HoraFinal;
    }

    public void setHoraFinal(Time HoraFinal) {
        this.HoraFinal = HoraFinal;
    }



    public String getEstatus() {
        return Estatus;
    }

    public void setEstatus(String Estatus) {
        this.Estatus = Estatus;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
    
}
