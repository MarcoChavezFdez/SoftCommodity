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
 * Esta clase es la encargada generar la interface para que el usuario pueda
 * realizar la administracion de los productoa asi como la consulta de los
 * mismos, contiene ademas los eventos necesarios para que el usuario interactue
 * con el sistema
 *
 */
package GUI;

import Conexion.ConexionBD;
import Modelos.Producto;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marco Chavez
 */
public class ProductosMainFrame extends javax.swing.JFrame {

    /**
     * Creates new form ProductosGUI
     */
    ConexionBD conexion;

    public ProductosMainFrame(ConexionBD conexion) {
        initComponents();
        this.conexion = conexion;
        ArrayList<Producto> lista = conexion.consultaProductos();
        llenarTabla(lista);
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
        btn_AddProducto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_Modificar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        btn_Eliminar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Datos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SoftCommodity+ by White Company® ");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_AddProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Productos/Añadir.png"))); // NOI18N
        btn_AddProducto.setToolTipText("");
        btn_AddProducto.setBorderPainted(false);
        btn_AddProducto.setContentAreaFilled(false);
        btn_AddProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_AddProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Productos Registrados");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        btn_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Productos/Modificar.png"))); // NOI18N
        btn_Modificar.setBorderPainted(false);
        btn_Modificar.setContentAreaFilled(false);
        btn_Modificar.setEnabled(false);
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Login/Volver.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 230, 100));

        jComboBox1.setBackground(new java.awt.Color(204, 82, 122));
        jComboBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IdProducto", "Nombre", "EAN" }));
        jComboBox1.setToolTipText("");
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 40, 119, 40));

        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Productos/Eliminar.png"))); // NOI18N
        btn_Eliminar.setBorderPainted(false);
        btn_Eliminar.setContentAreaFilled(false);
        btn_Eliminar.setEnabled(false);
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, -1, -1));

        jTextField1.setBackground(new java.awt.Color(237, 174, 195));
        jTextField1.setToolTipText("Buscar producto...");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 90, 403, 42));

        tbl_Datos.setBackground(new java.awt.Color(237, 174, 195));
        tbl_Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IdProducto", "IdCategoria", "Nombre", "Descripcion", "Precio Mayoreo", "Precio Menudeo", "Precio Compra", "Presentacion", "EAN", "Contenido", "Tipo Contenido", "Material", "Anchura", "Medida Anchura", "Color", "Estatus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Datos.setToolTipText("");
        tbl_Datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_DatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Datos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 1442, 496));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, 60, 40));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buscar por:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 40, 100, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo5.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, -220, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo5.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -210, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo5.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, -220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1499, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MenuPrincipalFrame menu = new MenuPrincipalFrame(this.conexion);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_AddProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddProductoActionPerformed
        AddProductoFrame addProducto = new AddProductoFrame(this.conexion);
        addProducto.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btn_AddProductoActionPerformed

    private void tbl_DatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_DatosMouseClicked
        btn_Modificar.setEnabled(true);
        btn_Eliminar.setEnabled(true);
    }//GEN-LAST:event_tbl_DatosMouseClicked

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
        Integer IdProducto = Integer.parseInt(tbl_Datos.getValueAt(tbl_Datos.getSelectedRow(), 0).toString());
        Producto p = conexion.consultaProducto(IdProducto);
        ModificarProductoFrame modificarProducto = new ModificarProductoFrame(this.conexion, p);
        this.setVisible(false);
        modificarProducto.setVisible(true);
    }//GEN-LAST:event_btn_ModificarActionPerformed
    private void llenarTabla(ArrayList<Producto> lista) {
        String[] encabezado = {"IdProducto", "IdCategoria", "Nombre", "Descripcion", "Precio Mayoreo", "Precio Menudeo", "Precio Compra", "Presentacion", "EAN", "Contenido", "Tipo Contenido", "Material", "Anchura", "Medida Anchura", "Color", "Estatus"};
        Object[][] datos = new Object[lista.size()][16];
        int ren = 0;
        for (Producto s : lista) {
            datos[ren][0] = s.getIdProducto();
            datos[ren][1] = s.getIdCategoria();
            datos[ren][2] = s.getNombre();
            datos[ren][3] = s.getDescripcion();
            datos[ren][4] = s.getPrecioMayoreo();
            datos[ren][5] = s.getPrecioMenudeo();
            datos[ren][6] = s.getPrecioCompra();
            datos[ren][7] = s.getPresentacion();
            datos[ren][8] = s.getEAN();
            datos[ren][9] = s.getContenido();
            datos[ren][10] = s.getTipoContenido();
            datos[ren][11] = s.getMaterial();
            datos[ren][12] = s.getAnchura();
            datos[ren][13] = s.getMedidaAnchura();
            datos[ren][14] = s.getColor();
            datos[ren][15] = s.getEstatus();
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

    private void escribirAnchos() {
        for (int i = 0; i < tbl_Datos.getColumnCount() - 1; i++) {
            System.out.println("INDICE " + i + " " + tbl_Datos.getColumn(i).getPreferredWidth());
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddProducto;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbl_Datos;
    // End of variables declaration//GEN-END:variables
}
