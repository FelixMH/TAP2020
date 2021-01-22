/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                       Dialogo que permite añadir y Editar información referente al Kardex de los alumnos.
:*        
:*  Archivo     : Modulo3EditarDialog.java
:*  Autor       : Félix Gerardo Martínez Hinojo     17130800
:*  Fecha       : 01/DIC/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripci�n : Dialogo que permite manejar la información del Kardex de los alumnos, tales como:
:*                
                    - ID Calificacion
                    - Nombre Alumno
                    - Apellidos Alumno
                    - ID Materia
                    - Materia
                    - entre otras.
                  a traves de su clase pertinente y relaciones.
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  14/DIC/2020 Félix Mtz       Se añadió el dialog al proyecto y se le dió la definición básica..
    14/DIC/2020 Félix Mtz       Se añadieron los metodos pertinentes para acceder a la información.
    15/DIC/2020 Félix Mtz       Se corrigieron errores que evitaban que se añadiera información, como un valor no actualizado.
:*------------------------------------------------------------------------------------------*/
package app;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Modelo1;
import modelo.Modelo2;
import modelo.Modelo3;
import mx.tecnm.itl.jdbc.EjecutorSQL;
import mx.tecnm.itl.util.Imagenes;


public class Modulo3EditarDialog extends javax.swing.JDialog {

    private PrincipalFrame      frmPrincipal;
    private Modelo3             modelo;
    private String              accion;
    private Vector<String>      vecTiposColumnas;
    private String              sql;
    
    // ---------------------------------------------------------------------------------
    public Modulo3EditarDialog(java.awt.Frame parent, Modelo3 modelo ) {
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
        
//        jlblLogo.setIcon ( Imagenes.escalarImagen ( jlblLogo.getIcon (), 105, 105 ) );
        
        llenarCombo1DesdeTabla  ();
        llenarCombo2DesdeTabla  ();
        inicializarFormulario   ();
    }
    // ---------------------------------------------------------------------------------
    private void llenarCombo1DesdeTabla () {
        ResultSet   rs;
        Modelo1     modelo1;
        
        // Llenado del combo box de alumnos
        sql = frmPrincipal.getPropConsultasSQL().getProperty ( PrincipalFrame.ALUMNOS_TODOS_POR_NOMBRE );
        
        try {
            rs = EjecutorSQL.sqlQuery ( sql );
            jcboAlumno.addItem ( new Modelo1 ( "", "--Seleccione--", "", 0, 0.0f ) );
            while ( rs.next () ) {
                String matricula = rs.getString ( "matricula" );
                String nombre = rs.getString ( "nombre" );
                String apellidos = rs.getString ( "apellidos" );
                
                modelo1 = new Modelo1 ( matricula, nombre, apellidos, 0, 0.0f );
                jcboAlumno.addItem ( modelo1 );
                
                if ( modelo != null && matricula.equals ( modelo.getMatricula () ) ) {
                    int index = jcboAlumno.getModel ().getSize();
                    jcboAlumno.setSelectedIndex ( index - 1 );
                }
            }
            rs.close ();
            
        } catch ( SQLException ex ) {
            dialogoMensaje( ex.toString () );
        }
    }
    // ---------------------------------------------------------------------------------
    private void llenarCombo2DesdeTabla () {
        ResultSet   rs;
        Modelo2     modelo2;
        
        // Llenado del combo box de alumnos
        sql = frmPrincipal.getPropConsultasSQL().getProperty ( PrincipalFrame.MATERIAS_TODOS_POR_MATERIA );
        
        try {
            rs = EjecutorSQL.sqlQuery ( sql );
            jcboMateria.addItem ( new Modelo2 ( "", "--Seleccione--", 0 ) );
            while ( rs.next () ) {
                String idmateria = rs.getString ( "idmateria" );
                String materia = rs.getString   ( "materia" );
                
                modelo2 = new Modelo2 ( idmateria, materia, 0 );
                jcboMateria.addItem ( modelo2 );
                
                if ( modelo != null && idmateria.equals ( modelo.getIdmateria () ) ) {
                    int index = jcboMateria.getModel ().getSize();
                    jcboMateria.setSelectedIndex ( index - 1 );
                }
            }
            rs.close ();
            
        } catch ( SQLException ex ) {
            dialogoMensaje( ex.toString () );
        }
    }
    // ---------------------------------------------------------------------------------
    private void inicializarFormulario () {
        if ( accion.equals ( PrincipalFrame.NUEVO ) ) {
            
        } else if ( accion.equals ( PrincipalFrame.EDITAR ) ) {
            jcboPeriodo.setSelectedItem ( modelo.getPeriodo     () );
            jtxfCalific.setText ( modelo.getCalificacion () + "" );
        }
        jcboAlumno.requestFocus ();
    }
    // ---------------------------------------------------------------------------------

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtnGuardar_ = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jlblLogo = new javax.swing.JLabel();
        jcboAlumno = new javax.swing.JComboBox<>();
        jcboMateria = new javax.swing.JComboBox<>();
        jcboPeriodo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jtxfCalific = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Alumno:");

        jLabel2.setText("Materia");

        jLabel3.setText("Periodo");

