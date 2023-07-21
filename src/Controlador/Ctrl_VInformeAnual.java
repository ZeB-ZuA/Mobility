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
 * @author user
 */
public class Ctrl_VInformeAnual implements MouseListener {

    private VInformeAnual via;
    private Vmenu vm;
    private VmenuInforme vi;
        private DAO_impuesto daoi;
    private DTO_impuesto dtoi;

    public void limpiar() {
        String m = "";
        via.txt_anio.setText(m);
    }

    public Ctrl_VInformeAnual(VInformeAnual via, Vmenu vm, VmenuInforme vi,DAO_impuesto daoi,DTO_impuesto dtoi) {
        this.via = via;
        this.vm = vm;
        this.vi = vi;
        this.daoi=daoi;
        this.dtoi = dtoi;
        this.via.lbl_Generar.addMouseListener(this);
        this.via.lbl_Pdf.addMouseListener(this);
        this.via.lbl_Volver.addMouseListener(this);
        this.via.txt_anio.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == via.lbl_Generar) {
            via.tbl_Ianual.setVisible(true);
            via.Spnl_Ianual.setVisible(true);
            llenarTabla(Integer.parseInt(via.txt_anio.getText()));        
            
        }
        if (e.getSource() == via.lbl_Pdf) {
             GenerarPDF pdf = new GenerarPDF();
            String ruta = System.getProperty("user.home") + "/Desktop";
            pdf.generarPDFImpuestoPorAño(via.tbl_Ianual, ruta+"/ImpuestosPorAño.pdf");
        }
        if (e.getSource() == via.lbl_Volver) {
            vi.setVisible(true);
            via.dispose();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == via.lbl_Generar) {
            via.pnl_Buscar.setBackground(new Color(0, 181, 255));
        }
        if (e.getSource() == via.lbl_Pdf) {
            via.pnl_Pdf.setBackground(new Color(0, 181, 255));
        }
        if (e.getSource() == via.lbl_Volver) {
            via.pnl_Volver.setBackground(new Color(0, 181, 255));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == via.lbl_Generar) {
            via.pnl_Buscar.setBackground(new Color(0, 153, 255));
        }
        if (e.getSource() == via.lbl_Pdf) {
            via.pnl_Pdf.setBackground(new Color(0, 153, 255));
        }
        if (e.getSource() == via.lbl_Volver) {
            via.pnl_Volver.setBackground(new Color(0, 153, 255));
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }
    
    
    
    
    
   private void llenarTabla(int anio) {
    ArrayList<DTO_impuesto> impuestos = daoi.read(anio); 
    String[] titulos = {"NIT", "Placa", "Año", "Valor"};

    if (!impuestos.isEmpty()) {
        DefaultTableModel model = new DefaultTableModel(null, titulos);

        for (DTO_impuesto px : impuestos) {
            Object[] fila = new Object[4];
            fila[0] = px.getNit();
            fila[1] = px.getPlaca();
            fila[2] = px.getAnio();
            fila[3] = px.getValor();
            model.addRow(fila);
        }

        via.tbl_Ianual.setModel(model);
    } else {
        JOptionPane.showMessageDialog(null, "No se encontraron registros");
    }
}
    
    
}
