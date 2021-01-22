/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                       Clase que permite dar formato a todo lo relacionado con el Alumno.
:*        
:*  Archivo     : Alumno.java
:*  Autor       : Félix Gerardo Martínez Hinojo     17130800
:*  Fecha       : 01/DIC/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripci�n : Clase que permite manejar la información de los Alumnos tales como:
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
    07/DIC/2020 Félix Mtz       Se añadieron los metodos pertinentes para acceder a la información.
:*------------------------------------------------------------------------------------------*/
package modelo;


public class Alumno {

    private String  matricula;
    private String  nombre;
    private String  apellidos;
    private int     edad;
    private float   promedio;
    
    // ---------------------------------------------------------------------------------
    public Alumno ( String matricula, String nombre, String apellidos, int edad, float promedio ) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.promedio = promedio;
    }
    // ---------------------------------------------------------------------------------
    public String getMatricula() {
        return matricula;
    }
    // ---------------------------------------------------------------------------------
    public void setMatricula ( String matricula ) {
        this.matricula = matricula;
    }
    // ---------------------------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }
    // ---------------------------------------------------------------------------------
    public void setNombre ( String nombre ) {
        this.nombre = nombre;
    }
    // ---------------------------------------------------------------------------------
    public String getApellidos() {
        return apellidos;
    }
    // ---------------------------------------------------------------------------------
    public void setApellidos ( String apellidos ) {
        this.apellidos = apellidos;
    }
    // ---------------------------------------------------------------------------------
    public int getEdad() {
        return edad;
    }
    // ---------------------------------------------------------------------------------
    public void setEdad (int edad ) {
        this.edad = edad;
    }
    // ---------------------------------------------------------------------------------
    public float getPromedio() {
        return promedio;
    }
    // ---------------------------------------------------------------------------------
    public void setPromedio ( float promedio ) {
        this.promedio = promedio;
    }
    // ---------------------------------------------------------------------------------
    
    @Override
    public String toString () {
        return nombre + " " + apellidos;
    } 
    
    
}
