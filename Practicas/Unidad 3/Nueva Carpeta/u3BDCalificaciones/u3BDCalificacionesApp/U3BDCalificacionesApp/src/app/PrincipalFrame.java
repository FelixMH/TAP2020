
package app;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.tecnm.itl.jdbc.*;

public class PrincipalFrame extends javax.swing.JFrame {

    public static final String TIT_FRAME                  = "Sistema de Calificaciones";
    public static final String TIT_INICIO                 = "Porterazos Inc.";
    public static final String TIT_MODULO1                = "Alumnos";
    public static final String TIT_MODULO2                = "Materias";
    public static final String TIT_MODULO3                = "Kardex";
    public static final String ALUMNOS_TODOS_POR_NOMBRE   = "alumnos_todos_por_nombre";
    public static final String MATERIAS_TODOS_POR_MATERIA = "materias_todos_por_materia";
    public static final String KARDEX_TODOS_POR_MATRICULA = "kardex_todos_por_matricula";
    public static final String ALUMNOS_TODOS_SIN_ORDEN    = "alumnos_todos_sin_orden";
    public static final String MATERIAS_TODOS_SIN_ORDEN   = "materias_todos_sin_orden";
    public static final String KARDEX_TODOS_SIN_ORDEN     = "kardex_todos_sin_orden";
    
    private String             moduloActual;
    private Vector<String>     vecNombresColumnas;
    private Vector<String>     vecNombresColumnasBD;
    private Vector<String>     vecTiposColumnas;
    private DefaultTableModel  dtmPrincipal;
    private Properties         propConsultasSQL;
    private int                totRegistros;

    
    public PrincipalFrame() {
        initComponents();
        
        this.setTitle                   ( TIT_FRAME );
        jlblMensajeDelSistema.setText   ( "" );
        jtoolbPrincipal.setVisible      ( false );
        jpnlTabla.setVisible            ( false );
        jpnlLogoPrincipal.setVisible    ( true );
        jlblLeyendaPrincipal.setText    ( TIT_INICIO );
        jlblModulo1.setText             ( TIT_MODULO1 );
        jlblModulo2.setText             ( TIT_MODULO2 );
        jlblModulo3.setText             ( TIT_MODULO3 );
        
        prepararSentenciasSQL           ();
        
        new ConexionDBFrame ( this ).setVisible ( true );   
    }
    
