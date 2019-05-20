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
    
//    Metodo consulta consulta=query
    public ResultSet consultaBD(String query){
        ResultSet rs=null;
        try{
            
            Statement st= Conexion.conectar.createStatement();
            rs= st.executeQuery(query);
            
        }catch (Exception e){
           System.out.println(e.getMessage());
        }
   
        return rs;
    }
    
    
    
    public boolean insertarDatosBD(String query){
       Statement st;
       try{
           st=Conexion.conectar.createStatement();
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
    
    public void actualizarBD(String query){
       Statement st = null;
       try{
           st=Conexion.conectar.createStatement();
       }catch(SQLException e){
           System.out.println(e.getMessage());
           
       }
       try{
           st.executeUpdate(query);
       }catch(Exception e){
           System.out.println(e.getMessage());
           
       }
       System.out.println("Datos insertados correctamente ");

       
    }
        
       public void borrarBD(String query){
       Statement st = null;
       try{
           st=Conexion.conectar.createStatement();
       }catch(SQLException e){
           System.out.println(e.getMessage());
           
       }
       try{
           st.executeUpdate(query);
       }catch(Exception e){
           System.out.println(e.getMessage());
           
       }
       System.out.println("Datos eliminados correctamente ");
    }

    }

