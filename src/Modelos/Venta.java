/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Date;

/**
 *
 * @author Marco Chavez
 */
public class Venta {
    private Integer IdVenta;
    private java.sql.Date FechaGeneracion;
    private Float TotalVenta;

    //Constructor de la clase en null
    public Venta() {
    }

    //Constructor de la clase con todas sus propiedades
    public Venta(Integer IdVenta, Date FechaGeneracion, float TotalVenta) {
        this.IdVenta = IdVenta;
        this.FechaGeneracion = FechaGeneracion;
        this.TotalVenta = TotalVenta;
    }

    //Metodos Get Y Set de la clase
    public Integer getIdVenta() {
        return IdVenta;
    }

    public void setIdVenta(Integer IdVenta) {
        this.IdVenta = IdVenta;
    }

    public Date getFechaGeneracion() {
        return FechaGeneracion;
    }

    public void setFechaGeneracion(Date FechaGeneracion) {
        this.FechaGeneracion = FechaGeneracion;
    }

    public float getTotalVenta() {
        return TotalVenta;
    }

    public void setTotalVenta(float TotalVenta) {
        this.TotalVenta = TotalVenta;
    }
    
}