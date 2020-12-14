/**
 *
 * @Autor1  Marco Alberto Chávez Fernández
 * @Correo: mchavez297@accitesz.com
 *
 * @Autor2 José Carlos Esparza de Anda
 * @Correo: jesparza301@accitesz.com
 *
 * @Autor3 José Ángel Madrigal Plancarte
 * @Correo: jmadrigal323@accitesz.com
 *
 * @Docente: Dr. Francisco Rodríguez Díaz
 * @Asignatura: Ing. de Software
 * @Escuela: Instituto Tecnologico de Estudios Superiores de Zamora
 * @Semestre : 7
 * @Grupo: B
 * @Carrera: Ing. en Sistemas Computacionales
 *
 * La clase Bodega pertenece al paquete de Modelos tiene el proposito de modelar
 * la estructura de la tabla de Bodegas asi como los metodos necesarios para el
 * manejo de datos que se intercambien entre las distintas clases
 * @since VER1.0
 */
package Modelos;

public class Bodega {

    //Propiedades de la clase
    private Integer IdBodega;
    private String Nombre;

    //Constructor de la clase como null
    public Bodega() {
    }

    /**
     * 
     * @param IdBodega es el id con el que se inicializa la bodega
     * @param Nombre es cel nombre con el que se inicializa la bodega
     */
    //Constructor de la clase con todas sus propiedades
    public Bodega(Integer IdBodega, String Nombre) {
        this.IdBodega = IdBodega;
        this.Nombre = Nombre;
    }

    //Metodos Get y Set de la clase
    /**
     * @return Regresa el idBodega del obejeto
     *
     */
    public Integer getIdBodega() {
        return IdBodega;
    }

    public void setIdBodega(Integer IdBodega) {
        this.IdBodega = IdBodega;
    }

    /**
     * @return Regresa el nombre del obejeto
     *
     */
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
