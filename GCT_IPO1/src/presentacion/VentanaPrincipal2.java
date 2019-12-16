package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JToolBar;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.GridBagLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.AbstractListModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class VentanaPrincipal2 extends JFrame {

	private JPanel contentPane;
	private JPanel pnHerramientas;
	private JPanel pnContenido;
	private JButton btnCerrarSesion;
	private JButton btnAyuda;
	private JTabbedPane tbdPestanias;
	private JPanel pnCircuitos;
	private JPanel pnGuias;
	private JPanel pnGrupos;
	private JPanel pnDisenioRuta;
	private JPanel pnCircuitosContratados;
	private JPanel pnCircuitoLugares;
	private JPanel pnCircuitoInfo;
	private JPanel pnBotonesP1;
	private JButton btnAniadirP1;
	private JButton btnModificarP1;
	private JButton btnLimpiarP1;
	private JButton btnBorrarP1;
	private JScrollPane spnListaCircuitos;
	private JPanel pnContratacionLugares;
	private JButton btnContratar;
	private JCheckBox chckbxContratado;
	private JScrollPane spnListLugares;
	private JList listLugares;
	private JScrollPane spnSugerencias;
	private JPanel pnInfoGeneral;
	private JLabel lblSugerencias;
	private JLabel lblCircuitosContratados;
	private JList listCircuitosContratados;
	private  JList listSugerencias;
	private JLabel lblNombreCircuito;
	private JScrollPane spnLugaresInteres;
	private JLabel lblPuntosDeInteres;
	private JList listPuntosDeInteres;
	private JLabel lblPersonasRealizado;
	private JLabel lblIncidencias;
	private JLabel lblCosteCircuito;
	private JTextField txtfNombreCircuito;
	private JTextField txtfCosteCircuito;
	private JLabel lblLugaresVisita;
	private JPanel pnListadoGuias;
	private JPanel pnIdiomas;
	private JPanel pnBotonesP2;
	private JButton btnAniadirP2;
	private JButton btnModificarP2;
	private JButton btnLimpiarP2;
	private JButton btnBorrarP2;
	private JLabel lblListadoGuias;
	private JScrollPane spnListaGuias;
	private JList listGuias;
	private JPanel pnBotonesIdiomas;
	private JLabel lblIdiomasGuia;
	private JButton btnAniadirIdioma;
	private JButton btnBorrarIdioma;
	private JScrollPane spnListaIdiomas;
	private JList listIdiomas;
	private JPanel pnInformacionGuia;
	private JPanel pnImagenGuia;
	private JLabel lblImagenGuia;
	private JScrollPane spnRutasGuia;
	private JLabel lblRutasGuia;
	private JList listRutasGuia;
	private JPanel pnInfoGuia;
	private JLabel lblNombre;
	private JTextField txtfNombre;
	private JLabel lblApellidos;
	private JLabel lblCorreoElectrnico;
	private JLabel lblNTelefono;
	private JLabel lblPrecioHora;
	private JLabel lblPuntuacinMedia;
	private JLabel lblDisponibilidad;
	private JTextField txtfApellidos;
	private JTextField txtfCorreo;
	private JTextField txtfTelefono;
	private JTextField txtfPrecioHora;
	private JTextField txtfPuntuacion;
	private JPanel pnListadoGrupos;
	private JPanel pnBotonesP3;
	private JButton btnAniadirP3;
	private JButton btnModificarP3;
	private JButton btnLimpiarP3;
	private JButton btnBorrarP3;
	private JLabel lblListadoGrupos;
	private JScrollPane spnListadoGrupos;
	private JList listGrupos;
	private JPanel pnIntegrantesGrupos;
	private JPanel pnBotonesIntregrantes;
	private JButton btnAgregar;
	private JButton btnEliminar;
	private JLabel lblIntegrantes;
	private JScrollPane spnIntegrantes;
	private JList listIntegrantes;
	private JPanel pnInformacionGrupos;
	private JRadioButton rdbtnSiGuias;
	private JRadioButton rdbtNoGuias;
	private JRadioButton rdbtnSi_Circuitos;
	private JRadioButton rdbtnNo_Circuitos;
	private JSpinner spinnerPersonasCircuitos;
	private JPanel pnFormularioGrupo;
	private JLabel lblNombreGrupo;
	private JTextField txtfNombreGrupo;
	private JLabel lblPaisOrigen;
	private JTextField txtfPaisGrupo;
	private JLabel lblLugarDeAlojamiento;
	private JTextField txtfLugarAlojamiento;
	private JLabel lblTipologaGrupo;
	private JComboBox cbTipologiaGrupo;
	private JLabel lblGuiaGrupo;
	private JComboBox cbGuiaGrupo;
	private JPanel pnInteresesGrupo;
	private JLabel lblInteresesGrupo;
	private JScrollPane spnInteresesGrupo;
	private JPanel pnBotonesInteresesGrupo;
	private JButton btnAgregarInteresGrupo;
	private JButton btnEliminarInteresGrupo;
	private JList listIntereses;
	private JPanel pnRestricciones;
	private JPanel pnOpcionRestricciones;
	private JLabel lblRestricciones;
	private JRadioButton rdbtnSiRestriccionesGrupo;
	private JRadioButton rdbtnNoGrupo;
	private JPanel pnBotonesRestriccionesGrupo;
	private JButton btnAgregarRestriccionGrupo;
	private JButton btnEliminarRestriccionGrupo;
	private JScrollPane spnRestriccionesGrupo;
	private JList listRestriccionesGrupo;
	private JButton btnUsuarioApp;
	private JButton btnCambiarFotoGuia;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal2 ventana_principal = new VentanaPrincipal2();
					ventana_principal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal2() {
		setTitle("Manchatours");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal2.class.getResource("/presentacion/imagenes/iconos/compass.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pnHerramientas = new JPanel();
		pnHerramientas.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnHerramientas.setPreferredSize(new Dimension(0, 50));
		contentPane.add(pnHerramientas, BorderLayout.NORTH);
		pnHerramientas.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.addActionListener(new BtnNewButtonActionListener());

		
		btnAyuda = new JButton("");
		btnAyuda.setIcon(new ImageIcon(VentanaPrincipal2.class.getResource("/presentacion/imagenes/iconos/info-32.png")));
		btnAyuda.setBorderPainted(false);
		btnAyuda.setContentAreaFilled(false);
		pnHerramientas.add(btnAyuda);
		
		btnUsuarioApp = new JButton("User");
		btnUsuarioApp.addActionListener(new BtnUsuarioAppActionListener());
		btnUsuarioApp.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnUsuarioApp.setIcon(new ImageIcon(VentanaPrincipal2.class.getResource("/presentacion/imagenes/iconos/userApp.png")));
		btnUsuarioApp.setBorderPainted(false);
		btnUsuarioApp.setContentAreaFilled(false);
		pnHerramientas.add(btnUsuarioApp);
		pnHerramientas.add(btnCerrarSesion);

		
		pnContenido = new JPanel();
		contentPane.add(pnContenido, BorderLayout.CENTER);
		pnContenido.setLayout(new BorderLayout(0, 0));
		
		tbdPestanias = new JTabbedPane(JTabbedPane.TOP);
		tbdPestanias.setToolTipText("");
		pnContenido.add(tbdPestanias);
		
		//Creacion panel Circuitos
		pnCircuitos = new JPanel();
		tbdPestanias.addTab("Circuitos", null, pnCircuitos, null);
		pnCircuitos.setLayout(new BorderLayout(0, 0));
		
		pnCircuitosContratados = new JPanel();
		pnCircuitosContratados.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnCircuitos.add(pnCircuitosContratados, BorderLayout.WEST);
		pnCircuitosContratados.setLayout(new BorderLayout(0, 0));
		
		pnBotonesP1 = new JPanel();
		pnBotonesP1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnCircuitosContratados.add(pnBotonesP1, BorderLayout.SOUTH);
		
		btnAniadirP1 = new JButton("Añadir");
		pnBotonesP1.add(btnAniadirP1);
		
		btnModificarP1 = new JButton("Modificar");
		pnBotonesP1.add(btnModificarP1);
		
		btnLimpiarP1 = new JButton("Limpiar");
		pnBotonesP1.add(btnLimpiarP1);
		
		btnBorrarP1 = new JButton("Borrar");
		pnBotonesP1.add(btnBorrarP1);
		
		spnListaCircuitos = new JScrollPane();
		pnCircuitosContratados.add(spnListaCircuitos, BorderLayout.CENTER);
		
		lblCircuitosContratados = new JLabel("Circuitos contratados:");
		spnListaCircuitos.setColumnHeaderView(lblCircuitosContratados);
		
		listCircuitosContratados = new JList();
		listCircuitosContratados.setModel(new AbstractListModel() {
			String[] values = new String[] {"Circuito por Porzuna", "Circuito por Ciudad Real", "Circuito por Almadén", "Circuito por Daimiel"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		spnListaCircuitos.setViewportView(listCircuitosContratados);
		
		pnCircuitoLugares = new JPanel();
		pnCircuitoLugares.setPreferredSize(new Dimension(360, 10));
		pnCircuitos.add(pnCircuitoLugares, BorderLayout.EAST);
		pnCircuitoLugares.setLayout(new BorderLayout(0, 0));
		
		pnContratacionLugares = new JPanel();
		pnContratacionLugares.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnContratacionLugares.setPreferredSize(new Dimension(10, 36));
		pnCircuitoLugares.add(pnContratacionLugares, BorderLayout.SOUTH);
		
		btnContratar = new JButton("Contratar");
		btnContratar.setIcon(new ImageIcon(VentanaPrincipal2.class.getResource("/presentacion/imagenes/iconos/shopping-cart x16.png")));
		
		chckbxContratado = new JCheckBox("Contratado");
		chckbxContratado.setHorizontalAlignment(SwingConstants.RIGHT);
		chckbxContratado.setEnabled(false);
		chckbxContratado.setVerticalAlignment(SwingConstants.BOTTOM);
		GroupLayout gl_pnContratacionLugares = new GroupLayout(pnContratacionLugares);
		gl_pnContratacionLugares.setHorizontalGroup(
			gl_pnContratacionLugares.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnContratacionLugares.createSequentialGroup()
					.addContainerGap(136, Short.MAX_VALUE)
					.addComponent(btnContratar, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxContratado, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(10))
		);
		gl_pnContratacionLugares.setVerticalGroup(
			gl_pnContratacionLugares.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnContratacionLugares.createSequentialGroup()
					.addComponent(btnContratar)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_pnContratacionLugares.createSequentialGroup()
					.addContainerGap(13, Short.MAX_VALUE)
					.addComponent(chckbxContratado))
		);
		pnContratacionLugares.setLayout(gl_pnContratacionLugares);
		
		spnListLugares = new JScrollPane();
		pnCircuitoLugares.add(spnListLugares, BorderLayout.CENTER);
		
		listLugares = new JList();
		listLugares.addListSelectionListener(new ListLugaresListSelectionListener());
		listLugares.setModel(new AbstractListModel() {
			String[] values = new String[] {"Lugar 1"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		spnListLugares.setViewportView(listLugares);
		
		lblLugaresVisita = new JLabel("Lugares de visita:");
		spnListLugares.setColumnHeaderView(lblLugaresVisita);
		
		pnCircuitoInfo = new JPanel();
		pnCircuitos.add(pnCircuitoInfo, BorderLayout.CENTER);
		pnCircuitoInfo.setLayout(new BorderLayout(0, 0));
		
		spnSugerencias = new JScrollPane();
		pnCircuitoInfo.add(spnSugerencias, BorderLayout.SOUTH);
		
		lblSugerencias = new JLabel("Opiniones y sugerencias:");
		//spnSugerencias.setViewportView(lblSugerencias);
		spnSugerencias.setColumnHeaderView(lblSugerencias);


		
		listSugerencias = new JList();
		spnSugerencias.setViewportView(listSugerencias);
		
		
		pnInfoGeneral = new JPanel();
		pnCircuitoInfo.add(pnInfoGeneral, BorderLayout.NORTH);
		GridBagLayout gbl_pnInfoGeneral = new GridBagLayout();
		gbl_pnInfoGeneral.columnWidths = new int[] {101, 101, 101};
		gbl_pnInfoGeneral.rowHeights = new int[] {20, 0, 0, 0};
		gbl_pnInfoGeneral.columnWeights = new double[]{0.0, 0.0, 0.0};
		gbl_pnInfoGeneral.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		pnInfoGeneral.setLayout(gbl_pnInfoGeneral);
		
		lblNombreCircuito = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombreCircuito = new GridBagConstraints();
		gbc_lblNombreCircuito.anchor = GridBagConstraints.EAST;
		gbc_lblNombreCircuito.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreCircuito.gridx = 0;
		gbc_lblNombreCircuito.gridy = 0;
		pnInfoGeneral.add(lblNombreCircuito, gbc_lblNombreCircuito);
		
		txtfNombreCircuito = new JTextField();
		GridBagConstraints gbc_txtfNombreCircuito = new GridBagConstraints();
		gbc_txtfNombreCircuito.gridwidth = 2;
		gbc_txtfNombreCircuito.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfNombreCircuito.insets = new Insets(0, 0, 5, 0);
		gbc_txtfNombreCircuito.gridx = 1;
		gbc_txtfNombreCircuito.gridy = 0;
		pnInfoGeneral.add(txtfNombreCircuito, gbc_txtfNombreCircuito);
		txtfNombreCircuito.setColumns(10);
		
		lblPersonasRealizado = new JLabel("Lo han realizado:");
		GridBagConstraints gbc_lblPersonasRealizado = new GridBagConstraints();
		gbc_lblPersonasRealizado.anchor = GridBagConstraints.EAST;
		gbc_lblPersonasRealizado.insets = new Insets(0, 0, 5, 5);
		gbc_lblPersonasRealizado.gridx = 0;
		gbc_lblPersonasRealizado.gridy = 1;
		pnInfoGeneral.add(lblPersonasRealizado, gbc_lblPersonasRealizado);
		
		spinnerPersonasCircuitos = new JSpinner();
		spinnerPersonasCircuitos.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		GridBagConstraints gbc_spinnerPersonasCircuitos = new GridBagConstraints();
		gbc_spinnerPersonasCircuitos.anchor = GridBagConstraints.WEST;
		gbc_spinnerPersonasCircuitos.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerPersonasCircuitos.gridx = 1;
		gbc_spinnerPersonasCircuitos.gridy = 1;
		pnInfoGeneral.add(spinnerPersonasCircuitos, gbc_spinnerPersonasCircuitos);
		
		lblIncidencias = new JLabel("Incidencias:");
		GridBagConstraints gbc_lblIncidencias = new GridBagConstraints();
		gbc_lblIncidencias.anchor = GridBagConstraints.EAST;
		gbc_lblIncidencias.insets = new Insets(0, 0, 5, 5);
		gbc_lblIncidencias.gridx = 0;
		gbc_lblIncidencias.gridy = 2;
		pnInfoGeneral.add(lblIncidencias, gbc_lblIncidencias);
		
		rdbtnSi_Circuitos = new JRadioButton("Si");
		GridBagConstraints gbc_rdbtnSi_Circuitos = new GridBagConstraints();
		gbc_rdbtnSi_Circuitos.anchor = GridBagConstraints.WEST;
		gbc_rdbtnSi_Circuitos.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnSi_Circuitos.gridx = 1;
		gbc_rdbtnSi_Circuitos.gridy = 2;
		pnInfoGeneral.add(rdbtnSi_Circuitos, gbc_rdbtnSi_Circuitos);
		
		rdbtnNo_Circuitos = new JRadioButton("No");
		GridBagConstraints gbc_rdbtnNo_Circuitos = new GridBagConstraints();
		gbc_rdbtnNo_Circuitos.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNo_Circuitos.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNo_Circuitos.gridx = 2;
		gbc_rdbtnNo_Circuitos.gridy = 2;
		pnInfoGeneral.add(rdbtnNo_Circuitos, gbc_rdbtnNo_Circuitos);
		
		lblCosteCircuito = new JLabel("Coste:");
		GridBagConstraints gbc_lblCosteCircuito = new GridBagConstraints();
		gbc_lblCosteCircuito.anchor = GridBagConstraints.EAST;
		gbc_lblCosteCircuito.insets = new Insets(0, 0, 0, 5);
		gbc_lblCosteCircuito.gridx = 0;
		gbc_lblCosteCircuito.gridy = 3;
		pnInfoGeneral.add(lblCosteCircuito, gbc_lblCosteCircuito);
		
		txtfCosteCircuito = new JTextField();
		GridBagConstraints gbc_txtfCosteCircuito = new GridBagConstraints();
		gbc_txtfCosteCircuito.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfCosteCircuito.insets = new Insets(0, 0, 0, 5);
		gbc_txtfCosteCircuito.gridx = 1;
		gbc_txtfCosteCircuito.gridy = 3;
		pnInfoGeneral.add(txtfCosteCircuito, gbc_txtfCosteCircuito);
		txtfCosteCircuito.setColumns(10);
		
		spnLugaresInteres = new JScrollPane();
		spnLugaresInteres.setPreferredSize(new Dimension(30, 70));
		pnCircuitoInfo.add(spnLugaresInteres, BorderLayout.CENTER);
		
		lblPuntosDeInteres = new JLabel("Puntos de interes:");
		spnLugaresInteres.setColumnHeaderView(lblPuntosDeInteres);
		
		listPuntosDeInteres = new JList();
		spnLugaresInteres.setViewportView(listPuntosDeInteres);
		
		// Creacion Panel guias
		pnGuias = new JPanel();
		tbdPestanias.addTab("Guias", null, pnGuias, null);
		pnGuias.setLayout(new BorderLayout(0, 0));
		
		pnListadoGuias = new JPanel();
		pnListadoGuias.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnGuias.add(pnListadoGuias, BorderLayout.WEST);
		pnListadoGuias.setLayout(new BorderLayout(0, 0));
		
		pnBotonesP2 = new JPanel();
		pnBotonesP2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnListadoGuias.add(pnBotonesP2, BorderLayout.SOUTH);
		
		btnAniadirP2 = new JButton("Añadir");
		pnBotonesP2.add(btnAniadirP2);
		
		btnModificarP2 = new JButton("Modificar");
		pnBotonesP2.add(btnModificarP2);
		
		btnLimpiarP2 = new JButton("Limpiar");
		pnBotonesP2.add(btnLimpiarP2);
		
		btnBorrarP2 = new JButton("Borrar");
		pnBotonesP2.add(btnBorrarP2);
		
		lblListadoGuias = new JLabel("Guías contratados:");
		pnListadoGuias.add(lblListadoGuias, BorderLayout.NORTH);
		
		spnListaGuias = new JScrollPane();
		pnListadoGuias.add(spnListaGuias, BorderLayout.CENTER);
		
		listGuias = new JList();
		spnListaGuias.setViewportView(listGuias);
		
		pnIdiomas = new JPanel();
		pnGuias.add(pnIdiomas, BorderLayout.EAST);
		pnIdiomas.setLayout(new BorderLayout(0, 0));
		
		pnBotonesIdiomas = new JPanel();
		pnBotonesIdiomas.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnIdiomas.add(pnBotonesIdiomas, BorderLayout.SOUTH);
		pnBotonesIdiomas.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnAniadirIdioma = new JButton("Añadir");
		pnBotonesIdiomas.add(btnAniadirIdioma);
		
		btnBorrarIdioma = new JButton("Borrar");
		pnBotonesIdiomas.add(btnBorrarIdioma);
		
		lblIdiomasGuia = new JLabel("Idiomas:");
		pnIdiomas.add(lblIdiomasGuia, BorderLayout.NORTH);
		
		spnListaIdiomas = new JScrollPane();
		pnIdiomas.add(spnListaIdiomas, BorderLayout.CENTER);
		
		listIdiomas = new JList();
		spnListaIdiomas.setViewportView(listIdiomas);
		
		pnInformacionGuia = new JPanel();
		pnGuias.add(pnInformacionGuia, BorderLayout.CENTER);
		pnInformacionGuia.setLayout(new BorderLayout(0, 0));
		
		pnImagenGuia = new JPanel();
		pnInformacionGuia.add(pnImagenGuia, BorderLayout.NORTH);
		pnImagenGuia.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblImagenGuia = new JLabel("");
		lblImagenGuia.setIcon(new ImageIcon(VentanaPrincipal2.class.getResource("/presentacion/imagenes/perfiles/user.png")));
		pnImagenGuia.add(lblImagenGuia);
		
		btnCambiarFotoGuia = new JButton("Seleccionar");
		pnImagenGuia.add(btnCambiarFotoGuia);
		
		spnRutasGuia = new JScrollPane();
		spnRutasGuia.setPreferredSize(new Dimension(10, 200));
		pnInformacionGuia.add(spnRutasGuia, BorderLayout.SOUTH);
		
		lblRutasGuia = new JLabel("Historial de rutas:");
		spnRutasGuia.setColumnHeaderView(lblRutasGuia);
		
		listRutasGuia = new JList();
		spnRutasGuia.setViewportView(listRutasGuia);
		
		pnInfoGuia = new JPanel();
		pnInformacionGuia.add(pnInfoGuia, BorderLayout.CENTER);
		GridBagLayout gbl_pnInfoGuia = new GridBagLayout();
		gbl_pnInfoGuia.columnWidths = new int[] {101, 101, 101, 0};
		gbl_pnInfoGuia.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 20};
		gbl_pnInfoGuia.columnWeights = new double[]{0.0, 0.0, 0.0};
		gbl_pnInfoGuia.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		pnInfoGuia.setLayout(gbl_pnInfoGuia);
		
		lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 0;
		pnInfoGuia.add(lblNombre, gbc_lblNombre);
		
		txtfNombre = new JTextField();
		GridBagConstraints gbc_txtfNombre = new GridBagConstraints();
		gbc_txtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtfNombre.gridx = 1;
		gbc_txtfNombre.gridy = 0;
		pnInfoGuia.add(txtfNombre, gbc_txtfNombre);
		txtfNombre.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos:");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 0;
		gbc_lblApellidos.gridy = 1;
		pnInfoGuia.add(lblApellidos, gbc_lblApellidos);
		
		txtfApellidos = new JTextField();
		GridBagConstraints gbc_txtfApellidos = new GridBagConstraints();
		gbc_txtfApellidos.gridwidth = 2;
		gbc_txtfApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtfApellidos.gridx = 1;
		gbc_txtfApellidos.gridy = 1;
		pnInfoGuia.add(txtfApellidos, gbc_txtfApellidos);
		txtfApellidos.setColumns(10);
		
		lblCorreoElectrnico = new JLabel("Correo electrónico:");
		GridBagConstraints gbc_lblCorreoElectrnico = new GridBagConstraints();
		gbc_lblCorreoElectrnico.anchor = GridBagConstraints.EAST;
		gbc_lblCorreoElectrnico.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreoElectrnico.gridx = 0;
		gbc_lblCorreoElectrnico.gridy = 2;
		pnInfoGuia.add(lblCorreoElectrnico, gbc_lblCorreoElectrnico);
		
		txtfCorreo = new JTextField();
		GridBagConstraints gbc_txtfCorreo = new GridBagConstraints();
		gbc_txtfCorreo.gridwidth = 2;
		gbc_txtfCorreo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_txtfCorreo.gridx = 1;
		gbc_txtfCorreo.gridy = 2;
		pnInfoGuia.add(txtfCorreo, gbc_txtfCorreo);
		txtfCorreo.setColumns(10);
		
		lblNTelefono = new JLabel("Nº Teléfono:");
		GridBagConstraints gbc_lblNTelefono = new GridBagConstraints();
		gbc_lblNTelefono.anchor = GridBagConstraints.EAST;
		gbc_lblNTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblNTelefono.gridx = 0;
		gbc_lblNTelefono.gridy = 3;
		pnInfoGuia.add(lblNTelefono, gbc_lblNTelefono);
		
		txtfTelefono = new JTextField();
		GridBagConstraints gbc_txtfTelefono = new GridBagConstraints();
		gbc_txtfTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_txtfTelefono.gridx = 1;
		gbc_txtfTelefono.gridy = 3;
		pnInfoGuia.add(txtfTelefono, gbc_txtfTelefono);
		txtfTelefono.setColumns(10);
		
		lblPrecioHora = new JLabel("Precio / Hora:");
		GridBagConstraints gbc_lblPrecioHora = new GridBagConstraints();
		gbc_lblPrecioHora.anchor = GridBagConstraints.EAST;
		gbc_lblPrecioHora.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioHora.gridx = 0;
		gbc_lblPrecioHora.gridy = 4;
		pnInfoGuia.add(lblPrecioHora, gbc_lblPrecioHora);
		
		txtfPrecioHora = new JTextField();
		GridBagConstraints gbc_txtfPrecioHora = new GridBagConstraints();
		gbc_txtfPrecioHora.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfPrecioHora.insets = new Insets(0, 0, 5, 5);
		gbc_txtfPrecioHora.gridx = 1;
		gbc_txtfPrecioHora.gridy = 4;
		pnInfoGuia.add(txtfPrecioHora, gbc_txtfPrecioHora);
		txtfPrecioHora.setColumns(10);
		
		lblPuntuacinMedia = new JLabel("Puntuación media:");
		GridBagConstraints gbc_lblPuntuacinMedia = new GridBagConstraints();
		gbc_lblPuntuacinMedia.anchor = GridBagConstraints.EAST;
		gbc_lblPuntuacinMedia.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntuacinMedia.gridx = 0;
		gbc_lblPuntuacinMedia.gridy = 5;
		pnInfoGuia.add(lblPuntuacinMedia, gbc_lblPuntuacinMedia);
		
		txtfPuntuacion = new JTextField();
		GridBagConstraints gbc_txtfPuntuacion = new GridBagConstraints();
		gbc_txtfPuntuacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfPuntuacion.insets = new Insets(0, 0, 5, 5);
		gbc_txtfPuntuacion.gridx = 1;
		gbc_txtfPuntuacion.gridy = 5;
		pnInfoGuia.add(txtfPuntuacion, gbc_txtfPuntuacion);
		txtfPuntuacion.setColumns(10);
		
		lblDisponibilidad = new JLabel("Disponibilidad:");
		GridBagConstraints gbc_lblDisponibilidad = new GridBagConstraints();
		gbc_lblDisponibilidad.anchor = GridBagConstraints.EAST;
		gbc_lblDisponibilidad.insets = new Insets(0, 0, 0, 5);
		gbc_lblDisponibilidad.gridx = 0;
		gbc_lblDisponibilidad.gridy = 6;
		pnInfoGuia.add(lblDisponibilidad, gbc_lblDisponibilidad);
		
		rdbtnSiGuias = new JRadioButton("Si");
		GridBagConstraints gbc_rdbtnSiGuias = new GridBagConstraints();
		gbc_rdbtnSiGuias.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnSiGuias.gridx = 1;
		gbc_rdbtnSiGuias.gridy = 6;
		pnInfoGuia.add(rdbtnSiGuias, gbc_rdbtnSiGuias);
		
		rdbtNoGuias = new JRadioButton("No");
		GridBagConstraints gbc_rdbtNoGuias = new GridBagConstraints();
		gbc_rdbtNoGuias.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtNoGuias.gridx = 2;
		gbc_rdbtNoGuias.gridy = 6;
		pnInfoGuia.add(rdbtNoGuias, gbc_rdbtNoGuias);
		
		pnGrupos = new JPanel();
		tbdPestanias.addTab("Grupos", null, pnGrupos, null);
		pnGrupos.setLayout(new BorderLayout(0, 0));
		
		pnListadoGrupos = new JPanel();
		pnListadoGrupos.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnGrupos.add(pnListadoGrupos, BorderLayout.WEST);
		pnListadoGrupos.setLayout(new BorderLayout(0, 0));
		
		pnBotonesP3 = new JPanel();
		pnBotonesP3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnListadoGrupos.add(pnBotonesP3, BorderLayout.SOUTH);
		
		btnAniadirP3 = new JButton("Añadir");
		pnBotonesP3.add(btnAniadirP3);
		
		btnModificarP3 = new JButton("Modificar");
		pnBotonesP3.add(btnModificarP3);
		
		btnLimpiarP3 = new JButton("Limpiar");
		pnBotonesP3.add(btnLimpiarP3);
		
		btnBorrarP3 = new JButton("Borrar");
		pnBotonesP3.add(btnBorrarP3);
		
		lblListadoGrupos = new JLabel("Grupos turísticos (4 - 20 personas):");
		pnListadoGrupos.add(lblListadoGrupos, BorderLayout.NORTH);
		
		spnListadoGrupos = new JScrollPane();
		pnListadoGrupos.add(spnListadoGrupos, BorderLayout.CENTER);
		
		listGrupos = new JList();
		listGrupos.setEnabled(false);
		spnListadoGrupos.setViewportView(listGrupos);
		
		pnIntegrantesGrupos = new JPanel();
		pnGrupos.add(pnIntegrantesGrupos, BorderLayout.EAST);
		pnIntegrantesGrupos.setLayout(new BorderLayout(0, 0));
		
		pnBotonesIntregrantes = new JPanel();
		pnBotonesIntregrantes.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnIntegrantesGrupos.add(pnBotonesIntregrantes, BorderLayout.SOUTH);
		
		btnAgregar = new JButton("Agregar");
		pnBotonesIntregrantes.add(btnAgregar);
		
		btnEliminar = new JButton("Eliminar");
		pnBotonesIntregrantes.add(btnEliminar);
		
		lblIntegrantes = new JLabel("Integrantes:");
		pnIntegrantesGrupos.add(lblIntegrantes, BorderLayout.NORTH);
		
		spnIntegrantes = new JScrollPane();
		pnIntegrantesGrupos.add(spnIntegrantes, BorderLayout.CENTER);
		
		listIntegrantes = new JList();
		spnIntegrantes.setViewportView(listIntegrantes);
		
		pnInformacionGrupos = new JPanel();
		pnGrupos.add(pnInformacionGrupos, BorderLayout.CENTER);
		pnInformacionGrupos.setLayout(new BorderLayout(0, 0));
		
		pnFormularioGrupo = new JPanel();
		pnInformacionGrupos.add(pnFormularioGrupo, BorderLayout.NORTH);
		GridBagLayout gbl_pnFormularioGrupo = new GridBagLayout();
		gbl_pnFormularioGrupo.columnWidths = new int[] {101, 101, 30, 0};
		gbl_pnFormularioGrupo.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_pnFormularioGrupo.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		gbl_pnFormularioGrupo.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnFormularioGrupo.setLayout(gbl_pnFormularioGrupo);
		
		lblNombreGrupo = new JLabel("Nombre grupo:");
		GridBagConstraints gbc_lblNombreGrupo = new GridBagConstraints();
		gbc_lblNombreGrupo.anchor = GridBagConstraints.EAST;
		gbc_lblNombreGrupo.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreGrupo.gridx = 0;
		gbc_lblNombreGrupo.gridy = 0;
		pnFormularioGrupo.add(lblNombreGrupo, gbc_lblNombreGrupo);
		
		txtfNombreGrupo = new JTextField();
		GridBagConstraints gbc_txtfNombreGrupo = new GridBagConstraints();
		gbc_txtfNombreGrupo.gridwidth = 3;
		gbc_txtfNombreGrupo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfNombreGrupo.insets = new Insets(0, 0, 5, 0);
		gbc_txtfNombreGrupo.gridx = 1;
		gbc_txtfNombreGrupo.gridy = 0;
		pnFormularioGrupo.add(txtfNombreGrupo, gbc_txtfNombreGrupo);
		txtfNombreGrupo.setColumns(10);
		
		lblPaisOrigen = new JLabel("Pais origen:");
		GridBagConstraints gbc_lblPaisOrigen = new GridBagConstraints();
		gbc_lblPaisOrigen.anchor = GridBagConstraints.EAST;
		gbc_lblPaisOrigen.insets = new Insets(0, 0, 5, 5);
		gbc_lblPaisOrigen.gridx = 0;
		gbc_lblPaisOrigen.gridy = 1;
		pnFormularioGrupo.add(lblPaisOrigen, gbc_lblPaisOrigen);
		
		txtfPaisGrupo = new JTextField();
		GridBagConstraints gbc_txtfPaisGrupo = new GridBagConstraints();
		gbc_txtfPaisGrupo.insets = new Insets(0, 0, 5, 5);
		gbc_txtfPaisGrupo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfPaisGrupo.gridx = 1;
		gbc_txtfPaisGrupo.gridy = 1;
		pnFormularioGrupo.add(txtfPaisGrupo, gbc_txtfPaisGrupo);
		txtfPaisGrupo.setColumns(10);
		
		lblLugarDeAlojamiento = new JLabel("Lugar de alojamiento:");
		GridBagConstraints gbc_lblLugarDeAlojamiento = new GridBagConstraints();
		gbc_lblLugarDeAlojamiento.anchor = GridBagConstraints.EAST;
		gbc_lblLugarDeAlojamiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblLugarDeAlojamiento.gridx = 0;
		gbc_lblLugarDeAlojamiento.gridy = 2;
		pnFormularioGrupo.add(lblLugarDeAlojamiento, gbc_lblLugarDeAlojamiento);
		
		txtfLugarAlojamiento = new JTextField();
		GridBagConstraints gbc_txtfLugarAlojamiento = new GridBagConstraints();
		gbc_txtfLugarAlojamiento.gridwidth = 2;
		gbc_txtfLugarAlojamiento.insets = new Insets(0, 0, 5, 5);
		gbc_txtfLugarAlojamiento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfLugarAlojamiento.gridx = 1;
		gbc_txtfLugarAlojamiento.gridy = 2;
		pnFormularioGrupo.add(txtfLugarAlojamiento, gbc_txtfLugarAlojamiento);
		txtfLugarAlojamiento.setColumns(10);
		
		lblTipologaGrupo = new JLabel("Tipología:");
		GridBagConstraints gbc_lblTipologaGrupo = new GridBagConstraints();
		gbc_lblTipologaGrupo.anchor = GridBagConstraints.EAST;
		gbc_lblTipologaGrupo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipologaGrupo.gridx = 0;
		gbc_lblTipologaGrupo.gridy = 3;
		pnFormularioGrupo.add(lblTipologaGrupo, gbc_lblTipologaGrupo);
		
		cbTipologiaGrupo = new JComboBox();
		cbTipologiaGrupo.setModel(new DefaultComboBoxModel(new String[] {"", "Cultural", "Naturaleza", "Gastronómico", "Reuniones"}));
		GridBagConstraints gbc_cbTipologiaGrupo = new GridBagConstraints();
		gbc_cbTipologiaGrupo.insets = new Insets(0, 0, 5, 5);
		gbc_cbTipologiaGrupo.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbTipologiaGrupo.gridx = 1;
		gbc_cbTipologiaGrupo.gridy = 3;
		pnFormularioGrupo.add(cbTipologiaGrupo, gbc_cbTipologiaGrupo);
		
		lblGuiaGrupo = new JLabel("Guía:");
		GridBagConstraints gbc_lblGuiaGrupo = new GridBagConstraints();
		gbc_lblGuiaGrupo.anchor = GridBagConstraints.EAST;
		gbc_lblGuiaGrupo.insets = new Insets(0, 0, 0, 5);
		gbc_lblGuiaGrupo.gridx = 0;
		gbc_lblGuiaGrupo.gridy = 4;
		pnFormularioGrupo.add(lblGuiaGrupo, gbc_lblGuiaGrupo);
		
		cbGuiaGrupo = new JComboBox();
		GridBagConstraints gbc_cbGuiaGrupo = new GridBagConstraints();
		gbc_cbGuiaGrupo.insets = new Insets(0, 0, 0, 5);
		gbc_cbGuiaGrupo.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbGuiaGrupo.gridx = 1;
		gbc_cbGuiaGrupo.gridy = 4;
		pnFormularioGrupo.add(cbGuiaGrupo, gbc_cbGuiaGrupo);
		
		pnInteresesGrupo = new JPanel();
		pnInteresesGrupo.setPreferredSize(new Dimension(10, 100));
		pnInformacionGrupos.add(pnInteresesGrupo, BorderLayout.SOUTH);
		pnInteresesGrupo.setLayout(new BorderLayout(0, 0));
		
		lblInteresesGrupo = new JLabel("Intereses:");
		pnInteresesGrupo.add(lblInteresesGrupo, BorderLayout.NORTH);
		
		spnInteresesGrupo = new JScrollPane();
		pnInteresesGrupo.add(spnInteresesGrupo, BorderLayout.CENTER);
		
		listIntereses = new JList();
		spnInteresesGrupo.setViewportView(listIntereses);
		
		pnBotonesInteresesGrupo = new JPanel();
		pnInteresesGrupo.add(pnBotonesInteresesGrupo, BorderLayout.EAST);
		pnBotonesInteresesGrupo.setLayout(new GridLayout(2, 1, 0, 0));
		
		btnAgregarInteresGrupo = new JButton("");
		btnAgregarInteresGrupo.setIcon(new ImageIcon(VentanaPrincipal2.class.getResource("/presentacion/imagenes/iconos/plus16.png")));
		pnBotonesInteresesGrupo.add(btnAgregarInteresGrupo);
		btnAgregarInteresGrupo.setBorderPainted(false);
		btnAgregarInteresGrupo.setContentAreaFilled(false);
		
		btnEliminarInteresGrupo = new JButton("");
		btnEliminarInteresGrupo.setIcon(new ImageIcon(VentanaPrincipal2.class.getResource("/presentacion/imagenes/iconos/remove16.png")));
		pnBotonesInteresesGrupo.add(btnEliminarInteresGrupo);
		btnEliminarInteresGrupo.setBorderPainted(false);
		btnEliminarInteresGrupo.setContentAreaFilled(false);
		
		pnRestricciones = new JPanel();
		pnInformacionGrupos.add(pnRestricciones, BorderLayout.CENTER);
		pnRestricciones.setLayout(new BorderLayout(0, 0));
		
		pnOpcionRestricciones = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pnOpcionRestricciones.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		pnRestricciones.add(pnOpcionRestricciones, BorderLayout.NORTH);
		
		lblRestricciones = new JLabel("Restricciones:");
		pnOpcionRestricciones.add(lblRestricciones);
		
		rdbtnSiRestriccionesGrupo = new JRadioButton("Sí");
		pnOpcionRestricciones.add(rdbtnSiRestriccionesGrupo);
		
		rdbtnNoGrupo = new JRadioButton("No");
		pnOpcionRestricciones.add(rdbtnNoGrupo);
		
		pnBotonesRestriccionesGrupo = new JPanel();
		pnRestricciones.add(pnBotonesRestriccionesGrupo, BorderLayout.EAST);
		pnBotonesRestriccionesGrupo.setLayout(new GridLayout(2, 1, 0, 0));
		
		btnAgregarRestriccionGrupo = new JButton("");
		btnAgregarRestriccionGrupo.setIcon(new ImageIcon(VentanaPrincipal2.class.getResource("/presentacion/imagenes/iconos/plus24.png")));
		btnAgregarRestriccionGrupo.setEnabled(false);
		pnBotonesRestriccionesGrupo.add(btnAgregarRestriccionGrupo);
		btnAgregarRestriccionGrupo.setBorderPainted(false);
		btnAgregarRestriccionGrupo.setContentAreaFilled(false);
		
		btnEliminarRestriccionGrupo = new JButton("");
		btnEliminarRestriccionGrupo.setPreferredSize(new Dimension(10, 9));
		btnEliminarRestriccionGrupo.setIcon(new ImageIcon(VentanaPrincipal2.class.getResource("/presentacion/imagenes/iconos/remove24.png")));
		btnEliminarRestriccionGrupo.setEnabled(false);
		pnBotonesRestriccionesGrupo.add(btnEliminarRestriccionGrupo);
		btnEliminarRestriccionGrupo.setBorderPainted(false);
		btnEliminarRestriccionGrupo.setContentAreaFilled(false);
		
		spnRestriccionesGrupo = new JScrollPane();
		pnRestricciones.add(spnRestriccionesGrupo, BorderLayout.CENTER);
		
		listRestriccionesGrupo = new JList();
		listRestriccionesGrupo.setEnabled(false);
		spnRestriccionesGrupo.setViewportView(listRestriccionesGrupo);
		
		pnDisenioRuta = new JPanel();
		tbdPestanias.addTab("Diseño Ruta", null, pnDisenioRuta, null);
	}

	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// Se cierra la aplicacion
			System.exit(0);
		}
	}
	private class BtnUsuarioAppActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			VentanaPerfil ventana_perfil = new VentanaPerfil();
			ventana_perfil.getFrmPerfil().setVisible(true);
		}
	}
	private class ListLugaresListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent arg0) {
			VentanaLugar ventana_lugar = new VentanaLugar();
			ventana_lugar.getFrmLugarVisita().setVisible(true);
			
		}
		
	}
}
