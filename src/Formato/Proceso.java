package Formato;

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
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

}
