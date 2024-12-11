package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Modelo que sirve como base para todos los demas modelos
 *
 * @author Alejandro Escobedo, Daniela Santillanes
 * @version 1.0
 * @since 26/05/2015
 */
public class BaseModel {

    public static final String VACIO = "";
    public static final String CURRENT_TIMESTAMP = "CURRENT_TIMESTAMP";
    /**
     * Metodo para checar si algun valor es numerico.
     *
     * @param str
     * @return
     */
    public static Boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str.trim());
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    /**
     * Metodo para revisar que una cadena no sea nula ni este vacia.
     *
     * @param str
     * @return
     */
    public static Boolean isValidString(String str) {
        return str != null && !str.isEmpty() && !str.trim().isEmpty();
    }

    /**
     * Método que nos verifica si algún valor es una Fecha.
     * 
     * @param fecha
     * @return 
     */
    public static Boolean isFecha(String fecha) {
        if (fecha == null) {
            return false;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        if (fecha.trim().length() != dateFormat.toPattern().length()) {
            return false;
        }

        dateFormat.setLenient(false);

        try {
            dateFormat.parse(fecha.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }

    public static String constructDeleteQuery(List<String> elements, String tabla, List<?> columnNames){
        String deleteFields = "";
        for (int i = 0; i < columnNames.size()-1; i++) {
            deleteFields = String.format("%s %s like '%s' AND", deleteFields, columnNames.get(i), elements.get(i));
        }
        deleteFields = String.format("%s %s = '%s'", deleteFields, columnNames.get(columnNames.size()-1), elements.get(elements.size()-1));
        String sql = String.format("delete from %s where%s", tabla, deleteFields);
        return sql;
    
    }
    
    public static List<String> getColumnNamesNoId(Connection connection, String tabla) throws SQLException{
        List<String> columnNames = new ArrayList<>();
        PreparedStatement ps = connection.prepareStatement(String.format("select * FROM %s", tabla));
        ResultSet rs = ps.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();
        Integer columnCount = rsmd.getColumnCount();
        
        for (int i = 2; i < columnCount +1 ; i++) {
            columnNames.add(rsmd.getColumnName(i));
            
        }
    
    return columnNames;
    }
    
}
