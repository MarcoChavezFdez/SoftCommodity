/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Conexion.ConexionBD;
import Modelos.Bodega;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco Chavez
 */
public class ModificarBodegaFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddBodegaFrame
     */
    ConexionBD conexion;
    Bodega bodega;
    public ModificarBodegaFrame(ConexionBD conexion,Bodega b) {
        initComponents();
        this.conexion = conexion;
        this.bodega=b;
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
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txf_Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbl_Mensaje = new javax.swing.JLabel();
        btn_GuardarBodega = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SoftCommodity+ by White Company® ");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Volver.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nuevo Nombre de la Bodega :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        txf_Nombre.setBackground(new java.awt.Color(237, 174, 195));
        txf_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_NombreActionPerformed(evt);
            }
        });
        txf_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txf_NombreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txf_NombreKeyReleased(evt);
            }
        });
        jPanel2.add(txf_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modificar Bodega");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        lbl_Mensaje.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lbl_Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 139, 19));

        btn_GuardarBodega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Bodega/Modificar.png"))); // NOI18N
        btn_GuardarBodega.setBorderPainted(false);
        btn_GuardarBodega.setContentAreaFilled(false);
        btn_GuardarBodega.setEnabled(false);
        btn_GuardarBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarBodegaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_GuardarBodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo5.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -40, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 540, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BodegasMainFrame bodegas = new BodegasMainFrame(this.conexion);
        bodegas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txf_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_NombreActionPerformed

    private void btn_GuardarBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarBodegaActionPerformed
        
        this.bodega.setNombre(txf_Nombre.getText());
        try {
            if (conexion.actualizarBodega(this.bodega)) {
                JOptionPane.showMessageDialog(null, "Bodega Modificada con Exito");
                BodegasMainFrame menuBodega = new BodegasMainFrame(this.conexion);
                menuBodega.setVisible(true);
                this.setVisible(false);

            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
    }//GEN-LAST:event_btn_GuardarBodegaActionPerformed

    private void txf_NombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_NombreKeyPressed

    }//GEN-LAST:event_txf_NombreKeyPressed

    private void txf_NombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_NombreKeyReleased
        if (conexion.consultarBodegaRegistrada(txf_Nombre.getText())) {
            lbl_Mensaje.setText("Ya existe esa bodega");
            btn_GuardarBodega.setEnabled(false);
        } else {
            lbl_Mensaje.setText("");
            btn_GuardarBodega.setEnabled(true);
        }
    }//GEN-LAST:event_txf_NombreKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_GuardarBodega;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_Mensaje;
    private javax.swing.JTextField txf_Nombre;
    // End of variables declaration//GEN-END:variables
}
