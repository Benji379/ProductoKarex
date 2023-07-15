package Ventanas;

import ConexionBd.ConexionSQL;
import Formato.Proceso;
import Formato.DiseñoTablas;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    public JpanelEmpleados() {
        initComponents();
        Transparentar();
        consultar();
        DiseñoTablas d = new DiseñoTablas();
        d.AspectoContenido(JTEMPLEADOS);
        d.AspectoEncabezados(JTEMPLEADOS);
    }

    private void consultar() {
        String sql = "select * from empleado";
        try {
            conet = con1.conexion();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] cliente = new Object[5];
            modelo = (DefaultTableModel) JTEMPLEADOS.getModel();
            while (rs.next()) {
                cliente[0] = rs.getInt("CodigoEmpleado");
                cliente[1] = rs.getString("NomEmpleado");
                cliente[2] = rs.getString("TipoContrato");
                cliente[3] = rs.getString("TiempoContrato");
                cliente[4] = rs.getString("Salario");
                modelo.addRow(cliente);
            }
            JTEMPLEADOS.setModel(modelo);
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private void Transparentar() {
        Proceso.Transparentar(txtCodigoEmpleado);
        Proceso.Transparentar(txtNomEmpleado);
        Proceso.Transparentar(txtTipoContrato);
        Proceso.Transparentar(txtTiempoContrato);
        Proceso.Transparentar(txtSalario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTEMPLEADOS = new javax.swing.JTable();
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
                "CodigoEmpleado", "NomEmpleado", "T.Contrato", "TiempoContrato", "Salario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
            JTEMPLEADOS.getColumnModel().getColumn(1).setPreferredWidth(100);
            JTEMPLEADOS.getColumnModel().getColumn(2).setPreferredWidth(100);
            JTEMPLEADOS.getColumnModel().getColumn(3).setPreferredWidth(110);
            JTEMPLEADOS.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 640, 360));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("CODIGO:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 120, 20));

        txtCodigoEmpleado.setEditable(false);
        txtCodigoEmpleado.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtCodigoEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigoEmpleado.setBorder(null);
        add(txtCodigoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 130, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Datos");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 130, 50));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 130, 10));

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("EMPLEADO:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 120, 20));

        txtNomEmpleado.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtNomEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        txtNomEmpleado.setBorder(null);
        add(txtNomEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 130, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 130, 10));

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("TIPO. CONTRATO:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 130, 20));

        txtTipoContrato.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtTipoContrato.setForeground(new java.awt.Color(255, 255, 255));
        txtTipoContrato.setBorder(null);
        add(txtTipoContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 130, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 130, 10));

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("TIEMP.CONTRATO");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 120, 20));

        txtTiempoContrato.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtTiempoContrato.setForeground(new java.awt.Color(255, 255, 255));
        txtTiempoContrato.setBorder(null);
        add(txtTiempoContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 130, 30));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 130, 10));

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("SALARIO: S/");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 120, 20));

        txtSalario.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtSalario.setForeground(new java.awt.Color(255, 255, 255));
        txtSalario.setBorder(null);
        add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 130, 30));
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
        jLabel9.setText("EMPLEADOS");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 420, 80));
    }// </editor-fold>//GEN-END:initComponents

    void Modificar() {
        String NomEmpleado = txtNomEmpleado.getText();
        String TipoContrato = txtTipoContrato.getText();
        String TiempoContrato = txtTiempoContrato.getText();
        String Salario = String.valueOf(Double.parseDouble(txtSalario.getText()));
        
        try {
            if (Proceso.detectarVacios(NomEmpleado, TipoContrato, TiempoContrato, Salario)) {
                JOptionPane.showMessageDialog(null, "ERROR: campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String sql = "Update empleado set CodigoEmpleado='" + idc + "', NomEmpleado='" + NomEmpleado + "', TipoContrato='" + TipoContrato + "', TiempoContrato='" + TiempoContrato + "', Salario='" + Salario + "' where CodigoEmpleado=" + idc;
                conet = con1.conexion();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Datos de Datos de Empleado Modificados");
                limpiarTabla();
                consultar();
            }
        } catch (HeadlessException | SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    void limpiarTabla() {
        for (int i = 0; i < JTEMPLEADOS.getRowCount(); i++) {
            modelo.removeRow(i);
            i--;
        }
    }
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            Modificar();
            Nuevo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        try {
            Agregar();
            consultar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        Nuevo();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        Nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            Eliminar();
            consultar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void JTEMPLEADOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTEMPLEADOSMouseClicked
        int fila = JTEMPLEADOS.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        } else {
            idc = Integer.parseInt((String) JTEMPLEADOS.getValueAt(fila, 0).toString());
            String NomEmpleado = (String) JTEMPLEADOS.getValueAt(fila, 1);
            String TipoContrato = (String) JTEMPLEADOS.getValueAt(fila, 2);
            String NumDireccion = (String) JTEMPLEADOS.getValueAt(fila, 3);
            String Telefono = (String) JTEMPLEADOS.getValueAt(fila, 4);

            txtCodigoEmpleado.setText("" + idc);
            txtNomEmpleado.setText(NomEmpleado);
            txtTipoContrato.setText(TipoContrato);
            txtTiempoContrato.setText(NumDireccion);
            txtSalario.setText(Telefono);
        }
    }//GEN-LAST:event_JTEMPLEADOSMouseClicked

    private void Nuevo() {
        Proceso.limpiarTxtFields(txtSalario, txtCodigoEmpleado, txtTiempoContrato, txtNomEmpleado, txtTipoContrato);
    }

    void Eliminar() {
        int fila = JTEMPLEADOS.getSelectedRow();
        try {
            if (fila < 0) {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
                limpiarTabla();
            } else {
                String sql = "delete from empleado where CodigoEmpleado=" + idc;
                conet = con1.conexion();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Empleado Eliminado");
                limpiarTabla();
            }

        } catch (HeadlessException | SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    void Agregar() {
        String NomCliente = txtNomEmpleado.getText();
        String TipoContrato = txtTipoContrato.getText();
        String TiempoContrato = txtTiempoContrato.getText();
        String Salario = txtSalario.getText();

        try {
            if (Proceso.detectarVacios(NomCliente, TipoContrato, TiempoContrato, Salario)) {
                JOptionPane.showMessageDialog(null, "ERROR: campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String sql = "insert into empleado(NomEmpleado,TipoContrato,TiempoContrato,Salario) values ('" + NomCliente + "','" + TipoContrato + "','" + TiempoContrato + "','" + Salario + "')";
                conet = con1.conexion();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Nuevo Empleado");
                limpiarTabla();
            }
        } catch (HeadlessException | SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txtCodigoEmpleado;
    private javax.swing.JTextField txtNomEmpleado;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTiempoContrato;
    private javax.swing.JTextField txtTipoContrato;
    // End of variables declaration//GEN-END:variables
}
