package views;

import controllers.BaseController;
import controllers.Pedidos;
import controllers.PedidosProductos;
import controllers.Productos;
import controllers.Proveedores;
import java.awt.Dialog;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.BaseModel;
import models.Pedido;
import models.PedidoProducto;
import models.Producto;
import models.Proveedor;
import oraclegeneral.Conexion;

/**
 * JFrame donde se ven los pedidos que se encuentran en la base de datos.
 * @author Daniela Santillanes Castro
 * @version 1.0
 * @since 26/05/2015
 */
public class FrmVerPedidos extends BaseFrame {

    private String query = ("(0");
    private static Integer cantidad;
    private static String fechaEntrega;
    private Double total;
    private Boolean bandera=false;
    private DefaultTableModel model;
    private DefaultTableModel model1;
    List<PedidoProducto> pedidosProducto;
    List<Pedido> pedidosCombo;
    List<Producto> productos;
    /**
     * Creates new form Login
     */
    
    public FrmVerPedidos() {
        initComponents();
        setTitle("Pedidos");
        super.iniciarVentana(panel);
        pedidosCombo =(List<Pedido>) Pedidos.select(Conexion.getInstance().getCon(), "select * from pedidos", Pedido.class);
        try {
            Pedidos.fillCombo(comboPedidos, pedidosCombo, "id_pedido", Pedido.class);
        } catch (Exception ex) {
            Logger.getLogger(FrmPedidosProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        model = (DefaultTableModel) tblProductos.getModel();
        model1= model;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmdAgregarP = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        lblFechaEntrega = new javax.swing.JLabel();
        comboPedidos = new javax.swing.JComboBox();
        btnRefrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ver Pedido:");

        jLabel3.setText("Fecha de Entrega: ");

        cmdAgregarP.setText("Entregar");
        cmdAgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAgregarPActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jLabel4.setText("Total:");

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del Producto", "Cantidad Disponible", "Cantidad Pedida"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        lblTotal.setText("0");

        lblFechaEntrega.setText("Refresca los componentes. ");

        comboPedidos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPedidosActionPerformed(evt);
            }
        });

        btnRefrescar.setText("Refrescar Componentes nuevos de Igor.");
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(lblFechaEntrega))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGap(166, 166, 166)
                                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                    .addComponent(cmdAgregarP)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnCerrar))
                                .addComponent(jLabel4))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(comboPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnRefrescar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefrescar))
                .addGap(14, 14, 14)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblFechaEntrega))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(83, 83, 83))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCerrar)
                            .addComponent(cmdAgregarP))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgregarPActionPerformed
        pedidosProducto.stream().forEach((tablaProductos)->{
            productos.stream().forEach((producto)->{
                if(producto.getId_producto().equals(tablaProductos.getId_producto())){
                    if(producto.getCantidad_disponible().intValue()<tablaProductos.getCantidad().intValue()){
                        cambiarBandera();
                    }
                }
            });
        });
            if(bandera==true){
                JOptionPane.showMessageDialog(null, "Lo sentimos no tienes la cantidad necesaria para entregar el producto en este momento");
            }else{
                pedidosProducto.stream().forEach((tablaProductos)->{
                        productos.stream().forEach((producto)->{
                        if(producto.getId_producto().equals(tablaProductos.getId_producto())){
                                setNuevaCantidad(producto, tablaProductos);
                        }
                    });
                });
            }
            borrarPedido();
            this.dispose();
    }//GEN-LAST:event_cmdAgregarPActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void comboPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPedidosActionPerformed
        
    }//GEN-LAST:event_comboPedidosActionPerformed

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        accionRefrescar();
    }//GEN-LAST:event_btnRefrescarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVerPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVerPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVerPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVerPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmVerPedidos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JButton cmdAgregarP;
    private javax.swing.JComboBox comboPedidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFechaEntrega;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo que refresca los componentes de la tabla sacandolos de la base de datos referenciado
     * al pedido que se escoja.
     */
    public void accionRefrescar(){
        productos=null;
        pedidosProducto=null;
        query = ("(0");
        lblFechaEntrega.setText(pedidosCombo.get(comboPedidos.getSelectedIndex()).getFecha_entrega().toString());
        total = pedidosCombo.get(comboPedidos.getSelectedIndex()).getTotal().doubleValue();
        lblTotal.setText(String.valueOf(total));
        pedidosProducto =(List<PedidoProducto>) PedidosProductos.select(Conexion.getInstance().getCon(), String.format("select * from pedidos_producto where id_pedido=%s", pedidosCombo.get(comboPedidos.getSelectedIndex()).getId_pedido()), PedidoProducto.class);
        pedidosProducto.stream().forEach((pedidoPro)->{
            query= query + (","+ pedidoPro.getId_producto().toString());
        });
        query+=")";
        productos=(List<Producto>) Productos.select(Conexion.getInstance().getCon(), String.format("select * from productos where id_producto in %s", query), Producto.class);
        mostrarTabla();
    }
    
    /**
     * Metodo que agrega los campos a la tabla refrescandolos de la base de datos para que se agregen a la tabla
     * del JFrame.
     */
    public void mostrarTabla(){
        productos.stream().forEach((producto)->{
            List<String> list = new ArrayList<String>();
            pedidosProducto.stream().forEach((tabProducto)->{
                if(producto.getId_producto().equals(tabProducto.getId_producto())){
                    list.add(producto.getNombre());
                    list.add(producto.getCantidad_disponible().toString());
                    list.add(tabProducto.getCantidad().toString());
                }
            });
            model.addRow(list.toArray());
        });
            tblProductos.setModel(model);
    }
    
    public List<Producto> getProductos() {
        return productos;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer aCantidad) {
        cantidad = aCantidad;
    }

    /**
     * Metodo que cambia la variable bandera que permite pagar el pedido.
     */
    private void cambiarBandera() {
        bandera = true;
    }
    
    /**
     * Metodo que asigna la nueva cantidad disponible al producto en cuestion
     * @param producto producto que tiene la cantidad disponible.
     * @param tablaProductos producto que contiene la cantidad a restar.
     */
    private void setNuevaCantidad(Producto producto, PedidoProducto tablaProductos) {
        productos.get(productos.indexOf(producto)).setCantidad_disponible(
                BigDecimal.valueOf(productos.get(productos.indexOf(producto)).getCantidad_disponible().doubleValue()
                - pedidosProducto.get(pedidosProducto.indexOf(tablaProductos)).getCantidad().doubleValue()));
        Productos.executeQuery(Conexion.getInstance().getCon(), "update productos set cantidad_disponible ="+productos.get(productos.indexOf(producto)).getCantidad_disponible().intValue()+" where id_producto="+productos.get(productos.indexOf(producto)).getId_producto());
        System.out.println("Se actualizo los productos");
    }

    private void borrarPedido() {
        PedidosProductos.executeQuery(Conexion.getInstance().getCon(), String.format("delete from pedidos_producto where id_pedido=%s",pedidosProducto.get(0).getId_pedido()));
        Pedidos.executeQuery(Conexion.getInstance().getCon(),String.format("delete from pedidos where id_pedido=%s", pedidosProducto.get(0).getId_pedido()));
        System.out.println("Se elimino el pedido");
    }
    
}
