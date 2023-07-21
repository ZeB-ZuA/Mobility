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
import java.util.Random;
import javax.swing.JOptionPane;

public class Ctrl_VmenuComparendos implements MouseListener {

    private Vregistro_Comparendos vrc;
    private Vmenu vm;
    private VmenuComparendos vmc;
    private Vver_comparendos vvc;

    public Ctrl_VmenuComparendos(Vregistro_Comparendos vrc, Vmenu vm, VmenuComparendos vmc , Vver_comparendos vvc) {
        this.vrc = vrc;
        this.vm = vm;
        this.vmc = vmc;
        this.vvc = vvc;
        this.vmc.lbl_Vercomparendos.addMouseListener(this);
        this.vmc.lbl_generarComparendo.addMouseListener(this);
        this.vmc.lbl_Salir.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vmc.lbl_generarComparendo) {
            Random random = new Random();
            int r = random.nextInt(9000) + 1000;
            vrc.setVisible(true);
            vrc.txt_radicado.setText(String.valueOf(r));
            vmc.dispose();
        }

        if (e.getSource() == vmc.lbl_Vercomparendos) {
            vvc.setVisible(true);
            vmc.dispose();
            

        }
        if (e.getSource() == vmc.lbl_Salir) {
            vm.setVisible(true);
            vmc.dispose();
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == vmc.lbl_generarComparendo) {
            vmc.pnl_Generarcom.setBackground(new Color(78, 184, 222));
            vmc.lbl_mregistro.setText("");
        }
        if (e.getSource() == vmc.lbl_Vercomparendos) {
            vmc.pnl_Vercomparendos.setBackground(new Color(136, 212, 234));
            vmc.lbl_mregistro.setText("");

        }
        if (e.getSource() == vmc.lbl_Salir) {
            vmc.pnl_Salir.setBackground(new Color(0, 93, 139));
            vmc.lbl_mregistro.setText("");
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == vmc.lbl_generarComparendo) {
            vmc.pnl_Generarcom.setBackground(new Color(78, 184, 222, 200));
            vmc.lbl_mregistro.setText("Generar Comparendo");
        }
        if (e.getSource() == vmc.lbl_Vercomparendos) {
            vmc.pnl_Vercomparendos.setBackground(new Color(136, 212, 234, 200));
            vmc.lbl_mregistro.setText("Ver Comparendos");
        }
        if (e.getSource() == vmc.lbl_Salir) {
            vmc.pnl_Salir.setBackground(new Color(0, 93, 139, 200));
            vmc.lbl_mregistro.setText("Volver");
        }

    }
}
