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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Datos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_Total = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_idTicket = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sp_Cantidad = new javax.swing.JSpinner();
        btn_AddProducto = new javax.swing.JButton();
        txt_Producto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmb_Producto = new javax.swing.JComboBox<>();
        cb_PrecioMayoreo = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        lbl_Precio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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

        jButton1.setText("Cobrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ticket Venta");

        jLabel2.setText("Total: $");

        lbl_Total.setText("0.00");

        jLabel3.setText("Ticket #");

        lbl_idTicket.setText("00000");

        jLabel4.setText("Cantidad");

        sp_Cantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        sp_Cantidad.setEditor(new javax.swing.JSpinner.NumberEditor(sp_Cantidad, ""));
        sp_Cantidad.setName(""); // NOI18N
        sp_Cantidad.setValue(1);

        btn_AddProducto.setText("Añadir Producto");
        btn_AddProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddProductoActionPerformed(evt);
            }
        });

        txt_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ProductoActionPerformed(evt);
            }
        });

        jLabel5.setText("Producto");

        cmb_Producto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_ProductoItemStateChanged(evt);
            }
        });

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

        jLabel6.setText("Precio: $");

        lbl_Precio.setText("0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jLabel1)
                .addContainerGap(692, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbl_Total)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_idTicket)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmb_Producto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Producto))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cb_PrecioMayoreo)
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_Precio)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(12, 12, 12))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_AddProducto)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sp_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lbl_idTicket))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(lbl_Total))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(cmb_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_PrecioMayoreo)
                            .addComponent(jLabel6)
                            .addComponent(lbl_Precio))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(sp_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(btn_AddProducto)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Integer idTicket = conexion.consultaUltimoTicket();
        System.out.println(idTicket.toString());
        System.out.println("ANTES");
        lbl_idTicket.setText(String.valueOf((int) idTicket));
        this.ticketActual.setIdTicket(idTicket);
        this.ticketActual.setIdUsuario(this.conexion.getUser().getIdUsuario());
        this.ticketActual.setFecha(this.corte.getFecha());
        this.ticketActual.setSubTotal(0.00f);
        this.ticketActual.setIVA(0.00f);
        this.ticketActual.setHoraVenta(Time.valueOf(LocalTime.now()));
        this.ticketActual.setTotal(0.00f);
        ArrayList<Producto> lista = conexion.consultaProductos();
        for (Producto p : lista) {
            cmb_Producto.addItem(p.toString());
        }
        System.out.println("Ticket Acutal " + ticketActual.toString());
        this.conexion.insertarTicket(ticketActual);

    }//GEN-LAST:event_formWindowOpened

    private void btn_AddProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddProductoActionPerformed
        DetalleTicket dt = new DetalleTicket();
        dt.setIdTicket(this.ticketActual.getIdTicket());
        System.out.println("Detalle Ticket ID" + ticketActual.getIdTicket());
        System.out.println(dt.getIdTicket());
        dt.setIdProducto(this.nuevoProducto.getIdProducto());
        dt.setCantidad((Integer) sp_Cantidad.getValue());
        if (cb_PrecioMayoreo.isSelected()) {
            dt.setPrecioUnitario(nuevoProducto.getPrecioMayoreo());
            dt.setPrecioMayorista(TRUE);
            dt.setSubTotal(nuevoProducto.getPrecioMayoreo() * dt.getCantidad());
        } else {
            dt.setPrecioUnitario(nuevoProducto.getPrecioMayoreo());
            dt.setPrecioMayorista(FALSE);
            dt.setSubTotal(nuevoProducto.getPrecioMenudeo() * dt.getCantidad());
        }
        conexion.insertarDetalleTicket(dt);
        System.out.println("Se inserto");
        ArrayList<DetalleTicket> lista = this.conexion.consultarDetalleTicket(this.ticketActual.getIdTicket());
        if (lista != null) {
            for (DetalleTicket dt2 : lista) {
                dt2.toString();
            }
        }
        else{
            System.out.println("Lista vacia");
        }
        llenarTabla(lista);

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

    private void llenarTabla(ArrayList<DetalleTicket> lista) {
        String[] encabezado = {"idTicket", "IdProducto", "Cantidad", "Precio Unitario", "SubTotal", "Precio Mayorista"};
        Object[][] datos = new Object[lista.size()][6];
        int ren = 0;
        for (DetalleTicket dt : lista) {
            datos[ren][0] = dt.getIdTicket();
            datos[ren][1] = dt.getIdProducto();
            datos[ren][2] = dt.getCantidad();
            datos[ren][3] = dt.getPrecioUnitario();
            datos[ren][4] = dt.getSubTotal();
            datos[ren][5] = dt.getPrecioMayorista();
            ren++;
        }
        DefaultTableModel m = new DefaultTableModel(datos, encabezado) {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }

        };
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

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddProducto;
    private javax.swing.JCheckBox cb_PrecioMayoreo;
    private javax.swing.JComboBox<String> cmb_Producto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Precio;
    private javax.swing.JLabel lbl_Total;
    private javax.swing.JLabel lbl_idTicket;
    private javax.swing.JSpinner sp_Cantidad;
    private javax.swing.JTable tbl_Datos;
    private javax.swing.JTextField txt_Producto;
    // End of variables declaration//GEN-END:variables
}
