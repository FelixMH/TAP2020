/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                       Clase con la parte lógica programada de la carrera mediante Hilos, implementando
:*                        la interface Runnable.
:*        
:*  Archivo     : HiloFrame.java
:*  Autor       : Félix Gerardo Martínez Hinojo     17130800
:*  Fecha       : 11/ENE/2021
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripci�n : Clase con la parte lógica programada de la Carrera mediante Hilos, con la interface
                    runnable.
:*
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  11/ENE/2020 Félix Mtz       Se añadió el prologo.
:*------------------------------------------------------------------------------------------*/
package hilo.runnable;

import app.HiloFrame;
import java.awt.Frame;
import java.util.logging.Level;
import java.util.logging.Logger;

// ----------------------------------------------------------------------------
public class MiHilo implements Runnable {
    
    private String nombre = "";
    
    // Constructor por default de la clase MiHilo.
    public MiHilo() {
        
    }
    // ----------------------------------------------------------------------------
    // constructor de la clase MiHilo con el nombre del tío en carrera.
    public MiHilo ( String nombre ) {
        this.nombre = nombre;
    }
    // ----------------------------------------------------------------------------
    // Método start () que permite simular el comportamiento del método start () de la clase Thread. 
    public void start() {
        Thread thread = new Thread ( this );
        thread.start ();
    }
    // ----------------------------------------------------------------------------
    // Método getter para obtener el nombre del tío en carrera.
    public String getNombre() {
        return nombre;
    }
    // ----------------------------------------------------------------------------
    // Método setter para obtener el nombre del tío en carrera.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // ----------------------------------------------------------------------------
    // Método run () que ejecuta el Hilo.
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println( getNombre () + " = " + i );
            
            try {
                Thread.sleep ( 50 );
            } catch ( InterruptedException ex ) {
                Logger.getLogger ( MiHilo.class.getName() ).log( Level.SEVERE, null, ex );
            }
        }
    }
    
}
