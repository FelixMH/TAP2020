/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                       Dialogo que permite añadir y Editar información referente a los alumnos.
:*        
:*  Archivo     : Modulo1EditarDialog.java
:*  Autor       : Félix Gerardo Martínez Hinojo     17130800
:*  Fecha       : 01/DIC/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripci�n : Dialogo que permite manejar la información de los Alumnos, tales como:
:*                
                    - Matricula
                    - Nombre
                    - Apellidos
                    - Edad
                    - Promedio
                  a traves de su clase pertinente.
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  09/DIC/2020 Félix Mtz       Se añadió el dialog al proyecto y se le dió la definición básica..
    09/DIC/2020 Félix Mtz       Se añadieron los metodos pertinentes para acceder a la información.
    11/DIC/2020 Félix Mtz       Se corrigieron errores que evitaban que se añadiera información, como un valor no actualizado.
:*------------------------------------------------------------------------------------------*/
package app;

import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Modelo1;
import mx.tecnm.itl.jdbc.EjecutorSQL;


public class Modulo1EditarDialog extends javax.swing.JDialog {

        private PrincipalFrame      frmPrincipal;
        private Modelo1             modelo;
        private String              accion;
        private Vector<String>      vecTiposColumnas;
        private String              sql;
        
    // ---------------------------------------------------------------------------------
    public Modulo1EditarDialog ( java.awt.Frame parent, Modelo1 modelo ) {
        super ( parent, true );
        initComponents();
        
        frmPrincipal        = ( PrincipalFrame ) parent;
        this.modelo         = modelo;
        vecTiposColumnas    = frmPrincipal.getVecTiposColumnas ();
        
//        accion = ( modelo == null ) ? PrincipalFrame.NUEVO : PrincipalFrame.EDITAR;
        if ( modelo == null )
            accion = PrincipalFrame.NUEVO;
        else
            accion = PrincipalFrame.EDITAR;
        
        setTitle ( accion );
        
        inicializarFormulario ();
    }
    // ---------------------------------------------------------------------------------
    private void inicializarFormulario () {
        if ( accion.equals ( PrincipalFrame.NUEVO ) ) {
            jtxfMatricula.requestFocus ();
        } else if ( accion.equals ( PrincipalFrame.EDITAR ) ) {
            jtxfMatricula.setText   ( modelo.getMatricula   () );
            jtxfNombre.setText      ( modelo.getNombre      () );
            jtxfApellidos.setText   ( modelo.getApellidos   () );
            jspnEdad.setValue       ( modelo.getEdad        () );
            jftxfPromedio.setText   ( modelo.getPromedio    () + "" );
            
            jtxfNombre.requestFocus     ();
            jtxfMatricula.setEditable   ( false );
        }
    }
    // ---------------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxfMatricula = new javax.swing.JTextField();
        jtxfNombre = new javax.swing.JTextField();
        jtxfApellidos = new javax.swing.JTextField();
        jspnEdad = new javax.swing.JSpinner();
        jftxfPromedio = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jbtnGuardar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Matricula:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Edad:");

        jLabel5.setText("Promedio:");

        jftxfPromedio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jftxfPromedio.setText("0.0");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/book_96px.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jftxfPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jbtnGuardar)
                                .addGap(99, 99, 99)
                                .addComponent(jbtnCancelar)))
                        .addContainerGap(194, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jspnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtxfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jspnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jftxfPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGuardar)
                    .addComponent(jbtnCancelar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        dispose ();
    }//GEN-LAST:event_jbtnCancelarActionPerformed
