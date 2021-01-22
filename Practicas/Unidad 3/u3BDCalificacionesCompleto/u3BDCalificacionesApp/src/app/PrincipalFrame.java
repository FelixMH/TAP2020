/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                       Formulario de Reconexión a bases de datos. Vista Principal de la app.
:*        
:*  Archivo     : PrincipalFrame.java
:*  Autor       : Félix Gerardo Martínez Hinojo     17130800
:*  Fecha       : 01/DIC/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripci�n : Clase Frame con la parte visual programada de la reconexión a la base de datos, entre la cual podemos acceder a la base de datos y
                    Manejar información de categorias como Alumnos, Materias, Kardex, etc.
:*                
                    - ID Materia
                    - Materia
                    - Creditos
                  a traves de su clase pertinente.
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  01/DIC/2020 Félix Mtz       Se añadió el dialog al proyecto y se le dió la definición básica..
    03/DIC/2020 Félix Mtz       Se añadieron los metodos pertinentes para acceder a la información.
    04/DIC/2020 Félix Mtz       Añadida la funcionalidad Del Menú toolbar - Inicio
    07/DIC/2020 Félix Mtz       Añadida la funcionalidad Del Sidebar - Mostrar Alumnos
    09/DIC/2020 Félix Mtz       Añadida la funcionalidad Del Sidebar - Mostrar Materias
    10/DIC/2020 Félix Mtz       Añadida la funcionalidad Del Sidebar - Mostrar Kardex
    11/DIC/2020 Félix Mtz       Se añade la funcionalidad de Filtrar - Toolbar Menu
    11/DIC/2020 Félix Mtz       Se añade la funcionalidad de Editar  - Toolbar Menu
    11/DIC/2020 Félix Mtz       Se añade la funcionalidad de Nuevo   - Toolbar Menu
    14/DIC/2020 Félix Mtz       Se edita y termina la funcionalidad de el Menu Toolbar.
    15/DIC/2020 Félix Mtz       Se añadió funcionalidad nueva, como la funcion RecalcularPromedios para actualizar los promedios de manera automática.
:*------------------------------------------------------------------------------------------*/
package app;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Properties;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo1;
import modelo.Modelo2;
import modelo.Modelo3;
import mx.tecnm.itl.extras.AcercaDeDialog;
import mx.tecnm.itl.jdbc.*;



public class PrincipalFrame extends javax.swing.JFrame {

    public static final String NUEVO = "Nuevo";
    public static final String EDITAR = "Editar";
    
    public static final String TIT_FRAME                            =   "Sistema De Calificaciones";
    public static final String TIT_INICIO                           =   "Porterazos Inc";
    public static final String TIT_MODULO1                          =   "Alumnos";
    public static final String TIT_MODULO2                          =   "Materias";
    public static final String TIT_MODULO3                          =   "Kardex";
    
    public static final String ALUMNOS_TODOS_POR_NOMBRE             =   "alumnos_todos_por_nombre";
    public static final String ALUMNOS_TODOS_SIN_ORDEN              =   "alumnos_todos_sin_orden";
    public static final String ALUMNOS_ELIMINAR_X_MATRICULA         =   "alumnos_eliminar_x_matricula";
    public static final String ALUMNOS_ACTUALIZA_DATOS              =   "alumnos_actualiza_datos";
    public static final String ALUMNOS_INSERTA_NUEVO                =   "alumnos_inserta_nuevo";
    public static final String ALUMNOS_ACTUALIZA_PROMEDIOS          =   "alumnos_actualiza_promedios";
    
    
    public static final String MATERIAS_TODOS_POR_MATERIA           =   "materias_todos_por_materia";
    public static final String MATERIAS_TODOS_SIN_ORDEN             =   "materias_todos_sin_orden";
    public static final String MATERIAS_ELIMINAR_X_IDMATERIA        =   "materias_eliminar_x_IDMateria";
    
    public static final String MATERIAS_ACTUALIZA_DATOS             =   "materias_actualiza_datos";
    public static final String MATERIAS_INSERTA_NUEVO               =   "materias_inserta_nuevo";
    
    public static final String KARDEX_TODOS_POR_MATRICULA           =   "kardex_todos_por_matricula";
    public static final String KARDEX_TODOS_SIN_ORDEN               =   "kardex_todos_sin_orden";
    public static final String KARDEX_ELIMINAR_X_IDCALIFIC          =   "kardex_eliminar_x_IDCalific";
    
