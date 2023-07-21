package Modelo;

import java.net.URI;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_pagos_impuesto extends Conexion {

    @Override
    public void connect() {
        super.connect();
    }

    public boolean create(DTO_pagos_impuesto px) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "INSERT INTO PAGOS_IMPUESTO (cod_pago,cc,nit,estado) VALUES(?,?,?,?)";

        try {
            pst = con.prepareStatement(stm);
            pst.setInt(1, px.getCod_pago());
            pst.setLong(2, px.getCc());
            pst.setInt(3, px.getNit());
            pst.setString(4, px.getEstado());
            pst.execute();
            return true;

        } catch (SQLException ex) {
            errorM("Insertar"+ ex.getMessage(), "Error al insertar datos");
            System.out.println(ex.getMessage());
            return false;
        }
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public ArrayList<DTO_pagos_impuesto> readPago() {
    connect();
    Connection con = getConnection();
    PreparedStatement pst;
    String stm = "SELECT * FROM PAGOS_IMPUESTO WHERE estado = 'PAGO'";
    ResultSet rst;
    ArrayList<DTO_pagos_impuesto> pagos = new ArrayList<>();

    try {
        pst = con.prepareStatement(stm);
        rst = pst.executeQuery();

        while (rst.next()) {
            DTO_pagos_impuesto pago = new DTO_pagos_impuesto();
            pago.setCod_pago(rst.getInt("cod_pago"));
            pago.setCc(rst.getLong("cc"));
            pago.setNit(rst.getInt("nit"));
            pago.setEstado(rst.getString("estado"));
            pagos.add(pago);
        }

    } catch (SQLException ex) {
        errorM("Error", "Error al consultar");
        System.out.println(ex);
    }

    return pagos;
}
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

   public ArrayList<DTO_pagos_impuesto> readEnmora() {
    connect();
    Connection con = getConnection();
    PreparedStatement pst;
    String stm = "SELECT * FROM PAGOS_IMPUESTO WHERE estado = 'EN MORA'";
    ResultSet rst;
    ArrayList<DTO_pagos_impuesto> pagos = new ArrayList<>();

    try {
        pst = con.prepareStatement(stm);
        rst = pst.executeQuery();

        while (rst.next()) {
            DTO_pagos_impuesto pago = new DTO_pagos_impuesto();
            pago.setCod_pago(rst.getInt("cod_pago"));
            pago.setCc(rst.getLong("cc"));
            pago.setNit(rst.getInt("nit"));
            pago.setEstado(rst.getString("estado"));
            pagos.add(pago);
        }

    } catch (SQLException ex) {
        errorM("Error", "Error al consultar");
        System.out.println(ex);
    }

    return pagos;
}
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

   public ArrayList<DTO_pagos_impuesto> readPagando() {
    connect();
    Connection con = getConnection();
    PreparedStatement pst;
    String stm = "SELECT * FROM PAGOS_IMPUESTO WHERE estado = 'PAGANDO'";
    ResultSet rst;

    ArrayList<DTO_pagos_impuesto> pagosPagando = new ArrayList<>();

    try {
        pst = con.prepareStatement(stm);
        rst = pst.executeQuery();

        while (rst.next()) {
            DTO_pagos_impuesto px = new DTO_pagos_impuesto();
            px.setCod_pago(rst.getInt("cod_pago"));
            px.setCc(rst.getLong("cc"));
            px.setNit(rst.getInt("nit"));
            px.setEstado(rst.getString("estado"));
            pagosPagando.add(px);
        }

    } catch (SQLException ex) {
        errorM("Error", "Error al consultar");
    }

    return pagosPagando;
}
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean update(DTO_pagos_impuesto px) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "UPDATE PAGOS_IMPUESTO SET estado=? WHERE cod_pago=?";

        try {
            pst = con.prepareStatement(stm);

            pst.setString(1, px.getEstado());
            pst.setInt(2, px.getCod_pago());
            pst.execute();
            return true;

        } catch (SQLException ex) {
            errorM("Error al actualizar datos" + ex, "Actualizar");
            System.out.println(ex);
            return false;
        }

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public boolean delete(DTO_pagos_impuesto px) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "DELETE FROM PAGOS_IMPUESTO WHERE cod_pago=?";
        try {
            pst = con.prepareStatement(stm);
            pst.setInt(1, px.getCod_pago());
            pst.execute();
            return true;
        } catch (SQLException ex) {
            errorM("Error al eliminar datos" + ex, "Eliminar");
            System.out.println(ex);
            return false;
        }
    }
     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public boolean cascadeDelete(String placa) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "DELETE FROM pagos_impuesto WHERE nit IN (SELECT nit FROM impuesto WHERE placa = ?)";
        try {
            pst = con.prepareStatement(stm);
            pst.setString(1, placa);
            pst.execute();
            return true;
        } catch (SQLException ex) {
            errorM("Error al eliminar datos" + ex, "Eliminar");
            System.out.println(ex);
            return false;
        }
    }
     public boolean deleteUsingCc(long cc) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "DELETE FROM pagos_impuesto WHERE cc=?";
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

    public void errorM(String t, String m) {
        JOptionPane.showMessageDialog(null, t, m, 1);
    }
}
