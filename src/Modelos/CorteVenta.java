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
public class CorteVenta {
    public Integer IdVenta;
    public Integer IdCorte;

    public CorteVenta() {
    }

    public CorteVenta(Integer IdVenta, Integer IdCorte) {
        this.IdVenta = IdVenta;
        this.IdCorte = IdCorte;
    }

    public Integer getIdVenta() {
        return IdVenta;
    }

    public void setIdVenta(Integer IdVenta) {
        this.IdVenta = IdVenta;
    }

    public Integer getIdCorte() {
        return IdCorte;
    }

    public void setIdCorte(Integer IdCorte) {
        this.IdCorte = IdCorte;
    }
    
    
}