    public static final String KARDEX_ACTUALIZA_DATOS               =   "kardex_actualiza_datos";
    public static final String KARDEX_INSERTA_NUEVO                 =   "kardex_inserta_nuevo";
    public static final String KARDEX_OBT_MAX_ID                    =   "kardex_obt_max_id";
    
    
    private String                      moduloActual;
    private Vector<String>              vecNombresColumnas;
    private Vector<String>              vecNombresColumnasBD;
    private Vector<String>              vecTiposColumnas;
    private DefaultTableModel           dtmPrincipal;
    private Properties                  propConsultasSQL;
    private int                         totRegistros;
    
    // ---------------------------------------------------------------------------------
    public PrincipalFrame() {
        initComponents();
        
        this.setTitle                   ( TIT_FRAME );
        jlblMensajesSistema.setText     ( "" );
        jtoolbarPrincipal.setVisible    ( false );
        jpanelTabla.setVisible          ( false );
        jpanelLogoPrincipal.setVisible  ( true );
        jlblLeyendaPrincipal.setText    ( TIT_INICIO );
        jlblModulo1.setText             ( TIT_MODULO1 );
        jlblModulo2.setText             ( TIT_MODULO2 );
        jlblModulo3.setText             ( TIT_MODULO3 );
        
        jmniModulo1.setText ( TIT_MODULO1 );
        jmniModulo2.setText ( TIT_MODULO2 );
        jmniModulo3.setText ( TIT_MODULO3 );
        
        
        prepararSentenciasSQL ();
        
        new ConexionDBFrame ( this ).setVisible( true );
        
    }
    // ---------------------------------------------------------------------------------
    
