/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                       Clase que contiene funciones matemáticas.
:*        
:*  Archivo     : Matematica.java
:*  Autor       : Félix Gerardo Martínez Hinojo     17130800
:*  Fecha       : 02/OCT/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripci�n : clase que contiene funciones matematicas que permite calcular
                  1.- Factorial( n )
                  2.- Permutaciones ( n, x )
                  3.- Combinaciones ( n, x )
:*                
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  30/SEP/2020 Félix G. Martínez       Se añadieron las reglas de calidad así como también
                                        algunas cuestiones del formato de la aplicación.
    01/OCT/2020 Félix G. Martínez       Se añadieron las funciones de factorial(), 
                                        cermutaciones() y combinaciones().
:*------------------------------------------------------------------------------------------*/

package mx.tecnm.itl.calculos;

import java.text.DecimalFormat;

public class Matematica {

        //------------------------------------------------------------------------------------------
	public static long factorial(int n) {
		long fact;
		if( n == 0  ) return 1;
		fact = 1;
		for ( int i = 1;  i <= n;  i++  )
		      fact*=i;
		return fact;
	}
        //------------------------------------------------------------------------------------------
	public static long permutaciones(int n, int x) {
		long p;
		p = ( factorial( n ) / factorial( n - x ) );
		return p;
	}
        //------------------------------------------------------------------------------------------
	public static long combinaciones(int n, int x) {
		long c;
		c = ( permutaciones( n, x ) / factorial( x ) );
		return c;
	}
        //-------------------------------------------------------------------------------------------
        public static String formulaGeneral( int a , int b, int c ) {
            String [ ] result = new String[ 2 ];
            boolean imaginario = false;
            float disc = ( float ) ( Math.pow(b, 2) - ( 4 * a * c  ) );
            
            if ( disc < 0 ) {
                imaginario = true;
                disc *= -1;
            }
            
            // se calcula la raiz
            float raiz = ( float ) Math.sqrt( disc );
            
            if ( imaginario ) {
                if ( b < 0 )
                    b *= -1;
                int denominador = 2 * a;
                
                result [ 0 ] = "(" + b + "+" + raiz + "i)" + "/" + denominador;
                result [ 1 ] = "(" + b + "-" + raiz + "i)" + "/" + denominador;
            } else {
                result [ 0 ] = ( - b + raiz ) / ( 2 * a ) + "";
                result [ 1 ] = ( - b - raiz ) / ( 2 * a ) + "";
            }
            
            return " X1 = " + result[ 0 ] + " , " + " X2 = " + result[ 1 ];
        }
        //-------------------------------------------------------------------------------------------
        public static double pi() {
            return Math.PI;
        }
        //-------------------------------------------------------------------------------------------
        
}