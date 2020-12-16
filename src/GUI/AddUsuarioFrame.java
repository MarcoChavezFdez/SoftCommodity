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
 * @Docente: Dr. FranciAsco Rodríguez Díaz
 * @Asignatura: Ing. de Software
 * @Escuela: Instituto Tecnologico de Estudios Superiores de Zamora
 * @Semestre : 7
 * @Grupo: B
 * @Carrera: Ing. en Sistemas Computacionales
 *
 * Esta clase es la encargada generar la interface para que el usuario pueda
 * agregar un usuario nuevo a la tabla de usuario de la base de de datos, asi
 * como todos los eventos necesarios para la interaccion con el usuario
 *
 */
package GUI;

import Conexion.ConexionBD;
import Modelos.Usuario;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco Chavez
 */
public class AddUsuarioFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddUsuario
     */
    ConexionBD conexion;

    public AddUsuarioFrame(ConexionBD conexion) {
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

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        cmb_Estatus = new javax.swing.JComboBox<>();
        txf_Nombre = new javax.swing.JTextField();
        cmb_Rol = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btn_AddUsuario = new javax.swing.JButton();
        txf_ApellidoPaterno = new javax.swing.JTextField();
        btn_Atras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbl_MensajePassw = new javax.swing.JLabel();
        txf_ApellidoMaterno = new javax.swing.JTextField();
        lbl_MensajeLogin = new javax.swing.JLabel();
        txf_CURP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txf_Direccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txf_Telefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txf_Email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txf_Login = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txf_Passw1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txf_Passw2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SoftCommodity+ by White Company® ");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Estatus");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, -1, -1));

        cmb_Estatus.setBackground(new java.awt.Color(237, 174, 195));
        cmb_Estatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cmb_Estatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_EstatusActionPerformed(evt);
            }
        });
        jPanel1.add(cmb_Estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, -1));

        txf_Nombre.setBackground(new java.awt.Color(237, 174, 195));
        txf_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_NombreActionPerformed(evt);
            }
        });
        jPanel1.add(txf_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 158, -1));

        cmb_Rol.setBackground(new java.awt.Color(237, 174, 195));
        cmb_Rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cajero" }));
        jPanel1.add(cmb_Rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido Paterno");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        btn_AddUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Añadir.png"))); // NOI18N
        btn_AddUsuario.setBorderPainted(false);
        btn_AddUsuario.setContentAreaFilled(false);
        btn_AddUsuario.setEnabled(false);
        btn_AddUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btn_AddUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

        txf_ApellidoPaterno.setBackground(new java.awt.Color(237, 174, 195));
        jPanel1.add(txf_ApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 158, -1));

        btn_Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Volver.png"))); // NOI18N
        btn_Atras.setBorderPainted(false);
        btn_Atras.setContentAreaFilled(false);
        btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido Materno");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        lbl_MensajePassw.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lbl_MensajePassw, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 193, 22));

        txf_ApellidoMaterno.setBackground(new java.awt.Color(237, 174, 195));
        txf_ApellidoMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_ApellidoMaternoActionPerformed(evt);
            }
        });
        jPanel1.add(txf_ApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 168, -1));

        lbl_MensajeLogin.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lbl_MensajeLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 260, 22));

        txf_CURP.setBackground(new java.awt.Color(237, 174, 195));
        txf_CURP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_CURPActionPerformed(evt);
            }
        });
        jPanel1.add(txf_CURP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 168, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CURP");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dirección");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        txf_Direccion.setBackground(new java.awt.Color(237, 174, 195));
        jPanel1.add(txf_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 168, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Teléfono");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        txf_Telefono.setBackground(new java.awt.Color(237, 174, 195));
        txf_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_TelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(txf_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 160, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        txf_Email.setBackground(new java.awt.Color(237, 174, 195));
        jPanel1.add(txf_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 160, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Rol");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        txf_Login.setBackground(new java.awt.Color(237, 174, 195));
        txf_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txf_LoginKeyReleased(evt);
            }
        });
        jPanel1.add(txf_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 160, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contraseña");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Login");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        txf_Passw1.setBackground(new java.awt.Color(237, 174, 195));
        jPanel1.add(txf_Passw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 160, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Repita Contraseña");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));

        txf_Passw2.setBackground(new java.awt.Color(237, 174, 195));
        txf_Passw2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_Passw2ActionPerformed(evt);
            }
        });
        txf_Passw2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txf_Passw2KeyReleased(evt);
            }
        });
        jPanel1.add(txf_Passw2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 160, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Añadir Nuevo Usuario");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo5_Med.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 790, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txf_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_NombreActionPerformed

    private void cmb_EstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_EstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_EstatusActionPerformed

    private void btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtrasActionPerformed
        UsuariosMainFrame usuarios = new UsuariosMainFrame(this.conexion);
        usuarios.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_AtrasActionPerformed

    private void btn_AddUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddUsuarioActionPerformed
        Usuario addUsuario = new Usuario();
        addUsuario.setNombre(txf_Nombre.getText());
        addUsuario.setApellidoPaterno(txf_ApellidoPaterno.getText());
        addUsuario.setApellidoMaterno(txf_ApellidoMaterno.getText());
        addUsuario.setCURP(txf_CURP.getText());
        addUsuario.setDireccion(txf_Direccion.getText());
        addUsuario.setTelefono(txf_Telefono.getText());
        addUsuario.setEmail(txf_Email.getText());
        addUsuario.setRol(cmb_Rol.getItemAt(cmb_Rol.getSelectedIndex()).substring(0, 1));
        addUsuario.setLogin(txf_Login.getText());
        addUsuario.setPassw(txf_Passw1.getText());
        addUsuario.setEstatus(cmb_Estatus.getItemAt(cmb_Estatus.getSelectedIndex()).substring(0, 1));
        try {
            if (conexion.insertarUsuario(addUsuario)) {
                JOptionPane.showMessageDialog(null, "Usuario Añadido con exito");
                UsuariosMainFrame usuarios = new UsuariosMainFrame(this.conexion);
            } else {
                JOptionPane.showMessageDialog(null, "Error al intentar añadir el usuario");
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error al añadir el usuario" + e.getMessage());
        }

    }//GEN-LAST:event_btn_AddUsuarioActionPerformed

    private void txf_ApellidoMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_ApellidoMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_ApellidoMaternoActionPerformed

    private void txf_CURPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_CURPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_CURPActionPerformed

    private void txf_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_TelefonoActionPerformed

    private void txf_Passw2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_Passw2KeyReleased
        if (!txf_Passw2.getText().equals(txf_Passw1.getText())) {
            lbl_MensajePassw.setText("Las Contraseñas no coinciden");
            btn_AddUsuario.setEnabled(false);
        } else {
            lbl_MensajePassw.setText("");
            btn_AddUsuario.setEnabled(true);
        }
    }//GEN-LAST:event_txf_Passw2KeyReleased

    private void txf_Passw2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_Passw2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_Passw2ActionPerformed

    private void txf_LoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_LoginKeyReleased
        if (conexion.consultarUsuarioLoginRegistro(txf_Login.getText())) {
            lbl_MensajeLogin.setText("El Login seleccionado ya existe");

        } else {
            lbl_MensajeLogin.setText("");
        }
    }//GEN-LAST:event_txf_LoginKeyReleased

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddUsuario;
    private javax.swing.JButton btn_Atras;
    private javax.swing.JComboBox<String> cmb_Estatus;
    private javax.swing.JComboBox<String> cmb_Rol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_MensajeLogin;
    private javax.swing.JLabel lbl_MensajePassw;
    private javax.swing.JTextField txf_ApellidoMaterno;
    private javax.swing.JTextField txf_ApellidoPaterno;
    private javax.swing.JTextField txf_CURP;
    private javax.swing.JTextField txf_Direccion;
    private javax.swing.JTextField txf_Email;
    private javax.swing.JTextField txf_Login;
    private javax.swing.JTextField txf_Nombre;
    private javax.swing.JTextField txf_Passw1;
    private javax.swing.JTextField txf_Passw2;
    private javax.swing.JTextField txf_Telefono;
    // End of variables declaration//GEN-END:variables
}
