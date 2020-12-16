/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Conexion.ConexionBD;
import Modelos.Categoria;
import Modelos.Producto;
import java.util.ArrayList;
import javafx.scene.control.ComboBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Marco Chavez
 */
public class AddProductoFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddProductoFrame
     */
    ConexionBD conexion;

    public AddProductoFrame(ConexionBD conexion) {
        initComponents();
        this.conexion = conexion;
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
        txf_Descripcion = new javax.swing.JTextField();
        txf_PrecioMayoreo = new javax.swing.JTextField();
        txf_PrecioMenudeo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txf_PrecioCompra = new javax.swing.JTextField();
        txf_Anchura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmb_Presentacion = new javax.swing.JComboBox<>();
        cmb_MedidaAnchura = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmb_TipoContenido = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txf_Color = new javax.swing.JTextField();
        txf_EAN = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txf_Material = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txf_Contenido = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btn_Atras = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cmb_Categorias = new javax.swing.JComboBox<>();
        txf_Nombre = new javax.swing.JTextField();
        cmb_Estatus = new javax.swing.JComboBox<>();
        btn_AddProducto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SoftCommodity+ by White Company® ");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txf_Descripcion.setBackground(new java.awt.Color(237, 174, 195));
        txf_Descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_DescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(txf_Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 139, -1));

        txf_PrecioMayoreo.setBackground(new java.awt.Color(237, 174, 195));
        txf_PrecioMayoreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txf_PrecioMayoreoKeyPressed(evt);
            }
        });
        jPanel1.add(txf_PrecioMayoreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 139, -1));

        txf_PrecioMenudeo.setBackground(new java.awt.Color(237, 174, 195));
        jPanel1.add(txf_PrecioMenudeo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 139, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio Compra");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        txf_PrecioCompra.setBackground(new java.awt.Color(237, 174, 195));
        txf_PrecioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_PrecioCompraActionPerformed(evt);
            }
        });
        jPanel1.add(txf_PrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 139, -1));

        txf_Anchura.setBackground(new java.awt.Color(237, 174, 195));
        jPanel1.add(txf_Anchura, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 140, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("IdCategoría");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Presentación");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        cmb_Presentacion.setBackground(new java.awt.Color(237, 174, 195));
        cmb_Presentacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pieza", "Metro", "Gramos" }));
        jPanel1.add(cmb_Presentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 139, -1));

        cmb_MedidaAnchura.setBackground(new java.awt.Color(237, 174, 195));
        cmb_MedidaAnchura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Milimetros", "Pulgadas", "Centimetros", "NA" }));
        cmb_MedidaAnchura.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_MedidaAnchuraItemStateChanged(evt);
            }
        });
        cmb_MedidaAnchura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_MedidaAnchuraActionPerformed(evt);
            }
        });
        jPanel1.add(cmb_MedidaAnchura, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("EAN");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        cmb_TipoContenido.setBackground(new java.awt.Color(237, 174, 195));
        cmb_TipoContenido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Metros", "Piezas", "Gramos" }));
        cmb_TipoContenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_TipoContenidoActionPerformed(evt);
            }
        });
        jPanel1.add(cmb_TipoContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 139, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contenido");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripción");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        txf_Color.setBackground(new java.awt.Color(237, 174, 195));
        jPanel1.add(txf_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 140, -1));

        txf_EAN.setBackground(new java.awt.Color(237, 174, 195));
        txf_EAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_EANActionPerformed(evt);
            }
        });
        jPanel1.add(txf_EAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 139, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tipo Contenido");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio Mayoreo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        txf_Material.setBackground(new java.awt.Color(237, 174, 195));
        txf_Material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_MaterialActionPerformed(evt);
            }
        });
        jPanel1.add(txf_Material, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 140, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio Menudeo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        txf_Contenido.setBackground(new java.awt.Color(237, 174, 195));
        txf_Contenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_ContenidoActionPerformed(evt);
            }
        });
        jPanel1.add(txf_Contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 139, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Añadir Un Nuevo Producto");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        btn_Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Login/Volver.png"))); // NOI18N
        btn_Atras.setText("Atras");
        btn_Atras.setBorderPainted(false);
        btn_Atras.setContentAreaFilled(false);
        btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Material");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, 16));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Anchura");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Color");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Medida Anchura");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Estatus");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        cmb_Categorias.setBackground(new java.awt.Color(237, 174, 195));
        cmb_Categorias.setMaximumRowCount(100);
        cmb_Categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_CategoriasActionPerformed(evt);
            }
        });
        jPanel1.add(cmb_Categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        txf_Nombre.setBackground(new java.awt.Color(237, 174, 195));
        jPanel1.add(txf_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 139, -1));

        cmb_Estatus.setBackground(new java.awt.Color(237, 174, 195));
        cmb_Estatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cmb_Estatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_EstatusActionPerformed(evt);
            }
        });
        jPanel1.add(cmb_Estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, -1, -1));

        btn_AddProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Productos/Añadir.png"))); // NOI18N
        btn_AddProducto.setBorderPainted(false);
        btn_AddProducto.setContentAreaFilled(false);
        btn_AddProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_AddProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo5_Med.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_MedidaAnchuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_MedidaAnchuraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_MedidaAnchuraActionPerformed

    private void cmb_EstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_EstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_EstatusActionPerformed

    private void cmb_CategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_CategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_CategoriasActionPerformed

    private void btn_AddProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddProductoActionPerformed
        Producto nuevoProducto = new Producto();
        Categoria catSeleccionada;
        catSeleccionada=conexion.consultarCategoriasPorNombre(cmb_Categorias.getItemAt(cmb_Categorias.getSelectedIndex()));
        nuevoProducto.setIdCategoria(catSeleccionada.getIdCategoria());
        nuevoProducto.setNombre(txf_Nombre.getText());
        try{
            if(conexion.insertarProducto(nuevoProducto)){
                JOptionPane.showMessageDialog(null, "Producto Añadido con exito");
                ProductosMainFrame productos = new ProductosMainFrame(this.conexion);
                productos.setVisible(true);
                productos.setVisible(false);
                
            }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
    }

    }//GEN-LAST:event_btn_AddProductoActionPerformed

    private void txf_PrecioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_PrecioCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_PrecioCompraActionPerformed

    private void txf_EANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_EANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_EANActionPerformed

    private void txf_MaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_MaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_MaterialActionPerformed

    private void txf_ContenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_ContenidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_ContenidoActionPerformed

    private void btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtrasActionPerformed
        ProductosMainFrame productos = new ProductosMainFrame(this.conexion);
        productos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_AtrasActionPerformed

    private void txf_DescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_DescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_DescripcionActionPerformed

    //Llena el ComboBox de categorias cuando se abre la ventana
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ArrayList<Categoria> listaCategorias = conexion.consultarCategoriasOrdenadasNombre();
        for (int i = 0; i <listaCategorias.size()-1; i++) {
            cmb_Categorias.addItem(listaCategorias.get(i).getNombre());
        }
    }//GEN-LAST:event_formWindowOpened

    private void txf_PrecioMayoreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_PrecioMayoreoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_PrecioMayoreoKeyPressed

    private void cmb_MedidaAnchuraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_MedidaAnchuraItemStateChanged
        if(cmb_MedidaAnchura.getSelectedIndex()==3){
            txf_Anchura.setEnabled(false);
            txf_Anchura.setText("0");
        }
        else{
            txf_Anchura.setEnabled(true);
        }
    }//GEN-LAST:event_cmb_MedidaAnchuraItemStateChanged

    private void cmb_TipoContenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_TipoContenidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_TipoContenidoActionPerformed
    private MaskFormatter getNumFormat() {
        MaskFormatter MF = null;

        try {
            MF = new MaskFormatter("###"); //Tres digitos.
        } catch (Exception e) {
            e.printStackTrace();
        }

        return MF;
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddProducto;
    private javax.swing.JButton btn_Atras;
    private javax.swing.JComboBox<String> cmb_Categorias;
    private javax.swing.JComboBox<String> cmb_Estatus;
    private javax.swing.JComboBox<String> cmb_MedidaAnchura;
    private javax.swing.JComboBox<String> cmb_Presentacion;
    private javax.swing.JComboBox<String> cmb_TipoContenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txf_Anchura;
    private javax.swing.JTextField txf_Color;
    private javax.swing.JTextField txf_Contenido;
    private javax.swing.JTextField txf_Descripcion;
    private javax.swing.JTextField txf_EAN;
    private javax.swing.JTextField txf_Material;
    private javax.swing.JTextField txf_Nombre;
    private javax.swing.JTextField txf_PrecioCompra;
    private javax.swing.JTextField txf_PrecioMayoreo;
    private javax.swing.JTextField txf_PrecioMenudeo;
    // End of variables declaration//GEN-END:variables
}
