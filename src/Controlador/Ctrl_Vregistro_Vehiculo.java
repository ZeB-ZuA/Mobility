
package Controlador;

import Vistas.*;
import Modelo.*;
import java.awt.*;
import java.awt.Desktop;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.*;
import java.text.DecimalFormat;
import java.time.Year;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ctrl_Vregistro_Vehiculo implements MouseListener {

    private DAO_vehiculo daov;
    private DTO_vehiculo dtov;
    private Vmenu vm;
    private Vregistro_Vehiculo vrv;
    private Vimpuestos vi;
    private Random random = new Random();

    public Ctrl_Vregistro_Vehiculo(DAO_vehiculo daov, DTO_vehiculo dtov, Vmenu vm, Vregistro_Vehiculo vrv, Vimpuestos vi ) {
        this.daov = daov;
        this.dtov = dtov;
        this.vm = vm;
        this.vrv = vrv;
        this.vi = vi;
        this.vrv.lbl_Registrar.addMouseListener(this);
        this.vrv.lbl_Volver.addMouseListener(this);
        this.vrv.lbl_irWeb.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vrv.lbl_Registrar) {
            String tipo = (String) vrv.cmb_Tipo.getSelectedItem();
            String combus = (String) vrv.cmb_combus.getSelectedItem();
            if (!validarPlaca(vrv.txt_Placa)) {
                JOptionPane.showMessageDialog(null, "Placa Invalida", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (vrv.txt_Placa.getText().isEmpty() || vrv.txt_Modelo.getText().isEmpty() || vrv.txt_Color.getText().isEmpty() || vrv.txt_Marca.getText().isEmpty() || vrv.txt_Cilindraje.getText().isEmpty() || vrv.txt_ValorComercial.getText().isEmpty() || tipo.equals("")|| combus.equals("")) {
                JOptionPane.showMessageDialog(null, "Campos de texto Vacios", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                Year anioselect = Year.of(vrv.jyc_anioR.getValue());
                int anio = anioselect.getValue();
                dtov.setPlaca(vrv.txt_Placa.getText());
                dtov.setTipo(tipo);
                dtov.setModelo(Integer.parseInt(vrv.txt_Modelo.getText()));
                dtov.setColor(vrv.txt_Color.getText());
                dtov.setMarca(vrv.txt_Marca.getText());
                dtov.setClindraje(Integer.parseInt(vrv.txt_Cilindraje.getText()));
                dtov.setValorComercial(Double.parseDouble(vrv.txt_ValorComercial.getText()));
                dtov.setCc(Long.parseLong(vrv.lbl_idclave.getText()));
                dtov.setCombustible(combus);
                dtov.setAnioR(anio);

                if (daov.create(dtov)) {
                    double valorimp = Double.parseDouble(vrv.txt_ValorComercial.getText()) * 0.15;
                    DecimalFormat formato = new DecimalFormat("#.##########");
                    String formateado = formato.format(valorimp);
                    JOptionPane.showMessageDialog(null, "Vehiculo Registrado Exitosamente", "Registro Vehiculo", 1);                
                    vi.setVisible(true);
                    vi.txt_Placa.setText(vrv.txt_Placa.getText());
                    vi.txt_anioR.setText(String.valueOf(vrv.jyc_anioR.getYear()));
                    vi.txt_nit.setText(String.valueOf(random.nextInt(90000) + 10000));
                    vi.lbl_idclave.setText(vrv.lbl_idclave.getText());
                    vi.txt_ValorImp1.setText(formateado);
                    limpiar();
                    
                    vrv.dispose();
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Registrar el vehiculo", "Registro Vehiculo", 1);
                    limpiar();

                }

            }

        }
        if (e.getSource() == vrv.lbl_Volver) {
            vm.setVisible(true);
            vrv.dispose();
        }
        if (e.getSource() == vrv.lbl_irWeb) {
            try {
                Desktop.getDesktop().browse(new URI("https://web.mintransporte.gov.co/Sibga/Home/Index"));
            } catch (IOException | URISyntaxException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo conectar a Internet. Por favor, revise su conexión.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == vrv.lbl_Registrar) {
            vrv.pnl_Registrar.setBackground(new Color(0, 181, 255));
        }
        if (e.getSource() == vrv.lbl_Volver) {
            vrv.pnl_Volver.setBackground(new Color(0, 181, 255));
        }
        if (e.getSource() == vrv.lbl_irWeb) {
            vrv.lbl_irWeb.setForeground(Color.BLUE);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == vrv.lbl_Registrar) {
            vrv.pnl_Registrar.setBackground(new Color(0, 153, 255));
        }
        if (e.getSource() == vrv.lbl_Volver) {
            vrv.pnl_Volver.setBackground(new Color(0, 153, 255));
        }
        if (e.getSource() == vrv.lbl_irWeb) {
            vrv.lbl_irWeb.setForeground(Color.black);
        }
    }

    private boolean validarPlaca(JTextField txt) {
        String patron = "^[a-zA-Z]{3}-[0-9]{3}$";
        Pattern p = Pattern.compile(patron);
        Matcher m = p.matcher(txt.getText());
        return m.matches();
    }

    public void limpiar() {
        String m = "";
        vrv.txt_Placa.setText(m);
        vrv.txt_Modelo.setText(m);
        vrv.txt_Color.setText(m);
        vrv.txt_Marca.setText(m);
        vrv.txt_Cilindraje.setText(m);
        vrv.txt_ValorComercial.setText(m);
        vrv.lbl_idclave.setText(m);

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

}
