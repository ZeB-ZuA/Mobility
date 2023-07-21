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

public class Ctrl_Vactualizar_Propietario implements MouseListener {

    private DTO_propietario dtop;
    private DAO_propietario daop;
    private Vactualizar_Propietario vap;
    private VmenuActualizar vma;

    public Ctrl_Vactualizar_Propietario(DTO_propietario dtop, DAO_propietario daop, Vactualizar_Propietario vap, VmenuActualizar vma) {
        this.dtop = dtop;
        this.daop = daop;
        this.vap = vap;
        this.vma = vma;
        vap.lbl_Guardar.addMouseListener(this);
        vap.lbl_Volver.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == vap.lbl_Guardar) {

            if (!validarEmail(vap.txt_Email)) {
                JOptionPane.showMessageDialog(null, "Correo Invalido", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                String genero = (String) vap.cmb_genero.getSelectedItem();
                dtop.setNombres(vap.txt_Nombres.getText());
                dtop.setApellidos(vap.txt_Apellidos.getText());
                dtop.setGenero(genero);
                dtop.setTelefono(Long.parseLong(vap.txt_Telefono.getText()));
                dtop.setEmail(vap.txt_Email.getText());
                dtop.setCc(Long.parseLong(vap.lbl_idclave.getText()));
                if (daop.update(dtop)) {
                    
                    JOptionPane.showMessageDialog(null, "Propietario Actualizado","Actualizar Propietario",1);
                    limpiar();
                }else{
                   JOptionPane.showMessageDialog(null, "Error al Actualizar propietario","Actualizar Propietario",1);
                    limpiar();
                }
                
                
                
                
                
            }

        }
        if (e.getSource() == vap.lbl_Volver) {
            vma.setVisible(true);
            vap.dispose();
        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == vap.lbl_Guardar) {
            vap.pnl_Registrar.setBackground(new Color(0, 181, 255));
        }
        if (e.getSource() == vap.lbl_Volver) {
            vap.pnl_Volver.setBackground(new Color(0, 181, 255));

        }

    }

    @Override
    public void mouseExited(MouseEvent e) {

        if (e.getSource() == vap.lbl_Guardar) {
            vap.pnl_Registrar.setBackground(new Color(0, 153, 255));
        }
        if (e.getSource() == vap.lbl_Volver) {
            vap.pnl_Volver.setBackground(new Color(0, 153, 255));
        }

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
    
    
    
    
    public void limpiar(){
    
    vap.txt_Nombres.setText(null);
    vap.txt_Apellidos.setText(null);
    vap.txt_Telefono.setText(null);
    vap.txt_Email.setText(null);
    
    }
    

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

}
