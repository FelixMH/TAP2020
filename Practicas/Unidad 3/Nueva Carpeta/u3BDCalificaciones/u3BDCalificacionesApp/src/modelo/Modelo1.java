/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                       Clase Modelo para Alumnos
:*        
:*  Archivo     : Modelo1.java
:*  Autor       : Félix Gerardo Martínez Hinojo     17130800
:*  Fecha       : 01/DIC/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripci�n : Clase que permite manejar la información de los Alumnos, el modelo de datos de los Alumnos
:*                
                    - Matricula
                    - Nombre
                    - Apellidos
                    - Edad
                    - Promedio
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  07/DIC/2020 Félix Mtz       Se añadió la clase al proyecto y se le dió la definición básica..
:*------------------------------------------------------------------------------------------*/
package modelo;

public class Modelo1 extends Alumno {
    
    public Modelo1 ( String matricula, String nombre, String apellidos, int edad, float promedio ) {
        super ( matricula, nombre, apellidos, edad, promedio );
    }
    
    
    
}
