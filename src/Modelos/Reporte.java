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
public class Reporte {
    private Integer IdReportes;
    private java.sql.Date FechaInicial;
    private java.sql.Date FechaFinal;
    private Float TotalVentas;
    private java.sql.Date FechaGeneracion;
    private java.sql.Timestamp HoraGeneracion;

    public Integer getIdReportes() {
        return IdReportes;
    }

    public void setIdReportes(Integer IdReportes) {
        this.IdReportes = IdReportes;
    }

    public Date getFechaInicial() {
        return FechaInicial;
    }

    public void setFechaInicial(Date FechaInicial) {
        this.FechaInicial = FechaInicial;
    }

    public Date getFechaFinal() {
        return FechaFinal;
    }

    public void setFechaFinal(Date FechaFinal) {
        this.FechaFinal = FechaFinal;
    }

    public float getTotalVentas() {
        return TotalVentas;
    }

    public void setTotalVentas(float TotalVentas) {
        this.TotalVentas = TotalVentas;
    }

    public Date getFechaGeneracion() {
        return FechaGeneracion;
    }

    public void setFechaGeneracion(Date FechaGeneracion) {
        this.FechaGeneracion = FechaGeneracion;
    }

    public Timestamp getHoraGeneracion() {
        return HoraGeneracion;
    }

    public void setHoraGeneracion(Timestamp HoraGeneracion) {
        this.HoraGeneracion = HoraGeneracion;
    }

    public Reporte() {
    }

    public Reporte(Integer IdReportes, Date FechaInicial, Date FechaFinal, float TotalVentas, Date FechaGeneracion, Timestamp HoraGeneracion) {
        this.IdReportes = IdReportes;
        this.FechaInicial = FechaInicial;
        this.FechaFinal = FechaFinal;
        this.TotalVentas = TotalVentas;
        this.FechaGeneracion = FechaGeneracion;
        this.HoraGeneracion = HoraGeneracion;
    }
    
    
    
}
