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
public class JpanelClientes extends javax.swing.JPanel {

    ConexionSQL con1 = new ConexionSQL();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    private int idc;
    private Proceso text;
    private final Crud crud;

    public JpanelClientes() {
        initComponents();
        crud = new Crud();
        textFields();
        consultar();
        diseñoTablas();
    }

    private void textFields() {
        text = new Proceso(txtCodigoCliente, txtNomCliente, txtDni, txtDireccion, txtTelefono);
        text.Transparentar();
    }

    private void diseñoTablas() {
        DiseñoTablas d = new DiseñoTablas();
        d.AspectoContenido(JTClientes);
        d.AspectoEncabezados(JTClientes);
    }

    private Map<String, Integer> asignarColumnasTabla() {
        Map<String, Integer> columnas = new HashMap<>();

        columnas.put("CodigoCliente", 0);
        columnas.put("NomCliente", 1);
        columnas.put("DNI", 2);
        columnas.put("Direccion", 3);
        columnas.put("Telefono", 4);

        return columnas;
    }

    private Map<String, String> datosInsertar() {
        Map<String, String> columnas = new HashMap<>();

        columnas.put("NomCliente", txtNomCliente.getText());
        columnas.put("DNI", txtDni.getText());
        columnas.put("Direccion", txtDireccion.getText());
        columnas.put("Telefono", txtTelefono.getText());
        return columnas;
    }

    private void consultar() {
        crud.consultarTabla("cliente", asignarColumnasTabla(), JTClientes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtNomCliente = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnModificar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(24, 24, 24));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CodigoCliente", "NomCliente", "DNI", "Direccion", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTClientes.setGridColor(new java.awt.Color(30, 30, 30));
        JTClientes.setSelectionBackground(new java.awt.Color(30, 30, 30));
        JTClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTClientes);
        if (JTClientes.getColumnModel().getColumnCount() > 0) {
            JTClientes.getColumnModel().getColumn(0).setPreferredWidth(50);
            JTClientes.getColumnModel().getColumn(1).setPreferredWidth(100);
            JTClientes.getColumnModel().getColumn(2).setPreferredWidth(100);
            JTClientes.getColumnModel().getColumn(3).setPreferredWidth(110);
            JTClientes.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 640, 360));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("CODIGO:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 120, 20));

        txtCodigoCliente.setEditable(false);
        txtCodigoCliente.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtCodigoCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigoCliente.setBorder(null);
        add(txtCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 130, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Datos");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 130, 50));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 130, 10));

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("CLIENTE:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 120, 20));

        txtNomCliente.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtNomCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtNomCliente.setBorder(null);
        add(txtNomCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 130, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 130, 10));

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("DNI:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 120, 20));

        txtDni.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtDni.setForeground(new java.awt.Color(255, 255, 255));
        txtDni.setBorder(null);
        add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 130, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 130, 10));

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("DIRECCION:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 120, 20));

        txtDireccion.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        txtDireccion.setBorder(null);
        add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 130, 30));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 130, 10));

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("TELEFONO:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 120, 20));

        txtTelefono.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setBorder(null);
        add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 130, 30));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 130, 10));

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
        jLabel9.setText("CLIENTES");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 420, 80));
    }// </editor-fold>//GEN-END:initComponents

    private void Modificar() {
        int fila = JTClientes.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        } else {
            crud.modificar("cliente", "CodigoCliente", Integer.parseInt((String) JTClientes.getValueAt(fila, 0).toString()), datosInsertar());
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

    private void JTClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTClientesMouseClicked
        int fila = JTClientes.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        } else {
            idc = Integer.parseInt((String) JTClientes.getValueAt(fila, 0).toString());
            String NomCliente = (String) JTClientes.getValueAt(fila, 1);
            String DNI = (String) JTClientes.getValueAt(fila, 2);
            String Direccion = (String) JTClientes.getValueAt(fila, 3);
            String Telefono = (String) JTClientes.getValueAt(fila, 4);

            txtCodigoCliente.setText("" + idc);
            txtNomCliente.setText(NomCliente);
            txtDni.setText(DNI);
            txtDireccion.setText(Direccion);
            txtTelefono.setText(Telefono);
        }
    }//GEN-LAST:event_JTClientesMouseClicked

    private void Nuevo() {
        text.limpiarTxtFields();
    }

    void Eliminar() {
        int fila = JTClientes.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        } else {
            crud.eliminar("cliente", "CodigoCliente", Integer.parseInt((String) JTClientes.getValueAt(fila, 0).toString()));
        }
    }

    private void Agregar() {
        crud.insertar("cliente", datosInsertar());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTClientes;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNomCliente;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
