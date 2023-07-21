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
public class JpanelInventario extends javax.swing.JPanel {

    ConexionSQL con1 = new ConexionSQL();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;
    private final Proceso text;
    private final Crud crud;

    public JpanelInventario() {
        initComponents();
        text = new Proceso(txtCodigoProducto, txtPrecio, txtNombreProducto, txtStock);
        text.Transparentar();
        crud = new Crud();
        diseñoTabla();
        consultar();
    }

    private void diseñoTabla() {
        DiseñoTablas d = new DiseñoTablas();
        d.AspectoContenido(JTInventario);
        d.AspectoEncabezados(JTInventario);
    }

    private Map<String, Integer> asignarColumnasTabla() {
        Map<String, Integer> columnas = new HashMap<>();
        columnas.put("CodigoProducto", 0);
        columnas.put("nombre", 1);
        columnas.put("Precio", 2);
        columnas.put("stock", 3);
        return columnas;
    }

    private Map<String, String> datosInsertar() {
        Map<String, String> columnas = new HashMap<>();
        columnas.put("nombre", txtNombreProducto.getText());
        columnas.put("precio", txtPrecio.getText());
        columnas.put("stock", txtStock.getText());
        return columnas;
    }

    private void consultar() {
        crud.consultarTabla("inventario", asignarColumnasTabla(), JTInventario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTInventario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtPrecio = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(24, 24, 24));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CodigoVenta", "Nombre", "Precio", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTInventario.setGridColor(new java.awt.Color(30, 30, 30));
        JTInventario.setSelectionBackground(new java.awt.Color(30, 30, 30));
        JTInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTInventarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTInventario);
        if (JTInventario.getColumnModel().getColumnCount() > 0) {
            JTInventario.getColumnModel().getColumn(0).setPreferredWidth(50);
            JTInventario.getColumnModel().getColumn(1).setPreferredWidth(100);
            JTInventario.getColumnModel().getColumn(2).setPreferredWidth(100);
            JTInventario.getColumnModel().getColumn(3).setPreferredWidth(110);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 640, 360));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("CODIGO:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 120, 20));

        txtCodigoProducto.setEditable(false);
        txtCodigoProducto.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtCodigoProducto.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigoProducto.setBorder(null);
        add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 150, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Datos");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 130, 50));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 150, 10));

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("NOMBRE:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 120, 20));

        txtNombreProducto.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtNombreProducto.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreProducto.setBorder(null);
        add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 150, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 150, 10));

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("PRECIO:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 130, 20));

        txtStock.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        txtStock.setForeground(new java.awt.Color(255, 255, 255));
        txtStock.setBorder(null);
        add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 150, 30));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 150, 10));

        txtPrecio.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setBorder(null);
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 150, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 150, 10));

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("STOCK:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 120, 20));

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
        jLabel9.setText("INVENTARIO");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 420, 80));
    }// </editor-fold>//GEN-END:initComponents

    void Modificar() {
        int fila = JTInventario.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        } else {
            crud.modificar("inventario", "codigoProducto", Integer.parseInt((String) JTInventario.getValueAt(fila, 0).toString()), datosInsertar());
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

    private void JTInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTInventarioMouseClicked
        int fila = JTInventario.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        } else {
            idc = Integer.parseInt((String) JTInventario.getValueAt(fila, 0).toString());
            String NombreProducto = (String) JTInventario.getValueAt(fila, 1);
            String Precio = (String) JTInventario.getValueAt(fila, 2);
            String Stock = (String) JTInventario.getValueAt(fila, 3);

            txtCodigoProducto.setText("" + idc);
            txtNombreProducto.setText(NombreProducto);
            txtPrecio.setText(Precio);
            txtStock.setText(Stock);
        }
    }//GEN-LAST:event_JTInventarioMouseClicked

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed
    
    private void Nuevo() {
        text.limpiarTxtFields();
    }

    void Eliminar() {
        int fila = JTInventario.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        } else {
            crud.eliminar("inventario", "codigoProducto", Integer.parseInt((String) JTInventario.getValueAt(fila, 0).toString()));
        }
    }

    void Agregar() {
        crud.insertar("inventario", datosInsertar());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTInventario;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
