/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vistas.*;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author ZEB
 */
public class Ctrl_Vmenu implements MouseListener {

    private Vregistro_Propietario vrp;
    private VidPropietario vip;
    private VmenuInforme vmi;
    private VBusqueda vmb;
    private Vmenu vm;
    private VmenuComparendos vmc;

    public Ctrl_Vmenu(Vregistro_Propietario vrp, VidPropietario vip, VmenuInforme vmi, VBusqueda vmb, Vmenu vm,VmenuComparendos vmc) {
        this.vrp = vrp;
        this.vip = vip;
        this.vmi = vmi;
        this.vmb = vmb;
        this.vm = vm;
        this.vmc=vmc;
        this.vm.lbl_Actualizar.addMouseListener(this);
        this.vm.lbl_Busqueda.addMouseListener(this);
        this.vm.lbl_Informe1.addMouseListener(this);
        this.vm.lbl_Registro.addMouseListener(this);
        this.vm.lbl_comparendos.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vm.lbl_Registro) {
            vrp.setVisible(true);
            vm.dispose();
        }
        if (e.getSource() == vm.lbl_Actualizar) {
            vip.setVisible(true);
            vm.dispose();
        }
        if (e.getSource() == vm.lbl_Informe1) {
            vmi.setVisible(true);
            vm.dispose();
        }
        if (e.getSource() == vm.lbl_Busqueda) {
            vmb.setVisible(true);
            vm.dispose();
        }
         if (e.getSource() == vm.lbl_comparendos) {
            vmc.setVisible(true);
            vm.dispose();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == vm.lbl_Registro) {
            vm.pnl_Registro.setBackground(new Color(78, 184, 222, 200));
            vm.lbl_mregistro.setText("Registrarse");
        }
        if (e.getSource() == vm.lbl_Actualizar) {
            vm.pnl_Actualizar.setBackground(new Color(136, 212, 234, 200));
            vm.lbl_mregistro.setText("Actualizar");

        }
        if (e.getSource() == vm.lbl_Informe1) {
            vm.pnl_Informe1.setBackground(new Color(0, 93, 139, 200));
            vm.lbl_mregistro.setText("Informe");
        }
        if (e.getSource() == vm.lbl_Busqueda) {
            vm.pnl_Busqueda.setBackground(new Color(0, 134, 190, 200));
            vm.lbl_mregistro.setText("Busqueda");
        }
        if (e.getSource() == vm.lbl_comparendos) {
            vm.pnl_comparendos.setBackground(new Color(136, 212, 234, 200));
            vm.lbl_mregistro.setText("Gestion comparendos");

        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == vm.lbl_Registro) {
            vm.pnl_Registro.setBackground(new Color(78, 184, 222));
            vm.lbl_mregistro.setText("");
        }
        if (e.getSource() == vm.lbl_Actualizar) {
            vm.pnl_Actualizar.setBackground(new Color(136, 212, 234));
            vm.lbl_mregistro.setText("");
        }
        if (e.getSource() == vm.lbl_Informe1) {
            vm.pnl_Informe1.setBackground(new Color(0, 93, 139));
            vm.lbl_mregistro.setText("");

        }
        if (e.getSource() == vm.lbl_Busqueda) {

            vm.pnl_Busqueda.setBackground(new Color(0, 134, 190));
            vm.lbl_mregistro.setText("");
        }
        if (e.getSource() == vm.lbl_comparendos) {
            vm.pnl_comparendos.setBackground(new Color(136, 212, 234));
            vm.lbl_mregistro.setText("");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }
}
