/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                       Clase que permite dar formato a todo lo relacionado con el Kardex del Alumno.
:*        
:*  Archivo     : Kardex.java
:*  Autor       : Félix Gerardo Martínez Hinojo     17130800
:*  Fecha       : 01/DIC/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripci�n : Clase que permite manejar la información de los Alumnos A traves del Kardex:
:*                
                    - Matricula
                    - Nombre
                    - Apellidos
                    - Edad
                    - Promedio
                    - Entre otras como las materias pertenecientes al alumno y demás.
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  07/DIC/2020 Félix Mtz       Se añadió la clase al proyecto y se le dió la definición básica..
    07/DIC/2020 Félix Mtz       Se añadieron los metodos pertinentes para acceder a la información.
:*------------------------------------------------------------------------------------------*/
package modelo;

public class Kardex {
    
    private int     idcalific;
    private String  matricula;
    private String  idmateria;
    private String  periodo;
    private int     calificacion;

    // ---------------------------------------------------------------------------------
    public Kardex ( int idcalific, String matricula, String idmateria, String periodo, int calificacion ) {
        this.idcalific = idcalific;
        this.matricula = matricula;
        this.idmateria = idmateria;
        this.periodo = periodo;
        this.calificacion = calificacion;
    }
    // ---------------------------------------------------------------------------------
    public int getIdcalific() {
        return idcalific;
    }
    // ---------------------------------------------------------------------------------
    public void setIdcalific ( int idcalific ) {
        this.idcalific = idcalific;
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
    public String getIdmateria() {
        return idmateria;
    }
    // ---------------------------------------------------------------------------------
    public void setIdmateria ( String idmateria ) {
        this.idmateria = idmateria;
    }
    // ---------------------------------------------------------------------------------
    public String getPeriodo() {
        return periodo;
    }
    // ---------------------------------------------------------------------------------
    public void setPeriodo ( String periodo ) {
        this.periodo = periodo;
    }
    // ---------------------------------------------------------------------------------
    public int getCalificacion() {
        return calificacion;
    }
    // ---------------------------------------------------------------------------------
    public void setCalificacion ( int calificacion ) {
        this.calificacion = calificacion;
    }
    
    
    
}
