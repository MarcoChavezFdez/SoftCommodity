/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Timestamp;

/**
 *
 * @author Marco Chavez
 */
public class Retiro {
    ///Propiedades de la clase
    private Integer IdRetiro;
    private Integer IdUsuario;
    private Float Monto;
    private java.sql.Timestamp Hora;

    //Constructor de la clase coomo null
    public Retiro() {
    }

    //Constructor de la clase con todas las propiedades
    public Retiro(Integer IdRetiro, Integer IdUsuario, Float Monto, Timestamp Hora) {
        this.IdRetiro = IdRetiro;
        this.IdUsuario = IdUsuario;
        this.Monto = Monto;
        this.Hora = Hora;
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

    public Timestamp getHora() {
        return Hora;
    }

    public void setHora(Timestamp Hora) {
        this.Hora = Hora;
    }
    
    
    
}
