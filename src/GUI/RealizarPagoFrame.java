/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.TextField;

/**
 *
 * @author Carlos EsparzadeAnda
 */
public class RealizarPagoFrame extends javax.swing.JFrame {

    /**
     * Creates new form RealizarPago
     */
    public RealizarPagoFrame() {
        initComponents();
        this.setLocationRelativeTo(null);

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
        jpCantidad = new javax.swing.JPanel();
        jb100 = new javax.swing.JButton();
        jb500 = new javax.swing.JButton();
        jbPagoExacto = new javax.swing.JButton();
        jb200 = new javax.swing.JButton();
        jb50 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbOk = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb1 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb0 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbClear = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jb20 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

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

        jpCantidad.setBackground(new java.awt.Color(0, 0, 0));
        jpCantidad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb100.setBackground(new java.awt.Color(246, 144, 61));
        jb100.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/100.png"))); // NOI18N
        jb100.setToolTipText("");
        jb100.setBorderPainted(false);
        jb100.setContentAreaFilled(false);
        jb100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb100ActionPerformed(evt);
            }
        });
        jpCantidad.add(jb100, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 120, 80));

        jb500.setBackground(new java.awt.Color(246, 144, 61));
        jb500.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb500.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/500.png"))); // NOI18N
        jb500.setToolTipText("");
        jb500.setBorderPainted(false);
        jb500.setContentAreaFilled(false);
        jpCantidad.add(jb500, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 80));

        jbPagoExacto.setBackground(new java.awt.Color(246, 144, 61));
        jbPagoExacto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbPagoExacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/Exacto.png"))); // NOI18N
        jbPagoExacto.setToolTipText("");
        jbPagoExacto.setBorderPainted(false);
        jbPagoExacto.setContentAreaFilled(false);
        jbPagoExacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPagoExactoActionPerformed(evt);
            }
        });
        jpCantidad.add(jbPagoExacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 120, 80));

        jb200.setBackground(new java.awt.Color(246, 144, 61));
        jb200.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb200.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/200.png"))); // NOI18N
        jb200.setToolTipText("");
        jb200.setBorderPainted(false);
        jb200.setContentAreaFilled(false);
        jb200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb200ActionPerformed(evt);
            }
        });
        jpCantidad.add(jb200, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 120, 80));

        jb50.setBackground(new java.awt.Color(246, 144, 61));
        jb50.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/50.png"))); // NOI18N
        jb50.setToolTipText("");
        jb50.setBorderPainted(false);
        jb50.setContentAreaFilled(false);
        jb50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb50ActionPerformed(evt);
            }
        });
        jpCantidad.add(jb50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, 80));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbOk.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jbOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/Ok.png"))); // NOI18N
        jbOk.setBorderPainted(false);
        jbOk.setContentAreaFilled(false);
        jbOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOkActionPerformed(evt);
            }
        });
        jPanel2.add(jbOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 130, 140));

        jb7.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/7.png"))); // NOI18N
        jb7.setContentAreaFilled(false);
        jb7.setDefaultCapable(false);
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });
        jPanel2.add(jb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, 70));

        jb4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/4.png"))); // NOI18N
        jb4.setAlignmentY(0.0F);
        jb4.setBorderPainted(false);
        jb4.setContentAreaFilled(false);
        jb4.setDefaultCapable(false);
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });
        jPanel2.add(jb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 70, 70));

        jb1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/1.png"))); // NOI18N
        jb1.setBorderPainted(false);
        jb1.setContentAreaFilled(false);
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });
        jPanel2.add(jb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 70, 70));

        jb8.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/8.png"))); // NOI18N
        jb8.setBorderPainted(false);
        jb8.setContentAreaFilled(false);
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });
        jPanel2.add(jb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 70, 70));

        jb5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/5.png"))); // NOI18N
        jb5.setBorderPainted(false);
        jb5.setContentAreaFilled(false);
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });
        jPanel2.add(jb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 70, 70));

        jb0.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/0.png"))); // NOI18N
        jb0.setBorderPainted(false);
        jb0.setContentAreaFilled(false);
        jb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb0ActionPerformed(evt);
            }
        });
        jPanel2.add(jb0, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 70, 70));

        jb3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/3.png"))); // NOI18N
        jb3.setBorderPainted(false);
        jb3.setContentAreaFilled(false);
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });
        jPanel2.add(jb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 70, 70));

        jb6.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/6.png"))); // NOI18N
        jb6.setBorderPainted(false);
        jb6.setContentAreaFilled(false);
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });
        jPanel2.add(jb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 70, 70));

        jb9.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/9.png"))); // NOI18N
        jb9.setBorderPainted(false);
        jb9.setContentAreaFilled(false);
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });
        jPanel2.add(jb9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 70, 70));

        jbBorrar.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jbBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/Fle.png"))); // NOI18N
        jbBorrar.setContentAreaFilled(false);
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(jbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 140, 70));

        jbClear.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jbClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/C.png"))); // NOI18N
        jbClear.setBorderPainted(false);
        jbClear.setContentAreaFilled(false);
        jbClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClearActionPerformed(evt);
            }
        });
        jPanel2.add(jbClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 130, 80));

        jb2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/2.png"))); // NOI18N
        jb2.setBorderPainted(false);
        jb2.setContentAreaFilled(false);
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });
        jPanel2.add(jb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 70, 70));

        jFormattedTextField1.setEditable(false);
        jFormattedTextField1.setBackground(new java.awt.Color(237, 174, 195));
        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("$.00"))));
        jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFormattedTextField1.setToolTipText("");
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 340, 60));

        jpCantidad.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 360, 350));

        jb20.setBackground(new java.awt.Color(246, 144, 61));
        jb20.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/20.png"))); // NOI18N
        jb20.setToolTipText("");
        jb20.setBorderPainted(false);
        jb20.setContentAreaFilled(false);
        jb20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb20ActionPerformed(evt);
            }
        });
        jpCantidad.add(jb20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 120, 80));

        getContentPane().add(jpCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 550));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 510, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb100ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb100ActionPerformed

    private void jbPagoExactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPagoExactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPagoExactoActionPerformed

    private void jb200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb200ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb200ActionPerformed

    private void jb50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb50ActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
       jFormattedTextField1.setText(jFormattedTextField1.getText().substring(0, jFormattedTextField1.getText().length()-1));
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
               jFormattedTextField1.setText(jFormattedTextField1.getText()+"8");
    }//GEN-LAST:event_jb8ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
             jFormattedTextField1.setText(jFormattedTextField1.getText()+"3");
    }//GEN-LAST:event_jb3ActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
               jFormattedTextField1.setText(jFormattedTextField1.getText()+"1");
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb20ActionPerformed

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
        jFormattedTextField1.setText(jFormattedTextField1.getText()+"7");
    }//GEN-LAST:event_jb7ActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
             jFormattedTextField1.setText(jFormattedTextField1.getText()+"2");
    }//GEN-LAST:event_jb2ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
            jFormattedTextField1.setText(jFormattedTextField1.getText()+"4");
    }//GEN-LAST:event_jb4ActionPerformed

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
             jFormattedTextField1.setText(jFormattedTextField1.getText()+"9");
    }//GEN-LAST:event_jb9ActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
             jFormattedTextField1.setText(jFormattedTextField1.getText()+"5");
    }//GEN-LAST:event_jb5ActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
              jFormattedTextField1.setText(jFormattedTextField1.getText()+"6");
    }//GEN-LAST:event_jb6ActionPerformed

    private void jb0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb0ActionPerformed
              jFormattedTextField1.setText(jFormattedTextField1.getText()+"0");
    }//GEN-LAST:event_jb0ActionPerformed

    private void jbClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClearActionPerformed
        jFormattedTextField1.setText("");
    }//GEN-LAST:event_jbClearActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jbOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbOkActionPerformed
 
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jb0;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb100;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb20;
    private javax.swing.JButton jb200;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb50;
    private javax.swing.JButton jb500;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbClear;
    private javax.swing.JButton jbOk;
    private javax.swing.JButton jbPagoExacto;
    private javax.swing.JPanel jpCantidad;
    // End of variables declaration//GEN-END:variables
}
