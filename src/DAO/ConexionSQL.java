package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL {

    public Connection conexion() {
        Connection conectar = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/producto_kardex", "root", "");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        return conectar;
    }
}
