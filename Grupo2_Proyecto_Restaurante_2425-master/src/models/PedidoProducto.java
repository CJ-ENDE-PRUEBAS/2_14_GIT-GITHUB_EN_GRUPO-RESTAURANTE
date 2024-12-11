package models;

import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;

/**
 *Clase que modela a la tabla pedidos_producto dentro de la base de datos
 * @author Erik David Zubia Hernandez
 * @since 27/05/2015
 * @version 1.0
 */
public class PedidoProducto extends BaseModel {
    public static final String PROP_ID_PEDIDO = "PROP_ID_PEDIDO";
    public static final String PROP_ID_PRODUCTO = "PROP_ID_PRODUCTO";
    public static final String PROP_CANTIDAD = "PROP_CANTIDAD";
    
    private BigDecimal id_pedido;
    private BigDecimal id_producto;
    private BigDecimal cantidad;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    /**
     * Metodo que retorna el id del pedido
     * @return the id_pedido que es el identificador del pedido
     */
    public BigDecimal getId_pedido() {
        return id_pedido;
    }

    /**
     * Metodo que asigna el id_pedido del pedido
     * @param id_pedido el id_pedido que se va a asignar
     */
    public void setId_pedido(BigDecimal id_pedido) {
        java.math.BigDecimal oldId_pedido = this.id_pedido;
        this.id_pedido = id_pedido;
        propertyChangeSupport.firePropertyChange(PROP_ID_PEDIDO, oldId_pedido, id_pedido);
    }

    /**
     * Metodo que retorna el id_producto que viene dentro del pedido
     * @return el id_producto que es el identificador del producto pedido
     */
    public BigDecimal getId_producto() {
        return id_producto;
    }

    /**
     * Metodo para asignar el id_producto del producto pedido
     * @param id_producto el id_producto a asignar
     */
    public void setId_producto(BigDecimal id_producto) {
        java.math.BigDecimal oldId_producto = this.id_producto;
        this.id_producto = id_producto;
        propertyChangeSupport.firePropertyChange(PROP_ID_PRODUCTO, oldId_producto, id_producto);
    }

    /**
     * Metodo que regresa la cantidad pedida del producto
     * @return el cantidad pedida del producto
     */
    public BigDecimal getCantidad() {
        return cantidad;
    }

    /**
     * Metodo que asigna la cantidad pedida del producto
     * @param cantidad el cantidad a asignar
     */
    public void setCantidad(BigDecimal cantidad) {
        java.math.BigDecimal oldCantidad = this.cantidad;
        this.cantidad = cantidad;
        propertyChangeSupport.firePropertyChange(PROP_CANTIDAD, oldCantidad, cantidad);
    }
    
    
}
