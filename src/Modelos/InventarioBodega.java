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
 * La clase InvenatioBodega pertenece al paquete de Modelos tiene el proposito
 * de modelar la estructura de la tabla de InventariosBodega asi como los
 * metodos necesarios para el manejo de datos que se intercambien entre las
 * distintas clases
 * @since VER1.0
 *
 */
package Modelos;

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
