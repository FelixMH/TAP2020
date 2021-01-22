package app;

import java.sql.*;
import jdbc.ConexionDB;
import javax.swing.JOptionPane;

/**
 *
 * @author FelixMtz
 */
public class ConexionJavaDBSingleton {
        
    
    public static void main(String[] args) throws SQLException {
            try {
                
                ConexionDB.getInstancia().conectar(ConexionDB.JAVADB, "localhost", "1527", "TAPdb", "topicos", "2020");
                // Hacer la conexión
                Connection con = ConexionDB.getInstancia ().getConexion ();
                
                if ( ConexionDB.getInstancia().conectado () ) {
                    JOptionPane.showMessageDialog ( null, "conexión exitosa: " );
                
                    // Consulta a la tabla alumnos
                    Statement st = con.createStatement ();
                    ResultSet rs = st.executeQuery( " SELECT * FROM ALUMNOS " );
                    
                    while ( rs.next () ) {                    
                        System.out.println (
                                "Matricula\n".toUpperCase() +
                                rs.getInt ( "MATRICULA" ) + " \n" +
                                "Nombre\n".toUpperCase() +
                                rs.getString ( "NOMBRE" ) + "\n" +
                                "Apellidos\n".toUpperCase() +
                                rs.getString ( "APELLIDOS" ) + " \n" +
                                "Edad\n".toUpperCase() +
                                rs.getInt ( "EDAD" ) + " \n" +
                                "Promedio\n".toUpperCase() +
                                rs.getInt ( "PROMEDIO" ) + "\n" +
                                "======================================================"
                        );
                    }
                    
                    st.close  ();
                    rs.close  ();
                    ConexionDB.getInstancia().desconectar ();
                }
                else
                    System.out.println("Conexión no establecida!! ");
                
                con.close ();
                
            } catch ( SQLException ex ) {
                JOptionPane.showMessageDialog ( null,  "Error de SQL: " + ex.getMessage () );
            }
    }
    
}
