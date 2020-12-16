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
 * La clase Producto pertenece al paquete de Modelos tiene el proposito de
 * modelar la estructura de la tabla de Productos asi como los metodos
 * necesarios para el manejo de datos que se intercambien entre las distintas
 * clases
 * @since VER1.0
 *
 */
package Modelos;

public class Producto {

    private Integer IdProducto;
    private Integer IdCategoria;
    private String Nombre;
    private String Descripcion;
    private Float precioMayoreo;
    private Float precioMenudeo;
    private Float precioCompra;
    private String presentacion;
    private String EAN;
    private Integer Contenido;
    private String TipoContenido;
    private String Material;
    private Float Anchura;
    private String MedidaAnchura;
    private String Color;
    private String Estatus;

    public Producto(Integer IdProducto, Integer IdCategoria, String Nombre, String Descripcion, Float precioMayoreo, Float precioMenudeo, Float precioCompra, String presentacion, String EAN, Integer Contenido, String TipoContenido, String Material, Float Anchura, String MedidaAnchura, String Color, String Estatus) {
        this.IdProducto = IdProducto;
        this.IdCategoria = IdCategoria;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.precioMayoreo = precioMayoreo;
        this.precioMenudeo = precioMenudeo;
        this.precioCompra = precioCompra;
        this.presentacion = presentacion;
        this.EAN = EAN;
        this.Contenido = Contenido;
        this.TipoContenido = TipoContenido;
        this.Material = Material;
        this.Anchura = Anchura;
        this.MedidaAnchura = MedidaAnchura;
        this.Color = Color;
        this.Estatus = Estatus;
    }

    public Producto() {
        this.IdProducto = null;
        this.IdCategoria = null;
        this.Nombre = null;
        this.Descripcion = null;
        this.precioMayoreo = null;
        this.precioMenudeo = null;
        this.precioCompra = null;
        this.presentacion = null;
        this.EAN = null;
        this.Contenido = null;
        this.TipoContenido = null;
        this.Material = null;
        this.Anchura = null;
        this.MedidaAnchura = null;
        this.Color = null;
        this.Estatus = null;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Float getPrecioMayoreo() {
        return precioMayoreo;
    }

    public void setPrecioMayoreo(Float precioMayoreo) {
        this.precioMayoreo = precioMayoreo;
    }

    public Float getPrecioMenudeo() {
        return precioMenudeo;
    }

    public void setPrecioMenudeo(Float precioMenudeo) {
        this.precioMenudeo = precioMenudeo;
    }

    public Float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getEAN() {
        return EAN;
    }

    public void setEAN(String EAN) {
        this.EAN = EAN;
    }

    public Integer getContenido() {
        return Contenido;
    }

    public void setContenido(Integer Contenido) {
        this.Contenido = Contenido;
    }

    public String getTipoContenido() {
        return TipoContenido;
    }

    public void setTipoContenido(String TipoContenido) {
        this.TipoContenido = TipoContenido;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public Float getAnchura() {
        return Anchura;
    }

    public void setAnchura(Float Anchura) {
        this.Anchura = Anchura;
    }

    public String getMedidaAnchura() {
        return MedidaAnchura;
    }

    public void setMedidaAnchura(String MedidaAnchura) {
        this.MedidaAnchura = MedidaAnchura;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getEstatus() {
        return Estatus;
    }

    public void setEstatus(String Estatus) {
        this.Estatus = Estatus;
    }

    public Integer getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(Integer IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    public Integer getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(Integer IdProducto) {
        this.IdProducto = IdProducto;
    }
    

    @Override
    public String toString() {
        return IdProducto + " : " + Nombre + " " + Color + " " + Contenido + " " + TipoContenido + " " + Anchura + " " + MedidaAnchura;
    }
}
