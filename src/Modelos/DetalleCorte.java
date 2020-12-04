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
public class DetalleCorte {
    //Propiedades de la clase
    private Integer IdCorte;
    private Integer IdTicket;

    //Constructor de la clase como null
    public DetalleCorte() {
    }

    //Constructor de la clase con todas sus propiedades
    public DetalleCorte(Integer IdCorte, Integer IdTicket) {
        this.IdCorte = IdCorte;
        this.IdTicket = IdTicket;
    }

    //Metodos Get y Set de la clase
    public Integer getIdCorte() {
        return IdCorte;
    }

    public void setIdCorte(Integer IdCorte) {
        this.IdCorte = IdCorte;
    }

    public Integer getIdTicket() {
        return IdTicket;
    }

    public void setIdTicket(Integer IdTicket) {
        this.IdTicket = IdTicket;
    }
    
    
}
