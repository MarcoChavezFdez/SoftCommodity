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
import javax.swing.JOptionPane;

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
                Producto p = new Producto();
                p.setIdProducto(rs.getInt("idproducto"));
                p.setIdCategoria(rs.getInt("idcategoria"));
                p.setNombre(rs.getString("nombre"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setPrecioMayoreo(rs.getFloat("preciomayoreo"));
                p.setPrecioMenudeo(rs.getFloat("preciomenudeo"));
                p.setPrecioCompra(rs.getFloat("preciocompra"));
                p.setPresentacion(rs.getString("presentacion"));
                p.setEAN(rs.getString("ean"));
                p.setContenido(rs.getInt("contenido"));
                p.setTipoContenido(rs.getString("tipocontenido"));
                p.setMaterial(rs.getString("material"));
                p.setAnchura(rs.getFloat("anchura"));
                p.setMedidaAnchura(rs.getString("medidaanchura"));
                p.setColor(rs.getString("color"));
                p.setEstatus(rs.getString("estatus"));
                lista.add(p);
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return lista;
    }

    public boolean insertarProducto(Producto p) {
        String sql = "insert into productos values(default,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        boolean ban = false;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, p.getIdCategoria());
            st.setString(2,p.getNombre());
            st.setString(3,p.getDescripcion());
            st.setFloat(4,p.getPrecioMayoreo());
            st.setFloat(5,p.getPrecioMenudeo());
            st.setFloat(6, p.getPrecioCompra());
            st.setString(7, p.getPresentacion());
            st.setString(8, p.getEAN());
            st.setInt(9, p.getContenido());
            st.setString(10, p.getTipoContenido());
            st.setString(11,p.getMaterial());
            st.setFloat(12, p.getAnchura());
            st.setString(13,p.getMedidaAnchura());
            st.setString(14, p.getColor());
            st.setString(15,p.getEstatus());
            st.execute();
            st.close();
            ban = true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return ban;
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
        Usuario u = new Usuario();
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, nombre);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                u.setIdUsuario(rs.getInt("idusuario"));
                u.setNombre(rs.getString("nombre"));
                u.setApellidoPaterno(rs.getString("apellidopaterno"));
                u.setApellidoMaterno(rs.getString("apellidoMaterno"));
                u.setCURP(rs.getString("curp"));
                u.setDireccion(rs.getString("direccion"));
                u.setTelefono(rs.getString("telefono"));
                u.setEmail(rs.getString("email"));
                u.setRol(rs.getString("rol"));
                u.setLogin("login");
                u.setPassw(rs.getString("passw"));
                u.setEstatus(rs.getString("estatus"));
            }
            st.close();
            if (u.getPassw().equals(Passw)) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return false;
    }

    public Usuario consultarUsuario(String nombre) {
        String sql = "select idusuario,nombre,apellidopaterno,apellidomaterno,curp,direccion,telefono,email,rol,login,passw,estatus from usuarios where login=?";
        Usuario u = new Usuario();
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, nombre);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                u.setIdUsuario(rs.getInt("idusuario"));
                u.setNombre(rs.getString("nombre"));
                u.setApellidoPaterno(rs.getString("apellidopaterno"));
                u.setApellidoMaterno(rs.getString("apellidoMaterno"));
                u.setCURP(rs.getString("curp"));
                u.setDireccion(rs.getString("direccion"));
                u.setTelefono(rs.getString("telefono"));
                u.setEmail(rs.getString("email"));
                u.setRol(rs.getString("rol"));
                u.setLogin(rs.getString("login"));
                u.setPassw(rs.getString("passw"));
                u.setEstatus(rs.getString("estatus"));
            }
            st.close();
            return u;
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
