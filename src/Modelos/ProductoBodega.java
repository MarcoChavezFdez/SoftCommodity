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
 * La clase ProductoBodega pertenece al paquete de Modelos tiene el proposito de
 * modelar la estructura de la tabla de ProductosBodega asi como los metodos
 * necesarios para el manejo de datos que se intercambien entre las distintas
 * clases
 * @since VER1.0
 *
 */
package Modelos;

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
