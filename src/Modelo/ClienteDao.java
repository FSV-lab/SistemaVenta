

package Modelo;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ClienteDao {
    
    Conexion cn = new Conexion();
    Connection con; 
    PreparedStatement ps;
    
    public  boolean RegistrarCliente(Cliente cl){
        String sql = "INSERT INTO clientes (rut,nombre,telefono,direccion,razon)(?,?,?,?,?)";
        try {
           con = cn.getConnection();
          //ps = con.prepareStatement(sql);declaracion error no compatible con my sql
           ps.setInt(1, cl.getRut());
           ps.setString(2,cl.getNombre());
           ps.setInt(3,cl.getTelefono());
           ps.setString(4,cl.getDireccion());
           ps.setString(5,cl.getRazon());
           ps.execute();
           return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
           return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
   
        }
       
 
        
    }

}
