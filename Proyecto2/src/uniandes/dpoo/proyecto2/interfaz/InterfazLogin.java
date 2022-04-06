package uniandes.dpoo.proyecto2.interfaz;


import FiveCodMover.FiveCodMoverJFrame;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import uniandes.dpoo.proyecto2.mundo.ConsolaAplicacion;

/**
 *
 * @author Usuario
 */
public class InterfazLogin extends JFrame 
{

    private ConsolaAplicacion consola;
    private JButton btnIngresar;
    private JLabel lblCorreo;
    private JLabel lblExit;
    private JLabel lblImagenLogin;
    private JLabel lblNombre;
    private JPanel panelImagenLogin;
    private JPanel panelLogin;
    private JSeparator separador;
    private JSeparator separador1;
    private JTextField txtCorreo;
    private JTextField txtNombre;
    

    public InterfazLogin() 
    {
        initComponents();
        panelImagenLogin.setBackground(new Color(0,0,0,100));
        consola = new ConsolaAplicacion();
        consola.cargar();
    }

    private void initComponents() 
    {

        panelLogin = new JPanel();
        lblNombre = new JLabel();
        txtNombre = new JTextField();
        separador = new JSeparator();
        separador1 = new JSeparator();
        lblCorreo = new JLabel();
        txtCorreo = new JTextField();
        btnIngresar = new JButton();
        lblExit = new JLabel();
        panelImagenLogin = new JPanel();
        lblImagenLogin = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
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
        
        addKeyListener(new java.awt.event.KeyAdapter() 
        {
            public void keyPressed(java.awt.event.KeyEvent evt) 
            {
                formKeyPressed(evt);
            }
        });
        
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogin.setBackground(new Color(32, 33, 35));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new Font("Times New Roman", 0, 14)); 
        lblNombre.setForeground(new Color(16, 95, 149));
        lblNombre.setText("Nombre");
        panelLogin.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        txtNombre.setBackground(new Color(32, 33, 35));
        txtNombre.setForeground(new Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.setCaretColor(new Color(255, 255, 255));
        txtNombre.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                txtNombreActionPerformed(evt);
            }
        });
        
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() 
        {
            public void keyTyped(java.awt.event.KeyEvent evt) 
            {
                txtNombreKeyTyped(evt);
            }
        });
        
        panelLogin.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 330, -1));
        panelLogin.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 330, 10));
        panelLogin.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 330, 10));

        lblCorreo.setFont(new Font("Times New Roman", 0, 14));
        lblCorreo.setForeground(new Color(16, 95, 149));
        lblCorreo.setText("Correo");
        panelLogin.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        txtCorreo.setBackground(new Color(32, 33, 35));
        txtCorreo.setForeground(new Color(255, 255, 255));
        txtCorreo.setBorder(null);
        txtCorreo.setCaretColor(new Color(255, 255, 255));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                txtCorreoActionPerformed(evt);
            }
        });
        
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() 
        {
            public void keyTyped(java.awt.event.KeyEvent evt) 
            {
                txtCorreoKeyTyped(evt);
            }
        });
        
        panelLogin.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 330, -1));

        btnIngresar.setBackground(new Color(46, 33, 100));
        btnIngresar.setFont(new Font("Times New Roman", 0, 18));
        btnIngresar.setForeground(new Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(BorderFactory.createEtchedBorder());
       
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                btnIngresarMouseClicked(evt);
            }
        });
        
        btnIngresar.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                btnIngresarActionPerformed(evt);
            }
        });
        
        panelLogin.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 250, 50));

        lblExit.setFont(new Font("Tahoma", 0, 18));
        lblExit.setForeground(new Color(61, 71, 100));
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
        
        panelLogin.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 20, 20));

        getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 0, 440, 540));

        panelImagenLogin.setBackground(new Color(0, 0, 0));
        panelImagenLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panelImagenLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 540));

        lblImagenLogin.setIcon(new ImageIcon("./data/ImagenLogin.png"));
        getContentPane().add(lblImagenLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

        pack();
        setLocationRelativeTo(null);
    }

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) 
    {
        
    }

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	
    }

    private void formMousePressed(java.awt.event.MouseEvent evt) 
    {
        FiveCodMoverJFrame.MousePressed(evt);
    }

    private void formMouseDragged(java.awt.event.MouseEvent evt) 
    {
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) 
    {
        System.exit(0);
    }

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) 
    {

    }

    private void formKeyPressed(java.awt.event.KeyEvent evt) 
    {
        
    }

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) 
    {
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
        {
            btnIngresar.doClick();
        }
    }

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) 
    {
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
        {
            btnIngresar.doClick();
        }
    }

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) 
    {
        try
        {
            consola.ingreso(txtNombre.getText(), txtCorreo.getText());
            InterfazAdministrador interfazAdministrador = new InterfazAdministrador(consola);
            interfazAdministrador.setVisible(true);
            this.dispose();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String args[]) 
    {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) 
            {
                if ("Nimbus".equals(info.getName())) 
                {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (Exception ex) 
        {
            java.util.logging.Logger.getLogger(InterfazLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        
        EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new InterfazLogin().setVisible(true);
            }
        });
    }
}
