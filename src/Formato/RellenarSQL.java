package Formato;

import ConexionBd.ConexionSQL;
import javax.swing.JComboBox;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Benji
 */
public class RellenarSQL {

    public static void llenarComboBox(JComboBox<String> comboBox, String tabla, String columna) {
        ConexionSQL conexionSQL = new ConexionSQL();
        Connection connection = conexionSQL.conexion();

        String query = "SELECT " + columna + " FROM " + tabla;
        try (PreparedStatement statement = connection.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery()) {

            comboBox.removeAllItems();
            while (resultSet.next()) {
                String item = resultSet.getString(columna);
                comboBox.addItem(item);
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
