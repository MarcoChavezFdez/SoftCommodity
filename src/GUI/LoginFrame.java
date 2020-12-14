/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Conexion.ConexionBD;
import Modelos.Usuario;
import java.awt.event.KeyEvent;

/**
 *
 * @author Marco Chavez
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginFrame() {
        initComponents();
        jOptionPane1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        lbl_Error = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        swingTimerTimingSource1 = new org.jdesktop.swing.animation.timing.sources.SwingTimerTimingSource();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtF_Usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPass_Usuario = new javax.swing.JPasswordField();
        jl_Mensajes = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jDialog1.getContentPane().setLayout(new java.awt.GridLayout(3, 0, 0, 3));

        lbl_Error.setText("Error");
        jDialog1.getContentPane().add(lbl_Error);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo4.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo4.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SoftCommodity+ by White Company® ");
        setBackground(new java.awt.Color(204, 82, 122));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(204, 82, 122));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(232, 23, 93));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        txtF_Usuario.setBackground(new java.awt.Color(237, 174, 195));
        txtF_Usuario.setText("Benja");
        txtF_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtF_UsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(txtF_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 90, -1));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btn_Ingresar.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        jPass_Usuario.setBackground(new java.awt.Color(237, 174, 195));
        jPass_Usuario.setText("Hola.123");
        jPass_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPass_UsuarioActionPerformed(evt);
            }
        });
        jPass_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPass_UsuarioKeyReleased(evt);
            }
        });
        jPanel2.add(jPass_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 90, -1));

        jl_Mensajes.setForeground(new java.awt.Color(204, 0, 51));
        jPanel2.add(jl_Mensajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 220, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LOGO_SoftCommodity+_V1.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 290, 130));

        jOptionPane1.setBackground(new java.awt.Color(237, 174, 195));
        jOptionPane1.setForeground(new java.awt.Color(237, 174, 195));
        jOptionPane1.setMessage("El usuario o contraseña no existen");
        jOptionPane1.setEnabled(false);
        jOptionPane1.setFocusable(false);
        jPanel2.add(jOptionPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo3.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo3.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, -70, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPass_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPass_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPass_UsuarioActionPerformed

    private void txtF_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_UsuarioActionPerformed

    }//GEN-LAST:event_txtF_UsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ConexionBD conexion = new ConexionBD();
        conexion.conectado();
        try {
            String login = txtF_Usuario.getText();
            String pass = jPass_Usuario.getText();
            Usuario currentUser = conexion.consultarUsuarioLogin(login);

            if (currentUser.getIdUsuario() == null) {
                jOptionPane1.showMessageDialog(rootPane, "El usuario que ingreso no existe");
            } else if (currentUser.getPassw().equals(pass)) {
                MenuPrincipalFrame menu = new MenuPrincipalFrame(conexion);
                menu.setVisible(true);
                conexion.setUser(conexion.consultarUsuarioLogin(login));
                this.setVisible(false);

            } else {
                jOptionPane1.showMessageDialog(rootPane, "Usuario y/o contraseñas incorrecctos");
            }

        } catch (Exception e) {
            System.out.println("Error");
            lbl_Error.setText(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPass_UsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPass_UsuarioKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER ){
             ConexionBD conexion = new ConexionBD();
        conexion.conectado();
        try {
            String login = txtF_Usuario.getText();
            String pass = jPass_Usuario.getText();
            Usuario currentUser = conexion.consultarUsuarioLogin(login);

            if (currentUser.getIdUsuario() == null) {
                jOptionPane1.showMessageDialog(rootPane, "El usuario que ingreso no existe");
            } else if (currentUser.getPassw().equals(pass)) {
                MenuPrincipalFrame menu = new MenuPrincipalFrame(conexion);
                menu.setVisible(true);
                conexion.setUser(conexion.consultarUsuarioLogin(login));
                this.setVisible(false);

            } else {
                jOptionPane1.showMessageDialog(rootPane, "Usuario y/o contraseñas incorrecctos");
            }

        } catch (Exception e) {
            System.out.println("Error");
            lbl_Error.setText(e.getMessage());
        }
        }
    }//GEN-LAST:event_jPass_UsuarioKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPass_Usuario;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel jl_Mensajes;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lbl_Error;
    private org.jdesktop.swing.animation.timing.sources.SwingTimerTimingSource swingTimerTimingSource1;
    private javax.swing.JTextField txtF_Usuario;
    // End of variables declaration//GEN-END:variables
}
