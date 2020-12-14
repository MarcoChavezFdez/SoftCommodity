/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Conexion.ConexionBD;
import Modelos.CorteCaja;
import Modelos.DetalleRetiro;
import Modelos.Retiro;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Time;
import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco Chavez
 */
public class RealizarRetiroFrame extends javax.swing.JFrame {

    /**
     * Creates new form RealizarRetiroFrame
     */
    ConexionBD conexion;
    CorteCaja corteActual;
    Float montoDisponible;
    
    public RealizarRetiroFrame(ConexionBD conexion, CorteCaja corte) {
        initComponents();
        this.conexion = conexion;
        this.corteActual = corte;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btn_Atras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txf_MontoaRetirar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txf_Login = new javax.swing.JTextField();
        psf_Password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txf_MontoDisponible = new javax.swing.JTextField();
        btn_Retiro = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lbl_Mensaje = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btn_Atras.setText("atras");
        btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtrasActionPerformed(evt);
            }
        });

        jLabel1.setText("Monto a Retirar");

        txf_MontoaRetirar.setText("0.00");
        txf_MontoaRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_MontoaRetirarActionPerformed(evt);
            }
        });
        txf_MontoaRetirar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txf_MontoaRetirarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txf_MontoaRetirarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txf_MontoaRetirarKeyTyped(evt);
            }
        });

        jLabel2.setText("Usuario Admin");

        txf_Login.setText("admin");
        txf_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_LoginActionPerformed(evt);
            }
        });

        psf_Password.setText("jPasswordField1");
        psf_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psf_PasswordActionPerformed(evt);
            }
        });

        jLabel3.setText("Contraseña");

        jLabel4.setText("Disponible a Retirar");

        txf_MontoDisponible.setText("0.00");
        txf_MontoDisponible.setEnabled(false);
        txf_MontoDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_MontoDisponibleActionPerformed(evt);
            }
        });

        btn_Retiro.setText("Generar Retiro");
        btn_Retiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RetiroActionPerformed(evt);
            }
        });

        jLabel5.setText("Realizar Retiro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Atras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(107, 107, 107))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(psf_Password)
                            .addComponent(txf_Login)
                            .addComponent(txf_MontoaRetirar)
                            .addComponent(txf_MontoDisponible))))
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(btn_Retiro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(lbl_Mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Atras)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txf_MontoDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txf_MontoaRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txf_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(psf_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Retiro)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txf_MontoDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_MontoDisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_MontoDisponibleActionPerformed

    private void psf_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psf_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psf_PasswordActionPerformed

    private void btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtrasActionPerformed
        CortesMainFrame cortes = new CortesMainFrame(this.conexion, this.corteActual);
        this.setVisible(false);
        cortes.setVisible(true);
    }//GEN-LAST:event_btn_AtrasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        this.montoDisponible = this.corteActual.getFondoInicial() + this.corteActual.getTotalVenta();
        txf_MontoDisponible.setText(String.valueOf(this.montoDisponible));

    }//GEN-LAST:event_formWindowOpened

    private void txf_MontoaRetirarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_MontoaRetirarKeyReleased
        Float montoaRetirar;
        try {
            montoaRetirar = Float.valueOf(txf_MontoaRetirar.getText());
            verificarMonto(montoaRetirar);
        } catch (NumberFormatException e) {
            txf_MontoaRetirar.setText("");
        }
    }//GEN-LAST:event_txf_MontoaRetirarKeyReleased

    private void txf_MontoaRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_MontoaRetirarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_MontoaRetirarActionPerformed

    private void txf_MontoaRetirarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_MontoaRetirarKeyTyped
        

    }//GEN-LAST:event_txf_MontoaRetirarKeyTyped

    private void txf_MontoaRetirarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_MontoaRetirarKeyPressed

    }//GEN-LAST:event_txf_MontoaRetirarKeyPressed

    private void txf_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_LoginActionPerformed

    private void btn_RetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RetiroActionPerformed
        if (this.conexion.consultarUsuarioAutorizado(txf_Login.getText(), String.valueOf(psf_Password.getPassword()))) {
            Retiro nuevoRetiro = new Retiro();
            nuevoRetiro.setIdUsuario(conexion.consultarUsuarioLogin(txf_Login.getText()).getIdUsuario());
            nuevoRetiro.setMonto(Float.valueOf(txf_MontoaRetirar.getText()));
            nuevoRetiro.setHora(Time.valueOf(LocalTime.now()));
            nuevoRetiro.setFecha(this.corteActual.getFecha());
            if (conexion.insertarRetiro(nuevoRetiro)) {
                DetalleRetiro dt = new DetalleRetiro(conexion.consultaUltimoRetiro(), this.corteActual.getIdCorte());
                if (conexion.insertarDetalleRetiro(dt)) {
                    JOptionPane.showMessageDialog(null, "Retiro Exitoso");
                    CortesMainFrame cortes = new CortesMainFrame(this.conexion, this.corteActual);
                    this.setVisible(rootPaneCheckingEnabled);
                    cortes.setVisible(true);
                }
            }
            
        } else {
            lbl_Mensaje.setText("Usuario No Autorizado para realizar Retiros");
        }
    }//GEN-LAST:event_btn_RetiroActionPerformed
    private void verificarMonto(Float montoaRetirar) {
        if (montoaRetirar > this.montoDisponible || montoaRetirar <= 0) {
            btn_Retiro.setEnabled(false);
        } else {
            btn_Retiro.setEnabled(true);
        }
    }
    
    public static float redondeoDecimales(float numero, int numeroDecimales) {
        BigDecimal redondeado = new BigDecimal(numero)
                .setScale(numeroDecimales, RoundingMode.HALF_EVEN);
        return redondeado.floatValue();
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Atras;
    private javax.swing.JButton btn_Retiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_Mensaje;
    private javax.swing.JPasswordField psf_Password;
    private javax.swing.JTextField txf_Login;
    private javax.swing.JTextField txf_MontoDisponible;
    private javax.swing.JTextField txf_MontoaRetirar;
    // End of variables declaration//GEN-END:variables
}
