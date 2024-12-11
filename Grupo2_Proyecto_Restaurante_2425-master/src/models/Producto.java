package models;

import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;

/**
 * Clase que contiene los atributos de un Producto.
 * @author Alejandro Escobedo
 */
public class Producto extends BaseModel{
    public static final String PROP_ID_PRODUCTO = "PROP_ID_PRODUCTO";
    public static final String PROP_NOMBRE = "PROP_NOMBRE";
    public static final String PROP_PRECIO_UNITARIO = "PROP_PRECIO_UNITARIO";

    private BigDecimal id_producto;
    
    private String nombre;
    
    private BigDecimal precio_unitario;
    
    private BigDecimal cantidad_disponible;
    
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    /**
     * Método para obtener un id_producto de un objeto Producto.
     * @return the id_producto
     */
    public BigDecimal getId_producto() {
        return id_producto;
    }

    /**
     * Método para asignar un id_producto a un objeto Producto.
     * @param id_producto the id_producto to set
     */
    public void setId_producto(BigDecimal id_producto) {
        java.math.BigDecimal oldId_producto = this.id_producto;
        this.id_producto = id_producto;
        propertyChangeSupport.firePropertyChange(PROP_ID_PRODUCTO, oldId_producto, id_producto);
    }

    /**
     * Método para obtener un nombre de un objeto Producto.
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para asignar un nombre de un objeto Producto.
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        java.lang.String oldNombre = this.nombre;
        this.nombre = nombre;
        propertyChangeSupport.firePropertyChange(PROP_NOMBRE, oldNombre, nombre);
    }

    /**
     * Método para obtener un precio_unitario de un objeto Producto.
     * @return the precio_unitario
     */
    public BigDecimal getPrecio_unitario() {
        return precio_unitario;
    }

    /**
     * Método para asignar un precio_unitario de un objeto Producto.
     * @param precio_unitario the precio_unitario to set
     */
    public void setPrecio_unitario(BigDecimal precio_unitario) {
        java.math.BigDecimal oldPrecio_unitario = this.precio_unitario;
        this.precio_unitario = precio_unitario;
        propertyChangeSupport.firePropertyChange(PROP_PRECIO_UNITARIO, oldPrecio_unitario, precio_unitario);
    }
    
    /**
     * Método para obtener una cantidad_disponible de un objeto Producto.
     * @return cantidad_disponible
     */
    public BigDecimal getCantidad_disponible() {
        return cantidad_disponible;
    }

    /**
     * Método para asignar una cantidad_disponible de un objeto Producto.
     * @param cantidad_disponible 
     */
    public void setCantidad_disponible(BigDecimal cantidad_disponible) {
        java.math.BigDecimal oldCantidad_disponible = this.cantidad_disponible;
        this.cantidad_disponible = cantidad_disponible;
        propertyChangeSupport.firePropertyChange(PROP_PRECIO_UNITARIO, oldCantidad_disponible, cantidad_disponible);
    }

   
    
}
