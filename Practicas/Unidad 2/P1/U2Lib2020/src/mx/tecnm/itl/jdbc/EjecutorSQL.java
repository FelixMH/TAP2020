/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                       Clase que maneja los metodos para acceder a la información de la base de datos.
:*        
:*  Archivo     : EjecutorSQL.java
:*  Autor       : Félix Gerardo Martínez Hinojo     17130800
:*  Fecha       : 01/DIC/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripci�n : Clase con la funcionalidad para conectarnos y accedernos a la nase de datos desde la app.
:*                
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  01/DIC/2020 Félix Mtz       Se añadió el prologo, y los metodos para las conexiones a las bases de datos y la obtencion de los datos.
:*------------------------------------------------------------------------------------------*/
package mx.tecnm.itl.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mx.tecnm.itl.jdbc.ConexionDB;

public class EjecutorSQL {
    
    public static final String INT      =   "int";
    public static final String FLOAT    =   "float";
    public static final String STRING   =   "string";
    
    // ------------------------------------------------------------------------------------------------------------
    public static ResultSet sqlQuery ( String sql ) throws SQLException {
        return sqlQuery ( sql, null );
    }
    
    // ------------------------------------------------------------------------------------------------------------
    public static ResultSet sqlQuery ( String sql, Object [][] args ) throws SQLException {
        PreparedStatement ps = ConexionDB.getInstancia().getConexion()
                            .prepareStatement ( sql );
        prepararArgumentos ( ps, args );
        return ps.executeQuery ();
        
    }
    // ------------------------------------------------------------------------------------------------------------
    
    public static int sqlEjecutar ( String sql ) throws SQLException {
        return sqlEjecutar ( sql, null );
    }
    
    // ------------------------------------------------------------------------------------------------------------
    
    public static int sqlEjecutar ( String sql, Object[][] args ) throws SQLException {
        PreparedStatement ps = ConexionDB.getInstancia().getConexion()
                            .prepareStatement ( sql );
        
        prepararArgumentos ( ps, args );
        
        return ps.executeUpdate ();
    }
    
    // ------------------------------------------------------------------------------------------------------------
    
    public static void prepararArgumentos ( PreparedStatement ps, Object[][] args ) throws SQLException {
        final int TIPO = 0;
        final int VALOR = 1;
        
        
            
        // Verificar si se debe realizar la sustitución de parametros
        if ( args != null ) {
            int numArg = 1;
            for ( Object[] arg : args ) {
                switch ( arg [ TIPO ].toString () ) {
                    case INT : ps.setInt ( numArg, Integer.parseInt ( arg [ VALOR ].toString() ) );
                    break;
                    case FLOAT : ps.setFloat ( numArg, Float.parseFloat ( arg [ VALOR ].toString() ) );
                    break;
                    case STRING : ps.setString ( numArg, arg [ VALOR ].toString() );
                    break;
                }
                numArg++;
            }
        }
    }
    
    
}
