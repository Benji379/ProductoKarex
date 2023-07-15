package Ventanas;

import DAO.ConexionSQL;
import Formato.Proceso;
import Formato.DiseñoTablas;
import DAO.RellenarSQL;
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
public class JpanelEmpresas extends javax.swing.JPanel {

    ConexionSQL con1 = new ConexionSQL();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;

    public JpanelEmpresas() {
        initComponents();
        Transparentar();
        consultar();
        DiseñoTablas d = new DiseñoTablas();
        d.AspectoContenido(JTEmpresas);
        d.AspectoEncabezados(JTEmpresas);
        RellenarSQL.llenarComboBox(txtEmpleado, "Empleado", "NomEmpleado");
    }

    private void consultar() {
        String sql = "select * from empresa";
        try {
            conet = con1.conexion();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] cliente = new Object[7];
            modelo = (DefaultTableModel) JTEmpresas.getModel();
            modelo.setRowCount(0);
            while (rs.next()) {
                cliente[0] = rs.getInt("CodigoEmpresa");
                cliente[1] = rs.getString("NomEmpresa");
                cliente[2] = rs.getString("Ruc");
                cliente[3] = rs.getString("NumDireccion");
                cliente[4] = rs.getString("Ciudad");
                cliente[5] = rs.getString("CodigoEmpleado");
                cliente[6] = rs.getString("CodigoAlmacen");
                modelo.addRow(cliente);
            }
            JTEmpresas.setModel(modelo);
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private void Transparentar() {
        Proceso.Transparentar(txtCodigoEmpresa);
        Proceso.Transparentar(txtNomEmpresa);
        Proceso.Transparentar(txtRuc);
        Proceso.Transparentar(txtDireccion);
        Proceso.Transparentar(txtCiudad);
        Proceso.Transparentar(txtCodAlmacen);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTEmpresas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoEmpresa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtNomEmpresa = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodAlmacen = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        btnModificar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(24, 24, 24));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTEmpresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CodigoEmpresa", "NomEmpresa", "Ruc", "NumDireccion", "Ciudad", "CodEmpleado", "CodAlmacen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTEmpresas.setGridColor(new java.awt.Color(30, 30, 30));
        JTEmpresas.setSelectionBackground(new java.awt.Color(30, 30, 30));
        JTEmpresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTEmpresasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTEmpresas);
        if (JTEmpresas.getColumnModel().getColumnCount() > 0) {
            JTEmpresas.getColumnModel().getColumn(0).setPreferredWidth(50);
            JTEmpresas.getColumnModel().getColumn(1).setPreferredWidth(70);
            JTEmpresas.getColumnModel().getColumn(2).setPreferredWidth(100);
            JTEmpresas.getColumnModel().getColumn(3).setPreferredWidth(110);
            JTEmpresas.getColumnModel().getColumn(4).setPreferredWidth(100);
            JTEmpresas.getColumnModel().getColumn(5).setPreferredWidth(80);
            JTEmpresas.getColumnModel().getColumn(6).setPreferredWidth(80);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 640, 360));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("CODIGO:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 120, 20));

        txtCodigoEmpresa.setEditable(false);
        txtCodigoEmpresa.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtCodigoEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigoEmpresa.setBorder(null);
        add(txtCodigoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 130, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Datos");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 130, 50));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 130, 10));

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("EMPRESA:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 120, 20));

        txtNomEmpresa.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtNomEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        txtNomEmpresa.setBorder(null);
        add(txtNomEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 130, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 130, 10));

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("RUC:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 120, 20));

        txtRuc.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtRuc.setForeground(new java.awt.Color(255, 255, 255));
        txtRuc.setBorder(null);
        add(txtRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 130, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 130, 10));

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("DIRECCION:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 120, 20));

        txtDireccion.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        txtDireccion.setBorder(null);
        add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 130, 30));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 130, 10));

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("CIUDAD:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 120, 20));

        txtCiudad.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtCiudad.setForeground(new java.awt.Color(255, 255, 255));
        txtCiudad.setBorder(null);
        add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 130, 30));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 130, 10));

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("EMPLEADO:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 120, 20));

        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Cod.ALMACEN:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 120, 20));

        txtCodAlmacen.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtCodAlmacen.setForeground(new java.awt.Color(255, 255, 255));
        txtCodAlmacen.setBorder(null);
        add(txtCodAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 130, 30));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 130, 10));

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
        jLabel9.setText("EMPRESAS");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 420, 80));

        txtEmpleado.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtEmpleado.setBorder(null);
        add(txtEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 150, 40));
    }// </editor-fold>//GEN-END:initComponents

    void Modificar() {

        String NomEmpresa = txtNomEmpresa.getText();
        String Ruc = txtRuc.getText();
        String NumDireccion = txtDireccion.getText();
        String Ciudad = txtCiudad.getText();
        String CodigoEmpleado = (String) txtEmpleado.getSelectedItem();
        String CodigoAlmacen = txtCodAlmacen.getText();

        try {
            if (Proceso.detectarVacios(NomEmpresa, Ruc, NumDireccion, Ciudad, CodigoEmpleado, CodigoAlmacen)) {
                JOptionPane.showMessageDialog(null, "ERROR: campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String sql = "Update empresa set CodigoEmpresa='" + idc + "', NomEmpresa='" + NomEmpresa + "', Ruc='" + Ruc + "', NumDireccion='" + NumDireccion + "', Ciudad='" + Ciudad + "', CodigoEmpleado='" + CodigoEmpleado + "', CodigoAlmacen='" + CodigoAlmacen + "' where CodigoEmpresa=" + idc;
                conet = con1.conexion();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Datos de Datos de Empresa Mpdificados");
                limpiarTabla();
                consultar();
            }
        } catch (HeadlessException | SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    void limpiarTabla() {
        for (int i = 0; i < JTEmpresas.getRowCount(); i++) {
            modelo.removeRow(i);
            i--;
        }
    }
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Modificar();
        Nuevo();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        try {
            Agregar();
            consultar();
            Nuevo();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        Nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Eliminar();
        consultar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void JTEmpresasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTEmpresasMouseClicked
        int fila = JTEmpresas.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        } else {
            idc = Integer.parseInt((String) JTEmpresas.getValueAt(fila, 0).toString());
            String NomEmpresa = (String) JTEmpresas.getValueAt(fila, 1);
            String Ruc = (String) JTEmpresas.getValueAt(fila, 2);
            String NumDireccion = (String) JTEmpresas.getValueAt(fila, 3);
            String Ciudad = (String) JTEmpresas.getValueAt(fila, 4);
            String CodigoEmpleado = (String) JTEmpresas.getValueAt(fila, 5);
            String CodigoAlmacen = (String) JTEmpresas.getValueAt(fila, 6);

            txtCodigoEmpresa.setText("" + idc);
            txtNomEmpresa.setText(NomEmpresa);
            txtRuc.setText(Ruc);
            txtDireccion.setText(NumDireccion);
            txtCiudad.setText(Ciudad);
            txtEmpleado.setSelectedItem(CodigoEmpleado);
            txtCodAlmacen.setText(CodigoAlmacen);
        }
    }//GEN-LAST:event_JTEmpresasMouseClicked

    private void Nuevo() {
        Proceso.limpiarTxtFields(txtCiudad, txtCodAlmacen, txtCodigoEmpresa, txtDireccion, txtNomEmpresa, txtRuc);
        txtEmpleado.setSelectedIndex(0);
    }

    void Eliminar() {
        int fila = JTEmpresas.getSelectedRow();
        try {
            if (fila < 0) {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
                limpiarTabla();
            } else {
                String sql = "delete from empresa where CodigoEmpresa=" + idc;
                conet = con1.conexion();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Empresa Eliminada");
                limpiarTabla();
            }

        } catch (HeadlessException | SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    void Agregar() {
        String NomEmpresa = txtNomEmpresa.getText();
        String Ruc = txtRuc.getText();
        String NumDireccion = txtDireccion.getText();
        String Ciudad = txtCiudad.getText();
        String CodigoEmpleado = (String) txtEmpleado.getSelectedItem();
        String CodigoAlmacen = txtCodAlmacen.getText();

        try {
            if (Proceso.detectarVacios(NomEmpresa, Ruc, NumDireccion, Ciudad, CodigoEmpleado, CodigoAlmacen)) {
                JOptionPane.showMessageDialog(null, "ERROR: campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String sql = "insert into empresa(NomEmpresa,Ruc,NumDireccion,Ciudad,CodigoEmpleado,CodigoAlmacen) values ('" + NomEmpresa + "','" + Ruc + "','" + NumDireccion + "','" + Ciudad + "','" + CodigoEmpleado + "','" + CodigoAlmacen + "')";
                conet = con1.conexion();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Nueva Empresa");
                limpiarTabla();
            }
        } catch (HeadlessException | SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTEmpresas;
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
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCodAlmacen;
    private javax.swing.JTextField txtCodigoEmpresa;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JComboBox<String> txtEmpleado;
    private javax.swing.JTextField txtNomEmpresa;
    private javax.swing.JTextField txtRuc;
    // End of variables declaration//GEN-END:variables
}
