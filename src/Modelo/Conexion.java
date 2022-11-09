 

package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion  {
    Connection con= null;
    public Connection getConnection(){
        try {
            String myBD;
            myBD = "jdbc:mysql://localhost:3306/bdsistemaventa?serverTimezone=UTC";
            con = DriverManager.getConnection(myBD,"root"," ");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
            
        }
     return null;
    }
}
