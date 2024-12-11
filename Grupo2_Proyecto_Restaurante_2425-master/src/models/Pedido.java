package models;

import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Clase que contiene los atributos de un Pedido.
 * @author Alejandro Escobedo
 */
public class Pedido extends BaseModel{
    public static final String PROP_ID_PEDIDO = "PROP_ID_PEDIDO";
    public static final String PROP_FECHA_PEDIDO = "PROP_FECHA_PEDIDO";
    public static final String PROP_TOTAL = "PROP_TOTAL";
    public static final String PROP_FECHA_ENTREGA = "PROP_FECHA_ENTREGA";
    public static final String PROP_ESTADO = "PROP_ESTADO";
    
    private BigDecimal id_pedido;
    
    private Timestamp fecha_pedido;
    
    private BigDecimal total;
    
    private Timestamp fecha_entrega;
    
    private String estado;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    /**
     * Método para obtener un id_pedido de un objeto Pedido.
     * @return the id_pedido
     */
    public BigDecimal getId_pedido() {
        return id_pedido;
    }

    /**
     * Método para asignar un id_pedido de un objeto Pedido.
     * @param id_pedido the id_pedido to set
     */
    public void setId_pedido(BigDecimal id_pedido) {
        java.math.BigDecimal oldId_pedido = this.id_pedido;
        this.id_pedido = id_pedido;
        propertyChangeSupport.firePropertyChange(PROP_ID_PEDIDO, oldId_pedido, id_pedido);
    }

    /**
     * Método para obtener una fecha_pedido de un objeto Pedido.
     * @return the fecha_pedido
     */
    public Timestamp getFecha_pedido() {
        return fecha_pedido;
    }

    /**
     * Método para asignar una fecha_pedido de un objeto Pedido.
     * @param fecha_pedido the fecha_pedido to set
     */
    public void setFecha_pedido(Timestamp fecha_pedido) {
        java.sql.Timestamp oldFecha_pedido = this.fecha_pedido;
        this.fecha_pedido = fecha_pedido;
        propertyChangeSupport.firePropertyChange(PROP_FECHA_PEDIDO, oldFecha_pedido, fecha_pedido);
    }

    /**
     * Método para obtener un total de un objeto Pedido.
     * @return the total
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Método para asignar un total de un objeto Pedido.
     * @param total the total to set
     */
    public void setTotal(BigDecimal total) {
        java.math.BigDecimal oldTotal = this.total;
        this.total = total;
        propertyChangeSupport.firePropertyChange(PROP_TOTAL, oldTotal, total);
    }

    /**
     * Método para obtener una fecha_entrega de un objeto Pedido.
     * @return the fecha_entrega
     */
    public Timestamp getFecha_entrega() {
        return fecha_entrega;
    }

    /**
     * Método para asignar una fecha_entrega de un objeto Pedido.
     * @param fecha_entrega the fecha_entrega to set
     */
    public void setFecha_entrega(Timestamp fecha_entrega) {
        java.sql.Timestamp oldFecha_entrega = this.fecha_entrega;
        this.fecha_entrega = fecha_entrega;
        propertyChangeSupport.firePropertyChange(PROP_FECHA_ENTREGA, oldFecha_entrega, fecha_entrega);
    }

    /**
     * Método para obtener un estado de un objeto Pedido.
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Método para asignar un pedido de un objeto Pedido.
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        java.lang.String oldEstado = this.estado;
        this.estado = estado;
        propertyChangeSupport.firePropertyChange(PROP_ESTADO, oldEstado, estado);
    }
    
}
