package Vistas;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VplacaVehiculo extends javax.swing.JFrame {

    int My;
    int Mx;

    public VplacaVehiculo() {
        initComponents();
        this.setLocationRelativeTo(null);
        pnl_ingresar.requestFocusInWindow();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_bg = new javax.swing.JPanel();
        pnl_Barra = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        lbl_exit = new javax.swing.JLabel();
        txt_Placa = new javax.swing.JTextField();
        lbl_Titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnl_Volver = new javax.swing.JPanel();
        lbl_Volver = new javax.swing.JLabel();
        pnl_ingresar = new javax.swing.JPanel();
        lbl_Ingresar = new javax.swing.JLabel();

        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_bg.setBackground(new java.awt.Color(255, 255, 255));

        pnl_Barra.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_BarraMouseDragged(evt);
            }
        });
        pnl_Barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_BarraMousePressed(evt);
            }
        });

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minilogo.png"))); // NOI18N

        javax.swing.GroupLayout pnl_BarraLayout = new javax.swing.GroupLayout(pnl_Barra);
        pnl_Barra.setLayout(pnl_BarraLayout);
        pnl_BarraLayout.setHorizontalGroup(
            pnl_BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_BarraLayout.createSequentialGroup()
                .addContainerGap(303, Short.MAX_VALUE)
                .addComponent(lbl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_BarraLayout.setVerticalGroup(
            pnl_BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        lbl_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_exit.setText("X");
        lbl_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_exitMouseEntered(evt);
            }
        });

        txt_Placa.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txt_Placa.setForeground(new java.awt.Color(204, 204, 204));
        txt_Placa.setText("Placa");
        txt_Placa.setBorder(null);
        txt_Placa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_PlacaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_PlacaMousePressed(evt);
            }
        });
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

        lbl_Titulo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lbl_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Titulo.setText("Placa del Vehiculo a actualizar");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        pnl_Volver.setBackground(new java.awt.Color(0, 153, 255));

        lbl_Volver.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbl_Volver.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Volver.setText("Volver");
        lbl_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addComponent(lbl_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        pnl_VolverLayout.setVerticalGroup(
            pnl_VolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        pnl_ingresar.setBackground(new java.awt.Color(0, 153, 255));

        lbl_Ingresar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbl_Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Ingresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Ingresar.setText("Ingresar");
        lbl_Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_IngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_IngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_IngresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_ingresarLayout = new javax.swing.GroupLayout(pnl_ingresar);
        pnl_ingresar.setLayout(pnl_ingresarLayout);
        pnl_ingresarLayout.setHorizontalGroup(
            pnl_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        pnl_ingresarLayout.setVerticalGroup(
            pnl_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_bgLayout = new javax.swing.GroupLayout(pnl_bg);
        pnl_bg.setLayout(pnl_bgLayout);
        pnl_bgLayout.setHorizontalGroup(
            pnl_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_bgLayout.createSequentialGroup()
                .addComponent(lbl_exit, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addGroup(pnl_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Titulo)
                    .addComponent(pnl_Barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_bgLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(pnl_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnl_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(pnl_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_Placa, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))))
        );
        pnl_bgLayout.setVerticalGroup(
            pnl_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_bgLayout.createSequentialGroup()
                .addGroup(pnl_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_Barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(pnl_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 424, 245));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnl_BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - Mx, y - My);
    }//GEN-LAST:event_pnl_BarraMouseDragged

    private void pnl_BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_BarraMousePressed
        Mx = evt.getX();
        My = evt.getY();
    }//GEN-LAST:event_pnl_BarraMousePressed

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_exitMouseClicked

    private void lbl_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseEntered

    }//GEN-LAST:event_lbl_exitMouseEntered

    private void txt_PlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PlacaKeyTyped
        int key = evt.getKeyChar();
        if (txt_Placa.getText().length() >= 7) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_PlacaKeyTyped

    private void txt_PlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PlacaActionPerformed

    }//GEN-LAST:event_txt_PlacaActionPerformed

    private void txt_PlacaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_PlacaMousePressed
        
    }//GEN-LAST:event_txt_PlacaMousePressed

    private void lbl_VolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_VolverMouseExited
        
    }//GEN-LAST:event_lbl_VolverMouseExited

    private void lbl_VolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_VolverMouseEntered

      
    }//GEN-LAST:event_lbl_VolverMouseEntered

    private void lbl_IngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_IngresarMouseEntered
       
    }//GEN-LAST:event_lbl_IngresarMouseEntered

    private void lbl_IngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_IngresarMouseExited
       

    }//GEN-LAST:event_lbl_IngresarMouseExited

    private void lbl_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_VolverMouseClicked
        
    }//GEN-LAST:event_lbl_VolverMouseClicked
    
    private void lbl_IngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_IngresarMouseClicked

        


    }//GEN-LAST:event_lbl_IngresarMouseClicked

    private void txt_PlacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_PlacaMouseClicked

    }//GEN-LAST:event_txt_PlacaMouseClicked

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
            java.util.logging.Logger.getLogger(VplacaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VplacaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VplacaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VplacaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VplacaVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel lbl_Ingresar;
    private javax.swing.JLabel lbl_Titulo;
    public javax.swing.JLabel lbl_Volver;
    public javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_logo;
    public javax.swing.JPanel pnl_Barra;
    public javax.swing.JPanel pnl_Volver;
    public javax.swing.JPanel pnl_bg;
    public javax.swing.JPanel pnl_ingresar;
    public javax.swing.JTextField txt_Placa;
    // End of variables declaration//GEN-END:variables
}
