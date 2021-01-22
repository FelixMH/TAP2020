/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                       Bean que permite dibujar una pelota en un Frame.
:*        
:*  Archivo     : PelotaRebotandoBean.java
:*  Autor       : Félix Gerardo Martínez Hinojo     17130800
:*  Fecha       : 13/ENE/2021
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripci�n : Panel con la parte hibrida ( visual / lógica ) programada de las pelotas rebotando 
                    creadas mediante Hilos.
:*
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  13/ENE/2021 Félix Mtz       Se añadió el prologo.
:*------------------------------------------------------------------------------------------*/
package pelotas;

// ----------------------------------------------------------------------------
public class PelotaRebotandoBean extends javax.swing.JPanel {

    private Pelota pelota;
    
    public PelotaRebotandoBean() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnMarcoPelota = new javax.swing.JPanel();
        jbtnIniciar = new javax.swing.JButton();
        jbtnDetener = new javax.swing.JButton();

        jpnMarcoPelota.setBackground(new java.awt.Color(255, 255, 255));
        jpnMarcoPelota.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jpnMarcoPelotaLayout = new javax.swing.GroupLayout(jpnMarcoPelota);
        jpnMarcoPelota.setLayout(jpnMarcoPelotaLayout);
        jpnMarcoPelotaLayout.setHorizontalGroup(
            jpnMarcoPelotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnMarcoPelotaLayout.setVerticalGroup(
            jpnMarcoPelotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );

        jbtnIniciar.setText("Iniciar");
        jbtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIniciarActionPerformed(evt);
            }
        });

        jbtnDetener.setText("Detener");
        jbtnDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDetenerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnMarcoPelota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnIniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jbtnDetener)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnMarcoPelota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnIniciar)
                    .addComponent(jbtnDetener))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // ----------------------------------------------------------------------------
    // Evento click del botón iniciar de el frame.
    private void jbtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIniciarActionPerformed
        pelota = new Pelota ( jpnMarcoPelota );
        pelota.start ();
    }//GEN-LAST:event_jbtnIniciarActionPerformed
    // ----------------------------------------------------------------------------
    // Evento click del botón detener del frame.
    private void jbtnDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDetenerActionPerformed
        pelota.seguirRebotando = false;
    }//GEN-LAST:event_jbtnDetenerActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnDetener;
    private javax.swing.JButton jbtnIniciar;
    private javax.swing.JPanel jpnMarcoPelota;
    // End of variables declaration//GEN-END:variables
}
