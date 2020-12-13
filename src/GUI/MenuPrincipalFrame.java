/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Conexion.ConexionBD;
import java.awt.Color;

/**
 *
 * @author Marco Chavez
 */
public class MenuPrincipalFrame extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipalFrame
     */
    ConexionBD conexion;
    public MenuPrincipalFrame(ConexionBD con) {
        this.conexion=con;
        initComponents();
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
        btn_Bodegas = new javax.swing.JButton();
        btn_Reportes = new javax.swing.JButton();
        btn_Ventas = new javax.swing.JButton();
        btn_Productos = new javax.swing.JButton();
        jp_User = new javax.swing.JPanel();
        lbl_Name = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        btn_Usuarios = new javax.swing.JButton();
        btn_Categorias = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal - SoftCommofity+");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Bodegas.setBackground(new java.awt.Color(0, 0, 0));
        btn_Bodegas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Login/Bodegas.png"))); // NOI18N
        btn_Bodegas.setContentAreaFilled(false);
        btn_Bodegas.setMaximumSize(new java.awt.Dimension(277, 305));
        btn_Bodegas.setMinimumSize(new java.awt.Dimension(277, 305));
        btn_Bodegas.setPreferredSize(new java.awt.Dimension(277, 305));
        btn_Bodegas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_BodegasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_BodegasMouseExited(evt);
            }
        });
        btn_Bodegas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BodegasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Bodegas, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 330, 260, 305));

        btn_Reportes.setBackground(new java.awt.Color(18, 17, 17));
        btn_Reportes.setForeground(new java.awt.Color(204, 204, 0));
        btn_Reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Login/Reportes.png"))); // NOI18N
        btn_Reportes.setBorder(new javax.swing.border.MatteBorder(null));
        btn_Reportes.setBorderPainted(false);
        btn_Reportes.setContentAreaFilled(false);
        btn_Reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Reportes.setFocusCycleRoot(true);
        btn_Reportes.setFocusPainted(true);
        btn_Reportes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btn_ReportesMouseDragged(evt);
            }
        });
        btn_Reportes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_ReportesFocusGained(evt);
            }
        });
        btn_Reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ReportesMouseExited(evt);
            }
        });
        btn_Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReportesActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 260, 305));

        btn_Ventas.setBackground(new java.awt.Color(0, 0, 0));
        btn_Ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Login/POS.png"))); // NOI18N
        btn_Ventas.setContentAreaFilled(false);
        btn_Ventas.setMaximumSize(new java.awt.Dimension(277, 305));
        btn_Ventas.setMinimumSize(new java.awt.Dimension(277, 305));
        btn_Ventas.setPreferredSize(new java.awt.Dimension(277, 305));
        btn_Ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_VentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_VentasMouseExited(evt);
            }
        });
        btn_Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VentasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 260, 305));

        btn_Productos.setBackground(new java.awt.Color(0, 0, 0));
        btn_Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Login/Productos.png"))); // NOI18N
        btn_Productos.setContentAreaFilled(false);
        btn_Productos.setMaximumSize(new java.awt.Dimension(277, 305));
        btn_Productos.setMinimumSize(new java.awt.Dimension(277, 305));
        btn_Productos.setPreferredSize(new java.awt.Dimension(277, 305));
        btn_Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ProductosMouseExited(evt);
            }
        });
        btn_Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProductosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 30, 260, 305));

        jp_User.setBackground(new java.awt.Color(0, 0, 0));
        jp_User.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Login/Usuario.png"))); // NOI18N
        jp_User.add(lbl_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Login/Menu.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jp_User.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Login/Cerrar.png"))); // NOI18N
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jp_User.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jPanel1.add(jp_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1, 70, 70));

        btn_Usuarios.setBackground(new java.awt.Color(0, 0, 0));
        btn_Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Login/Usuarios.png"))); // NOI18N
        btn_Usuarios.setContentAreaFilled(false);
        btn_Usuarios.setMaximumSize(new java.awt.Dimension(277, 305));
        btn_Usuarios.setMinimumSize(new java.awt.Dimension(277, 305));
        btn_Usuarios.setPreferredSize(new java.awt.Dimension(277, 305));
        btn_Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UsuariosMouseExited(evt);
            }
        });
        btn_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 260, 305));

        btn_Categorias.setBackground(new java.awt.Color(0, 0, 0));
        btn_Categorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Login/Categorias.png"))); // NOI18N
        btn_Categorias.setContentAreaFilled(false);
        btn_Categorias.setMaximumSize(new java.awt.Dimension(277, 305));
        btn_Categorias.setMinimumSize(new java.awt.Dimension(277, 305));
        btn_Categorias.setPreferredSize(new java.awt.Dimension(277, 305));
        btn_Categorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CategoriasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CategoriasMouseExited(evt);
            }
        });
        btn_Categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CategoriasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 260, 305));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VentasActionPerformed
        VentasMainFrame ventas = new VentasMainFrame(this.conexion);
        this.setVisible(false);
        ventas.setVisible(true);
    }//GEN-LAST:event_btn_VentasActionPerformed

    private void btn_ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProductosActionPerformed
        ProductosMainFrame Productos = new ProductosMainFrame(this.conexion);
        
        this.setVisible(false);
        Productos.setVisible(true);
    }//GEN-LAST:event_btn_ProductosActionPerformed

    private void btn_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UsuariosActionPerformed
        UsuariosMainFrame usuarios = new UsuariosMainFrame(this.conexion);
        usuarios.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_UsuariosActionPerformed

    private void btn_BodegasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BodegasActionPerformed
        BodegasMainFrame bodegas = new BodegasMainFrame (this.conexion);
        bodegas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_BodegasActionPerformed

    private void btn_CategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CategoriasActionPerformed
        CategoriasMainFrame categorias = new CategoriasMainFrame(this.conexion);
        categorias.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_CategoriasActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(jp_User.getWidth()==100){
            jp_User.setSize(350, 1200);
              jp_User.setBackground(Color.LIGHT_GRAY );
        }
        else{
            jp_User.setSize(100, 100);
              jp_User.setBackground(Color.BLACK );
        }
      
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btn_ReportesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReportesFocusGained
 
    }//GEN-LAST:event_btn_ReportesFocusGained

    private void btn_ReportesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReportesMouseDragged
  
    }//GEN-LAST:event_btn_ReportesMouseDragged

    private void btn_ReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReportesMouseEntered
         btn_Reportes.setContentAreaFilled(true);
    }//GEN-LAST:event_btn_ReportesMouseEntered

    private void btn_ReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReportesMouseExited
         btn_Reportes.setContentAreaFilled(false);// TODO add your handling code here:
    }//GEN-LAST:event_btn_ReportesMouseExited

    private void btn_VentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VentasMouseEntered
           btn_Ventas.setContentAreaFilled(true); // TODO add your handling code here:
    }//GEN-LAST:event_btn_VentasMouseEntered

    private void btn_VentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VentasMouseExited
            btn_Ventas.setContentAreaFilled(false);
    }//GEN-LAST:event_btn_VentasMouseExited

    private void btn_ProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProductosMouseExited
      btn_Productos.setContentAreaFilled(false);
    }//GEN-LAST:event_btn_ProductosMouseExited

    private void btn_ProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProductosMouseEntered
 btn_Productos.setContentAreaFilled(true);
    }//GEN-LAST:event_btn_ProductosMouseEntered

    private void btn_CategoriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CategoriasMouseEntered
        btn_Categorias.setContentAreaFilled(true);
    }//GEN-LAST:event_btn_CategoriasMouseEntered

    private void btn_CategoriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CategoriasMouseExited
        btn_Categorias.setContentAreaFilled(false);
    }//GEN-LAST:event_btn_CategoriasMouseExited

    private void btn_UsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UsuariosMouseEntered
        btn_Usuarios.setContentAreaFilled(true);
    }//GEN-LAST:event_btn_UsuariosMouseEntered

    private void btn_UsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UsuariosMouseExited
        btn_Usuarios.setContentAreaFilled(false);
    }//GEN-LAST:event_btn_UsuariosMouseExited

    private void btn_ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ReportesActionPerformed

    private void btn_BodegasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BodegasMouseEntered
          btn_Bodegas.setContentAreaFilled(true);
    }//GEN-LAST:event_btn_BodegasMouseEntered

    private void btn_BodegasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BodegasMouseExited
           btn_Bodegas.setContentAreaFilled(false);
    }//GEN-LAST:event_btn_BodegasMouseExited
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lbl_Name.setText(conexion.getUser().getNombre());
    }//GEN-LAST:event_formWindowOpened
                                      

                              

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Bodegas;
    private javax.swing.JButton btn_Categorias;
    private javax.swing.JButton btn_Productos;
    private javax.swing.JButton btn_Reportes;
    private javax.swing.JButton btn_Usuarios;
    private javax.swing.JButton btn_Ventas;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jp_User;
    private javax.swing.JLabel lbl_Name;
    // End of variables declaration//GEN-END:variables
}
