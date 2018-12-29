package northwind_java;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection getKoneksi;
    public static Connection getKoneksi()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/northwind"; 
            String user="root"; 
            String pass=""; 
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            getKoneksi=DriverManager.getConnection(url, user, pass);            
        } catch (SQLException e) {
            System.err.println("koneksi gagal "+e.getMessage()); 
        }
        return getKoneksi;
    }    
}
