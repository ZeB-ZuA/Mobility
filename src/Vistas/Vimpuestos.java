
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Vimpuestos extends javax.swing.JFrame {

    /**
     * Creates new form Registro_Propietario
     */
    public Vimpuestos() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_Placa = new javax.swing.JLabel();
        lbl_nit = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_nit = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txt_anioR = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        pnl_Registrar = new javax.swing.JPanel();
        lbl_Registrar = new javax.swing.JLabel();
        lbl_idclave = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txt_Placa = new javax.swing.JTextField();
        lbl_estadi = new javax.swing.JLabel();
        cmb_estado = new javax.swing.JComboBox<>();
        lbl_estadi1 = new javax.swing.JLabel();
        txt_ValorImp1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bg_Vehiculos1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 170, 380));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setText("Impuesto Vehiculo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 220, 60));

        lbl_Placa.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbl_Placa.setText("Placa:");
        jPanel1.add(lbl_Placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 20));

        lbl_nit.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbl_nit.setText("NIT:");
        jPanel1.add(lbl_nit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 20));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("Valor del Impuesto:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 140, 20));

        txt_nit.setBorder(null);
        txt_nit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nitActionPerformed(evt);
            }
        });
        txt_nit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nitKeyTyped(evt);
            }
        });
        jPanel1.add(txt_nit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 80, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 80, 10));

        txt_anioR.setBorder(null);
        txt_anioR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_anioRActionPerformed(evt);
            }
        });
        txt_anioR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_anioRKeyTyped(evt);
            }
        });
        jPanel1.add(txt_anioR, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 100, 20));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 100, 10));

        pnl_Registrar.setBackground(new java.awt.Color(0, 153, 255));

        lbl_Registrar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lbl_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Registrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Registrar.setText("Registrar");
        lbl_Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_RegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_RegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_RegistrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_RegistrarLayout = new javax.swing.GroupLayout(pnl_Registrar);
        pnl_Registrar.setLayout(pnl_RegistrarLayout);
        pnl_RegistrarLayout.setHorizontalGroup(
            pnl_RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_RegistrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_RegistrarLayout.setVerticalGroup(
            pnl_RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_RegistrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(pnl_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 90, 30));
        jPanel1.add(lbl_idclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 110, 20));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 100, 10));

        txt_Placa.setBorder(null);
        txt_Placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PlacaActionPerformed(evt);
            }
        });
        txt_Placa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PlacaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 106, 80, 20));

        lbl_estadi.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbl_estadi.setText("Año de registro:");
        jPanel1.add(lbl_estadi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 20));

        cmb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PAGO", "EN MORA", "PAGANDO" }));
        cmb_estado.setSelectedItem("");
        jPanel1.add(cmb_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        lbl_estadi1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbl_estadi1.setText("Estado:");
        jPanel1.add(lbl_estadi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, 20));

        txt_ValorImp1.setBorder(null);
        txt_ValorImp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ValorImp1ActionPerformed(evt);
            }
        });
        txt_ValorImp1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ValorImp1KeyTyped(evt);
            }
        });
        jPanel1.add(txt_ValorImp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 100, 20));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 80, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nitActionPerformed

    private void txt_nitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nitKeyTyped

        if (txt_nit.getText().length() >= 7) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_nitKeyTyped
   
    private void txt_anioRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_anioRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_anioRActionPerformed

    private void txt_anioRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_anioRKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_anioRKeyTyped

    private void lbl_RegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RegistrarMouseEntered
       
    }//GEN-LAST:event_lbl_RegistrarMouseEntered

    private void lbl_RegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RegistrarMouseExited
       
    }//GEN-LAST:event_lbl_RegistrarMouseExited

    private void lbl_RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RegistrarMouseClicked
       

    }//GEN-LAST:event_lbl_RegistrarMouseClicked

    private void txt_PlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PlacaActionPerformed

    private void txt_PlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PlacaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PlacaKeyTyped

    private void txt_ValorImp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ValorImp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ValorImp1ActionPerformed

    private void txt_ValorImp1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ValorImp1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ValorImp1KeyTyped

    /**
     * @param args the command line argument
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vimpuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vimpuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vimpuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vimpuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vimpuestos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cmb_estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    public javax.swing.JLabel lbl_Placa;
    public javax.swing.JLabel lbl_Registrar;
    public javax.swing.JLabel lbl_estadi;
    public javax.swing.JLabel lbl_estadi1;
    public javax.swing.JLabel lbl_idclave;
    public javax.swing.JLabel lbl_nit;
    public javax.swing.JPanel pnl_Registrar;
    public javax.swing.JTextField txt_Placa;
    public javax.swing.JTextField txt_ValorImp1;
    public javax.swing.JTextField txt_anioR;
    public javax.swing.JTextField txt_nit;
    // End of variables declaration//GEN-END:variables
}
