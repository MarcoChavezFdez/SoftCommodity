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
public class Inventario {
    //Propiedades de la clase
    private Integer IdInventario;
    private java.sql.Date Fecha;
    private java.sql.Timestamp Hora;
    private Float Faltante;
    private Float TotalInventario;

    //Constructor de la clase como null
    public Inventario() {
    }

    //Constructor de la clase con todas sus propiedades
    public Inventario(Integer IdInventario, Date Fecha, Timestamp Hora, Float Faltante, Float TotalInventario) {
        this.IdInventario = IdInventario;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Faltante = Faltante;
        this.TotalInventario = TotalInventario;
    }

    
    //Metodos Get y Set de la clase
    public Integer getIdInventario() {
        return IdInventario;
    }

    public void setIdInventario(Integer IdInventario) {
        this.IdInventario = IdInventario;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Timestamp getHora() {
        return Hora;
    }

    public void setHora(Timestamp Hora) {
        this.Hora = Hora;
    }

    public Float getFaltante() {
        return Faltante;
    }

    public void setFaltante(Float Faltante) {
        this.Faltante = Faltante;
    }

    public Float getTotalInventario() {
        return TotalInventario;
    }

    public void setTotalInventario(Float TotalInventario) {
        this.TotalInventario = TotalInventario;
    }
    
    
}
