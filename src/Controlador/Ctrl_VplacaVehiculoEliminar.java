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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ZEB
 */
public class Ctrl_VplacaVehiculoEliminar implements MouseListener {

    private VplacaVehiculoEliminar vpve;
    private Vmenu vm;
    private VmenuEliminar vme;
    private DTO_vehiculo dtov;
    private DAO_vehiculo daov;
    private DTO_impuesto dtoi;
    private DAO_impuesto daoi;
    private DTO_pagos_impuesto dtopi;
    private DAO_pagos_impuesto daopi;

    public Ctrl_VplacaVehiculoEliminar(Vmenu vm, DTO_vehiculo dtov, DAO_vehiculo daov, VmenuEliminar vme, VplacaVehiculoEliminar vpve, DTO_impuesto dtoi, DAO_impuesto daoi, DTO_pagos_impuesto dtopi,DAO_pagos_impuesto daopi) {

        this.vme = vme;
        this.dtov = dtov;
        this.daov = daov;
        this.vpve = vpve;
        this.daoi = daoi;
        this.dtoi = dtoi;
        this.daopi = daopi;
        this.dtopi = dtopi;
        this.vpve.lbl_Eliminar.addMouseListener(this);
        this.vpve.lbl_Volver.addMouseListener(this);
        this.vpve.txt_placa.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == vpve.lbl_Eliminar) {
            if (vpve.txt_placa.getText().isEmpty() || vpve.txt_placa.getText().equals("Placa") || !validarPlaca(vpve.txt_placa)) {
                JOptionPane.showMessageDialog(null, "Placa Invalida", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                
                if (daopi.cascadeDelete(vpve.txt_placa.getText())) {
              JOptionPane.showMessageDialog(null, "Pagos de impuesto eliminados", "Eliminar vehiculo", 1);
                }else{
              JOptionPane.showMessageDialog(null, "Pagos de impuesto", "Eliminar vehiculo", 0);

                }    
                if (daoi.cascadeDelete(vpve.txt_placa.getText())) {
                    JOptionPane.showMessageDialog(null, "Impuestos Eliminados", "Eliminar vehiculo", 1);

                }else{
                JOptionPane.showMessageDialog(null, "Error al borrar impuestos", "Eliminar vehiculo",0);
                }
                if (daov.delete(vpve.txt_placa.getText())) {
                    JOptionPane.showMessageDialog(null, "Vehiculo eliminado", "Eliminar vehiculo", 1);
                    vme.setVisible(true);
                    vpve.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar vehiculo", "Eliminar vehiculo", 1);
                    vpve.txt_placa.setText("");

                }

            }

        }
        if (e.getSource() == vpve.lbl_Volver) {
            vme.setVisible(true);
            vpve.setVisible(false);
        }

        if (e.getSource() == vpve.txt_placa) {

            if (vpve.txt_placa.getText().equals("Placa")) {
                vpve.txt_placa.setText("");
                vpve.txt_placa.setForeground(Color.black);
            }

        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        if (e.getSource() == vpve.lbl_Eliminar) {
            vpve.pnl_ingresar.setBackground(new Color(70, 181, 255));
        }
        if (e.getSource() == vpve.lbl_Volver) {
            vpve.pnl_Volver.setBackground(new Color(70, 181, 255));

        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == vpve.lbl_Eliminar) {
            vpve.pnl_ingresar.setBackground(new Color(0, 153, 255));

        }
        if (e.getSource() == vpve.lbl_Volver) {
            vpve.pnl_Volver.setBackground(new Color(0, 153, 255));

        }
    }

    private boolean validarPlaca(JTextField txt) {
        String patron = "^[a-zA-Z]{3}-[0-9]{3}$";
        Pattern p = Pattern.compile(patron);
        Matcher m = p.matcher(txt.getText());
        return m.matches();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

}
