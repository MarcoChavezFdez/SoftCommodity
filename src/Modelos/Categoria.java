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
public class Categoria {
    //Propiedades de la clase
    public Integer IdCategoria;
    public String Nombre;

    //Constructor de la clase como null
    public Categoria() {
    }

    //Constructor de la clase con todas las propiedades
    public Categoria(Integer IdCategoria, String Nombre) {
        this.IdCategoria = IdCategoria;
        this.Nombre = Nombre;
    }
    
    //Metodos Get y Set de la clase
    public Integer getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(Integer IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
}
