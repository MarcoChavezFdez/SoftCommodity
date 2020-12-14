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
 * La clase Usuario pertenece al paquete de Modelos tiene el proposito de
 * modelar la estructura de la tabla de Usuarios asi como los metodos necesarios
 * para el manejo de datos que se intercambien entre las distintas clases
 * @since VER1.0
 *
 */
package Modelos;

public class Usuario {

    private Integer IdUsuario;
    private String Nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private String CURP;
    private String Direccion;
    private String Telefono;
    private String Email;
    private String Rol;
    private String Login;
    private String Passw;
    private String Estatus;

    public Integer getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(Integer IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getPassw() {
        return Passw;
    }

    public void setPassw(String Passw) {
        this.Passw = Passw;
    }

    public String getEstatus() {
        return Estatus;
    }

    public void setEstatus(String Estatus) {
        this.Estatus = Estatus;
    }

    public Usuario(Integer IdUsuario, String Nombre, String ApellidoPaterno, String ApellidoMaterno, String CURP, String Direccion, String Telefono, String Email, String Rol, String Login, String Passw, String Estatus) {
        this.IdUsuario = IdUsuario;
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.CURP = CURP;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Email = Email;
        this.Rol = Rol;
        this.Login = Login;
        this.Passw = Passw;
        this.Estatus = Estatus;
    }

    public Usuario() {
        this.IdUsuario = null;
        this.Nombre = null;
        this.ApellidoPaterno = null;
        this.ApellidoMaterno = null;
        this.CURP = null;
        this.Direccion = null;
        this.Telefono = null;
        this.Email = null;
        this.Rol = null;
        this.Login = null;
        this.Passw = null;
        this.Estatus = null;
    }

}
