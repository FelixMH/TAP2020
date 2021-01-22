/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*              Clase que contiene metodos y propiedades de un circulo.
:*        
:*  Archivo     : Circulo.java
:*  Autor       : Félix Gerardo Martínez Hinojo 17130800
:*  Fecha       : 18/OCT/2020
:*  Compilador  : JAVA J2SE v1.8.2
:*  Descripci�n : La clase Circulo tiene solo un atributo que es el radio y  
:*                extiende de la clase abstracta Figura, tiene 4 metodos para
:*                calcular el diametro,circunferencia,area,perimetro.
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  18/OCT/2020 FélixMtz            Agregar Prólogo.
:*------------------------------------------------------------------------------------------*/
package Prismas;


public class Circulo{
    private double radio;
    
//------------------------------------------------------------------------------
    
    public Circulo(){
        radio = 0.0;
    }
    
//------------------------------------------------------------------------------    
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
//------------------------------------------------------------------------------    
    
    public double diametro(){
        return radio*2;
    }
    
//------------------------------------------------------------------------------    
    
    public double circunferencia(){
        return Math.PI*diametro();
    }
    
//------------------------------------------------------------------------------
    
    public double area() {
        return Math.PI*Math.pow(radio, 2);
    }
    
//------------------------------------------------------------------------------    
    
    public double perimetro() {
        return circunferencia();
    }
    
//------------------------------------------------------------------------------    

    public double getRadio() {
        return radio;
    }
    
//------------------------------------------------------------------------------    

    public void setRadio(double radio) {
        this.radio = radio;
    }            
}
