/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*           Clase que contiene metodos y atributos del triangulo rectangulo.
:*        
:*  Archivo     : TrianguloRect.java
:*  Autor       : Félix Gerardo Martínez Hinojo 17130800
:*  Fecha       : 18/OCT/2020
:*  Compilador  : JAVA J2SE v1.8.2
:*  Descripci�n : La clase TrianguloRect tiene dos atributos cateto 1 y cateto 2
:*                de tipo double y tiene tres metodos para calcular la hipotenusa, 
:*                perimetro y sua area.
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  18/OCT/2020 FélixMtz            Agregar Prólogo.
:*------------------------------------------------------------------------------------------*/
package Prismas;


public class TrianguloRect{
    private double c1;
    private double c2;
//------------------------------------------------------------------------------
     public TrianguloRect(){
        c1 = 0.0;
        c2 = 0.0;
    }
//------------------------------------------------------------------------------    
    public TrianguloRect(double c1, double c2){
        this.c1 = c1;
        this.c2 = c2;
    }
//------------------------------------------------------------------------------    
    public double hipotenusa(){
        return Math.sqrt((Math.pow(c1, 2)+Math.pow(c2, 2)));
    }
//------------------------------------------------------------------------------    
    public double perimetro(){
        return c1+c2+hipotenusa();
    }
//------------------------------------------------------------------------------
    public double area(){
        return c1*c2/2;
    }
}
