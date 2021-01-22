/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*               Test para probar los metodos de las diferentes clase
:*        
:*  Archivo     : TrianguloRect.java
:*  Autor       : Félix Gerardo Martínez Hinojo 17130800
:*  Fecha       : 18/OCT/2020
:*  Compilador  : JAVA J2SE v1.8.2
:*  Descripci�n : Test para verificar el correcto funcionamiento del programa
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  18/OCT/2020 FélixMtz            Agregar Prólogo.
:*------------------------------------------------------------------------------------------*/
package Prismas;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PrismasTest {
    
    public PrismasTest() {
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
    
    //------------------------------------------------------------------------------
    
    @Test
    public void cilindroTest(){
        Cilindro c = new Cilindro();
        assertEquals( "Cilindro Area de Base ", 0.0, c.areaBase(), 0.1 );
        assertEquals( "Cilindro Area Lateral ", 0.0, c.areaLateral(), 0.1 );
        assertEquals( "Cilindro Area Total ", 0.0, c.areaTotal(), 0.1 );
        assertEquals( "Cilindro Volumen ", 0.0, c.volumen(), 0.1 );
        
        c = new Cilindro( 5.1, 12.82);
        assertEquals( "Cilindro Area de Base ", 81.7128, c.areaBase(), 0.0001 );
        assertEquals( "Cilindro Area Lateral ", 410.8072, c.areaLateral(), 0.0001 );
        assertEquals( "Cilindro Area Total ", 574.2328, c.areaTotal(), 0.0001 );
        assertEquals( "Cilindro Volumen ", 1047.5584, c.volumen(), 0.0001 );
        
        //Prueba estableciendo las dimesiones con los metodos setter
        c = new Cilindro();
        c.setRadio(5.1);
        c.setAltura(12.82);                
        assertEquals( "Cilindro Area de Base ", 81.7128, c.areaBase(), 0.0001 );
        assertEquals( "Cilindro Area Lateral ", 410.8072, c.areaLateral(), 0.0001 );
        assertEquals( "Cilindro Area Total ", 574.2328, c.areaTotal(), 0.0001 );
        assertEquals( "Cilindro Volumen ", 1047.5584, c.volumen(), 0.0001 );
    }
    
    //------------------------------------------------------------------------------
    
    @Test
    public void PrismaRectangularTest(){
        PrismaRectangular PR = new PrismaRectangular();
        assertEquals( "Prisma Rectangular Area de Base ", 0.0, PR.areaBase(), 0.1 );
        assertEquals( "Prisma Rectangular Area Lateral ", 0.0, PR.areaLateral(), 0.1 );
        assertEquals( "Prisma Rectangular Area Total ", 0.0, PR.areaTotal(), 0.1 );
        assertEquals( "Prisma Rectangular Volumen ", 0.0, PR.volumen(), 0.1 );
        
        PR = new PrismaRectangular( 20, 20, 20);
        assertEquals( "Prisma Rectangular Area de Base ", 400, PR.areaBase(), 0.0001 );
        assertEquals( "Prisma Rectangular Lateral ", 1600, PR.areaLateral(), 0.0001 );
        assertEquals( "Prisma Rectangular Area Total ", 2400, PR.areaTotal(), 0.0001 );
        assertEquals( "Prisma Rectangular Volumen ", 8000, PR.volumen(), 0.0001 );
        
        //Prueba estableciendo las dimesiones con los metodos setter
        PR = new PrismaRectangular();
        PR.setAltura(20);
        PR.setAncho(20);                
        PR.setLargo(20);
        assertEquals( "Prisma Rectangular Area de Base ", 400, PR.areaBase(), 0.0001 );
        assertEquals( "Prisma Rectangular Lateral ", 1600, PR.areaLateral(), 0.0001 );
        assertEquals( "Prisma Rectangular Area Total ", 2400, PR.areaTotal(), 0.0001 );
        assertEquals( "Prisma Rectangular Volumen ", 8000, PR.volumen(), 0.0001 );
    }
    
    //------------------------------------------------------------------------------
    
    @Test
    public void PrismaTriangularTest(){
        PrismaTriangular PT = new PrismaTriangular();
        assertEquals( "Prisma Triangular Area de Base ", 0.0, PT.areaBase(), 0.1 );
        assertEquals( "Prisma Triangular Area Lateral ", 0.0, PT.areaLateral(), 0.1 );
        assertEquals( "Prisma Triangular Area Total ", 0.0, PT.areaTotal(), 0.1 );
        assertEquals( "Prisma Triangular Volumen ", 0.0, PT.volumen(), 0.1 );
        
        PT = new PrismaTriangular( 20, 20, 20);
        assertEquals( "Prisma Triangular Area de Base ", 200, PT.areaBase(), 0.0001 );
        assertEquals( "Prisma Triangular Lateral ", 1365.6854, PT.areaLateral(), 0.0001 );
        assertEquals( "Prisma Triangular Area Total ", 1765.6854, PT.areaTotal(), 0.0001 );
        assertEquals( "Prisma Triangular Volumen ", 4000, PT.volumen(), 0.0001 );
        
        //Prueba estableciendo las dimesiones con los metodos setter
        PT = new PrismaTriangular();
        PT.setAltura(20);
        PT.setC1(20);                
        PT.setC2(20);
        PT.setBas(new TrianguloRect(20,20));
        assertEquals( "Prisma Triangular Area de Base ", 200, PT.areaBase(), 0.0001 );
        assertEquals( "Prisma Triangular Lateral ", 1365.6854, PT.areaLateral(), 0.0001 );
        assertEquals( "Prisma Triangular Area Total ", 1765.6854, PT.areaTotal(), 0.0001 );
        assertEquals( "Prisma Triangular Volumen ", 4000, PT.volumen(), 0.0001 );
    }
}
