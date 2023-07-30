/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import Vistas.*;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;

public class Ctrl_Vregistro_Comparendos implements MouseListener {

    private Vregistro_Comparendos vrc;
    private VmenuComparendos vmc;
    private DAO_comparendo daoc;
    private DTO_comparendo dtoc;
    private DAO_pagos_comparendo daopc;
    private DTO_pagos_comparendo dtopc;
   

    public Ctrl_Vregistro_Comparendos(Vregistro_Comparendos vrc, VmenuComparendos vmc, DAO_comparendo daoc, DTO_comparendo dtoc, DAO_pagos_comparendo daopc, DTO_pagos_comparendo dtopc) {
        this.vrc = vrc;
        this.vmc = vmc;
        this.daoc = daoc;
        this.dtoc = dtoc;
        this.daopc = daopc;
        this.dtopc = dtopc;
        this.vrc.lbl_Registrar.addMouseListener(this);
        this.vrc.lbl_Volver.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == vrc.lbl_Registrar) {
            Random random = new Random();
            int r = random.nextInt(9000) + 1000;
            Date date = vrc.dc_Fecha.getDate();
            long d = date.getTime();
            java.sql.Date fecha = new java.sql.Date(d);
            dtoc.setRadicado(Integer.parseInt(vrc.txt_radicado.getText()));
            dtoc.setCc(Long.parseLong(vrc.txt_Cc.getText()));
            dtoc.setDescripcion(vrc.txtp_descrip.getText());
            dtoc.setFecha(fecha);
            dtoc.setValor(Double.parseDouble(vrc.txt_Valor.getText()));
            if (daoc.create(dtoc)) {
                JOptionPane.showMessageDialog(null, "Comparendo Registrado", "Comparendos", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar Comparendos", "Comparendos", 1);

            }
  
            String estado=(String) vrc.cmb_estado.getSelectedItem();;
            dtopc.setCod_trans(r);
            dtopc.setCc(Long.parseLong(vrc.txt_Cc.getText()));
            dtopc.setRadicado(Integer.parseInt(vrc.txt_radicado.getText()));
            dtopc.setEstado(estado);
            if (daopc.create(dtopc)) {
                vmc.setVisible(true);
                vrc.dispose();
            }
            
            
            
            
            
                      
            

        }
        if (e.getSource() == vrc.lbl_Volver) {
            vmc.setVisible(true);
            vrc.dispose();
        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == vrc.lbl_Registrar) {
            vrc.pnl_Registrar.setBackground(new Color(0, 181, 255));
        }
        if (e.getSource() == vrc.lbl_Volver) {
            vrc.pnl_Volver.setBackground(new Color(0, 181, 255));

        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == vrc.lbl_Registrar) {
            vrc.pnl_Registrar.setBackground(new Color(0, 153, 255));
        }
        if (e.getSource() == vrc.lbl_Volver) {
            vrc.pnl_Volver.setBackground(new Color(0, 153, 255));
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

}
