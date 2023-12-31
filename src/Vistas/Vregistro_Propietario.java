/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Vregistro_Propietario extends javax.swing.JFrame {

    /**
     * Creates new form Registro_Propietario
     */
    public Vregistro_Propietario() {
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
        jLabel3 = new javax.swing.JLabel();
        lbl_Nombres = new javax.swing.JLabel();
        lbl_Apellidos = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_Nombres = new javax.swing.JTextField();
        txt_Apellidos = new javax.swing.JTextField();
        txt_Cc = new javax.swing.JTextField();
        txt_Telefono = new javax.swing.JTextField();
        txt_Email = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        dc_FechaN = new com.toedter.calendar.JDateChooser();
        cmb_Genero = new javax.swing.JComboBox<>();
        pnl_Volver = new javax.swing.JPanel();
        lbl_Volver = new javax.swing.JLabel();
        pnl_Registrar = new javax.swing.JPanel();
        lbl_Registrar = new javax.swing.JLabel();
        pnl_Siguente = new javax.swing.JPanel();
        lbl_Siguiente = new javax.swing.JLabel();

        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Diseño sin título.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 170, 460));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel2.setText("Registro Propietario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 60));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Email:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 50, 20));

        lbl_Nombres.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbl_Nombres.setText("Nombres:");
        jPanel1.add(lbl_Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 20));

        lbl_Apellidos.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbl_Apellidos.setText("Apellidos:");
        jPanel1.add(lbl_Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 20));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("C.C. :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 20));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("Nacimiento:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 20));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("Genero:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 70, 20));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("Télefono:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, 20));

        txt_Nombres.setBorder(null);
        txt_Nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombresActionPerformed(evt);
            }
        });
        txt_Nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NombresKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 270, -1));

        txt_Apellidos.setBorder(null);
        txt_Apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ApellidosKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 270, -1));

        txt_Cc.setBorder(null);
        txt_Cc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CcActionPerformed(evt);
            }
        });
        txt_Cc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CcKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 270, -1));

        txt_Telefono.setBorder(null);
        txt_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 270, -1));

        txt_Email.setBorder(null);
        jPanel1.add(txt_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 270, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 270, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 270, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 270, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 270, 10));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 270, 10));

        dc_FechaN.setRequestFocusEnabled(false);
        jPanel1.add(dc_FechaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 150, 20));

        cmb_Genero.setEditable(true);
        cmb_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "No Binarie", "Fluido", "Helicoptero Apache", "Elefante Guerrero Psiquico Ancestral" }));
        cmb_Genero.setBorder(null);
        cmb_Genero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(cmb_Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 150, 20));

        pnl_Volver.setBackground(new java.awt.Color(0, 153, 255));

        lbl_Volver.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lbl_Volver.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Volver.setText("Volver");
        lbl_Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_VolverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_VolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_VolverMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_VolverLayout = new javax.swing.GroupLayout(pnl_Volver);
        pnl_Volver.setLayout(pnl_VolverLayout);
        pnl_VolverLayout.setHorizontalGroup(
            pnl_VolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_VolverLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_VolverLayout.setVerticalGroup(
            pnl_VolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_VolverLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(pnl_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 90, 30));

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

        jPanel1.add(pnl_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 90, 30));

        pnl_Siguente.setBackground(new java.awt.Color(0, 153, 255));

        lbl_Siguiente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lbl_Siguiente.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Siguiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Siguiente.setText("Siguiente");
        lbl_Siguiente.setToolTipText("");
        lbl_Siguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_SiguienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_SiguienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_SiguienteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_SiguenteLayout = new javax.swing.GroupLayout(pnl_Siguente);
        pnl_Siguente.setLayout(pnl_SiguenteLayout);
        pnl_SiguenteLayout.setHorizontalGroup(
            pnl_SiguenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_SiguenteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_SiguenteLayout.setVerticalGroup(
            pnl_SiguenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_SiguenteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(pnl_Siguente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 90, 30));

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

    private void txt_NombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombresActionPerformed

    private void txt_CcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CcKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        if (txt_Cc.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_CcKeyTyped

    private void txt_NombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NombresKeyTyped
        int key = evt.getKeyChar();
        boolean minuscula = key >= 65 && key <= 90;
        boolean mayuscula = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        if (!(minuscula || mayuscula || espacio)) {
            evt.consume();
        }
        if (txt_Nombres.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_NombresKeyTyped

    private void txt_ApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ApellidosKeyTyped
        int key = evt.getKeyChar();
        boolean minuscula = key >= 65 && key <= 90;
        boolean mayuscula = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        if (!(minuscula || mayuscula || espacio)) {
            evt.consume();
        }
        if (txt_Apellidos.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_ApellidosKeyTyped

    private void txt_CcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CcActionPerformed

    private void txt_TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TelefonoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        if (txt_Telefono.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_TelefonoKeyTyped

    private void lbl_VolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_VolverMouseEntered

    }//GEN-LAST:event_lbl_VolverMouseEntered

    private void lbl_VolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_VolverMouseExited

    }//GEN-LAST:event_lbl_VolverMouseExited

    private void lbl_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_VolverMouseClicked

    }//GEN-LAST:event_lbl_VolverMouseClicked

    private void lbl_RegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RegistrarMouseEntered
       

    }//GEN-LAST:event_lbl_RegistrarMouseEntered

    private void lbl_RegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RegistrarMouseExited
     
    }//GEN-LAST:event_lbl_RegistrarMouseExited

    private void lbl_SiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SiguienteMouseEntered
    }//GEN-LAST:event_lbl_SiguienteMouseEntered

    private void lbl_SiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SiguienteMouseExited
    }//GEN-LAST:event_lbl_SiguienteMouseExited

    private void lbl_SiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SiguienteMouseClicked
      
    }//GEN-LAST:event_lbl_SiguienteMouseClicked

    private void lbl_RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RegistrarMouseClicked

    }//GEN-LAST:event_lbl_RegistrarMouseClicked

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
            java.util.logging.Logger.getLogger(Vregistro_Propietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vregistro_Propietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vregistro_Propietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vregistro_Propietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vregistro_Propietario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cmb_Genero;
    public com.toedter.calendar.JDateChooser dc_FechaN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator7;
    public javax.swing.JLabel lbl_Apellidos;
    public javax.swing.JLabel lbl_Nombres;
    public javax.swing.JLabel lbl_Registrar;
    public javax.swing.JLabel lbl_Siguiente;
    public javax.swing.JLabel lbl_Volver;
    public javax.swing.JPanel pnl_Registrar;
    public javax.swing.JPanel pnl_Siguente;
    public javax.swing.JPanel pnl_Volver;
    public javax.swing.JTextField txt_Apellidos;
    public javax.swing.JTextField txt_Cc;
    public javax.swing.JTextField txt_Email;
    public javax.swing.JTextField txt_Nombres;
    public javax.swing.JTextField txt_Telefono;
    // End of variables declaration//GEN-END:variables
}
