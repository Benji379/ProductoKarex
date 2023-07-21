package Ventanas;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JPanel;

public class JframeMenu extends javax.swing.JFrame {

    public JframeMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        listaEmpresas();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/iconoSodimac.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jMenuModulos = new javax.swing.JMenuBar();
        jMenuEmpresas = new javax.swing.JMenu();
        jMenuVentas = new javax.swing.JMenu();
        jMenuCliente = new javax.swing.JMenu();
        jMenuEmpleado = new javax.swing.JMenu();
        jMenuInventario = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedor.setBackground(new java.awt.Color(24, 24, 24));
        contenedor.setLayout(new java.awt.CardLayout());
        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 570));

        jMenuEmpresas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empresa.png"))); // NOI18N
        jMenuEmpresas.setText("EMPRESAS");
        jMenuEmpresas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuEmpresas.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jMenuEmpresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuEmpresasMouseClicked(evt);
            }
        });
        jMenuModulos.add(jMenuEmpresas);

        jMenuVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compras.png"))); // NOI18N
        jMenuVentas.setText("VENTAS");
        jMenuVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuVentas.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jMenuVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuVentasMouseClicked(evt);
            }
        });
        jMenuModulos.add(jMenuVentas);

        jMenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clasificacion.png"))); // NOI18N
        jMenuCliente.setText("CLIENTE");
        jMenuCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuCliente.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jMenuCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuClienteMouseClicked(evt);
            }
        });
        jMenuModulos.add(jMenuCliente);

        jMenuEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empleados.png"))); // NOI18N
        jMenuEmpleado.setText("EMPLEADO");
        jMenuEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuEmpleado.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jMenuEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuEmpleadoMouseClicked(evt);
            }
        });
        jMenuModulos.add(jMenuEmpleado);

        jMenuInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lista.png"))); // NOI18N
        jMenuInventario.setText("INVENTARIO");
        jMenuInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuInventario.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jMenuInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuInventarioMouseClicked(evt);
            }
        });
        jMenuModulos.add(jMenuInventario);

        setJMenuBar(jMenuModulos);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuEmpresasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEmpresasMouseClicked
        listaEmpresas();
    }//GEN-LAST:event_jMenuEmpresasMouseClicked

    private void mostrarPanel(JPanel panel) {
        panel.setSize(1000, 570);
        panel.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(panel, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }

    private void listaEmpresas() {
        JpanelEmpresas p = new JpanelEmpresas();
        mostrarPanel(p);
    }

    private void jMenuVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuVentasMouseClicked
        JpanelVentas p = new JpanelVentas();
        mostrarPanel(p);
    }//GEN-LAST:event_jMenuVentasMouseClicked


    private void jMenuClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuClienteMouseClicked
        JpanelClientes p = new JpanelClientes();
        mostrarPanel(p);
    }//GEN-LAST:event_jMenuClienteMouseClicked

    private void jMenuEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEmpleadoMouseClicked
        JpanelEmpleados p = new JpanelEmpleados();
        mostrarPanel(p);
    }//GEN-LAST:event_jMenuEmpleadoMouseClicked

    private void jMenuInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuInventarioMouseClicked
        JpanelInventario p = new JpanelInventario();
        mostrarPanel(p);
    }//GEN-LAST:event_jMenuInventarioMouseClicked

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
            java.util.logging.Logger.getLogger(JframeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JframeMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    private javax.swing.JMenu jMenuCliente;
    private javax.swing.JMenu jMenuEmpleado;
    private javax.swing.JMenu jMenuEmpresas;
    private javax.swing.JMenu jMenuInventario;
    private javax.swing.JMenuBar jMenuModulos;
    private javax.swing.JMenu jMenuVentas;
    // End of variables declaration//GEN-END:variables
}
