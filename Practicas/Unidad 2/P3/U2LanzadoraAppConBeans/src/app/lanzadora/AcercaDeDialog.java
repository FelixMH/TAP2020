/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                    JFrame que implementa el bean JAcercaDe
:*        
:*  Archivo     : AcercaDeDialog.java
:*  Autor       : Felix Gerardo Martínez Hinojo 17130800
:*  Fecha       : 08/NOV/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripcion : Frame que simplemente muestra los datos de información del creador de la app.
:*                usando un bean llamado JAcercaDe.
:*  Ultima modif: 
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  08/OCT/2020 FelixMtz           se añadió el prologo.
:*------------------------------------------------------------------------------------------*/

package app.lanzadora;

import javax.swing.Icon;
import javax.swing.JLabel;
import mx.tecnm.itl.util.Imagenes;

public class AcercaDeDialog extends javax.swing.JFrame {

    public AcercaDeDialog() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButCerrar = new javax.swing.JButton();
        jAcercaDe1 = new mx.tecnm.itl.beans.jAcercaDe();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButCerrar.setText("Cerrar");
        jButCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, -1, -1));
        getContentPane().add(jAcercaDe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(AcercaDeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcercaDeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcercaDeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcercaDeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcercaDeDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private mx.tecnm.itl.beans.jAcercaDe jAcercaDe1;
    private javax.swing.JButton jButCerrar;
    // End of variables declaration//GEN-END:variables
}
