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

/**
 *
 * @author ZEB
 */
public class Ctrl_Vactualizar_Vehiculo implements MouseListener {

    private DTO_vehiculo dtov;
    private DAO_vehiculo daov;
    private Vactualizar_Vehiculo vav;
    private VmenuActualizar vma;

    public Ctrl_Vactualizar_Vehiculo(DTO_vehiculo dtov, DAO_vehiculo daov, Vactualizar_Vehiculo vav, VmenuActualizar vma) {
        this.dtov = dtov;
        this.daov = daov;
        this.vav = vav;
        this.vma = vma;
        this.vav.lbl_Guardar.addMouseListener(this);
        this.vav.lbl_Volver.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == vav.lbl_Guardar) {
            dtov.setColor(vav.txt_Color.getText());
            dtov.setClindraje(Integer.parseInt(vav.txt_Cilindraje.getText()));
            dtov.setPlaca(vav.lbl_placaclave.getText());
            if (daov.update(dtov)) {
                JOptionPane.showMessageDialog(null, "Vehiculo Actualizado", "Vehiculo Propietario", 1);
                vav.txt_Cilindraje.setText(null);
                vav.txt_Color.setText(null);
            
            }else{
            JOptionPane.showMessageDialog(null, "Error al Actualizar Vehiculo","Actualizar Vehiculo",1);
               vav.txt_Cilindraje.setText(null);
                vav.txt_Color.setText(null);     
            
            
            }

        }
        if (e.getSource() == vav.lbl_Volver) {
            vma.setVisible(true);
            vav.setVisible(false);
        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == vav.lbl_Guardar) {
            vav.pnl_Registrar.setBackground(new Color(0, 181, 255));
        }
        if (e.getSource() == vav.lbl_Volver) {
            vav.pnl_Volver.setBackground(new Color(0, 181, 255));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == vav.lbl_Guardar) {
            vav.pnl_Registrar.setBackground(new Color(0, 153, 255));
        }
        if (e.getSource() == vav.lbl_Volver) {
            vav.pnl_Volver.setBackground(new Color(0, 153, 255));
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }
}
