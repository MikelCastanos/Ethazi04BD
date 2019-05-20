package BBDD;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ikasleaETHAZI
 */
public class Conexion {
    static Connection conectar = null;
    public Connection conectar(){
   
        try{
//          Driver e infromacion de la conexion
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/ethazi4","root","");
            System.out.println("Conexion establecida");

            }catch(SQLException ex){
//          Controlar errores de conexion usuario,  nombreBD, contraseña ...
            JOptionPane.showMessageDialog(null,"¡Error!"
                    + "\n No se puede continuar debido a que no hay conexión con la BBDD. Espere un momento o vuelva a intentarlo más adelante."
                    +"\n Disculpe las molestias causadas.");
            
            }catch(ClassNotFoundException ex){
//          Controlar error de driver
            JOptionPane.showMessageDialog(null,"No se encontro el Driver MySQL para JDBC.");
            }
         return conectar;
          }
    
    public Connection desconectar(){
        try{
            if(conectar!=null)
            conectar.close();
            System.out.println("Conexion cerrada"); 
            }catch(SQLException se){
                se.printStackTrace();
            }//final de finally
         
        return conectar;
    }
}