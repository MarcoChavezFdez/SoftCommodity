/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Marco Chavez
 */
public class ReporteVenta {
    private Integer IdReporte;
    private Integer IdVenta;

    public ReporteVenta() {
    }

    public ReporteVenta(Integer IdReporte, Integer IdVenta) {
        this.IdReporte = IdReporte;
        this.IdVenta = IdVenta;
    }
    
}
