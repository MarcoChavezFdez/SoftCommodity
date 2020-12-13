/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Conexion.ConexionBD;
import Modelos.CorteCaja;
import Modelos.Venta;
import java.sql.Date;

/**
 *
 * @author Marco Chavez
 */
public class CortesMainFrame extends javax.swing.JFrame {

    /**
     * Creates new form CortesMainFrame
     */
    ConexionBD conexion;
    Venta ventaActual;
    CorteCaja CorteActual;

    public CortesMainFrame(ConexionBD conexion, Venta ventaActual, CorteCaja corte) {
        initComponents();
        this.conexion = conexion;
        this.ventaActual = ventaActual;
        this.CorteActual = corte;
        recuperaCorte();
        llenaEtiquetas();
    }

    public CortesMainFrame(ConexionBD conexion, Venta ventaActual, Float fondoInicial) {
        initComponents();
        this.conexion = conexion;
        this.ventaActual = ventaActual;
        inicializarCorte(fondoInicial);
        llenaEtiquetas();
        
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lbl_CorteId = new javax.swing.JLabel();
        lbl_CorteId1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_TotalCorte = new javax.swing.JLabel();
        btn_Atras = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_Nombre = new javax.swing.JLabel();

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

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Cortes/Reimprimir_Retiro.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setDefaultCapable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Cortes/Generar_Ticket.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setPreferredSize(new java.awt.Dimension(243, 219));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Cortes/Realizar_Retiro.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        lbl_CorteId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_CorteId.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_CorteId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 90, 30));

        lbl_CorteId1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_CorteId1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_CorteId1.setText("Corte ID");
        jPanel1.add(lbl_CorteId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total $");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, 20));

        lbl_TotalCorte.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_TotalCorte.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_TotalCorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 79, 20));

        btn_Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Volver.png"))); // NOI18N
        btn_Atras.setBorderPainted(false);
        btn_Atras.setContentAreaFilled(false);
        btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Cortes/Cerrar_Corte.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, -1));

        btn_Nombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_Nombre.setForeground(new java.awt.Color(255, 0, 255));
        btn_Nombre.setText("Cortes");
        jPanel1.add(btn_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -20, 770, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened
    private void llenaEtiquetas() {
        lbl_CorteId.setText(String.valueOf(this.CorteActual.getIdCorte()));
        System.out.println("");
         this.CorteActual.setTotalVenta(conexion.calcularTotalVentaCorte(CorteActual));
         System.out.println(String.valueOf(this.CorteActual.getTotalVenta()));
        if(CorteActual.getTotalVenta()==null){
             lbl_TotalCorte.setText("0.00");
        }
        else{
              lbl_TotalCorte.setText(String.valueOf(this.CorteActual.getTotalVenta()));
        }
        
 
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtrasActionPerformed
        VentasMainFrame ventas = new VentasMainFrame(this.conexion);
        ventas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_AtrasActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TicketMainFrame addTicket = new TicketMainFrame(this.conexion,this.CorteActual);
        addTicket.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
    btn_Nombre.setText("Generar Ticket");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
       btn_Nombre.setText("Cortes");   // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseExited
    private void inicializarCorte(Float fondoInicial) {
        java.util.Date utilDate = new java.util.Date();
        java.sql.Time hora = new java.sql.Time(utilDate.getTime());
        java.sql.Date fecha = new java.sql.Date(utilDate.getTime());
        CorteCaja nuevoCorte = new CorteCaja();
        nuevoCorte.setIdUsuario(this.conexion.getUser().getIdUsuario());
        nuevoCorte.setFondoInicial(fondoInicial);
        nuevoCorte.setTotalVenta(0.0f);
        nuevoCorte.setTotalRetiros(0.0f);
        nuevoCorte.setTotalCorte(0.0f);
        nuevoCorte.setHoraInicial(hora);
        nuevoCorte.setEstatus("A");
        nuevoCorte.setFecha(fecha);
        if (conexion.insertarCorteCaja(nuevoCorte)) {
            this.CorteActual = nuevoCorte;
        }
        recuperaCorte();
    }

    private void recuperaCorte() {
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date fecha = new java.sql.Date(utilDate.getTime());
        this.CorteActual = conexion.consultaCorteCaja(fecha, conexion.getUser().getIdUsuario());
        this.CorteActual.toString();
    }

    private void cierraCorte() {
        this.CorteActual.setEstatus("C");
        /*
        Calcular total venta
        Calcular Total Retiros
        Descontar el totla de los retiros
         */

    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Atras;
    private javax.swing.JLabel btn_Nombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_CorteId;
    private javax.swing.JLabel lbl_CorteId1;
    private javax.swing.JLabel lbl_TotalCorte;
    // End of variables declaration//GEN-END:variables
}
