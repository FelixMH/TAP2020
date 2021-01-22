/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                    JFrame para probar la clase Conversiones
:*        
:*  Archivo     : ConversionesFrame.java
:*  Autor       : Felix Gerardo Martínez Hinojo 17130800
:*  Fecha       : 12/OCT/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripcion : Aplicacion que sirve para mostrar el correcto funcionamiento de los metodos
:*                de la clase Conversiones
:*  Ultima modif: 
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  12/OCT/2020 FelixMtz           se añadió el prologo.
:*------------------------------------------------------------------------------------------*/
package app.conversiones;

import java.text.DecimalFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ConversionesFrame extends javax.swing.JFrame {

    public ConversionesFrame() {
        initComponents();       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTF_Unidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCB_Conversiones = new javax.swing.JComboBox<>();
        jLab_Resultado = new javax.swing.JLabel();
        jBut_Calcular = new javax.swing.JButton();
        jbtnAcercaDe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ConversionesApp");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Conversion:");

        jCB_Conversiones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De °C a °F", "De °F a °C", "De Yardas a Metros", "De Metros a Yardas", "De Libras a Kilos", "De Kilos a Libras", "De Decimal A Binario", "De Binario A Decimal" }));

        jLab_Resultado.setBackground(new java.awt.Color(255, 255, 255));
        jLab_Resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLab_Resultado.setOpaque(true);

        jBut_Calcular.setText("Calcular");
        jBut_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_CalcularActionPerformed(evt);
            }
        });

        jbtnAcercaDe.setText("?");
        jbtnAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAcercaDeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTF_Unidad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLab_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCB_Conversiones, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtnAcercaDe)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jBut_Calcular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCB_Conversiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLab_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_Unidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jBut_Calcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(jbtnAcercaDe)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
    private void jbtnAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAcercaDeActionPerformed
        // TODO add your handling code here:
        Icon ITL = new ImageIcon(getClass().getResource("/iconos/ITL Chica.png"));

        JOptionPane.showMessageDialog(this, "Tecnologico Nacional De Mexico\n"+
            "Instituto Tecnologico De La Laguna\n\n"+
            "ConversionesApp v1.0 \n\n" +
            "Autor: Félix Gerardo Martínez Hinojo",
            "Acerca De", JOptionPane.INFORMATION_MESSAGE, ITL);
    }//GEN-LAST:event_jbtnAcercaDeActionPerformed

    //--------------------------------------------------------------------------
    
    private void jBut_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_CalcularActionPerformed
        double unidad = Double.parseDouble(jTF_Unidad.getText());
        switch(jCB_Conversiones.getSelectedIndex()){
            case 0: 
                jLab_Resultado.setText(Conversiones.CelsiusAFahrenheit(unidad)+"");
            break;
            case 1: 
                jLab_Resultado.setText(Conversiones.FahrenheitACelsius(unidad)+"");
            break;  
            case 2: 
                jLab_Resultado.setText(Conversiones.YardasAMetros(unidad)+"");
            break;  
            case 3: 
                jLab_Resultado.setText(Conversiones.MetrosAYardas(unidad)+"");
            break;  
            case 4: 
                jLab_Resultado.setText(Conversiones.LibrasAKilos(unidad)+"");
            break;  
            case 5: 
                jLab_Resultado.setText(Conversiones.KilosALibras(unidad)+"");
            break;  
            case 6: 
                jLab_Resultado.setText(Conversiones.DecimalABinario(Integer.parseInt(jTF_Unidad.getText()))+"");
            break;  
            case 7: 
                jLab_Resultado.setText(Conversiones.BinarioADecimal(jTF_Unidad.getText())+"");
            break;                                  
        }
    }//GEN-LAST:event_jBut_CalcularActionPerformed

    //--------------------------------------------------------------------------
    
    public static void ejecutar(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversionesFrame().setVisible(true);
            }
        });
    }
    
    //--------------------------------------------------------------------------
    
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
            java.util.logging.Logger.getLogger(ConversionesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversionesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversionesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversionesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        ejecutar();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBut_Calcular;
    private javax.swing.JComboBox<String> jCB_Conversiones;
    private javax.swing.JLabel jLab_Resultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTF_Unidad;
    private javax.swing.JButton jbtnAcercaDe;
    // End of variables declaration//GEN-END:variables
}
