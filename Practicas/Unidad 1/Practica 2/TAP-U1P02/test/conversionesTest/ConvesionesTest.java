/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                    JFrame para probar la clase Conversiones
:*        
:*  Archivo     : ConversionesTest.java
:*  Autor       : Felix Gerardo Martínez Hinojo 17130800
:*  Fecha       : 12/OCT/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripcion : Aplicacion que sirve para mostrar el correcto funcionamiento de los metodos
:*                de la clase Conversiones
:*  Ultima modif: 
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  12/OCT/2020 FelixMtz           se añadió el prologo.
:*------------------------------------------------------------------------------------------*/
package conversionesTest;

import matematica.Conversiones;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FelixMtz
 */
public class ConvesionesTest {
    
    public ConvesionesTest() {
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
    //--------------------------------------------------------------------------
    @Test
    public void CelsiusAFahrenheitTest(){
        assertEquals("CelsiusAFahrenheit(120): ",248.0, Conversiones.CelsiusAFahrenheit(120),0.0001);
    }
    //--------------------------------------------------------------------------
    @Test
    public void FahrenheitACelsiusTest(){
        assertEquals("FahrenheitACelsius(120): ",48.88888, Conversiones.FahrenheitACelsius(120),0.0001);
    }
    //--------------------------------------------------------------------------
    @Test
    public void YardasAMetrosTest(){
        assertEquals("YardasAMetros(120): ",109.6892, Conversiones.YardasAMetros(120),0.0001);
    }
    //--------------------------------------------------------------------------
    @Test
    public void MetrosAYardasTest(){
        assertEquals("MetrosAYardas(120): ",131.28, Conversiones.MetrosAYardas(120),0.0001);
    }
    //--------------------------------------------------------------------------
    @Test
    public void LibrasAKilosTest(){
        assertEquals("LibrasAKilos(120): ",54.4217, Conversiones.LibrasAKilos(120),0.0001);
    }
    //--------------------------------------------------------------------------
    @Test
    public void KilosALibrasTest(){
        assertEquals("KilosALibras(120): ",264.6, Conversiones.KilosALibras(120),0.0001);
    }
    //--------------------------------------------------------------------------
    @Test
    public void DecimalABinarioTest(){
        assertEquals("DecimalABinario(10): ",1010+"", Conversiones.DecimalABinario(10));
    }
    //--------------------------------------------------------------------------
    @Test
    public void BinarioADecimalTest(){
        assertEquals("BinarioADecimal(1010): ",10, Conversiones.BinarioADecimal(1010+""));
    }    
}
