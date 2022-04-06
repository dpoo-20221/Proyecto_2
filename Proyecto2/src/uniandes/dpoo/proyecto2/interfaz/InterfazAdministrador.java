package uniandes.dpoo.proyecto2.interfaz;
import uniandes.dpoo.proyecto2.mundo.ConsolaAplicacion;
import uniandes.dpoo.proyecto2.mundo.Proyecto;
import uniandes.dpoo.proyecto2.mundo.Actividad;
import FiveCodMover.FiveCodMoverJFrame;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

/**
 *
 * @author Usuario
 */
public class InterfazAdministrador extends JFrame 
{
    
    private ConsolaAplicacion consola;
    private Proyecto proyecto;
    private Actividad actividad;
    private JButton btnCompletar;
    private JLabel iconAgregarActividad;
    private JLabel iconAgregarParticipante;
    private JLabel iconCrearProyecto;
    private JLabel iconReporteActividad;
    private JLabel iconReporteParticipante;
    private JLabel iconReporteProyecto;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JLabel lblActividades;
    private JLabel lblAgregarActividad;
    private JLabel lblAgregarParticipante;
    private JLabel lblCrearProyecto;
    private JLabel lblDescripcionActividad;
    private JLabel lblDescripcionProyecto;
    private JLabel lblExit;
    private JLabel lblFechaFinalActividad;
    private JLabel lblFechaFinalProyecto;
    private JLabel lblFechaInicialActividad;
    private JLabel lblFechaInicialProyecto;
    private JLabel lblIdProyecto;
    private JLabel lblParticipante;
    private JLabel lblProyectos;
    private JLabel lblReporteActividad;
    private JLabel lblReporteParticipante;
    private JLabel lblReporteProyecto;
    private JLabel lblTipo;
    private JList<String> lstActividades;
    private JList<String> lstProyectos;
    private JScrollPane pnlScrollActividades;
    private JScrollPane pnlScrollProyectos;
    private JTextArea txtDescripcionActividad;
    private JTextArea txtDescripcionProyecto;
    private JTextField txtFechaFinalActividad;
    private JTextField txtFechaFinalProyecto;
    private JTextField txtFechaInicialActividad;
    private JTextField txtFechaInicialProyecto;
    private JTextField txtIdProyecto;
    private JTextField txtParticipante;
    private JTextField txtTipo;
    
    public InterfazAdministrador(ConsolaAplicacion pConsola) 
    {
        initComponents();
        
        consola = pConsola;
        
        DefaultListModel<String> modeloListaProyectos= new DefaultListModel<>();
        for(Proyecto p:consola.getProyectos())
        {
            modeloListaProyectos.addElement(p.getNombre());
        }
        lstProyectos.setModel(modeloListaProyectos);
        
        lblAgregarActividad.setVisible(false);
        lblAgregarParticipante.setVisible(false);
        lblReporteProyecto.setVisible(false);
        lblReporteActividad.setVisible(false);
        
        iconAgregarActividad.setVisible(false);
        iconAgregarParticipante.setVisible(false);
        iconReporteProyecto.setVisible(false);
        iconReporteActividad.setVisible(false);
        
        btnCompletar.setVisible(false);
    }

