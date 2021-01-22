/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.conversiones;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;


public class splash extends javax.swing.JFrame {
private int auxiliar=0;
private boolean realizado = false;
hilo ejecutar = new hilo();
    
    public splash() {
        initComponents();
        splash.this.getRootPane().setOpaque(false);        
        splash.this.getContentPane ().setBackground (new Color (0, 0, 0, 0));
        splash.this.setBackground (new Color (0, 0, 0, 0)); 
        
        this.setResizable(false);
        this.setLocationRelativeTo(this);   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        Barra = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ITL.png"))); // NOI18N

        mensaje.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mensaje.setText("Texto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mensaje)
                    .addComponent(Barra, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mensaje)
                .addGap(11, 11, 11)
                .addComponent(Barra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        if(realizado == false){
            realizado = true;
            Barra.setMaximum(49);
            Barra.setMinimum(0);
            Barra.setStringPainted(true);
            ejecutar.start();
        }
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void ejecutar(){
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
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new splash().setVisible(true);
            }
        });
    }
    public static void main(String args[]) {
        ejecutar();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Barra;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel mensaje;
    // End of variables declaration//GEN-END:variables
private class hilo extends Thread{
         @Override
    public void run(){
        try {while(true){
                auxiliar++;
                Barra.setValue(auxiliar);
                repaint();
                switch(auxiliar){
                    case 3:
                        mensaje.setText("Cargando programa...");
                        break;
                    case 20:
                        mensaje.setText("Leyendo preferencias");
                        break;
                    case 50:
                        mensaje.setText("Carga finalizada");
                        ConversionesFrame objeto = new ConversionesFrame();
                        objeto.setVisible(true);
                        objeto.setLocationRelativeTo(splash.this);
                        splash.this.dispose();
                        break;
                }
                Thread.sleep(100);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(splash.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
}
