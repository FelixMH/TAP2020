/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*              Clase que contiene metodos para un Prisma.
:*        
:*  Archivo     : Prisma.java
:*  Autor       : Félix Gerardo Martínez Hinojo 17130800
:*  Fecha       : 22/OCT/2020
:*  Compilador  : JAVA J2SE v1.8.2
:*  Descripci�n : La clase Prisma tiene solo cuatro metodos universales llamados areaBase (), areaLateral ()
                  areaTotal (), volumen ()
:*                
:*                
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  22/oct/2020 FélixMtz            se agregó prologo.
:*------------------------------------------------------------------------------------------*/
package mx.tecnm.itl.prismas;


public abstract class Prisma {
    
    public abstract double areaBase ();
    public abstract double areaLateral ();
    public abstract double areaTotal ();
    public abstract double volumen ();
    
}
