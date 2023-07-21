/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ZEB
 */
public class DAO_pagos_comparendo extends Conexion {

    @Override
    public void connect() {
        super.connect();
    }

    public boolean create(DTO_pagos_comparendo ix) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "INSERT INTO pagos_comparendo (codigo_transaccion,cc,radicado,estado) VALUES(?,?,?,?)";

        try {
            pst = con.prepareStatement(stm);
            pst.setInt(1, ix.getCod_trans());
            pst.setLong(2, ix.getCc());
            pst.setInt(3, ix.getRadicado());
            pst.setString(4, ix.getEstado());
            pst.execute();
            return true;

        } catch (SQLException ex) {
            errorM("Insertar"+ex, "Error al insertar datos");
            return false;
        }

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   PAGO
//EN MORA
//PAGANDO
    
   public ArrayList<DTO_pagos_comparendo> readEnmora() {
    connect();
    Connection con = getConnection();
    PreparedStatement pst;
    String stm = "SELECT * FROM pagos_comparendo WHERE estado = 'EN MORA'";
    ResultSet rst;
    ArrayList<DTO_pagos_comparendo> pagosEnMora = new ArrayList<>();

    try {
        pst = con.prepareStatement(stm);
        rst = pst.executeQuery();

        while (rst.next()) {
            DTO_pagos_comparendo px = new DTO_pagos_comparendo();
            px.setCod_trans(rst.getInt("codigo_transaccion"));
            px.setCc(rst.getLong("cc"));
            px.setRadicado(rst.getInt("radicado"));
            px.setEstado(rst.getString("estado"));
            pagosEnMora.add(px);
        }

    } catch (SQLException ex) {
        errorM("Error" + ex, "Error al consultar");
        System.out.println(ex);
    }
    
    return pagosEnMora;
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public ArrayList<DTO_pagos_comparendo> readPago() {
    connect();
    Connection con = getConnection();
    PreparedStatement pst;
    String stm = "SELECT * FROM pagos_comparendo WHERE estado='PAGO'";
    ResultSet rst;
    ArrayList<DTO_pagos_comparendo> pagos = new ArrayList<>();

    try {
        pst = con.prepareStatement(stm);
        rst = pst.executeQuery();

        while (rst.next()) {
            DTO_pagos_comparendo ix = new DTO_pagos_comparendo();
            ix.setCod_trans(rst.getInt("codigo_transaccion"));
            ix.setCc(rst.getLong("cc"));
            ix.setRadicado(rst.getInt("radicado"));
            ix.setEstado(rst.getString("estado"));
            pagos.add(ix);
        }

    } catch (SQLException ex) {
        errorM("Error"+ex, "Error al consultar");
        System.out.println(ex);
    }

    return pagos;
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public ArrayList<DTO_pagos_comparendo> readPagando() {
    connect();
    Connection con = getConnection();
    PreparedStatement pst;
    String stm = "SELECT * FROM pagos_comparendo WHERE estado='PAGANDO'";
    ResultSet rst;
    ArrayList<DTO_pagos_comparendo> pagos = new ArrayList<>();

    try {
        pst = con.prepareStatement(stm);
        rst = pst.executeQuery();

        while (rst.next()) {
            DTO_pagos_comparendo px = new DTO_pagos_comparendo();
            px.setCod_trans(rst.getInt("codigo_transaccion"));
            px.setCc(rst.getLong("cc"));
            px.setRadicado(rst.getInt("radicado"));
            px.setEstado(rst.getString("estado"));
            pagos.add(px);
        }
    } catch (SQLException ex) {
        errorM("Error"+ex, "Error al consultar");
        System.out.println(ex);
    }

    return pagos;
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean update(DTO_pagos_comparendo ix) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "UPDATE PAGOS_COMPARENDO SET estado=? WHERE codigo_transaccion=?";

        try {
            pst = con.prepareStatement(stm);
            pst.setString(1, ix.getEstado());
            pst.setInt(2, ix.getCod_trans());
            pst.execute();
            return true;

        } catch (SQLException ex) {
            errorM("Error al actualizar datos" + ex, "Actualizar");
            System.out.println(ex);
            return false;
        }

    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public boolean delete(long cc) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "DELETE FROM PAGOS_COMPARENDO WHERE cc=?";
        try {
            pst = con.prepareStatement(stm);
            pst.setLong(1, cc);
            pst.execute();
            return true;
        } catch (SQLException ex) {
            errorM("Error al eliminar datos" + ex, "Eliminar");
            System.out.println(ex);
            return false;
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void errorM(String t, String m) {
        JOptionPane.showMessageDialog(null, t, m, 1);
    }

}
