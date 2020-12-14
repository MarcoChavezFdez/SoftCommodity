/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Conexion.ConexionBD;
import Modelos.CorteCaja;
import Modelos.DetalleCorte;
import Modelos.Ticket;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Time;
import java.time.LocalTime;

/**
 *
 * @author Carlos EsparzadeAnda
 */
public class RealizarPagoFrame extends javax.swing.JFrame {

    /**
     * Creates new form RealizarPago
     */
    ConexionBD conexion;
    Ticket ticketAcutal;
    CorteCaja Corte;

    public RealizarPagoFrame(ConexionBD conexion, Ticket ticketActual, CorteCaja corte) {
        initComponents();
        this.conexion = conexion;
        this.ticketAcutal = ticketActual;
        this.Corte = corte;
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
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txf_Efectivo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txf_Cambio = new javax.swing.JTextField();
        btn_Cobrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txf_Total = new javax.swing.JTextField();
        btn_Atras = new javax.swing.JButton();
        jpCantidad = new javax.swing.JPanel();
        jb100 = new javax.swing.JButton();
        btn_500 = new javax.swing.JButton();
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
        ftxf_Cantidad = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jb20 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo3.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SoftCommodity+ by White Company® ");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(29, 29, 29));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Efectivo Recibido");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txf_Efectivo.setText("0.00");
        txf_Efectivo.setEnabled(false);
        jPanel4.add(txf_Efectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 84, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cambio");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        txf_Cambio.setText("0.00");
        txf_Cambio.setEnabled(false);
        txf_Cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_CambioActionPerformed(evt);
            }
        });
        jPanel4.add(txf_Cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 84, -1));

        btn_Cobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/Cobrar.png"))); // NOI18N
        btn_Cobrar.setBorderPainted(false);
        btn_Cobrar.setContentAreaFilled(false);
        btn_Cobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CobrarActionPerformed(evt);
            }
        });
        jPanel4.add(btn_Cobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total Compra");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        txf_Total.setText("0.00");
        txf_Total.setEnabled(false);
        jPanel4.add(txf_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 84, -1));

        btn_Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Volver.png"))); // NOI18N
        btn_Atras.setBorderPainted(false);
        btn_Atras.setContentAreaFilled(false);
        jPanel4.add(btn_Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 550));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 550));

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
        jpCantidad.add(jb100, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 120, 80));

        btn_500.setBackground(new java.awt.Color(246, 144, 61));
        btn_500.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_500.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/500.png"))); // NOI18N
        btn_500.setToolTipText("");
        btn_500.setBorderPainted(false);
        btn_500.setContentAreaFilled(false);
        btn_500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_500ActionPerformed(evt);
            }
        });
        jpCantidad.add(btn_500, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 120, 80));

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
        jpCantidad.add(jbPagoExacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 120, 80));

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
        jpCantidad.add(jb200, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 120, 80));

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
        jpCantidad.add(jb50, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 120, 80));

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
        jPanel2.add(jbOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 130, 140));

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
        jPanel2.add(jb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 70, 70));

        jb5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/5.png"))); // NOI18N
        jb5.setBorderPainted(false);
        jb5.setContentAreaFilled(false);
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });
        jPanel2.add(jb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 70, 70));

        jb0.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/0.png"))); // NOI18N
        jb0.setBorderPainted(false);
        jb0.setContentAreaFilled(false);
        jb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb0ActionPerformed(evt);
            }
        });
        jPanel2.add(jb0, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 70, 70));

        jb3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/3.png"))); // NOI18N
        jb3.setBorderPainted(false);
        jb3.setContentAreaFilled(false);
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });
        jPanel2.add(jb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 70, 70));

        jb6.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/6.png"))); // NOI18N
        jb6.setBorderPainted(false);
        jb6.setContentAreaFilled(false);
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });
        jPanel2.add(jb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 70, 70));

        jb9.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/9.png"))); // NOI18N
        jb9.setBorderPainted(false);
        jb9.setContentAreaFilled(false);
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });
        jPanel2.add(jb9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 70, 70));

        jbBorrar.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jbBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/Fle.png"))); // NOI18N
        jbBorrar.setContentAreaFilled(false);
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(jbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 140, 70));

        jbClear.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jbClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/C.png"))); // NOI18N
        jbClear.setBorderPainted(false);
        jbClear.setContentAreaFilled(false);
        jbClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClearActionPerformed(evt);
            }
        });
        jPanel2.add(jbClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 130, 80));

        jb2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Realizar_Pago/2.png"))); // NOI18N
        jb2.setBorderPainted(false);
        jb2.setContentAreaFilled(false);
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });
        jPanel2.add(jb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 70, 70));

        ftxf_Cantidad.setEditable(false);
        ftxf_Cantidad.setBackground(new java.awt.Color(237, 174, 195));
        ftxf_Cantidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("$.00"))));
        ftxf_Cantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ftxf_Cantidad.setToolTipText("");
        ftxf_Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxf_CantidadActionPerformed(evt);
            }
        });
        jPanel2.add(ftxf_Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo3.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo3.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, -10, -1, -1));

        jpCantidad.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 390, 350));

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
        jpCantidad.add(jb20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 120, 80));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo3.png"))); // NOI18N
        jpCantidad.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo3.png"))); // NOI18N
        jpCantidad.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo3.png"))); // NOI18N
        jpCantidad.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo3.png"))); // NOI18N
        jpCantidad.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -10, -1, -1));

        getContentPane().add(jpCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 550, 550));

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
        ftxf_Cantidad.setText(ftxf_Cantidad.getText().substring(0, ftxf_Cantidad.getText().length() - 1));
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
        ftxf_Cantidad.setText(ftxf_Cantidad.getText() + "8");
    }//GEN-LAST:event_jb8ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
        ftxf_Cantidad.setText(ftxf_Cantidad.getText() + "3");
    }//GEN-LAST:event_jb3ActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        ftxf_Cantidad.setText(ftxf_Cantidad.getText() + "1");
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb20ActionPerformed

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
        ftxf_Cantidad.setText(ftxf_Cantidad.getText() + "7");
    }//GEN-LAST:event_jb7ActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        ftxf_Cantidad.setText(ftxf_Cantidad.getText() + "2");
    }//GEN-LAST:event_jb2ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
        ftxf_Cantidad.setText(ftxf_Cantidad.getText() + "4");
    }//GEN-LAST:event_jb4ActionPerformed

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
        ftxf_Cantidad.setText(ftxf_Cantidad.getText() + "9");
    }//GEN-LAST:event_jb9ActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
        ftxf_Cantidad.setText(ftxf_Cantidad.getText() + "5");
    }//GEN-LAST:event_jb5ActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
        ftxf_Cantidad.setText(ftxf_Cantidad.getText() + "6");
    }//GEN-LAST:event_jb6ActionPerformed

    private void jb0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb0ActionPerformed
        ftxf_Cantidad.setText(ftxf_Cantidad.getText() + "0");
    }//GEN-LAST:event_jb0ActionPerformed

    private void jbClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClearActionPerformed
        ftxf_Cantidad.setText("");
    }//GEN-LAST:event_jbClearActionPerformed

    private void ftxf_CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxf_CantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxf_CantidadActionPerformed

    private void jbOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbOkActionPerformed

    private void btn_500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_500ActionPerformed
        llenaFields("500");
    }//GEN-LAST:event_btn_500ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txf_Total.setText(String.valueOf(this.ticketAcutal.getSubTotal()));
    }//GEN-LAST:event_formWindowOpened

    private void txf_CambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_CambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_CambioActionPerformed

    /**
     * Este evento permite actualizar los datos del ticket que se cobro y
     * regresar al menu principal de cortes Esta Relacionado con el btn_Cobrar
    *
     */
    private void btn_CobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CobrarActionPerformed
        this.ticketAcutal.setHoraVenta(Time.valueOf(LocalTime.now()));
        DetalleCorte dc = new DetalleCorte(this.Corte.getIdCorte(), this.ticketAcutal.getIdTicket());
        this.conexion.actualizarTicket(ticketAcutal);
        this.conexion.insertarDetalleCorte(dc);
        this.Corte.setTotalVenta(this.conexion.consultarCorteCajaTotalVenta(Corte.getIdCorte()));
        this.conexion.actualizarCorteCaja(Corte);
        CortesMainFrame cortesPrincipal = new CortesMainFrame(this.conexion, this.Corte);

        this.setVisible(false);
        cortesPrincipal.setVisible(true);
    }//GEN-LAST:event_btn_CobrarActionPerformed

    public void llenaFields(String cant) {
        Float cambio;
        cambio = Float.valueOf(cant) - this.ticketAcutal.getSubTotal();
        if (cambio < 0) {
            btn_Cobrar.setEnabled(false);

        } else {
            txf_Efectivo.setText(cant);
            txf_Cambio.setText(String.valueOf(cambio));
        }

    }


    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_500;
    private javax.swing.JButton btn_Atras;
    private javax.swing.JButton btn_Cobrar;
    public javax.swing.JFormattedTextField ftxf_Cantidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
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
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbClear;
    private javax.swing.JButton jbOk;
    private javax.swing.JButton jbPagoExacto;
    private javax.swing.JPanel jpCantidad;
    private javax.swing.JTextField txf_Cambio;
    private javax.swing.JTextField txf_Efectivo;
    private javax.swing.JTextField txf_Total;
    // End of variables declaration//GEN-END:variables
}
