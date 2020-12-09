/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Modelos.Bodega;
import Modelos.Categoria;
import Modelos.CorteCaja;
import Modelos.CorteVenta;
import Modelos.Producto;
import Modelos.Usuario;
import Modelos.Venta;
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
    //Funcion la cual permite realizar la consulta general
    //Devuelve un ArrayList de objetos Producto
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

    public boolean actualizarProducto(Producto p) {
        String sql = "update productos set idcategoria=?, nombre=?, descripcion=?, preciomayoreo=? ,preciomenudeo=?, preciocompra=?, presentacion=?, EAN=?, contenido=?, tipocontenido=?, material=?, anchura=?, medidaanchura=?, color=?, estatus=?  where idProducto=?";
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
    public Usuario consultarUsuarioLogin(String nombre) {
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
            rs.close();
            st.close();
            return u;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }

    public boolean consultarUsuarioLoginRegistro(String nombre) {
        String sql = "select idusuario,nombre,apellidopaterno,apellidomaterno,curp,direccion,telefono,email,rol,login,passw,estatus from usuarios where login=?";
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

    public ArrayList<Usuario> consultarUsuarios() {
        String sql = "select idusuario,nombre,apellidopaterno,apellidomaterno,curp,direccion,telefono,email,rol,login,passw,estatus from usuarios";
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

    /**
     * *************************************************************
     *
     * Funciones para el modelo Categorias
     *
     *
     *
     *************************************************************
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

    public ArrayList<Categoria> consultarCategoriasPorNombre() {
        String sql = "select idcategoria,nombre from categorias order by nombre asc";
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
     * *************************************************************
     *
     * Funciones para el modelo Bodegas
     *
     *
     *
     *************************************************************
     * @param b Recibe el elemento tipo Bodega para realizar insercion en la
     * tabla de bodegas
     * @return
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

    public ArrayList<Bodega> consultarBodegas() {
        String sql = "select idbodega,nombre from bodegas";
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
     * *************************************************************
     *
     * Funciones para el modelo Venta
     *
     *
     *
     *************************************************************
     * @param v
     * @return
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
     * *************************************************************
     *
     * Funciones para el modelo CorteVenta
     *
     *
     *
     *************************************************************
     *
     *
     *
     * @param c
     * @return
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
     * *************************************************************
     *
     * Funciones para el modelo CorteCaja
     *
     *
     *
     *************************************************************
     *
     */
    public boolean insertarCorteCaja(CorteCaja cc) {
        String sql = "insert into cortescajas values(null,?,?,?,?,?,?,?,?,?)";
        boolean ban = false;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(2, cc.getIdUsuario());
            st.setFloat(3, cc.getFondoInicial());
            st.setFloat(4, cc.getTotalVenta());
            st.setFloat(5, cc.getTotalRetiros());
            st.setFloat(6, cc.getTotalCorte());
            st.setTimestamp(7, cc.getHoraInicial());
            st.setTimestamp(8, cc.getHoraFinal());
            st.setString(9, cc.getEstatus());
            st.setDate(10, cc.getFecha());
            st.execute();
            st.close();
            ban = true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return ban;
    }

    public boolean actualizarCorteCaja(CorteCaja cc) {
        String sql = "update cortescaja set idUsuario=? , fondoincial=?, totalventa=?, totalretiros=?, totalcorte=?, horainicial=?, horafinal=?, estatus=? , fecha=?, where idcorte=?";
        boolean ban = false;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(10, cc.getIdCorte());
            st.setFloat(1, cc.getTotalVenta());
            st.execute();
            st.close();
            ban = true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return ban;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Usuario getUser() {
        return user;
    }

}
