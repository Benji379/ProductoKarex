package Ventanas;

import DAO.ConexionSQL;
import Formato.DiseñoTablas;
import Formato.Proceso;
import Formato.temp;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Martin
 */
public final class venderProductos extends javax.swing.JFrame {

    ConexionSQL con1 = new ConexionSQL();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;

    public venderProductos() {
        initComponents();
        llenarCombo();
        this.setLocationRelativeTo(null);
        modelo = new DefaultTableModel();
        modelo.addColumn("Producto");
        modelo.addColumn("Cant");
        modelo.addColumn("Total");
        JTConsumos.setModel(modelo);
        DiseñoTablas t = new DiseñoTablas();
        t.AspectoContenido(JTConsumos);
        t.AspectoEncabezados(JTConsumos);
        t.AlinearColumna(1, JTConsumos);
        t.AlinearColumna(2, JTConsumos);
        cerrar();
        Proceso.Transparentar(txtCantidad);
//        double totalSumar = Proceso.sumColumnValues(JTConsumos, 3);
        totalConsumo = Proceso.sumarColumna("temp.txt", 3);
        txtTotal.setText(String.valueOf(totalConsumo));
        System.out.println("TOTAL: " + totalConsumo);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/iconoSodimac.png")));
    }

    public void llenarCombo() {
        String[] datos = new String[1];
        String texto;
        conet = con1.conexion();
        try {
            Statement buscar = conet.createStatement();
            ResultSet resultado = buscar.executeQuery("SELECT * FROM inventario");

            while (resultado.next()) {
                datos[0] = resultado.getString(2);
                texto = datos[0];
                txtProducto.addItem(texto);
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTotal = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTConsumos = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtPrecio = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consumos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(24, 24, 24));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTotal.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setText("0.00");
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, -1, -1));

        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cant.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Baskerville Old Face", 0, 40)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Consumos");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        JTConsumos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cant", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTConsumos.setRequestFocusEnabled(false);
        JTConsumos.setSelectionBackground(new java.awt.Color(39, 39, 39));
        JTConsumos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTConsumosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTConsumos);
        if (JTConsumos.getColumnModel().getColumnCount() > 0) {
            JTConsumos.getColumnModel().getColumn(0).setMinWidth(100);
            JTConsumos.getColumnModel().getColumn(0).setPreferredWidth(150);
            JTConsumos.getColumnModel().getColumn(0).setMaxWidth(150);
            JTConsumos.getColumnModel().getColumn(1).setResizable(false);
            JTConsumos.getColumnModel().getColumn(1).setPreferredWidth(50);
            JTConsumos.getColumnModel().getColumn(2).setResizable(false);
            JTConsumos.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 300, 240));

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Total: S/.");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, -1, -1));

        txtProducto.setBackground(new java.awt.Color(153, 153, 153));
        txtProducto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtProducto.setFocusable(false);
        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 130, 40));

        jLabel12.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Producto");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        txtCantidad.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad.setBorder(null);
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 60, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 60, 10));

        txtPrecio.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setText("Precio: S/.");
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 150, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        btnEliminar.setText("x");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setFocusPainted(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 50, 40));

        btnAgregar.setBackground(new java.awt.Color(51, 255, 51));
        btnAgregar.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        btnAgregar.setText("+");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setFocusPainted(false);
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 50, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int fila;
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            if (fila < 0) {
                JOptionPane.showMessageDialog(null, "No hay fila seleccionada");
            } else {
                DefaultTableModel model = (DefaultTableModel) JTConsumos.getModel();
                model.removeRow(fila);
                fila = 0;
                ActualizarTotal();
            }
        } catch (HeadlessException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            String[] info = new String[3];

            String producto = (String) txtProducto.getSelectedItem();
            String cantidad = txtCantidad.getText();
            info[0] = producto;
            info[1] = cantidad;
            String precio;
            String sql = "select * from inventario  where nombre='" + producto + "' ";

            try {
                conet = con1.conexion();
                st = conet.createStatement();
                rs = st.executeQuery(sql);

                while (rs.next()) {

                    precio = rs.getString("precio");
                    if (producto.equals(rs.getString("nombre"))) {
                        double monto = (Double.parseDouble(precio)) * Double.parseDouble(cantidad);
                        info[2] = String.valueOf(monto);
                        txtPrecio.setText("Precio: S/." + precio);
                    }
                }
            } catch (SQLException e) {
            }

            modelo.addRow(info);
            ActualizarTotal();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Seleccione una cantidad");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed

        String producto = (String) txtProducto.getSelectedItem();
        String precio;
        String sql = "select * from inventario  where nombre='" + producto + "' ";

        try {
            conet = con1.conexion();
            st = conet.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {

                precio = rs.getString("precio");
                if (producto.equals(rs.getString("nombre"))) {
                    txtPrecio.setText("Precio: S/." + precio);
                }
            }
        } catch (SQLException e) {

        }
    }//GEN-LAST:event_txtProductoActionPerformed

    private void JTConsumosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTConsumosMouseClicked
        fila = JTConsumos.getSelectedRow();
    }//GEN-LAST:event_JTConsumosMouseClicked
    private void ActualizarTotal() {
        txtTotal.setText(String.valueOf(sumar()));
    }

    double totalConsumo;

    private double sumar() {

        double contar = JTConsumos.getRowCount();
        totalConsumo = 0;

        for (int i = 0; i < contar; i++) {
            totalConsumo = totalConsumo + Double.parseDouble(JTConsumos.getValueAt(i, 2).toString());
        }
        return totalConsumo;
    }

    public void cerrar() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    JpanelVentas.txtMonto.setText(String.valueOf(totalConsumo));
                    temp.guardarDatostxtTemp(JTConsumos, "temp.txt");
                    setVisible(false);
                }
            });
            this.setVisible(true);
        } catch (Exception e) {
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(venderProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new venderProductos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable JTConsumos;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JComboBox txtProducto;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
