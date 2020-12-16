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
 * La clase ReporteVenta pertenece al paquete de Modelos tiene el proposito de
 * modelar la estructura de la tabla de ReporteVenta asi como los metodos
 * necesarios para el manejo de datos que se intercambien entre las distintas
 * clases
 * @since VER 1.0
 *
 */
package Modelos;

/**
 *
 * @author Marco Chavez
 */
public class ReporteVenta {

    private Integer IdReporte;
    private Integer IdVenta;

    public ReporteVenta() {
    }

    public ReporteVenta(Integer IdReporte, Integer IdVenta) {
        this.IdReporte = IdReporte;
        this.IdVenta = IdVenta;
    }

    public Integer getIdReporte() {
        return IdReporte;
    }

    public void setIdReporte(Integer IdReporte) {
        this.IdReporte = IdReporte;
    }

    public Integer getIdVenta() {
        return IdVenta;
    }

    public void setIdVenta(Integer IdVenta) {
        this.IdVenta = IdVenta;
    }
    
    

}
