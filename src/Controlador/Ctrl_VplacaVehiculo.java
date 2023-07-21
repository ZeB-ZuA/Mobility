package Controlador;

import Modelo.*;
import Vistas.*;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ctrl_VplacaVehiculo implements MouseListener {

    private VplacaVehiculo vpv;
    private VmenuActualizar vma;
    private Vactualizar_Vehiculo vav;

    public Ctrl_VplacaVehiculo(VplacaVehiculo vpv, VmenuActualizar vma, Vactualizar_Vehiculo vav) {
        this.vpv = vpv;
        this.vma = vma;
        this.vav = vav;
        this.vpv.lbl_Volver.addMouseListener(this);
        this.vpv.lbl_Ingresar.addMouseListener(this);
        this.vpv.txt_Placa.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == vpv.lbl_Ingresar) {
            if (vpv.txt_Placa.getText().isEmpty() || vpv.txt_Placa.getText().equals("Placa") || !validarPlaca(vpv.txt_Placa)) {
                JOptionPane.showMessageDialog(null, "Placa Invalida", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                vav.setVisible(true);
                vav.lbl_placaclave.setText(vpv.txt_Placa.getText());
                vpv.txt_Placa.setText(null);
                vpv.setVisible(false);
            }

        }
        if (e.getSource() == vpv.lbl_Volver) {
            vma.setVisible(true);
            vpv.setVisible(false);
        }
        if (e.getSource() == vpv.txt_Placa) {
            if (vpv.txt_Placa.getText().equals("Placa")) {
                vpv.txt_Placa.setText("");
                vpv.txt_Placa.setForeground(Color.black);
            }
        }
    }

    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == vpv.lbl_Ingresar) {
            vpv.pnl_ingresar.setBackground(new Color(70, 181, 255));
        }
        if (e.getSource() == vpv.lbl_Volver) {
            vpv.pnl_Volver.setBackground(new Color(70, 181, 255));
        }
        if (e.getSource() == vpv.txt_Placa) {

        }

    }

    @Override
    public void mouseExited(MouseEvent e) {

        if (e.getSource() == vpv.lbl_Ingresar) {
            vpv.pnl_ingresar.setBackground(new Color(0, 153, 255));
        }
        if (e.getSource() == vpv.lbl_Volver) {
            vpv.pnl_Volver.setBackground(new Color(0, 153, 255));
        }
        if (e.getSource() == vpv.txt_Placa) {

        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    private boolean validarPlaca(JTextField txt) {
        String patron = "^[a-zA-Z]{3}-[0-9]{3}$";
        Pattern p = Pattern.compile(patron);
        Matcher m = p.matcher(txt.getText());
        return m.matches();
    }
}
