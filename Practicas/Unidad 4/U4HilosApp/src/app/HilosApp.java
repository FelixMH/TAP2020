/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                       Clase con la llamada a la parte lógica de los Hilos.
:*        
:*  Archivo     : HiloFrame.java
:*  Autor       : Félix Gerardo Martínez Hinojo     17130800
:*  Fecha       : 11/ENE/2021
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripci�n : Frame con la parte visual programada de la Carrera mediante Hilos.
:*
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  11/ENE/2020 Félix Mtz       Se añadió el prologo.
:*------------------------------------------------------------------------------------------*/
package app;

import hilo.runnable.MiHilo;

// ----------------------------------------------------------------------------
public class HilosApp {
    
    public static void main(String[] args) {
        MiHilo hilo1 = new MiHilo ( "Tio Rios" );
        MiHilo hilo2 = new MiHilo ( "Tio Oswi" );
        MiHilo hilo3 = new MiHilo ( "Ing. Ulloa" );
        

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
    // ----------------------------------------------------------------------------
}
