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
 * La clase Inventario pertenece al paquete de Modelos tiene el proposito de
 * modelar la estructura de la tabla de Inventarios asi como los metodos
 * necesarios para el manejo de datos que se intercambien entre las distintas
 * clases
 * @since VER1.0
 *
 */
package Modelos;

import java.sql.Date;
import java.sql.Timestamp;

public class Inventario {

    //Propiedades de la clase
    private Integer IdInventario;
    private java.sql.Date Fecha;
    private java.sql.Timestamp Hora;
    private Float Faltante;
    private Float TotalInventario;

    //Constructor de la clase como null
    public Inventario() {
    }

    //Constructor de la clase con todas sus propiedades
    public Inventario(Integer IdInventario, Date Fecha, Timestamp Hora, Float Faltante, Float TotalInventario) {
        this.IdInventario = IdInventario;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Faltante = Faltante;
        this.TotalInventario = TotalInventario;
    }

    //Metodos Get y Set de la clase
    public Integer getIdInventario() {
        return IdInventario;
    }

    public void setIdInventario(Integer IdInventario) {
        this.IdInventario = IdInventario;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Timestamp getHora() {
        return Hora;
    }

    public void setHora(Timestamp Hora) {
        this.Hora = Hora;
    }

    public Float getFaltante() {
        return Faltante;
    }

    public void setFaltante(Float Faltante) {
        this.Faltante = Faltante;
    }

    public Float getTotalInventario() {
        return TotalInventario;
    }

    public void setTotalInventario(Float TotalInventario) {
        this.TotalInventario = TotalInventario;
    }

}
