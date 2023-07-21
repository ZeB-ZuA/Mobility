/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ZEB
 */
public class DAO_vehiculo extends Conexion {

    @Override
    public void connect() {
        super.connect(); 
    }

    public boolean create(DTO_vehiculo vx) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "INSERT INTO VEHICULO (placa,tipo,modelo,color,marca,cilindraje, valorComercial,cc,combustible, anio_Registro) VALUES(?,?,?,?,?,?,?,?,?,?)";

        try {
            pst = con.prepareStatement(stm);

            pst.setString(1, vx.getPlaca());
            pst.setString(2, vx.getTipo());
            pst.setInt(3, vx.getModelo());
            pst.setString(4, vx.getColor());
            pst.setString(5, vx.getMarca());
            pst.setInt(6, vx.getClindraje());
            pst.setDouble(7, vx.getValorComercial());
            pst.setLong(8, vx.getCc());
            pst.setString(9, vx.getCombustible());
            pst.setInt(10, vx.getAnioR());
            pst.execute();
            return true;

        } catch (SQLException ex) {
            errorM("Insertar" + ex, "Error al insertar datos");
            return false;
        }

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

   public ArrayList<DTO_vehiculo> read(long cc) {
    connect();
    Connection con = getConnection();
    PreparedStatement pst;
    String stm = "SELECT * FROM VEHICULO WHERE cc=?";
    ResultSet rst;
    ArrayList<DTO_vehiculo> vehiculos = new ArrayList<>();

    try {
        pst = con.prepareStatement(stm);
        pst.setLong(1, cc);
        rst = pst.executeQuery();

        while (rst.next()) {
            DTO_vehiculo vehiculo = new DTO_vehiculo();
            vehiculo.setPlaca(rst.getString("placa"));
            vehiculo.setTipo(rst.getString("tipo"));
            vehiculo.setModelo(rst.getInt("modelo"));
            vehiculo.setColor(rst.getString("color"));
            vehiculo.setMarca(rst.getString("marca"));
            vehiculo.setClindraje(rst.getInt("cilindraje"));
            vehiculo.setValorComercial(rst.getDouble("valorComercial"));
            vehiculo.setCc(rst.getLong("cc"));
            vehiculo.setCombustible(rst.getString("combustible"));
            vehiculo.setAnioR(rst.getInt("anio_Registro"));
            vehiculos.add(vehiculo);
        }

    } catch (SQLException ex) {
        errorM("Error", "Error al consultar");
    }

    return vehiculos;
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean update(DTO_vehiculo vx) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "UPDATE VEHICULO SET color=?,cilindraje=? WHERE placa=?";

        try {
            pst = con.prepareStatement(stm);

            pst.setString(1, vx.getColor());
            pst.setInt(2, vx.getClindraje());
            pst.setString(3, vx.getPlaca());
            pst.execute();
            return true;

        } catch (SQLException ex) {
            errorM("Actualizar", "Error al actualizar datos");
            return false;
        }

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public boolean delete(String placa) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "DELETE FROM VEHICULO WHERE placa=?";
        try {
            pst = con.prepareStatement(stm);
            pst.setString(1, placa);
            pst.execute();
            return true;
        } catch (SQLException ex) {
            errorM("Eliminar", "Error al eliminar datos");
            System.out.println(ex);
            return false;
        }
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean deleteUsingCc(long cc) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "DELETE FROM VEHICULO WHERE cc=?";
        try {
            pst = con.prepareStatement(stm);
            pst.setLong(1, cc);
            pst.execute();
            return true;
        } catch (SQLException ex) {
            errorM("Eliminar", "Error al eliminar datos");
            System.out.println(ex);
            return false;
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void errorM(String t, String m) {
        JOptionPane.showMessageDialog(null, t, m, JOptionPane.ERROR_MESSAGE);
    }
}
