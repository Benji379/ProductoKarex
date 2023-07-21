package Formato;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Benji
 */
public class Proceso {

    private final List<JTextField> listaDeJTextFields;

    public Proceso(JTextField... txtFields) {
        listaDeJTextFields = new ArrayList<>();
        listaDeJTextFields.addAll(Arrays.asList(txtFields));
    }

    public void Transparentar() {
        Proceso.Transparentar(listaDeJTextFields.toArray(new JTextField[0]));
    }

    public void limpiarTxtFields() {
        limpiarTxtFields(listaDeJTextFields.toArray(new JTextField[0]));
    }

    public static void Transparentar(JTextField... txtField) {
        for (JTextField txt : txtField) {
            txt.setBackground(new java.awt.Color(0, 0, 0, 1));
        }
    }

    public static void limpiarTxtFields(JTextField... txt) {
        for (JTextField tx : txt) {
            tx.setText("");
        }
    }

    public static boolean detectarVacios(String... txt) {
        boolean detectado = false;

        for (String tx : txt) {
            if (tx.equals("")) {
                detectado = true;
            }
        }
        return detectado;
    }

    public static String obtenerFechaHoraActual() {
        Date fechaHora = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formato.format(fechaHora);
    }

    public static double sumColumnValues(JTable table, int columnIndex) {
        if (table == null || columnIndex < 0 || columnIndex >= table.getColumnCount()) {
            throw new IllegalArgumentException("Invalid table or column index.");
        }

        double sum = 0.0;
        int rowCount = table.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            Object value = table.getValueAt(i, columnIndex);
            if (value != null) {
                String stringValue = value.toString().trim();
                try {
                    // Try parsing the value as a double
                    double numericValue = Double.parseDouble(stringValue);
                    sum += numericValue;
                } catch (NumberFormatException e) {
                    // Ignore the cell if it cannot be parsed as a double
                    System.out.println("ERROR: " + e.getMessage());
                }
            }
        }

        return sum;
    }

    public static double sumarColumna(String nombreArchivo, int numeroColumna) {
        double suma = 0.0;
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] columnas = linea.split("\t");
                if (columnas.length > numeroColumna - 1) {
                    try {
                        double dato = Double.parseDouble(columnas[numeroColumna - 1]);
                        suma += dato;
                    } catch (NumberFormatException e) {
                        System.out.println("ERROR: No se pudo convertir a double en la línea: " + linea);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return suma;
    }

}
