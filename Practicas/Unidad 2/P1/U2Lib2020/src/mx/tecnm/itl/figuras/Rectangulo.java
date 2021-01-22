/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*             Clase que contiene metodos y atributos de un rectangulo.
:*        
:*  Archivo     : Rectangulo.java
:*  Autor       : Félix Gerardo Martínez Hinojo 17130800
:*  Fecha       : 20/OCT/2020
:*  Compilador  : JAVA J2SE v1.8.2
:*  Descripci�n : La clase Rectangulo tiene dos atributos altura y largo de tipo
:*                double y tiene tres metodos para calcular la diagonal, 
:*                perimetro y sua area.
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  20/OCT/2020 Félix Mtz           se agregó prologo.  
:*------------------------------------------------------------------------------------------*/
package mx.tecnm.itl.figuras;

public class Rectangulo{
    private double a;
    private double l;
//------------------------------------------------------------------------------
    public Rectangulo(){
        a = 0.0;
        l = 0.0;
    }
//------------------------------------------------------------------------------    
    public Rectangulo(double a, double l){
        this.a = a;
        this.l = l;
    }
//------------------------------------------------------------------------------    
    public double diagonal(){
        return Math.sqrt((Math.pow(l, 2)+Math.pow(a, 2)));
    }
//------------------------------------------------------------------------------     
    public double perimetro(){
        return 2*l+2*a;
    }
//------------------------------------------------------------------------------
    public double area(){
        return l*a;
    }
//------------------------------------------------------------------------------
    public double getA() {
        return a;
    }
//------------------------------------------------------------------------------
    public void setA(double a) {
        this.a = a;
    }
//------------------------------------------------------------------------------
    public double getL() {
        return l;
    }
//------------------------------------------------------------------------------
    public void setL(double l) {
        this.l = l;
    }
}
