/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                         Clase que contiene metodos.
:*        
:*  Archivo     : PrismaRectangular.java
:*  Autor       : Félix Gerardo Martínez Hinojo 17130800
:*  Fecha       : 20/OCT/2020
:*  Compilador  : JAVA J2SE v1.8.2
:*  Descripci�n : La clase PrismaRectangular contiene sus atributos y los metodos
:*                para calcular su areabase,arealateral,areatotal,volumen.
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  20/OCT/2020 Félix Mtz           Se agregó prologo.
:*------------------------------------------------------------------------------------------*/
package mx.tecnm.itl.prismas;

public class PrismaRectangular extends Prisma {
    private double largo;
    private double ancho;
    private double altura;
    
//------------------------------------------------------------------------------
    
    public PrismaRectangular(){
        largo = 0.0;
        ancho = 0.0;
        altura = 0.0;
    }
    
//------------------------------------------------------------------------------
    
    public PrismaRectangular(double largo, double ancho, double altura){
        this.largo = largo;
        this.ancho = ancho;
        this.altura = altura;
    }
    
//------------------------------------------------------------------------------
        
    public double areaBase() {
        return (largo*ancho);
    }
    
//------------------------------------------------------------------------------    
    
    public double areaLateral() {
        return altura*(4*largo);
    }
    
//------------------------------------------------------------------------------   
    
    public double areaTotal() {
        return (areaBase()*2)+areaLateral();
    }
    
//------------------------------------------------------------------------------
    
    public double volumen() {
        return areaBase()*altura;
    }
    
//------------------------------------------------------------------------------    

    public double getLargo() {
        return largo;
    }
    
//------------------------------------------------------------------------------    

    public void setLargo(double largo) {
        this.largo = largo;
    }
    
//------------------------------------------------------------------------------    

    public double getAncho() {
        return ancho;
    }
    
//------------------------------------------------------------------------------    

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
//------------------------------------------------------------------------------    

    public double getAltura() {
        return altura;
    }
    
//------------------------------------------------------------------------------    

    public void setAltura(double altura) {
        this.altura = altura;
    }          
}
