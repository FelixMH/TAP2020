/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                               Clase DatosPrismaRectangular 
:*        
:*  Archivo     : DatosPrismaRectangular.java
:*  Autor       : Félix Gerardo Martínez Hinojo 17130800
:*  Fecha       : 26/NOV/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripcion : Este es un bean para los datos del JPrismaRectangular el cual manda esos datos capturados al bean que contiene el frame.
:*                
:*  Ultima modif: 
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  26/NOV/2020 Félix Mtz           Agregar prologo.
:*------------------------------------------------------------------------------------------*/
package mx.tecnm.itl.beans;

import java.awt.Frame;
import javax.swing.JOptionPane;

/**
 *
 * @author FélixMtz
 */
public class DatosPrismaRectangular extends javax.swing.JDialog {

    private JPrismaRectangular parent;
    
    public DatosPrismaRectangular( JPrismaRectangular parent, boolean modal ) {
        super ( new Frame(), modal);
        initComponents();
        
        // conservamos la referencia a la vista
        this.parent = parent;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAlto = new javax.swing.JLabel();
        jLabelAncho = new javax.swing.JLabel();
        jLabelLargo = new javax.swing.JLabel();
        jbtnAceptar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jtxfLargo = new javax.swing.JTextField();
        jtxfAncho = new javax.swing.JTextField();
        jtxfAlto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabelAlto.setText("Alto");

        jLabelAncho.setText("Ancho");

        jLabelLargo.setText("Largo");

        jbtnAceptar.setText("Aceptar");
        jbtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAceptarActionPerformed(evt);
            }
        });

        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelAncho)
                                .addComponent(jLabelLargo))
                            .addComponent(jLabelAlto))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxfLargo)
                            .addComponent(jtxfAncho)
                            .addComponent(jtxfAlto, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jbtnAceptar)
                        .addGap(71, 71, 71)
                        .addComponent(jbtnCancelar)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLargo)
                    .addComponent(jtxfLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAncho)
                    .addComponent(jtxfAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAlto)
                    .addComponent(jtxfAlto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAceptar)
                    .addComponent(jbtnCancelar))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAceptarActionPerformed
        double largo, ancho, alto;
        
        // Convertimos a númerico el valor del Largo.
        try {
            largo = Double.parseDouble ( jtxfLargo.getText() );
        } catch ( NumberFormatException e) {
            JOptionPane.showMessageDialog (
                    this,
                    "Debe capturar un valor númerico para el Radio",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
            jtxfLargo.requestFocus ();
            return;
        }
        
        // Convertimos a númerico el valor del Ancho.
        try {
            ancho = Double.parseDouble ( jtxfAncho.getText() );
        } catch ( NumberFormatException e) {
            JOptionPane.showMessageDialog (
                    this,
                    "Debe capturar un valor númerico para el Radio",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
            jtxfAncho.requestFocus ();
            return;
        }
        
        try {
            alto = Double.parseDouble ( jtxfAlto.getText() );
        } catch ( NumberFormatException e) {
            JOptionPane.showMessageDialog (
                    this,
                    "Debe capturar un valor númerico para el Radio",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
            jtxfAlto.requestFocus ();
            return;
        }
        
        // Creamos el EventObject que servirá para modificar el evento datosModificados
        DatosModificadosEvent ev = new DatosModificadosEvent ( parent.getLargo (), parent.getAncho (), parent.getAlto (), largo, ancho, alto, "" );
        
        
        // Establecer el radio y altura capturados en la vista y el modelo.
        parent.setLargo ( largo );
        parent.setAncho ( ancho );
        parent.setAlto ( alto );
        setVisible ( false );
        
        // disparar el evento DatosModificados
        parent.fireDatosModificadosEvent ( ev );
        
    }//GEN-LAST:event_jbtnAceptarActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        this.setVisible ( false );
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Inicializamos los valores de los textFields desde la vista.
        jtxfLargo.setText ( parent.getLargo()+ "" );
        jtxfAncho.setText ( parent.getAncho ()+ "" );
        jtxfAlto.setText ( parent.getAlto ()+ "" );
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DatosPrismaRectangular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DatosPrismaRectangular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DatosPrismaRectangular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DatosPrismaRectangular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        </editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                DatosPrismaRectangular dialog = new DatosPrismaRectangular(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAlto;
    private javax.swing.JLabel jLabelAncho;
    private javax.swing.JLabel jLabelLargo;
    private javax.swing.JButton jbtnAceptar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JTextField jtxfAlto;
    private javax.swing.JTextField jtxfAncho;
    private javax.swing.JTextField jtxfLargo;
    // End of variables declaration//GEN-END:variables

}
