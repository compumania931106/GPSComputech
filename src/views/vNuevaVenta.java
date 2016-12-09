/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.ProductDAO;
import model.SaleDAO;

/**
 *
 * @author AlainEmmanuel
 */
public class vNuevaVenta extends javax.swing.JFrame {

    JTable tabla;
    int celdas, cantidad = 1, existencia;
    String verificar, obtenerProducto;
    float quitarCosto, total = 0, precioUnidad, suma, iva, totalPagar, subtotal;

    /**
     * Creates new form vNuevaVenta
     */
    public vNuevaVenta() {
        initComponents();
        obtenerFecha();
        generarFolio();
        jTextField1.setBackground(new Color(0, 0, 0, 0));
        jTextField2.setBackground(new Color(0, 0, 0, 0));
        jTextField3.setBackground(new Color(0, 0, 0, 0));
        jTextField4.setBackground(new Color(0, 0, 0, 0));
        jTextField5.setBackground(new Color(0, 0, 0, 0));
        jTextField6.setBackground(new Color(0, 0, 0, 0));
        jTextField7.setBackground(new Color(0, 0, 0, 0));
        jTextField8.setBackground(new Color(0, 0, 0, 0));
        jTextField9.setBackground(new Color(0, 0, 0, 0));

        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        DefaultTableModel dfm = new DefaultTableModel();
        tabla = this.jTable1;
        tabla.setModel(dfm);

        dfm.setColumnIdentifiers(new Object[]{"Id", "Codigo", "Nombre", "Marca", "Precio unitario", "Cantidad", "Subtotal"});

        setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());

    }

    public void agregarProducto() {/*
        obtenerProducto = jTextField1.getText();

        ProductDAO c = new ProductDAO();
        DefaultTableModel dfm;
        dfm = (DefaultTableModel) jTable1.getModel();
        celdas = jTable1.getRowCount();

        c.setCode(jTextField1.getText());
        ResultSet rs = c.getProductByCode();
        try {
            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("productid"), rs.getString("code"), rs.getString("productname"), rs.getString("brand"), rs.getString("salepricemay")});
            }
        } catch (Exception e) {
            System.out.println("Error al cargar los datos" + e);
        }

        int filas = jTable1.getRowCount() - 1;

        if (filas >= 0) {

            ProductDAO obtexis = new ProductDAO();
            obtexis.setCode(obtenerProducto);
            rs = obtexis.getProductByCode();
            try {
                while (rs.next()) {
                    existencia = rs.getInt("stock");
                }
            } catch (Exception e) {
                System.out.println("Error al cargar los datos " + e);
            }

            if (existencia >= 1) {
                for (int i = 0; i <= celdas - 1; i++) {
                    verificar = jTable1.getValueAt(i, 1).toString();
                    if (verificar.equals(obtenerProducto)) {
                        cantidad = Integer.parseInt(jTable1.getValueAt(i, 5).toString()) + 1;
                        dfm.removeRow(i);
                        filas = jTable1.getRowCount() - 1;
                    }
                }
                if (existencia >= cantidad) {
                    precioUnidad = Float.parseFloat(jTable1.getValueAt(filas, 4).toString());
                    subtotal = cantidad * precioUnidad;

                    jTable1.setValueAt(subtotal, filas, 6);
                    jTable1.setValueAt(cantidad, filas, 5);

                    cantidad = 1;

                    suma = Float.parseFloat(jTable1.getValueAt(filas, 4).toString());
                    total = suma + total;
                    jTextField8.setText(Float.toString(total));
                    iva = total * 16 / 100;
                    jTextField9.setText(Float.toString(iva));
                    totalPagar = iva + total;
                    jTextField3.setText("$" + Float.toString(totalPagar));
                } else {

                    precioUnidad = Float.parseFloat(jTable1.getValueAt(filas, 4).toString());
                    subtotal = (cantidad - 1) * precioUnidad;

                    jTable1.setValueAt(subtotal, filas, 6);
                    jTable1.setValueAt(cantidad - 1, filas, 5);

                    cantidad = 1;

                    JOptionPane.showMessageDialog(null, "No hay existencias suficientes para cubrir la demanda", "AVISO", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El producto " + jTable1.getValueAt(filas, 2).toString() + " no esta disponible", "AVISO", JOptionPane.WARNING_MESSAGE);
                dfm = (DefaultTableModel) jTable1.getModel();
                dfm.removeRow(filas);
            }
        }*/

    }

    public void obtenerFecha() {
        Calendar fecha = new GregorianCalendar();
        int anio = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);

        jTextField5.setText(Integer.toString(dia) + "/" + Integer.toString(mes + 1) + "/" + Integer.toString(anio));
        jTextField6.setText(Integer.toString(hora) + ":" + Integer.toString(minuto) + ":" + Integer.toString(segundo));
    }

    public void generarFolio() {
        int folio;
        SaleDAO obtfolio = new SaleDAO();
        ResultSet rs = obtfolio.getMaxid();
        try {
            while (rs.next()) {
                folio = (rs.getInt("saleid"))+1;
                
                jTextField4.setText(""+folio);
            }
        } catch (Exception e) {
            System.out.println("Error al cargar los datos " + e);
        }
    }
    
    public void finalizarVenta(){
        SaleDAO insertar = new SaleDAO();
        insertar.setDate(jTextField4.getText());
        insertar.setAmount(Double.parseDouble(jTextField3.getText()));
        //insertar.setUserid(ERROR);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jTextField2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/atras.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/atrasclic.png"))); // NOI18N
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 80));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/agragarprodnormal.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/agregarprodclic.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/realizarcompranormal.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/realizarcompraclic.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, -1, -1));

        jTextField1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 220, -1));

        jTextField3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(null);
        jTextField3.setOpaque(false);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 460, 140, 60));

        jTextField4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(null);
        jTextField4.setOpaque(false);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 130, -1));

        jTextField5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setBorder(null);
        jTextField5.setOpaque(false);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 80, 130, -1));

        jTextField6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setBorder(null);
        jTextField6.setOpaque(false);
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 130, 130, -1));

        jTextField7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setBorder(null);
        jTextField7.setOpaque(false);
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 230, -1));

        jTextField8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setBorder(null);
        jTextField8.setOpaque(false);
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 440, 130, -1));

        jTextField9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setBorder(null);
        jTextField9.setOpaque(false);
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 490, 130, -1));

        jTable1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 1050, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fondonuevaventa.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        agregarProducto();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        finalizarVenta();
    }//GEN-LAST:event_jButton3ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vNuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vNuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vNuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vNuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vNuevaVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
