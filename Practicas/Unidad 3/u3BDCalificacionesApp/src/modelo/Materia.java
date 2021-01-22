/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                       Clase que permite dar formato a todo lo relacionado con la materia.
:*        
:*  Archivo     : Materia.java
:*  Autor       : Félix Gerardo Martínez Hinojo     17130800
:*  Fecha       : 01/DIC/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripci�n : Clase que permite manejar la información de las materias tales como:
:*                
                    - ID Materia
                    - Materia
                    - Creditos
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  07/DIC/2020 Félix Mtz       Se añadió la clase al proyecto y se le dió la definición básica..
    07/DIC/2020 Félix Mtz       Se añadieron los metodos pertinentes para acceder a la información.
:*------------------------------------------------------------------------------------------*/
package modelo;

public class Materia {

    private String  idmateria;
    private String  materia;
    private int     creditos;
    
    // ---------------------------------------------------------------------------------
    public Materia ( String idmateria, String materia, int creditos ) {
        this.idmateria = idmateria;
        this.materia = materia;
        this.creditos = creditos;
    }
    // ---------------------------------------------------------------------------------
    public String getIdmateria() {
        return idmateria;
    }
    // ---------------------------------------------------------------------------------
    public void setIdmateria ( String idmateria ) {
        this.idmateria = idmateria;
    }
    // ---------------------------------------------------------------------------------
    public String getMateria() {
        return materia;
    }
    // ---------------------------------------------------------------------------------
    public void setMateria ( String materia ) {
        this.materia = materia;
    }
    // ---------------------------------------------------------------------------------
    public int getCreditos() {
        return creditos;
    }
    // ---------------------------------------------------------------------------------
    public void setCreditos ( int creditos ) {
        this.creditos = creditos;
    }
    
    // ---------------------------------------------------------------------------------
    @Override
    public String toString () {
        return materia + "";
    }
                 
}


