package Controlador;

import Vistas.*;
import Modelo.*;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.MouseInputListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Ctrl_VmoraActual implements MouseInputListener {

    private VmoraActual vmra;
    private Vmenu vm;
    private VmenuInforme vi;
    private DAO_pagos_impuesto daopi;
    private DTO_pagos_impuesto dtopi;

    public Ctrl_VmoraActual(VmoraActual vmra, Vmenu vm, VmenuInforme vi, DAO_pagos_impuesto daopi, DTO_pagos_impuesto dtopi) {
        this.vmra = vmra;
        this.vm = vm;
        this.vi = vi;
        this.daopi = daopi;
        this.dtopi = dtopi;
        this.vmra.lbl_Generar.addMouseListener(this);
        this.vmra.lbl_Pdf.addMouseListener(this);
        this.vmra.lbl_Volver.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        String estado = (String) vmra.cmb_estado.getSelectedItem();
        if (e.getSource() == vmra.lbl_Generar) {

            if ("PAGO".equals(estado)) {
                vmra.tbl_Ianual.setVisible(false);
                vmra.Spnl_Ianual.setVisible(false);
                vmra.tbl_Ianual.setVisible(true);
                vmra.Spnl_Ianual.setVisible(true);
                llenarTablaPago();
            }
            if ("EN MORA".equals(estado)) {
                vmra.tbl_Ianual.setVisible(false);
                vmra.Spnl_Ianual.setVisible(false);
                vmra.tbl_Ianual.setVisible(true);
                vmra.Spnl_Ianual.setVisible(true);
                llenarTablaEnmora();
            }
            if ("PAGANDO".equals(estado)) {
                vmra.tbl_Ianual.setVisible(false);
                vmra.Spnl_Ianual.setVisible(false);
                vmra.tbl_Ianual.setVisible(true);
                vmra.Spnl_Ianual.setVisible(true);
                llenarTablaPagando();
            }
        }
        if (e.getSource() == vmra.lbl_Pdf) {
            
            if ("PAGO".equals(estado)) {
                GenerarPDF pdf = new GenerarPDF();
                String ruta = System.getProperty("user.home") + "/Desktop";
                pdf.generarPDFimpuestosAldia(vmra.tbl_Ianual, ruta + "/ImpuestosAlDia.pdf");

            }

        }
        if (e.getSource() == vmra.lbl_Volver) {
            
            vi.setVisible(true);
            vmra.dispose();
        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == vmra.lbl_Generar) {
            vmra.pnl_Buscar.setBackground(new Color(0, 181, 255));
        }
        if (e.getSource() == vmra.lbl_Pdf) {
            vmra.pnl_Pdf.setBackground(new Color(0, 181, 255));
        }
        if (e.getSource() == vmra.lbl_Volver) {
            vmra.pnl_Volver.setBackground(new Color(0, 181, 255));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == vmra.lbl_Generar) {
            vmra.pnl_Buscar.setBackground(new Color(0, 153, 255));
        }
        if (e.getSource() == vmra.lbl_Pdf) {
            vmra.pnl_Pdf.setBackground(new Color(0, 153, 255));
        }
        if (e.getSource() == vmra.lbl_Volver) {
            vmra.pnl_Volver.setBackground(new Color(0, 153, 255));
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    private void llenarTablaPago() {
        ArrayList<DTO_pagos_impuesto> pagos = daopi.readPago();
        String[] titulos = {"Codigo de pago", "Cedula del propietario", "NIT", "Estado"};

        if (!pagos.isEmpty()) {
            DefaultTableModel model = new DefaultTableModel(null, titulos);

            for (DTO_pagos_impuesto pago : pagos) {
                Object[] fila = new Object[4];
                fila[0] = pago.getCod_pago();
                fila[1] = pago.getCc();
                fila[2] = pago.getNit();
                fila[3] = pago.getEstado();
                model.addRow(fila);
            }

            vmra.tbl_Ianual.setModel(model);
        } else {
            JOptionPane.showMessageDialog(null, "Datos no encontrados");
        }
    }

    private void llenarTablaEnmora() {
        ArrayList<DTO_pagos_impuesto> pagosEnmora = daopi.readEnmora();
        String[] titulos = {"Codigo de pago", "Cedula del propietario", "NIT", "Estado"};
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        for (DTO_pagos_impuesto pago : pagosEnmora) {
            Object[] fila = new Object[4];
            fila[0] = pago.getCod_pago();
            fila[1] = pago.getCc();
            fila[2] = pago.getNit();
            fila[3] = pago.getEstado();
            model.addRow(fila);
        }

        // Asignar el modelo de la tabla
        vmra.tbl_Ianual.setModel(model);
    }

    private void llenarTablaPagando() {
        ArrayList<DTO_pagos_impuesto> pagosPagando = daopi.readPagando();

        String[] titulos = {"Codigo de pago", "Cedula del propietario", "NIT", "Estado"};
        DefaultTableModel model = new DefaultTableModel(null, titulos);

        for (DTO_pagos_impuesto pago : pagosPagando) {
            Object[] fila = new Object[4];
            fila[0] = pago.getCod_pago();
            fila[1] = pago.getCc();
            fila[2] = pago.getNit();
            fila[3] = pago.getEstado();
            model.addRow(fila);
        }
        vmra.tbl_Ianual.setModel(model);
    }

}