    private void prepararSentenciasSQL (  ) {
        propConsultasSQL = new Properties ();
        // ----------------------------------------------------------------------------------------------------------------------------------------
        // ALUMNOS
        propConsultasSQL.put ( ALUMNOS_TODOS_POR_NOMBRE, "SELECT * FROM Alumnos ORDER BY nombre" );
        propConsultasSQL.put ( ALUMNOS_TODOS_SIN_ORDEN, "SELECT * FROM Alumnos" );
        propConsultasSQL.put ( ALUMNOS_ELIMINAR_X_MATRICULA, "DELETE FROM Alumnos WHERE MATRICULA = ?" );
        
        propConsultasSQL.put ( ALUMNOS_ACTUALIZA_DATOS, "UPDATE Alumnos SET nombre = ? , apellidos = ? , edad = ? , promedio = ? " +
                                            " WHERE matricula = ? " );
        propConsultasSQL.put ( ALUMNOS_INSERTA_NUEVO, "INSERT INTO Alumnos VALUES ( ?, ?, ? , ? , ? )" );
        
        
        propConsultasSQL.put ( ALUMNOS_ACTUALIZA_PROMEDIOS, "UPDATE Alumnos a SET PROMEDIO = ( "
                + "SELECT AVG ( CALIFICACION ) FROM Kardex k "
                + "WHERE k.MATRICULA = a.MATRICULA )" );
        
        // ----------------------------------------------------------------------------------------------------------------------------------------
        // MATERIAS
        propConsultasSQL.put ( MATERIAS_TODOS_POR_MATERIA, "SELECT * FROM Materias ORDER BY materia" );
        propConsultasSQL.put ( MATERIAS_TODOS_SIN_ORDEN, "SELECT * FROM Materias" );
        propConsultasSQL.put ( MATERIAS_ELIMINAR_X_IDMATERIA, "DELETE FROM Materias WHERE IDMATERIA = ?" );
        
        propConsultasSQL.put ( MATERIAS_ACTUALIZA_DATOS, "UPDATE Materias SET materia = ? , creditos = ? " +
                                            " WHERE idmateria = ? " );
        propConsultasSQL.put ( MATERIAS_INSERTA_NUEVO, "INSERT INTO Materias VALUES ( ?, ?, ? )" );
        
        // ----------------------------------------------------------------------------------------------------------------------------------------
        // KARDEX
        propConsultasSQL.put ( KARDEX_ELIMINAR_X_IDCALIFIC, "DELETE FROM Kardex WHERE IDCALIFIC = ?" );
        propConsultasSQL.put ( KARDEX_TODOS_SIN_ORDEN, 
                "SELECT k.IDCALIFIC, a.MATRICULA, a.NOMBRE, a.APELLIDOS, m.IDMATERIA, m.MATERIA, k.PERIODO, k.CALIFICACION " +
                "FROM Alumnos a JOIN KARDEX k ON a.MATRICULA = k.MATRICULA " +
                "JOIN Materias m ON m.IDMATERIA = k.IDMATERIA" 
        );
        propConsultasSQL.put ( KARDEX_TODOS_POR_MATRICULA, 
            "SELECT k.IDCALIFIC, a.MATRICULA, a.NOMBRE, a.APELLIDOS,m.IDMATERIA, m.MATERIA , k.PERIODO, k.CALIFICACION \n" +
            "    FROM Alumnos a, Kardex k , Materias m WHERE a.MATRICULA = k.MATRICULA AND k.IDMATERIA = m.IDMATERIA \n" +
            "    ORDER BY k.MATRICULA" );
        
        propConsultasSQL.put ( KARDEX_ACTUALIZA_DATOS, "UPDATE Kardex SET MATRICULA = ? , IDMATERIA = ?, PERIODO = ?, CALIFICACION = ? "
                + "WHERE IDCALIFIC = ?" );
        propConsultasSQL.put ( KARDEX_INSERTA_NUEVO, "INSERT INTO Kardex VALUES ( ?, ?, ?, ?, ? )" );
        propConsultasSQL.put ( KARDEX_OBT_MAX_ID, "SELECT MAX ( IDCALIFIC ) AS maxid FROM Kardex" );
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtoolbarPrincipal = new javax.swing.JToolBar();
        jbtnNuevo = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnInicio = new javax.swing.JButton();
        jbtnFiltrar = new javax.swing.JButton();
        jpanelBarraEstado = new javax.swing.JPanel();
        jtoolbarEstatus = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jlblEstatusConexion = new javax.swing.JLabel();
        jtoolbarMensajes = new javax.swing.JToolBar();
        jlblMensajesSistema = new javax.swing.JLabel();
        jscrollpaneBarraModulosBotones = new javax.swing.JScrollPane();
        jpanelBarraModulos = new javax.swing.JPanel();
        jbtnModulo1 = new javax.swing.JButton();
        jbtnModulo2 = new javax.swing.JButton();
        jbtnModulo3 = new javax.swing.JButton();
        jlblModulo1 = new javax.swing.JLabel();
        jlblModulo2 = new javax.swing.JLabel();
        jlblModulo3 = new javax.swing.JLabel();
        jpanelLeyendaPrincipal = new javax.swing.JPanel();
        jlblLeyendaPrincipal = new javax.swing.JLabel();
        jpanelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablePrincipal = new javax.swing.JTable();
        jpanelLogoPrincipal = new javax.swing.JPanel();
        jlblLogoSistema = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_Salir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmnReportes = new javax.swing.JMenu();
        jmniModulo1 = new javax.swing.JMenuItem();
        jmniModulo2 = new javax.swing.JMenuItem();
        jmniModulo3 = new javax.swing.JMenuItem();
        jmnRecalcularPromedios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmi_AcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setExtendedState(6);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jtoolbarPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtoolbarPrincipal.setRollover(true);

        jbtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/newFile_24px.png"))); // NOI18N
        jbtnNuevo.setText("Nuevo");
        jbtnNuevo.setFocusable(false);
        jbtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });
        jtoolbarPrincipal.add(jbtnNuevo);

        jbtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/edit_24px.png"))); // NOI18N
        jbtnEditar.setText("Editar");
        jbtnEditar.setFocusable(false);
        jbtnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });
        jtoolbarPrincipal.add(jbtnEditar);

        jbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/delete_24x.png"))); // NOI18N
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.setFocusable(false);
        jbtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });
        jtoolbarPrincipal.add(jbtnEliminar);

        jbtnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/home_24px.png"))); // NOI18N
        jbtnInicio.setText("Inicio");
        jbtnInicio.setFocusable(false);
        jbtnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnInicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInicioActionPerformed(evt);
            }
        });
        jtoolbarPrincipal.add(jbtnInicio);

        jbtnFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/filter.png"))); // NOI18N
        jbtnFiltrar.setText("Filtrar");
        jbtnFiltrar.setFocusable(false);
        jbtnFiltrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnFiltrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFiltrarActionPerformed(evt);
            }
        });
        jtoolbarPrincipal.add(jbtnFiltrar);

        jtoolbarEstatus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtoolbarEstatus.setRollover(true);

        jLabel1.setText("Estatus de la conexión:");
        jtoolbarEstatus.add(jLabel1);

        jlblEstatusConexion.setText("<Estatus>");
        jtoolbarEstatus.add(jlblEstatusConexion);

        jtoolbarMensajes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtoolbarMensajes.setRollover(true);

        jlblMensajesSistema.setText("<Mensajes>");
        jtoolbarMensajes.add(jlblMensajesSistema);

        javax.swing.GroupLayout jpanelBarraEstadoLayout = new javax.swing.GroupLayout(jpanelBarraEstado);
        jpanelBarraEstado.setLayout(jpanelBarraEstadoLayout);
        jpanelBarraEstadoLayout.setHorizontalGroup(
            jpanelBarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelBarraEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtoolbarEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtoolbarMensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpanelBarraEstadoLayout.setVerticalGroup(
            jpanelBarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelBarraEstadoLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addGroup(jpanelBarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtoolbarMensajes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtoolbarEstatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jbtnModulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Student_32px.png"))); // NOI18N
        jbtnModulo1.setToolTipText("Alumnos");
        jbtnModulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModulo1ActionPerformed(evt);
            }
        });

        jbtnModulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/book_32px.png"))); // NOI18N
        jbtnModulo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModulo2ActionPerformed(evt);
            }
        });

        jbtnModulo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Kardex_32px.png"))); // NOI18N
        jbtnModulo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModulo3ActionPerformed(evt);
            }
        });

        jlblModulo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblModulo1.setText("Modulo 1");

        jlblModulo2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblModulo2.setText("Modulo 2");

        jlblModulo3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblModulo3.setText("Modulo 3");

        javax.swing.GroupLayout jpanelBarraModulosLayout = new javax.swing.GroupLayout(jpanelBarraModulos);
        jpanelBarraModulos.setLayout(jpanelBarraModulosLayout);
        jpanelBarraModulosLayout.setHorizontalGroup(
            jpanelBarraModulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelBarraModulosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelBarraModulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnModulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(jbtnModulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnModulo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpanelBarraModulosLayout.createSequentialGroup()
                        .addGroup(jpanelBarraModulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblModulo1)
                            .addComponent(jlblModulo2)
                            .addComponent(jlblModulo3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpanelBarraModulosLayout.setVerticalGroup(
            jpanelBarraModulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelBarraModulosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jbtnModulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlblModulo1)
                .addGap(36, 36, 36)
                .addComponent(jbtnModulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlblModulo2)
                .addGap(24, 24, 24)
                .addComponent(jbtnModulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlblModulo3)
                .addContainerGap(308, Short.MAX_VALUE))
        );

        jscrollpaneBarraModulosBotones.setViewportView(jpanelBarraModulos);

        jpanelLeyendaPrincipal.setBackground(new java.awt.Color(0, 0, 153));

        jlblLeyendaPrincipal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblLeyendaPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jlblLeyendaPrincipal.setText("Modulo");

        javax.swing.GroupLayout jpanelLeyendaPrincipalLayout = new javax.swing.GroupLayout(jpanelLeyendaPrincipal);
        jpanelLeyendaPrincipal.setLayout(jpanelLeyendaPrincipalLayout);
        jpanelLeyendaPrincipalLayout.setHorizontalGroup(
            jpanelLeyendaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelLeyendaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblLeyendaPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelLeyendaPrincipalLayout.setVerticalGroup(
            jpanelLeyendaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelLeyendaPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlblLeyendaPrincipal)
                .addGap(19, 19, 19))
        );

        jpanelTabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtablePrincipal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtablePrincipal);

        javax.swing.GroupLayout jpanelTablaLayout = new javax.swing.GroupLayout(jpanelTabla);
        jpanelTabla.setLayout(jpanelTablaLayout);
        jpanelTablaLayout.setHorizontalGroup(
            jpanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jpanelTablaLayout.setVerticalGroup(
            jpanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
        );

        jlblLogoSistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblLogoSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/school_big.png"))); // NOI18N

        javax.swing.GroupLayout jpanelLogoPrincipalLayout = new javax.swing.GroupLayout(jpanelLogoPrincipal);
        jpanelLogoPrincipal.setLayout(jpanelLogoPrincipalLayout);
        jpanelLogoPrincipalLayout.setHorizontalGroup(
            jpanelLogoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelLogoPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblLogoSistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelLogoPrincipalLayout.setVerticalGroup(
            jpanelLogoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelLogoPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblLogoSistema, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        jmi_Salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jmi_Salir.setText("Salir");
        jmi_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_SalirActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_Salir);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Herramientas");

        jmnReportes.setText("Reportes");

        jmniModulo1.setText("Modulo1");
        jmnReportes.add(jmniModulo1);

        jmniModulo2.setText("Modulo2");
        jmnReportes.add(jmniModulo2);

        jmniModulo3.setText("Modulo3");
        jmnReportes.add(jmniModulo3);

        jMenu3.add(jmnReportes);

        jmnRecalcularPromedios.setText("Recalcular Promedios");
        jmnRecalcularPromedios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnRecalcularPromediosActionPerformed(evt);
            }
        });
        jMenu3.add(jmnRecalcularPromedios);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Ayuda");

        jmi_AcercaDe.setText("Acerca De");
        jmi_AcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AcercaDeActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_AcercaDe);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtoolbarPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
            .addComponent(jpanelBarraEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jscrollpaneBarraModulosBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanelLeyendaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanelLogoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtoolbarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpanelLeyendaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jpanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpanelLogoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jscrollpaneBarraModulosBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpanelBarraEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // ---------------------------------------------------------------------------------
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if ( ConexionDB.getInstancia().conectado () ) {
            jlblEstatusConexion.setText ( "Conectado" );
            jlblEstatusConexion.setForeground ( Color.BLUE );
        } else {
            jlblEstatusConexion.setForeground( Color.RED );
        }
    }//GEN-LAST:event_formWindowActivated
    // ---------------------------------------------------------------------------------
    private void jmi_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_SalirActionPerformed
        ConexionDB.getInstancia().desconectar ();
        dispose ();
    }//GEN-LAST:event_jmi_SalirActionPerformed
    // ---------------------------------------------------------------------------------
    private void jbtnModulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModulo1ActionPerformed
        prepararVistaModulo ( TIT_MODULO1 );
        
        String sql = propConsultasSQL.getProperty ( ALUMNOS_TODOS_POR_NOMBRE );
        desplegarRegistros ( sql, null );
    }//GEN-LAST:event_jbtnModulo1ActionPerformed
    // ---------------------------------------------------------------------------------
    private void jbtnModulo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModulo2ActionPerformed
        prepararVistaModulo ( TIT_MODULO2 );
        
        String sql = propConsultasSQL.getProperty ( MATERIAS_TODOS_POR_MATERIA );
        desplegarRegistros ( sql, null );
        
    }//GEN-LAST:event_jbtnModulo2ActionPerformed
    // ---------------------------------------------------------------------------------
    private void jbtnModulo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModulo3ActionPerformed
        prepararVistaModulo ( TIT_MODULO3 );
        
        String sql = propConsultasSQL.getProperty ( KARDEX_TODOS_POR_MATRICULA );
        desplegarRegistros ( sql, null );
    }//GEN-LAST:event_jbtnModulo3ActionPerformed
    // ---------------------------------------------------------------------------------
    private void jbtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInicioActionPerformed
        jtoolbarPrincipal.setVisible            ( false );
        jpanelLogoPrincipal.setVisible          ( true );
        jpanelTabla.setVisible                  ( false );
        
        jlblLeyendaPrincipal.setText            ( TIT_INICIO );
        moduloActual                            = "";
        
        jlblMensajesSistema.setText ( "" );
    }//GEN-LAST:event_jbtnInicioActionPerformed
    // ---------------------------------------------------------------------------------
    private void jbtnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFiltrarActionPerformed
        FiltrarDialog fd = new FiltrarDialog ( this, true );
        fd.setVisible ( true );
    }//GEN-LAST:event_jbtnFiltrarActionPerformed
    // ---------------------------------------------------------------------------------
    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        int pos = jtablePrincipal.getSelectedRow ();
        if ( pos == -1 ) {
            JOptionPane.showMessageDialog ( this,
                                "No hay un registro seleccionado", 
                                "Eliminar", 
                                JOptionPane.ERROR_MESSAGE 
            );
            return;
        }
        
        int confirma = JOptionPane.showConfirmDialog (
                this,
                "Eliminar el registro seleccionado? ",
                "Eliminar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
        
        if ( confirma == JOptionPane.NO_OPTION )
            return;
        
        String valorLlavePrim   = jtablePrincipal.getValueAt ( pos, 0 ).toString ();
        String tipoLlavePrim    = vecTiposColumnas.elementAt ( 0 );
        String sql              = "";
        JButton jbtnModulo      = null;
        
        if ( moduloActual == TIT_MODULO1 ) {
            sql = propConsultasSQL.getProperty ( ALUMNOS_ELIMINAR_X_MATRICULA );
            jbtnModulo = jbtnModulo1;
        } else if ( moduloActual == TIT_MODULO2 ) {
            sql = propConsultasSQL.getProperty ( MATERIAS_ELIMINAR_X_IDMATERIA );
            jbtnModulo = jbtnModulo2;
        } else if ( moduloActual == TIT_MODULO3 ) {
            sql = propConsultasSQL.getProperty ( KARDEX_ELIMINAR_X_IDCALIFIC );
            jbtnModulo = jbtnModulo3;
        }
        
        Object[][] args = { { tipoLlavePrim, valorLlavePrim } };
        
        try {
            int regs    =   EjecutorSQL.sqlEjecutar ( sql, args );
            if ( regs == 1 ) {
                jbtnModulo.doClick ();
                JOptionPane.showMessageDialog ( this, "Se eliminó el registro correctamente", "Error", JOptionPane.INFORMATION_MESSAGE );
            }
        } catch ( SQLIntegrityConstraintViolationException ex ) {
            JOptionPane.showMessageDialog ( 
                    this, 
                    "No se puede eliminar el registro actual porque tiene registros asociados en otras tablas", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE );
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog ( this, ex, "Error", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed
    // ---------------------------------------------------------------------------------
    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        int pos = jtablePrincipal.getSelectedRow ();
        if ( pos == -1 ) {
            JOptionPane.showMessageDialog ( this,
                                "No hay un registro seleccionado", 
                                "Eliminar", 
                                JOptionPane.ERROR_MESSAGE 
            );
            return;
        }
        
        if ( moduloActual.equals ( TIT_MODULO1 ) ) {
            String  matricula               = jtablePrincipal.getValueAt ( pos, 0 ).toString ();
            String  nombre                  = jtablePrincipal.getValueAt ( pos, 1 ).toString ();
            String  apellidos               = jtablePrincipal.getValueAt ( pos, 2 ).toString ();
            int     edad                    = Integer.parseInt ( jtablePrincipal.getValueAt ( pos, 3 ).toString () );
            float   promedio                = Float.parseFloat ( jtablePrincipal.getValueAt ( pos, 4 ).toString () );
            
            Modelo1 modelo1 = new Modelo1 ( matricula, nombre, apellidos, edad, promedio );
            
            Modulo1EditarDialog dialog = new Modulo1EditarDialog ( this, modelo1 );
            dialog.setVisible ( true );
            
        } else if ( moduloActual.equals ( TIT_MODULO2 ) ) {
            String  idmateria           = jtablePrincipal.getValueAt ( pos, 0 ).toString ();
            String  materia             = jtablePrincipal.getValueAt ( pos, 1 ).toString ();
            int     creditos            = Integer.parseInt ( jtablePrincipal.getValueAt ( pos, 2 ).toString () );
            
            Modelo2 modelo2 = new Modelo2 ( idmateria, materia, creditos );
            
            Modulo2EditarDialog dialog = new Modulo2EditarDialog ( this, modelo2 );
            dialog.setVisible ( true );
        } else if ( moduloActual.equals ( TIT_MODULO3 ) ) {
            int     idcalific                   = Integer.parseInt ( 
                                                    jtablePrincipal.getValueAt ( pos , 0 ).toString     () );
            String  matricula                   =   jtablePrincipal.getValueAt ( pos , 1 ).toString     ();
            String  idmateria                   =   jtablePrincipal.getValueAt ( pos , 4 ).toString     ();
            String  periodo                     =   jtablePrincipal.getValueAt ( pos , 6 ).toString     ();
            String  califica                    =   jtablePrincipal.getValueAt ( pos , 7 ).toString     ();
            int     calificacion                =   Integer.parseInt ( califica );
            
            Modelo3 modelo = new Modelo3 ( idcalific, matricula, idmateria, periodo, calificacion );
            
            Modulo3EditarDialog dialog = new Modulo3EditarDialog ( this, modelo );
            dialog.setVisible ( true );
        }
    }//GEN-LAST:event_jbtnEditarActionPerformed
    // ---------------------------------------------------------------------------------
    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        if ( moduloActual.equals ( TIT_MODULO1 ) ) {
            Modulo1EditarDialog dialog = new Modulo1EditarDialog ( this, null );
            dialog.setVisible ( true );
            
        } else if ( moduloActual.equals ( TIT_MODULO2 ) ) {
            Modulo2EditarDialog dialog = new Modulo2EditarDialog ( this, null );
            dialog.setVisible ( true );
        }
        else if ( moduloActual.equals ( TIT_MODULO3 ) ) {
            Modulo3EditarDialog dialog = new Modulo3EditarDialog ( this, null );
            dialog.setVisible ( true );
        }
    }//GEN-LAST:event_jbtnNuevoActionPerformed
    // ---------------------------------------------------------------------------------
    private void jmnRecalcularPromediosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnRecalcularPromediosActionPerformed
        String sql = propConsultasSQL.getProperty ( PrincipalFrame.ALUMNOS_ACTUALIZA_PROMEDIOS );
        try {
            int regs = EjecutorSQL.sqlEjecutar ( sql );
            
            JOptionPane.showMessageDialog (
                this,
                "Proceso Terminado " + regs + " Promedios Fueron Actualizados",
                "Promedios",
                JOptionPane.INFORMATION_MESSAGE
            );
            
            this.jbtnModulo1.doClick ();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog ( this, ex, "Promedios", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jmnRecalcularPromediosActionPerformed
    // ---------------------------------------------------------------------------------
    private void jmi_AcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AcercaDeActionPerformed
        jAcercaDeDialog jad_dialog = new jAcercaDeDialog ( this, true );
        jad_dialog.setVisible ( true );
    }//GEN-LAST:event_jmi_AcercaDeActionPerformed
    // ---------------------------------------------------------------------------------
    
    private void prepararVistaModulo ( String modulo ) {
        moduloActual = modulo;
        jtoolbarPrincipal.setVisible            ( true );
        jpanelLogoPrincipal.setVisible          ( false );
        jpanelTabla.setVisible                  ( true );
        
        jlblLeyendaPrincipal.setText            ( modulo );
        
        determinarNombresColumnas               ( modulo );
        
        dtmPrincipal = new DefaultTableModel    ( vecNombresColumnas, 0 );
        jtablePrincipal.setModel                ( dtmPrincipal );
    }
    // ---------------------------------------------------------------------------------
    private void determinarNombresColumnas ( String modulo ) {
        vecNombresColumnas      = new Vector<String> ();
        vecNombresColumnasBD    = new Vector<String> ();
        vecTiposColumnas        = new Vector<String> ();
        if ( modulo.equals ( TIT_MODULO1 ) ) {
            vecNombresColumnas.add ( "Matricula" );
            vecNombresColumnas.add ( "Nombre" );
            vecNombresColumnas.add ( "Apellidos" );
            vecNombresColumnas.add ( "Edad" );
            vecNombresColumnas.add ( "Promedio" );
            
            vecNombresColumnasBD.add ( "Matricula" );
            vecNombresColumnasBD.add ( "Nombre" );
            vecNombresColumnasBD.add ( "Apellidos" );
            vecNombresColumnasBD.add ( "Edad" );
            vecNombresColumnasBD.add ( "Promedio" );
            
            vecTiposColumnas.add( EjecutorSQL.STRING );
            vecTiposColumnas.add( EjecutorSQL.STRING );
            vecTiposColumnas.add( EjecutorSQL.STRING );
            vecTiposColumnas.add( EjecutorSQL.INT );
            vecTiposColumnas.add( EjecutorSQL.FLOAT );
            
            
        } else if ( modulo.equals ( TIT_MODULO2 ) ) {
            vecNombresColumnas.add ( "ID Materia" );
            vecNombresColumnas.add ( "Materia" );
            vecNombresColumnas.add ( "Creditos" );
            
            vecNombresColumnasBD.add ( "IDMateria" );
            vecNombresColumnasBD.add ( "Materia" );
            vecNombresColumnasBD.add ( "Creditos" );
            
            vecTiposColumnas.add( EjecutorSQL.STRING );
            vecTiposColumnas.add( EjecutorSQL.STRING );
            vecTiposColumnas.add( EjecutorSQL.INT );
            
        } else if ( modulo.equals ( TIT_MODULO3 ) ) {
            vecNombresColumnas.add ("ID Calific");
            vecNombresColumnas.add ( "Matricula" );
            vecNombresColumnas.add ( "Nombre" );
            vecNombresColumnas.add ( "Apellidos" );
            vecNombresColumnas.add ( "ID Materia" );
            vecNombresColumnas.add ( "Materia" );
            vecNombresColumnas.add ( "Periodo" );
            vecNombresColumnas.add ( "Calificación" );
            
            vecNombresColumnasBD.add ("k.IDCALIFIC");
            vecNombresColumnasBD.add ( "a.MATRICULA" );
            vecNombresColumnasBD.add ( "a.NOMBRE" );
            vecNombresColumnasBD.add ( "a.APELLIDOS" );
            vecNombresColumnasBD.add ( "m.IDMATERIA" );
            vecNombresColumnasBD.add ( "m.MATERIA" );
            vecNombresColumnasBD.add ( "k.PERIODO" );
            vecNombresColumnasBD.add ( "k.CALIFICACION" );
            
            vecTiposColumnas.add( EjecutorSQL.INT );
            vecTiposColumnas.add( EjecutorSQL.STRING );
            vecTiposColumnas.add( EjecutorSQL.STRING );
            vecTiposColumnas.add( EjecutorSQL.STRING );
            vecTiposColumnas.add( EjecutorSQL.STRING );
            vecTiposColumnas.add( EjecutorSQL.STRING );
            vecTiposColumnas.add( EjecutorSQL.STRING );
            vecTiposColumnas.add( EjecutorSQL.INT    );
        }
    }
    // ---------------------------------------------------------------------------------
    protected void desplegarRegistros ( String sql, Object[][] args ) {
        ResultSet rs;
        try {
            
            rs = EjecutorSQL.sqlQuery ( sql, args );
            
            dtmPrincipal = new DefaultTableModel ( vecNombresColumnas, 0 );
            while ( rs.next () ) {                
                Object[] fila = crearFila( rs );
                dtmPrincipal.addRow( fila );
                
            }
            rs.close ();
            jtablePrincipal.setModel ( dtmPrincipal );
            totRegistros = dtmPrincipal.getRowCount ();
            jlblMensajesSistema.setText ( totRegistros + " registros" );
        } catch (SQLException e) {
            JOptionPane.showMessageDialog ( this, e, " Error ", JOptionPane.ERROR_MESSAGE );
        }
    }
    // ---------------------------------------------------------------------------------
    private Object [] crearFila ( ResultSet rs ) throws SQLException {
        if ( moduloActual.equals ( TIT_MODULO1 ) ) {
            String matricula = rs.getString ( "matricula" );
            String nombre = rs.getString ( "nombre" );
            String apellidos = rs.getString ( "apellidos" );
            int edad = rs.getInt ( "edad" );
            float promedio = rs.getFloat ( "promedio" );
            
            Object [] fila = { matricula, nombre, apellidos, edad, promedio };
            return fila;
        }
        else if ( moduloActual.equals ( TIT_MODULO2 ) ) {
            String matricula = rs.getString ( "IDMATERIA" );
            String nombre = rs.getString ( "MATERIA" );
            int creditos = rs.getInt ( "CREDITOS" );
            
            Object [] fila = { matricula, nombre, creditos };
            return fila;
        }
        else if ( moduloActual.equals ( TIT_MODULO3 ) ) {
            int idCalif = rs.getInt ( "IDCALIFIC" );
            String matricula = rs.getString ( "MATRICULA" );
            String nombre = rs.getString ( "NOMBRE" );
            String apellidos = rs.getString ( "APELLIDOS" );
            String idmateria = rs.getString ( "IDMATERIA" );
            String materia = rs.getString ( "MATERIA" );
            String periodo = rs.getString ( "PERIODO" );
            int calificacion = rs.getInt  ( "CALIFICACION" );
            
            Object [] fila = { idCalif, matricula, nombre, apellidos, idmateria, materia, periodo, calificacion };
            return fila;
        }
        return null;
    }
    // ---------------------------------------------------------------------------------
    
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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
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
    private javax.swing.JLabel jlblMensajesSistema;
    private javax.swing.JLabel jlblModulo1;
    private javax.swing.JLabel jlblModulo2;
    private javax.swing.JLabel jlblModulo3;
    private javax.swing.JMenuItem jmi_AcercaDe;
    private javax.swing.JMenuItem jmi_Salir;
    private javax.swing.JMenuItem jmnRecalcularPromedios;
    private javax.swing.JMenu jmnReportes;
    private javax.swing.JMenuItem jmniModulo1;
    private javax.swing.JMenuItem jmniModulo2;
    private javax.swing.JMenuItem jmniModulo3;
    private javax.swing.JPanel jpanelBarraEstado;
    private javax.swing.JPanel jpanelBarraModulos;
    private javax.swing.JPanel jpanelLeyendaPrincipal;
    private javax.swing.JPanel jpanelLogoPrincipal;
    private javax.swing.JPanel jpanelTabla;
    private javax.swing.JScrollPane jscrollpaneBarraModulosBotones;
    private javax.swing.JTable jtablePrincipal;
    private javax.swing.JToolBar jtoolbarEstatus;
    private javax.swing.JToolBar jtoolbarMensajes;
    private javax.swing.JToolBar jtoolbarPrincipal;
    // End of variables declaration//GEN-END:variables
    public String getModuloActual() {
        return moduloActual;
    }

    public void setModuloActual( String moduloActual ) {
        this.moduloActual = moduloActual;
    }

    public Vector<String> getVecNombresColumnas() {
        return vecNombresColumnas;
    }

    public void setVecNombresColumnas( Vector<String> vecNombresColumnas ) {
        this.vecNombresColumnas = vecNombresColumnas;
    }

    public Vector<String> getVecNombresColumnasBD() {
        return vecNombresColumnasBD;
    }

    public void setVecNombresColumnasBD ( Vector<String> vecNombresColumnasBD ) {
        this.vecNombresColumnasBD = vecNombresColumnasBD;
    }

    public Vector<String> getVecTiposColumnas() {
        return vecTiposColumnas;
    }

    public void setVecTiposColumnas ( Vector<String> vecTiposColumnas ) {
        this.vecTiposColumnas = vecTiposColumnas;
    }

    public Properties getPropConsultasSQL() {
        return propConsultasSQL;
    }

    public void setPropConsultasSQL ( Properties propConsultasSQL ) {
        this.propConsultasSQL = propConsultasSQL;
    }

    public JButton getJbtnModulo1 () {
        return jbtnModulo1;
    }

    public JButton getJbtnModulo2 () {
        return jbtnModulo2;
    }

    public JButton getJbtnModulo3 () {
        return jbtnModulo3;
    }
    
    
}
