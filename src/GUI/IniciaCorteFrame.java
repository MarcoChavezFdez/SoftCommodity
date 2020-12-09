/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Conexion.ConexionBD;
import Modelos.Venta;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco Chavez
 */
public class IniciaCorteFrame extends javax.swing.JFrame {

    /**
     * Creates new form IniciaCorteFrame
     */
    ConexionBD conexion;
    Venta ventaActual;
    public IniciaCorteFrame(ConexionBD conexion,Venta ventaActual) {
        initComponents();
        this.conexion=conexion;
        this.ventaActual=ventaActual;
       
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
        txf_FondoInicial = new javax.swing.JTextField();
        btn_Siguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Fondo Inicial");

        txf_FondoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_FondoInicialActionPerformed(evt);
            }
        });

        btn_Siguiente.setText("Siguiente");
        btn_Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txf_FondoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btn_Siguiente)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txf_FondoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btn_Siguiente)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SiguienteActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Confirmme que ha recibido su fondo inicial de $"+txf_FondoInicial.getText(), "Confirmar Fondo Inicial Recibido", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            CortesMainFrame cortesMain = new CortesMainFrame(this.conexion,this.ventaActual);
            cortesMain.setVisible(true);
            this.setVisible(false);
        } else {
            txf_FondoInicial.setText("0.0");
        }
    }//GEN-LAST:event_btn_SiguienteActionPerformed

    private void txf_FondoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_FondoInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_FondoInicialActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Siguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txf_FondoInicial;
    // End of variables declaration//GEN-END:variables
}
