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
public class Bodegas {
    //Propiedades de la clase
    private Integer IdBodega;
    private String Nombre;

    //Constructor de la clase como null
    public Bodegas() {
    }

    //Constructor de la clase con todas sus propiedades
    public Bodegas(Integer IdBodega, String Nombre) {
        this.IdBodega = IdBodega;
        this.Nombre = Nombre;
    }

    //Metodos Get y Set de la clase
    public Integer getIdBodega() {
        return IdBodega;
    }

    public void setIdBodega(Integer IdBodega) {
        this.IdBodega = IdBodega;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
}
