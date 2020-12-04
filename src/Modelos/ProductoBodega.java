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
public class ProductoBodega {
    //Propiedades de la clase
    private Integer IdBodega;
    private Integer IdProducto;
    private Integer Cantidad;

    //Constructor de la clase como null
    public ProductoBodega() {
    }

    //Constructro de la clase con todas las propiedades
    public ProductoBodega(Integer IdBodega, Integer IdProducto, Integer Cantidad) {
        this.IdBodega = IdBodega;
        this.IdProducto = IdProducto;
        this.Cantidad = Cantidad;
    }

    //Metodos Get y Set de la clase
    public Integer getIdBodega() {
        return IdBodega;
    }

    public void setIdBodega(Integer IdBodega) {
        this.IdBodega = IdBodega;
    }

    public Integer getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(Integer IdProducto) {
        this.IdProducto = IdProducto;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    
    
}
