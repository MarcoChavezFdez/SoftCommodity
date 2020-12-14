/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Conexion.ConexionBD;
import Modelos.Producto;
import Modelos.Usuario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marco Chavez
 */
public class UsuariosMainFrame extends javax.swing.JFrame {

    /**
     * Creates new form UsuariosMain
     */
    ConexionBD conexion;

    public UsuariosMainFrame(ConexionBD conexion) {
        initComponents();
        this.conexion = conexion;
        ArrayList<Usuario> lista = conexion.consultarUsuarios();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Datos = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_AddUsuario = new javax.swing.JButton();
        btn_EliminarBodega = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_ModificarUsuario = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

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

        tbl_Datos.setBackground(new java.awt.Color(237, 174, 195));
        tbl_Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IdBodega", "Nombre", "Apellido Paterno", "Apellido Materno", "CURP", "Direccion", "Telefono", "Email", "Rol", "Login", "Passw", "Estatus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Datos.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tbl_Datos);
        tbl_Datos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 1013, 420));

        jComboBox1.setBackground(new java.awt.Color(237, 174, 195));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Volver.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar por:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        btn_AddUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Añadir.png"))); // NOI18N
        btn_AddUsuario.setBorderPainted(false);
        btn_AddUsuario.setContentAreaFilled(false);
        btn_AddUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btn_AddUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

        btn_EliminarBodega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Eliminar.png"))); // NOI18N
        btn_EliminarBodega.setBorderPainted(false);
        btn_EliminarBodega.setContentAreaFilled(false);
        btn_EliminarBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarBodegaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_EliminarBodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuarios Registrados");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        btn_ModificarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Modificar.png"))); // NOI18N
        btn_ModificarUsuario.setBorderPainted(false);
        btn_ModificarUsuario.setContentAreaFilled(false);
        jPanel1.add(btn_ModificarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, -1, -1));

        jTextField1.setBackground(new java.awt.Color(237, 174, 195));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 233, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo5_Gra.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -110, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 1160, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AddUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddUsuarioActionPerformed
        AddUsuarioFrame addUsuarioFrame = new AddUsuarioFrame(this.conexion);
        addUsuarioFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_AddUsuarioActionPerformed

    private void btn_EliminarBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarBodegaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EliminarBodegaActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MenuPrincipalFrame menu = new MenuPrincipalFrame(this.conexion);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened

    private void llenarTabla(ArrayList<Usuario> lista) {
        String[] encabezado = {"IdUsuario", "Nombre", "Apellido Paterno", "Apellido Materno", "CURP", "Direccion", "Telefono", "Email", "Rol", "Login", "Contraseña", "Estatus"};
        Object[][] datos = new Object[lista.size()][12];
        int ren = 0;
        for (Usuario u : lista) {
            datos[ren][0] = u.getIdUsuario();
            datos[ren][1] = u.getNombre();
            datos[ren][2] = u.getApellidoPaterno();
            datos[ren][3] = u.getApellidoMaterno();
            datos[ren][4] = u.getCURP();
            datos[ren][5] = u.getDireccion();
            datos[ren][6] = u.getTelefono();
            datos[ren][7] = u.getEmail();
            datos[ren][8] = u.getRol();
            datos[ren][9] = u.getLogin();
            datos[ren][10] = "***********";
            datos[ren][11] = u.getEstatus();
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
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddUsuario;
    private javax.swing.JButton btn_EliminarBodega;
    private javax.swing.JButton btn_ModificarUsuario;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbl_Datos;
    // End of variables declaration//GEN-END:variables
}
