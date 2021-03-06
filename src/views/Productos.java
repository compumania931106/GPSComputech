/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.ProductDAO;
import model.RoleDAO;

/**
 *
 * @author Francisco Gallegos
 */
public class Productos extends javax.swing.JFrame {
    //ProductDAO Mconexion = new ProductDAO();
    /**
     * Creates new form Productos
     */
    JTable tabla;
    int productidEditable;
    String codeEditable;
    String productnameEditable;
    String brandEditable;
    Double purchpriceEditable;
    int stockEditable;
    Double salepriceminEditable;
    int reorderpointEditable;
    int categoryidEditable;
    Double salepricemayEditable;
    
    public Productos() {
        initComponents();
        
        this.llenarTabla();
        tabla1.setDefaultEditor(Object.class, null);

        tabla1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent Mouse_evt) {
                JTable table = (JTable) Mouse_evt.getSource();
                Point point = Mouse_evt.getPoint();
                int row = table.rowAtPoint(point);
                if (Mouse_evt.getClickCount() == 2) {
                    productidEditable = (Integer) tabla.getValueAt(tabla.getSelectedRow(), 0);
                    codeEditable = (String) tabla.getValueAt(tabla.getSelectedRow(), 1);
                    productnameEditable = (String) tabla.getValueAt(tabla.getSelectedRow(), 2);
                    brandEditable = (String) tabla.getValueAt(tabla.getSelectedRow(), 3);
                    purchpriceEditable = (Double) tabla.getValueAt(tabla.getSelectedRow(), 4);
                    stockEditable = (Integer) tabla.getValueAt(tabla.getSelectedRow(), 5);
                    salepriceminEditable = (Double) tabla.getValueAt(tabla.getSelectedRow(), 6);
                    reorderpointEditable = (Integer) tabla.getValueAt(tabla.getSelectedRow(), 7);
                    categoryidEditable = (Integer) tabla.getValueAt(tabla.getSelectedRow(), 8);
                    salepricemayEditable = (Double) tabla.getValueAt(tabla.getSelectedRow(), 9);
                    
                    
                    
                    txtCodigo.setText(codeEditable);
                    txtNomProd.setText(productnameEditable);
                    txtMarca.setText(brandEditable);
                    txtPrecioC.setText(purchpriceEditable+"");
                    txtCantidad.setText(stockEditable+"");
                    txtPrecioVM.setText(salepriceminEditable+"");
                    PrecioV.setText(reorderpointEditable+"");
                    txtCategory.setText(categoryidEditable+"");
                    txtPedido.setText(salepricemayEditable+"");
                    
                    
                    
                    System.out.println(productidEditable + ": " + productnameEditable);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNomProd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPrecioC = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtPrecioVM = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        PrecioV = new javax.swing.JTextField();
        txtPedido = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("PRODUCTOS");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, 26));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Codigo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 153, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del producto:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        txtNomProd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNomProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 153, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Marca:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));
        getContentPane().add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 153, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Precio de compra:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        getContentPane().add(txtPrecioC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 153, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cantidad:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 153, -1));
        getContentPane().add(txtPrecioVM, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 153, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Precio de venta min:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Precio de venta:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));
        getContentPane().add(PrecioV, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 153, -1));
        getContentPane().add(txtPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 153, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Punto de pedido:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Category id:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));
        getContentPane().add(txtCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 153, -1));

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 112, -1));

        txtID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 99, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Consultar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 438, 730, 160));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre de producto:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 221, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Consultar - Actualizar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/wallpaper.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void llenarTablaConBusqueda(String productname) {
        ProductDAO r = new ProductDAO();
        
        DefaultTableModel dfm = new DefaultTableModel();
        tabla = this.tabla1;
        tabla.setModel(dfm);

        dfm.setColumnIdentifiers(new Object[]{"producid","code","productname","brand","purchprice","stock","salepricemin","reorderpoint","categoryid","salepricemay"});
        
        r.setProductname(productname);
        
       
        ResultSet rs = r.getProductByName();
        
        try {
            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("productid"), rs.getString("code"),rs.getString("productname"),
                rs.getString("brand"),rs.getDouble("purchprice"),rs.getInt("stock"),rs.getDouble("salepricemin"),
                rs.getInt("reorderpoint"),rs.getInt("categoryid"),rs.getDouble("salepricemay")});
            }
        } catch (Exception e) {
            System.out.println("Error al cargar los datos");
        }
    }
    
    public void llenarTablaConBusqueda1(int productid) {
        ProductDAO r = new ProductDAO();
        
        DefaultTableModel dfm = new DefaultTableModel();
        tabla = this.tabla1;
        tabla.setModel(dfm);

        dfm.setColumnIdentifiers(new Object[]{"producid","code","productname","brand","purchprice","stock","salepricemin","reorderpoint","categoryid","salepricemay"});
        r.setProductid(productid);
        
        
        ResultSet rs = r.getProductByID();
        
        
        try {
            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("productid"), rs.getString("code"),rs.getString("productname"),
                rs.getString("brand"),rs.getDouble("purchprice"),rs.getInt("stock"),rs.getDouble("salepricemin"),
                rs.getInt("reorderpoint"),rs.getInt("categoryid"),rs.getDouble("salepricemay")});
            }
        } catch (Exception e) {
            System.out.println("Error al cargar los datos");
        }
    }
    
    public void llenarTabla() {
        ProductDAO r = new ProductDAO();
        DefaultTableModel dfm = new DefaultTableModel();
        tabla = this.tabla1;
        tabla.setModel(dfm);
        
        dfm.setColumnIdentifiers(new Object[]{"producid","code","productname","brand","purchprice","stock","salepricemin","reorderpoint","categoryid","salepricemay"});
        ResultSet rs = r.getProducts();

        try {
            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("productid"), rs.getString("code"),rs.getString("productname"),
                rs.getString("brand"),rs.getDouble("purchprice"),rs.getInt("stock"),rs.getDouble("salepricemin"),
                rs.getInt("reorderpoint"),rs.getInt("categoryid"),rs.getDouble("salepricemay")});
            }
        } catch (Exception e) {
            System.out.println("Error al cargar los datos");
        }
    }
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        ProductDAO cat = new ProductDAO();
        
        cat.setCode(txtCodigo.getText());
        cat.setProductname(txtNomProd.getText());
        cat.setBrand(txtMarca.getText());
        cat.setPurchprice(Double.parseDouble(txtPrecioC.getText()));
        cat.setStock(Integer.parseInt(txtCantidad.getText()));
        cat.setSalepricemin(Double.parseDouble(txtPrecioVM.getText()));
        cat.setReorderpoint(Integer.parseInt(txtPedido.getText()));
        cat.setCategoryid(Integer.parseInt(txtCategory.getText()));
        cat.setSalepricemay(Double.parseDouble(PrecioV.getText()));
            
       if(cat.newProduct()){
            this.llenarTabla();
            System.out.println("El registro se almaceno correctamente");
        }else{
            System.out.println("Hubo problemas con la inserción");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        ProductDAO r = new ProductDAO();
        //if (.getText().equals("")) {
            //    javax.swing.JOptionPane.showMessageDialog(null, "Seleecione un registro para editar");
            //} else {
            r.setProductid(productidEditable);
            r.setCode(txtCodigo.getText());
            r.setProductname(txtNomProd.getText());
            r.setBrand(txtMarca.getText());
            r.setPurchprice(Double.parseDouble(txtPrecioC.getText()));
            r.setStock(Integer.parseInt(txtCantidad.getText()));
            r.setSalepricemin(Double.parseDouble(txtPrecioVM.getText()));
            r.setReorderpoint(Integer.parseInt(txtPedido.getText()));
            r.setCategoryid(Integer.parseInt(txtCategory.getText()));
            r.setSalepricemay(Double.parseDouble(PrecioV.getText()));

            if (r.updateProduct()) {
                this.llenarTabla();
                //  jTextField3.setText("");
                System.out.println("Se actualizo correctamente");
            } else {
                System.out.println("Problemas en la actualizacion");
            }
            //}
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        this.llenarTablaConBusqueda(jTextField3.getText());
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        this.llenarTablaConBusqueda1(Integer.parseInt(txtID.getText()));

        /* CategoryDAO cat = new CategoryDAO();
        cat.setCategoryid(Integer.parseInt(jTextField2.getText()));

        ResultSet rs = cat.getCategoryByID();

        try{
            while(rs.next()){
                System.out.println("id: " + rs.getInt("categoryid") + "    Nombre: " + rs.getString("categoryname"));
            }
        }catch(Exception e){
            System.out.println("Error en el metodo getCategorys");
        }
        */
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        //this.llenarTablaConBusqueda( Integer.parseInt(txtID.getText()));
    }//GEN-LAST:event_txtIDKeyTyped

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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PrecioV;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNomProd;
    private javax.swing.JTextField txtPedido;
    private javax.swing.JTextField txtPrecioC;
    private javax.swing.JTextField txtPrecioVM;
    // End of variables declaration//GEN-END:variables
}
