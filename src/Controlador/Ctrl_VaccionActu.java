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

public class Ctrl_VaccionActu implements MouseListener {

    private VaccionActu vaa;
    private VmenuActualizar vma;
    private VmenuEliminar vme;
    private Vmenu vm;

    public Ctrl_VaccionActu(VaccionActu vaa, VmenuActualizar vma, VmenuEliminar vme, Vmenu vm) {
        this.vaa = vaa;
        this.vma = vma;
        this.vme = vme;
        this.vm = vm;
        this.vaa.lbl_Actualizar.addMouseListener(this);
        this.vaa.lbl_Elimiar.addMouseListener(this);
        this.vaa.lbl_Salir.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vaa.lbl_Actualizar) {
        vma.setVisible(true);
        vma.lbl_idclave.setText(vaa.lbl_idclave.getText());
        vaa.setVisible(false);
        }
        if (e.getSource() == vaa.lbl_Elimiar) {
        vme.setVisible(true);
        vme.lbl_idclave.setText(vaa.lbl_idclave.getText());
        vaa.setVisible(false);
        }
        if (e.getSource() == vaa.lbl_Salir) {
        vm.setVisible(true);
        vaa.dispose();
        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == vaa.lbl_Actualizar) {
            vaa.pnl_Actualizar.setBackground(new Color(78, 184, 222, 200));
            vaa.lbl_mregistro.setText("Actualizar");
        }
        if (e.getSource() == vaa.lbl_Elimiar) {
            vaa.pnl_Eliminar.setBackground(new Color(136, 212, 234, 200));
            vaa.lbl_mregistro.setText("Eliminar");

        }
        if (e.getSource() == vaa.lbl_Salir) {
            vaa.pnl_Salir.setBackground(new Color(0, 93, 139, 200));
            vaa.lbl_mregistro.setText("Volver");
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == vaa.lbl_Actualizar) {

            vaa.pnl_Actualizar.setBackground(new Color(78, 184, 222));
            vaa.lbl_mregistro.setText("");

        }
        if (e.getSource() == vaa.lbl_Elimiar) {
            vaa.pnl_Eliminar.setBackground(new Color(136, 212, 234));
            vaa.lbl_mregistro.setText("");

        }
        if (e.getSource() == vaa.lbl_Salir) {

            vaa.pnl_Salir.setBackground(new Color(0, 93, 139));
            vaa.lbl_mregistro.setText("");
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }
}
