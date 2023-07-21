/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ZEB
 */
public class DAO_propietario extends Conexion {

    @Override
    public void connect() {
        super.connect();
    }


    public boolean create(DTO_propietario px) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "INSERT INTO persona (cc,nombres,apellidos,genero,fNacimiento,telefono,email) VALUES(?,?,?,?,?,?,?)";

        try {
            pst = con.prepareStatement(stm);
            pst.setLong(1, px.getCc());
            pst.setString(2, px.getNombres());
            pst.setString(3, px.getApellidos());
            pst.setString(4, px.getGenero());
            pst.setDate(5, (Date) px.getfNacimiento());
            pst.setLong(6, px.getTelefono());
            pst.setString(7, px.getEmail());
            pst.execute();
            return true;

        } catch (SQLException ex) {
            errorM("Insertar", "Error al insertar datos");
            return false;
        }

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean read(DTO_propietario px) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "SELECT * FROM persona WHERE cc=?";
        ResultSet rst;

        try {
            pst = con.prepareStatement(stm);
            pst.setLong(1, px.getCc());
            rst = pst.executeQuery();

            if (rst.next()) {
                px.setCc(rst.getLong("cc"));
                px.setNombres(rst.getString("nombres"));
                px.setApellidos(rst.getString("apellidos"));
                px.setGenero(rst.getString("genero"));
                px.setfNacimiento(rst.getDate("fNacimiento"));
                px.setTelefono(rst.getLong("telefono"));
                px.setEmail(rst.getString("email"));
                return true;
            }
            return false;

        } catch (SQLException ex) {
            errorM("Error", "Error al consultar");
            return false;
        }
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean update(DTO_propietario px) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "UPDATE persona SET nombres=?,apellidos=?,genero=?,telefono=?,email=? WHERE cc=?";

        try {
            pst = con.prepareStatement(stm);

            pst.setString(1, px.getNombres());
            pst.setString(2, px.getApellidos());
            pst.setString(3, px.getGenero());
            pst.setLong(4, px.getTelefono());
            pst.setString(5, px.getEmail());
            pst.setLong(6, px.getCc());
            pst.execute();
            return true;

        } catch (SQLException ex) {
            errorM("Error al actualizar datos"+ex, "Actualizar");
            System.out.println(ex);
            return false;
        }

    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean delete(long cc) {
        connect();
        Connection con = getConnection();
        PreparedStatement pst;
        String stm = "DELETE FROM persona WHERE cc=?";
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
