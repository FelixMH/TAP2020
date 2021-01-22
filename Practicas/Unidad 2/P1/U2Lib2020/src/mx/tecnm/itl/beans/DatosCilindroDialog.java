/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                               Clase DatosCilindroDialog 
:*        
:*  Archivo     : DatosCilindroDialog.java
:*  Autor       : Félix Gerardo Martínez Hinojo 17130800
:*  Fecha       : 26/NOV/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripcion : Esta clase escucha el manejador de eventos para modificar la data, pero a su vez se encarga de accesar a la data del bean JCilindro.
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
public class DatosCilindroDialog extends javax.swing.JDialog {

    
    private JCilindro parent;
    
    
    public DatosCilindroDialog( JCilindro parent, boolean modal) {
        super ( new Frame (), modal );
        initComponents();
        
        // conservamos la referencia a la vista.
        this.parent = parent;
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxfRadio = new javax.swing.JTextField();
        jtxfAltura = new javax.swing.JTextField();
        jbtnAceptar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();

        setTitle("Datos del Cilindro");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Radio ( r )");

        jLabel2.setText("Altura ( h )");

        jtxfRadio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jtxfAltura.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

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
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxfRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jbtnAceptar)
                        .addGap(119, 119, 119)
                        .addComponent(jbtnCancelar)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxfRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAceptar)
                    .addComponent(jbtnCancelar))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        this.setVisible( false );
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAceptarActionPerformed
        double radio, altura;
        
        // Convertimos a númerico el valor del Radio.
        try {
            radio = Double.parseDouble ( jtxfRadio.getText() );
        } catch ( NumberFormatException e) {
            JOptionPane.showMessageDialog (
                    this,
                    "Debe capturar un valor númerico para el Radio",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
            jtxfRadio.requestFocus ();
            return;
        }
        
        // Convertimos a númerico el valor de la altura.
        try {
            altura = Double.parseDouble ( jtxfAltura.getText() );
        } catch ( NumberFormatException e) {
            JOptionPane.showMessageDialog (
                    this,
                    "Debe capturar un valor númerico para el Radio",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
            jtxfAltura.requestFocus ();
            return;
        }
        
        // Creamos el EventObject que servirá para modificar el evento datosModificados
        DatosModificadosEvent ev = new DatosModificadosEvent ( parent.getRadio (), parent.getAltura (), radio, altura );
        
        // Establecer el radio y altura capturados en la vista y el modelo.
        parent.setRadio ( radio );
        parent.setAltura ( altura );
        setVisible ( false );
        
        // disparar el evento DatosModificados
        parent.fireDatosModificadosEvent ( ev );
        
    }//GEN-LAST:event_jbtnAceptarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Inicializamos los valores de los textFields desde la vista.
        jtxfRadio.setText ( parent.getRadio () + "" );
        jtxfAltura.setText ( parent.getAltura ()+ "" );
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
//            java.util.logging.Logger.getLogger(DatosCilindroDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DatosCilindroDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DatosCilindroDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DatosCilindroDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                DatosCilindroDialog dialog = new DatosCilindroDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtnAceptar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JTextField jtxfAltura;
    private javax.swing.JTextField jtxfRadio;
    // End of variables declaration//GEN-END:variables
}
