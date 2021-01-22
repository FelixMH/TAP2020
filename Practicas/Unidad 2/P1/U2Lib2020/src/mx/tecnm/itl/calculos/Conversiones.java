/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                    JFrame para probar la clase Conversiones
:*        
:*  Archivo     : Conversiones.java
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
package mx.tecnm.itl.calculos;

public class Conversiones {
    public static double CelsiusAFahrenheit(double c){
        return (c*9/5)+32;
    }
    
    //--------------------------------------------------------------------------
    
    public static double FahrenheitACelsius(double f){
        return (f-32)*5/9;
    }
    
    //--------------------------------------------------------------------------
    
    public static double YardasAMetros(double y){
        return y/1.094;
    }
    
    //--------------------------------------------------------------------------
    
    public static double MetrosAYardas(double m){
        return m*1.094;
    }
    
    //--------------------------------------------------------------------------
    
    public static double LibrasAKilos(double l){
        return l/2.205;
    }
    
    //--------------------------------------------------------------------------
    
    public static double KilosALibras(double k){
        return k*2.205;
    }
    
    //--------------------------------------------------------------------------
    
    public static String DecimalABinario(int decimal){
        
        String binario = "";
        
        while(decimal>0){            
            binario += decimal%2;
            decimal = decimal/2;
        }
                
        char[] numeros = binario.toCharArray();
        binario="";
        for(int i = numeros.length-1; i >= 0; i--)
            binario += numeros[i];
        
        return binario;
    }        
    
    //--------------------------------------------------------------------------
    
    public static int BinarioADecimal(String binario){
        int total=0, j=1;
        
        char[] numeros = binario.toCharArray();
                
        for(int i=numeros.length-1; i>=0; i--){                        
            total += Integer.parseInt(numeros[i]+"")*j;
            j=j*2;
        }
        
        return total;
    }
}
