/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                       Clase Globo que permite dibujar un globo en un Frame y/o Panel.
:*        
:*  Archivo     : Globo.java
:*  Autor       : Félix Gerardo Martínez Hinojo     17130800
:*  Fecha       : 14/ENE/2021
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripci�n : Clase Globo con la parte lógica programada de los globos creados mediante Hilos.
:*
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  14/ENE/2021 Félix Mtz       Se añadió el prologo.
:*------------------------------------------------------------------------------------------*/
package globos;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

// ----------------------------------------------------------------------------
public class Globo extends Thread {
    GlobosFrame parent;
    Color       color;
    int         radioInicial;
    int         radioActual;
    int         periodoSleep;
    int         x;
    int         y;
    boolean     creciendo;
    
    // Constructor de la clase Globo para dibujarlo en el frame.
    public Globo ( GlobosFrame parent, Color color, int radioInicial, int periodoSleep, int x , int y ) {
        this.parent         =   parent;
        this.color          =   color;
        this.radioInicial   =   radioInicial;
        this.radioActual    =   radioInicial;
        this.periodoSleep   =   periodoSleep;
        this.x              =   x;
        this.y              =   y;
        this.creciendo      =   ( Math.random() > 0.5 ) ? true : false;
    }
    
    // ----------------------------------------------------------------------------
    // Método run () que poner a ejecutar el Hilo.
    @Override
    public void run () {
        while ( true ) {
            if ( creciendo )
                radioActual++;
            else
                radioActual--;
            
            if ( radioActual < 5 || radioActual >= radioInicial * 2 )
                creciendo = !creciendo;
            
            parent.repaint ();
            
            try {
                Thread.sleep ( periodoSleep );
            } catch ( InterruptedException ex ) {
                System.out.println ( ex.getMessage () );
            }
        }
    }
    // ----------------------------------------------------------------------------
    // Método dibujar () que realiza el pintado del globo en el frame.
    public void dibujar ( Graphics g ) {
        g.setColor ( color );
        g.fillOval ( x - radioActual, y - radioActual, 2 * radioActual, 2 * radioActual );
    }
}
