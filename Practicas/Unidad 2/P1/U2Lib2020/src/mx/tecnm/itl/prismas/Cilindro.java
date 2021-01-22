/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                               Clase Cilindro 
:*        
:*  Archivo     : Cilindro.java
:*  Autor       : Félix Gerardo Martínez Hinojo 17130800
:*  Fecha       : 20/OCT/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripcion : Esta clase cilindro sirve para calcular el area de sus diferentes lados y volumen
:*                
:*  Ultima modif: 
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  20/OCT/2020 Félix Mtz           Agregar prologo.
:*------------------------------------------------------------------------------------------*/
package mx.tecnm.itl.prismas;

import mx.tecnm.itl.figuras.*;

public class Cilindro extends Prisma {
    private double radio;
    private double altura;
    private Circulo baseInf;
    private Circulo baseSup;
    private Rectangulo cuerpo;
    
    //--------------------------------------------------------------------------
    
    public Cilindro(){        
        radio = 0;
        altura = 0;
        baseInf = new Circulo();
        baseSup = new Circulo();
        cuerpo = new Rectangulo();
    }
    
    //--------------------------------------------------------------------------
    
    public Cilindro(double radio, double altura){
        this.altura = altura;
        this.radio = radio;
        baseInf = new Circulo(radio);
        baseSup = new Circulo(radio);
        cuerpo = new Rectangulo( baseInf.circunferencia(), altura);
    }
    
    //--------------------------------------------------------------------------
    
    public double areaBase(){
        return baseInf.area();
    }
    
    //--------------------------------------------------------------------------
    
    public double areaLateral (){
        return cuerpo.area ();
    }
    
    //--------------------------------------------------------------------------
    
    public double areaTotal (){
        return ( baseInf.area () + baseSup.area () + cuerpo.area () );
    }
    
    //--------------------------------------------------------------------------
    
    public double volumen (){
        return baseInf.area () * altura;
    }
    
    //--------------------------------------------------------------------------
    
    public String toString (){
        return "Cilindro De Radio= "+radio+"altura = "+altura;
    }
    
    //--------------------------------------------------------------------------

    public double getRadio () {
        return radio;
    }
    
    //--------------------------------------------------------------------------

    public void setRadio ( double radio ) {
        this.radio = radio;
        baseInf.setRadio ( radio );
        baseSup.setRadio ( radio );        
        cuerpo.setA ( baseInf.circunferencia () );
    }
    
    //--------------------------------------------------------------------------

    public double getAltura () {
        return altura;
    }
    
    //--------------------------------------------------------------------------

    public void setAltura ( double altura ) {
        this.altura = altura;
        cuerpo.setL ( altura );
    }
}
