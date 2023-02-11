package views;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.event.MouseMotionAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import java.awt.Button;

@SuppressWarnings("serial")
public class MenuUsuario extends JFrame {

	private JPanel contentPane;
	int xMouse, yMouse;
	private JLabel labelExit;
	private JLabel labelRegistro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuUsuario frame = new MenuUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuUsuario() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuUsuario.class.getResource("/imagenes/oracle-icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 944, 609);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setUndecorated(true);
		
		JPanel header = new JPanel();
		header.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				headerMouseDragged(e);
			}
		});
		header.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				headerMousePressed(e);
			}
		});
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(Color.BLACK);
		panelMenu.setBounds(0, 0, 944, 243);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setBounds(99, 108, 100, 100);
		panelMenu.add(logo);
		logo.setIcon(new ImageIcon(MenuUsuario.class.getResource("/imagenes/oraclet.png")));
		
		JPanel btnRegistro = new JPanel();
		btnRegistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnRegistro.setBackground(new Color(118, 187, 223));				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnRegistro.setBackground(new Color(12, 138, 199));	
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				ReservasView reservas = new ReservasView();
				reservas.setVisible(true);
				dispose();
			}
		});
		btnRegistro.setBounds(364, 152, 257, 56);
		btnRegistro.setBackground(new Color(12, 138, 199));
		panelMenu.add(btnRegistro);
		btnRegistro.setLayout(null);
		btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		
		labelRegistro = new JLabel("Registro de reservas");
		labelRegistro.setBounds(28, 10, 205, 34);
		btnRegistro.add(labelRegistro);
		labelRegistro.setIcon(new ImageIcon(MenuUsuario.class.getResource("/imagenes/reservado.png")));
		labelRegistro.setForeground(SystemColor.text);
		labelRegistro.setFont(new Font("Roboto", Font.PLAIN, 18));
		labelRegistro.setHorizontalAlignment(SwingConstants.LEFT);
		
		JPanel btnBuscar = new JPanel();
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBuscar.setBackground(new Color(118, 187, 223));				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnBuscar.setBackground(new Color(12, 138, 199));	
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Busqueda busqueda = new Busqueda();
				busqueda.setVisible(true);
				dispose();
			}
		});
		btnBuscar.setBounds(635, 152, 257, 56);
		btnBuscar.setBackground(new Color(12, 138, 199));
		panelMenu.add(btnBuscar);
		btnBuscar.setLayout(null);
		btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		
		JLabel lblBusquedaDeReservas = new JLabel("Búsqueda");
		lblBusquedaDeReservas.setBounds(31, 10, 200, 34);
		btnBuscar.add(lblBusquedaDeReservas);
		lblBusquedaDeReservas.setIcon(new ImageIcon(MenuUsuario.class.getResource("/imagenes/pessoas.png")));
		lblBusquedaDeReservas.setHorizontalAlignment(SwingConstants.LEFT);
		lblBusquedaDeReservas.setForeground(Color.WHITE);
		lblBusquedaDeReservas.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JLabel lblTitulo = new JLabel("SISTEMA DE RESERVAS HOTEL ORACLE");
		lblTitulo.setBounds(377, 52, 515, 56);
		panelMenu.add(lblTitulo);
		lblTitulo.setForeground(new Color(165, 42, 42));
		lblTitulo.setFont(new Font("OCR A Extended", Font.PLAIN, 26));
		
		JLabel lblNewLabel_1 = new JLabel("HOTEL");
		lblNewLabel_1.setFont(new Font("Cooper Black", Font.PLAIN, 25));
		lblNewLabel_1.setForeground(new Color(204, 51, 0));
		lblNewLabel_1.setBounds(99, 82, 100, 37);
		panelMenu.add(lblNewLabel_1);
		header.setLayout(null);
		header.setBackground(Color.WHITE);
		header.setBounds(0, 0, 944, 36);
		contentPane.add(header);
		
		JPanel btnexit = new JPanel();
		btnexit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnexit.setBackground(Color.red);
				labelExit.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				 btnexit.setBackground(Color.white);
			     labelExit.setForeground(Color.black);
			}
		});
		
		btnexit.setLayout(null);
		btnexit.setBackground(Color.WHITE);
		btnexit.setBounds(891, 0, 53, 36);
		header.add(btnexit);
		
		labelExit = new JLabel("X");
		labelExit.setBackground(new Color(178, 34, 34));
		labelExit.setForeground(new Color(255, 255, 255));
		labelExit.setBounds(0, 0, 53, 36);
		btnexit.add(labelExit);
		labelExit.setHorizontalAlignment(SwingConstants.CENTER);
		labelExit.setFont(new Font("Dubai Medium", Font.PLAIN, 19));
		
	    JPanel panelFecha = new JPanel();
	    panelFecha.setBackground(Color.BLACK);
	    panelFecha.setBounds(0, 243, 292, 366);
	    contentPane.add(panelFecha);
	    panelFecha.setLayout(null);
	    
	    JLabel labelFecha = new JLabel("New label");
	    labelFecha.setBounds(10, 64, 282, 36);
	    panelFecha.add(labelFecha);
	    labelFecha.setForeground(new Color(165, 42, 42));
	    labelFecha.setFont(new Font("Roboto", Font.PLAIN, 33));
	    Date fechaActual = new Date(); //fecha y hora actual
	    String fecha = new SimpleDateFormat("dd/MM/yyyy").format(fechaActual); //formatear la fecha en una cadena
	    labelFecha.setText("Hoy es " + fecha); //setear la representacion en cadena de la fecha
	    
	    JLabel lblNewLabel = new JLabel("New label");
	    lblNewLabel.setIcon(new ImageIcon(MenuUsuario.class.getResource("/imagenes/castle2.jpg")));
	    lblNewLabel.setBounds(0, 130, 292, 236);
	    panelFecha.add(lblNewLabel);
	    
	    JLabel lblBienvenido = new JLabel("Bienvenido");
	    lblBienvenido.setFont(new Font("Roboto", Font.BOLD, 24));
	    lblBienvenido.setBounds(302, 234, 147, 46);
	    contentPane.add(lblBienvenido);
	    
	    String textoDescripcion = "<html><body>Sistema de reserva de hotel. Controle y administre de forma óptima y fácil <br> el flujo de reservas y de huespédes del hotel   </body></html>";
	    JLabel labelDescripcion = new JLabel(textoDescripcion);
	    labelDescripcion.setFont(new Font("Roboto", Font.PLAIN, 17));
	   
	    labelDescripcion.setBounds(312, 291, 598, 66);
	    contentPane.add(labelDescripcion);
	    
	    String textoDescripcion1 = "<html><body> Esta herramienta le permitirá llevar un control completo y detallado de sus reservas y huéspedes, tendrá acceso a heramientas especiales para tareas específicas como lo son:</body></html>";
	    JLabel labelDescripcion_1 = new JLabel(textoDescripcion1);
	    labelDescripcion_1.setFont(new Font("Roboto", Font.PLAIN, 17));
	    labelDescripcion_1.setBounds(311, 345, 569, 88);
	    contentPane.add(labelDescripcion_1);
	    
	    JLabel lblDescripcion_3 = new JLabel("- Registro de Reservas y Huéspedes");
	    lblDescripcion_3.setFont(new Font("Roboto", Font.PLAIN, 17));
	    lblDescripcion_3.setBounds(312, 444, 295, 27);
	    contentPane.add(lblDescripcion_3);
	    
	    JLabel lblDescripcion_4 = new JLabel("- Edición de Reservas y Huéspedes existentes");
	    lblDescripcion_4.setFont(new Font("Roboto", Font.PLAIN, 17));
	    lblDescripcion_4.setBounds(312, 482, 355, 27);
	    contentPane.add(lblDescripcion_4);
	    
	    JLabel lblDescripcion_5 = new JLabel("- Eliminar todo tipo de registros");
	    lblDescripcion_5.setFont(new Font("Roboto", Font.PLAIN, 17));
	    lblDescripcion_5.setBounds(312, 520, 295, 27);
	    contentPane.add(lblDescripcion_5);
	}
	
	private void headerMousePressed(java.awt.event.MouseEvent evt) {
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }
}
