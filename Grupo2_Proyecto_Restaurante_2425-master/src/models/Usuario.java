package models;

import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;

/**
 * Clase que contiene los atributos de un Usuario.
 * @author Alejandro Escobedo, Erik Zubia
 */
public class Usuario extends BaseModel{    
    public static final String PROP_ID_USUARIO = "PROP_ID_USUARIO";
    public static final String PROP_USUARIO = "PROP_USUARIO";
    public static final String PROP_CONTRASENA = "PROP_CONTRASENA";
    private BigDecimal id_usuario;
    
    private String usuario;
    
    private String contrasena;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    /**
     * Método para obtener un usuarioId de un objeto Usuario.
     * @return the usuarioId
     */
    public BigDecimal getId_usuario() {
        return id_usuario;
    }

    /**
     * Método para asignar un usuarioId de un objeto Usuario.
     * @param usuarioId the usuarioId to set
     */
    public void setId_usuario(BigDecimal id_usuario) {
        java.math.BigDecimal oldId_usuario = this.id_usuario;
        this.id_usuario = id_usuario;
        propertyChangeSupport.firePropertyChange(PROP_ID_USUARIO, oldId_usuario, id_usuario);
    }

    /**
     * Método para obtener un usuario de un objeto Usuario.
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Método para asignar un usuario de un objeto Usuario.
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        java.lang.String oldUsuario = this.usuario;
        this.usuario = usuario;
        propertyChangeSupport.firePropertyChange(PROP_USUARIO, oldUsuario, usuario);
    }

    /**
     * Método para obtener una contrasena de un objeto Usuario.
     * @return the contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Método para asignar una contraseña de un objeto Usuario.
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String contrasena) {
        java.lang.String oldContrasena = this.contrasena;
        this.contrasena = contrasena;
        propertyChangeSupport.firePropertyChange(PROP_CONTRASENA, oldContrasena, contrasena);
    }
}
