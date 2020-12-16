/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Conexion.ConexionBD;
import Modelos.Categoria;
import Modelos.Reporte;
import java.awt.HeadlessException;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco Chavez
 */
public class AddReporteVentaFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddCategoriaFrame
     */
    ConexionBD conexion;

    public AddReporteVentaFrame(ConexionBD conexion) {
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

        jPanel1 = new javax.swing.JPanel();
        lbl_Mensaje = new javax.swing.JLabel();
        dp_FechaInicial = new com.github.lgooddatepicker.components.DatePicker();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_AddReporte = new javax.swing.JButton();
        btn_Atras = new javax.swing.JButton();
        dp_FechaFinal = new com.github.lgooddatepicker.components.DatePicker();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SoftCommodity+ by White Company® ");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Mensaje.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbl_Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 160, 20));

        dp_FechaInicial.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dp_FechaInicialPropertyChange(evt);
            }
        });
        jPanel1.add(dp_FechaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha Final:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Crear Reporte de Venta");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        btn_AddReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Categoria/Añadir.png"))); // NOI18N
        btn_AddReporte.setToolTipText("");
        btn_AddReporte.setBorderPainted(false);
        btn_AddReporte.setContentAreaFilled(false);
        btn_AddReporte.setEnabled(false);
        btn_AddReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddReporteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_AddReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 350, 100));

        btn_Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Volver.png"))); // NOI18N
        btn_Atras.setBorderPainted(false);
        btn_Atras.setContentAreaFilled(false);
        btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        dp_FechaFinal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dp_FechaFinalPropertyChange(evt);
            }
        });
        jPanel1.add(dp_FechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Inicial:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo5.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 10, -1, -1));

        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtrasActionPerformed
        ReporteVentasMainFrame reportes = new ReporteVentasMainFrame(this.conexion);
        this.setVisible(false);
        reportes.setVisible(true);
    }//GEN-LAST:event_btn_AtrasActionPerformed

    private void btn_AddReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddReporteActionPerformed
        Reporte nuevoReporte = new Reporte();
        nuevoReporte.setFechaInicial(convertirFecha(dp_FechaInicial.getDate()));
        nuevoReporte.setFechaFinal(convertirFecha(dp_FechaFinal.getDate()));
    }//GEN-LAST:event_btn_AddReporteActionPerformed

    private void dp_FechaFinalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dp_FechaFinalPropertyChange
        checaFechas();
    }//GEN-LAST:event_dp_FechaFinalPropertyChange

    private void dp_FechaInicialPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dp_FechaInicialPropertyChange
        checaFechas();
    }//GEN-LAST:event_dp_FechaInicialPropertyChange

    private void checaFechas() {
        try {
            Date fechaFinal = convertirFecha(dp_FechaFinal.getDate());
            Date fechaInicial = convertirFecha(dp_FechaInicial.getDate());
            if (!fechaFinal.before(Date.valueOf(LocalDate.now())) || fechaInicial.after(fechaFinal)) {
                lbl_Mensaje.setText("Fechas No Validas");
                btn_AddReporte.setEnabled(false);
            } else {
                btn_AddReporte.setEnabled(true);
                lbl_Mensaje.setText("");
            }
        } catch (Exception e) {

        }
    }

    /**
     * @param dateToConvert es la fecha que se quiere convertir
     * @return es la fecha convertida en Date
     *
     */
    public Date convertirFecha(LocalDate dateToConvert) {
        return java.sql.Date.valueOf(dateToConvert);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddReporte;
    private javax.swing.JButton btn_Atras;
    private com.github.lgooddatepicker.components.DatePicker dp_FechaFinal;
    private com.github.lgooddatepicker.components.DatePicker dp_FechaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Mensaje;
    // End of variables declaration//GEN-END:variables
}
