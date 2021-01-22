/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                    JFrame para la app lanzadora de todas las practicas anteriores.
:*        
:*  Archivo     : LanzadoraFrame.java
:*  Autor       : Felix Gerardo Martínez Hinojo 17130800
:*  Fecha       : 29/OCT/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripcion : Aplicacion que sirve para mostrar y poner a trabajar las practicas anteriores
:*                dentro de un mismo programa.
:*  Ultima modif: 
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  30/OCT/2020 FelixMtz           se añadió el prologo.
:*------------------------------------------------------------------------------------------*/
package app.lanzadora;

import mx.tecnm.itl.extras.AcercaDeDialog;
import mx.tecnm.itl.util.Imagenes;

public class LanzadoraFrame extends javax.swing.JFrame {

    public LanzadoraFrame() {
        initComponents();
        
        // Ajustamos el tamaño de la imagen dentro de los botones.
        jbtnPrismasApp.setIcon ( Imagenes.escalarImagen (
                jbtnPrismasApp.getIcon(),
                jbtnPrismasApp.getWidth(),
                jbtnPrismasApp.getHeight()
        ) );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jbtnMatematicasApp = new javax.swing.JButton();
        jbtnConversionesApp = new javax.swing.JButton();
        jbtnPrismasApp = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxf_Descripcion = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMI_Salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMI_Limpiar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMI_AcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lanzadora App");

        jTabPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbtnMatematicasApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ITL Chica.png"))); // NOI18N
        jbtnMatematicasApp.setText("MatematicaApp");
        jbtnMatematicasApp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnMatematicasApp.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnMatematicasAppMouseMoved(evt);
            }
        });
        jbtnMatematicasApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMatematicasAppActionPerformed(evt);
            }
        });

        jbtnConversionesApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Tecnologico De Mexico.jpg"))); // NOI18N
        jbtnConversionesApp.setText("Conversiones App");
        jbtnConversionesApp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnConversionesApp.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnConversionesAppMouseMoved(evt);
            }
        });
        jbtnConversionesApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConversionesAppActionPerformed(evt);
            }
        });

        jbtnPrismasApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Cilindro.PNG"))); // NOI18N
        jbtnPrismasApp.setText("PrismasApp");
        jbtnPrismasApp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnPrismasApp.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnPrismasAppMouseMoved(evt);
            }
        });
        jbtnPrismasApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrismasAppActionPerformed(evt);
            }
        });

        jLabel5.setText("Aplicación Prismas");

        jLabel6.setText("Aplicación Conversiones");

        jLabel7.setText("Aplicación Matemática");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7))
                    .addComponent(jbtnMatematicasApp))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6))
                    .addComponent(jbtnConversionesApp, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addComponent(jbtnPrismasApp, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnPrismasApp, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnConversionesApp, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnMatematicasApp, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTabPane1.addTab("Unidad 1", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );

        jTabPane1.addTab("Unidad 2", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );

        jTabPane1.addTab("Unidad 3", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );

        jTabPane1.addTab("Unidad 4", jPanel4);

        jLabel1.setText("Descripción de la aplicación");

        jMenu1.setText("Archivo");

        jMI_Salir.setText("Salir");
        jMI_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_SalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMI_Salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMI_Limpiar.setText("Limpiar");
        jMI_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_LimpiarActionPerformed(evt);
            }
        });
        jMenu2.add(jMI_Limpiar);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        jMI_AcercaDe.setText("Acerca De");
        jMI_AcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_AcercaDeActionPerformed(evt);
            }
        });
        jMenu3.add(jMI_AcercaDe);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jtxf_Descripcion, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jTabPane1)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxf_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMI_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_jMI_SalirActionPerformed

    private void jMI_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_LimpiarActionPerformed
        jtxf_Descripcion.setText("");
    }//GEN-LAST:event_jMI_LimpiarActionPerformed

    private void jMI_AcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_AcercaDeActionPerformed
        
    }//GEN-LAST:event_jMI_AcercaDeActionPerformed

    private void jbtnPrismasAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrismasAppActionPerformed
        app.prismas.splash.ejecutar();
    }//GEN-LAST:event_jbtnPrismasAppActionPerformed

    private void jbtnPrismasAppMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPrismasAppMouseMoved
        jtxf_Descripcion.setText("Aplicaciones para prismas...");
    }//GEN-LAST:event_jbtnPrismasAppMouseMoved

    private void jbtnConversionesAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConversionesAppActionPerformed
        app.conversiones.splash loading = new app.conversiones.splash();
        loading.setVisible(true);
    }//GEN-LAST:event_jbtnConversionesAppActionPerformed

    private void jbtnMatematicasAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMatematicasAppActionPerformed
        app.matematica.splash loading = new app.matematica.splash();
        loading.setVisible(true);
    }//GEN-LAST:event_jbtnMatematicasAppActionPerformed

    private void jbtnConversionesAppMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnConversionesAppMouseMoved
        jtxf_Descripcion.setText("Aplicaciones para Conversiones...");
    }//GEN-LAST:event_jbtnConversionesAppMouseMoved

    private void jbtnMatematicasAppMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnMatematicasAppMouseMoved
        jtxf_Descripcion.setText("Aplicaciones para Matematicas...");
    }//GEN-LAST:event_jbtnMatematicasAppMouseMoved

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
            java.util.logging.Logger.getLogger(LanzadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LanzadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LanzadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LanzadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LanzadoraFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMI_AcercaDe;
    private javax.swing.JMenuItem jMI_Limpiar;
    private javax.swing.JMenuItem jMI_Salir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabPane1;
    private javax.swing.JButton jbtnConversionesApp;
    private javax.swing.JButton jbtnMatematicasApp;
    private javax.swing.JButton jbtnPrismasApp;
    private javax.swing.JTextField jtxf_Descripcion;
    // End of variables declaration//GEN-END:variables
}
