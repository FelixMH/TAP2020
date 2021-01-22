/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                       Aplicación visual que realiza funciones matemáticas.
:*        
:*  Archivo     : MatematicaFrame.java
:*  Autor       : Félix Gerardo Martínez Hinojo     17130800
:*  Fecha       : 02/OCT/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripci�n : Aplicación que permite ver de manera visual los resultados calculados de: 
                  1.- Factorial( n )
                  2.- Permutaciones ( n, x )
                  3.- Combinaciones ( n, x )
:*                
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 

:*------------------------------------------------------------------------------------------*/

package matematica;

import javax.swing.JOptionPane;

public class MatematicaFrame extends javax.swing.JFrame {

    //------------------------------------------------------------------------------------------
    public MatematicaFrame() {
        initComponents();
    }
    //------------------------------------------------------------------------------------------

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcboFactorial = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jlblValor_B = new javax.swing.JLabel();
        jtxfValor_A = new javax.swing.JTextField();
        jtxfValor_B = new javax.swing.JTextField();
        jtxfValor_C = new javax.swing.JTextField();
        jlblValor_C = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlblResultado = new javax.swing.JLabel();
        jbtnCalcular = new javax.swing.JButton();
        jbtnAcercaDe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Operación: ");

        jcboFactorial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Factorial", "Permutaciones", "Combinaciones", "Formula General" }));
        jcboFactorial.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcboFactorialItemStateChanged(evt);
            }
        });
        jcboFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboFactorialActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel2.setText("a =");

        jlblValor_B.setText("b =");
        jlblValor_B.setEnabled(false);

        jtxfValor_B.setEnabled(false);

        jtxfValor_C.setEnabled(false);

        jlblValor_C.setText("c =");
        jlblValor_C.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jlblValor_B))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxfValor_B, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jtxfValor_A)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlblValor_C)
                        .addGap(36, 36, 36)
                        .addComponent(jtxfValor_C)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxfValor_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblValor_B)
                    .addComponent(jtxfValor_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblValor_C)
                    .addComponent(jtxfValor_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));

        jlblResultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        jbtnCalcular.setText("Calcular");
        jbtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCalcularActionPerformed(evt);
            }
        });

        jbtnAcercaDe.setText("?");
        jbtnAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAcercaDeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(jcboFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jbtnCalcular)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnAcercaDe)
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jcboFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtnCalcular)
                        .addGap(128, 128, 128)))
                .addComponent(jbtnAcercaDe)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcboFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboFactorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcboFactorialActionPerformed

    private void jbtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCalcularActionPerformed
        int a = 0 , b = 0, c = 0;
        String operacion = jcboFactorial.getSelectedItem().toString();
        
        try {
            a = Integer.parseInt ( jtxfValor_A.getText() );
        } catch ( NumberFormatException e ) {
            JOptionPane.showMessageDialog( this, 
                                           " valor de n debe ser un número entero ", 
                                           " Error ",
                                           JOptionPane.ERROR_MESSAGE );
            jtxfValor_A.requestFocus();
            
            return;
        }
        
        try {
            if ( operacion.equals( "Permutaciones" ) || operacion.equals( "Combinaciones" ) ) {
                b = Integer.parseInt( jtxfValor_B.getText() );
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog( this, 
                                           " valor de C debe ser un número entero ", 
                                           " Error ",
                                           JOptionPane.ERROR_MESSAGE );
            jtxfValor_B.requestFocus();
            
            return;
        }
        
        try {
            if ( operacion.equals( "Formula General" ) ) {
                c = Integer.parseInt( jtxfValor_C.getText() );
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog( this, 
                                           " valor de x debe ser un número entero ", 
                                           " Error ",
                                           JOptionPane.ERROR_MESSAGE );
            jtxfValor_C.requestFocus();
            
            return;
        }
        
        if ( operacion.equals( "Factorial" ) ) {
            jlblResultado.setText( Matematica.factorial(a) + "" );
        } else if ( operacion.equals( "Permutaciones" ) ) {
            jlblResultado.setText( Matematica.permutaciones(a, b) + "" );
        } else if ( operacion.equals( "Combinaciones" ) ) {
            jlblResultado.setText( Matematica.combinaciones(a, b) + "" );
        } else if ( operacion.equals( "Formula General" ) ) {
            jlblResultado.setText(  Matematica.formulaGeneral( a, b, c ).toString() + "" );
        }
        //------------------------------------------------------------------------------------------
        
        
    }//GEN-LAST:event_jbtnCalcularActionPerformed

    private void jcboFactorialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcboFactorialItemStateChanged
        if ( jcboFactorial.getSelectedItem().toString().equals( "Factorial" ) ) {
            jtxfValor_B.setEnabled(false);
            jlblValor_B.setEnabled(false);
        } else  if ( jcboFactorial.getSelectedItem().toString().equals( "Permutaciones" ) || 
                     jcboFactorial.getSelectedItem().toString().equals( "Combinaciones" ) ){
            jtxfValor_B.setEnabled(true);
            jlblValor_B.setEnabled(true);
        } else if ( jcboFactorial.getSelectedItem().toString().equals( "Formula General" ) ) {
            jlblValor_B.setEnabled(true);
            jtxfValor_B.setEnabled(true);
            jlblValor_C.setEnabled(true);
            jtxfValor_C.setEnabled(true);
        }
        //------------------------------------------------------------------------------------------
    }//GEN-LAST:event_jcboFactorialItemStateChanged

    private void jbtnAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAcercaDeActionPerformed
        JOptionPane.showMessageDialog( this, 
                                       " TECNOLÓGICO NACIONAL DE MÉXICO \n " +
                                       " Instituto Tecnológico de La Laguna \n " +
                                       "ISC   Tópicos Avanzados de Programación \n\n" +
                                       "MatematicasApp version 1.0 \n" +
                                       "Desarrollado por: \n " +
                                       "Félix Martínez 17130800 \n\n" +
                                       "(C) Derechos Reservados 2020",
                                       "Acerca De",
                                       JOptionPane.INFORMATION_MESSAGE);
        //------------------------------------------------------------------------------------------
    }//GEN-LAST:event_jbtnAcercaDeActionPerformed

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
                if ("Motif".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MatematicaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatematicaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatematicaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatematicaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatematicaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnAcercaDe;
    private javax.swing.JButton jbtnCalcular;
    private javax.swing.JComboBox<String> jcboFactorial;
    private javax.swing.JLabel jlblResultado;
    private javax.swing.JLabel jlblValor_B;
    private javax.swing.JLabel jlblValor_C;
    private javax.swing.JTextField jtxfValor_A;
    private javax.swing.JTextField jtxfValor_B;
    private javax.swing.JTextField jtxfValor_C;
    // End of variables declaration//GEN-END:variables
}
