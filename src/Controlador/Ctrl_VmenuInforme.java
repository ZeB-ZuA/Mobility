package Controlador;

import Vistas.*;
import Modelo.*;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author user
 */
public class Ctrl_VmenuInforme implements MouseListener {

    private VmenuInforme vi;
    private Vmenu vm;
    private VInformeAnual via;
    private VmoraActual vmra;

    public Ctrl_VmenuInforme(VmenuInforme vi, Vmenu vm, VInformeAnual via, VmoraActual vmra) {
        this.vi = vi;
        this.vm = vm;
        this.via = via;
        this.vmra = vmra;
        this.vi.lbl_Anio.addMouseListener(this);
        this.vi.lbl_MoraActual.addMouseListener(this);
        this.vi.lbl_Salir.addMouseListener(this);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vi.lbl_Anio) {
            via.setVisible(true);
            vi.setVisible(false);
        }
        if (e.getSource() == vi.lbl_MoraActual) {
            vmra.setVisible(true);
            vi.setVisible(false);
        }
        if (e.getSource() == vi.lbl_Salir) {
            vm.setVisible(true);
            vi.setVisible(false);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == vi.lbl_Anio) {
            vi.pnl_anio.setBackground(new Color(78, 184, 222, 200));
            vi.lbl_mregistro.setText("Anual");
        }
        if (e.getSource() == vi.lbl_MoraActual) {
            vi.pnl_MoraActual.setBackground(new Color(136, 212, 234, 200));
            vi.lbl_mregistro.setText("Mora Actual");
        }
        if (e.getSource() == vi.lbl_Salir) {

            vi.pnl_Salir.setBackground(new Color(0, 93, 139, 200));
            vi.lbl_mregistro.setText("Volver");
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == vi.lbl_Anio) {
            vi.pnl_anio.setBackground(new Color(78, 184, 222));
            vi.lbl_mregistro.setText("");
        }
        if (e.getSource() == vi.lbl_MoraActual) {
            vi.pnl_MoraActual.setBackground(new Color(136, 212, 234));
            vi.lbl_mregistro.setText("");
        }
        if (e.getSource() == vi.lbl_Salir) {
            vi.pnl_Salir.setBackground(new Color(0, 93, 139));
            vi.lbl_mregistro.setText("");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }
}