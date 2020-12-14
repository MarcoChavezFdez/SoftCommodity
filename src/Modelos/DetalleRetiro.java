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
 * La clase DetalleRetiro pertenece al paquete de Modelos tiene el proposito de
 * modelar la estructura de la tabla de DetalleRetiros asi como los metodos
 * necesarios para el manejo de datos que se intercambien entre las distintas
 * clases
 * @since VER1.0
 *
 */
package Modelos;

public class DetalleRetiro {

    //Propiedades de la clase
    private Integer IdRetiro;
    private Integer IdCorte;

    //Constructor de la clase como null
    public DetalleRetiro() {
    }

    //Constructor de la clase con todas sus propiedades
    public DetalleRetiro(Integer IdRetiro, Integer IdCorte) {
        this.IdRetiro = IdRetiro;
        this.IdCorte = IdCorte;
    }

    //Metodos Get y Set de la clase
    public Integer getIdRetiro() {
        return IdRetiro;
    }

    public void setIdRetiro(Integer IdRetiro) {
        this.IdRetiro = IdRetiro;
    }

    public Integer getIdCorte() {
        return IdCorte;
    }

    public void setIdCorte(Integer IdCorte) {
        this.IdCorte = IdCorte;
    }

}
