package Controlador;

import Vistas.*;
import Modelo.*;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author sebastian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "prueba de commit");
        Vinicio_usuario viu = new Vinicio_usuario();
        Vregistro_Propietario vrp = new Vregistro_Propietario();
        Vregistro_Vehiculo vrv = new Vregistro_Vehiculo();
        Vmenu vm = new Vmenu();
        VmenuActualizar vma = new VmenuActualizar();
        VmenuInforme vmi = new VmenuInforme();
        VBusqueda vmb = new VBusqueda();
        VidPropietario vip = new VidPropietario();
        VaccionActu vaa = new VaccionActu();
        VmenuEliminar vme = new VmenuEliminar();
        Vactualizar_Propietario vap = new Vactualizar_Propietario();
        VplacaVehiculoEliminar vpve = new VplacaVehiculoEliminar();
        VplacaVehiculo vpv = new VplacaVehiculo();
        VInformeAnual via = new VInformeAnual();
        VmoraActual vmra = new VmoraActual();
        Vactualizar_Vehiculo vav = new Vactualizar_Vehiculo();
        Vimpuestos vi = new Vimpuestos();
        VmenuComparendos vmc = new VmenuComparendos();
        Vregistro_Comparendos vrc = new Vregistro_Comparendos();
        Vver_comparendos vvc = new Vver_comparendos();
        ////////////////////////////////////////////////////////////////////////////////////////////////
        DAO_propietario daop = new DAO_propietario();
        DTO_propietario dtop = new DTO_propietario();
        DAO_vehiculo daov = new DAO_vehiculo();
        DTO_vehiculo dtov = new DTO_vehiculo();
        DAO_impuesto daoi = new DAO_impuesto();
        DTO_impuesto dtoi = new DTO_impuesto();
        DAO_pagos_impuesto daopi = new DAO_pagos_impuesto();
        DTO_pagos_impuesto dtopi = new DTO_pagos_impuesto();
        DTO_comparendo dtoc = new DTO_comparendo();
        DAO_comparendo daoc = new DAO_comparendo();
        DAO_pagos_comparendo daopc = new DAO_pagos_comparendo();
        DTO_pagos_comparendo dtopc = new DTO_pagos_comparendo();

        /////////////////////////////////////////////////////////////////////////////////////////////
        Crtl_Vinicio_usuario crtl_Vinicio_usuario = new Crtl_Vinicio_usuario(viu, vm);
        Ctrl_Vmenu ctrl_Vmenu = new Ctrl_Vmenu(vrp, vip, vmi, vmb, vm, vmc);
        Ctrl_Vregistro_Propietario ctrl_Vregistro_Propietario = new Ctrl_Vregistro_Propietario(daop, dtop, vrp, vm, vrv);
        Ctrl_Vregistro_Vehiculo ctrl_Vregistro_Vehiculo = new Ctrl_Vregistro_Vehiculo(daov, dtov, vm, vrv, vi);
        Ctrl_VidPropietario ctrl_VidPropietario = new Ctrl_VidPropietario(vm, vip, vaa);
        Ctrl_VaccionActu ctrl_VaccionActu = new Ctrl_VaccionActu(vaa, vma, vme, vm);
        Ctrl_VmenuEliminar ctrl_VmenuEliminar = new Ctrl_VmenuEliminar(vm, vme, vpve, daop, dtop, daov, dtov,daopc, dtopc,daoc,dtoc,daoi,dtoi,daopi,dtopi);
        Ctrl_VplacaVehiculoEliminar ctrl_VplacaVehiculoEliminar = new Ctrl_VplacaVehiculoEliminar(vm, dtov, daov, vme, vpve,dtoi,daoi, dtopi,daopi);
        Ctrl_VmenuActualizar ctrl_VmenuActualizar = new Ctrl_VmenuActualizar(vma, vap, vpv, vrv, vm);
        Ctrl_Vactualizar_Propietario ctrl_Vactualizar_Propietario = new Ctrl_Vactualizar_Propietario(dtop, daop, vap, vma);
        Ctrl_VBusqueda ctrl_VBusqueda = new Ctrl_VBusqueda(vmb, vm, dtov, daov);
        Ctrl_VmenuInforme ctrl_VmenuInforme = new Ctrl_VmenuInforme(vmi, vm, via, vmra);
        Ctrl_VInformeAnual ctrl_VInformeAnual = new Ctrl_VInformeAnual(via, vm, vmi, daoi, dtoi);
        Ctrl_VmoraActual ctrl_VmoraActual = new Ctrl_VmoraActual(vmra, vm, vmi, daopi, dtopi);
        Ctrl_VplacaVehiculo ctrl_VplacaVehiculo = new Ctrl_VplacaVehiculo(vpv, vma, vav);
        Ctrl_Vactualizar_Vehiculo ctrl_Vactualizar_Vehiculo = new Ctrl_Vactualizar_Vehiculo(dtov, daov, vav, vma);
        Ctrl_Vimpuestos ctrl_Vimpuestos = new Ctrl_Vimpuestos(vi, daoi, dtoi, daopi, dtopi, vm);
        Ctrl_VmenuComparendos ctrl_VmenuComparendos = new Ctrl_VmenuComparendos(vrc, vm, vmc, vvc);
        Ctrl_Vregistro_Comparendos ctrl_Vregistro_Comparendos = new Ctrl_Vregistro_Comparendos(vrc, vmc, daoc, dtoc, daopc, dtopc);
        Ctrl_Vver_comparendos ctrl_Vver_comparendos = new Ctrl_Vver_comparendos(vvc, vmc, daopc, dtopc);
        ///////////////////////////////////////////////////////////////////////////////////////////////
        viu.setVisible(true);

    }
}
