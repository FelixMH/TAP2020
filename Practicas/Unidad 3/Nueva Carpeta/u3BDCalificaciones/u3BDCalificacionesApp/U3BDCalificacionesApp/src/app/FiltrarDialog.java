
package app;

import java.util.Vector;
import javax.swing.JOptionPane;
import mx.tecnm.itl.jdbc.EjecutorSQL;

public class FiltrarDialog extends javax.swing.JDialog {
    
    private PrincipalFrame frmPrincipal;
    private Vector<String> vecColumnas;
    private Vector<String> vecColumnasBD;
    private Vector<String> vecTipos;
    private boolean        inicializando = true;
    
    public FiltrarDialog ( java.awt.Frame parent, boolean modal ) {
        super ( parent, modal );
        initComponents ();
        
        frmPrincipal  = ( PrincipalFrame )parent;
        vecColumnas   = frmPrincipal.getVecNombresColumnas   ();
        vecColumnasBD = frmPrincipal.getVecNombresColumnasBD ();
        vecTipos      = frmPrincipal.getVecTiposColumnas     ();
        
        jcboColumna.removeAllItems();
        
        for (int i = 0; i < vecColumnas.size(); i++) {
            jcboColumna.addItem ( vecColumnas.elementAt ( i ) );
        }
        
        cargarComparadores ( 0 );
        jcboColumna.setSelectedIndex ( 0 );
        jcboColumna.requestFocus     ();
        inicializando = false;
    }
    
    private void cargarComparadores ( int pos ){
        jcboComparador.removeAllItems();
        if ( vecTipos.elementAt ( pos ).equals ( EjecutorSQL.STRING ) ){
            jcboComparador.addItem ( "Sea igual a"   );
            jcboComparador.addItem ( "Empiece con"   );
            jcboComparador.addItem ( "Termine con"   );
            jcboComparador.addItem ( "Contenga"      );
            jcboComparador.addItem ( "Sea diferente" );
            
        }else if (  vecTipos.elementAt ( pos ).equals ( EjecutorSQL.INT   ) ||
                    vecTipos.elementAt ( pos ).equals ( EjecutorSQL.FLOAT ) ){
            jcboComparador.addItem ( "="  );
            jcboComparador.addItem ( "<>" );
            jcboComparador.addItem ( ">"  );
            jcboComparador.addItem ( "<"  );
            jcboComparador.addItem ( ">=" );
            jcboComparador.addItem ( "<=" );
        }
        jcboComparador.setSelectedIndex( 0 );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jbtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Filtrar");
        setPreferredSize(new java.awt.Dimension(486, 186));

        jLabel1.setText("Columna: ");

        jLabel2.setText("Comparador: ");

        jLabel3.setText("Valor:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnAceptar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jcboColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcboComparador, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(44, 44, 44)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jtxfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(49, 49, 49))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnCancelar)
                        .addGap(91, 91, 91))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcboColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcboComparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAceptar)
                    .addComponent(jbtnCancelar))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        dispose ();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jcboColumnaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcboColumnaItemStateChanged
        if ( !inicializando ){
            cargarComparadores ( jcboColumna.getSelectedIndex () );
        }
    }//GEN-LAST:event_jcboColumnaItemStateChanged

    private void jbtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAceptarActionPerformed
        if ( jtxfValor.getText ().trim ().equals ( "" ) ) {
            JOptionPane.showMessageDialog ( this, "Proporcione un Valor", "Filtrar", JOptionPane.ERROR_MESSAGE );
            jtxfValor.requestFocus();
            return;
        }
        
        String sql     = "";
        String orderBy = "";
        if ( frmPrincipal.getModuloActual ().equals ( PrincipalFrame.TIT_MODULO1 ) ) {
            sql = frmPrincipal.getPropConsultasSQL ().getProperty (
                                            PrincipalFrame.ALUMNOS_TODOS_SIN_ORDEN );
            orderBy = "order by nombre";
        } else  if ( frmPrincipal.getModuloActual ().equals ( PrincipalFrame.TIT_MODULO2 ) ) {
            sql = frmPrincipal.getPropConsultasSQL ().getProperty (
                                            PrincipalFrame.MATERIAS_TODOS_SIN_ORDEN );
            orderBy = "order by materia";
        } else  if ( frmPrincipal.getModuloActual ().equals ( PrincipalFrame.TIT_MODULO3 ) ) {
            sql = frmPrincipal.getPropConsultasSQL ().getProperty (
                                            PrincipalFrame.KARDEX_TODOS_SIN_ORDEN );
            orderBy = "order by matricula";
        }
        
        sql += " where " + vecColumnasBD.elementAt ( jcboColumna.getSelectedIndex () );
        
        String tipo  = vecTipos.elementAt ( jcboColumna.getSelectedIndex() );
        String valor = jtxfValor.getText (); 
        
        if ( jcboComparador.getSelectedItem ().toString ().equals ( "Sea igual a" ) )
            sql += " = ?";
        else if ( jcboComparador.getSelectedItem ().toString ().equals ( "Empiece con" ) ){
            sql += " like ? ";
            valor += "% " ; 
        }
        else if ( jcboComparador.getSelectedItem ().toString ().equals ( "Termine con" ) ){
            sql += " like ?";
            valor = "%" + valor; 
        }
        else if ( jcboComparador.getSelectedItem ().toString ().equals ( "Contenga"    ) ){
            sql += " like ? ";
            valor = "%" + valor + "%"; 
        }
        else if ( jcboComparador.getSelectedItem ().toString ().equals ( "Sea diferente" ) ){
            sql += " <> ";
        }
        else 
            sql += " " + jcboComparador.getSelectedItem ().toString () + " ? ";
        
        sql += orderBy;
        
        Object [][] args = { { tipo, valor } };
        frmPrincipal.desplegarRegistros( sql, args );
        dispose ();
    }//GEN-LAST:event_jbtnAceptarActionPerformed

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
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JComboBox<String> jcboColumna;
    private javax.swing.JComboBox<String> jcboComparador;
    private javax.swing.JTextField jtxfValor;
    // End of variables declaration//GEN-END:variables
}
