/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                         Clase que contiene metodos.
:*        
:*  Archivo     : PrismaTriangular.java
:*  Autor       : Félix Gerardo Martínez Hinojo 17130800
:*  Fecha       : 20/OCT/2020
:*  Compilador  : JAVA J2SE v1.8.2
:*  Descripci�n : La clase PrismaTriangular contiene sus atributos y los metodos
:*                para calcular su areabase,arealateral,areatotal,volumen.
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  20/OCT/2020 Félix Mtz           Se agregó prologo.
:*------------------------------------------------------------------------------------------*/
package mx.tecnm.itl.prismas;

import mx.tecnm.itl.figuras.TrianguloRect;

public class PrismaTriangular extends Prisma {
    private double c1;
    private double c2;
    private double altura;
    private TrianguloRect bas;
//------------------------------------------------------------------------------
    public PrismaTriangular(){
        c1=0.0;
        c2=0.0;
        altura=0.0;
        bas = new TrianguloRect();
    }
//------------------------------------------------------------------------------
    public PrismaTriangular(double c1,double c2,double altura){
        this.c1=c1;
        this.c2=c2;
        this.altura=altura;
        bas = new TrianguloRect(c1,c2);   
    }
//------------------------------------------------------------------------------    
    

    public double areaBase() {
        return bas.area();
    }
//------------------------------------------------------------------------------
    

    public double areaLateral() {
        return altura*bas.perimetro();
    }
//------------------------------------------------------------------------------
    

    public double areaTotal() {
        return 2*areaBase()+areaLateral();
    }
//------------------------------------------------------------------------------
    

    public double volumen() {
        return altura*areaBase();
    }
    
//------------------------------------------------------------------------------    

    public double getC1() {
        return c1;
    }
    
//------------------------------------------------------------------------------    

    public void setC1(double c1) {
        this.c1 = c1;
    }
    
//------------------------------------------------------------------------------    

    public double getC2() {
        return c2;
    }
    
//------------------------------------------------------------------------------    

    public void setC2(double c2) {
        this.c2 = c2;
    }

//------------------------------------------------------------------------------    
    
    public double getAltura() {
        return altura;
    }
    
//------------------------------------------------------------------------------    

    public void setAltura(double altura) {
        this.altura = altura;
    } 
    
//------------------------------------------------------------------------------    

    public TrianguloRect getBas() {
        return bas;
    }
    
//------------------------------------------------------------------------------    

    public void setBas(TrianguloRect bas) {
        this.bas = bas;
    }
}
