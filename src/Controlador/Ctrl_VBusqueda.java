package Controlador;

import Modelo.*;
import Vistas.*;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Ctrl_VBusqueda implements MouseListener {

    private VBusqueda vb;
    private Vmenu vm;
    private DTO_vehiculo dtov;
    private DAO_vehiculo daov;

    public void limpiar() {
        String m = "";
        vb.txt_Cc.setText(m);
    }

    public Ctrl_VBusqueda(VBusqueda vb, Vmenu vm, DTO_vehiculo dtov, DAO_vehiculo daov) {
        this.vb = vb;
        this.vm = vm;
        this.daov = daov;
        this.dtov = dtov;
        this.vb.lbl_Buscar.addMouseListener(this);
        this.vb.lbl_Pdf.addMouseListener(this);
        this.vb.lbl_Volver.addMouseListener(this);
        this.vb.txt_Cc.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vb.lbl_Volver) {
            vm.setVisible(true);
            vb.dispose();
        }
        if (e.getSource() == vb.lbl_Buscar) {
            vb.tbl_Busqueda.setVisible(true);
            vb.Spnl_Busqueda.setVisible(true);
            llenarTabla(Long.parseLong(vb.txt_Cc.getText()));
        }
        if (e.getSource() == vb.lbl_Pdf) {
            GenerarPDF pdf = new GenerarPDF();
            String ruta = System.getProperty("user.home") + "/Desktop";
            pdf.generarPDFVehiculos(vb.tbl_Busqueda, ruta+"/VehiculosRegistrados.pdf");
        }
        if (e.getSource() == vb.txt_Cc) {
            if (vb.txt_Cc.getText().equals("Cédula")) {
                vb.txt_Cc.setText("");
                vb.txt_Cc.setForeground(Color.black);
            }
        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == vb.lbl_Volver) {
            vb.pnl_Volver.setBackground(new Color(0, 181, 255));
        }
        if (e.getSource() == vb.lbl_Buscar) {
            vb.pnl_Buscar.setBackground(new Color(0, 181, 255));
        }
        if (e.getSource() == vb.lbl_Pdf) {
            vb.pnl_Pdf.setBackground(new Color(0, 181, 255));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == vb.lbl_Volver) {
            vb.pnl_Volver.setBackground(new Color(0, 153, 255));
        }
        if (e.getSource() == vb.lbl_Buscar) {
            vb.pnl_Buscar.setBackground(new Color(0, 153, 255));
        }
        if (e.getSource() == vb.lbl_Pdf) {
            vb.pnl_Pdf.setBackground(new Color(0, 153, 255));
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    private void llenarTabla(long cc) {
        ArrayList<DTO_vehiculo> vehiculos = daov.read(cc);
        String[] titulos = {"Placa", "Tipo", "Modelo", "Color", "C.C.", "Marca", "Cilindraje", "Valor Comercial", "Combustible"};

        if (!vehiculos.isEmpty()) {
            DefaultTableModel model = new DefaultTableModel(null, titulos);

            for (DTO_vehiculo vehiculo : vehiculos) {
                Object[] fila = new Object[9];
                fila[0] = vehiculo.getPlaca();
                fila[1] = vehiculo.getTipo();
                fila[2] = vehiculo.getModelo();
                fila[3] = vehiculo.getColor();
                fila[4] = vehiculo.getCc();
                fila[5] = vehiculo.getMarca();
                fila[6] = vehiculo.getClindraje();
                fila[7] = vehiculo.getValorComercial();
                fila[8] = vehiculo.getCombustible();
                model.addRow(fila);
            }

            vb.tbl_Busqueda.setModel(model);
        } else {
            JOptionPane.showMessageDialog(null, "Datos no encontrados");
        }
    }

}
