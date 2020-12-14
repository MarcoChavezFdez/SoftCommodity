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
public class AddReporte extends javax.swing.JFrame {

    /**
     * Creates new form AddBodegaFrame
     */
    ConexionBD conexion;

    public AddReporte(ConexionBD conexion) {
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
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txf_Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbl_Mensaje = new javax.swing.JLabel();
        btn_AddBodega = new javax.swing.JButton();

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
        jLabel2.setText("Nombre de la Bodega :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

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
        jPanel2.add(txf_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Crear un nuevo Reporte");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        lbl_Mensaje.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(lbl_Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 139, 19));

        btn_AddBodega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Bodega/Añadir.png"))); // NOI18N
        btn_AddBodega.setBorderPainted(false);
        btn_AddBodega.setContentAreaFilled(false);
        btn_AddBodega.setEnabled(false);
        btn_AddBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddBodegaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_AddBodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

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

    private void btn_AddBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddBodegaActionPerformed
        Bodega addBodega = new Bodega();
        addBodega.setNombre(txf_Nombre.getText());
        try {
            if (conexion.insertarBodega(addBodega)) {
                JOptionPane.showMessageDialog(null, "Bodega Añadida con Exito");
                BodegasMainFrame bodega = new BodegasMainFrame(this.conexion);
                bodega.setVisible(true);
                this.setVisible(false);

            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
    }//GEN-LAST:event_btn_AddBodegaActionPerformed

    private void txf_NombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_NombreKeyPressed

    }//GEN-LAST:event_txf_NombreKeyPressed

    private void txf_NombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_NombreKeyReleased
        if (conexion.consultarBodegaRegistrada(txf_Nombre.getText())) {
            lbl_Mensaje.setText("Ya existe esa bodega");
            btn_AddBodega.setEnabled(false);
        } else {
            lbl_Mensaje.setText("");
            btn_AddBodega.setEnabled(true);
        }
    }//GEN-LAST:event_txf_NombreKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddBodega;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_Mensaje;
    private javax.swing.JTextField txf_Nombre;
    // End of variables declaration//GEN-END:variables
}
