/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Daniel Felipe Hernandez Vargas
 */

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class EjecutarDAO {
 
    
    Connection conectar = null;
    String usuario ="postgres";
    String contrasenia="Colombia2028*";
    String bd="postgres";
    String ip="localhost";
    String puerto="5432";
    String cadena ="jdbc:postgresql://"+ ip+":"+puerto+"/"+bd;
    
    public Connection establecerConexion(){
        try{
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
        } 
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar" + e.toString());
        }
        return conectar;
            
    }
    
}
