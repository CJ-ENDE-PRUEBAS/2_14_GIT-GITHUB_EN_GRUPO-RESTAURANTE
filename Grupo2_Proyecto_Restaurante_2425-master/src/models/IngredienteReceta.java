package models;

import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;

/**
 * Clase que contiene los atributos de Ingrediente-Receta.
 * @author Alejandro Escobedo
 */
public class IngredienteReceta extends BaseModel{
    public static final String PROP_ID_INGREDIENTE = "PROP_ID_INGREDIENTE";
    public static final String PROP_ID_RECETA = "PROP_ID_RECETA";
    public static final String PROP_CANTIDAD_INGREDIENTE = "PROP_CANTIDAD_INGREDIENTE";
    
    private BigDecimal id_ingrediente;
    
    private BigDecimal id_receta;
    
    private BigDecimal cantidad_ingrediente;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    /**
     * Método para obtener un id_ingrediente de un objeto IngredienteReceta.
     * @return the id_ingrediente
     */
    public BigDecimal getId_ingrediente() {
        return id_ingrediente;
    }

    /**
     * Método para asignar un id_ingrediente a un objeto IngredienteReceta.
     * @param id_ingrediente the id_ingrediente to set
     */
    public void setId_ingrediente(BigDecimal id_ingrediente) {
        java.math.BigDecimal oldId_ingrediente = this.id_ingrediente;
        this.id_ingrediente = id_ingrediente;
        propertyChangeSupport.firePropertyChange(PROP_ID_INGREDIENTE, oldId_ingrediente, id_ingrediente);
    }

    /**
     * Método para obtener un id_receta de un objeto IngredienteReceta.
     * @return the id_receta
     */
    public BigDecimal getId_receta() {
        return id_receta;
    }

    /**
     * Método para asignar un id_proveedor a un objeto IngredienteReceta.
     * @param id_receta the id_receta to set
     */
    public void setId_receta(BigDecimal id_receta) {
        java.math.BigDecimal oldId_receta = id_receta;
        this.id_receta = id_receta;
        propertyChangeSupport.firePropertyChange(PROP_ID_RECETA, oldId_receta, id_receta);
    }

    /**
     * Método para obtener un cantidad_ingrediente de un objeto IngredienteReceta.
     * @return the cantidad_ingrediente
     */
    public BigDecimal getCantidad_ingrediente() {
        return cantidad_ingrediente;
    }

    /**
     * Método para asignar un cantidad_ingrediente a un objeto IngredienteReceta.
     * @param cantidad_ingrediente the cantidad_ingrediente to set
     */
    public void setCantidad_ingrediente(BigDecimal cantidad_ingrediente) {
        java.math.BigDecimal oldCantidad_ingrediente = this.cantidad_ingrediente;
        this.cantidad_ingrediente = cantidad_ingrediente;
        propertyChangeSupport.firePropertyChange(PROP_CANTIDAD_INGREDIENTE, oldCantidad_ingrediente, cantidad_ingrediente);
    }

}
