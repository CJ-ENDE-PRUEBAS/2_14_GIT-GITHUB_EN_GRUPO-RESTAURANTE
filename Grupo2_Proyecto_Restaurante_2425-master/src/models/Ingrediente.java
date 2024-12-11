package models;

import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;
import java.math.BigDecimal;

/**
 * Clase que contiene los atributos de un Ingrediente.
 * @author Alejandro Escobedo
 */
public class Ingrediente extends BaseModel{
    public static final String PROP_ID_INGREDIENTE = "PROP_ID_INGREDIENTE";
    public static final String PROP_NOMBRE_INGREDIENTE = "PROP_NOMBRE_INGREDIENTE";
    public static final String PROP_EXITENCIA_INVENTARIO = "PROP_EXITENCIA_INVENTARIO";
    public static final String PROP_COSTO_COMPRA = "PROP_COSTO_COMPRA";
    public static final String PROP_ID_PROVEEDOR = "PROP_ID_PROVEEDOR";

    private BigDecimal id_ingrediente;
    
    private String nombre_ingrediente;
    
    private BigDecimal exitencia_inventario;
    
    private BigDecimal costo_compra;
    
    private BigDecimal id_proveedor;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    /**
     * Método para obtener un id_ingrediente de un objeto Ingrediente.
     * @return the id_ingrediente
     */
    public BigDecimal getId_ingrediente() {
        return id_ingrediente;
    }

    /**
     * Método para asignar un id_ingrediente a un objeto Ingrediente.
     * @param id_ingrediente the id_ingrediente to set
     */
    public void setId_ingrediente(BigDecimal id_ingrediente) {
        java.math.BigDecimal oldId_ingrediente = this.id_ingrediente;
        this.id_ingrediente = id_ingrediente;
        propertyChangeSupport.firePropertyChange(PROP_ID_INGREDIENTE, oldId_ingrediente, id_ingrediente);
    }

    /**
     * Método para obtener un nombre_ingrediente de un objeto Ingrediente.
     * @return the nombre_ingrediente
     */
    public String getNombre_ingrediente() {
        return nombre_ingrediente;
    }

    /**
     * Método para asignar un nombre_ingrediente a un objeto Ingrediente.
     * @param nombre_ingrediente the nombre_ingrediente to set
     */
    public void setNombre_ingrediente(String nombre_ingrediente) {
        java.lang.String oldNombre_ingrediente = this.nombre_ingrediente;
        this.nombre_ingrediente = nombre_ingrediente;
        propertyChangeSupport.firePropertyChange(PROP_NOMBRE_INGREDIENTE, oldNombre_ingrediente, nombre_ingrediente);
    }

    /**
     * Método para obtener existencia_inventario de un objeto Ingrediente.
     * @return the existencia_inventario
     */
    public BigDecimal getExitencia_inventario() {
        return exitencia_inventario;
    }

    /**
     * Método para asignar un nombre_ingrediente a un objeto Ingrediente.
     * @param exitencia_inventario the existencia_inventario to set
     */
    public void setExitencia_inventario(BigDecimal exitencia_inventario) {
        java.math.BigDecimal oldExitencia_inventario = this.exitencia_inventario;
        this.exitencia_inventario = exitencia_inventario;
        propertyChangeSupport.firePropertyChange(PROP_EXITENCIA_INVENTARIO, oldExitencia_inventario, exitencia_inventario);
    }

    /**
     * Método para obtener costo compra de un objeto Ingrediente.
     * @return the costo_compra
     */
    public BigDecimal getCosto_compra() {
        return costo_compra;
    }

    /**
     * Método para asignar un nombre_ingrediente a un objeto Ingrediente.
     * @param costo_compra the costo_compra to set
     */
    public void setCosto_compra(BigDecimal costo_compra) {
        java.math.BigDecimal oldCosto_compra = this.costo_compra;
        this.costo_compra = costo_compra;
        propertyChangeSupport.firePropertyChange(PROP_COSTO_COMPRA, oldCosto_compra, costo_compra);
    }

    /**
     * Método para obtener un id_proveedor de un objeto Ingrediente.
     * @return the id_proveedor
     */
    public BigDecimal getId_proveedor() {
        return id_proveedor;
    }

    /**
     * Método para asignar un nombre_ingrediente a un objeto Ingrediente.
     * @param id_proveedor the id_proveedor to set
     */
    public void setId_proveedor(BigDecimal id_proveedor) {
        java.math.BigDecimal oldId_proveedor = this.id_proveedor;
        this.id_proveedor = id_proveedor;
        propertyChangeSupport.firePropertyChange(PROP_ID_PROVEEDOR, oldId_proveedor, id_proveedor);
    }
    
}
