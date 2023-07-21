
package Controlador;
import Modelo.*;
import Vistas.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Crtl_Vinicio_usuario implements MouseListener{
 
    private Vinicio_usuario viu;
    private Vmenu vm;

    public Crtl_Vinicio_usuario(Vinicio_usuario viu, Vmenu vm) {
        this.viu = viu;
        this.vm = vm;
        this.viu.lbl_Entrar.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    vm.setVisible(true);
    viu.dispose();
    }

    
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    
    
    
}
