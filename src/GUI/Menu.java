/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Carlos EsparzadeAnda
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_caja = new javax.swing.JButton();
        btn_Almacen = new javax.swing.JButton();
        btn_logOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_caja.setText("Caja");
        btn_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cajaMouseClicked(evt);
            }
        });
        btn_caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cajaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        btn_Almacen.setText("Almacén");
        btn_Almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AlmacenActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, -1, -1));

        btn_logOut.setText("Cerrar Sesión");
        btn_logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logOutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cajaActionPerformed

    private void btn_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logOutActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_logOutActionPerformed

    private void btn_cajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cajaMouseClicked
        RealizarPago caja = new RealizarPago();
        caja.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cajaMouseClicked

    private void btn_AlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AlmacenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AlmacenActionPerformed

 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Almacen;
    private javax.swing.JButton btn_caja;
    private javax.swing.JButton btn_logOut;
    // End of variables declaration//GEN-END:variables
}
