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
public class RealizarPago extends javax.swing.JFrame {

    /**
     * Creates new form RealizarPago
     */
    public RealizarPago() {
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpCantidad.setBackground(new java.awt.Color(249, 212, 35));
        jpCantidad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb100.setBackground(new java.awt.Color(246, 144, 61));
        jb100.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb100.setText("$100");
        jb100.setToolTipText("");
        jb100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb100ActionPerformed(evt);
            }
        });
        jpCantidad.add(jb100, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 80, 60));

        jb500.setBackground(new java.awt.Color(246, 144, 61));
        jb500.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb500.setText("$500");
        jb500.setToolTipText("");
        jpCantidad.add(jb500, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 80, 60));

        jbPagoExacto.setBackground(new java.awt.Color(246, 144, 61));
        jbPagoExacto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbPagoExacto.setText("$20");
        jbPagoExacto.setToolTipText("");
        jbPagoExacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPagoExactoActionPerformed(evt);
            }
        });
        jpCantidad.add(jbPagoExacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 80, 60));

        jb200.setBackground(new java.awt.Color(246, 144, 61));
        jb200.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb200.setText("$200");
        jb200.setToolTipText("");
        jb200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb200ActionPerformed(evt);
            }
        });
        jpCantidad.add(jb200, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 80, 60));

        jb50.setBackground(new java.awt.Color(246, 144, 61));
        jb50.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb50.setText("$50");
        jb50.setToolTipText("");
        jb50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb50ActionPerformed(evt);
            }
        });
        jpCantidad.add(jb50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 80, 60));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbOk.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jbOk.setText("OK");
        jPanel2.add(jbOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 130, 140));

        jb7.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb7.setText("7");
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });
        jPanel2.add(jb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 70, 70));

        jb4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb4.setText("4");
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });
        jPanel2.add(jb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 70, 70));

        jb1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb1.setText("1");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });
        jPanel2.add(jb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 70, 70));

        jb8.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb8.setText("8");
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });
        jPanel2.add(jb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 70, 70));

        jb5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb5.setText("5");
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });
        jPanel2.add(jb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 70, 70));

        jb0.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb0.setText("0");
        jb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb0ActionPerformed(evt);
            }
        });
        jPanel2.add(jb0, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 70, 70));

        jb3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb3.setText("3");
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });
        jPanel2.add(jb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 70, 70));

        jb6.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb6.setText("6");
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });
        jPanel2.add(jb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 70, 70));

        jb9.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb9.setText("9");
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });
        jPanel2.add(jb9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 70, 70));

        jbBorrar.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jbBorrar.setText("<-");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(jbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, 70));

        jbClear.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jbClear.setText("C");
        jbClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClearActionPerformed(evt);
            }
        });
        jPanel2.add(jbClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 130, 70));

        jb2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb2.setText("2");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });
        jPanel2.add(jb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 70, 70));

        jFormattedTextField1.setEditable(false);
        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("$.00"))));
        jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFormattedTextField1.setToolTipText("");
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 60));

        jpCantidad.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 340, 340));

        jb20.setBackground(new java.awt.Color(246, 144, 61));
        jb20.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb20.setText("$20");
        jb20.setToolTipText("");
        jb20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb20ActionPerformed(evt);
            }
        });
        jpCantidad.add(jb20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 80, 60));

        getContentPane().add(jpCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 550));

        jPanel3.setBackground(new java.awt.Color(246, 144, 61));

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

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 510, 550));

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RealizarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RealizarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealizarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RealizarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealizarPago().setVisible(true);
            }
        });
    }

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
