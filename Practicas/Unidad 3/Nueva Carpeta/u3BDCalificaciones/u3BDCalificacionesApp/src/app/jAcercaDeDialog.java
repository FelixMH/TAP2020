/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                               Clase jAcercaDe 
:*        
:*  Archivo     : jAcercaDeDialog.java
:*  Autor       : Félix Gerardo Martínez Hinojo 17130800
:*  Fecha       : 17/DIC/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripcion : Este es un Dialog que carga un bean que muestra la información referente a la aplicación. Permite editarla tambíen mediante
                    las propiedades del Dialog y del Bean, entrelazandolos.
:*                
:*  Ultima modif: 
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  17/DIC/2020 Félix Mtz           Agregar prologo.
:*------------------------------------------------------------------------------------------*/
package app;


public class jAcercaDeDialog extends javax.swing.JDialog {


    // ---------------------------------------------------------------------------------------------
    public jAcercaDeDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    // ---------------------------------------------------------------------------------------------

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jAcercaDe1 = new mx.tecnm.itl.beans.jAcercaDe();
        jAcercaDe2 = new mx.tecnm.itl.beans.jAcercaDe();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jAcercaDe2.setCarrera("Ing. Sistemas Computacionales");
        jAcercaDe2.setDesarrollador("Félix Gerardo Martínez Hinojo");
        jAcercaDe2.setDesarrollador2("");
        jAcercaDe2.setDesarrollador3("");
        jAcercaDe2.setDesarrollador4("");
        jAcercaDe2.setInstitucion("Tecnológico Nacional de México");
        jAcercaDe2.setMateria("Tópicos Avanzados De Programación");
        jAcercaDe2.setNombre("Acceso a Bases de datos");
        jAcercaDe2.setVersion("1.0.0");
        jAcercaDe2.setUniversidad("Instituto Tecnológico De La Laguna");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jAcercaDe2, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jAcercaDe2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // ---------------------------------------------------------------------------------------------
    
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
            java.util.logging.Logger.getLogger(jAcercaDeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jAcercaDeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jAcercaDeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jAcercaDeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jAcercaDeDialog dialog = new jAcercaDeDialog(new javax.swing.JFrame(), true);
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
    private mx.tecnm.itl.beans.jAcercaDe jAcercaDe1;
    private mx.tecnm.itl.beans.jAcercaDe jAcercaDe2;
    // End of variables declaration//GEN-END:variables
}
