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
 *
 * @since VER1.0
 */
package GUI;

import Conexion.ConexionBD;
import Modelos.Bodega;
import Modelos.CorteCaja;
import Modelos.DetalleTicket;
import Modelos.Producto;
import Modelos.Ticket;
import static java.lang.Boolean.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marco Chavez
 */
public class TicketMainFrame extends javax.swing.JFrame {

    /**
     * Creates new form TicketMainFrame
     */
    ConexionBD conexion;
    CorteCaja corte;
    Ticket ticketActual;
    Producto nuevoProducto;

    public TicketMainFrame(ConexionBD conexion, CorteCaja corte) {
        initComponents();
        this.conexion = conexion;
        this.corte = corte;
        this.ticketActual = new Ticket();
        ArrayList<DetalleTicket> lista = conexion.consultarDetalleTicket(corte.getIdCorte());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lbl_IVA = new javax.swing.JLabel();
        lbl_Precio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_idTicket = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sp_Cantidad = new javax.swing.JSpinner();
        btn_AddProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Datos = new javax.swing.JTable();
        txt_Producto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_Cobrar = new javax.swing.JButton();
        cmb_Producto = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cb_PrecioMayoreo = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        btn_Atras = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lbl_Total = new javax.swing.JLabel();
        lbl_SubTotal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SoftCommodity+ by White Company® ");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio: $");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 280, 80, -1));

        lbl_IVA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_IVA.setForeground(new java.awt.Color(255, 255, 255));
        lbl_IVA.setText("0.00");
        jPanel1.add(lbl_IVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, -1, -1));

        lbl_Precio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_Precio.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Precio.setText("0.00");
        jPanel1.add(lbl_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ticket #");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        lbl_idTicket.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_idTicket.setForeground(new java.awt.Color(237, 174, 195));
        lbl_idTicket.setText("00000");
        jPanel1.add(lbl_idTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, -1, -1));

        sp_Cantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        sp_Cantidad.setEditor(new javax.swing.JSpinner.NumberEditor(sp_Cantidad, ""));
        sp_Cantidad.setName(""); // NOI18N
        sp_Cantidad.setValue(1);
        jPanel1.add(sp_Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 47, -1));

        btn_AddProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Ticket/Añadir.png"))); // NOI18N
        btn_AddProducto.setBorderPainted(false);
        btn_AddProducto.setContentAreaFilled(false);
        btn_AddProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_AddProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, -1, -1));

        tbl_Datos.setAutoCreateRowSorter(true);
        tbl_Datos.setBackground(new java.awt.Color(237, 174, 195));
        tbl_Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "IdProducto", "Nombre", "Cantidad", "Precio Unitario", "Sub Total"
            }
        ));
        jScrollPane1.setViewportView(tbl_Datos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 592, 350));

        txt_Producto.setBackground(new java.awt.Color(237, 174, 195));
        txt_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ProductoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 359, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Producto");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, -1, -1));

        btn_Cobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Ticket/Cobrar.png"))); // NOI18N
        btn_Cobrar.setBorderPainted(false);
        btn_Cobrar.setContentAreaFilled(false);
        btn_Cobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CobrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Cobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, -1, -1));

        cmb_Producto.setBackground(new java.awt.Color(237, 174, 195));
        cmb_Producto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_ProductoItemStateChanged(evt);
            }
        });
        jPanel1.add(cmb_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 408, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ticket Venta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        cb_PrecioMayoreo.setBackground(new java.awt.Color(237, 174, 195));
        cb_PrecioMayoreo.setForeground(new java.awt.Color(255, 255, 255));
        cb_PrecioMayoreo.setText("Precio Mayoreo");
        cb_PrecioMayoreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cb_PrecioMayoreoMouseReleased(evt);
            }
        });
        cb_PrecioMayoreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_PrecioMayoreoActionPerformed(evt);
            }
        });
        cb_PrecioMayoreo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cb_PrecioMayoreoPropertyChange(evt);
            }
        });
        jPanel1.add(cb_PrecioMayoreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SubTotal: $");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        btn_Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Volver.png"))); // NOI18N
        btn_Atras.setBorderPainted(false);
        btn_Atras.setContentAreaFilled(false);
        btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, -1, -1));

        lbl_Total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_Total.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Total.setText("0.00");
        jPanel1.add(lbl_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, -1, -1));

        lbl_SubTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_SubTotal.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SubTotal.setText("0.00");
        jPanel1.add(lbl_SubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total: $");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("IVA: $");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CobrarActionPerformed
        RealizarPagoFrame cobrar = new RealizarPagoFrame(this.conexion, this.ticketActual, this.corte);
        this.setVisible(false);
        cobrar.setVisible(true);
    }//GEN-LAST:event_btn_CobrarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Integer idTicket = conexion.consultaUltimoTicket();
        System.out.println(idTicket.toString());
        lbl_idTicket.setText(String.valueOf((int) idTicket));
        this.ticketActual.setIdTicket(idTicket);
        this.ticketActual.setIdUsuario(this.conexion.getUser().getIdUsuario());
        this.ticketActual.setFecha(this.corte.getFecha());
        this.ticketActual.setSubTotal(0.0f);
        this.ticketActual.setIVA(0.00f);
        this.ticketActual.setHoraVenta(Time.valueOf(LocalTime.now()));
        this.ticketActual.setTotal(0.00f);
        ArrayList<Producto> lista = conexion.consultaProductos();
        for (Producto p : lista) {
            cmb_Producto.addItem(p.toString());
        }
        this.conexion.insertarTicket(ticketActual);

    }//GEN-LAST:event_formWindowOpened

    private void btn_AddProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddProductoActionPerformed
        DetalleTicket dt = new DetalleTicket();
        dt.setIdTicket(this.ticketActual.getIdTicket());
        System.out.println(dt.getIdTicket());
        dt.setIdProducto(this.nuevoProducto.getIdProducto());
        dt.setCantidad((Integer) sp_Cantidad.getValue());
        if (cb_PrecioMayoreo.isSelected()) {
            dt.setPrecioUnitario(nuevoProducto.getPrecioMayoreo());
            dt.setPrecioMayorista(TRUE);
            dt.setSubTotal(nuevoProducto.getPrecioMayoreo() * dt.getCantidad());
        } else {
            dt.setPrecioUnitario(nuevoProducto.getPrecioMenudeo());
            dt.setPrecioMayorista(FALSE);
            dt.setSubTotal(nuevoProducto.getPrecioMenudeo() * dt.getCantidad());
        }
        conexion.insertarDetalleTicket(dt);
        ArrayList<DetalleTicket> lista = this.conexion.consultarDetalleTicket(this.ticketActual.getIdTicket());
        llenarTabla(lista);
        this.ticketActual.setSubTotal(redondeoDecimales(conexion.calcularTotalTicketConsulta(this.ticketActual.getIdTicket()),4));
        this.ticketActual.setIVA(redondeoDecimales(this.ticketActual.getSubTotal()*0.16f,2));
        this.ticketActual.setTotal(redondeoDecimales(this.ticketActual.getIVA() + this.ticketActual.getSubTotal(),2));

        lbl_SubTotal.setText(String.valueOf(this.ticketActual.getSubTotal()));
        lbl_IVA.setText(String.valueOf(this.ticketActual.getIVA()));
        lbl_Total.setText(String.valueOf(this.ticketActual.getTotal()));
    }//GEN-LAST:event_btn_AddProductoActionPerformed

    private void txt_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ProductoActionPerformed

    private void cb_PrecioMayoreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_PrecioMayoreoActionPerformed
        llenaPrecio(this.nuevoProducto);
    }//GEN-LAST:event_cb_PrecioMayoreoActionPerformed

    private void cmb_ProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_ProductoItemStateChanged

        String id = cmb_Producto.getItemAt(cmb_Producto.getSelectedIndex());
        Integer idProducto;
        System.out.println(cmb_Producto.getItemAt(cmb_Producto.getSelectedIndex()));
        System.out.println(id.indexOf(":"));
        idProducto = Integer.valueOf(id.substring(0, id.indexOf(":") - 1));
        this.nuevoProducto = conexion.consultaProducto(idProducto);

        llenaPrecio(this.nuevoProducto);
    }//GEN-LAST:event_cmb_ProductoItemStateChanged

    private void cb_PrecioMayoreoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cb_PrecioMayoreoPropertyChange

    }//GEN-LAST:event_cb_PrecioMayoreoPropertyChange

    private void cb_PrecioMayoreoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_PrecioMayoreoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_PrecioMayoreoMouseReleased

    private void btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtrasActionPerformed
        CortesMainFrame Cortes = new CortesMainFrame(this.conexion, this.corte);
        this.setVisible(false);
        Cortes.setVisible(true);
    }//GEN-LAST:event_btn_AtrasActionPerformed

    private void llenarTabla(ArrayList<DetalleTicket> lista) {
        String[] encabezado = {"IdProducto", "Cantidad", "Precio Unitario", "SubTotal", "Precio Mayorista"};
        Object[][] datos = new Object[lista.size()][5];
        int ren = 0;
        for (DetalleTicket dt : lista) {
            datos[ren][0] = dt.getIdProducto();
            datos[ren][1] = dt.getCantidad();
            datos[ren][2] = dt.getPrecioUnitario();
            datos[ren][3] = dt.getSubTotal();
            if (dt.getPrecioMayorista()) {
                datos[ren][4] = "Si";
            } else {
                datos[ren][4] = "No";
            }
            ren++;
        }
        DefaultTableModel m = new DefaultTableModel(datos, encabezado) {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        tbl_Datos.setModel(m);
    }

    private void llenaPrecio(Producto p) {

        if (p == null) {
            lbl_Precio.setText("0.00");
        } else if (cb_PrecioMayoreo.isSelected()) {
            lbl_Precio.setText(String.valueOf(p.getPrecioMayoreo()));
        } else {
            lbl_Precio.setText(String.valueOf(p.getPrecioMenudeo()));
        }
    }

    public static float redondeoDecimales(float numero, int numeroDecimales) {
        BigDecimal redondeado = new BigDecimal(numero)
                .setScale(numeroDecimales, RoundingMode.HALF_EVEN);
        return redondeado.floatValue();
    }

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddProducto;
    private javax.swing.JButton btn_Atras;
    private javax.swing.JButton btn_Cobrar;
    private javax.swing.JCheckBox cb_PrecioMayoreo;
    private javax.swing.JComboBox<String> cmb_Producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_IVA;
    private javax.swing.JLabel lbl_Precio;
    private javax.swing.JLabel lbl_SubTotal;
    private javax.swing.JLabel lbl_Total;
    private javax.swing.JLabel lbl_idTicket;
    private javax.swing.JSpinner sp_Cantidad;
    private javax.swing.JTable tbl_Datos;
    private javax.swing.JTextField txt_Producto;
    // End of variables declaration//GEN-END:variables
}
