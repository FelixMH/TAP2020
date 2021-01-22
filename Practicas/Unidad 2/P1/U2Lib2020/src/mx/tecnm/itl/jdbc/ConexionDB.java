/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                       Clase que maneja la conexion directa a la base de datos mediante el patrón singleton.
:*        
:*  Archivo     : ConexionDB.java
:*  Autor       : Félix Gerardo Martínez Hinojo     17130800
:*  Fecha       : 30/NOV/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripci�n : Clase con la funcionalidad para conectarnos y accedernos a la nase de datos desde la app.
:*                
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  01/DIC/2020 Félix Mtz       Se añadió el prologo, y los metodos para las conexiones a las bases de datos y la obtencion de los datos.
    02/DIC/2020 Félix Mtz       Mejora en el patrón Singleton para el acceso a la base de datos.
:*------------------------------------------------------------------------------------------*/
package mx.tecnm.itl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConexionDB {
    
    public static final String JAVADB = "Java DB";
    public static final String SQLSERVER = "SQL Server";
    public static final String MYSQL = "MySQL";
    public static final String ORACLEXE = "OracleXE";
    public static final String ACCESS = "MS Access";
    
    
    private static ConexionDB instancia = null;
    private static Connection conexion;
    
    private static String driverJDBC        =   "org.apache.derby.jdbc.ClientDriver";
    private static String urlConexion       =   "jdbc:derby://localhost:1527/";
    private static String host              =   "";
    private static String puerto            =   "";
    private static String baseDeDatos       =   "TAPdb";
    private static String usuario           =   "topicos";
    private static String contraseña        =   "2020";
    
    private ConexionDB () {
        try {
            // Realizar la conexión
            Class.forName ( driverJDBC );
            // Hacer la conexión
            conexion = DriverManager.getConnection (
                urlConexion+baseDeDatos,
                usuario,
                contraseña
        );
            
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog ( null, ex.getMessage () );
        }
    }
    
    public static ConexionDB getInstancia () {
        if ( instancia == null ) {
            instancia = new ConexionDB ();
        }
        return instancia;
    }
    
    
    public void conectar ( String dbms, String host, String puerto, String bd, String usuario, String contraseña ) {
        
        ConexionDB.host = host;        
        ConexionDB.puerto = puerto;        
        ConexionDB.baseDeDatos = bd;        
        ConexionDB.usuario = usuario;        
        ConexionDB.contraseña = contraseña;

        if ( dbms.equals ( JAVADB ) ) {
            driverJDBC        =   "org.apache.derby.jdbc.ClientDriver";
            urlConexion       =   "jdbc:derby://" + host + ":" + puerto + "/" ;
        } else if ( dbms.equals( SQLSERVER ) ) {
            
        } else if ( dbms.equals( MYSQL ) ) {
            
        } else if ( dbms.equals( ORACLEXE ) ) {
            
        } else if ( dbms.equals( ACCESS ) ) {
            
        }
        
        conexion = null;
        try {
            // Realizar la conexión
            Class.forName ( driverJDBC );
            // Hacer la conexión
            conexion = DriverManager.getConnection (
                urlConexion+baseDeDatos,
                usuario,
                contraseña
        );
            
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog ( null, ex.getMessage () );
        }
        
    }
    
    
    public Connection getConexion () {
        return conexion;
    }
    
    public void desconectar () {
        if ( conexion != null ) {
            try {
                conexion.close ();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog ( null, ex.getMessage () );
            }
        }
    }
    
    public boolean conectado () {
        if ( conexion != null )
            return true;
        else
            return false;
    }
    
}
