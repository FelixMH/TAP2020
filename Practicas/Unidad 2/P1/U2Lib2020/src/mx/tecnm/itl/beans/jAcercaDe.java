/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                               Clase jAcercaDe 
:*        
:*  Archivo     : jAcercaDe.java
:*  Autor       : Félix Gerardo Martínez Hinojo 17130800
:*  Fecha       : 26/NOV/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripcion : Este es un bean para los datos acerca de de la aplicación , así como de los desarrolladores de dicho programa.
:*                
:*  Ultima modif: 
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  26/NOV/2020 Félix Mtz           Agregar prologo.
:*------------------------------------------------------------------------------------------*/
package mx.tecnm.itl.beans;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import mx.tecnm.itl.util.Imagenes;


public class jAcercaDe extends javax.swing.JPanel {

    
    public jAcercaDe() {
        initComponents();
        
        
        jlbl_Logo1.setIcon ( Imagenes.escalarImagen (
                jlbl_Logo1.getIcon(),
                135,
                146
        ) );
        
        jlbl_Logo2.setIcon ( Imagenes.escalarImagen (
                jlbl_Logo2.getIcon(),
                135,
                137
        ) );
        
        
//        Icon TecnologicoMexico =  Imagenes.escalarImagen(this.jLab_TecMexico.getIcon(), this.jLab_TecMexico.getWidth(), this.jLab_TecMexico.getHeight());
//        this.jLab_TecMexico.setIcon(TecnologicoMexico);
//        Icon TecLaguna =  Imagenes.escalarImagen(this.jLab_TecLaguna.getIcon(), this.jLab_TecLaguna.getWidth(), this.jLab_TecLaguna.getHeight());
//        this.jLab_TecLaguna.setIcon(TecLaguna);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpopMenu_AcercaDe = new javax.swing.JPopupMenu();
        jmi_AcercaDeBean = new javax.swing.JMenuItem();
        jlbl_Logo1 = new javax.swing.JLabel();
        jlbl_Logo2 = new javax.swing.JLabel();
        jlblTagTeam = new javax.swing.JLabel();
        jlblDesarrollador1 = new javax.swing.JLabel();
        jlblDerechosAlPie = new javax.swing.JLabel();
        jlblVersion = new javax.swing.JLabel();
        jlblNombre = new javax.swing.JLabel();
        jlblMateria = new javax.swing.JLabel();
        jlblCarrera = new javax.swing.JLabel();
        jlblInstitucion = new javax.swing.JLabel();
        jlblUniversidad = new javax.swing.JLabel();
        jlblDesarrollador2 = new javax.swing.JLabel();
        jlblDesarrollador3 = new javax.swing.JLabel();
        jlblDesarrollador4 = new javax.swing.JLabel();

        jmi_AcercaDeBean.setText("Acerca de....");
        jmi_AcercaDeBean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AcercaDeBeanActionPerformed(evt);
            }
        });
        jpopMenu_AcercaDe.add(jmi_AcercaDeBean);

        setComponentPopupMenu(jpopMenu_AcercaDe);

        jlbl_Logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/ITL.png"))); // NOI18N
        jlbl_Logo1.setText("Logo TM");
        jlbl_Logo1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlbl_Logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/Tecnologico De Mexico.jpg"))); // NOI18N
        jlbl_Logo2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlblTagTeam.setText("Desarrollado por:");

        jlblDesarrollador1.setText("[ DESARROLLADOR 1 ]");

        jlblDerechosAlPie.setText("(C) Derechos Reservados 2020");
        jlblDerechosAlPie.setName(""); // NOI18N

        jlblVersion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblVersion.setText("[ VERSIÓN DEL PROGRAMA ]");

        jlblNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblNombre.setText("[ NOMBRE PROGRAMA ]");

        jlblMateria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblMateria.setText("[  NOMBRE MATERIA]");

        jlblCarrera.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblCarrera.setText("[ NOMBRE CARRERA ]");

        jlblInstitucion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblInstitucion.setText("[ NOMBRE INSTITUCIÓN ]");

        jlblUniversidad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblUniversidad.setText("[ NOMBRE DEL CAMPUS ]");

        jlblDesarrollador2.setText("[ DESARROLLADOR 2 ]");

        jlblDesarrollador3.setText("[ DESARROLLADOR 3 ]");

        jlblDesarrollador4.setText("[ DESARROLLADOR 4 ]");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbl_Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jlbl_Logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblUniversidad)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblCarrera)
                            .addComponent(jlblNombre)
                            .addComponent(jlblMateria)
                            .addComponent(jlblVersion)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblDesarrollador4)
                                    .addComponent(jlblDesarrollador2)
                                    .addComponent(jlblDesarrollador3)
                                    .addComponent(jlblDesarrollador1)
                                    .addComponent(jlblTagTeam)))
                            .addComponent(jlblDerechosAlPie))
                        .addComponent(jlblInstitucion)))
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(16, Short.MAX_VALUE)
                                .addComponent(jlblUniversidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlblInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jlblCarrera)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlblMateria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlblNombre))
                            .addComponent(jlbl_Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblVersion)
                        .addGap(18, 18, 18)
                        .addComponent(jlblTagTeam)
                        .addGap(18, 18, 18)
                        .addComponent(jlblDesarrollador1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblDesarrollador2)
                        .addGap(11, 11, 11)
                        .addComponent(jlblDesarrollador3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblDesarrollador4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jlbl_Logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addComponent(jlblDerechosAlPie))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_AcercaDeBeanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AcercaDeBeanActionPerformed
        JOptionPane.showMessageDialog (
                this,
                "JAcercaDe \n" +
                "v.1.0 \n\n" +
                "TecNM Campus La Laguna 2020",
                "Acerca De",
                JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_jmi_AcercaDeBeanActionPerformed

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
            java.util.logging.Logger.getLogger(jAcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jAcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jAcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jAcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        ejecutar();
    }
    
    public static void ejecutar() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jAcercaDe().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlblCarrera;
    private javax.swing.JLabel jlblDerechosAlPie;
    private javax.swing.JLabel jlblDesarrollador1;
    private javax.swing.JLabel jlblDesarrollador2;
    private javax.swing.JLabel jlblDesarrollador3;
    private javax.swing.JLabel jlblDesarrollador4;
    private javax.swing.JLabel jlblInstitucion;
    private javax.swing.JLabel jlblMateria;
    private javax.swing.JLabel jlblNombre;
    private javax.swing.JLabel jlblTagTeam;
    private javax.swing.JLabel jlblUniversidad;
    private javax.swing.JLabel jlblVersion;
    private javax.swing.JLabel jlbl_Logo1;
    private javax.swing.JLabel jlbl_Logo2;
    private javax.swing.JMenuItem jmi_AcercaDeBean;
    private javax.swing.JPopupMenu jpopMenu_AcercaDe;
    // End of variables declaration//GEN-END:variables

    public String getUniversidad () {
        return jlblUniversidad.getText();
    }
    
    public void setUniversidad ( String univ ) {
        jlblUniversidad.setText(univ);
    }
    
    public String getInstitucion () {
        return jlblInstitucion.getText();
    }
    
    public void setInstitucion ( String univ ) {
        jlblInstitucion.setText(univ);
    }
    
    public String getCarrera () {
        return jlblCarrera.getText();
    }
    
    public void setCarrera ( String univ ) {
        jlblCarrera.setText(univ);
    }
    
    public String getMateria () {
        return jlblMateria.getText();
    }
    
    public void setMateria ( String univ ) {
        jlblMateria.setText(univ);
    }
    
    public String getNombre () {
        return jlblNombre.getText();
    }
    
    public void setNombre ( String univ ) {
        jlblNombre.setText(univ);
    }
    
    public String getVersion () {
        return jlblVersion.getText();
    }
    
    public void setVersion ( String univ ) {
        jlblVersion.setText(univ);
    }
    
    public String getDesarrollador () {
        return jlblDesarrollador1.getText();
    }
    
    public void setDesarrollador ( String univ ) {
        jlblDesarrollador1.setText(univ);
    }
    
    public String getDesarrollador2 () {
        return jlblDesarrollador2.getText();
    }
    
    public void setDesarrollador2 ( String univ ) {
        jlblDesarrollador2.setText(univ);
    }
    
    public String getDesarrollador3 () {
        return jlblDesarrollador3.getText();
    }
    
    public void setDesarrollador3 ( String univ ) {
        jlblDesarrollador3.setText(univ);
    }
    
    public String getDesarrollador4 () {
        return jlblDesarrollador4.getText();
    }
    
    public void setDesarrollador4 ( String univ ) {
        jlblDesarrollador4.setText(univ);
    }
    
    public String getDerechos () {
        return jlblDerechosAlPie.getText();
    }
    
    public void setDerechos ( String univ ) {
        jlblDerechosAlPie.setText(univ);
    }
    
    public Icon getLogo1 () {
        return jlbl_Logo1.getIcon();
    }
    
    public void setLogo1 ( Icon icon ) {
        jlbl_Logo1.setIcon( Imagenes.escalarImagen ( icon, 135, 135 ) );
    }
    
    public Icon getLogo2 () {
        return jlbl_Logo1.getIcon();
    }
    
    public void setLogo2 ( Icon icon ) {
        jlbl_Logo1.setIcon( Imagenes.escalarImagen( icon, 135, 135 ) );
    }
    
    

}
