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
public class DetalleRetiro {
    //Propiedades de la clase
    private Integer IdRetiro;
    private Integer IdCorte;

    //Constructor de la clase como null
    public DetalleRetiro() {
    }

    //Constructor de la clase con todas sus propiedades
    public DetalleRetiro(Integer IdRetiro, Integer IdCorte) {
        this.IdRetiro = IdRetiro;
        this.IdCorte = IdCorte;
    }

    //Metodos Get y Set de la clase
    public Integer getIdRetiro() {
        return IdRetiro;
    }

    public void setIdRetiro(Integer IdRetiro) {
        this.IdRetiro = IdRetiro;
    }

    public Integer getIdCorte() {
        return IdCorte;
    }

    public void setIdCorte(Integer IdCorte) {
        this.IdCorte = IdCorte;
    }
    
}
