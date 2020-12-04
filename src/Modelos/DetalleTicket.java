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
public class DetalleTicket {
    //Propiedades de la clase
    private Integer IdTicket;
    private Integer IdProducto;
    private Integer Cantidad;
    private Float PrecioUnitario;
    private Float SubTotal;
    private Boolean PrecioMayorista;

    //Constructor de la clase como null
    public DetalleTicket() {
    }

    //Constructor de la clase con todas las propiedades
    public DetalleTicket(Integer IdTicket, Integer IdProducto, Integer Cantidad, Float PrecioUnitario, Float SubTotal, Boolean PrecioMayorista) {
        this.IdTicket = IdTicket;
        this.IdProducto = IdProducto;
        this.Cantidad = Cantidad;
        this.PrecioUnitario = PrecioUnitario;
        this.SubTotal = SubTotal;
        this.PrecioMayorista = PrecioMayorista;
    }

    //Metodo para calcular el subTotal
    public void calculaSubTotal() {
        Integer cantidad = this.getCantidad();
        Float precioUnitario = this.getPrecioUnitario();
        Float subTotal;
        SubTotal = cantidad * precioUnitario;
        this.setSubTotal(SubTotal);
    }

    //Metodos Get y Set de la clase
    public Integer getIdTicket() {
        return IdTicket;
    }

    public void setIdTicket(Integer IdTicket) {
        this.IdTicket = IdTicket;
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

    public Float getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(Float PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public Float getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(Float SubTotal) {
        this.SubTotal = SubTotal;
    }

    public Boolean getPrecioMayorista() {
        return PrecioMayorista;
    }

    public void setPrecioMayorista(Boolean PrecioMayorista) {
        this.PrecioMayorista = PrecioMayorista;
    }

}
