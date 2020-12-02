/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Modelos.Producto;
import Modelos.Usuario;
import java.sql.*;
import java.util.ArrayList;

public class ConexionBD {

    private final String url = "jdbc:mysql://localhost/softcommodity";        //Creamos un string de tipo privado y final, esto quiere decir que no cambiara su valor
    //En este caso despues de la direccion "jdbc:mysql://localhost/" despues de localhost/ debemos escribit el nombre de la BD que queremos conectar
    PreparedStatement psPrepararSentencia;          //Creamos un objeto de tipo  PreparedStatement para los querys que queramos hacer a la BD
    Connection con = null;                 //Como aun no tenemos conexion, con sera objeto de tipo connection que apunte a null
    private Usuario user;

    //Dentro del constructor de la clase, intentaremos conectarnos usando un try-catch para agarrar las excepciones
    public ConexionBD() {
        try {   //Inicio del try

            Class.forName("com.mysql.jdbc.Driver");     //Con el metodo de la clase forName, le pasamos el driver de MySQL para que lo cargue    
            con = DriverManager.getConnection(url, "root", "");    //Apuntamos nuestro objeto con a el intento de conectarse con los parametros o las credenciales que tenemos en MYSQL
            //Aqui mandamos la url donde viene la direccion de la BD, nuestro nombre de usuario y la contraseña, que por defecto al instalar viene vacia
            if (con != null) {                         //Si logramos conectarnos, con deja de apuntar a null y obtenemos conexion
                System.out.println("Conexión a base de datos funcionando");                //Sin funciona imprimimos en consola un mensaje
            }
        }//cerramos el try
        catch (SQLException e) //Agarramos excepciones de tipo SQL
        {
            System.out.println(e);          //las mostramos en consola
        } catch (ClassNotFoundException e) //agarramos excepciones de tipo clase en java
        {
            System.out.println(e);               //las mostramos en consola
        }
    }

    /**
     *
     * @return
     */
    public Connection conectado() {  //Este metodo de tipo Connection nos devuelve el estado del objeto
        return con;
    }

    public void desconectar() {     //Por seguridad, cuando terminemos sentencias, cerramos la conexion o si la necesitamos cerrar por otro caso
        con = null;                  //Ahora de nuevo con sera null
        System.out.println("La conexion la BD se ha cerrado");

    }

    /**
     * *************************************************************
     *
     * Funciones para el modelo Producto
     *
     *************************************************************
     */
    //Funcion la cual permite realizar la consulta general y devolver un Array list de objetos Producto
    public ArrayList<Producto> consultaProductos() {
        String sql = "select idproducto,idcategoria,nombre,descripcion,preciomayoreo,preciomenudeo,preciocompra,presentacion,ean,contenido,tipocontenido,material,anchura,medidaanchura,color,estatus from productos";
        ArrayList<Producto> lista = new ArrayList<Producto>();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Producto s = new Producto();
                s.setIdProducto(rs.getInt("idproducto"));
                s.setIdCategoria(rs.getInt("idcategoria"));
                s.setNombre(rs.getString("nombre"));
                s.setDescripcion(rs.getString("descripcion"));
                s.setPrecioMayoreo(rs.getFloat("preciomayoreo"));
                s.setPrecioMenudeo(rs.getFloat("preciomenudeo"));
                s.setPrecioCompra(rs.getFloat("preciocompra"));
                s.setPresentacion(rs.getString("presentacion"));
                s.setEAN(rs.getString("ean"));
                s.setContenido(rs.getInt("contenido"));
                s.setTipoContenido(rs.getString("tipocontenido"));
                s.setMaterial(rs.getString("material"));
                s.setAnchura(rs.getFloat("anchura"));
                s.setMedidaAnchura(rs.getString("medidaanchura"));
                s.setColor(rs.getString("color"));
                s.setEstatus(rs.getString("estatus"));
                lista.add(s);
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return lista;
    }

    /**
     * *************************************************************
     *
     * Funciones para el modelo Usuario
     *
     * @param nombre
     * @param Passw
     * @return
     *
     *************************************************************
     */
    public boolean consultarUsuario(String nombre, String Passw) {
        String sql = "select idusuario,nombre,apellidopaterno,apellidomaterno,curp,direccion,telefono,email,rol,login,passw,estatus from usuarios where login=?";
        Usuario s = new Usuario();
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, nombre);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                s.setIdUsuario(rs.getInt("idusuario"));
                s.setNombre(rs.getString("nombre"));
                s.setApellidoPaterno(rs.getString("apellidopaterno"));
                s.setApellidoMaterno(rs.getString("apellidoMaterno"));
                s.setCURP(rs.getString("curp"));
                s.setDireccion(rs.getString("direccion"));
                s.setTelefono(rs.getString("telefono"));
                s.setEmail(rs.getString("email"));
                s.setRol(rs.getString("rol"));
                s.setLogin("login");
                s.setPassw(rs.getString("passw"));
                s.setEstatus(rs.getString("estatus"));
            }
            st.close();
            if (s.getPassw().equals(Passw)) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return false;
    }

    public Usuario consultarUsuario(String nombre) {
        String sql = "select idusuario,nombre,apellidopaterno,apellidomaterno,curp,direccion,telefono,email,rol,login,passw,estatus from usuarios where login=?";
        Usuario s = new Usuario();
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, nombre);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                s.setIdUsuario(rs.getInt("idusuario"));
                s.setNombre(rs.getString("nombre"));
                s.setApellidoPaterno(rs.getString("apellidopaterno"));
                s.setApellidoMaterno(rs.getString("apellidoMaterno"));
                s.setCURP(rs.getString("curp"));
                s.setDireccion(rs.getString("direccion"));
                s.setTelefono(rs.getString("telefono"));
                s.setEmail(rs.getString("email"));
                s.setRol(rs.getString("rol"));
                s.setLogin("login");
                s.setPassw(rs.getString("passw"));
                s.setEstatus(rs.getString("estatus"));
            }
            st.close();
            return s;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

}
