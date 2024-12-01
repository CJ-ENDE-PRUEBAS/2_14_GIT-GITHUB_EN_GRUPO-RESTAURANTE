package views;

import controllers.BaseController;
import controllers.IngredientesRecetas;
import controllers.Productos;
import controllers.Recetas;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Producto;
import oraclegeneral.Conexion;

/**
 * JFrame donde se agregan productos a la base de datos.
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 * @since 26/05/2015
 */
public class FrmBorrarProductos extends BaseFrame {

    private String nombreProducto;
    private String precioUnitario;
    private String cantidadDisponible;
    private final static String id = "product_seq.nextval";
    

    List<Producto> productos = (List<Producto>) Productos.select(Conexion.getInstance().getCon(), "select * from productos", Producto.class);
    Integer rows = 0;

    /**
     * Creates new form Login
     * @throws java.sql.SQLException
     */
    public FrmBorrarProductos() {
        initComponents();
        setTitle("Borrar Productos");
        super.iniciarVentana(panel);
        DefaultTableModel model = (DefaultTableModel) tableProductos.getModel();

        productos.stream().forEach((producto) -> {
            List<String> list = new ArrayList<>();
            list.add(producto.getNombre());
            list.add("" + producto.getPrecio_unitario());
            list.add("" + producto.getCantidad_disponible());
            model.addRow(list.toArray());
        });
        tableProductos.setModel(model);

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        cmdAcceder = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableProductos.setAutoCreateRowSorter(true);
        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio Unitario", "Cantidad Disponible"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableProductos);

        cmdAcceder.setText("Borrar");
        cmdAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAccederActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdAcceder)
                .addGap(18, 18, 18)
                .addComponent(btnCerrar)
                .addGap(57, 57, 57))
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(cmdAcceder))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAccederActionPerformed
        List<String> selection = new ArrayList<>();
        if (tableProductos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Favor de seleccionar la fila que desea borrar");
        } else {
            try {
                Integer selectedRow = tableProductos.getSelectedRow();
                for (int i = 0; i < tableProductos.getColumnCount(); i++) {
                    selection.add( "" + tableProductos.getModel().getValueAt(selectedRow, i));
                }
                IngredientesRecetas.executeQuery(Conexion.getInstance().getCon(), String.format("delete from ingredientes_recetas where id_receta = (select id_receta from recetas where id_producto=%s)",productos.get(tableProductos.getSelectedRow()).getId_producto()));
                Recetas.executeQuery(Conexion.getInstance().getCon(), String.format("delete from recetas where id_receta=%s",productos.get(tableProductos.getSelectedColumn()).getId_producto()));
                String query = Producto.constructDeleteQuery(selection, "productos",
                        Producto.getColumnNamesNoId(Conexion.getInstance().getCon(), "productos"));
                ((DefaultTableModel)tableProductos.getModel()).removeRow(tableProductos.getSelectedRow());
                Productos.executeQuery(Conexion.getInstance().getCon(), query);
                       JOptionPane.showMessageDialog(rootPane, "Borrado con exito");
                
            } catch (SQLException ex) {
                Logger.getLogger(FrmBorrarProductos.class.getName()).log(Level.SEVERE, null, ex);
            }

            
            

        }

    }//GEN-LAST:event_cmdAccederActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton cmdAcceder;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tableProductos;
    // End of variables declaration//GEN-END:variables
}
