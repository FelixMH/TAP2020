/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                       Dialogo que permite filtrar datos de diferentes categorías.
:*        
:*  Archivo     : FiltrarDialog.java
:*  Autor       : Félix Gerardo Martínez Hinojo     17130800
:*  Fecha       : 01/DIC/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripci�n : Dialogo que permite filtrar datos de Alumnos, Materias y Kardex de Alumnos
:*                por:
                    - Matricula
                    - Nombre
                    - Apellidos
                    - Promedio
                    - entre otras.
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  07/DIC/2020 Félix Mtz       Se añadió el prologo y se le dió la funcionalidad básica de la app.
    07/DIC/2020 Félix Mtz       Se añadió la funcionalidad de todo el dialog.
:*------------------------------------------------------------------------------------------*/
package app;

import java.util.Vector;
import javax.swing.JOptionPane;
import mx.tecnm.itl.jdbc.EjecutorSQL;

public class FiltrarDialog extends javax.swing.JDialog {

    private PrincipalFrame              frmPrincipal;
    private Vector<String>              vecNombresColumnas;
    private Vector<String>              vecNombresColumnasBD;
    private Vector<String>              vecTiposColumnas;
    private boolean                     inicializando = true;

    // ---------------------------------------------------------------------------------
    public FiltrarDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        frmPrincipal = (PrincipalFrame) parent;
        vecNombresColumnas      =   frmPrincipal.getVecNombresColumnas ();
        vecNombresColumnasBD    =   frmPrincipal.getVecNombresColumnasBD ();
        vecTiposColumnas        =   frmPrincipal.getVecTiposColumnas ();
        
        
        jcboColumna.removeAllItems ();
        
        for ( int i = 0; i < vecNombresColumnas.size (); i++ ) {
            jcboColumna.addItem ( vecNombresColumnas.elementAt ( i ) );
        }
        
        cargarComparadores ( 0 );
        jcboColumna.setSelectedIndex ( 0 );
        jcboColumna.requestFocus ();
        inicializando = false;
    }
    // ---------------------------------------------------------------------------------
    private void cargarComparadores ( int pos ) {
        jcboComparador.removeAllItems ();
        
        if ( vecTiposColumnas.elementAt ( pos ).equals ( EjecutorSQL.STRING ) ) {
            jcboComparador.addItem ( "Sea igual a" );
            jcboComparador.addItem ( "Empiece con" );
            jcboComparador.addItem ( "Termine con" );
            jcboComparador.addItem ( "Contenga" );
            jcboComparador.addItem ( "Sea diferente" );
        } else if ( vecTiposColumnas.elementAt ( pos ).equals ( EjecutorSQL.INT ) || vecTiposColumnas.elementAt ( pos ).equals ( EjecutorSQL.FLOAT ) ) {
            jcboComparador.addItem ( "=" );
            jcboComparador.addItem ( "<>" );
            jcboComparador.addItem ( ">" );
            jcboComparador.addItem ( "<" );
            jcboComparador.addItem ( ">=" );
            jcboComparador.addItem ( "<=" );
        }
        jcboComparador.setSelectedIndex ( 0 );
    }
    // ---------------------------------------------------------------------------------

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcboColumna = new javax.swing.JComboBox<>();
        jcboComparador = new javax.swing.JComboBox<>();
        jtxfValor = new javax.swing.JTextField();
        jbtnAceptar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Filtrar Datos");

        jLabel1.setText("Columna");

        jLabel2.setText("Comparador");

        jLabel3.setText("Valor");

        jcboColumna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcboColumna.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcboColumnaItemStateChanged(evt);
            }
        });

        jcboComparador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbtnAceptar.setText("Aceptar");
        jbtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAceptarActionPerformed(evt);
            }
        });

        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(192, 192, 192)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(188, 188, 188))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jcboColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jcboComparador, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(jtxfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jbtnAceptar)
                        .addGap(209, 209, 209)
                        .addComponent(jbtnSalir)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcboColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcboComparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAceptar)
                    .addComponent(jbtnSalir))
                .addGap(46, 46, 46))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // ---------------------------------------------------------------------------------
    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        dispose ();
    }//GEN-LAST:event_jbtnSalirActionPerformed
    // ---------------------------------------------------------------------------------
    private void jcboColumnaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcboColumnaItemStateChanged
        if ( ! inicializando )
            cargarComparadores ( jcboColumna.getSelectedIndex () );
        
    }//GEN-LAST:event_jcboColumnaItemStateChanged
    // ---------------------------------------------------------------------------------
    private void jbtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAceptarActionPerformed
        
        if ( jtxfValor.getText().trim().equals ( "" ) ) {
            JOptionPane.showMessageDialog(
                    this,
                    "Proporcione un valor",
                    "Filtrar",
                    JOptionPane.ERROR_MESSAGE
            );
            jtxfValor.requestFocus ();
            return;
        }
        
        String sql = "";
        String orderBy = "";
        if ( frmPrincipal.getModuloActual().equals( PrincipalFrame.TIT_MODULO1 ) ) {
            sql = frmPrincipal.getPropConsultasSQL().getProperty ( PrincipalFrame.ALUMNOS_TODOS_SIN_ORDEN );
            orderBy = "order by nombre";
        } else if ( frmPrincipal.getModuloActual().equals( PrincipalFrame.TIT_MODULO2 ) ) {
            sql = frmPrincipal.getPropConsultasSQL().getProperty ( PrincipalFrame.MATERIAS_TODOS_SIN_ORDEN );
            orderBy = "order by materia";
        } else if ( frmPrincipal.getModuloActual().equals( PrincipalFrame.TIT_MODULO3 ) ) {
            sql = frmPrincipal.getPropConsultasSQL().getProperty ( PrincipalFrame.KARDEX_TODOS_SIN_ORDEN );
            orderBy = "order by matricula";
        }
        
        sql += " WHERE " + vecNombresColumnasBD.elementAt( jcboColumna.getSelectedIndex () );
        
        String tipo     = vecTiposColumnas.elementAt ( jcboColumna.getSelectedIndex () );
        String valor    = jtxfValor.getText ();
        
        if ( jcboComparador.getSelectedItem().toString().equals ( "Sea igual a"         ) ) {
            sql += " = ? ";
        } else if ( jcboComparador.getSelectedItem().toString().equals ( "Empiece con"  ) ) {
            sql += " LIKE ? ";
            valor += "%";
        } else if ( jcboComparador.getSelectedItem().toString().equals ( "Termine con"  ) ) {
            sql += " LIKE ? ";
            valor = "%" + valor;
        
        } else if ( jcboComparador.getSelectedItem().toString().equals ( "Contenga"     ) ) {
            sql += " LIKE ? ";
            valor = "%" + valor + "%";
        } else if ( jcboComparador.getSelectedItem().toString().equals ( "Sea diferente"     ) ) {
            sql +=  " <> ? ";
        } else 
            sql += " " + jcboComparador.getSelectedItem().toString () + " ? ";
        
        sql += orderBy;
        
        
        Object [][] args = { { tipo, valor } };
        frmPrincipal.desplegarRegistros ( sql, args );
        dispose ();
    }//GEN-LAST:event_jbtnAceptarActionPerformed
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
            java.util.logging.Logger.getLogger(FiltrarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FiltrarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FiltrarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FiltrarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FiltrarDialog dialog = new FiltrarDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jbtnAceptar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JComboBox<String> jcboColumna;
    private javax.swing.JComboBox<String> jcboComparador;
    private javax.swing.JTextField jtxfValor;
    // End of variables declaration//GEN-END:variables
}
