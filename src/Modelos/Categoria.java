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

public class Categoria {

    //Propiedades de la clase
    public Integer IdCategoria;
    public String Nombre;

    //Constructor de la clase como null
    public Categoria() {
    }

    //Constructor de la clase con todas las propiedades
    /**
     * @param IdCategoria es el id con el que se inicializa la propiedad
     * idcategoria
     * @param Nombre es el nombre con el que se inicializa la propiedaad nombre
     *
     */
    public Categoria(Integer IdCategoria, String Nombre) {
        this.IdCategoria = IdCategoria;
        this.Nombre = Nombre;
    }

    //Metodos Get y Set de la clase
    
    //Get de IdCategoria
    /**
     * @return IdCategoria del objeto
     **/
    public Integer getIdCategoria() {
        return IdCategoria;
    }
    
    //Get set de IdCategoria
    /**
     * @param IdCategoria es el valor que sera cambiado a IdCategoria
     */
    public void setIdCategoria(Integer IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    /**
     * @return 
     **/
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

}
