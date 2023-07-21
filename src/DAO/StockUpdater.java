package DAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StockUpdater {

    public static void updateStockFromTextFile(String tableName, String productNameColumn, String stockColumn,
            String filePath, int productNameColumnIndex, int quantityColumnIndex) {
        // Leer el archivo de texto y actualizar el stock en la base de datos
        try {
            // Conectar a la base de datos
            ConexionSQL conexionSQL = new ConexionSQL();
            Connection connection = conexionSQL.conexion();
            if (connection == null) {
                System.out.println("No se pudo establecer la conexión con la base de datos.");
                return;
            }

            // Leer el archivo de texto y actualizar el stock en la base de datos
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
                String line;
                boolean firstLineSkipped = false; // Para omitir la primera línea (encabezados)
                while ((line = bufferedReader.readLine()) != null) {
                    if (!firstLineSkipped) {
                        firstLineSkipped = true;
                        continue; // Omitir la primera línea (encabezados)
                    }
                    String[] data = line.split("\t");
                    if (data.length > Math.max(productNameColumnIndex, quantityColumnIndex)) {
                        String productName = data[productNameColumnIndex].trim();
                        int quantity = 0;
                        try {
                            quantity = Integer.parseInt(data[quantityColumnIndex].trim());
                        } catch (NumberFormatException e) {
                            System.err.println("Error al convertir a entero en línea: " + line);
                            continue; // Omitir esta línea y pasar a la siguiente
                        }

                        // Actualizar el stock en la base de datos
                        updateStockInDatabase(connection, tableName, productNameColumn, stockColumn, productName, quantity);
                    }
                }
            } catch (IOException e) {
                System.err.println("Error al leer el archivo de texto: " + e.getMessage());
            } finally {
                connection.close();
            }
        } catch (SQLException e) {
            System.err.println("Error al establecer la conexión con la base de datos: " + e.getMessage());
        }
    }

    private static void updateStockInDatabase(Connection connection, String tableName, String productNameColumn,
            String stockColumn, String productName, int quantity) throws SQLException {
        String query = "SELECT " + stockColumn + " FROM " + tableName + " WHERE " + productNameColumn + " = ?";
        try (PreparedStatement selectStatement = connection.prepareStatement(query)) {
            selectStatement.setString(1, productName);
            ResultSet resultSet = selectStatement.executeQuery();

            if (resultSet.next()) {
                int currentStock = resultSet.getInt(stockColumn);
                int updatedStock = currentStock - quantity;

                String updateQuery = "UPDATE " + tableName + " SET " + stockColumn + " = ? WHERE " + productNameColumn + " = ?";
                try (PreparedStatement updateStatement = connection.prepareStatement(updateQuery)) {
                    updateStatement.setInt(1, updatedStock);
                    updateStatement.setString(2, productName);
                    updateStatement.executeUpdate();
                }
            }
        }
    }
}
