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
    public Connection conectar(){
   
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/ethazi4","root","");
            System.out.println("Conexion establecida");

            }
        
        catch(Exception e){
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
        return conectar;
    }
 
}
