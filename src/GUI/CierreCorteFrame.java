/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Conexion.ConexionBD;
import Modelos.CorteCaja;
import java.sql.Time;
import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco Chavez
 */
public class CierreCorteFrame extends javax.swing.JFrame {

    /**
     * Creates new form CierreCorteFrame
     */
    ConexionBD conexion;
    CorteCaja corte;

    public CierreCorteFrame(ConexionBD conexion, CorteCaja corte) {
        initComponents();
        this.conexion = conexion;
        this.corte = corte;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txf_Nombre = new javax.swing.JTextField();
        txf_FondoInicial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txf_TotalVenta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txf_TotalCorte = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txf_TotalRetiros = new javax.swing.JTextField();
        btn_Continuar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Usuario Corte");

        jLabel3.setText("Fondo Incial: $");

        txf_Nombre.setEditable(false);
        txf_Nombre.setEnabled(false);

        txf_FondoInicial.setEditable(false);
        txf_FondoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_FondoInicialActionPerformed(evt);
            }
        });

        jLabel4.setText("Total Venta: $");

        txf_TotalVenta.setEditable(false);

        jLabel5.setText("Total Retiros: $");

        txf_TotalCorte.setEditable(false);
        txf_TotalCorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_TotalCorteActionPerformed(evt);
            }
        });

        jLabel6.setText("Total Corte: $");

        txf_TotalRetiros.setEditable(false);
        txf_TotalRetiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_TotalRetirosActionPerformed(evt);
            }
        });

        btn_Continuar.setText("Continuar");
        btn_Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ContinuarActionPerformed(evt);
            }
        });

        jLabel2.setText("Cierre de Corte");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txf_FondoInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                .addComponent(txf_TotalVenta)
                                .addComponent(txf_TotalRetiros)
                                .addComponent(txf_Nombre))
                            .addComponent(txf_TotalCorte, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(btn_Continuar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel2)))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txf_FondoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txf_TotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txf_TotalRetiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txf_TotalCorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btn_Continuar)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txf_TotalCorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_TotalCorteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_TotalCorteActionPerformed

    private void txf_TotalRetirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_TotalRetirosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_TotalRetirosActionPerformed

    private void btn_ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ContinuarActionPerformed
        this.corte.setEstatus("C");
        this.corte.setHoraFinal(Time.valueOf(LocalTime.now()));
        if (this.conexion.actualizarCorteCaja(corte)) {
            JOptionPane.showMessageDialog(null, "Corte Cerrado");
            LoginFrame menu = new LoginFrame();
            menu.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Tuvimos un problema para actualizar su corte, contacte al tecnico de whitecompany");
        }
    }//GEN-LAST:event_btn_ContinuarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txf_Nombre.setText(this.conexion.getUser().getNombre());
        txf_FondoInicial.setText(String.valueOf(this.corte.getFondoInicial()));
        txf_TotalVenta.setText(String.valueOf(this.corte.getTotalVenta()));
        this.corte.setTotalRetiros(this.conexion.consultarCorteCajaTotalRetiros(this.corte.getIdCorte()));
        txf_TotalRetiros.setText(String.valueOf(this.corte.getTotalRetiros()));
        this.corte.setTotalCorte(this.corte.getFondoInicial() + this.corte.getTotalVenta() - this.corte.getTotalRetiros());
        txf_TotalCorte.setText(String.valueOf(this.corte.getTotalCorte()));
    }//GEN-LAST:event_formWindowOpened

    private void txf_FondoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_FondoInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_FondoInicialActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Continuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txf_FondoInicial;
    private javax.swing.JTextField txf_Nombre;
    private javax.swing.JTextField txf_TotalCorte;
    private javax.swing.JTextField txf_TotalRetiros;
    private javax.swing.JTextField txf_TotalVenta;
    // End of variables declaration//GEN-END:variables
}