// ---------------------------------------------------------------------------------
    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        Object[][] args =   null;
        String mensaje  =   "";
        
        if ( validarDatos () == false )
            return;
        
        // Se determina cual sentencia SQL se utilizará y se forma la matriz de argumentos
        if ( accion.equals ( PrincipalFrame.NUEVO ) ) {
            mensaje = "El registro ha sido agregado.";
            sql = frmPrincipal.getPropConsultasSQL().getProperty ( PrincipalFrame.ALUMNOS_INSERTA_NUEVO );
            
            args = new Object[][] {
                { vecTiposColumnas.elementAt ( 0 ), modelo.getMatricula () },
                { vecTiposColumnas.elementAt ( 1 ), modelo.getNombre    () },
                { vecTiposColumnas.elementAt ( 2 ), modelo.getApellidos () },
                { vecTiposColumnas.elementAt ( 3 ), modelo.getEdad      () },
                { vecTiposColumnas.elementAt ( 4 ), modelo.getPromedio  () }
            };
        } else if ( accion.equals ( PrincipalFrame.EDITAR ) ) {
            mensaje = "El registro ha sido modificado.";
            sql = frmPrincipal.getPropConsultasSQL().getProperty ( PrincipalFrame.ALUMNOS_ACTUALIZA_DATOS );
            args = new Object [][] {
                { vecTiposColumnas.elementAt ( 1 ), modelo.getNombre    () },
                { vecTiposColumnas.elementAt ( 2 ), modelo.getApellidos () },
                { vecTiposColumnas.elementAt ( 3 ), modelo.getEdad      () },
                { vecTiposColumnas.elementAt ( 4 ), modelo.getPromedio  () },
                { vecTiposColumnas.elementAt ( 0 ), modelo.getMatricula () }
            };
        }
        
            try {
                int regs = EjecutorSQL.sqlEjecutar ( sql, args );
                if ( regs == 1 ) {
                    frmPrincipal.getJbtnModulo1().doClick ();
                    JOptionPane.showMessageDialog( this, 
                        mensaje, 
                        accion, 
                        JOptionPane.INFORMATION_MESSAGE );
                }
            } catch ( SQLException ex ) {
                dialogoMensaje ( ex.toString () );
            }
            
            dispose ();
        
    }//GEN-LAST:event_jbtnGuardarActionPerformed
    // ---------------------------------------------------------------------------------
    private boolean validarDatos () {
        String matricula = jtxfMatricula.getText ();
        if ( matricula.trim().equals ( "" ) ) {
            dialogoMensaje ( "No se permite un valor en blanco" );
            jtxfMatricula.requestFocus ();
            return false;
        }
        
        String nombre = jtxfNombre.getText ();
        if ( nombre.trim().equals ( "" ) ) {
            dialogoMensaje ( "No se permite un valor en blanco" );
            jtxfNombre.requestFocus ();
            return false;
        }
        
        String apellidos = jtxfApellidos.getText ();
        if ( apellidos.trim().equals ( "" ) ) {
            dialogoMensaje ( "No se permite un valor en blanco" );
            jtxfApellidos.requestFocus ();
            return false;
        }
        
        int edad = 0;
        try {
            edad = Integer.parseInt ( jspnEdad.getValue().toString () );
        } catch ( NumberFormatException e ) {
            dialogoMensaje ( "Debe capturar un valor númerico válido" );
            jspnEdad.requestFocus ();
            return false;
        }
        
        float promedio;
        try {
            promedio = Float.parseFloat ( jftxfPromedio.getText () );
        } catch ( NumberFormatException e ) {
            dialogoMensaje ( "Debe capturar un valor númerico válido" );
            jspnEdad.requestFocus ();
            return false;
        }
        
        modelo = new Modelo1 ( matricula, nombre, apellidos, edad, promedio );
        return true;
    }
    // ---------------------------------------------------------------------------------
    private void dialogoMensaje ( String mensaje ) {
        JOptionPane.showMessageDialog( this, mensaje, "Error", JOptionPane.ERROR_MESSAGE );
    }
    // ---------------------------------------------------------------------------------
    
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
            java.util.logging.Logger.getLogger(Modulo1EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modulo1EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modulo1EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modulo1EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Modulo1EditarDialog dialog = new Modulo1EditarDialog(new javax.swing.JFrame(), null );
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JFormattedTextField jftxfPromedio;
    private javax.swing.JSpinner jspnEdad;
    private javax.swing.JTextField jtxfApellidos;
    private javax.swing.JTextField jtxfMatricula;
    private javax.swing.JTextField jtxfNombre;
    // End of variables declaration//GEN-END:variables
}
