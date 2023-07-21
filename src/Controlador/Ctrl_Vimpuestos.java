/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vistas.*;
import Modelo.*;
import java.awt.Color;
import java.util.Random;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class Ctrl_Vimpuestos implements MouseListener {

    private Vimpuestos vi;
    private Vmenu vm;
    private DAO_impuesto daoi;
    private DTO_impuesto dtoi;
    private DAO_pagos_impuesto daopi;
    private DTO_pagos_impuesto dtopi;

    public Ctrl_Vimpuestos(Vimpuestos vi, DAO_impuesto daoi, DTO_impuesto dtoi, DAO_pagos_impuesto daopi, DTO_pagos_impuesto dtopi, Vmenu vm) {
        this.vi = vi;
        this.vm = vm;
        this.daoi = daoi;
        this.dtoi = dtoi;
        this.daopi = daopi;
        this.dtopi = dtopi;
        this.vi.lbl_Registrar.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vi.lbl_Registrar) {
            Calendar c = Calendar.getInstance();
            int anioAc = c.get(Calendar.YEAR);
            int nit = Integer.parseInt(vi.txt_nit.getText());
            String estado = (String) vi.cmb_estado.getSelectedItem();
            String valorTexto = vi.txt_ValorImp1.getText();
            valorTexto = valorTexto.replace(",", ".");
            dtoi.setNit(nit);
            dtoi.setPlaca(vi.txt_Placa.getText());
            dtoi.setAnio(Integer.parseInt(vi.txt_anioR.getText()));
            dtoi.setValor(Double.parseDouble(valorTexto));
            if (daoi.create(dtoi)) {
                JOptionPane.showMessageDialog(null, "Impuesto Registrado Exitosamente", "Registro Impuesto", 1);

            } else {
                JOptionPane.showMessageDialog(null, "Error al Registrar el Impuesto", "Registro Impuesto", 1);
            }

            if (Integer.parseInt(vi.txt_anioR.getText()) == anioAc) {
                Random random = new Random();
                int codpago = random.nextInt(9000) + 1000;
                dtopi.setCod_pago(codpago);
                dtopi.setCc(Long.parseLong(vi.lbl_idclave.getText()));
                dtopi.setNit(Integer.parseInt(vi.txt_nit.getText()));
                dtopi.setEstado(estado);
                if (daopi.create(dtopi)) {
                    JOptionPane.showMessageDialog(null, estado);
                    vm.setVisible(true);
                    vi.dispose();
                } else {

                }

            } else {
                int anioimp = Integer.parseInt(vi.txt_anioR.getText());
                while (anioimp <= anioAc) {
                    int cont = 0;
                    Random random = new Random();
                    int codpago = random.nextInt(9000) + 1000;
                    int est = random.nextInt(3) + 1;
                    dtopi.setCod_pago(codpago + (cont + 1));
                    dtopi.setCc(Long.parseLong(vi.lbl_idclave.getText()));
                    dtopi.setNit(nit);
                    dtopi.setEstado(estadoR(est));
                    if (daopi.create(dtopi)) {
                        JOptionPane.showMessageDialog(null, "Impuesto del" + (anioimp) + "Registrado");
                        vm.setVisible(true);
                        vi.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al registrar impuestos", "IMPUESTOS ANUALES", 2);

                    }

                    anioimp++;
                    cont++;
                }

            }

        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == vi.lbl_Registrar) {
            vi.pnl_Registrar.setBackground(new Color(0, 181, 255));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == vi.lbl_Registrar) {
            vi.pnl_Registrar.setBackground(new Color(0, 153, 255));
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    public String estadoR(int x) {
        String e = null;

        if (x == 1) {
            e = "PAGO";
        }
        if (x == 2) {
            e = "EN MORA";
        }

        if (x == 3) {
            e = "PAGANDO";
        }

        return e;
    }
}
