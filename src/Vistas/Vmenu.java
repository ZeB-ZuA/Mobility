/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Vmenu extends javax.swing.JFrame {

    int Mx, My;

    public Vmenu() {
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
        pnl_Actualizar = new javax.swing.JPanel();
        lbl_Actualizar = new javax.swing.JLabel();
        pnl_Registro = new javax.swing.JPanel();
        lbl_Registro = new javax.swing.JLabel();
        pnl_Informe1 = new javax.swing.JPanel();
        lbl_Informe1 = new javax.swing.JLabel();
        pnl_Busqueda = new javax.swing.JPanel();
        lbl_Busqueda = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_Titulo = new javax.swing.JLabel();
        pnl_Barra = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        lbl_exit = new javax.swing.JLabel();
        lbl_mregistro = new javax.swing.JLabel();
        pnl_comparendos = new javax.swing.JPanel();
        lbl_comparendos = new javax.swing.JLabel();

        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_Actualizar.setBackground(new java.awt.Color(136, 212, 234));

        lbl_Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoActualizar.png"))); // NOI18N
        lbl_Actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_ActualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_ActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_ActualizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_ActualizarLayout = new javax.swing.GroupLayout(pnl_Actualizar);
        pnl_Actualizar.setLayout(pnl_ActualizarLayout);
        pnl_ActualizarLayout.setHorizontalGroup(
            pnl_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_ActualizarLayout.setVerticalGroup(
            pnl_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(pnl_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 140, 100));

        pnl_Registro.setBackground(new java.awt.Color(78, 184, 222));

        lbl_Registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoRegistro.png"))); // NOI18N
        lbl_Registro.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl_RegistroMouseMoved(evt);
            }
        });
        lbl_Registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_RegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_RegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_RegistroMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_RegistroMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnl_RegistroLayout = new javax.swing.GroupLayout(pnl_Registro);
        pnl_Registro.setLayout(pnl_RegistroLayout);
        pnl_RegistroLayout.setHorizontalGroup(
            pnl_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Registro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_RegistroLayout.setVerticalGroup(
            pnl_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Registro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(pnl_Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 200, 190));

        pnl_Informe1.setBackground(new java.awt.Color(0, 93, 139));

        lbl_Informe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoInforme.png"))); // NOI18N
        lbl_Informe1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Informe1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_Informe1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_Informe1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_Informe1Layout = new javax.swing.GroupLayout(pnl_Informe1);
        pnl_Informe1.setLayout(pnl_Informe1Layout);
        pnl_Informe1Layout.setHorizontalGroup(
            pnl_Informe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Informe1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_Informe1Layout.setVerticalGroup(
            pnl_Informe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Informe1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(pnl_Informe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 140, 90));

        pnl_Busqueda.setBackground(new java.awt.Color(0, 134, 190));

        lbl_Busqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoBusqueda.png"))); // NOI18N
        lbl_Busqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_BusquedaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_BusquedaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_BusquedaMouseExited(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout pnl_BusquedaLayout = new javax.swing.GroupLayout(pnl_Busqueda);
        pnl_Busqueda.setLayout(pnl_BusquedaLayout);
        pnl_BusquedaLayout.setHorizontalGroup(
            pnl_BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_BusquedaLayout.setVerticalGroup(
            pnl_BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BusquedaLayout.createSequentialGroup()
                .addComponent(lbl_Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 94, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(pnl_Busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 340, 100));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setAutoscrolls(true);
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 400, 10));

        lbl_Titulo.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        lbl_Titulo.setText("MENÙ");
        jPanel1.add(lbl_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

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
            .addComponent(lbl_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(pnl_Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 370, 30));

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
        jPanel1.add(lbl_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));
        jPanel1.add(lbl_mregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        pnl_comparendos.setBackground(new java.awt.Color(136, 212, 234));

        lbl_comparendos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoComparendos.png"))); // NOI18N

        javax.swing.GroupLayout pnl_comparendosLayout = new javax.swing.GroupLayout(pnl_comparendos);
        pnl_comparendos.setLayout(pnl_comparendosLayout);
        pnl_comparendosLayout.setHorizontalGroup(
            pnl_comparendosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_comparendos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_comparendosLayout.setVerticalGroup(
            pnl_comparendosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_comparendos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(pnl_comparendos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 340, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 490));

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

    private void lbl_RegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RegistroMouseEntered

//        pnl_Registro.setBackground(new Color(78, 184, 222, 200));
//        lbl_mregistro.setText("Registrarse");


    }//GEN-LAST:event_lbl_RegistroMouseEntered

    private void lbl_RegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RegistroMouseExited

//        pnl_Registro.setBackground(new Color(78, 184, 222));
//        lbl_mregistro.setText("");


    }//GEN-LAST:event_lbl_RegistroMouseExited

    private void lbl_ActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ActualizarMouseEntered

      


    }//GEN-LAST:event_lbl_ActualizarMouseEntered

    private void lbl_ActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ActualizarMouseExited
   


    }//GEN-LAST:event_lbl_ActualizarMouseExited

    private void lbl_Informe1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Informe1MouseEntered

     
       

    }//GEN-LAST:event_lbl_Informe1MouseEntered

    private void lbl_Informe1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Informe1MouseExited



    }//GEN-LAST:event_lbl_Informe1MouseExited

    private void lbl_BusquedaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_BusquedaMouseEntered

      
    }//GEN-LAST:event_lbl_BusquedaMouseEntered

    private void lbl_RegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RegistroMouseClicked

    }//GEN-LAST:event_lbl_RegistroMouseClicked

    private void lbl_ActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ActualizarMouseClicked

    }//GEN-LAST:event_lbl_ActualizarMouseClicked

    private void lbl_BusquedaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_BusquedaMouseExited
 
        
    }//GEN-LAST:event_lbl_BusquedaMouseExited
    private void lbl_RegistroMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RegistroMouseMoved

    }//GEN-LAST:event_lbl_RegistroMouseMoved

    private void lbl_Informe1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Informe1MouseClicked

    }//GEN-LAST:event_lbl_Informe1MouseClicked

    private void lbl_BusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_BusquedaMouseClicked
        
    }//GEN-LAST:event_lbl_BusquedaMouseClicked

    private void lbl_RegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RegistroMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_RegistroMousePressed

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
            java.util.logging.Logger.getLogger(Vmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Vmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel lbl_Actualizar;
    public javax.swing.JLabel lbl_Busqueda;
    public javax.swing.JLabel lbl_Informe1;
    public javax.swing.JLabel lbl_Registro;
    private javax.swing.JLabel lbl_Titulo;
    public javax.swing.JLabel lbl_comparendos;
    public javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_logo;
    public javax.swing.JLabel lbl_mregistro;
    public javax.swing.JPanel pnl_Actualizar;
    public javax.swing.JPanel pnl_Barra;
    public javax.swing.JPanel pnl_Busqueda;
    public javax.swing.JPanel pnl_Informe1;
    public javax.swing.JPanel pnl_Registro;
    public javax.swing.JPanel pnl_comparendos;
    // End of variables declaration//GEN-END:variables
}
