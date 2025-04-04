/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package panaderiaant2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lucas
 */
public class ConexionDB {

private static final String URL = "jdbc:mariadb://localhost:3306/Panadera";
private static final String USER = "root";
private static final String PASSWORD = "password";
    
   
    public static void main(String[] args) {
    ConexionDB db = new ConexionDB();
    db.getConnection();
    }
    
    public Connection getConnection() {
    Connection connection = null;
    try{
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
        if(connection != null){
         System.out.println("Conexion exitosa");
            }
        }catch(SQLException  ex){
            System.out.println("Error in connection" + ex.getMessage());   
        }
        return connection;
    }
    
}