    private void initComponents() {

        jPanel1 = new JPanel();
        lblCrearProyecto = new JLabel();
        iconCrearProyecto = new JLabel();
        iconAgregarParticipante = new JLabel();
        lblAgregarParticipante = new JLabel();
        iconAgregarActividad = new JLabel();
        lblAgregarActividad = new JLabel();
        lblExit = new JLabel();
        iconReporteActividad = new JLabel();
        lblReporteActividad = new JLabel();
        lblReporteParticipante = new JLabel();
        iconReporteParticipante = new JLabel();
        iconReporteProyecto = new JLabel();
        lblReporteProyecto = new JLabel();
        jPanel2 = new JPanel();
        pnlScrollProyectos = new JScrollPane();
        lstProyectos = new JList<>();
        pnlScrollActividades = new JScrollPane();
        lstActividades = new JList<>();
        lblProyectos = new JLabel();
        lblActividades = new JLabel();
        jScrollPane1 = new JScrollPane();
        txtDescripcionProyecto = new JTextArea();
        jScrollPane2 = new JScrollPane(); 
        txtDescripcionActividad = new JTextArea();
        lblDescripcionProyecto = new JLabel();
        lblDescripcionActividad = new JLabel();
        txtFechaInicialProyecto = new JTextField();
        lblFechaInicialProyecto = new JLabel();
        txtFechaFinalProyecto = new JTextField();
        lblFechaFinalProyecto = new JLabel();
        lblIdProyecto = new JLabel();
        txtIdProyecto = new JTextField();
        jSeparator1 = new JSeparator();
        jSeparator2 = new JSeparator();
        lblFechaInicialActividad = new JLabel();
        txtFechaInicialActividad = new JTextField();
        lblFechaFinalActividad = new JLabel();
        txtFechaFinalActividad = new JTextField();
        lblTipo = new JLabel();
        txtTipo = new JTextField();
        lblParticipante = new JLabel();
        txtParticipante = new JTextField();
        btnCompletar = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        setTitle("AdministradorProyectos");
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() 
        {
            public void mouseDragged(java.awt.event.MouseEvent evt) 
            {
                formMouseDragged(evt);
            }
        });
        
        addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mousePressed(java.awt.event.MouseEvent evt) 
            {
                formMousePressed(evt);
            }
        });
        
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(21, 25, 28));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCrearProyecto.setFont(new java.awt.Font("Times New Roman", 0, 12));
        lblCrearProyecto.setForeground(new java.awt.Color(16, 95, 149));
        lblCrearProyecto.setText("Crear Proyecto");
        jPanel1.add(lblCrearProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 46, -1, -1));

        iconCrearProyecto.setHorizontalAlignment(SwingConstants.CENTER);
        iconCrearProyecto.setIcon(new ImageIcon("./data/IconoAgregarProyecto.png"));
        
        iconCrearProyecto.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                iconCrearProyectoMouseClicked(evt);
            }
        });
        
        jPanel1.add(iconCrearProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 90, 60));

        iconAgregarParticipante.setHorizontalAlignment(SwingConstants.CENTER);
        iconAgregarParticipante.setIcon(new ImageIcon("./data/IconoAgregarParticipante.png"));
       
        iconAgregarParticipante.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                iconAgregarParticipanteMouseClicked(evt);
            }
        });
        
        jPanel1.add(iconAgregarParticipante, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 110, 60));

        lblAgregarParticipante.setFont(new java.awt.Font("Times New Roman", 0, 12));
        lblAgregarParticipante.setForeground(new java.awt.Color(16, 95, 149));
        lblAgregarParticipante.setText("Agregar Participante");
        jPanel1.add(lblAgregarParticipante, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 46, -1, -1));

        iconAgregarActividad.setHorizontalAlignment(SwingConstants.CENTER);
        iconAgregarActividad.setIcon(new ImageIcon("./data/IconoAgregarActividad.png"));
        
        iconAgregarActividad.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                iconAgregarActividadMouseClicked(evt);
            }
        });
        
        jPanel1.add(iconAgregarActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 100, 60));

        lblAgregarActividad.setFont(new java.awt.Font("Times New Roman", 0, 12));
        lblAgregarActividad.setForeground(new java.awt.Color(16, 95, 149));
        lblAgregarActividad.setText("Agregar Actividad");
        jPanel1.add(lblAgregarActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 46, -1, -1));

        lblExit.setFont(new java.awt.Font("Tahoma", 0, 18));
        lblExit.setForeground(new java.awt.Color(61, 71, 100));
        lblExit.setHorizontalAlignment(SwingConstants.CENTER);
        lblExit.setText("x");
        lblExit.setVerticalAlignment(SwingConstants.BOTTOM);
        
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                lblExitMouseClicked(evt);
            }
        });
        
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(954, 6, 20, 20));

        iconReporteActividad.setHorizontalAlignment(SwingConstants.CENTER);
        iconReporteActividad.setIcon(new ImageIcon("./data/IconoReporteActividad.png"));
       
        iconReporteActividad.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                iconReporteActividadMouseClicked(evt);
            }
        });
        
        jPanel1.add(iconReporteActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 90, 60));

        lblReporteActividad.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblReporteActividad.setForeground(new java.awt.Color(16, 95, 149));
        lblReporteActividad.setText("Reporte Actividad");
        jPanel1.add(lblReporteActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 46, -1, -1));

        lblReporteParticipante.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblReporteParticipante.setForeground(new java.awt.Color(16, 95, 149));
        lblReporteParticipante.setText("Reporte Participante");
        jPanel1.add(lblReporteParticipante, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 46, -1, -1));

        iconReporteParticipante.setHorizontalAlignment(SwingConstants.CENTER);
        iconReporteParticipante.setIcon(new ImageIcon("./data/IconoReporteParticipante.png")); 
        iconReporteParticipante.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                iconReporteParticipanteMouseClicked(evt);
            }
        });
        
        jPanel1.add(iconReporteParticipante, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 110, 60));

        iconReporteProyecto.setHorizontalAlignment(SwingConstants.CENTER);
        iconReporteProyecto.setIcon(new ImageIcon("./data/IconoReporteProyecto.png"));
        
        iconReporteProyecto.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                iconReporteProyectoMouseClicked(evt);
            }
        });
        
        jPanel1.add(iconReporteProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 100, 60));

        lblReporteProyecto.setFont(new java.awt.Font("Times New Roman", 0, 12));
        lblReporteProyecto.setForeground(new java.awt.Color(16, 95, 149));
        lblReporteProyecto.setText("Reporte Proyecto");
        jPanel1.add(lblReporteProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 46, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 980, 70));

        jPanel2.setBackground(new java.awt.Color(34, 40, 44));

        lstProyectos.setBackground(new java.awt.Color(21, 25, 28));
        lstProyectos.setBorder(null);
        lstProyectos.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        lstProyectos.setForeground(new java.awt.Color(255, 255, 255));
        lstProyectos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lstProyectos.addListSelectionListener(new javax.swing.event.ListSelectionListener() 
        {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) 
            {
                lstProyectosValueChanged(evt);
            }
        });
        
        pnlScrollProyectos.setViewportView(lstProyectos);

        lstActividades.setBackground(new java.awt.Color(21, 25, 28));
        lstActividades.setBorder(null);
        lstActividades.setFont(new java.awt.Font("Times New Roman", 0, 14));
        lstActividades.setForeground(new java.awt.Color(255, 255, 255));
        lstActividades.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        lstActividades.addListSelectionListener(new javax.swing.event.ListSelectionListener() 
        {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) 
            {
                lstActividadesValueChanged(evt);
            }
        });
        
        pnlScrollActividades.setViewportView(lstActividades);

        lblProyectos.setFont(new java.awt.Font("Times New Roman", 1, 14));
        lblProyectos.setForeground(new java.awt.Color(16, 95, 149));
        lblProyectos.setText("Proyectos");

        lblActividades.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        lblActividades.setForeground(new java.awt.Color(16, 95, 149));
        lblActividades.setText("Actividades");

        txtDescripcionProyecto.setEditable(false);
        txtDescripcionProyecto.setBackground(new java.awt.Color(21, 25, 28));
        txtDescripcionProyecto.setColumns(20);
        txtDescripcionProyecto.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        txtDescripcionProyecto.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcionProyecto.setLineWrap(true);
        txtDescripcionProyecto.setRows(5);
        jScrollPane1.setViewportView(txtDescripcionProyecto);

        txtDescripcionActividad.setEditable(false);
        txtDescripcionActividad.setBackground(new java.awt.Color(21, 25, 28));
        txtDescripcionActividad.setColumns(20);
        txtDescripcionActividad.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        txtDescripcionActividad.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcionActividad.setLineWrap(true);
        txtDescripcionActividad.setRows(5);
        jScrollPane2.setViewportView(txtDescripcionActividad);

        lblDescripcionProyecto.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblDescripcionProyecto.setForeground(new java.awt.Color(16, 95, 149));
        lblDescripcionProyecto.setText("Descripción proyecto");

        lblDescripcionActividad.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblDescripcionActividad.setForeground(new java.awt.Color(16, 95, 149));
        lblDescripcionActividad.setText("Descripción actividad");

        txtFechaInicialProyecto.setEditable(false);
        txtFechaInicialProyecto.setBackground(new java.awt.Color(21, 25, 28));
        txtFechaInicialProyecto.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        txtFechaInicialProyecto.setForeground(new java.awt.Color(255, 255, 255));

        lblFechaInicialProyecto.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblFechaInicialProyecto.setForeground(new java.awt.Color(16, 95, 149));
        lblFechaInicialProyecto.setText("Fecha inicial");

        txtFechaFinalProyecto.setEditable(false);
        txtFechaFinalProyecto.setBackground(new java.awt.Color(21, 25, 28));
        txtFechaFinalProyecto.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        txtFechaFinalProyecto.setForeground(new java.awt.Color(255, 255, 255));

        lblFechaFinalProyecto.setFont(new java.awt.Font("Times New Roman", 0, 12));
        lblFechaFinalProyecto.setForeground(new java.awt.Color(16, 95, 149));
        lblFechaFinalProyecto.setText("Fecha final");

        lblIdProyecto.setFont(new java.awt.Font("Times New Roman", 0, 12));
        lblIdProyecto.setForeground(new java.awt.Color(16, 95, 149));
        lblIdProyecto.setText("Id proyecto");

        txtIdProyecto.setEditable(false);
        txtIdProyecto.setBackground(new java.awt.Color(21, 25, 28));
        txtIdProyecto.setFont(new java.awt.Font("Times New Roman", 0, 12));
        txtIdProyecto.setForeground(new java.awt.Color(255, 255, 255));

        lblFechaInicialActividad.setFont(new java.awt.Font("Times New Roman", 0, 12));
        lblFechaInicialActividad.setForeground(new java.awt.Color(16, 95, 149));
        lblFechaInicialActividad.setText("Fecha inicial");

        txtFechaInicialActividad.setEditable(false);
        txtFechaInicialActividad.setBackground(new java.awt.Color(21, 25, 28));
        txtFechaInicialActividad.setFont(new java.awt.Font("Times New Roman", 0, 12));
        txtFechaInicialActividad.setForeground(new java.awt.Color(255, 255, 255));

        lblFechaFinalActividad.setFont(new java.awt.Font("Times New Roman", 0, 12));
        lblFechaFinalActividad.setForeground(new java.awt.Color(16, 95, 149));
        lblFechaFinalActividad.setText("Fecha final");

        txtFechaFinalActividad.setEditable(false);
        txtFechaFinalActividad.setBackground(new java.awt.Color(21, 25, 28));
        txtFechaFinalActividad.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        txtFechaFinalActividad.setForeground(new java.awt.Color(255, 255, 255));

        lblTipo.setFont(new java.awt.Font("Times New Roman", 0, 12));
        lblTipo.setForeground(new java.awt.Color(16, 95, 149));
        lblTipo.setText("Tipo de actividad");

        txtTipo.setEditable(false);
        txtTipo.setBackground(new java.awt.Color(21, 25, 28));
        txtTipo.setFont(new java.awt.Font("Times New Roman", 0, 12));
        txtTipo.setForeground(new java.awt.Color(255, 255, 255));

        lblParticipante.setFont(new java.awt.Font("Times New Roman", 0, 12));
        lblParticipante.setForeground(new java.awt.Color(16, 95, 149));
        lblParticipante.setText("Participante");

        txtParticipante.setEditable(false);
        txtParticipante.setBackground(new java.awt.Color(21, 25, 28));
        txtParticipante.setFont(new java.awt.Font("Times New Roman", 0, 12));
        txtParticipante.setForeground(new java.awt.Color(255, 255, 255));

        btnCompletar.setBackground(new java.awt.Color(25, 44, 99));
        btnCompletar.setFont(new java.awt.Font("Times New Roman", 0, 12));
        btnCompletar.setForeground(new java.awt.Color(255, 255, 255));
        btnCompletar.setText("Completar actividad");
        btnCompletar.setBorder(BorderFactory.createEtchedBorder());
        
        btnCompletar.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                btnCompletarActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pnlScrollProyectos, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescripcionProyecto, GroupLayout.Alignment.LEADING))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFechaInicialProyecto, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFechaInicialProyecto))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFechaFinalProyecto, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFechaFinalProyecto))
                                .addGap(74, 74, 74))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblIdProyecto)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdProyecto, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblProyectos)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator2))
                            .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblActividades)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 869, GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pnlScrollActividades, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescripcionActividad, GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFechaInicialActividad, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFechaInicialActividad)
                                    .addComponent(lblTipo)
                                    .addComponent(txtTipo, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFechaFinalActividad, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFechaFinalActividad)
                                    .addComponent(lblParticipante)
                                    .addComponent(txtParticipante, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCompletar, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                .addGap(152, 152, 152))))))
        );
        
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(lblProyectos)
                    .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblDescripcionProyecto)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblFechaFinalProyecto)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtFechaFinalProyecto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblFechaInicialProyecto)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtFechaInicialProyecto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblIdProyecto)
                                            .addComponent(txtIdProyecto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(pnlScrollProyectos, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblActividades))
                    .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlScrollActividades, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescripcionActividad)
                            .addComponent(btnCompletar))
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblFechaFinalActividad)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFechaFinalActividad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblFechaInicialActividad)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFechaInicialActividad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblTipo)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblParticipante)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtParticipante, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 980, 480));

        pack();
        setLocationRelativeTo(null);
    }

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) 
    {
        System.exit(0);
    }

    private void formMousePressed(java.awt.event.MouseEvent evt) 
    {
        FiveCodMoverJFrame.MousePressed(evt);
    }

    private void formMouseDragged(java.awt.event.MouseEvent evt) 
    {
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }

    private void lstProyectosValueChanged(javax.swing.event.ListSelectionEvent evt) 
    {
        try
        {
            lblReporteProyecto.setVisible(true);
            iconReporteProyecto.setVisible(true);
            lblAgregarParticipante.setVisible(true);
            iconAgregarParticipante.setVisible(true);
            lblAgregarActividad.setVisible(true);
            iconAgregarActividad.setVisible(true);
            proyecto = consola.buscarProyectoPorNombre(lstProyectos.getSelectedValue());
            DefaultListModel<String> modeloListaActividades= new DefaultListModel<>();
            for(Actividad a:proyecto.getActividades())
            {
                modeloListaActividades.addElement(a.getTitulo());
            }
            lstActividades.setModel(modeloListaActividades);
            txtDescripcionProyecto.setText(proyecto.getDescripcion());
        
            String listaFechaI[] = proyecto.getFechaInicio().toString().split("T");
            String listaTiempoI[] = listaFechaI[1].split(":");
            String texto1 = listaFechaI[0]+" "+listaTiempoI[0]+":"+listaTiempoI[1];
            txtFechaInicialProyecto.setText(texto1);

            String listaFechaF[] = proyecto.getFechaFinal().toString().split("T");
            String listaTiempoF[] = listaFechaF[1].split(":");
            String texto2 = listaFechaF[0]+" "+listaTiempoF[0]+":"+listaTiempoF[1];
            txtFechaFinalProyecto.setText(texto2);
        
            txtIdProyecto.setText(Integer.toString(proyecto.getIdProyecto()));
            
            txtDescripcionActividad.setText("");
            txtFechaFinalActividad.setText("");
            txtFechaInicialActividad.setText("");
            txtTipo.setText("");
            txtParticipante.setText("");
            txtFechaFinalActividad.setVisible(true);
            lblFechaFinalActividad.setVisible(true);
            
            btnCompletar.setVisible(false);
        }
        catch(Exception e)
        {
        	
        }
    }

    private void lstActividadesValueChanged(javax.swing.event.ListSelectionEvent evt) 
    {
        try
        {
            lblReporteActividad.setVisible(true);
            iconReporteActividad.setVisible(true);
            txtFechaFinalActividad.setVisible(true);
            lblFechaFinalActividad.setVisible(true);
            actividad = proyecto.buscarActividadPorNombre(lstActividades.getSelectedValue());
            txtDescripcionActividad.setText(actividad.getDescripcion());
            String listaFechaI[] = actividad.getfechaInicio().toString().split("T");
            String listaTiempoI[] = listaFechaI[1].split(":");
            String texto1 = listaFechaI[0]+" "+listaTiempoI[0]+":"+listaTiempoI[1];
            txtFechaInicialActividad.setText(texto1);
            if(actividad.isCompletada())
            {
                String listaFechaF[] = actividad.getFechaRealizacion().toString().split("T");
                String listaTiempoF[] = listaFechaF[1].split(":");
                String texto2 = listaFechaF[0]+" "+listaTiempoF[0]+":"+listaTiempoF[1];
                txtFechaFinalActividad.setText(texto2);
                btnCompletar.setVisible(false);
            }
            else
            {
                txtFechaFinalActividad.setVisible(false);
                lblFechaFinalActividad.setVisible(false);
                btnCompletar.setVisible(true);
            }
            txtTipo.setText(actividad.getTipo());
            txtParticipante.setText(actividad.getParticipante().getNombre());
        }
        catch(Exception e)
        {
            
        }
    }

    private void iconCrearProyectoMouseClicked(java.awt.event.MouseEvent evt) 
    {
        JOptionPane.showMessageDialog(null, "Intenta crear un proyecto", "Crear proyecto", JOptionPane.INFORMATION_MESSAGE);
    }

    private void iconAgregarParticipanteMouseClicked(java.awt.event.MouseEvent evt) 
    {
        JOptionPane.showMessageDialog(null, "Intenta agregar un participante", "Agregar participante", JOptionPane.INFORMATION_MESSAGE);
    }

    private void iconAgregarActividadMouseClicked(java.awt.event.MouseEvent evt) 
    {
        JOptionPane.showMessageDialog(null, "Intenta agregar una actividad", "Agregar actividad", JOptionPane.INFORMATION_MESSAGE);
    }

    private void iconReporteProyectoMouseClicked(java.awt.event.MouseEvent evt) 
    {
        JOptionPane.showMessageDialog(null, "Intenta hacer un reporte de un proyecto", "Reporte de proyecto", JOptionPane.INFORMATION_MESSAGE);
    }

    private void iconReporteParticipanteMouseClicked(java.awt.event.MouseEvent evt) 
    {
        JOptionPane.showMessageDialog(null, "Intenta hacer un reporte de un participante", "Reporte de participante", JOptionPane.INFORMATION_MESSAGE);
    }

    private void iconReporteActividadMouseClicked(java.awt.event.MouseEvent evt) 
    {
        JOptionPane.showMessageDialog(null, "Intenta hacer un reporte de una actividad", "Reporte de actividad", JOptionPane.INFORMATION_MESSAGE);
    }

    private void btnCompletarActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	
    }
}
