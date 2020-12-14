/**
 *
 * @Autor  Marco Alberto Chávez Fernández
 * @Correo: mchavez297@accitesz.com
 *
 * @Autor José Carlos Esparza de Anda
 * @Correo: jesparza301@accitesz.com
 *
 * @Autor José Ángel Madrigal Plancarte
 * @Correo: jmadrigal323@accitesz.com
 *
 * @Docente: Dr. Francisco Rodríguez Díaz
 * @Asignatura: Ing. de Software
 * @Escuela: Instituto Tecnologico de Estudios Superiores de Zamora
 * @Semestre : 7
 * @Grupo: B
 * @Carrera: Ing. en Sistemas Computacionales
 *
 * La clase Venta pertenece al paquete de Modelos tiene el proposito de modelar
 * la estructura de la tabla de Ventas asi como los metodos necesarios para el
 * manejo de datos que se intercambien entre las distintas clases
 * @since VER1.0
 *
 */
package Modelos;

import java.sql.Date;

public class Venta {

    private Integer IdVenta;
    private java.sql.Date Fecha;
    private Float TotalVenta;

    //Constructor de la clase en null
    public Venta() {
    }

    //Constructor de la clase con todas sus propiedades
    public Venta(Integer IdVenta, Date FechaGeneracion, float TotalVenta) {
        this.IdVenta = IdVenta;
        this.Fecha = FechaGeneracion;
        this.TotalVenta = TotalVenta;
    }

    //Metodos Get Y Set de la clase
    public Integer getIdVenta() {
        return IdVenta;
    }

    public void setIdVenta(Integer IdVenta) {
        this.IdVenta = IdVenta;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public float getTotalVenta() {
        return TotalVenta;
    }

    public void setTotalVenta(float TotalVenta) {
        this.TotalVenta = TotalVenta;
    }

}
