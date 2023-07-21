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
import javax.swing.JOptionPane;

public class Ctrl_VmenuEliminar implements MouseListener {

    private Vmenu vm;
    private VmenuEliminar vme;
    private VplacaVehiculoEliminar vpve;
    private DAO_propietario daop;
    private DTO_propietario dtop;
    private DAO_vehiculo daov;
    private DTO_vehiculo dtov;
    private DAO_pagos_comparendo daopc;
    private DTO_pagos_comparendo dtopc;
    private DAO_comparendo daoc;
    private DTO_comparendo dtoc;
    private DAO_impuesto daoi;
    private DTO_impuesto dtoi;
    private DAO_pagos_impuesto daopi;
    private DTO_pagos_impuesto dtopi;

    public Ctrl_VmenuEliminar(Vmenu vm, VmenuEliminar vme, VplacaVehiculoEliminar vpve, DAO_propietario daop, DTO_propietario dtop, DAO_vehiculo daov, DTO_vehiculo dtov,
            DAO_pagos_comparendo daopc, DTO_pagos_comparendo dtopc, DAO_comparendo daoc, DTO_comparendo dtoc, DAO_impuesto daoi, DTO_impuesto dtoi,
            DAO_pagos_impuesto daopi, DTO_pagos_impuesto dtopi) {
        this.vm = vm;
        this.vme = vme;
        this.vpve = vpve;
        this.daop = daop;
        this.dtop = dtop;
        this.daov = daov;   
        this.dtov = dtov;
        this.daopc = daopc;
        this.dtopc = dtopc;
        this.daoc = daoc;
        this.dtoc = dtoc;
        this.daoi = daoi;
        this.dtoi = dtoi;
        this.daopi = daopi;
        this.dtopi = dtopi;
        this.vme.lbl_Propietario.addMouseListener(this);
        this.vme.lbl_Vehiculo.addMouseListener(this);
        this.vme.lbl_Salir.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == vme.lbl_Propietario) {

            if (daopc.delete(Long.parseLong(vme.lbl_idclave.getText()))) {
                JOptionPane.showMessageDialog(null, "Pagos de comparendos Eliminados", "Eliminar Propietario", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Error al elimiar Pagos de comparendos", "Eliminar Propietario", 0);
            }
            if (daoc.delete(Long.parseLong(vme.lbl_idclave.getText()))) {
                JOptionPane.showMessageDialog(null, "Comparendos Eliminados", "Eliminar Propietario", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Error al elimiar comparendos", "Eliminar Propietario", 0);
            }
            if (daopi.deleteUsingCc(Long.parseLong(vme.lbl_idclave.getText()))) {
                JOptionPane.showMessageDialog(null, "Pagos de impuesto eliminados", "Eliminar Propietario", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Error al elimiar Pagos de impuesto", "Eliminar Propietario", 0);
            }
            if (daoi.cascadeDeleteCc(Long.parseLong(vme.lbl_idclave.getText()))) {
                JOptionPane.showMessageDialog(null, "Impuestos eliminados", "Eliminar Propietario", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Error al elimiar impuestos", "Eliminar Propietario", 0);
            }
            if (daov.deleteUsingCc(Long.parseLong(vme.lbl_idclave.getText()))) {
                JOptionPane.showMessageDialog(null, "Vehiculos eliminados", "Eliminar Propietario", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Error al elimiar Vehiculos", "Eliminar Propietario", 0);
            }
            if (daop.delete(Long.parseLong(vme.lbl_idclave.getText()))) {
                JOptionPane.showMessageDialog(null, "Propietario eliminado", "Eliminar Propietario", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Error al elimiar Propietario", "Eliminar Propietario", 0);

            }

        }
        if (e.getSource() == vme.lbl_Vehiculo) {

            vpve.setVisible(true);
            vpve.txt_placa.setForeground(Color.gray);
            vpve.txt_placa.setText("Placa");
            vpve.requestFocusInWindow();
            vme.setVisible(false);

        }
        if (e.getSource() == vme.lbl_Salir) {
            vm.setVisible(true);
            vme.dispose();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == vme.lbl_Propietario) {
            vme.pnl_Propietario.setBackground(new Color(78, 184, 222, 200));
            vme.lbl_mregistro.setText("Propietario");
        }
        if (e.getSource() == vme.lbl_Vehiculo) {
            vme.pnl_Vehiculo.setBackground(new Color(136, 212, 234, 200));
            vme.lbl_mregistro.setText("Vehiculo");

        }
        if (e.getSource() == vme.lbl_Salir) {
            vme.pnl_Salir.setBackground(new Color(0, 93, 139, 200));
            vme.lbl_mregistro.setText("Volver");
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == vme.lbl_Propietario) {

            vme.pnl_Propietario.setBackground(new Color(78, 184, 222));
            vme.lbl_mregistro.setText("");

        }
        if (e.getSource() == vme.lbl_Vehiculo) {
            vme.pnl_Vehiculo.setBackground(new Color(136, 212, 234));
            vme.lbl_mregistro.setText("");

        }
        if (e.getSource() == vme.lbl_Salir) {

            vme.pnl_Salir.setBackground(new Color(0, 93, 139));
            vme.lbl_mregistro.setText("");

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }
}
