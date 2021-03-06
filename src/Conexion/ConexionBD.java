/**
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
 * La clase ConexionBD contiene todas las propiedades y metodos para interactuar
 * con la Base de Datos SoftCommodity bajo MySQL 5.0 y en una infraestructura
 * local
 * @since VER1.0
 */
package Conexion;

import Modelos.Bodega;
import Modelos.Categoria;
import Modelos.CorteCaja;
import Modelos.CorteVenta;
import Modelos.DetalleCorte;
import Modelos.DetalleRetiro;
import Modelos.DetalleTicket;
import Modelos.Producto;
import Modelos.Retiro;
import Modelos.Ticket;
import Modelos.Usuario;
import Modelos.Venta;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConexionBD {

    //Creamos un string de tipo privado y final, esto quiere decir que no cambiara su valor
    private final String url = "jdbc:mysql://localhost/softcommodity";

    //Creamos un objeto de tipo  PreparedStatement para los querys que queramos hacer a la BD
    Connection con = null;
    private Usuario user;

    //Dentro del constructor de la clase, intentaremos conectarnos usando un try-catch para agarrar las excepciones
    public ConexionBD() {
        try {
            //Con el metodo de la clase forName, le pasamos el driver de MySQL para que lo cargue  
            Class.forName("com.mysql.jdbc.Driver");
            //Apuntamos nuestro objeto con a el intento de conectarse con los parametros o las credenciales que tenemos en MYSQL
            con = DriverManager.getConnection(url, "root", "");

            //Si logramos conectarnos, con deja de apuntar a null y obtenemos conexion
            if (con != null) {
                //Si funciona imprimimos en consola un mensaje

            } else {

            }
        } //Agarramos excepciones de tipo SQL
        catch (SQLException e) {
            //las mostramos en consola
            JOptionPane.showMessageDialog(null, "MYSQL NO ACTIVO, SE CERRARA LA APLICACION.");

            System.exit(0);
            //agarramos excepciones de tipo clase en java
        } catch (ClassNotFoundException e) {
            //las mostramos en consola

        }
    }

    /**
     * Funciones de la clase
     */
    /**
     * Funcion que permite establecer el usuario de la propiedad @user de la
     * clase
     *
     * @param user es el valor que sera cambiado a la propiedad user del objeto
     */
    public void setUser(Usuario user) {
        this.user = user;
    }

    /**
     * Funcion que permite obtener un Objeto Usuario de la propiedad @user de la
     * clase clase
     *
     * @return regresa el Usuario de la propiedad user del objeto
     */
    public Usuario getUser() {
        return user;
    }

    /**
     * Este metodo de tipo Connection nos devuelve el estado del objeto
     *
     * @return regresa el Usuario de la propiedad user del objeto
     */
    public Connection conectado() {
        return con;
    }

    public boolean isClosed() throws SQLException {
        return con.isClosed();
    }

    /**
     * Este metodo de cerra la conexion
     *
     */
    public void desconectar() {
        //Ahora de nuevo con sera null
        con = null;
    }

    /**
     * Modelo de Producto
     *
     * *************************************************************
     *
     * Funciones para el modelo Producto. Esta seccion contiente todos los
     * metodos necesarios para interactuar con la tabla de Productos
     *
     *************************************************************
     */
    /**
     * *****
     * Esta Funcion permite realizar la consulta general de la tabla Productos
     *
     * @return regresa un ArrayList de tipo Producto con los productos generados
     */
    public ArrayList<Producto> consultaProductos() {
        String sql = "select * "
                + "from productos"
                + " ORDER BY idproducto ASC";
        ArrayList<Producto> lista = new ArrayList<>();
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

    /**
     * Funcion la cual permite realizar la consulta de los primeros 25 productos
     * de la tabla Productos de la Base de Datos No recibe parametros
     *
     * @return Devuelve un ArrayList de objetos Producto
     *
     **
     */
    public ArrayList<Producto> consultaProductosLimitado() {
        String sql = "select * "
                + "from productos "
                + "order by nombre "
                + "limit 25";
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

    /**
     * Funcion la cual permite realizar la consulta de los primeros 25 productos
     * de la tabla Productos de la Base de Datos No recibe parametros
     *
     * @param Nombre es el parametro para realizar la busqueda
     * @return Devuelve un ArrayList de objetos Producto
     *
     **
     */
    public ArrayList<Producto> consultaProductosLimitadoPorNombre(String Nombre) {
        String sql = "select * "
                + "from productos "
                + "where nombre like CONCAT( '%" + Nombre + "%')";
        ArrayList<Producto> lista = new ArrayList<>();

        try {
            PreparedStatement st = con.prepareStatement(sql);
            System.out.println(sql);
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

    /**
     * Funcion la cual permite realizar la consulta de un producto de la tabla
     * Productos de la Base de Datos
     *
     * @param idProducto es el idProducto del producto a buscar
     * @return Devuelve un objeto Producto generado de la busquedad
     *
     **
     */
    public Producto consultaProducto(int idProducto) {
        String sql = (" select * "
                + " from productos "
                + " where idproducto=" + idProducto);
        Producto p = new Producto();
        try {
            PreparedStatement st = con.prepareStatement(sql);

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
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
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return p;
    }

    /**
     * Funcion la cual permite realizar la insercion de un producto en la tabla
     * de Productos de la Base de Datos
     *
     * @param p es el Objeto Producto que se desea insertar
     * @return Devuelve si fue exitosa la consulta
     */
    public boolean insertarProducto(Producto p) {
        String sql = "insert into productos values(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        boolean ban = false;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, p.getIdCategoria());
            st.setString(2, p.getNombre());
            st.setString(3, p.getDescripcion());
            st.setFloat(4, p.getPrecioMayoreo());
            st.setFloat(5, p.getPrecioMenudeo());
            st.setFloat(6, p.getPrecioCompra());
            st.setString(7, p.getPresentacion());
            st.setString(8, p.getEAN());
            st.setInt(9, p.getContenido());
            st.setString(10, p.getTipoContenido());
            st.setString(11, p.getMaterial());
            st.setFloat(12, p.getAnchura());
            st.setString(13, p.getMedidaAnchura());
            st.setString(14, p.getColor());
            st.setString(15, p.getEstatus());
            st.execute();
            st.close();
            ban = true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return ban;
    }

    /**
     * Funcion la cual permite realizar la acutalizacion de un producto de la
     * tabla Productos de la Base de Datos
     *
     * @param p es el Producto que se desea actualzar
     * @return Devuelve si fue exitosa la actualzacion
     *
     **
     */
    public boolean actualizarProducto(Producto p) {
        String sql = "update productos set idcategoria=?, nombre=?, descripcion=?, preciomayoreo=? ,preciomenudeo=?,"
                + " preciocompra=?, presentacion=?, EAN=?, contenido=?, tipocontenido=?, material=?, anchura=?,"
                + " medidaanchura=?, color=?, estatus=?  "
                + "where idProducto=?";
        boolean ban = false;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(16, p.getIdProducto());
            st.setInt(1, p.getIdCategoria());
            st.setString(2, p.getNombre());
            st.setString(3, p.getDescripcion());
            st.setFloat(4, p.getPrecioMayoreo());
            st.setFloat(5, p.getPrecioMenudeo());
            st.setFloat(6, p.getPrecioCompra());
            st.setString(7, p.getPresentacion());
            st.setString(8, p.getEAN());
            st.setInt(9, p.getContenido());
            st.setString(10, p.getTipoContenido());
            st.setString(11, p.getMaterial());
            st.setFloat(12, p.getAnchura());
            st.setString(13, p.getMedidaAnchura());
            st.setString(14, p.getColor());
            st.setString(15, p.getEstatus());
            st.execute();
            st.close();
            ban = true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error actualizando:" + e.getMessage());
        }
        return ban;
    }

    /**
     * Modelo de Usuario
     *
     * *************************************************************
     *
     * Funciones para el modelo Usuario. Esta seccion contiente todos los
     * metodos necesarios para interactuar con la tabla de Usuarios
     *
     *************************************************************
     */
    /**
     * Funcion la cual permite realizar la consulta de un usuario con cierto
     * login en la tabla de usuarios
     *
     * @param nombre es el nombre del login que se desea buscar
     * @return Devuelve un objeto Usuario de la busqueda realizada
     *
     **
     */
    public Usuario consultarUsuarioLogin(String nombre) {
        String sql = "select * "
                + "from usuarios "
                + "where login=?";
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
            rs.close();
            st.close();
            return u;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }

    /**
     * Funcion la cual permite realizar la consulta de un usuario con cierto
     * login en la tabla de usuarios
     *
     * @param IdUsuario es el id del usuario que se desea buscar
     * @return Devuelve un objeto Usuario de la busqueda realizada
     *
     **
     */
    public Usuario consultaUsuario(Integer IdUsuario) {
        String sql = "select * "
                + "from usuarios "
                + "where idusuario=?";
        Usuario u = new Usuario();
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, IdUsuario);
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
            rs.close();
            st.close();
            return u;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }

    /**
     * Funcion la cual permite verificar si existe un usuario con cierto login
     * en la tabla de usuarios
     *
     * @param nombre es el nombre del login que se desea buscar
     * @return Devuelve si encontro el usuario con el login
     *
     **
     */
    public boolean consultarUsuarioLoginRegistro(String nombre) {
        String sql = "select * "
                + "from usuarios "
                + "where login=?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, nombre);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                rs.close();
                st.close();
                return true;

            } else {
                rs.close();
                st.close();
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return false;
    }

    /**
     * Funcion la cual permite verificar si existe un usuario con cierto login
     * en la tabla de usuarios
     *
     * @param nombre es el nombre del login que se desea buscar
     * @param passw es la contraseña del usaurio
     * @return Devuelve si encontro el usuario con el login y password
     *
     **
     */
    public boolean consultarUsuarioAutorizado(String nombre, String passw) {
        String sql = "select * "
                + "from usuarios "
                + "where login=? and passw=? and rol='A' ";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, nombre);
            st.setString(2, passw);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return true;
            }
            rs.close();
            st.close();

        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return false;
    }

    /**
     * Funcion la cual permite realizar la consulta general de la tabla de
     * usuarios
     *
     *
     * @return Devuelve un ArrayList tipo Usuario con los registros de la tabla
     * Usuarios
     *
     **
     */
    public ArrayList<Usuario> consultarUsuarios() {
        String sql = "select * "
                + "from usuarios";
        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Usuario u = new Usuario();
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
                lista.add(u);
            }
            rs.close();
            st.close();
            return lista;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }

    /**
     * Funcion la cual permite realizar la consulta por patron en la columna de
     * nombre de la tabla de usuarios
     *
     *
     * @return Devuelve un ArrayList tipo Usuario con los registros de la tabla
     * Usuarios que tienen el patron nombre en la columna nombre
     *
     **
     */
    public ArrayList<Usuario> consultarUsuariosPorNombre(String Nombre) {
        String sql = "select * "
                + "from Usuarios "
                + "where nombre like CONCAT( '%" + Nombre + "%')";
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Usuario u = new Usuario();
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
                lista.add(u);
            }
            rs.close();
            st.close();
            return lista;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }

    /**
     * Funcion la cual permite realizar la consulta por patron en la columna de
     * id de la tabla de usuarios
     *
     *
     * @return Devuelve un ArrayList tipo Usuario con los registros de la tabla
     * Usuarios que tienen el patron IdUsuario en la columna id
     *
     **
     */
    public ArrayList<Usuario> consultarUsuariosPorId(String IdUsuario) {
        String sql = "select * "
                + "from Usuarios "
                + "where idusuario like CONCAT( '%" + IdUsuario + "%')";
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Usuario u = new Usuario();
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
                lista.add(u);
            }
            rs.close();
            st.close();
            return lista;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }
    /**
     * Funcion la cual permite realizar la consulta por patron en la columna de
     * login de la tabla de usuarios
     *
     *
     * @return Devuelve un ArrayList tipo Usuario con los registros de la tabla
     * Usuarios que tienen el patron nombre en la columna login
     *
     **
     */
    public ArrayList<Usuario> consultarUsuariosPorLogin(String Login) {
        String sql = "select * "
                + "from Usuarios "
                + "where login like CONCAT( '%" + Login + "%')";
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Usuario u = new Usuario();
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
                lista.add(u);
            }
            rs.close();
            st.close();
            return lista;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }
    /**
     * Funcion la cual permite insertar un nuevo usuario en la tabla de usuarios
     *
     * @param u es el objeto Usuario que se desea insertar en la tabla de
     * usuarios
     * @return Devuelve si fue exitosa la insercion
     *
     **
     */
    public boolean insertarUsuario(Usuario u) {
        String sql = "insert into usuarios values(null,?,?,?,?,?,?,?,?,?,?,?)";
        boolean ban = false;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, u.getNombre());
            st.setString(2, u.getApellidoPaterno());
            st.setString(3, u.getApellidoMaterno());
            st.setString(4, u.getCURP());
            st.setString(5, u.getDireccion());
            st.setString(6, u.getTelefono());
            st.setString(7, u.getEmail());
            st.setString(8, u.getRol());
            st.setString(9, u.getLogin());
            st.setString(10, u.getPassw());
            st.setString(11, u.getEstatus());
            st.execute();
            st.close();
            ban = true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return ban;
    }

    public boolean actualizarUsuario(Usuario u) {
        String sql = "update usuarios set nombre=? , ApellidoPaterno=? , ApellidoMaterno=?, "
                + " curp=?, Direccion=?, Telefono=? , email=? ,rol=? , login=? , "
                + " passw=? , estatus=? "
                + "where idusuario=?";
        boolean ban = false;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, u.getNombre());
            st.setString(2, u.getApellidoPaterno());
            st.setString(3, u.getApellidoMaterno());
            st.setString(4, u.getCURP());
            st.setString(5, u.getDireccion());
            st.setString(6, u.getTelefono());
            st.setString(7, u.getEmail());
            st.setString(8, u.getRol());
            st.setString(9, u.getLogin());
            st.setString(10, u.getPassw());
            st.setString(11, u.getEstatus());
            st.setInt(12, u.getIdUsuario());
            st.execute();
            st.close();
            ban = true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return ban;
    }

    /**
     * Modelo de Categoria
     *
     * *************************************************************
     *
     * Funciones para el modelo Categoria Esta seccion contiente todos los
     * metodos necesarios para interactuar con la tabla de Categorias
     *
     *************************************************************
     */
    /**
     * Funcion la cual permite realizar la consulta general de la tabla de
     * CAtegorias
     *
     *
     * @return Devuelve un ArrayList tipo Categoria con los registros de la
     * tabla Categorias
     *
     **
     */
    public ArrayList<Categoria> consultarCategorias() {
        String sql = "select idcategoria,nombre from categorias";
        ArrayList<Categoria> lista = new ArrayList<Categoria>();

        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Categoria c = new Categoria();
                c.setIdCategoria(rs.getInt("idcategoria"));
                c.setNombre(rs.getString("nombre"));
                lista.add(c);
            }
            rs.close();
            st.close();
            return lista;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }

    /**
     * Funcion la cual permite realizar la consulta de las categorias que tienen
     * el patron proporcionado en el campo nombre
     *
     * de la tabla Productos de la Base de Datos No recibe parametros
     *
     * @param Nombre es el parametro para realizar la busqueda
     * @return Devuelve un ArrayList de objetos Categoria
     *
     **
     */
    public ArrayList<Categoria> consultaCategoriasPorNombre(String Nombre) {
        String sql = "select * "
                + "from categorias "
                + "where nombre like CONCAT( '%" + Nombre + "%')";
        ArrayList<Categoria> lista = new ArrayList<>();

        try {
            PreparedStatement st = con.prepareStatement(sql);
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Categoria c = new Categoria();
                c.setIdCategoria(rs.getInt("idcategoria"));
                c.setNombre(rs.getString("nombre"));
                lista.add(c);
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return lista;
    }

    /**
     * Funcion la cual permite realizar la consulta de las categorias que tienen
     * el patron proporcionado en el campo nombre
     *
     * de la tabla Productos de la Base de Datos No recibe parametros
     *
     * @param Nombre es el parametro para realizar la busqueda
     * @return Devuelve un ArrayList de objetos Categoria
     *
     **
     */
    public ArrayList<Categoria> consultaCategoriasPorId(String Nombre) {
        String sql = "select * "
                + "from categorias "
                + "where idcategoria like CONCAT( '%" + Nombre + "%')";
        ArrayList<Categoria> lista = new ArrayList<>();

        try {
            PreparedStatement st = con.prepareStatement(sql);
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Categoria c = new Categoria();
                c.setIdCategoria(rs.getInt("idcategoria"));
                c.setNombre(rs.getString("nombre"));
                lista.add(c);
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return lista;
    }

    /**
     * Funcion la cual permite realizar la consulta por nombre de la tabla de
     * Categorias
     *
     *
     * @return Devuelve un ArrayList tipo Categoria con los registros ordenas
     * por nombre de la tabla Categorias
     *
     **
     */
    public ArrayList<Categoria> consultarCategoriasOrdenadasNombre() {
        String sql = "select * from categorias order by nombre asc";
        ArrayList<Categoria> lista = new ArrayList<Categoria>();

        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Categoria c = new Categoria();
                c.setIdCategoria(rs.getInt("idcategoria"));
                c.setNombre(rs.getString("nombre"));
                lista.add(c);
            }
            rs.close();
            st.close();
            return lista;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }

    public Categoria consultarCategoriasPorNombre(String nombre) {
        String sql = "select idcategoria,nombre from categorias where nombre=? order by nombre asc";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, nombre);
            ResultSet rs = st.executeQuery();
            Categoria c = new Categoria();
            if (rs.next()) {
                c.setIdCategoria(rs.getInt("idcategoria"));
                c.setNombre(rs.getString("nombre"));
            }
            rs.close();
            st.close();
            return c;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }

    /**
     * Esta Funcion permite realizar la consulta de una bodega mediante el
     * IdBodega de la tabla de bodegas
     *
     * @param IdCategoria es el id con el que buscara la bodega
     * @return regresa el objeto bodega encontrado
     *
     */
    public Categoria consultarCategoria(Integer IdCategoria) {
        String sql = "select * "
                + "from categorias "
                + "where idcategoria=?";
        Categoria c = new Categoria();
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, IdCategoria);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                c.setIdCategoria(rs.getInt("idcategoria"));
                c.setNombre(rs.getString("nombre"));
            }
            rs.close();
            st.close();
            return c;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return c;
    }

    public boolean insertarCategoria(Categoria c) {
        String sql = "insert into categorias values(null,?)";
        boolean ban = false;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, c.getNombre());
            st.execute();
            st.close();
            ban = true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return ban;
    }

    public boolean consultarCategoriaRegistrada(String nombre) {
        String sql = "select idcategoria, nombre from categorias where nombre=?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, nombre);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                rs.close();
                st.close();
                return true;

            } else {
                rs.close();
                st.close();
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return false;
    }

    /**
     * Esta Funcion permite actualizar una categoria con el idPropocionado
     *
     * @param c es la categoria que se desea modificar
     * @return regresa si la operacion fue exitosa
     *
     */
    public boolean actualizarCategoria(Categoria c) {
        String sql = "update categorias set nombre=? where idcategoria=?";
        boolean ban = false;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, c.getNombre());
            st.setInt(2, c.getIdCategoria());
            st.execute();
            st.close();
            ban = true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return ban;
    }

    /**
     * Modelo de Bodegas
     * *************************************************************
     *
     * Funciones para el modelo Bodegas
     *
     *************************************************************
     */
    /**
     * Esta Funcion permite realizar la insercion de un registro en la table de
     * Bodegas
     *
     * @param b Recibe el elemento tipo Bodega para realizar insercion en la
     * tabla de bodegas
     * @return regresa si fue o no exitosa la insercion
     *
     */
    public boolean insertarBodega(Bodega b) {
        String sql = "insert into bodegas values(null,?)";
        boolean ban = false;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, b.getNombre());
            st.execute();
            st.close();
            ban = true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return ban;
    }

    /**
     * Esta Funcion permite realizar la consulta de una bodega mediante el
     * IdBodega de la tabla de bodegas
     *
     * @param IdBodega es el id con el que buscara la bodega
     * @return regresa el objeto bodega encontrado
     *
     */
    public Bodega consultarBodega(Integer IdBodega) {
        String sql = "select * "
                + "from bodegas "
                + "where idbodega=?";
        Bodega b = new Bodega();
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, IdBodega);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                b.setIdBodega(rs.getInt("idbodega"));
                b.setNombre(rs.getString("nombre"));
            }
            rs.close();
            st.close();
            return b;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return b;
    }

    /**
     * Esta Funcion permite realizar la consulta General la table de Bodegas No
     * recibe parametros
     *
     * @return regresa un ArrayList tipo Bodega el cual contiene el resultado de
     * la consulta
     *
     */
    public ArrayList<Bodega> consultarBodegas() {
        String sql = "select * from bodegas "
                + "order by nombre";
        ArrayList<Bodega> lista = new ArrayList<Bodega>();

        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Bodega b = new Bodega();
                b.setIdBodega(rs.getInt("idbodega"));
                b.setNombre(rs.getString("nombre"));
                lista.add(b);
            }
            rs.close();
            st.close();
            return lista;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }

    /**
     * Esta Funcion permite consulta en la base de datos si existe una bodega
     * con el mismo nombre
     *
     * @param nombre es el nombre con el que realizara la busqueda en la tabla
     * de bodegas
     * @return regresa si existe una bodega con el mismo nombre
     *
     */
    public boolean consultarBodegaRegistrada(String nombre) {
        String sql = "select idbodega, nombre from bodegas where nombre=?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, nombre);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                rs.close();
                st.close();
                return true;

            } else {
                rs.close();
                st.close();
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return false;
    }

    /**
     * Esta Funcion permite actualizar una bodega con el idPropocionado
     *
     * @param b es la bodega que se desea modificar
     * @return regresa si la operacion fue exitosa
     *
     */
    public boolean actualizarBodega(Bodega b) {
        String sql = "update bodegas set nombre=? where idbodega=?";
        boolean ban = false;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, b.getNombre());
            st.setInt(2, b.getIdBodega());
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
     * Funciones para el modelo Venta
     *
     *************************************************************
     */
    /*Esta Funcion permite realizar la insercion de un registro en la table de Ventas
     * @param v Recibe el elemento tipo Venta para realizar insercion en la
     * tabla de Ventas
     * @return regresa si fue o no exitosa la insercion
     */
    public boolean insertarVenta(Venta v) {
        String sql = "insert into ventas values(null,?,?)";
        boolean ban = false;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setDate(1, v.getFecha());
            st.setFloat(2, v.getTotalVenta());
            st.execute();
            st.close();
            ban = true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return ban;
    }

    /*Esta Funcion permite recuperar la venta del dia
     * @param fecha es la fecha con la que buscara la venta
     * @return regresa el Objeto Venta que se encontro
     * 
     */
    public Venta consultarVenta(Date fecha) {
        String sql = "select idventa,fecha,totalventa from ventas where fecha=?";
        Venta v = new Venta();
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setDate(1, fecha);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                v.setIdVenta(rs.getInt("idventa"));
                v.setTotalVenta(rs.getFloat("totalventa"));
            }
            st.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return v;
    }

    /*Esta Funcion verificar si se ha generado una venta
     * @param fecha es la fecha con la que buscara la venta
     * @return regresa si anteriormete se ha generado una venta
     * 
     */
    public boolean consultarVentaDiaria(Date fecha) {
        String sql = "select idventa,fecha,totalventa from ventas where fecha=?";
        Venta v = new Venta();
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setDate(1, fecha);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                rs.close();
                st.close();
                return true;

            } else {
                rs.close();
                st.close();
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return false;
    }

    /* Esta Funcion permite calcular el total de una venta
     * @param fecha es la fecha con la que buscara la venta
     * @return regresa el total de la venta buscada
     * 
     */
    public Float consultarVentaTotalVenta(Date fecha) {
        Float TotalVenta = 0f;
        String sql = "select SUM(cc.TotalVenta)as TotalVenta "
                + "from ventas v "
                + "join cortesventas cv "
                + "on v.idventa=cv.idventa "
                + "join cortescaja cc "
                + "on cc.idcorte=cv.idcorte "
                + "where v.fecha=?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setDate(1, fecha);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                TotalVenta = rs.getFloat("TotalVenta");
            } else {

                TotalVenta = 0.0f;
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }

        return TotalVenta;
    }

    /* Esta Funcion permite actualizar el registro de una venta
     * @param v es el objeto Venta que se quiere actualizar
     * @return regresa si fue exitosa la acutalizacion
     * 
     */
    public boolean actualizarVenta(Venta v) {
        String sql = "update ventas set totalVenta=? where idVenta=?";
        boolean ban = false;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(2, v.getIdVenta());
            st.setFloat(1, v.getTotalVenta());
            st.execute();
            st.close();
            ban = true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return ban;
    }

    /**
     * Modelo de CorteVenta
     *
     * *************************************************************
     *
     * Funciones para el modelo CorteVenta Esta seccion contiente todos los
     * metodos necesarios para interactuar con la tabla de CorteVenta
     *
     *************************************************************
     */
    /**
     * *****
     * Esta Funcion permite realizar la insercion de un registro en la tabla
     * corteVenta
     *
     * @param c Recibe el elemento tipo CorteVenta para realizar insercion en la
     * tabla de CortesVentas
     * @return regresa si fue o no exitosa la insercion ***
     */
    public boolean insertarCorteVenta(CorteVenta c) {
        String sql = "insert into cortesventas values(?,?)";
        boolean ban = false;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, c.getIdVenta());
            st.setInt(2, c.getIdCorte());
            st.execute();
            st.close();
            ban = true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return ban;
    }

    /**
     * *****
     * Esta Funcion permite realizar la consulta general de las tabla
     * cortesVentas No recibe parametros
     *
     * @return un ArrayList de tipo corteVenta el cual contiene la consulta ***
     */
    public ArrayList<CorteVenta> consultarCortesVentas() {
        String sql = "select idventa,idcorte from cortesventas";
        ArrayList<CorteVenta> lista = new ArrayList<CorteVenta>();

        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                CorteVenta cv = new CorteVenta();
                cv.setIdVenta(rs.getInt("idventa"));
                cv.setIdCorte(rs.getInt("idcorte"));
                lista.add(cv);
            }
            rs.close();
            st.close();
            return lista;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }

    /**
     * Modelo CorteCaja
     *
     * *************************************************************
     *
     * Funciones para el modelo CorteCaja Esta seccion contiente todos los
     * metodos necesarios para interactuar con la tabla de CortesCaja
     *
     *************************************************************
     */
    /**
     * *****
     * Esta Funcion permite realizar la insercion de un registro en la tabla
     * cortesCaja
     *
     * @param cc Recibe el elemento tipo CorteCaja para realizar insercion en la
     * tabla de CortesCaja
     * @return regresa si fue o no exitosa la insercion ***
     */
    public boolean insertarCorteCaja(CorteCaja cc) {
        String sql = "insert into cortescaja values(null,?,?,?,?,?,?,?,?,?)";
        boolean ban = false;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, cc.getIdUsuario());
            st.setFloat(2, cc.getFondoInicial());
            st.setFloat(3, cc.getTotalVenta());
            st.setFloat(4, cc.getTotalRetiros());
            st.setFloat(5, cc.getTotalCorte());
            st.setTime(6, cc.getHoraInicial());
            st.setTime(7, cc.getHoraFinal());
            st.setString(8, cc.getEstatus());
            st.setDate(9, cc.getFecha());
            st.execute();
            st.close();
            ban = true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return ban;
    }

    /**
     * *****
     * Esta Funcion permite actualizar un registro en la tabla cortesCaja
     *
     * @param cc Recibe el elemento tipo CorteCaja para realizar mdoficacion en
     * la tabla de CortesCaja
     * @return regresa si fue o no exitosa la actualizacion ***
     */
    public boolean actualizarCorteCaja(CorteCaja cc) {
        String sql = "update cortescaja set idUsuario=? , fondoinicial=?, totalventa=?, "
                + "totalretiros=?, totalcorte=?, horainicial=?, horafinal=?, estatus=? "
                + " , fecha=? "
                + "where idcorte=? ";
        boolean ban = false;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, cc.getIdUsuario());
            st.setFloat(2, cc.getFondoInicial());
            st.setFloat(3, cc.getTotalVenta());
            st.setFloat(4, cc.getTotalRetiros());
            st.setFloat(5, cc.getTotalCorte());
            st.setTime(6, cc.getHoraInicial());
            st.setTime(7, cc.getHoraFinal());
            st.setString(8, cc.getEstatus());
            st.setDate(9, cc.getFecha());
            st.setInt(10, cc.getIdCorte());
            st.execute();
            st.close();
            ban = true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return ban;
    }

    public CorteCaja consultaCorteCaja(Date fecha, Integer idUsuario) {
        String sql = "select * "
                + "from cortescaja "
                + "where fecha=? and idUsuario=? and estatus='A'";
        CorteCaja cc = new CorteCaja();
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setDate(1, fecha);
            st.setInt(2, idUsuario);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                cc.setIdCorte(rs.getInt("idcorte"));
                cc.setIdUsuario(rs.getInt("idusuario"));
                cc.setFondoInicial(rs.getFloat("fondoinicial"));
                cc.setTotalVenta(rs.getFloat("totalventa"));
                cc.setTotalRetiros(rs.getFloat("totalretiros"));
                cc.setTotalCorte(rs.getFloat("totalcorte"));
                cc.setHoraInicial(rs.getTime("horainicial"));
                cc.setHoraFinal(rs.getTime("horafinal"));
                cc.setEstatus(rs.getString("estatus"));
                cc.setFecha(rs.getDate("fecha"));
            }
            st.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return cc;
    }

    public Float calcularTotalVentaCorte(CorteCaja cc) {
        String sp = "{call calculaVentaCorte(?,?)}";
        try {
            CallableStatement proc = con.prepareCall(sp);
            proc.setInt(1, cc.getIdCorte());
            proc.registerOutParameter(2, Types.DECIMAL);
            proc.execute();
            cc.setTotalVenta(proc.getFloat(2));
            proc.close();
            return cc.getTotalVenta();

        } catch (SQLException e) {
            System.out.println("Error al ejecutar calculaVentaCorte:" + e.getMessage());
        }
        return cc.getTotalVenta();
    }

    public Float consultarCorteCajaTotalVenta(Integer idCorte) {
        Float TotalVenta = 0f;
        String sql = "select SUM(t.total)as TotalVenta "
                + "from cortescaja cc "
                + "join detallecortes dc "
                + "on cc.idcorte=dc.idcorte "
                + "join tickets t "
                + "on t.idticket=dc.idticket "
                + "where cc.idcorte=?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, idCorte);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                TotalVenta = rs.getFloat("TotalVenta");
            } else {
                TotalVenta = 0.0f;
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }

        return TotalVenta;
    }

    public Float consultarCorteCajaTotalRetiros(Integer idCorte) {
        Float TotalRetiros = 0f;
        String sql = "select SUM(r.monto)as TotalRetiros from "
                + "CortesCaja cc "
                + "join DetalleRetiros dr "
                + "on cc.idcorte=dr.idcorte "
                + "join Retiros r "
                + "on dr.idretiro=r.idretiro "
                + "where cc.idcorte=?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, idCorte);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                TotalRetiros = rs.getFloat("TotalRetiros");
            } else {
                TotalRetiros = 0.0f;
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }

        return TotalRetiros;
    }

    /**
     * Modelo DetalleCortes
     * *************************************************************
     *
     * Funciones para el modelo DetalleCortes. Esta seccion contiente todos los
     * metodos necesarios para interactuar con la tabla de DetalleCortes
     *
     *************************************************************
     */
    /**
     * *Esta Funcion permite realizar la insercion de un registro en la tabla
     * de DetalleCortes
     *
     * @param dc es el DetalleCorte que se desea insertar en la tabla
     * @return regresa si fue o no exitosa la insercion
     */
    public boolean insertarDetalleCorte(DetalleCorte dc) {
        String sql = "insert into detallecortes values(?,?)";
        boolean ban = false;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, dc.getIdCorte());
            st.setFloat(2, dc.getIdTicket());
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
     * Funciones para el modelo Ticket
     *
     *************************************************************
     *
     */
    public ArrayList<Ticket> consultarTicket(int idticket) {
        String sql = "select idproducto,cantidad,preciounitario,subtotal,preciomayorista "
                + "from detalleticket "
                + "where idticket=?";
        ArrayList<Ticket> lista = new ArrayList<Ticket>();
        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            st.setInt(1, idticket);
            while (rs.next()) {
                Ticket t = new Ticket();
                t.setIdTicket(rs.getInt("idticket"));
                t.setIdTicket(rs.getInt("idusuario"));
                t.setFecha(rs.getDate("fecha"));
                t.setHoraVenta(rs.getTime("horaventa"));
                t.setSubTotal(rs.getFloat("subtotal"));
                t.setIVA(rs.getFloat("iva"));
                t.setTotal(rs.getFloat("total"));
                lista.add(t);
            }
            rs.close();
            st.close();
            return lista;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }

    public boolean insertarTicket(Ticket t) {
        String sql = "insert into tickets values(?,?,?,?,?,?,?)";
        boolean ban = false;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getIdTicket());
            st.setInt(2, t.getIdUsuario());
            st.setDate(3, t.getFecha());
            st.setTime(4, t.getHoraVenta());
            st.setFloat(5, t.getSubTotal());
            st.setFloat(6, t.getIVA());
            st.setFloat(7, t.getTotal());
            st.execute();
            st.close();
            ban = true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return ban;
    }

    public boolean actualizarTicket(Ticket t) {
        String sql = "update tickets set horaventa=? , subtotal=? ,iva=?, total=? where idticket=?";
        boolean ban = false;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setTime(1, t.getHoraVenta());
            st.setFloat(2, t.getSubTotal());
            st.setFloat(3, t.getIVA());
            st.setFloat(4, t.getTotal());
            st.setInt(5, t.getIdTicket());
            st.execute();
            st.close();
            ban = true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return ban;
    }

    /**
     * Funcion que permite saber cual es el siguiente Ticket a crear //No recibe
     * parametros /Devuelve un Integer correspondiente al ticket que se debe de
     * crear
     *
     */
    public Integer consultaUltimoTicket() {
        String fn = "{ ? = call ultimoTicket()}";
        try {
            Integer idTicket;
            CallableStatement proc = con.prepareCall(fn);
            proc.registerOutParameter(1, Types.INTEGER);
            proc.execute();
            idTicket = proc.getInt(1) + 1;
            proc.close();
            return idTicket;
        } catch (SQLException e) {
            System.out.println("Error al consulta el utlimo ticket:" + e.getMessage());
        }
        return null;
    }

    public Float calcularTotalTicketConsulta(Integer IdTicket) {
        String sql = "select SUM(dt.subtotal)as Total "
                + "from tickets t "
                + "join detalleticket dt "
                + "on dt.idticket=t.idticket "
                + "where t.idticket=?";
        Float totalTicket;
        totalTicket = 0.0f;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, IdTicket);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                totalTicket = (rs.getFloat("Total"));
            } else {

            }
            st.close();
            return totalTicket;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }

    /**
     *
     *
     * *************************************************************
     *
     * Funciones para el modelo DetalleTicket
     *
     *************************************************************
     */
    /**
     * uncion que permite consultar los productos por ticket de la Tabla
     * DetalleTicket de la Base de Datos //Recibe un int idticket /Devuellve un
     * ArrayList de tipo DetalleTicket ccrrespondiente a la consulta
     *
     */
    public ArrayList<DetalleTicket> consultarDetalleTicket(int idticket) {
        String sql = "select *  "
                + "from detalleticket "
                + "where idticket=?";
        ArrayList<DetalleTicket> lista = new ArrayList<DetalleTicket>();
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, idticket);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                DetalleTicket dt = new DetalleTicket();
                dt.setIdTicket(rs.getInt("idticket"));
                dt.setIdProducto(rs.getInt("idproducto"));
                dt.setCantidad(rs.getInt("cantidad"));
                dt.setPrecioUnitario(rs.getFloat("preciounitario"));
                dt.setSubTotal(rs.getFloat("SubTotal"));
                dt.setPrecioMayorista(rs.getBoolean("preciomayorista"));
                lista.add(dt);
            }
            rs.close();
            st.close();
            return lista;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }

    /**
     * Funcion que permite agregar un producto al Ticket, agrega un registro a
     * la tabla de DetalleTicket de la Base de Datos //Recibe un objeto de
     * DetalleTicket /Retorna si fue exitosa la insercion
     */
    public boolean insertarDetalleTicket(DetalleTicket dt) {
        String sql = "insert into detalleticket values(?,?,?,?,?,?)";
        boolean ban = false;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, dt.getIdTicket());
            st.setInt(2, dt.getIdProducto());
            st.setInt(3, dt.getCantidad());
            st.setFloat(4, dt.getPrecioUnitario());
            st.setFloat(5, dt.getSubTotal());
            st.setBoolean(6, dt.getPrecioMayorista());
            st.execute();
            st.close();
            ban = true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return ban;
    }

    /**
     * Funcion que permite eliminar el producto del ticket de la tabla
     * DetalleTciket de la Base de Datos //Recibe el int de IdTicket y el int
     * IdProducto /Retorna si fue exitosa la eliminacion
     *
     *
     */
    public boolean eliminarProductoDetalleTicket(int idticket, int idproducto) {
        String sql = "delete from detalleticket where idticket=? and idproducto=?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, idticket);
            st.setInt(2, idproducto);
            st.execute();
            st.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
            return false;
        }
    }

    /**
     * Modelo Retiro
     * *************************************************************
     *
     * Funciones para el modelo Retiro. Esta seccion contiente todos los metodos
     * necesarios para interactuar con la tabla de Retiros
     *
     *************************************************************
     */
    /**
     * Esta Funcion permite realizar la insercion de un registro en la tabla
     * retiros
     *
     * @param r Recibe el elemento tipo Retiro para realizar insercion en la
     * tabla de retiros
     * @return regresa si fue o no exitosa la insercion
     *
     */
    public boolean insertarRetiro(Retiro r) {
        String sql = "insert into retiros values(null,?,?,?,?)";
        boolean ban = false;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, r.getIdUsuario());
            st.setFloat(2, r.getMonto());
            st.setTime(3, r.getHora());
            st.setDate(4, r.getFecha());
            st.execute();
            st.close();
            ban = true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return ban;
    }

    public Integer consultaUltimoRetiro() {
        String sql = "select MAX(IdRetiro)as IdRetiro "
                + " from retiros";
        Integer IdRetiro;
        IdRetiro = 0;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                IdRetiro = (rs.getInt("IdRetiro"));
            } else {
                IdRetiro = 1;
            }
            st.close();
            return IdRetiro;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage() + " " + e.getSQLState());
        }
        return IdRetiro;
    }

    /**
     * Modelo DetalleRetiro
     * *************************************************************
     *
     * Funciones para el modelo DetalleRetiro. Esta seccion contiente todos los
     * metodos necesarios para interactuar con la tabla de DetalleRetiros
     *
     *************************************************************
     */
    /**
     * Esta Funcion permite realizar la insercion de un registro en la tabla
     * retiros
     *
     * @param dt Recibe el elemento tipo Retiro para realizar insercion en la
     * tabla de retiros
     * @return regresa si fue o no exitosa la insercion
     *
     */
    public boolean insertarDetalleRetiro(DetalleRetiro dt) {
        String sql = "insert into detalleretiros values(?,?)";
        boolean ban = false;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, dt.getIdRetiro());
            st.setInt(2, dt.getIdCorte());
            st.execute();
            st.close();
            ban = true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return ban;
    }

//        public void assertDecimalSameValue(String message, String expected_s, 
//        BigDecimal actual)
//    {
//        BigDecimal expected = (new BigDecimal(expected_s));
//        assertTrue(message + 
//            " expected:<" + expected + "> but was:<" + actual.toString() + ">", 
//            expected.compareTo(actual)==0);
//    }
}
