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
 * La clase ConexionBD contiene todas las propiedades y metodos para interactuar
 * con la Base de Datos SoftCommodity bajo MySQL 5.0 y en una infraestructura
 * local
 * @since VER1.0
 */
package Conexion;
import static org.junit.Assert.*;
import Modelos.Bodega;
import Modelos.Categoria;
import Modelos.CorteCaja;
import Modelos.CorteVenta;
import Modelos.DetalleTicket;
import Modelos.Producto;
import Modelos.Ticket;
import Modelos.Usuario;
import Modelos.Venta;
import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConexionBD {

    //Creamos un string de tipo privado y final, esto quiere decir que no cambiara su valor
    private final String url = "jdbc:mysql://localhost/softcommodity";

    //Creamos un objeto de tipo  PreparedStatement para los querys que queramos hacer a la BD
    PreparedStatement psPrepararSentencia;
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
                System.out.println("Conexión a base de datos funcionando");
            }
        } //Agarramos excepciones de tipo SQL
        catch (SQLException e) {
            //las mostramos en consola
            System.out.println(e);
            //agarramos excepciones de tipo clase en java
        } catch (ClassNotFoundException e) {
            //las mostramos en consola
            System.out.println(e);
        }
    }

    //Este metodo de tipo Connection nos devuelve el estado del objeto
    public Connection conectado() {
        return con;
    }

    //Por seguridad, cuando terminemos sentencias, cerramos la conexion o si la necesitamos cerrar por otro caso
    public void desconectar() {
        //Ahora de nuevo con sera null
        con = null;
        System.out.println("La conexion la BD se ha cerrado");

    }

    /**
     * *************************************************************
     *
     * Funciones para el modelo Producto
     *
     *************************************************************
     */
    //Funcion la cual permite realizar la consulta general de todos los productos de la tabla Productos de la Base de Datos
    //Devuelve un ArrayList de objetos Producto
    //No recibe parametros
    public ArrayList<Producto> consultaProductos() {
        String sql = "select idproducto,idcategoria,nombre,descripcion,preciomayoreo,preciomenudeo,preciocompra,presentacion,"
                + "ean,contenido,tipocontenido,material,anchura,medidaanchura,color,estatus "
                + "from productos"
                + " ORDER BY idproducto ASC";
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

    //Funcion la cual permite realizar la consulta de los primeros 25 productos  de la tabla Productos de la Base de Datos
    //Devuelve un ArrayList de objetos Producto
    //No recibe parametros
    public ArrayList<Producto> consultaProductosLimitado() {
        String sql = "select idproducto,idcategoria,nombre,descripcion,preciomayoreo,preciomenudeo,preciocompra,presentacion,"
                + "ean,contenido,tipocontenido,material,anchura,medidaanchura,color,estatus "
                + "from productos"
                + "order by nombre"
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

    //Funcion la cual permite realizar la consulta de un producto de la tabla Productos de la Base de Datos
    //Devuelve un ArrayList de objetos Producto
    //REcibe el idproducto como parametro
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
        String sql = "select idusuario,nombre,apellidopaterno,apellidomaterno,curp,direccion,telefono,email,rol,login,"
                + "passw,estatus "
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
        String sql = "select idusuario,nombre,apellidopaterno,apellidomaterno,curp,direccion,telefono,email,rol,login,"
                + "passw,estatus "
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

    public ArrayList<Usuario> consultarUsuarios() {
        String sql = "select idusuario,nombre,apellidopaterno,apellidomaterno,curp,direccion,telefono,email,rol,login,"
                + "passw,estatus "
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

    public boolean actualizarCorteCaja(CorteCaja cc) {
        String sql = "update cortescaja set idUsuario=? , fondoincial=?, totalventa=?, totalretiros=?, totalcorte=?,"
                + "horainicial=?, horafinal=?, estatus=? , fecha=?, "
                + "where idcorte=?";
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

    public CorteCaja consultaCorteCaja(Date fecha, Integer idUsuario) {
        String sql = "select idcorte,idusuario,fondoinicial,totalventa,totalretiros,totalcorte,horainicial,horafinal,"
                + "estatus,fecha "
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

            return cc.getTotalVenta();

        } catch (SQLException e) {
            System.out.println("Error al ejecutar calculaVentaCorte:" + e.getMessage());
        }
        return cc.getTotalVenta();
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

    //Funcion que permite saber cual es el siguiente Ticket a crear
    //No recibe parametros
    //Devuelve un Integer correspondiente al ticket que se debe de crear
    public Integer consultaUltimoTicket() {
        String fn = "{ ? = call ultimoTicket()}";
        try {
            Integer idTicket;
            CallableStatement proc = con.prepareCall(fn);
            proc.registerOutParameter(1, Types.INTEGER);
            proc.execute();
            idTicket = proc.getInt(1) + 1;
            return idTicket;
        } catch (SQLException e) {
            System.out.println("Error al consulta el utlimo ticket:" + e.getMessage());
        }
        return null;
    }

    public BigDecimal calcularTotalTicket(Integer idTicket) {
        String sp = "{call calculaTotalTicket(?,?)}";
        try {
            CallableStatement proc = con.prepareCall(sp);
            proc.setInt(1, idTicket);
            proc.registerOutParameter(2, Types.DECIMAL);
            proc.executeQuery();
            BigDecimal TotalVenta = proc.getBigDecimal(2);
            assertEquals(2.0, TotalVenta.doubleValue(),0.0);
            TotalVenta = proc.getBigDecimal(2);
            return TotalVenta;
        } catch (SQLException e) {
            System.out.println("Error al ejecutar calculaTotalTicket:" + e.getMessage());
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
        totalTicket=0.0f;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, IdTicket);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                totalTicket=(rs.getFloat("Total"));
            }
            else{
                System.out.println("No recupero nada");
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
     *
     * @param idticket
     * @return
     */
    //Funcion que permite consultar los productos por ticket de la Tabla DetalleTicket de la Base de Datos
    //Recibe un int idticket
    //Devuellve un ArrayList de tipo DetalleTicket ccrrespondiente a la consulta
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

    //Funcion que permite agregar un producto al Ticket, agrega un registro a la tabla de DetalleTicket de la Base de Datos
    //Recibe un objeto de DetalleTicket
    //Retorna si fue exitosa la insercion 
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

    //Funcion que permite eliminar el producto del ticket de la tabla DetalleTciket de la Base de Datos
    //Recibe el int de IdTicket y el int IdProducto
    //Retorna si fue exitosa la eliminacion
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

    //Funcion que permite establecer el usuario de la propiedad @user de la clase
    //Recibe un usuario de objeto tipo Usuario
    public void setUser(Usuario user) {
        this.user = user;
    }

    //Funcion que permite obtener un Objeto Usuario de la propiedad @user de la clase
    public Usuario getUser() {
        return user;
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
