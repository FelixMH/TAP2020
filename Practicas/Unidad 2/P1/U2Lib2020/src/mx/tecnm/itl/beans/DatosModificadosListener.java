/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                               Clase DatosModificadosListener 
:*        
:*  Archivo     : DatosModificadosListener.java
:*  Autor       : Félix Gerardo Martínez Hinojo 17130800
:*  Fecha       : 26/NOV/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripcion : Escuchador con el evento datosModificadosPrisma() , el cual accede a la data anterior y nueva modificandola.
:*                
:*  Ultima modif: 
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  26/NOV/2020 Félix Mtz           Agregar prologo.
:*------------------------------------------------------------------------------------------*/
package mx.tecnm.itl.beans;

/**
 *
 * @author FélixMtz
 */
public interface DatosModificadosListener {
    
    public void datosModificadosPrisma ( DatosModificadosEvent ev );
    
}
