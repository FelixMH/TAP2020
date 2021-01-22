/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                       Clase con la parte lógica programada de la carrera mediante Hilos, la clase Thread.
:*        
:*  Archivo     : HiloFrame.java
:*  Autor       : Félix Gerardo Martínez Hinojo     17130800
:*  Fecha       : 11/ENE/2021
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripci�n : Clase con la parte lógica programada de la Carrera mediante Hilos.
:*
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  11/ENE/2020 Félix Mtz       Se añadió el prologo.
:*------------------------------------------------------------------------------------------*/
package hilo.thread;

import app.HiloFrame;
import java.util.logging.Level;
import java.util.logging.Logger;

// ----------------------------------------------------------------------------
public class MiHilo extends Thread {
    
    private HiloFrame frame;
    
    // Constructor de la clase MiHilo.
    public MiHilo() {
        super();
    }
    // ----------------------------------------------------------------------------
    // constructor MiHilo que setea el nombre del tío en carrera.
    public MiHilo ( String nombre ) {
        super ( nombre );
    }
    // ----------------------------------------------------------------------------
    // constructor con el nombre, y con el contexto del frame HiloFrame.
    public MiHilo ( String nombre, HiloFrame frame ) {
        super ( nombre );
        this.frame = frame;
    }
    // ----------------------------------------------------------------------------
    // Método run () de la clase Thread que pone en marcha el ( los ) Hilo(s).
    @Override
    public void run () {
        for (int i = 0; i <= 100; i++) {
            System.out.println( getName() + " = " + i );
            if ( frame != null )
                frame.setProgreso ( getName (), i );
            
            try {
                Thread.sleep ( 50 );
            } catch ( InterruptedException ex ) {
                Logger.getLogger( MiHilo.class.getName() ).log( Level.SEVERE, null, ex );
            }
        }
    }
    
}
