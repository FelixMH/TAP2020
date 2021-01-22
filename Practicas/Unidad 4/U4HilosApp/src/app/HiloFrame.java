/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                       Frame que nos muestra barras de progreso con una carrera entre 3 tíos
                            mediante Hilos.
:*        
:*  Archivo     : HiloFrame.java
:*  Autor       : Félix Gerardo Martínez Hinojo     17130800
:*  Fecha       : 11/ENE/2021
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripci�n : Frame con la parte visual programada de la Carrera mediante Hilos.
:*
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  11/ENE/2020 Félix Mtz       Se añadió el prologo.
:*------------------------------------------------------------------------------------------*/
package app;

import hilo.thread.MiHilo;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

// ----------------------------------------------------------------------------
public class HiloFrame extends javax.swing.JFrame {

    // variable booleana que permite evaluar si hay un ganador o no.
    private boolean hayGanador;
    
    public HiloFrame() {
        initComponents();
        
        jlblGanador1.setVisible ( false );
        jlblGanador2.setVisible ( false );
        jlblGanador3.setVisible ( false );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxfHilo1 = new javax.swing.JTextField();
        jtxfHilo2 = new javax.swing.JTextField();
        jtxfHilo3 = new javax.swing.JTextField();
        jpbrHilo1 = new javax.swing.JProgressBar();
        jpbrHilo2 = new javax.swing.JProgressBar();
        jpbrHilo3 = new javax.swing.JProgressBar();
        jlblGanador1 = new javax.swing.JLabel();
        jlblGanador2 = new javax.swing.JLabel();
        jlblGanador3 = new javax.swing.JLabel();
        jbtnIniciarHilo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("1");

        jLabel2.setText("2");

        jLabel3.setText("3");

        jtxfHilo1.setText("Tio Rios");

        jtxfHilo2.setText("Tio Oswi");

        jtxfHilo3.setText("Tio Ulloita");

        jpbrHilo1.setStringPainted(true);

        jpbrHilo2.setStringPainted(true);

        jpbrHilo3.setStringPainted(true);

        jlblGanador1.setForeground(new java.awt.Color(0, 153, 0));
        jlblGanador1.setText("GANADOR");

        jlblGanador2.setForeground(new java.awt.Color(0, 153, 0));
        jlblGanador2.setText("GANADOR");

        jlblGanador3.setForeground(new java.awt.Color(0, 153, 0));
        jlblGanador3.setText("GANADOR");

        jbtnIniciarHilo.setText("Iniciar");
        jbtnIniciarHilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIniciarHiloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jtxfHilo1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jtxfHilo2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jtxfHilo3)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpbrHilo2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpbrHilo1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpbrHilo3, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlblGanador3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblGanador2, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(jlblGanador1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnIniciarHilo)
                .addGap(355, 355, 355))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxfHilo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpbrHilo1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblGanador1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxfHilo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpbrHilo2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblGanador2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jtxfHilo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jpbrHilo3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlblGanador3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jbtnIniciarHilo)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // ----------------------------------------------------------------------------
    // evento click del botón iniciar del frame visual.
    private void jbtnIniciarHiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIniciarHiloActionPerformed
        jlblGanador1.setVisible ( false );
        jlblGanador2.setVisible ( false );
        jlblGanador3.setVisible ( false );
        
        hayGanador = false;
        
        MiHilo hilo1 = new MiHilo ( "Tio Rios", this );
        MiHilo hilo2 = new MiHilo ( "Tio Oswi", this );
        MiHilo hilo3 = new MiHilo ( "Tio Ulloita", this );
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }//GEN-LAST:event_jbtnIniciarHiloActionPerformed
    // ----------------------------------------------------------------------------
    // Método setProgreso () que establece el valor de los progressBar. 
    synchronized public void setProgreso ( String nombre, int progreso ) {
        if ( nombre.equals ( jtxfHilo1.getText () ) ) {
            mostrarProgreso ( progreso, jpbrHilo1, jlblGanador1 );
        }else if ( nombre.equals ( jtxfHilo2.getText () ) ) {
            mostrarProgreso ( progreso, jpbrHilo2, jlblGanador2 );
        } else if ( nombre.equals ( jtxfHilo3.getText () ) ) {
            mostrarProgreso ( progreso, jpbrHilo3, jlblGanador3 );
        }
    }
    // ----------------------------------------------------------------------------
    // Método mostrarProgreso () que cambia el valor de la barra de progreso dependiendo de la ejecución
    // del Hilo.
    private void mostrarProgreso ( int progreso, JProgressBar jpbrProgreso, 
                                    JLabel jlblGanador ) {
        jpbrProgreso.setValue( progreso );
        if ( progreso == 100 && ! hayGanador ) {
            hayGanador = true;
            jlblGanador.setVisible ( true );
        }
    }
    // ----------------------------------------------------------------------------
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
            java.util.logging.Logger.getLogger(HiloFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HiloFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HiloFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HiloFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HiloFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbtnIniciarHilo;
    private javax.swing.JLabel jlblGanador1;
    private javax.swing.JLabel jlblGanador2;
    private javax.swing.JLabel jlblGanador3;
    private javax.swing.JProgressBar jpbrHilo1;
    private javax.swing.JProgressBar jpbrHilo2;
    private javax.swing.JProgressBar jpbrHilo3;
    private javax.swing.JTextField jtxfHilo1;
    private javax.swing.JTextField jtxfHilo2;
    private javax.swing.JTextField jtxfHilo3;
    // End of variables declaration//GEN-END:variables
}
