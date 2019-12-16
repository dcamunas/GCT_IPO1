package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JCheckBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JPanel pnInfoUsuario;
	private JPanel pnAreaImagen;
	private JPanel pnHerramientas;
	private JButton btnCerrarSesion;
	private JButton btnAyuda;
	private JLabel lblUltimaConexion;
	private JPanel pnContenidoUsuario;
	private JLabel lblUsuario;
	private JTextField txtUsuario;
	private JPanel pnImagen;
	private JLabel lblImagen;
	private JPanel pnBotonesImagen;
	private JButton btnSelecionarImagen;
	private JButton btnEliminarImagen;
	private JPanel pnPrincipal;
	private JTabbedPane tbPestañas;
	private JPanel pnCircuitos;
	private JPanel pnGuias;
	private JPanel pnGrupos;
	private JPanel pnDiseñoRuta;
	private JPanel pnListaCircuitos;
	private JPanel pnBotonesCircuito;
	private JButton btnAniadirCircuito;
	private JButton btnModificarCircuito;
	private JButton btnLimpiarCircuito;
	private JButton btnEliminarCircuito;
	private JLabel lblCircuitosContratados;
	private JScrollPane spnListaCircuitos;
	private JList listCircuitos;
	private JPanel pnLugares;
	private JPanel pnContratacion;
	private JButton btnContratar;
	private JCheckBox chckbxContratado;
	private JPanel pnBotonesLugares;
	private JButton btnAgregarlugar;
	private JButton btnEliminarlugar;
	private JPanel pnListaLugares;
	private JLabel lblLugaresDeVisita;
	private JScrollPane spnLugares;
	private JList listLugares;
	private JPanel pnInfoCircuito;
	private JPanel pnDatosCircuito;
	private JLabel lblNombreCircuito;
	private JTextField textField;
	private JLabel lblPersonasQueLo;
	private JSpinner spinner;
	private JLabel lblCoste;
	private JTextField textField_1;
	private JPanel pnEspacio;
	private JPanel pnBotonesIncidencias;
	private JButton btnAadirIncidencia;
	private JButton btnEliminarIncidencia;
	private JScrollPane spnIncidencias;
	private JList listIncidencias;
	private JPanel pnInciden_Puntos_Opiniones;
	private JPanel pnIncidencias;
	private JPanel pntituloIncidencia;
	private JLabel lblIncidencias;
	private JRadioButton rdbtnSi;
	private JRadioButton rdbtnNo;
	private JPanel pnListaIncidencia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/presentacion/imagenes/iconos/compass.png")));
		setTitle("Manchatours");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pnInfoUsuario = new JPanel();
		pnInfoUsuario.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pnInfoUsuario.setPreferredSize(new Dimension(300, 10));
		contentPane.add(pnInfoUsuario, BorderLayout.EAST);
		pnInfoUsuario.setLayout(new BorderLayout(0, 0));
		
		pnAreaImagen = new JPanel();
		pnAreaImagen.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		pnInfoUsuario.add(pnAreaImagen, BorderLayout.NORTH);
		pnAreaImagen.setLayout(new BorderLayout(0, 0));
		
		pnImagen = new JPanel();
		pnAreaImagen.add(pnImagen, BorderLayout.NORTH);
		
		lblImagen = new JLabel("");
		lblImagen.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/imagenes/perfiles/user.png")));
		pnImagen.add(lblImagen);
		
		pnBotonesImagen = new JPanel();
		pnAreaImagen.add(pnBotonesImagen, BorderLayout.SOUTH);
		
		btnSelecionarImagen = new JButton("Selecionar");
		pnBotonesImagen.add(btnSelecionarImagen);
		
		btnEliminarImagen = new JButton("Eliminar");
		pnBotonesImagen.add(btnEliminarImagen);
		
		lblUltimaConexion = new JLabel("Ultima conexion");
		lblUltimaConexion.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnInfoUsuario.add(lblUltimaConexion, BorderLayout.SOUTH);
		
		pnContenidoUsuario = new JPanel();
		pnInfoUsuario.add(pnContenidoUsuario, BorderLayout.CENTER);
		pnContenidoUsuario.setLayout(new GridLayout(6, 1, 0, 0));
		
		lblUsuario = new JLabel("Usuario:");
		pnContenidoUsuario.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setText("Usuario");
		pnContenidoUsuario.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		pnHerramientas = new JPanel();
		pnHerramientas.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		FlowLayout fl_pnHerramientas = (FlowLayout) pnHerramientas.getLayout();
		fl_pnHerramientas.setAlignment(FlowLayout.RIGHT);
		contentPane.add(pnHerramientas, BorderLayout.NORTH);
		
		btnAyuda = new JButton("");
		btnAyuda.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/imagenes/iconos/info-32.png")));
		pnHerramientas.add(btnAyuda);
		btnAyuda.setBorderPainted(false);
		btnAyuda.setContentAreaFilled(false);
		
		btnCerrarSesion = new JButton("Cerrar Sesion");
		pnHerramientas.add(btnCerrarSesion);
		
		pnPrincipal = new JPanel();
		contentPane.add(pnPrincipal, BorderLayout.CENTER);
		pnPrincipal.setLayout(new BorderLayout(0, 0));
		
		tbPestañas = new JTabbedPane(JTabbedPane.TOP);
		pnPrincipal.add(tbPestañas, BorderLayout.CENTER);
		
		pnCircuitos = new JPanel();
		tbPestañas.addTab("Circuitos", null, pnCircuitos, null);
		pnCircuitos.setLayout(new BorderLayout(0, 0));
		
		pnListaCircuitos = new JPanel();
		pnListaCircuitos.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnCircuitos.add(pnListaCircuitos, BorderLayout.WEST);
		pnListaCircuitos.setLayout(new BorderLayout(0, 0));
		
		pnBotonesCircuito = new JPanel();
		pnBotonesCircuito.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnListaCircuitos.add(pnBotonesCircuito, BorderLayout.SOUTH);
		
		btnAniadirCircuito = new JButton("Añadir");
		pnBotonesCircuito.add(btnAniadirCircuito);
		
		btnModificarCircuito = new JButton("Modificar");
		pnBotonesCircuito.add(btnModificarCircuito);
		
		btnLimpiarCircuito = new JButton("Limpiar");
		pnBotonesCircuito.add(btnLimpiarCircuito);
		
		btnEliminarCircuito = new JButton("Eliminar");
		pnBotonesCircuito.add(btnEliminarCircuito);
		
		lblCircuitosContratados = new JLabel("Circuitos contratados:");
		pnListaCircuitos.add(lblCircuitosContratados, BorderLayout.NORTH);
		
		spnListaCircuitos = new JScrollPane();
		pnListaCircuitos.add(spnListaCircuitos, BorderLayout.CENTER);
		
		listCircuitos = new JList();
		spnListaCircuitos.setViewportView(listCircuitos);
		
		pnLugares = new JPanel();
		pnLugares.setPreferredSize(new Dimension(250, 10));
		pnLugares.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnCircuitos.add(pnLugares, BorderLayout.EAST);
		pnLugares.setLayout(new BorderLayout(0, 0));
		
		pnContratacion = new JPanel();
		pnContratacion.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnLugares.add(pnContratacion, BorderLayout.SOUTH);
		
		btnContratar = new JButton("Contratar");
		btnContratar.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/imagenes/iconos/shopping-cart x16.png")));
		pnContratacion.add(btnContratar);
		
		chckbxContratado = new JCheckBox("Contratado");
		chckbxContratado.setEnabled(false);
		pnContratacion.add(chckbxContratado);
		
		pnBotonesLugares = new JPanel();
		pnLugares.add(pnBotonesLugares, BorderLayout.EAST);
		pnBotonesLugares.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnAgregarlugar = new JButton("");
		btnAgregarlugar.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/imagenes/iconos/plus24.png")));
		btnAgregarlugar.setBorderPainted(false);
		btnAgregarlugar.setContentAreaFilled(false);
		pnBotonesLugares.add(btnAgregarlugar);
		
		btnEliminarlugar = new JButton("");
		btnEliminarlugar.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/imagenes/iconos/remove24.png")));
		btnEliminarlugar.setBorderPainted(false);
		btnEliminarlugar.setContentAreaFilled(false);
		pnBotonesLugares.add(btnEliminarlugar);
		
		pnListaLugares = new JPanel();
		pnLugares.add(pnListaLugares, BorderLayout.CENTER);
		pnListaLugares.setLayout(new BorderLayout(0, 0));
		
		lblLugaresDeVisita = new JLabel("Lugares de visita:");
		pnListaLugares.add(lblLugaresDeVisita, BorderLayout.NORTH);
		
		spnLugares = new JScrollPane();
		pnListaLugares.add(spnLugares, BorderLayout.CENTER);
		
		listLugares = new JList();
		spnLugares.setViewportView(listLugares);
		
		pnInfoCircuito = new JPanel();
		pnCircuitos.add(pnInfoCircuito, BorderLayout.CENTER);
		pnInfoCircuito.setLayout(new BorderLayout(0, 0));
		
		pnDatosCircuito = new JPanel();
		pnInfoCircuito.add(pnDatosCircuito, BorderLayout.NORTH);
		GridBagLayout gbl_pnDatosCircuito = new GridBagLayout();
		gbl_pnDatosCircuito.columnWidths = new int[] {101, 101, 101};
		gbl_pnDatosCircuito.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_pnDatosCircuito.columnWeights = new double[]{0.0, 1.0, 1.0};
		gbl_pnDatosCircuito.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnDatosCircuito.setLayout(gbl_pnDatosCircuito);
		
		lblNombreCircuito = new JLabel("Nombre circuito:");
		GridBagConstraints gbc_lblNombreCircuito = new GridBagConstraints();
		gbc_lblNombreCircuito.anchor = GridBagConstraints.EAST;
		gbc_lblNombreCircuito.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreCircuito.gridx = 0;
		gbc_lblNombreCircuito.gridy = 1;
		pnDatosCircuito.add(lblNombreCircuito, gbc_lblNombreCircuito);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridwidth = 2;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		pnDatosCircuito.add(textField, gbc_textField);
		textField.setColumns(10);
		
		lblPersonasQueLo = new JLabel("Personas que lo han realizado:");
		GridBagConstraints gbc_lblPersonasQueLo = new GridBagConstraints();
		gbc_lblPersonasQueLo.insets = new Insets(0, 0, 5, 5);
		gbc_lblPersonasQueLo.gridx = 0;
		gbc_lblPersonasQueLo.gridy = 2;
		pnDatosCircuito.add(lblPersonasQueLo, gbc_lblPersonasQueLo);
		
		spinner = new JSpinner();
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.anchor = GridBagConstraints.WEST;
		gbc_spinner.insets = new Insets(0, 0, 5, 5);
		gbc_spinner.gridx = 1;
		gbc_spinner.gridy = 2;
		pnDatosCircuito.add(spinner, gbc_spinner);
		
		lblCoste = new JLabel("Coste:");
		GridBagConstraints gbc_lblCoste = new GridBagConstraints();
		gbc_lblCoste.anchor = GridBagConstraints.EAST;
		gbc_lblCoste.insets = new Insets(0, 0, 0, 5);
		gbc_lblCoste.gridx = 0;
		gbc_lblCoste.gridy = 3;
		pnDatosCircuito.add(lblCoste, gbc_lblCoste);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 0, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 3;
		pnDatosCircuito.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		pnEspacio = new JPanel();
		pnEspacio.setPreferredSize(new Dimension(10, 42));
		pnInfoCircuito.add(pnEspacio, BorderLayout.SOUTH);
		
		pnInciden_Puntos_Opiniones = new JPanel();
		pnInfoCircuito.add(pnInciden_Puntos_Opiniones, BorderLayout.CENTER);
		pnInciden_Puntos_Opiniones.setLayout(new BorderLayout(0, 0));
		
		pnIncidencias = new JPanel();
		pnInciden_Puntos_Opiniones.add(pnIncidencias, BorderLayout.NORTH);
		pnIncidencias.setLayout(new BorderLayout(0, 0));
		
		pntituloIncidencia = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pntituloIncidencia.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		pnIncidencias.add(pntituloIncidencia, BorderLayout.NORTH);
		
		lblIncidencias = new JLabel("Incidencias:");
		lblIncidencias.setHorizontalTextPosition(SwingConstants.CENTER);
		pntituloIncidencia.add(lblIncidencias);
		
		rdbtnSi = new JRadioButton("Si");
		pntituloIncidencia.add(rdbtnSi);
		
		rdbtnNo = new JRadioButton("No");
		pntituloIncidencia.add(rdbtnNo);
		
		pnListaIncidencia = new MiListaJPanel();
		pnIncidencias.add(pnListaIncidencia, BorderLayout.SOUTH);
		
		pnGuias = new JPanel();
		tbPestañas.addTab("Guías", null, pnGuias, null);
		
		pnGrupos = new JPanel();
		tbPestañas.addTab("Grupos", null, pnGrupos, null);
		
		pnDiseñoRuta = new JPanel();
		tbPestañas.addTab("Diseño Ruta", null, pnDiseñoRuta, null);
	}

}
