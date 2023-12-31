package Ventanas;

import DAO.ConexionSQL;
import DAO.Crud;
import Formato.Proceso;
import Formato.DiseñoTablas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Benji
 */
public class JpanelEmpleados extends javax.swing.JPanel {

    ConexionSQL con1 = new ConexionSQL();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;
    private Proceso text;
    private final Crud crud;

    public JpanelEmpleados() {
        initComponents();
        crud = new Crud();
        consultar();
        diseñoTablas();
        textFields();
    }

    private void textFields() {
        text = new Proceso(txtCodigoEmpleado, txtContraseña, txtDniEmpleado, txtNomEmpleado, txtSalario, txtTiempoContrato, txtTipoContrato);
        text.Transparentar();
    }

    private void diseñoTablas() {
        DiseñoTablas d = new DiseñoTablas();
        d.AspectoContenido(JTEMPLEADOS);
        d.AspectoEncabezados(JTEMPLEADOS);
    }

    private Map<String, Integer> asignarColumnasTabla() {
        Map<String, Integer> columnas = new HashMap<>();
        columnas.put("CodigoEmpleado", 0);
        columnas.put("dniEmpleado", 1);
        columnas.put("NomEmpleado", 2);
        columnas.put("TipoContrato", 3);
        columnas.put("TiempoContrato", 4);
        columnas.put("Salario", 5);
        columnas.put("password", 6);
        return columnas;
    }

    private Map<String, String> datosInsertar() {
        Map<String, String> columnas = new HashMap<>();
        columnas.put("dniEmpleado", txtDniEmpleado.getText());
        columnas.put("NomEmpleado", txtNomEmpleado.getText());
        columnas.put("TipoContrato", txtTipoContrato.getText());
        columnas.put("TiempoContrato", txtTiempoContrato.getText());
        columnas.put("Salario", txtSalario.getText());
        columnas.put("password", txtContraseña.getText());
        return columnas;
    }

    private void consultar() {
        crud.consultarTabla("empleado", asignarColumnasTabla(), JTEMPLEADOS);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTEMPLEADOS = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        txtDniEmpleado = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoEmpleado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtNomEmpleado = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtTipoContrato = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtTiempoContrato = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnModificar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(24, 24, 24));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTEMPLEADOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CodigoEmpleado", "DniEmpleado", "NomEmpleado", "T.Contrato", "TiempoContrato", "Salario", "Contraseña"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTEMPLEADOS.setGridColor(new java.awt.Color(30, 30, 30));
        JTEMPLEADOS.setSelectionBackground(new java.awt.Color(30, 30, 30));
        JTEMPLEADOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTEMPLEADOSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTEMPLEADOS);
        if (JTEMPLEADOS.getColumnModel().getColumnCount() > 0) {
            JTEMPLEADOS.getColumnModel().getColumn(0).setPreferredWidth(50);
            JTEMPLEADOS.getColumnModel().getColumn(1).setPreferredWidth(90);
            JTEMPLEADOS.getColumnModel().getColumn(2).setPreferredWidth(100);
            JTEMPLEADOS.getColumnModel().getColumn(3).setPreferredWidth(100);
            JTEMPLEADOS.getColumnModel().getColumn(4).setPreferredWidth(110);
            JTEMPLEADOS.getColumnModel().getColumn(5).setPreferredWidth(100);
            JTEMPLEADOS.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 640, 360));

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("DNI:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 120, 20));

        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Contraseña:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 120, 20));

        txtContraseña.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseña.setBorder(null);
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 130, 30));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 130, 10));

        txtDniEmpleado.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtDniEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        txtDniEmpleado.setBorder(null);
        txtDniEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniEmpleadoActionPerformed(evt);
            }
        });
        add(txtDniEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 130, 30));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 130, 10));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("CODIGO:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 120, 20));

        txtCodigoEmpleado.setEditable(false);
        txtCodigoEmpleado.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtCodigoEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigoEmpleado.setBorder(null);
        add(txtCodigoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 130, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Datos");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 130, 50));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 130, 10));

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("EMPLEADO:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 120, 20));

        txtNomEmpleado.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtNomEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        txtNomEmpleado.setBorder(null);
        add(txtNomEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 130, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 130, 10));

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("TIPO. CONTRATO:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 130, 20));

        txtTipoContrato.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtTipoContrato.setForeground(new java.awt.Color(255, 255, 255));
        txtTipoContrato.setBorder(null);
        add(txtTipoContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 130, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 130, 10));

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("TIEMP.CONTRATO");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 120, 20));

        txtTiempoContrato.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtTiempoContrato.setForeground(new java.awt.Color(255, 255, 255));
        txtTiempoContrato.setBorder(null);
        add(txtTiempoContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 130, 30));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 130, 10));

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("SALARIO: S/");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 120, 20));

        txtSalario.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtSalario.setForeground(new java.awt.Color(255, 255, 255));
        txtSalario.setBorder(null);
        add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 130, 30));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 130, 10));

        btnModificar.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setFocusPainted(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 90, 40));

        btnAgregar.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setFocusPainted(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 90, 40));

        btnNuevo.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setFocusPainted(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 90, 40));

        btnEliminar.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, 90, 40));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("EMPLEADOS");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 420, 80));
    }// </editor-fold>//GEN-END:initComponents

    void Modificar() {
        int fila = JTEMPLEADOS.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        } else {
            crud.modificar("empleado", "CodigoEmpleado", Integer.parseInt((String) JTEMPLEADOS.getValueAt(fila, 0).toString()), datosInsertar());
        }
    }
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Modificar();
        consultar();
        Nuevo();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Agregar();
        consultar();
        Nuevo();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        Nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Eliminar();
        consultar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void JTEMPLEADOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTEMPLEADOSMouseClicked
        int fila = JTEMPLEADOS.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        } else {
            idc = Integer.parseInt((String) JTEMPLEADOS.getValueAt(fila, 0).toString());
            String dniEmpleado = (String) JTEMPLEADOS.getValueAt(fila, 1);
            String NomEmpleado = (String) JTEMPLEADOS.getValueAt(fila, 2);
            String TipoContrato = (String) JTEMPLEADOS.getValueAt(fila, 3);
            String NumDireccion = (String) JTEMPLEADOS.getValueAt(fila, 4);
            String Telefono = (String) JTEMPLEADOS.getValueAt(fila, 5);
            String contraseña = (String) JTEMPLEADOS.getValueAt(fila, 6);
            txtCodigoEmpleado.setText("" + idc);
            txtDniEmpleado.setText(dniEmpleado);
            txtNomEmpleado.setText(NomEmpleado);
            txtTipoContrato.setText(TipoContrato);
            txtTiempoContrato.setText(NumDireccion);
            txtSalario.setText(Telefono);
            txtContraseña.setText(contraseña);
        }
    }//GEN-LAST:event_JTEMPLEADOSMouseClicked

    private void txtDniEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniEmpleadoActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void Nuevo() {
        text.limpiarTxtFields();
    }

    void Eliminar() {
        int fila = JTEMPLEADOS.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        } else {
            crud.eliminar("empleado", "CodigoEmpleado", Integer.parseInt((String) JTEMPLEADOS.getValueAt(fila, 0).toString()));
        }
    }

    void Agregar() {
        crud.insertar("empleado", datosInsertar());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTEMPLEADOS;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField txtCodigoEmpleado;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtDniEmpleado;
    private javax.swing.JTextField txtNomEmpleado;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTiempoContrato;
    private javax.swing.JTextField txtTipoContrato;
    // End of variables declaration//GEN-END:variables
}
