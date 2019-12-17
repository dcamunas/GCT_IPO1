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
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;

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
	private JPanel pnSugerencias;
	private JLabel lblOpinionesYSugerencias;
	private JPanel pnListaSugerencias;
	private JPanel pnPtosInteres;
	private JLabel lblPuntosDeInteres;
	private JPanel pnListaPtosInteres;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JLabel lblDireccinDeCorreo;
	private JTextField txtCorreo;
	private JPanel pnListaGuias;
	private JLabel lblGuiasContratados;
	private JPanel pnIdiomasGuia;
	private JLabel lblIdiomas;
	private JPanel pnBotonesIdioma;
	private JButton btnAgregar;
	private JButton btnBorrar;
	private JScrollPane spnListaIdiomas;
	private JList listIdiomas;
	private JPanel pnInfoGuia;
	private JPanel pnEspacio1;
	private JPanel pnInfoCentral;
	private JPanel pnImagenGuia;
	private JLabel lblImagenGuia;
	private JButton btnSeleccionarGuia;
	private JPanel pnHisRutasGuia;
	private JLabel lblHistorialDeRutas;
	private JScrollPane spnRutasGuia;
	private JList listRutasGuia;
	private JPanel pnListaGrupos;
	private JLabel lblGruposTuristicos;
	private JPanel pnListaIntegrantes;
	private JLabel lblIntegrantes;
	private JPanel pnBotonesIntegrantes;
	private JButton btnAgregar_1;
	private JButton btnBorrar_1;
	private JScrollPane spnListaIntegrantes;
	private JList listIntegrantes;
	private JPanel pnInfoGrupo;
	private JPanel pnEspacio2;
	private JPanel pnInfoGrupCentral;
	private JPanel pnInfoGrupo1;
	private JLabel lblNombreGrupo;
	private JTextField txtNombreGrupo;
	private JLabel lblPaisOrigen;
	private JTextField txtPais;
	private JLabel lblLugarDeAlojamiento;
	private JTextField txtAlojamiento;
	private JLabel lblTipologia;
	private JComboBox comboTipGrupo;
	private JLabel lblGua;
	private JComboBox comboGuiaGrupo;
	private JPanel pnInteresesGrupo;
	private JLabel lblIntereses;
	private JPanel pnRestricciones;
	private JPanel pnTituloRestric;
	private JLabel lblRestricciones;
	private JRadioButton rdbtnSi_1;
	private JRadioButton rdbtnNo_1;
	private JPanel pnInfoGeneral;
	private JTextField txtNombreguia;
	private JLabel lblApellidosGuia;
	private JTextField txtApellidosGuia;
	private JLabel lblCorreoGuia;
	private JTextField txtCorreoguia;
	private JLabel lblNTelefono;
	private JTextField txtNumeroGuia;
	private JLabel lblPrecioHora;
	private JTextField txtPrecioGuia;
	private JLabel lblPuntuacion;
	private JLabel lblDisponibilidadGuia;
	private JTextField txtPuntuacionGuia;
	private JRadioButton rdbtnSi_2;
	private JRadioButton rdbtnNo_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

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
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		pnContenidoUsuario.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setEnabled(false);
		txtUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsuario.setText("Usuario");
		pnContenidoUsuario.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		pnContenidoUsuario.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setEnabled(false);
		txtNombre.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombre.setText("Nombre");
		pnContenidoUsuario.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblDireccinDeCorreo = new JLabel("Dirección de correo:");
		lblDireccinDeCorreo.setHorizontalAlignment(SwingConstants.CENTER);
		pnContenidoUsuario.add(lblDireccinDeCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setEnabled(false);
		txtCorreo.setHorizontalAlignment(SwingConstants.CENTER);
		txtCorreo.setText("Correo");
		pnContenidoUsuario.add(txtCorreo);
		txtCorreo.setColumns(10);
		
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
		gbl_pnDatosCircuito.columnWidths = new int[] {101, 101, 101, 0};
		gbl_pnDatosCircuito.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_pnDatosCircuito.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0};
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
		gbc_textField.insets = new Insets(0, 0, 5, 5);
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
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 0, 5);
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
		buttonGroup_2.add(rdbtnSi);
		pntituloIncidencia.add(rdbtnSi);
		
		rdbtnNo = new JRadioButton("No");
		buttonGroup_2.add(rdbtnNo);
		pntituloIncidencia.add(rdbtnNo);
		
		pnListaIncidencia = new MiListaJPanel_2();
		pnIncidencias.add(pnListaIncidencia, BorderLayout.SOUTH);
		
		pnSugerencias = new JPanel();
		pnInciden_Puntos_Opiniones.add(pnSugerencias, BorderLayout.SOUTH);
		pnSugerencias.setLayout(new BorderLayout(0, 0));
		
		lblOpinionesYSugerencias = new JLabel("Opiniones y sugerencias:");
		pnSugerencias.add(lblOpinionesYSugerencias, BorderLayout.NORTH);
		
		pnListaSugerencias = new MiListaJPanel_2();
		pnSugerencias.add(pnListaSugerencias, BorderLayout.SOUTH);
		
		pnPtosInteres = new JPanel();
		pnInciden_Puntos_Opiniones.add(pnPtosInteres, BorderLayout.CENTER);
		pnPtosInteres.setLayout(new BorderLayout(0, 0));
		
		lblPuntosDeInteres = new JLabel("Puntos de interes:");
		pnPtosInteres.add(lblPuntosDeInteres, BorderLayout.NORTH);
		
		pnListaPtosInteres = new MiListaJPanel_2();
		pnPtosInteres.add(pnListaPtosInteres, BorderLayout.CENTER);
		
		pnGuias = new JPanel();
		pnGuias.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tbPestañas.addTab("Guías", null, pnGuias, null);
		pnGuias.setLayout(new BorderLayout(0, 0));
		
		pnListaGuias = new MiListaJPanel_1();
		pnListaGuias.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnGuias.add(pnListaGuias, BorderLayout.WEST);
		//pnListaGuias.setLayout(new BorderLayout(0, 0));
		
		lblGuiasContratados = new JLabel("Guías Contratados:");
		pnListaGuias.add(lblGuiasContratados, BorderLayout.NORTH);
		
		pnIdiomasGuia = new JPanel();
		pnIdiomasGuia.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnGuias.add(pnIdiomasGuia, BorderLayout.EAST);
		pnIdiomasGuia.setLayout(new BorderLayout(0, 0));
		
		lblIdiomas = new JLabel("Idiomas:");
		pnIdiomasGuia.add(lblIdiomas, BorderLayout.NORTH);
		
		pnBotonesIdioma = new JPanel();
		pnIdiomasGuia.add(pnBotonesIdioma, BorderLayout.SOUTH);
		pnBotonesIdioma.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setIcon(null);
		pnBotonesIdioma.add(btnAgregar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setIcon(null);
		pnBotonesIdioma.add(btnBorrar);
		
		spnListaIdiomas = new JScrollPane();
		pnIdiomasGuia.add(spnListaIdiomas, BorderLayout.CENTER);
		
		listIdiomas = new JList();
		spnListaIdiomas.setViewportView(listIdiomas);
		
		pnInfoGuia = new JPanel();
		pnGuias.add(pnInfoGuia, BorderLayout.CENTER);
		pnInfoGuia.setLayout(new BorderLayout(0, 0));
		
		pnEspacio1 = new JPanel();
		pnEspacio1.setPreferredSize(new Dimension(10, 38));
		pnInfoGuia.add(pnEspacio1, BorderLayout.SOUTH);
		
		pnInfoCentral = new JPanel();
		pnInfoGuia.add(pnInfoCentral, BorderLayout.CENTER);
		pnInfoCentral.setLayout(new BorderLayout(0, 0));
		
		pnImagenGuia = new JPanel();
		pnImagenGuia.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		pnInfoCentral.add(pnImagenGuia, BorderLayout.NORTH);
		
		lblImagenGuia = new JLabel("");
		lblImagenGuia.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/imagenes/perfiles/user.png")));
		pnImagenGuia.add(lblImagenGuia);
		
		btnSeleccionarGuia = new JButton("Seleccionar");
		pnImagenGuia.add(btnSeleccionarGuia);
		
		pnHisRutasGuia = new JPanel();
		pnHisRutasGuia.setPreferredSize(new Dimension(10, 160));
		pnInfoCentral.add(pnHisRutasGuia, BorderLayout.SOUTH);
		pnHisRutasGuia.setLayout(new BorderLayout(0, 0));
		
		lblHistorialDeRutas = new JLabel("Historial de rutas:");
		pnHisRutasGuia.add(lblHistorialDeRutas, BorderLayout.NORTH);
		
		spnRutasGuia = new JScrollPane();
		spnRutasGuia.setPreferredSize(new Dimension(10, 60));
		pnHisRutasGuia.add(spnRutasGuia, BorderLayout.CENTER);
		
		listRutasGuia = new JList();
		spnRutasGuia.setViewportView(listRutasGuia);
		
		pnInfoGeneral = new JPanel();
		pnInfoCentral.add(pnInfoGeneral, BorderLayout.CENTER);
		GridBagLayout gbl_pnInfoGeneral = new GridBagLayout();
		gbl_pnInfoGeneral.columnWidths = new int[] {0, 74, 27, 101};
		gbl_pnInfoGeneral.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 30, 0, 0};
		gbl_pnInfoGeneral.columnWeights = new double[]{0.0, 0.0, 0.0};
		gbl_pnInfoGeneral.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		pnInfoGeneral.setLayout(gbl_pnInfoGeneral);
		
		JLabel lblNombreGuia = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombreGuia = new GridBagConstraints();
		gbc_lblNombreGuia.anchor = GridBagConstraints.EAST;
		gbc_lblNombreGuia.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreGuia.gridx = 1;
		gbc_lblNombreGuia.gridy = 1;
		pnInfoGeneral.add(lblNombreGuia, gbc_lblNombreGuia);
		
		txtNombreguia = new JTextField();
		GridBagConstraints gbc_txtNombreguia = new GridBagConstraints();
		gbc_txtNombreguia.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombreguia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreguia.gridx = 2;
		gbc_txtNombreguia.gridy = 1;
		pnInfoGeneral.add(txtNombreguia, gbc_txtNombreguia);
		txtNombreguia.setColumns(10);
		
		lblApellidosGuia = new JLabel("Apellidos:");
		GridBagConstraints gbc_lblApellidosGuia = new GridBagConstraints();
		gbc_lblApellidosGuia.anchor = GridBagConstraints.EAST;
		gbc_lblApellidosGuia.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidosGuia.gridx = 1;
		gbc_lblApellidosGuia.gridy = 2;
		pnInfoGeneral.add(lblApellidosGuia, gbc_lblApellidosGuia);
		
		txtApellidosGuia = new JTextField();
		GridBagConstraints gbc_txtApellidosGuia = new GridBagConstraints();
		gbc_txtApellidosGuia.gridwidth = 2;
		gbc_txtApellidosGuia.insets = new Insets(0, 0, 5, 0);
		gbc_txtApellidosGuia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidosGuia.gridx = 2;
		gbc_txtApellidosGuia.gridy = 2;
		pnInfoGeneral.add(txtApellidosGuia, gbc_txtApellidosGuia);
		txtApellidosGuia.setColumns(10);
		
		lblCorreoGuia = new JLabel("Correo:");
		GridBagConstraints gbc_lblCorreoGuia = new GridBagConstraints();
		gbc_lblCorreoGuia.anchor = GridBagConstraints.EAST;
		gbc_lblCorreoGuia.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreoGuia.gridx = 1;
		gbc_lblCorreoGuia.gridy = 3;
		pnInfoGeneral.add(lblCorreoGuia, gbc_lblCorreoGuia);
		
		txtCorreoguia = new JTextField();
		GridBagConstraints gbc_txtCorreoguia = new GridBagConstraints();
		gbc_txtCorreoguia.gridwidth = 2;
		gbc_txtCorreoguia.insets = new Insets(0, 0, 5, 0);
		gbc_txtCorreoguia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCorreoguia.gridx = 2;
		gbc_txtCorreoguia.gridy = 3;
		pnInfoGeneral.add(txtCorreoguia, gbc_txtCorreoguia);
		txtCorreoguia.setColumns(10);
		
		lblNTelefono = new JLabel("Nº Teléfono:");
		GridBagConstraints gbc_lblNTelefono = new GridBagConstraints();
		gbc_lblNTelefono.anchor = GridBagConstraints.EAST;
		gbc_lblNTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblNTelefono.gridx = 1;
		gbc_lblNTelefono.gridy = 4;
		pnInfoGeneral.add(lblNTelefono, gbc_lblNTelefono);
		
		txtNumeroGuia = new JTextField();
		GridBagConstraints gbc_txtNumeroGuia = new GridBagConstraints();
		gbc_txtNumeroGuia.insets = new Insets(0, 0, 5, 5);
		gbc_txtNumeroGuia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNumeroGuia.gridx = 2;
		gbc_txtNumeroGuia.gridy = 4;
		pnInfoGeneral.add(txtNumeroGuia, gbc_txtNumeroGuia);
		txtNumeroGuia.setColumns(10);
		
		lblPrecioHora = new JLabel("Precio / Hora:");
		GridBagConstraints gbc_lblPrecioHora = new GridBagConstraints();
		gbc_lblPrecioHora.anchor = GridBagConstraints.EAST;
		gbc_lblPrecioHora.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioHora.gridx = 1;
		gbc_lblPrecioHora.gridy = 5;
		pnInfoGeneral.add(lblPrecioHora, gbc_lblPrecioHora);
		
		txtPrecioGuia = new JTextField();
		GridBagConstraints gbc_txtPrecioGuia = new GridBagConstraints();
		gbc_txtPrecioGuia.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecioGuia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecioGuia.gridx = 2;
		gbc_txtPrecioGuia.gridy = 5;
		pnInfoGeneral.add(txtPrecioGuia, gbc_txtPrecioGuia);
		txtPrecioGuia.setColumns(10);
		
		lblPuntuacion = new JLabel("Puntuación:");
		GridBagConstraints gbc_lblPuntuacion = new GridBagConstraints();
		gbc_lblPuntuacion.anchor = GridBagConstraints.EAST;
		gbc_lblPuntuacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntuacion.gridx = 1;
		gbc_lblPuntuacion.gridy = 6;
		pnInfoGeneral.add(lblPuntuacion, gbc_lblPuntuacion);
		
		txtPuntuacionGuia = new JTextField();
		GridBagConstraints gbc_txtPuntuacionGuia = new GridBagConstraints();
		gbc_txtPuntuacionGuia.insets = new Insets(0, 0, 5, 5);
		gbc_txtPuntuacionGuia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPuntuacionGuia.gridx = 2;
		gbc_txtPuntuacionGuia.gridy = 6;
		pnInfoGeneral.add(txtPuntuacionGuia, gbc_txtPuntuacionGuia);
		txtPuntuacionGuia.setColumns(10);
		
		lblDisponibilidadGuia = new JLabel("Disponibilidad:");
		GridBagConstraints gbc_lblDisponibilidadGuia = new GridBagConstraints();
		gbc_lblDisponibilidadGuia.anchor = GridBagConstraints.EAST;
		gbc_lblDisponibilidadGuia.insets = new Insets(0, 0, 5, 5);
		gbc_lblDisponibilidadGuia.gridx = 1;
		gbc_lblDisponibilidadGuia.gridy = 7;
		pnInfoGeneral.add(lblDisponibilidadGuia, gbc_lblDisponibilidadGuia);
		
		rdbtnSi_2 = new JRadioButton("Sí");
		buttonGroup.add(rdbtnSi_2);
		GridBagConstraints gbc_rdbtnSi_2 = new GridBagConstraints();
		gbc_rdbtnSi_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnSi_2.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnSi_2.gridx = 2;
		gbc_rdbtnSi_2.gridy = 7;
		pnInfoGeneral.add(rdbtnSi_2, gbc_rdbtnSi_2);
		
		rdbtnNo_2 = new JRadioButton("No");
		buttonGroup.add(rdbtnNo_2);
		GridBagConstraints gbc_rdbtnNo_2 = new GridBagConstraints();
		gbc_rdbtnNo_2.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNo_2.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNo_2.gridx = 3;
		gbc_rdbtnNo_2.gridy = 7;
		pnInfoGeneral.add(rdbtnNo_2, gbc_rdbtnNo_2);
		
		pnGrupos = new JPanel();
		tbPestañas.addTab("Grupos", null, pnGrupos, null);
		pnGrupos.setLayout(new BorderLayout(0, 0));
		
		pnListaGrupos = new MiListaJPanel_1();
		pnListaGrupos.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnGrupos.add(pnListaGrupos, BorderLayout.WEST);
		
		lblGruposTuristicos = new JLabel("Grupos turísticos (4 - 20 personas):");
		pnListaGrupos.add(lblGruposTuristicos, BorderLayout.NORTH);
		
		pnListaIntegrantes = new JPanel();
		pnListaIntegrantes.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnGrupos.add(pnListaIntegrantes, BorderLayout.EAST);
		pnListaIntegrantes.setLayout(new BorderLayout(0, 0));
		
		lblIntegrantes = new JLabel("Integrantes:");
		pnListaIntegrantes.add(lblIntegrantes, BorderLayout.NORTH);
		
		pnBotonesIntegrantes = new JPanel();
		pnListaIntegrantes.add(pnBotonesIntegrantes, BorderLayout.SOUTH);
		
		btnAgregar_1 = new JButton("Agregar");
		btnAgregar_1.setIcon(null);
		pnBotonesIntegrantes.add(btnAgregar_1);
		
		btnBorrar_1 = new JButton("Borrar");
		btnBorrar_1.setIcon(null);
		pnBotonesIntegrantes.add(btnBorrar_1);
		
		spnListaIntegrantes = new JScrollPane();
		pnListaIntegrantes.add(spnListaIntegrantes, BorderLayout.CENTER);
		
		listIntegrantes = new JList();
		spnListaIntegrantes.setViewportView(listIntegrantes);
		
		pnInfoGrupo = new JPanel();
		pnGrupos.add(pnInfoGrupo, BorderLayout.CENTER);
		pnInfoGrupo.setLayout(new BorderLayout(0, 0));
		
		pnEspacio2 = new JPanel();
		pnEspacio2.setPreferredSize(new Dimension(10, 42));
		pnInfoGrupo.add(pnEspacio2, BorderLayout.SOUTH);
		
		pnInfoGrupCentral = new JPanel();
		pnInfoGrupo.add(pnInfoGrupCentral, BorderLayout.CENTER);
		pnInfoGrupCentral.setLayout(new BorderLayout(0, 0));
		
		
		pnInfoGrupo1 = new JPanel();
		pnInfoGrupCentral.add(pnInfoGrupo1, BorderLayout.NORTH);
		GridBagLayout gbl_pnInfoGrupo1 = new GridBagLayout();
		gbl_pnInfoGrupo1.columnWidths = new int[] {125, 101, 0, 0, 0};
		gbl_pnInfoGrupo1.rowHeights = new int[] {0, 0, 0, 30, 0, 0, 0};
		gbl_pnInfoGrupo1.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0};
		gbl_pnInfoGrupo1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnInfoGrupo1.setLayout(gbl_pnInfoGrupo1);
		
		lblNombreGrupo = new JLabel("Nombre grupo:");
		GridBagConstraints gbc_lblNombreGrupo = new GridBagConstraints();
		gbc_lblNombreGrupo.anchor = GridBagConstraints.EAST;
		gbc_lblNombreGrupo.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreGrupo.gridx = 0;
		gbc_lblNombreGrupo.gridy = 1;
		pnInfoGrupo1.add(lblNombreGrupo, gbc_lblNombreGrupo);
		
		txtNombreGrupo = new JTextField();
		GridBagConstraints gbc_txtNombreGrupo = new GridBagConstraints();
		gbc_txtNombreGrupo.gridwidth = 2;
		gbc_txtNombreGrupo.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombreGrupo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreGrupo.gridx = 1;
		gbc_txtNombreGrupo.gridy = 1;
		pnInfoGrupo1.add(txtNombreGrupo, gbc_txtNombreGrupo);
		txtNombreGrupo.setColumns(10);
		
		lblPaisOrigen = new JLabel("Pais origen:");
		GridBagConstraints gbc_lblPaisOrigen = new GridBagConstraints();
		gbc_lblPaisOrigen.anchor = GridBagConstraints.EAST;
		gbc_lblPaisOrigen.insets = new Insets(0, 0, 5, 5);
		gbc_lblPaisOrigen.gridx = 0;
		gbc_lblPaisOrigen.gridy = 2;
		pnInfoGrupo1.add(lblPaisOrigen, gbc_lblPaisOrigen);
		
		txtPais = new JTextField();
		GridBagConstraints gbc_txtPais = new GridBagConstraints();
		gbc_txtPais.insets = new Insets(0, 0, 5, 5);
		gbc_txtPais.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPais.gridx = 1;
		gbc_txtPais.gridy = 2;
		pnInfoGrupo1.add(txtPais, gbc_txtPais);
		txtPais.setColumns(10);
		
		lblLugarDeAlojamiento = new JLabel("Alojamiento:");
		GridBagConstraints gbc_lblLugarDeAlojamiento = new GridBagConstraints();
		gbc_lblLugarDeAlojamiento.anchor = GridBagConstraints.EAST;
		gbc_lblLugarDeAlojamiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblLugarDeAlojamiento.gridx = 0;
		gbc_lblLugarDeAlojamiento.gridy = 3;
		pnInfoGrupo1.add(lblLugarDeAlojamiento, gbc_lblLugarDeAlojamiento);
		
		txtAlojamiento = new JTextField();
		GridBagConstraints gbc_txtAlojamiento = new GridBagConstraints();
		gbc_txtAlojamiento.insets = new Insets(0, 0, 5, 5);
		gbc_txtAlojamiento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAlojamiento.gridx = 1;
		gbc_txtAlojamiento.gridy = 3;
		pnInfoGrupo1.add(txtAlojamiento, gbc_txtAlojamiento);
		txtAlojamiento.setColumns(10);
		
		lblTipologia = new JLabel("Tipología:");
		GridBagConstraints gbc_lblTipologia = new GridBagConstraints();
		gbc_lblTipologia.anchor = GridBagConstraints.EAST;
		gbc_lblTipologia.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipologia.gridx = 0;
		gbc_lblTipologia.gridy = 4;
		pnInfoGrupo1.add(lblTipologia, gbc_lblTipologia);
		
		comboTipGrupo = new JComboBox();
		comboTipGrupo.setModel(new DefaultComboBoxModel(new String[] {"", "Cultural", "Natural", "Gastronómico", "Reunión"}));
		GridBagConstraints gbc_comboTipGrupo = new GridBagConstraints();
		gbc_comboTipGrupo.insets = new Insets(0, 0, 5, 5);
		gbc_comboTipGrupo.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboTipGrupo.gridx = 1;
		gbc_comboTipGrupo.gridy = 4;
		pnInfoGrupo1.add(comboTipGrupo, gbc_comboTipGrupo);
		
		lblGua = new JLabel("Guía:");
		GridBagConstraints gbc_lblGua = new GridBagConstraints();
		gbc_lblGua.anchor = GridBagConstraints.EAST;
		gbc_lblGua.insets = new Insets(0, 0, 5, 5);
		gbc_lblGua.gridx = 0;
		gbc_lblGua.gridy = 5;
		pnInfoGrupo1.add(lblGua, gbc_lblGua);
		
		comboGuiaGrupo = new JComboBox();
		GridBagConstraints gbc_comboGuiaGrupo = new GridBagConstraints();
		gbc_comboGuiaGrupo.insets = new Insets(0, 0, 5, 5);
		gbc_comboGuiaGrupo.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboGuiaGrupo.gridx = 1;
		gbc_comboGuiaGrupo.gridy = 5;
		pnInfoGrupo1.add(comboGuiaGrupo, gbc_comboGuiaGrupo);
		
		pnInteresesGrupo = new MiListaJPanel_2();
		pnInfoGrupCentral.add(pnInteresesGrupo, BorderLayout.SOUTH);
		
		lblIntereses = new JLabel("Intereses:");
		pnInteresesGrupo.add(lblIntereses, BorderLayout.NORTH);
		
		pnRestricciones = new MiListaJPanel_2();
		pnInfoGrupCentral.add(pnRestricciones, BorderLayout.CENTER);
		
		pnTituloRestric = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) pnTituloRestric.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		pnRestricciones.add(pnTituloRestric, BorderLayout.NORTH);
		
		lblRestricciones = new JLabel("Restricciones: ");
		pnTituloRestric.add(lblRestricciones);
		
		rdbtnSi_1 = new JRadioButton("Sí");
		buttonGroup_1.add(rdbtnSi_1);
		pnTituloRestric.add(rdbtnSi_1);
		
		rdbtnNo_1 = new JRadioButton("No");
		buttonGroup_1.add(rdbtnNo_1);
		pnTituloRestric.add(rdbtnNo_1);
		
		pnDiseñoRuta = new JPanel();
		tbPestañas.addTab("Diseño Ruta", null, pnDiseñoRuta, null);
	}

}
