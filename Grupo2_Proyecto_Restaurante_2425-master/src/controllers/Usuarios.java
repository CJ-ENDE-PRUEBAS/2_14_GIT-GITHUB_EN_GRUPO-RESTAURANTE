package controllers;

import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import models.Usuario;
import oraclegeneral.Conexion;
import views.BaseFrame;

/**
 * Clase controlador del modelo usuarios
 * @author Erik David Zubia Hernandez
 * @since 22/05/2015
 * @version 1.0
 */
public class Usuarios extends BaseController{
    
    public static String checkUsuario(String usuario, String contra){
        String query = "select * from usuarios where usuario like '"+usuario+"' and contrasena like '"+contra+"'";
        List<Usuario> usuarios = (List<Usuario>) Usuarios.select(Conexion.getInstance().getCon(), query, Usuario.class);
        System.out.println("usuarios = " + usuarios.stream().collect(Collectors.toList()));
        if(!usuarios.isEmpty()){
            try{
            if(usuarios.get(0).getUsuario().equals(usuario) && usuarios.get(0).getContrasena().equals(contra)){
                if(usuarios.get(0).getUsuario().equals("administrador")){
                    return "admin";
                    }else{
                    return "vendedor";
                    }
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Acceso como vendedor.");
                return "vendedor";
            }
        }else{
            return "";
        }
        return "";
    }
    
}
