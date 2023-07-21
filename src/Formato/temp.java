package Formato;

import java.io.BufferedReader;
import javax.swing.JTable;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Benji
 */
public class temp {

    public static void guardarDatostxtTemp(JTable table, String filePath) {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                int rowCount = table.getRowCount();
                int columnCount = table.getColumnCount();

                // Guardar los nombres de las columnas en el archivo
                for (int column = 0; column < columnCount; column++) {
                    bufferedWriter.write(table.getColumnName(column));
                    if (column < columnCount - 1) {
                        bufferedWriter.write("\t");
                    }
                }
                bufferedWriter.newLine();

                // Guardar los datos de cada fila en el archivo
                for (int row = 0; row < rowCount; row++) {
                    for (int column = 0; column < columnCount; column++) {
                        Object value = table.getValueAt(row, column);
                        if (value != null) {
                            bufferedWriter.write(value.toString());
                        }
                        if (column < columnCount - 1) {
                            bufferedWriter.write("\t");
                        }
                    }
                    bufferedWriter.newLine();
                }
            }
            System.out.println("Datos del JTable guardados exitosamente en el archivo: " + filePath);
        } catch (IOException e) {
            System.err.println("Error al guardar los datos del JTable en el archivo: " + e.getMessage());
        }
    }

    public static void leerDatosTxtTemp(JTable table, String filePath) {
        try {
            FileReader fileReader = new FileReader(filePath);
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0); // Limpiar el modelo del JTable

                String line;
                boolean firstLineSkipped = false;

                while ((line = bufferedReader.readLine()) != null) {
                    if (!firstLineSkipped) {
                        firstLineSkipped = true;
                        continue; // Omitir la primera línea (encabezados)
                    }
                    String[] data = line.split("\t");
                    model.addRow(data);
                }
            }
            System.out.println("Datos del archivo de texto rellenados en el JTable.");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de texto: " + e.getMessage());
        }
    }

    public static void vaciarArchivo(String nombreArchivo) {
        // Crear el objeto File con el nombre del archivo o la dirección
        File archivo = new File(nombreArchivo);

        try {
            // Crear FileWriter para escribir en el archivo (borrará el contenido existente)
            FileWriter writer = new FileWriter(archivo);
            // Crear PrintWriter para escribir en el archivo de manera más conveniente
            PrintWriter pw = new PrintWriter(writer);

            // Cerrar el PrintWriter (esto vaciará el contenido del archivo)
            pw.close();

            System.out.println("El archivo " + nombreArchivo + " ha sido vaciado.");
        } catch (IOException e) {
            System.err.println("Error al vaciar el archivo: " + e.getMessage());
        }
    }
}
