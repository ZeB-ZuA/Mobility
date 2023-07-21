package Modelo;

import java.net.URI;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_impuesto extends Conexion {

    @Override
    public void connect() {
        super.connect();
    }

    public boolean create(DTO_impuesto ix) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "INSERT INTO IMPUESTO (nit,placa,fLimite,valor) VALUES(?,?,?,?)";

        try {
            pst = con.prepareStatement(stm);
            pst.setLong(1, ix.getNit());
            pst.setString(2, ix.getPlaca());
            pst.setInt(3, ix.getAnio());
            pst.setDouble(4, ix.getValor());
            pst.execute();
            return true;

        } catch (SQLException ex) {
            errorM("Error al insertar datos"+ex, "Insertar");
            System.out.println(ex);
            return false;
        }

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

   public ArrayList<DTO_impuesto> read(int anio) {
    connect();
    Connection con = getConnection();
    PreparedStatement pst;
    String stm = "SELECT * FROM IMPUESTO WHERE fLimite=?";
    ResultSet rst;

    ArrayList<DTO_impuesto> impuestos = new ArrayList<>();

    try {
        pst = con.prepareStatement(stm);
        pst.setInt(1, anio);
        rst = pst.executeQuery();

        while (rst.next()) {
            DTO_impuesto ix = new DTO_impuesto();
            ix.setNit(rst.getInt("nit"));
            ix.setPlaca(rst.getString("placa"));
            ix.setAnio(rst.getInt("fLimite"));
            ix.setValor(rst.getDouble("valor"));
            impuestos.add(ix);
        }

    } catch (SQLException ex) {
        errorM("Error", "Error al consultar");
    }

    return impuestos;
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean update(DTO_impuesto ix) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "UPDATE PROPIETARIO SET fLimite=?,valor=? WHERE nit=?";

        try {
            pst = con.prepareStatement(stm);
            pst.setInt(1, ix.getAnio());
            pst.setDouble(2, ix.getValor());
            pst.setInt(3, ix.getNit());
            pst.execute();
            return true;

        } catch (SQLException ex) {
            errorM("Error al actualizar datos" + ex, "Actualizar");
            System.out.println(ex);
            return false;
        }

    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean delete(DTO_impuesto ix) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "DELETE FROM IMPUESTO WHERE nit=?";
        try {
            pst = con.prepareStatement(stm);
            pst.setInt(1, ix.getNit());
            pst.execute();
            return true;
        } catch (SQLException ex) {
            errorM("Error al eliminar datos"+ex, "Eliminar");
            System.out.println(ex);
            return false;
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public boolean cascadeDelete(String placa) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "DELETE FROM IMPUESTO WHERE placa=?";
        try {
            pst = con.prepareStatement(stm);
            pst.setString(1, placa);
            pst.execute();
            return true;
        } catch (SQLException ex) {
            errorM("Error al eliminar datos"+ex, "Eliminar");
            System.out.println(ex);
            return false;
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public boolean cascadeDeleteCc(long cc) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "DELETE FROM IMPUESTO WHERE placa IN (SELECT placa FROM VEHICULO WHERE cc=?)";
        try {
            pst = con.prepareStatement(stm);
            pst.setLong(1, cc);
            pst.execute();
            return true;
        } catch (SQLException ex) {
            errorM("Error al eliminar datos"+ex, "Eliminar");
            System.out.println(ex);
            return false;
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public void errorM(String t, String m) {
        JOptionPane.showMessageDialog(null, t, m, 1);
    }
}
