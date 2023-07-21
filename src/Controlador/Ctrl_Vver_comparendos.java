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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ZEB
 */
public class Ctrl_Vver_comparendos implements MouseListener {

    private Vver_comparendos vvr;
    private VmenuComparendos vmc;
    private DAO_pagos_comparendo daopc;
    private DTO_pagos_comparendo dtopc;

    public Ctrl_Vver_comparendos(Vver_comparendos vvr, VmenuComparendos vmc, DAO_pagos_comparendo daopc, DTO_pagos_comparendo dtopc) {
        this.vvr = vvr;
        this.vmc = vmc;
        this.daopc = daopc;
        this.dtopc = dtopc;
        this.vvr.lbl_Generar.addMouseListener(this);
        this.vvr.lbl_Pdf.addMouseListener(this);
        this.vvr.lbl_Volver.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
         String estado = (String) vvr.cmb_estado.getSelectedItem();
        if (e.getSource() == vvr.lbl_Generar) {

           
            if ("PAGO".equals(estado)) {
                vvr.tbl_Ianual.setVisible(false);
                vvr.Spnl_Ianual.setVisible(false);
                vvr.tbl_Ianual.setVisible(true);
                vvr.Spnl_Ianual.setVisible(true);
                llenarTablaPago();
            }
            if ("EN MORA".equals(estado)) {
                vvr.tbl_Ianual.setVisible(false);
                vvr.Spnl_Ianual.setVisible(false);
                vvr.tbl_Ianual.setVisible(true);
                vvr.Spnl_Ianual.setVisible(true);
                llenarTablaEnmora();
            }
            if ("PAGANDO".equals(estado)) {
                vvr.tbl_Ianual.setVisible(false);
                vvr.Spnl_Ianual.setVisible(false);
                vvr.tbl_Ianual.setVisible(true);
                vvr.Spnl_Ianual.setVisible(true);
                llenarTablaPagando();
            }
        }
        if (e.getSource()==vvr.lbl_Pdf) {
             if ("PAGO".equals(estado)){
             GenerarPDF pdf = new GenerarPDF();
            String ruta = System.getProperty("user.home") + "/Desktop";
            pdf.generarPDFVehiculos(vvr.tbl_Ianual, ruta+"/ComparendosAldia.pdf");
             }
        }
        if (e.getSource()==vvr.lbl_Volver) {          
            vmc.setVisible(true);
            vvr.dispose();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == vvr.lbl_Generar) {
            vvr.pnl_Buscar.setBackground(new Color(0, 181, 255));
        }
        if (e.getSource() == vvr.lbl_Pdf) {
            vvr.pnl_Pdf.setBackground(new Color(0, 181, 255));
        }
        if (e.getSource() == vvr.lbl_Volver) {
            vvr.pnl_Volver.setBackground(new Color(0, 181, 255));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == vvr.lbl_Generar) {
            vvr.pnl_Buscar.setBackground(new Color(0, 153, 255));
        }
        if (e.getSource() == vvr.lbl_Pdf) {
            vvr.pnl_Pdf.setBackground(new Color(0, 153, 255));
        }
        if (e.getSource() == vvr.lbl_Volver) {
            vvr.pnl_Volver.setBackground(new Color(0, 153, 255));
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

   private void llenarTablaEnmora() {
    ArrayList<DTO_pagos_comparendo> pagosEnMora = daopc.readEnmora();
    String[] titulos = {"codigo_transaccion", "Cedula", "radicado", "Estado"};

    if (!pagosEnMora.isEmpty()) {
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        
        for (DTO_pagos_comparendo px : pagosEnMora) {
            Object[] fila = new Object[4];
            fila[0] = px.getCod_trans();
            fila[1] = px.getCc();
            fila[2] = px.getRadicado();
            fila[3] = px.getEstado();
            model.addRow(fila);
        }
        
        vvr.tbl_Ianual.setModel(model);
    } else {
        JOptionPane.showMessageDialog(null, "Datos no encontrados");
    }
}

   private void llenarTablaPago() {
    ArrayList<DTO_pagos_comparendo> pagos = daopc.readPago();
    String[] titulos = {"codigo_transaccion", "Cedula", "radicado", "Estado"};

    if (!pagos.isEmpty()) {
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        
        for (DTO_pagos_comparendo px : pagos) {
            Object[] fila = new Object[4];
            fila[0] = px.getCod_trans();
            fila[1] = px.getCc();
            fila[2] = px.getRadicado();
            fila[3] = px.getEstado();
            model.addRow(fila);
        }
        
        vvr.tbl_Ianual.setModel(model);
    } else {
        JOptionPane.showMessageDialog(null, "Datos no encontrados");
    }
}
 private void llenarTablaPagando() {
    ArrayList<DTO_pagos_comparendo> pagos = daopc.readPagando();
    String[] titulos = {"codigo_transaccion", "Cedula", "radicado", "Estado"};

    if (!pagos.isEmpty()) {
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        
        for (DTO_pagos_comparendo px : pagos) {
            Object[] fila = new Object[4];
            fila[0] = px.getCod_trans();
            fila[1] = px.getCc();
            fila[2] = px.getRadicado();
            fila[3] = px.getEstado();
            model.addRow(fila);
        }
        
        vvr.tbl_Ianual.setModel(model);
    } else {
        JOptionPane.showMessageDialog(null, "Datos no encontrados");
    }
}
}
