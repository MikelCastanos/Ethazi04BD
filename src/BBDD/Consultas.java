/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BBDD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ikasleaETHAZI
 */
public class Consultas {
    
//    Metodo consulta recibe connection= con y la consulta=query
    public ResultSet consultaBD(Connection con, String query){
        ResultSet rs=null;
        try{
            
            Statement st= con.createStatement();
            rs= st.executeQuery(query);
            
        }catch (Exception e){
           System.out.println(e.getMessage());
        }
        return rs;
    }
    
    
    public boolean insertarDatosBD(Connection con, String query){
       Statement st;
       try{
           st=con.createStatement();
       }catch(SQLException e){
           System.out.println(e.getMessage());
           return false;
       }
       try{
           st.executeUpdate(query);
       }catch(Exception e){
           System.out.println(e.getMessage());
           return false;
       }
       return true;
    }
}
