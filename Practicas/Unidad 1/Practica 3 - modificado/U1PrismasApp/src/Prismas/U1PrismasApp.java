/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                       Pantalla De Carga De La Aplicacion
:*        
:*  Archivo     : TrianguloRect.java
:*  Autor       : Félix Gerardo Martínez Hinojo 17130800
:*  Fecha       : 18/OCT/2020
:*  Compilador  : JAVA J2SE v1.8.2
:*  Descripci�n : JFrame destinado para la pantalla de carga.
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  18/OCT/2020 FélixMtz            Agregar Prólogo.
:*------------------------------------------------------------------------------------------*/
package Prismas;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

public class U1PrismasApp extends javax.swing.JFrame {
private int auxiliar=0;
private boolean realizado = false;
hilo ejecutar = new hilo();


    public U1PrismasApp() {
        initComponents();
        U1PrismasApp.this.getRootPane().setOpaque(false);        
        U1PrismasApp.this.getContentPane ().setBackground (new Color (0, 0, 0, 0));
        U1PrismasApp.this.setBackground (new Color (0, 0, 0, 0)); 
        
        this.setResizable(false);
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        Barra = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ITL.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 533, -1));

        mensaje.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mensaje.setText("Texto");
        getContentPane().add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));
        getContentPane().add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 490, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        if(realizado == false){
            realizado = true;
            Barra.setMaximum(49);
            Barra.setMinimum(0);
            Barra.setStringPainted(true);
            ejecutar.start();
        }
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(U1PrismasApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(U1PrismasApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(U1PrismasApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(U1PrismasApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new U1PrismasApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Barra;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel mensaje;
    // End of variables declaration//GEN-END:variables
    private class hilo extends Thread{
         @Override
    public void run(){
        try {while(true){
            auxiliar++;
            Barra.setValue(auxiliar);
            repaint();
            switch(auxiliar){
                case 3:
                    mensaje.setText("Cargando programa...");
                    break;
                case 20:
                    mensaje.setText("Leyendo preferencias");
                    break;
                case 50:
                    mensaje.setText("Carga finalizada");
                    PrismasFrame objeto = new PrismasFrame();
                    objeto.setVisible(true);
                    objeto.setLocationRelativeTo(U1PrismasApp.this);
                    U1PrismasApp.this.dispose();
                    break;
            }
            Thread.sleep(100);}
        } catch (InterruptedException ex) {
            Logger.getLogger(U1PrismasApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
}
