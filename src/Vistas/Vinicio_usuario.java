package Vistas;

import java.awt.Color;

public class Vinicio_usuario extends javax.swing.JFrame {

    int Mx, My;

    public Vinicio_usuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        btn_logIn.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_exit = new javax.swing.JLabel();
        pnl_Exit = new javax.swing.JPanel();
        pnl_Barra = new javax.swing.JPanel();
        bg_login = new javax.swing.JPanel();
        lbl_longIn = new javax.swing.JLabel();
        lbl_User = new javax.swing.JLabel();
        txt_User = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_pwd = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        pf_pwd = new javax.swing.JPasswordField();
        btn_logIn = new javax.swing.JPanel();
        lbl_Entrar = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_exit.setForeground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(lbl_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        pnl_Exit.setBackground(new java.awt.Color(136, 212, 235));

        javax.swing.GroupLayout pnl_ExitLayout = new javax.swing.GroupLayout(pnl_Exit);
        pnl_Exit.setLayout(pnl_ExitLayout);
        pnl_ExitLayout.setHorizontalGroup(
            pnl_ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pnl_ExitLayout.setVerticalGroup(
            pnl_ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(pnl_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        pnl_Barra.setBackground(new java.awt.Color(136, 212, 235));
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

        javax.swing.GroupLayout pnl_BarraLayout = new javax.swing.GroupLayout(pnl_Barra);
        pnl_Barra.setLayout(pnl_BarraLayout);
        pnl_BarraLayout.setHorizontalGroup(
            pnl_BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        pnl_BarraLayout.setVerticalGroup(
            pnl_BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(pnl_Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 30));

        bg_login.setBackground(new java.awt.Color(255, 255, 255));
        bg_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_longIn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lbl_longIn.setText("INICIAR SESIÓN");
        bg_login.add(lbl_longIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 36, -1, -1));

        lbl_User.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbl_User.setText("USUARIO");
        bg_login.add(lbl_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 88, -1, -1));

        txt_User.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        txt_User.setForeground(new java.awt.Color(204, 204, 204));
        txt_User.setText("Ingrese su nombre de usuario.");
        txt_User.setBorder(null);
        txt_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_UserMousePressed(evt);
            }
        });
        txt_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UserActionPerformed(evt);
            }
        });
        bg_login.add(txt_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 118, 345, 28));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg_login.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 152, 358, 10));

        lbl_pwd.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbl_pwd.setText("CONTRASEÑA");
        bg_login.add(lbl_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 168, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg_login.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 226, 358, 10));

        pf_pwd.setForeground(new java.awt.Color(204, 204, 204));
        pf_pwd.setText("********");
        pf_pwd.setBorder(null);
        pf_pwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pf_pwdMousePressed(evt);
            }
        });
        bg_login.add(pf_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 204, 358, -1));

        btn_logIn.setBackground(new java.awt.Color(0, 134, 190));

        lbl_Entrar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        lbl_Entrar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Entrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Entrar.setText("ENTRAR");
        lbl_Entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_EntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_EntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_EntrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_logInLayout = new javax.swing.GroupLayout(btn_logIn);
        btn_logIn.setLayout(btn_logInLayout);
        btn_logInLayout.setHorizontalGroup(
            btn_logInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Entrar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        btn_logInLayout.setVerticalGroup(
            btn_logInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Entrar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        bg_login.add(btn_logIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 90, 30));

        getContentPane().add(bg_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 370, 320));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login.png"))); // NOI18N
        bg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UserActionPerformed

    private void pnl_BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_BarraMousePressed
        Mx = evt.getX();
        My = evt.getY();


    }//GEN-LAST:event_pnl_BarraMousePressed

    private void pnl_BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - Mx, y - My);
    }//GEN-LAST:event_pnl_BarraMouseDragged

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_exitMouseClicked

    private void lbl_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseEntered

    }//GEN-LAST:event_lbl_exitMouseEntered

    private void lbl_EntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_EntrarMouseEntered
        btn_logIn.setBackground(new Color(0, 145, 206));
    }//GEN-LAST:event_lbl_EntrarMouseEntered

    private void lbl_EntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_EntrarMouseExited

        btn_logIn.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_lbl_EntrarMouseExited

    private void txt_UserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_UserMousePressed
        
        
        if(txt_User.getText().equals("Ingrese su nombre de usuario.")){
        txt_User.setText("");
        txt_User.setForeground(Color.BLACK);
    }
        if(String.valueOf(pf_pwd.getPassword()).isEmpty()){
        pf_pwd.setText("********");
        pf_pwd.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_UserMousePressed

    private void pf_pwdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pf_pwdMousePressed
        
        if(String.valueOf(pf_pwd.getPassword()).equals("********")){
     pf_pwd.setText("");
     pf_pwd.setForeground(Color.black);
        }
        if(txt_User.getText().isEmpty()){
        txt_User.setText("Ingrese su nombre de usuario.");
        txt_User.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_pf_pwdMousePressed

    private void lbl_EntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_EntrarMouseClicked
 
    }//GEN-LAST:event_lbl_EntrarMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vinicio_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vinicio_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vinicio_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vinicio_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vinicio_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JPanel bg_login;
    public javax.swing.JPanel btn_logIn;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel lbl_Entrar;
    public javax.swing.JLabel lbl_User;
    public javax.swing.JLabel lbl_exit;
    public javax.swing.JLabel lbl_longIn;
    public javax.swing.JLabel lbl_pwd;
    public javax.swing.JPasswordField pf_pwd;
    public javax.swing.JPanel pnl_Barra;
    public javax.swing.JPanel pnl_Exit;
    public javax.swing.JTextField txt_User;
    // End of variables declaration//GEN-END:variables
}
