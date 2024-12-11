package models;

import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Clase que contiene los atributos de OrdenIngrediente.
 * @author Alejandro Escobedo
 */
public class OrdenIngrediente extends BaseModel{
    public static final String PROP_ID_ORDEN = "PROP_ID_ORDEN";
    public static final String PROP_CANTIDAD = "PROP_CANTIDAD";
    public static final String PROP_FECHA_PEDIDO = "PROP_FECHA_PEDIDO";
    public static final String PROP_TOTAL_COMPRA = "PROP_TOTAL_COMPRA";
    public static final String PROP_ID_PROVEEDOR = "PROP_ID_PROVEEDOR";
    public static final String PROP_ID_INGREDIENTE = "PROP_ID_INGREDIENTE";
    
    private BigDecimal id_orden;
    
    private BigDecimal cantidad;
    
    private Timestamp fecha_pedido;
    
    private BigDecimal total_compra;

    private BigDecimal id_proveedor;
    
    private BigDecimal id_ingrediente;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    /**
     * Método para obtener un id_orden de un objeto OrdenIngrediente.
     * @return the id_orden
     */
    public BigDecimal getId_orden() {
        return id_orden;
    }

    /**
     * Método para asignar un id_orden de un objeto OrdenIngrediente.
     * @param id_orden the id_orden to set
     */
    public void setId_orden(BigDecimal id_orden) {
        java.math.BigDecimal oldId_orden = this.id_orden;
        this.id_orden = id_orden;
        propertyChangeSupport.firePropertyChange(PROP_ID_ORDEN, oldId_orden, id_orden);
    }

    /**
     *  Método para obtener una cantidad de un objeto OrdenIngrediente.
     * @return the cantidad
     */
    public BigDecimal getCantidad() {
        return cantidad;
    }

    /**
     *  Método para asignar una cantidad de un objeto OrdenIngrediente.
     * @param cantidad the cantidad to set
     */
    public void setCantidad(BigDecimal cantidad) {
        java.math.BigDecimal oldCantidad = this.cantidad;
        this.cantidad = cantidad;
        propertyChangeSupport.firePropertyChange(PROP_CANTIDAD, oldCantidad, cantidad);
    }

    /**
     *  Método para obtener una fecha_pedido de un objeto OrdenIngrediente.
     * @return the fecha_pedido
     */
    public Timestamp getFecha_pedido() {
        return fecha_pedido;
    }

    /**
     *  Método para asignar una fecha_pedido de un objeto OrdenIngrediente.
     * @param fecha_pedido the fecha_pedido to set
     */
    public void setFecha_pedido(Timestamp fecha_pedido) {
        java.sql.Timestamp oldFecha_pedido = this.fecha_pedido;
        this.fecha_pedido = fecha_pedido;
        propertyChangeSupport.firePropertyChange(PROP_FECHA_PEDIDO, oldFecha_pedido, fecha_pedido);
    }

    /**
     *  Método para obtener un total_compra de un objeto OrdenIngrediente.
     * @return the total_compra
     */
    public BigDecimal getTotal_compra() {
        return total_compra;
    }

    /**
     *  Método para asignar un total_compra de un objeto OrdenIngrediente.
     * @param total_compra the total_compra to set
     */
    public void setTotal_compra(BigDecimal total_compra) {
        java.math.BigDecimal oldTotal_compra = this.total_compra;
        this.total_compra = total_compra;
        propertyChangeSupport.firePropertyChange(PROP_TOTAL_COMPRA, oldTotal_compra, total_compra);
    }

    /**
     *  Método para obtener un id_proveedor de un objeto OrdenIngrediente.
     * @return the id_proveedor
     */
    public BigDecimal getId_proveedor() {
        return id_proveedor;
    }

    /**
     *  Método para asignar un id_proveedor de un objeto OrdenIngrediente.
     * @param id_proveedor the id_proveedor to set
     */
    public void setId_proveedor(BigDecimal id_proveedor) {
        java.math.BigDecimal oldId_proveedor = this.id_proveedor;
        this.id_proveedor = id_proveedor;
        propertyChangeSupport.firePropertyChange(PROP_ID_PROVEEDOR, oldId_proveedor, id_proveedor);
    }

    /**
     *  Método para obtener un id_ingrediente de un objeto OrdenIngrediente.
     * @return the id_ingrediente
     */
    public BigDecimal getId_ingrediente() {
        return id_ingrediente;
    }

    /**
     *  Método para asignar un id_ingrediente de un objeto OrdenIngrediente.
     * @param id_ingrediente the id_ingrediente to set
     */
    public void setId_ingrediente(BigDecimal id_ingrediente) {
        java.math.BigDecimal oldId_ingrediente = this.id_ingrediente;
        this.id_ingrediente = id_ingrediente;
        propertyChangeSupport.firePropertyChange(PROP_ID_INGREDIENTE, oldId_ingrediente, id_ingrediente);
    }


}

