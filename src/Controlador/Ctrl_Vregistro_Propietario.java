package Controlador;

import Modelo.*;
import Vistas.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ctrl_Vregistro_Propietario implements MouseListener {

    private DAO_propietario daop;
    private DTO_propietario dtop;
    private Vregistro_Propietario vrp;
    private Vmenu vm;
    private Vregistro_Vehiculo vrv;

    public Ctrl_Vregistro_Propietario(DAO_propietario daop, DTO_propietario dtop, Vregistro_Propietario vrp, Vmenu vm, Vregistro_Vehiculo vrv) {
        this.daop = daop;
        this.dtop = dtop;
        this.vrp = vrp;
        this.vm = vm;
        this.vrv = vrv;
        this.vrp.lbl_Registrar.addMouseListener(this);
        this.vrp.lbl_Siguiente.addMouseListener(this);
        this.vrp.lbl_Volver.addMouseListener(this);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == vrp.lbl_Volver) {
            vrp.pnl_Volver.setBackground(new Color(0, 181, 255));
        }

        if (e.getSource() == vrp.lbl_Siguiente) {
            vrp.pnl_Siguente.setBackground(new Color(0, 181, 255));
        }
        if (e.getSource() == vrp.lbl_Registrar) {
            vrp.pnl_Registrar.setBackground(new Color(0, 181, 255));
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == vrp.lbl_Volver) {
            vrp.pnl_Volver.setBackground(new Color(0, 153, 255));
        }
        if (e.getSource() == vrp.lbl_Siguiente) {
            vrp.pnl_Siguente.setBackground(new Color(0, 153, 255));
        }
        if (e.getSource() == vrp.lbl_Registrar) {
            vrp.pnl_Registrar.setBackground(new Color(0, 153, 255));
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vrp.lbl_Registrar) {
            if (!validarEmail(vrp.txt_Email)) {
                JOptionPane.showMessageDialog(null, "Correo Invalido", "Error", JOptionPane.ERROR_MESSAGE);
                 return;
            }
            if (vrp.txt_Nombres.getText().isEmpty() || vrp.txt_Apellidos.getText().isEmpty() || vrp.txt_Cc.getText().isEmpty() || vrp.txt_Telefono.getText().isEmpty() || vrp.txt_Email.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campos de texto Vacios", "Error", JOptionPane.ERROR_MESSAGE);
            } else {

                String genero = (String) vrp.cmb_Genero.getSelectedItem();
                Date date = vrp.dc_FechaN.getDate();
                long d = date.getTime();
                java.sql.Date fecha = new java.sql.Date(d);
                dtop.setNombres(vrp.txt_Nombres.getText());
                dtop.setApellidos(vrp.txt_Apellidos.getText());
                dtop.setCc(Long.parseLong(vrp.txt_Cc.getText()));
                dtop.setGenero(genero);
                dtop.setfNacimiento(fecha);
                dtop.setTelefono(Long.parseLong(vrp.txt_Telefono.getText()));
                dtop.setEmail(vrp.txt_Email.getText());
                if (daop.create(dtop)) {
                    JOptionPane.showMessageDialog(null, "Registro Propietario", "Propietario Registrado Exitosamente", 1);                   
                    vrv.setVisible(true);
                    vrv.lbl_idclave.setText(vrp.txt_Cc.getText());
                    limpiar();
                    vrp.dispose();
                } else {

                }
            }
        }
        if (e.getSource() == vrp.lbl_Volver) {

            vm.setVisible(true);
            vrp.dispose();
        }

        if (e.getSource() == vrp.lbl_Siguiente) {

            if (vrp.txt_Nombres.getText().isEmpty() || vrp.txt_Apellidos.getText().isEmpty() || vrp.txt_Cc.getText().isEmpty() || vrp.txt_Telefono.getText().isEmpty() || vrp.txt_Email.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campos de texto Vacios", "Error", JOptionPane.ERROR_MESSAGE);
            } else {

            }
        }

    }

    public void limpiar() {
        String m = "";
        vrp.txt_Nombres.setText(m);
        vrp.txt_Apellidos.setText(m);
        vrp.txt_Cc.setText(m);
        vrp.txt_Telefono.setText(m);
        vrp.txt_Email.setText(m);

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }
 private boolean validarEmail(JTextField txt) {
        boolean Escorreo;
        String correo = txt.getText();
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        mat = pat.matcher(correo);
        if (mat.find()) {
            Escorreo = true;
        } else {
            Escorreo = false;
        }
        return Escorreo;
    }
}
