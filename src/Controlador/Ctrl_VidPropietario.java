/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vistas.*;
import Modelo.*;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ZEB
 */
public class Ctrl_VidPropietario implements MouseListener {

    private Vmenu vm;
    private VidPropietario vip;
    private VaccionActu vaa;

    public Ctrl_VidPropietario(Vmenu vm, VidPropietario vip, VaccionActu vaa) {
        this.vm = vm;
        this.vip = vip;
        this.vaa = vaa;
        this.vip.lbl_Ingresar.addMouseListener(this);
        this.vip.lbl_Volver.addMouseListener(this);
        this.vip.txt_Id.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vip.lbl_Ingresar) {
             if (vip.txt_Id.getText().isEmpty()||vip.txt_Id.getText().equals("Cédula")) {
            JOptionPane.showMessageDialog(null,"Campos de texto Vacio.");
        } else {
             vaa.setVisible(true);
             vaa.lbl_idclave.setText(vip.txt_Id.getText());
             vip.pnl_ingresar.requestFocusInWindow();
             vip.txt_Id.setForeground(Color.gray);
             vip.txt_Id.setText("Cédula");
             vip.setVisible(false);
        }

        }
        if (e.getSource() == vip.lbl_Volver) {
            vm.setVisible(true);
            vip.dispose();

        }
        if (e.getSource() == vip.txt_Id) {
            if (vip.txt_Id.getText().equals("Cédula")) {
                vip.txt_Id.setText("");
                vip.txt_Id.setForeground(Color.black);
            }
        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == vip.lbl_Volver) {
            vip.pnl_Volver.setBackground(new Color(70, 181, 255));

        }
        if (e.getSource() == vip.lbl_Ingresar) {
            vip.pnl_ingresar.setBackground(new Color(70, 181, 255));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == vip.lbl_Volver) {
            vip.pnl_Volver.setBackground(new Color(0, 153, 255));

        }
        if (e.getSource() == vip.lbl_Ingresar) {
            vip.pnl_ingresar.setBackground(new Color(0, 153, 255));

        }

    }

    
    
    
    
    
    
    
    
    
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }
}
