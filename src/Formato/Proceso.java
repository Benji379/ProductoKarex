package Formato;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextField;

/**
 *
 * @author Benji
 */
public class Proceso {

    public static void Transparentar(JTextField txtField) {
        txtField.setBackground(new java.awt.Color(0, 0, 0, 1));
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

    public static void limpiarTxtFields(JTextField... txt) {
        for (JTextField tx : txt) {
            tx.setText("");
        }
    }

    public static String obtenerFechaHoraActual() {
        Date fechaHora = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formato.format(fechaHora);
    }

}
