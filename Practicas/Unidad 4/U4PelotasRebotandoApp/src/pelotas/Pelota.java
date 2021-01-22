/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                       Clase Pelota que permite dibujar una pelota en un Frame.
:*        
:*  Archivo     : Pelota.java
:*  Autor       : Félix Gerardo Martínez Hinojo     17130800
:*  Fecha       : 13/ENE/2021
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripci�n : Clase Java con la parte lógica programada de la Pelota creada mediante Hilos.
:*
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  13/ENE/2021 Félix Mtz       Se añadió el prologo.
:*------------------------------------------------------------------------------------------*/
package pelotas;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

// ----------------------------------------------------------------------------
public class Pelota extends Thread {
    
    private JPanel          jpnMarcoPelota;
    int                     x;
    int                     y;
    int                     ancho, alto;
    int                     despX, despY;
    int                     periodo;
    boolean                 seguirRebotando = true;
    private Graphics        lienzo;
    
    // ----------------------------------------------------------------------------
    // Constructor de la clase Pelota que recibe el contexto del Panel.
    public Pelota ( JPanel jpnMarcoPelota ) {
        super ();
        this.jpnMarcoPelota = jpnMarcoPelota;
        lienzo  =   jpnMarcoPelota.getGraphics ();
        ancho   =   jpnMarcoPelota.getWidth   ();
        alto    =   jpnMarcoPelota.getHeight  ();
        x       =   ancho / 2;
        y       =   alto / 2;
        despX   =   1 + ( int ) ( Math.random () * 7 );
        despY   =   1 + ( int ) ( Math.random () * 3 );
        periodo =   10 + ( int ) ( Math.random() * 40 ); 
    }
    
    // ----------------------------------------------------------------------------
    // Método run () que pone en marcha los hilos para las pelotas.
    @Override
    public void run () {
        while ( seguirRebotando ) {
            mover   ();
            rebotar ();
            limpiar ();
            dibujar ();
            pausa   ();
        }
    }
    // ----------------------------------------------------------------------------
    // Método mover () que mueve las pelotas de una posición a otra.
    private void mover () {
        x += despX;
        y += despY;
    }
    // ----------------------------------------------------------------------------
    // Método rebotar () que rebota las pelotas al llegar a las posiciones 0,0 del panel.
    private void rebotar () {
        if ( x <= 0 || x >= ancho ) {
            despX *= -1;
        }
        
        if ( y <= 0 || y >= alto ) {
            despY *= -1;
        }
    }
    // ----------------------------------------------------------------------------
    // Método limpiar () que rellena espacio rectangular en blanco para limpiar el panel de tal forma
    // que el rastro de la pelota sea eliminado del panel.
    private void limpiar () {
        lienzo.setColor ( Color.white );
        lienzo.fillRect ( 0, 0, ancho, alto );
    }
    // ----------------------------------------------------------------------------
    // Método dibujar () que se encarga de dibujar o pintar la pelota dentro del panel.
    private void dibujar () {
        lienzo.setColor ( Color.red );
        lienzo.fillOval ( x, y, 20, 20 );
    }
    // ----------------------------------------------------------------------------
    // Método pausa () que pone pausa al movimiento de la pelota dibujada en el panel.
    private void pausa () {
        try {
            Thread.sleep ( periodo );
        } catch (InterruptedException ex) {
            Logger.getLogger ( Pelota.class.getName () ).log ( Level.SEVERE, null, ex );
        }
    }
    
}
