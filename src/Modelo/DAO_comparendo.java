/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.net.URI;
import java.sql.*;
import javax.swing.JOptionPane;

public class DAO_comparendo extends Conexion {

    @Override
    public void connect() {
        super.connect();
    }

    public boolean create(DTO_comparendo ix) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "INSERT INTO COMPARENDO (radicado,cc,fecha,descripcion,valor) VALUES(?,?,?,?,?)";

        try {
            pst = con.prepareStatement(stm);
            pst.setInt(1, ix.getRadicado());
            pst.setLong(2, ix.getCc());
            pst.setDate(3, (Date) ix.getFecha());
            pst.setString(4, ix.getDescripcion());
            pst.setDouble(5, ix.getValor());
            pst.execute();
            return true;

        } catch (SQLException ex) {
            errorM("Insertar", "Error al insertar datos");
            return false;
        }

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean read(DTO_comparendo ix) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "SELECT * FROM COMPARENDO WHERE radicado=?";
        ResultSet rst;

        try {
            pst = con.prepareStatement(stm);
            pst.setInt(1, ix.getRadicado());
            rst = pst.executeQuery();

            if (rst.next()) {
                ix.setRadicado(rst.getInt("radicado"));
                ix.setCc(rst.getLong("cc"));
                ix.setFecha(rst.getDate("fecha"));
                ix.setDescripcion(rst.getString("descripcion"));
                ix.setValor(rst.getDouble("valor"));
                return true;
            }
            return false;

        } catch (SQLException ex) {
            errorM("Error", "Error al consultar");
            return false;
        }
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean update(DTO_comparendo ix) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "UPDATE COMPARENDO SET descripcion=?,valor=? WHERE radicado=?";

        try {
            pst = con.prepareStatement(stm);
            pst.setString(1, ix.getDescripcion());
            pst.setDouble(2, ix.getValor());
            pst.setInt(3, ix.getRadicado());
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
        String stm = "DELETE FROM COMPARENDO WHERE cc=?";
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
