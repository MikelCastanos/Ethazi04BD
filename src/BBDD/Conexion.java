/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BBDD;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author ikasleaETHAZI
 */
public class Conexion {
    Connection conectar = null;
    public Connection conexion(){
   
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/ethazi4","root","");
            System.out.println("Conexion establecida");
//            Crear consulta
            Statement s = (Statement) conectar.createStatement(); 
            ResultSet rs = s.executeQuery ("select * from hotel");
//            Recorrer toda la información a mostrar
            while (rs.next()) 
                { 
                    System.out.println (rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getInt(3)+ " " + rs.getString (4)); 
                }
            }
        
        catch(Exception e){
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
        return conectar;
    }
 
}