    private void prepararSentenciasSQL (){
        propConsultasSQL = new Properties ();
//------------------------Consultas a la Tabla Alumnos--------------------------                
        propConsultasSQL.put( ALUMNOS_TODOS_POR_NOMBRE,
                "select * from alumnos order by nombre"
        );
        
        propConsultasSQL.put( ALUMNOS_TODOS_SIN_ORDEN,
                "select * from alumnos"
        );
//------------------------Consultas a la Tabla Materia--------------------------               
        propConsultasSQL.put( MATERIAS_TODOS_POR_MATERIA,
                "select * from materias order by materia"
        );
        
        propConsultasSQL.put( MATERIAS_TODOS_SIN_ORDEN,
                "select * from materia"
        );
//------------------------Consultas a la Tabla Kardex---------------------------                
        propConsultasSQL.put( KARDEX_TODOS_POR_MATRICULA,
                " select k.idcalific, k.matricula, a.nombre, a.apellidos, m.materia, k.periodo, k.calificacion " +
                " from kardex k, alumnos a, materias m " +  
                " where k.matricula = a.matricula and k.idmateria = m.idmateria order by k.matricula "
        );
        
        propConsultasSQL.put( KARDEX_TODOS_SIN_ORDEN,
                " select k.idcalific, k.matricula, a.nombre, a.apellidos, m.materia, k.periodo, k.calificacion " +
                " from kardex k join alumnos a on k.matricula = a.matricula" +  
                " join materias m on k.idmateria = m.idmateria "
        );
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtoolbPrincipal = new javax.swing.JToolBar();
        jbtnNuevo = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnInicio = new javax.swing.JButton();
        jbtnFiltrar = new javax.swing.JButton();
        jpnlBarraDeEstado = new javax.swing.JPanel();
        jtoolbEstatus = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jlblEstatusConexion = new javax.swing.JLabel();
        jtoolbMensajes = new javax.swing.JToolBar();
        jlblMensajeDelSistema = new javax.swing.JLabel();
        jscrollBarraBotones = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jbtnModulo1 = new javax.swing.JButton();
        jbtnModulo2 = new javax.swing.JButton();
        jbtnModulo3 = new javax.swing.JButton();
        jlblModulo1 = new javax.swing.JLabel();
        jlblModulo2 = new javax.swing.JLabel();
        jlblModulo3 = new javax.swing.JLabel();
        jpnlLeyendaPrincipal = new javax.swing.JPanel();
        jlblLeyendaPrincipal = new javax.swing.JLabel();
        jpnlTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblPrincipal = new javax.swing.JTable();
        jpnlLogoPrincipal = new javax.swing.JPanel();
        jlblLogoSistema = new javax.swing.JLabel();
        jmnbPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmniSalir = new javax.swing.JMenuItem();
        jmniAcercaDe = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jtoolbPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtoolbPrincipal.setFloatable(false);
        jtoolbPrincipal.setRollover(true);

        jbtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/blank-file.png"))); // NOI18N
        jbtnNuevo.setText("Nuevo");
        jbtnNuevo.setToolTipText("Nuevo");
        jbtnNuevo.setFocusable(false);
        jbtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtoolbPrincipal.add(jbtnNuevo);

        jbtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/edit.png"))); // NOI18N
        jbtnEditar.setText("Editar");
        jbtnEditar.setToolTipText("Editar");
        jbtnEditar.setFocusable(false);
        jbtnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtoolbPrincipal.add(jbtnEditar);

        jbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cut.png"))); // NOI18N
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.setFocusable(false);
        jbtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtoolbPrincipal.add(jbtnEliminar);

        jbtnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/home.png"))); // NOI18N
        jbtnInicio.setText("Inicio");
        jbtnInicio.setToolTipText("Regresar a Inicio");
        jbtnInicio.setFocusable(false);
        jbtnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnInicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInicioActionPerformed(evt);
            }
        });
        jtoolbPrincipal.add(jbtnInicio);

        jbtnFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/filtrar.png"))); // NOI18N
        jbtnFiltrar.setText("Filtrar");
        jbtnFiltrar.setFocusable(false);
        jbtnFiltrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnFiltrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFiltrarActionPerformed(evt);
            }
        });
        jtoolbPrincipal.add(jbtnFiltrar);

        jtoolbEstatus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtoolbEstatus.setFloatable(false);
        jtoolbEstatus.setRollover(true);

        jLabel1.setText("Estatus de la Conexión : ");
        jtoolbEstatus.add(jLabel1);

        jlblEstatusConexion.setText("<estatus>");
        jtoolbEstatus.add(jlblEstatusConexion);

        jtoolbMensajes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtoolbMensajes.setFloatable(false);
        jtoolbMensajes.setRollover(true);

        jlblMensajeDelSistema.setText("<mensajes>");
        jtoolbMensajes.add(jlblMensajeDelSistema);

        javax.swing.GroupLayout jpnlBarraDeEstadoLayout = new javax.swing.GroupLayout(jpnlBarraDeEstado);
        jpnlBarraDeEstado.setLayout(jpnlBarraDeEstadoLayout);
        jpnlBarraDeEstadoLayout.setHorizontalGroup(
            jpnlBarraDeEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBarraDeEstadoLayout.createSequentialGroup()
                .addComponent(jtoolbEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtoolbMensajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnlBarraDeEstadoLayout.setVerticalGroup(
            jpnlBarraDeEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBarraDeEstadoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpnlBarraDeEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtoolbEstatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtoolbMensajes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jbtnModulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/graduated.png"))); // NOI18N
        jbtnModulo1.setPreferredSize(new java.awt.Dimension(64, 64));
        jbtnModulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModulo1ActionPerformed(evt);
            }
        });

        jbtnModulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/notebook.png"))); // NOI18N
        jbtnModulo2.setPreferredSize(new java.awt.Dimension(64, 64));
        jbtnModulo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModulo2ActionPerformed(evt);
            }
        });

        jbtnModulo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/kardex.png"))); // NOI18N
        jbtnModulo3.setPreferredSize(new java.awt.Dimension(64, 64));
        jbtnModulo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModulo3ActionPerformed(evt);
            }
        });

        jlblModulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblModulo1.setText("Modulo 1");

        jlblModulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblModulo2.setText("Modulo 2");

        jlblModulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblModulo3.setText("Modulo 3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlblModulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnModulo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnModulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblModulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblModulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnModulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 130, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnModulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblModulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnModulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblModulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnModulo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblModulo3)
                .addContainerGap(211, Short.MAX_VALUE))
        );

        jscrollBarraBotones.setViewportView(jPanel2);

        jpnlLeyendaPrincipal.setBackground(new java.awt.Color(0, 0, 153));

        jlblLeyendaPrincipal.setFont(new java.awt.Font("Microsoft JhengHei UI", 3, 24)); // NOI18N
        jlblLeyendaPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jlblLeyendaPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblLeyendaPrincipal.setText("Modulo");

        javax.swing.GroupLayout jpnlLeyendaPrincipalLayout = new javax.swing.GroupLayout(jpnlLeyendaPrincipal);
        jpnlLeyendaPrincipal.setLayout(jpnlLeyendaPrincipalLayout);
        jpnlLeyendaPrincipalLayout.setHorizontalGroup(
            jpnlLeyendaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlLeyendaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblLeyendaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnlLeyendaPrincipalLayout.setVerticalGroup(
            jpnlLeyendaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlLeyendaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblLeyendaPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnlTabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtblPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtblPrincipal);

        javax.swing.GroupLayout jpnlTablaLayout = new javax.swing.GroupLayout(jpnlTabla);
        jpnlTabla.setLayout(jpnlTablaLayout);
        jpnlTablaLayout.setHorizontalGroup(
            jpnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        );
        jpnlTablaLayout.setVerticalGroup(
            jpnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jlblLogoSistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblLogoSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondo app.jpg"))); // NOI18N

        javax.swing.GroupLayout jpnlLogoPrincipalLayout = new javax.swing.GroupLayout(jpnlLogoPrincipal);
        jpnlLogoPrincipal.setLayout(jpnlLogoPrincipalLayout);
        jpnlLogoPrincipalLayout.setHorizontalGroup(
            jpnlLogoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblLogoSistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnlLogoPrincipalLayout.setVerticalGroup(
            jpnlLogoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblLogoSistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        jmniSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/exit.png"))); // NOI18N
        jmniSalir.setText("Salir");
        jmniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jmniSalir);

        jmnbPrincipal.add(jMenu1);

        jmniAcercaDe.setText("Ayuda");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/about.png"))); // NOI18N
        jMenuItem2.setText("Acerca de...");
        jmniAcercaDe.add(jMenuItem2);

        jmnbPrincipal.add(jmniAcercaDe);

        setJMenuBar(jmnbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtoolbPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnlBarraDeEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jscrollBarraBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnlLeyendaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnlLogoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtoolbPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jscrollBarraBotones)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpnlLeyendaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpnlLogoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnlBarraDeEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if ( ConexionDB.getInstancia().conectado() ) {
            jlblEstatusConexion.setText       ( "Conectado" );
            jlblEstatusConexion.setForeground (  Color.GREEN );
        } else {
            jlblEstatusConexion.setText       ( "Desconectado" );
            jlblEstatusConexion.setForeground (   Color.red  );
        }
    }//GEN-LAST:event_formWindowActivated

    private void jmniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniSalirActionPerformed
        ConexionDB.getInstancia ().desconectar ();
        dispose ();
    }//GEN-LAST:event_jmniSalirActionPerformed

    private void jbtnModulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModulo1ActionPerformed
        prepararVistaModulo( TIT_MODULO1 );
        
        String sql = propConsultasSQL.getProperty ( ALUMNOS_TODOS_POR_NOMBRE );
        desplegarRegistros ( sql, null );
    }//GEN-LAST:event_jbtnModulo1ActionPerformed

    private void jbtnModulo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModulo2ActionPerformed
        prepararVistaModulo( TIT_MODULO2 );
        
        String sql = propConsultasSQL.getProperty ( MATERIAS_TODOS_POR_MATERIA );
        desplegarRegistros ( sql, null );
    }//GEN-LAST:event_jbtnModulo2ActionPerformed

    private void jbtnModulo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModulo3ActionPerformed
        prepararVistaModulo( TIT_MODULO3 );
        
        String sql = propConsultasSQL.getProperty ( KARDEX_TODOS_POR_MATRICULA );
        desplegarRegistros ( sql, null );
    }//GEN-LAST:event_jbtnModulo3ActionPerformed

    private void jbtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInicioActionPerformed
        jtoolbPrincipal.setVisible    ( false );
        jpnlLogoPrincipal.setVisible  ( true );
        jpnlTabla.setVisible          ( false );
        
        jlblLeyendaPrincipal.setText  ( TIT_INICIO );
        jlblMensajeDelSistema.setText ( "" );
        moduloActual                   = "";
    }//GEN-LAST:event_jbtnInicioActionPerformed

    private void jbtnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFiltrarActionPerformed
        FiltrarDialog filtrarDialog = new FiltrarDialog ( this, true );
        filtrarDialog.setVisible ( true );
    }//GEN-LAST:event_jbtnFiltrarActionPerformed
    
    private void prepararVistaModulo ( String modulo )
    {
        moduloActual = modulo;
        jtoolbPrincipal.setVisible   ( true );
        jpnlLogoPrincipal.setVisible ( false );
        jpnlTabla.setVisible         ( true );
        
        jlblLeyendaPrincipal.setText ( modulo );
        determinarNombresColumnas    ( modulo );
        
        dtmPrincipal = new DefaultTableModel ( vecNombresColumnas, 0 );
        jtblPrincipal.setModel ( dtmPrincipal );
    }
    
    private void determinarNombresColumnas ( String modulo )
    {
      vecNombresColumnas   =  new Vector<String>();
      vecNombresColumnasBD =  new Vector<String>();
      vecTiposColumnas     =  new Vector<String>();
      if ( modulo.equals ( TIT_MODULO1 ) ){
            vecNombresColumnas.add ( "Matricula" );
            vecNombresColumnas.add ( "Nombre" );
            vecNombresColumnas.add ( "Apellidos" );
            vecNombresColumnas.add ( "Edad" );
            vecNombresColumnas.add ( "Promedio" );
            
            vecNombresColumnasBD.add ( "matricula" );
            vecNombresColumnasBD.add ( "nombre" );
            vecNombresColumnasBD.add ( "apellidos" );
            vecNombresColumnasBD.add ( "edad" );
            vecNombresColumnasBD.add ( "promedio" );
            
            vecTiposColumnas.add ( EjecutorSQL.STRING );
            vecTiposColumnas.add ( EjecutorSQL.STRING );
            vecTiposColumnas.add ( EjecutorSQL.STRING );
            vecTiposColumnas.add ( EjecutorSQL.INT );
            vecTiposColumnas.add ( EjecutorSQL.FLOAT );
            
        } else if ( modulo.equals ( TIT_MODULO2 ) ){
            vecNombresColumnas.add( "ID Materia" );
            vecNombresColumnas.add( "Materia" );
            vecNombresColumnas.add( "Creditos" );
            
            vecNombresColumnasBD.add ( "idmateria" );
            vecNombresColumnasBD.add ( "materia" );
            vecNombresColumnasBD.add ( "creditos" );
            
            vecTiposColumnas.add ( EjecutorSQL.STRING );
            vecTiposColumnas.add ( EjecutorSQL.STRING );
            vecTiposColumnas.add ( EjecutorSQL.INT );
        } else if ( modulo.equals ( TIT_MODULO3 ) ){
            vecNombresColumnas.add( "ID Calific" );
            vecNombresColumnas.add( "Matricula" );
            vecNombresColumnas.add( "Nombre" );
            vecNombresColumnas.add( "Apellidos" );
            vecNombresColumnas.add( "Materia" );
            vecNombresColumnas.add( "Periodo" );
            vecNombresColumnas.add( "Calificacion" );
            
            vecNombresColumnasBD.add ( "K.idcalificacion" );
            vecNombresColumnasBD.add ( "K.matricula" );
            vecNombresColumnasBD.add ( "A.nombre" );
            vecNombresColumnasBD.add ( "A.apellidos" );
            vecNombresColumnasBD.add ( "K.materia" );
            vecNombresColumnasBD.add ( "K.periodo" );
            vecNombresColumnasBD.add ( "K.calificacion" );
            
            vecTiposColumnas.add ( EjecutorSQL.INT );
            vecTiposColumnas.add ( EjecutorSQL.STRING );
            vecTiposColumnas.add ( EjecutorSQL.STRING );
            vecTiposColumnas.add ( EjecutorSQL.STRING );
            vecTiposColumnas.add ( EjecutorSQL.STRING );
            vecTiposColumnas.add ( EjecutorSQL.STRING );            
            vecTiposColumnas.add ( EjecutorSQL.FLOAT );
        }
    }
    
    public void desplegarRegistros ( String sql, Object [][] args ){
        ResultSet rs;
        
        try{
  
            rs = EjecutorSQL.sqlQuery ( sql, args );
            
            dtmPrincipal = new DefaultTableModel (vecNombresColumnas, 0);
            while ( rs.next() ){
                Object [] fila = crearFila ( rs );
                dtmPrincipal.addRow ( fila );
            }
            rs.close ();
            jtblPrincipal.setModel ( dtmPrincipal );
            totRegistros = dtmPrincipal.getRowCount();
            jlblMensajeDelSistema.setText ( totRegistros + " Registros Almacenados" );
        }catch( SQLException ex ){
            JOptionPane.showMessageDialog( 
                    this, ex, "Error", JOptionPane.ERROR_MESSAGE );
        }
    }
    
    private Object [] crearFila ( ResultSet rs ) throws SQLException{
        if ( moduloActual.equals ( TIT_MODULO1 ) ){
               String matricula    = rs.getString( "matricula" );
               String nombre       = rs.getString( "nombre"    );
               String apellidos    = rs.getString( "apellidos" );
               int    edad         = rs.getInt   ( "edad"      );
               float  promedio     = rs.getFloat ( "promedio"  );
                
               Object [] fila = { matricula, nombre, apellidos, edad, promedio };
               return fila;
        }else if ( moduloActual.equals ( TIT_MODULO2 ) ){
               String idmateria    = rs.getString ( "idmateria" );
               String materia      = rs.getString ( "materia"   );
               int    creditos     = rs.getInt    ( "creditos"  );
            
               Object [] fila = { idmateria, materia, creditos };
               return fila;
        }else if ( moduloActual.equals ( TIT_MODULO3 ) ){
               int    idCalific    = rs.getInt   ( "idcalific"   );
               String matricula    = rs.getString( "matricula"   );
               String nombre       = rs.getString( "nombre"      );
               String apellidos    = rs.getString( "apellidos"   );
               String materia      = rs.getString( "materia"     );
               String periodo      = rs.getString( "periodo"    );
               float  calificacion = rs.getFloat ( "calificacion" );
             
               Object [] fila = { idCalific, matricula, nombre, apellidos, materia, 
                                  periodo, calificacion };
               return fila;
        }else
            return null;
    }
    
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible ( false );
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnFiltrar;
    private javax.swing.JButton jbtnInicio;
    private javax.swing.JButton jbtnModulo1;
    private javax.swing.JButton jbtnModulo2;
    private javax.swing.JButton jbtnModulo3;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JLabel jlblEstatusConexion;
    private javax.swing.JLabel jlblLeyendaPrincipal;
    private javax.swing.JLabel jlblLogoSistema;
    private javax.swing.JLabel jlblMensajeDelSistema;
    private javax.swing.JLabel jlblModulo1;
    private javax.swing.JLabel jlblModulo2;
    private javax.swing.JLabel jlblModulo3;
    private javax.swing.JMenuBar jmnbPrincipal;
    private javax.swing.JMenu jmniAcercaDe;
    private javax.swing.JMenuItem jmniSalir;
    private javax.swing.JPanel jpnlBarraDeEstado;
    private javax.swing.JPanel jpnlLeyendaPrincipal;
    private javax.swing.JPanel jpnlLogoPrincipal;
    private javax.swing.JPanel jpnlTabla;
    private javax.swing.JScrollPane jscrollBarraBotones;
    private javax.swing.JTable jtblPrincipal;
    private javax.swing.JToolBar jtoolbEstatus;
    private javax.swing.JToolBar jtoolbMensajes;
    private javax.swing.JToolBar jtoolbPrincipal;
    // End of variables declaration//GEN-END:variables

    public String getModuloActual() {
        return moduloActual;
    }

    public void setModuloActual(String moduloActual) {
        this.moduloActual = moduloActual;
    }

    public Vector<String> getVecNombresColumnas() {
        return vecNombresColumnas;
    }

    public void setVecNombresColumnas(Vector<String> vecNombresColumnas) {
        this.vecNombresColumnas = vecNombresColumnas;
    }

    public Vector<String> getVecNombresColumnasBD() {
        return vecNombresColumnasBD;
    }

    public void setVecNombresColumnasBD(Vector<String> vecNombresColumnasBD) {
        this.vecNombresColumnasBD = vecNombresColumnasBD;
    }

    public Vector<String> getVecTiposColumnas() {
        return vecTiposColumnas;
    }

    public void setVecTiposColumnas(Vector<String> vecTiposColumnas) {
        this.vecTiposColumnas = vecTiposColumnas;
    }

    public Properties getPropConsultasSQL() {
        return propConsultasSQL;
    }

    public void setPropConsultasSQL(Properties propConsultasSQL) {
        this.propConsultasSQL = propConsultasSQL;
    }
}