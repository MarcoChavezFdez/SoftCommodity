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
 * La clase CorteVenta pertenece al paquete de Modelos tiene el proposito de modelar
 * la estructura de la tabla de CortesVentas asi como los metodos necesarios para el
 * manejo de datos que se intercambien entre las distintas clases
 * @since VER1.0
 **/
package Modelos;

public class CorteVenta {
    public Integer IdVenta;
    public Integer IdCorte;

    public CorteVenta() {
    }

    public CorteVenta(Integer IdVenta, Integer IdCorte) {
        this.IdVenta = IdVenta;
        this.IdCorte = IdCorte;
    }

    public Integer getIdVenta() {
        return IdVenta;
    }

    public void setIdVenta(Integer IdVenta) {
        this.IdVenta = IdVenta;
    }

    public Integer getIdCorte() {
        return IdCorte;
    }

    public void setIdCorte(Integer IdCorte) {
        this.IdCorte = IdCorte;
    }
    
    
}
