/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                               Clase jPrismaTriangular 
:*        
:*  Archivo     : jPrismaTriangular.java
:*  Autor       : Félix Gerardo Martínez Hinojo 17130800
:*  Fecha       : 26/NOV/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripcion : Esta Panel jPrismaTriangular sirve como bean para añadir a diferentes frames reutilizando código y vista.
:*                  Especificamente de un prisma triangular.
:*                
:*  Ultima modif: 
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  26/NOV/2020 Félix Mtz           Agregar prologo.
:*------------------------------------------------------------------------------------------*/
package mx.tecnm.itl.beans;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import mx.tecnm.itl.prismas.IPrisma;
import mx.tecnm.itl.prismas.PrismaTriangular;
import mx.tecnm.itl.util.Imagenes;

/**
 *
 * @author FelixMtz
 */

    

public class jPrismaTriangular extends javax.swing.JPanel implements IPrisma {

    // Composición del BEAN.
    private PrismaTriangular modelo;
    private DatosPrismaTriangular datosPTDialog;
    private ArrayList<DatosModificadosListener> listener = new ArrayList<>();
    
    public jPrismaTriangular () {
        initComponents();
        
        modelo = new PrismaTriangular ();
        
        // Creamos el dialogo para los datos
        datosPTDialog = new DatosPrismaTriangular ( this , true );
    
        // Ajustamos el tamaño de la imagen del prisma.
        Icon icon = jlblPT.getIcon ();
        icon = Imagenes.escalarImagen (
                icon,
                136,
                188
        );
        jlblPT.setIcon ( icon );
    }
    
    public jPrismaTriangular ( double cateto1, double cateto2, double alto ) {
        this(); // Invoca al constructor default de Prisma Triangular de nuestro bean.
        
        modelo = new PrismaTriangular ( cateto1, cateto2, alto );
    }
    
    
    // Eventos del listener.
    public void addDatosModificadosListener ( DatosModificadosListener listener ) {
        this.listener.add ( listener );
    }
    
    public void removeDatosModificadosListener ( DatosModificadosListener listener ) {
        this.listener.remove ( listener );
    }
    
    public void fireDatosModificadosEvent ( DatosModificadosEvent ev ) {
        
        for ( DatosModificadosListener dModifListener : listener ) {
            dModifListener.datosModificadosPrisma ( ev );
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpmPT = new javax.swing.JPopupMenu();
        jmi_ValoresPrisma = new javax.swing.JMenuItem();
        jmi_AcercaDePT = new javax.swing.JMenuItem();
        jlblPT = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlblC1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlblC2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlblAltura = new javax.swing.JLabel();

        jmi_ValoresPrisma.setText("Valores del prisma");
        jmi_ValoresPrisma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ValoresPrismaActionPerformed(evt);
            }
        });
        jpmPT.add(jmi_ValoresPrisma);

        jmi_AcercaDePT.setText("Acerca De");
        jmi_AcercaDePT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AcercaDePTActionPerformed(evt);
            }
        });
        jpmPT.add(jmi_AcercaDePT);

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setComponentPopupMenu(jpmPT);

        jlblPT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/PrismaTriangular.jpg"))); // NOI18N
        jlblPT.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Cateto 1");

        jlblC1.setText("0");
        jlblC1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jlblC1.setPreferredSize(new java.awt.Dimension(200, 200));

        jLabel3.setText("Cateto 2");

        jlblC2.setText("0");
        jlblC2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jlblC2.setPreferredSize(new java.awt.Dimension(200, 200));

        jLabel4.setText("Altura ( h )");

        jlblAltura.setText("0");
        jlblAltura.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jlblAltura.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblPT, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlblC2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblAltura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblC1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(251, 251, 251))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblPT, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblC1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jlblC2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jlblAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_ValoresPrismaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ValoresPrismaActionPerformed
        datosPTDialog.setVisible ( true );
    }//GEN-LAST:event_jmi_ValoresPrismaActionPerformed

    private void jmi_AcercaDePTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AcercaDePTActionPerformed
        JOptionPane.showMessageDialog (
                this,
                "JPrismaTriangular \n"+
                "V1.0 \n\n" +
                "TecNM Campus La Laguna\n\n"+
                "(C) Derechos reservados 2020",
                "Acerca De",
                JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_jmi_AcercaDePTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jlblAltura;
    private javax.swing.JLabel jlblC1;
    private javax.swing.JLabel jlblC2;
    private javax.swing.JLabel jlblPT;
    private javax.swing.JMenuItem jmi_AcercaDePT;
    private javax.swing.JMenuItem jmi_ValoresPrisma;
    private javax.swing.JPopupMenu jpmPT;
    // End of variables declaration//GEN-END:variables

    @Override
    public double areaBase () {
        return modelo.areaBase();
    }

    @Override
    public double areaLateral () {
        return modelo.areaLateral ();
    }

    @Override
    public double areaTotal () {
        return modelo.areaTotal ();
    }

    @Override
    public double volumen () {
        return modelo.volumen ();
    }
    
    // getters y setters
    public double getC1 () {
        return modelo.getC1();
    }
    
    public void setC1 ( double C1 ) {
        modelo.setC1( C1 );
        jlblC1.setText ( C1 + "" );
    }
    
    public double getC2 () {
        return modelo.getC2();
    }
    
    public void setC2 ( double C2 ) {
        modelo.setC2( C2 );
        jlblC2.setText ( C2 + "" );
    }
    
    public double getAlto () {
        return modelo.getAltura();
    }
    
    public void setAlto ( double altura ) {
        modelo.setAltura ( altura );
        jlblAltura.setText ( altura + "" );
    }
}