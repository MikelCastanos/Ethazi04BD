/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BBDD;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ikasleaETHAZI
 */
public class Consultas {
    
//    Metodo consulta recibe connexio  y la consulta=query
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
       System.out.println("Datos insertados correctamente ");

       return true;
    }
    
    
public boolean boleano(Connection con, String query){
       Statement st;
       try{
           st=con.createStatement();
       }catch(SQLException e){
           System.out.println(e.getMessage());
           System.out.println("Insertar 1: "+e.getMessage());
           return false;
       }
       try{
           st.execute(query);
       }catch(Exception e){
           System.out.println(e.getMessage());
           System.out.println("Insertar 2: "+e.getMessage());
           return false;
       }
       return true;
    }

        

    }

