/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                               Clase DatosModificadosEvent 
:*        
:*  Archivo     : DatosModificadosEvent.java
:*  Autor       : Félix Gerardo Martínez Hinojo 17130800
:*  Fecha       : 26/NOV/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripcion : Eventos y propiedades para el Listener que escucha el metodo datosModificadosPrisma(). El cual contiene los getters/ setters 
:*              necesarios para accesar a la data y modificarla.
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
public class DatosModificadosEvent {
    
    private double antC1;
    private double antC2;
    private double antAltura;
    
    private double nvoC1;
    private double nvoC2;
    private double nvoAltura;
    
    // Rect
    private double antLargo;
    private double antAncho;
    private double antAltoR;
    
    private double nvoLargo;
    private double nvoAncho;
    private double nvoAltoR;
    
    // Cilindro
    private double antRadio;
    private double antAlto;
    
    private double nvoRadio;
    private double nvoAlto;

    

    public DatosModificadosEvent() {
        
    }
    
    

    public DatosModificadosEvent ( double antC1, double antC2, double antAltura, double nvoC1, double nvoC2, double nvoAltura ) {
        this.antC1 = antC1;
        this.antC2 = antC2;
        this.antAltura = antAltura;
        this.nvoC1 = nvoC1;
        this.nvoC2 = nvoC2;
        this.nvoAltura = nvoAltura;
    }
    
    public DatosModificadosEvent ( double antLargo, double antAncho, double antAltoR, double nvoLargo, double nvoAncho, double nvoAltoR, String cad ) {
        this.antLargo = antLargo;
        this.antAncho = antAncho;
        this.antAltoR = antAltoR;
        this.nvoLargo = nvoLargo;
        this.nvoAncho = nvoAncho;
        this.nvoAltoR = nvoAltoR;
    }

    public DatosModificadosEvent ( double antRadio, double antAlto, double nvoRadio, double nvoAlto ) {
        
        this.antRadio = antRadio;
        this.antAlto = antAlto;
        
        this.nvoRadio = nvoRadio;
        this.nvoAlto = nvoAlto;
        
    }
    
    
    
//    public DatosModificadosEvent( double antLargo, double antAncho, double antAlto, double nvoLargo, double nvoAncho, double nvoAlto ) {
//        this.antLargo = antLargo;
//        this.antAncho = antAncho;
//        this.antAlto = antAlto;
//        this.nvoLargo = nvoLargo;
//        this.nvoAncho = nvoAncho;
//        this.nvoAlto = nvoAlto;
//    }
    
    

    public double getAntC1() {
        return antC1;
    }

    public void setAntC1(double antC1) {
        this.antC1 = antC1;
    }

    public double getAntC2() {
        return antC2;
    }

    public void setAntC2(double antC2) {
        this.antC2 = antC2;
    }

    public double getAntAltura() {
        return antAltura;
    }

    public void setAntAltura(double antAltura) {
        this.antAltura = antAltura;
    }

    public double getNvoC1() {
        return nvoC1;
    }

    public void setNvoC1(double nvoC1) {
        this.nvoC1 = nvoC1;
    }

    public double getNvoC2() {
        return nvoC2;
    }

    public void setNvoC2(double nvoC2) {
        this.nvoC2 = nvoC2;
    }

    public double getNvoAltura() {
        return nvoAltura;
    }

    public void setNvoAltura(double nvoAltura) {
        this.nvoAltura = nvoAltura;
    }

    public double getAntRadio() {
        return antRadio;
    }

    public void setAntRadio(double antRadio) {
        this.antRadio = antRadio;
    }

    public double getAntAlto() {
        return antAlto;
    }

    public void setAntAlto(double antAlto) {
        this.antAlto = antAlto;
    }

    public double getNvoRadio() {
        return nvoRadio;
    }

    public void setNvoRadio(double nvoRadio) {
        this.nvoRadio = nvoRadio;
    }

    public double getNvoAlto() {
        return nvoAlto;
    }

    public void setNvoAlto(double nvoAlto) {
        this.nvoAlto = nvoAlto;
    }
    
    
    // Rect 

    public double getAntLargo() {
        return antLargo;
    }

    public void setAntLargo(double antLargo) {
        this.antLargo = antLargo;
    }

    public double getAntAncho() {
        return antAncho;
    }

    public void setAntAncho(double antAncho) {
        this.antAncho = antAncho;
    }

    public double getAntAltoR() {
        return antAltoR;
    }

    public void setAntAltoR(double antAltoR) {
        this.antAltoR = antAltoR;
    }

    public double getNvoLargo() {
        return nvoLargo;
    }

    public void setNvoLargo(double nvoLargo) {
        this.nvoLargo = nvoLargo;
    }

    public double getNvoAncho() {
        return nvoAncho;
    }

    public void setNvoAncho(double nvoAncho) {
        this.nvoAncho = nvoAncho;
    }

    public double getNvoAltoR() {
        return nvoAltoR;
    }

    public void setNvoAltoR(double nvoAltoR) {
        this.nvoAltoR = nvoAltoR;
    }

    
    
    
    
}
