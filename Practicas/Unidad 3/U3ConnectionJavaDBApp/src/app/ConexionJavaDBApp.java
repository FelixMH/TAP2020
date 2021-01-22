package app;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author FelixMtz
 */
public class ConexionJavaDBApp {
        
    
    public static void main(String[] args) throws SQLException {
//            try {
//                // Cargar el driver JDBC
//                Class.forName ( driverJDBC );
//                // Hacer la conexión
//                Connection con = DriverManager.getConnection (
//                        urlConexion,
//                        usuario,
//                        contraseña
//                );
//                
//                if ( con != null ) {
//                    JOptionPane.showMessageDialog ( null, "conexión exitosa: " );
//                
//                    // Consulta a la tabla alumnos
//                    Statement st = con.createStatement ();
//                    ResultSet rs = st.executeQuery( " SELECT * FROM ALUMNOS " );
//                    
//                    while ( rs.next () ) {                    
//                        System.out.println (
//                                rs.getInt ( "MATRICULA" ) + " " +
//                                rs.getString ( "NOMBRE" ) + " " +
//                                rs.getString ( "APELLIDOS" ) + " " +
//                                rs.getInt ( "EDAD" ) + " " +
//                                rs.getInt ( "PROMEDIO" ) + " " 
//                        );
//                    }
//                    
//                    st.close  ();
//                    rs.close  ();
//                    con.close ();
//                }
//                else
//                    System.out.println("Conexión no establecida!! ");
//                
//                con.close ();
//                
//            } catch ( ClassNotFoundException ex ) {
//                JOptionPane.showMessageDialog ( null,  "Error al cargar el controlador: " + ex.getMessage () );
//            } catch ( SQLException ex ) {
//                JOptionPane.showMessageDialog ( null,  "Error de SQL: " + ex.getMessage () );
//            }
    }
    
}