        jbtnGuardar_.setText("Guardar");
        jbtnGuardar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardar_ActionPerformed(evt);
            }
        });

        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jlblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/kardex_96px_1.png"))); // NOI18N
        jlblLogo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jcboPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018A", "2018B", "2019A", "2019B", "2020A", "2020B", "2021A", "2021B", "2022A", "2022B" }));

        jLabel4.setText("Calificación");

        jtxfCalific.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jtxfCalific.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnGuardar_)
                        .addGap(95, 95, 95)
                        .addComponent(jbtnCancelar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcboPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcboMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcboAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67)
                                .addComponent(jlblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtxfCalific, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(93, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jcboAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jcboMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jcboPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jlblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxfCalific, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnCancelar)
                    .addComponent(jbtnGuardar_))
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // ---------------------------------------------------------------------------------
    private void jbtnGuardar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardar_ActionPerformed
        Object[][] args =   null;
        String mensaje  =   "";

        if ( validarDatos () == false )
        return;

        // Se determina cual sentencia SQL se utilizará y se forma la matriz de argumentos
        if ( accion.equals ( PrincipalFrame.NUEVO ) ) {
            mensaje = "El registro ha sido agregado.";
            sql = frmPrincipal.getPropConsultasSQL().getProperty ( PrincipalFrame.KARDEX_INSERTA_NUEVO );

            args = new Object[][] {
                { vecTiposColumnas.elementAt ( 0 ), modelo.getIdcalific         () },
                { vecTiposColumnas.elementAt ( 1 ), modelo.getMatricula         () },
                { vecTiposColumnas.elementAt ( 4 ), modelo.getIdmateria         () },
                { vecTiposColumnas.elementAt ( 6 ), modelo.getPeriodo           () },
                { vecTiposColumnas.elementAt ( 7 ), modelo.getCalificacion      () }
            };
        } else if ( accion.equals ( PrincipalFrame.EDITAR ) ) {
                mensaje = "El registro ha sido modificado.";
                sql = frmPrincipal.getPropConsultasSQL().getProperty ( PrincipalFrame.KARDEX_ACTUALIZA_DATOS );
                args = new Object [][] {
                    { vecTiposColumnas.elementAt ( 1 ), modelo.getMatricula             () },
                    { vecTiposColumnas.elementAt ( 4 ), modelo.getIdmateria             () },
                    { vecTiposColumnas.elementAt ( 6 ), modelo.getPeriodo               () },
                    { vecTiposColumnas.elementAt ( 7 ), modelo.getCalificacion          () },
                    { vecTiposColumnas.elementAt ( 0 ), modelo.getIdcalific             ()}
                };
            }   

        try {
            int regs = EjecutorSQL.sqlEjecutar ( sql, args );
            if ( regs == 1 ) {
                frmPrincipal.getJbtnModulo3().doClick ();
                JOptionPane.showMessageDialog( this,
                    mensaje,
                    accion,
                    JOptionPane.INFORMATION_MESSAGE );
            }
        } catch ( SQLException ex ) {
            dialogoMensaje ( ex.toString () );
        }

        dispose ();
    }//GEN-LAST:event_jbtnGuardar_ActionPerformed
    // ---------------------------------------------------------------------------------
    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        dispose ();
    }//GEN-LAST:event_jbtnCancelarActionPerformed
    // ---------------------------------------------------------------------------------
    private boolean validarDatos (  ) {
        Modelo1 modelo1  = (Modelo1) jcboAlumno.getSelectedItem ();
        String matricula = modelo1.getMatricula ();
        String nombre = modelo1.getNombre       ();
        
        if ( nombre.equals ( "--Seleccione--" ) ) {
            dialogoMensaje ( "Debe seleccionar un elemento de la lista" );
            jcboAlumno.requestFocus ();
            return false;
        }
        
        Modelo2 modelo2  = (Modelo2) jcboMateria.getSelectedItem ();
        String idmateria = modelo2.getIdmateria     ();
        String materia = modelo2.getMateria          ();
        
        if ( materia.equals ( "--Seleccione--" ) ) {
            dialogoMensaje ( "Debe seleccionar un elemento de la lista" );
            jcboMateria.requestFocus ();
            return false;
        }
        
        int calificacion = 0;
        try {
            calificacion = Integer.parseInt ( jtxfCalific.getText () );
        } catch ( NumberFormatException e ) {
            dialogoMensaje ( "Debe capturar un valor númerico válido" );
            return false;
        }
        
        String periodo = jcboPeriodo.getSelectedItem ().toString ();
        int idcalific = 0;
        
        if ( accion.equals ( PrincipalFrame.NUEVO ) ) {
            ResultSet rs;
            
            // DETERMINAR EL CONSECUTIVO DE ID CALIFICICACION E INCREMENTARLO EN 1
            sql = frmPrincipal.getPropConsultasSQL().getProperty ( PrincipalFrame.KARDEX_OBT_MAX_ID );
            try {
                rs = EjecutorSQL.sqlQuery ( sql );
                if ( rs.next () ) {
                    idcalific = rs.getInt ( "maxid" );
                    idcalific++;
                }
            } catch ( SQLException ex ) {
                dialogoMensaje ( ex.toString () );
            }
        } else if ( accion.equals ( PrincipalFrame.EDITAR ) ) {
            idcalific = modelo.getIdcalific ();
        }
        
        modelo = new Modelo3 ( idcalific, matricula, idmateria, periodo, calificacion );
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
            java.util.logging.Logger.getLogger(Modulo3EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modulo3EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modulo3EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modulo3EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Modulo3EditarDialog dialog = new Modulo3EditarDialog(new javax.swing.JFrame(), null );
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
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnGuardar_;
    private javax.swing.JComboBox<Modelo1> jcboAlumno;
    private javax.swing.JComboBox<Modelo2> jcboMateria;
    private javax.swing.JComboBox<String> jcboPeriodo;
    private javax.swing.JLabel jlblLogo;
    private javax.swing.JFormattedTextField jtxfCalific;
    // End of variables declaration//GEN-END:variables
}
