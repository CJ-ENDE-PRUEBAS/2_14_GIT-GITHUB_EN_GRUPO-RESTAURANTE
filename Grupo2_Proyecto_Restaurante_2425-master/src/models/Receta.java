package models;

import java.awt.Image;
import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;

/**
 * Clase que contiene los atributos de un Receta.
 * @author Alejandro Escobedo
 */
public class Receta extends BaseModel{
    public static final String PROP_ID_RECETA = "PROP_ID_RECETA";
    public static final String PROP_ID_PRODUCTO = "PROP_ID_PRODUCTO";
    public static final String PROP_TIEMPO_COCCION = "PROP_TIEMPO_COCCION";
    public static final String PROP_CANTIDAD_HECHA = "PROP_CANTIDAD_HECHA";
    public static final String PROP_DESCRIPCION = "PROP_DESCRIPCION";
    public static final String PROP_IMAGEN = "PROP_IMAGEN";

    private BigDecimal id_receta;
    
    private BigDecimal id_producto;
    
    private BigDecimal tiempo_coccion;
    
    private BigDecimal cantidad_hecha;
    
    private String descripcion;
    
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    /**
     * Método para obtener un id_receta de un objeto Receta.
     * @return the id_receta
     */
    public BigDecimal getId_receta() {
        return id_receta;
    }

    /**
     * Método para asignar un id_receta de un objeto Receta.
     * @param id_receta the id_receta to set
     */
    public void setId_receta(BigDecimal id_receta) {
        java.math.BigDecimal oldId_receta = this.id_receta;
        this.id_receta = id_receta;
        propertyChangeSupport.firePropertyChange(PROP_ID_RECETA, oldId_receta, id_receta);
    }

    /**
     * Método para obtener un id_producto de un objeto Receta.
     * @return the id_producto
     */
    public BigDecimal getId_producto() {
        return id_producto;
    }

    /**
     * Método para asignar un id_producto de un objeto Receta.
     * @param id_producto the id_producto to set
     */
    public void setId_producto(BigDecimal id_producto) {
        java.math.BigDecimal oldId_producto = this.id_producto;
        this.id_producto = id_producto;
        propertyChangeSupport.firePropertyChange(PROP_ID_PRODUCTO, oldId_producto, id_producto);
    }

    /**
     * Método para obtener un tiempo_coccion de un objeto Receta.
     * @return the tiempo_coccion
     */
    public BigDecimal getTiempo_coccion() {
        return tiempo_coccion;
    }

    /**
     * Método para asignar un tiempo_coccion de un objeto Receta.
     * @param tiempo_coccion the tiempo_coccion to set
     */
    public void setTiempo_coccion(BigDecimal tiempo_coccion) {
        java.math.BigDecimal oldTiempo_coccion = this.tiempo_coccion;
        this.tiempo_coccion = tiempo_coccion;
        propertyChangeSupport.firePropertyChange(PROP_TIEMPO_COCCION, oldTiempo_coccion, tiempo_coccion);
    }

    /**
     * Método para obtener una cantidad_hecha de un objeto Receta.
     * @return the cantidad_hecha
     */
    public BigDecimal getCantidad_hecha() {
        return cantidad_hecha;
    }

    /**
     * Método para asignar una cantidad_hecha de un objeto Receta.
     * @param cantidad_hecha the cantidad_hecha to set
     */
    public void setCantidad_hecha(BigDecimal cantidad_hecha) {
        java.math.BigDecimal oldCantidad_hecha = this.cantidad_hecha;
        this.cantidad_hecha = cantidad_hecha;
        propertyChangeSupport.firePropertyChange(PROP_CANTIDAD_HECHA, oldCantidad_hecha, cantidad_hecha);
    }

    /**
     * Método para obtener una descripcion de un objeto Receta.
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método para asignar una descripcion de un objeto Receta.
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        java.lang.String oldDescripcion = this.descripcion;
        this.descripcion = descripcion;
        propertyChangeSupport.firePropertyChange(PROP_DESCRIPCION, oldDescripcion, descripcion);
    }
   
}
