/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                       Casos de prueba JUnit para la clase Matematica
:*        
:*  Archivo     : MatematicaTest.java
:*  Autor       : Félix Gerardo Martínez Hinojo     17130800
:*  Fecha       : 02/OCT/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripci�n : clase que contiene funciones para realizar las pruebas a los métodos: 
                  1.- Factorial( n )
                  2.- Permutaciones ( n, x )
                  3.- Combinaciones ( n, x )
:*                
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  
:*------------------------------------------------------------------------------------------*/

package pruebasmatematica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MatematicaTest {
    
    public MatematicaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //------------------------------------------------------------------------------------------
    @Test
    public void factorialTest() {
        assertEquals ( " Factorial ( 0 ) ", 1, matematica.Matematica.factorial( 0 ) );
        assertEquals ( " Factorial ( 1 ) ", 1, matematica.Matematica.factorial( 1 ) );
        assertEquals ( " Factorial ( 5 ) ", 120, matematica.Matematica.factorial( 5 ) );
        assertEquals ( " Factorial ( 17 ) ", 355687428096000L, matematica.Matematica.factorial( 17 ) );
    }
    //------------------------------------------------------------------------------------------
    @Test
    public void permutacionesTest() {
        assertEquals( " permutaciones ( 10, 5 ) ", 30240, matematica.Matematica.permutaciones( 10, 5 ) );
        assertEquals( " permutaciones ( 5, 5 ) ", 120, matematica.Matematica.permutaciones( 5, 5 ) );
        assertEquals( " permutaciones ( 15, 9 ) ", 1816214400, matematica.Matematica.permutaciones( 15, 9 ) );
        assertEquals( " permutaciones ( 21, 6 ) ", 13366080, matematica.Matematica.permutaciones( 18, 6 ) );
    }
    //------------------------------------------------------------------------------------------
    @Test
    public void combinacionesTest() {
        assertEquals( " combinaciones ( 10, 5 ) ", 252, matematica.Matematica.combinaciones( 10, 5 ) );
        assertEquals( " combinaciones ( 5, 5 ) ", 1, matematica.Matematica.combinaciones( 5, 5 ) );
        assertEquals( " combinaciones ( 15, 9 ) ", 5005, matematica.Matematica.combinaciones( 15, 9 ) );
        assertEquals( " combinaciones ( 21, 6 ) ", 18564, matematica.Matematica.combinaciones( 18, 6 ) );
    }
    
    //------------------------------------------------------------------------------------------
    @Test
    public void formulaGeneralTest() {
        assertEquals("formulaGeneral ( 1, 4, -5 ) ", "1.0, 5.0", matematica.Matematica.formulaGeneral(1, 4, -5) );
    }
    //------------------------------------------------------------------------------------------
    
}
