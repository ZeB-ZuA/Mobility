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

public class Ctrl_VmenuActualizar implements MouseListener {

    private VmenuActualizar vma;
    private Vactualizar_Propietario vap;
    private VplacaVehiculo vpv;
    private Vregistro_Vehiculo vrv;
    private Vmenu vm;

    public Ctrl_VmenuActualizar(VmenuActualizar vma, Vactualizar_Propietario vap, VplacaVehiculo vpv, Vregistro_Vehiculo vrv, Vmenu vm) {
        this.vma = vma;
        this.vap = vap;
        this.vpv = vpv;
        this.vrv = vrv;
        this.vm = vm;
        this.vma.lbl_Propietario.addMouseListener(this);
        this.vma.lbl_Vehiculo.addMouseListener(this);
        this.vma.lbl_Volver.addMouseListener(this);
        this.vma.lbl_AgregarV.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vma.lbl_Propietario) {
            vap.setVisible(true);
            vap.lbl_idclave.setText(vma.lbl_idclave.getText());
            vma.setVisible(false);
        }
        if (e.getSource() == vma.lbl_Vehiculo) {
            vpv.setVisible(true);
            vma.setVisible(false);
        }
        if (e.getSource() == vma.lbl_Volver) {
            vm.setVisible(true);
            vma.setVisible(false);
        }
        if (e.getSource() == vma.lbl_AgregarV) {
         vrv.setVisible(true);
         vrv.lbl_idclave.setText(vma.lbl_idclave.getText());
         vma.setVisible(false);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == vma.lbl_Propietario) {
            vma.pnl_Propietario.setBackground(new Color(78, 184, 222, 200));
            vma.lbl_mregistro.setText("Propietario");
        }
        if (e.getSource() == vma.lbl_Vehiculo) {
            vma.pnl_Vehiculo.setBackground(new Color(136, 212, 234, 200));
            vma.lbl_mregistro.setText("Vehiculo");

        }
        if (e.getSource() == vma.lbl_Volver) {
            vma.pnl_Volver.setBackground(new Color(0, 93, 139, 200));
            vma.lbl_mregistro.setText("Volver");
        }
        if (e.getSource() == vma.lbl_AgregarV) {
            vma.pnl_AgregarV.setBackground(new Color(0, 134, 190, 200));
            vma.lbl_mregistro.setText("Agregar Vehiculo");
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == vma.lbl_Propietario) {
            vma.pnl_Propietario.setBackground(new Color(78, 184, 222));
            vma.lbl_mregistro.setText("");
        }
        if (e.getSource() == vma.lbl_Vehiculo) {
            vma.pnl_Vehiculo.setBackground(new Color(136, 212, 234));
            vma.lbl_mregistro.setText("");
        }
        if (e.getSource() == vma.lbl_Volver) {
            vma.pnl_Volver.setBackground(new Color(0, 93, 139));
            vma.lbl_mregistro.setText("");
        }
        if (e.getSource() == vma.lbl_AgregarV) {
            vma.pnl_AgregarV.setBackground(new Color(0, 134, 190));
            vma.lbl_mregistro.setText("");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

}
