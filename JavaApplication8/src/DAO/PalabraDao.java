/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Daniel Hernandez
 */
import DAO.conexionSql;
import Modelo.Palabra;
import java.sql.Connection;
import java.sql.SQLException;

public class PalabraDao {

    java.sql.Statement st;
    java.sql.ResultSet rs;
    conexionSql cn = new conexionSql();
    int num = (int) (Math.random() * 9 + 1);

    public Palabra cargarPalabra() throws SQLException {

        Palabra pl = new Palabra();
        Connection conexion = cn.establecerConexion();
        st = conexion.createStatement();
        String sql = "SELECT * FROM public.\"Palabra\" where id ='" + num + "';";

        rs = st.executeQuery(sql);
        if (rs.next()) {
            pl = new Palabra(rs.getInt("id"), rs.getString("descripcion"));
        }
        return pl;
    }

}
