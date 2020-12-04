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
public class InventarioBodega {
    //Propiedades de la clase
    public Integer IdInventario;
    public Integer IdBodega;

    //Constructor de la clase como null
    public InventarioBodega() {
    }

    //Constructor de la clase con todas sus propiedades
    public InventarioBodega(Integer IdInventario, Integer IdBodega) {
        this.IdInventario = IdInventario;
        this.IdBodega = IdBodega;
    }

    //Metodos Get y Set de la clase;
    public Integer getIdInventario() {
        return IdInventario;
    }

    public void setIdInventario(Integer IdInventario) {
        this.IdInventario = IdInventario;
    }

    public Integer getIdBodega() {
        return IdBodega;
    }

    public void setIdBodega(Integer IdBodega) {
        this.IdBodega = IdBodega;
    }

}
