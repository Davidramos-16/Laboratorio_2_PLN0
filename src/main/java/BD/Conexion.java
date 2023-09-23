/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dr264
 */
public class Conexion {
    
         private static Connection conn;
    //protected  String HOST = "jdbc:mysql://db-corto-2.cqbzkt2cy0bh.us-east-2.rds.amazonaws.com";
    protected String HOST = "jdbc:mysql://db-corto-2.cqbzkt2cy0bh.us-east-2.rds.amazonaws.com?useSSL=false";
    protected String User = "admin";
    protected String Pwd = "Corto2pln0*";
    protected String driver = "com.mysql.cj.jdbc.Driver";
    protected String string_connect = "jdbc:mysql://db-corto-2.cqbzkt2cy0bh.us-east-2.rds.amazonaws.com?useSSL=false";

    public Conexion() 
    {
        conn = null;
        
        try
        {
            Class.forName(driver);
            conn = DriverManager.getConnection(HOST, User, Pwd);
            if(conn != null)
            {
                System.out.println("Conexion establecida");
            }
                    
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Error al conectar :" + e);
        }
    }
    
    public Connection getConnection()
    {
        return conn;
    }
    
    public void desconectar()
    {
        conn = null;
        
        if(conn == null)
        {
            System.out.println("Conexion terminada");
        }
    }
    
   public void select() ///Metodo para obtener a los clientes
    {
        
        try {
            
            
            // Define your SQL query
           
            
           Statement statement = conn.createStatement();
            
           statement.execute("use clientes;");
           
           // Execute the query and get the result set
           ResultSet resultSet = statement.executeQuery("SELECT * FROM control_clientes where id_cliente = 1; ");
            
            
            // Process the result set
            while (resultSet.next()) {
                // Retrieve data from the result set
                int id = resultSet.getInt("id_cliente");
                String name = resultSet.getString("nombre");
                
                // Do something with the retrieved data (e.g., print it)
                System.out.println("Field: " + id + ", Type: " + name);
            }
            
            // Close resources
            resultSet.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   
   public void delete(String id_)
   {
        try {
            
            
            // Define your SQL query
           
            
           Statement statement = conn.createStatement();
            
           statement.execute("use clientes;");
           
           // Execute the query and get the result set
           ResultSet resultSet = statement.executeQuery("update  control_clientes set estado = 0 where id_cliente = '"+id_+"' ");
            
            
            // Process the result set
            while (resultSet.next()) {
                // Retrieve data from the result set
                int id = resultSet.getInt("id_cliente");
                String name = resultSet.getString("nombre");
                
                // Do something with the retrieved data (e.g., print it)
                System.out.println("Field: " + id + ", Type: " + name);
            }
            
            // Close resources
            resultSet.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
   }
   
   public void create(String nombre_, String apellido_, String email_, String telefono_, double saldo_, String estado_ )           
   {
        try {
            
            
            // Define your SQL query
           
            
           Statement statement = conn.createStatement();
            
           statement.execute("use clientes;");
           
           // Execute the query and get the result set
           ResultSet resultSet = statement.executeQuery("insert into  control_clientes(nombre,apellido,email, telefono, saldo, estado) values('"+nombre_+"','"+apellido_+"','"+email_+"','"+telefono_+"','"+saldo_+"','"+estado_+"') ");
            
            
            // Process the result set
            while (resultSet.next()) {
                // Retrieve data from the result set
                int id = resultSet.getInt("id_cliente");
                String name = resultSet.getString("nombre");
                
                // Do something with the retrieved data (e.g., print it)
                System.out.println("Field: " + id + ", Type: " + name);
            }
            
            // Close resources
            resultSet.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
   }
   
   public void update(int id_, String nombre_, String apellido_, String email_, String telefono_, double saldo_, String estado_)
   {
        try {
            
            
            // Define your SQL query
           
            
           Statement statement = conn.createStatement();
            
           statement.execute("use clientes;");
           
           // Execute the query and get the result set
           ResultSet resultSet = statement.executeQuery("update control_clientes SET nombre = "+nombre_+"' ,apellido = '"+apellido_+"' ,email = '"+email_+"', telefono = '"+telefono_+"', saldo '"+saldo_+"' , estado ='"+estado_+"' WHERE id_cliente ='"+id_+"';  ");
            
            
            // Process the result set
            while (resultSet.next()) {
                // Retrieve data from the result set
                int id = resultSet.getInt("id_cliente");
                String name = resultSet.getString("nombre");
                
                // Do something with the retrieved data (e.g., print it)
                System.out.println("Field: " + id + ", Type: " + name);
            }
            
            // Close resources
            resultSet.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
   }
}

