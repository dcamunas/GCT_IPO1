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

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JPanel pnHerramientas;
	private JPanel pnContenido;
	private JButton btnCerrarSesion;
	private JButton btnAyuda;
	private JTabbedPane tbdPestanias;
	private JPanel pnCircuitos;
	private JLabel lblUsuario;
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
	private JTextField txtfPersonasRealizado;
	private JTextField txtfIncidencias;
	private JTextField txtfCosteCircuito;
	private JLabel lblLugaresVisita;
	private JPanel pnListadoGuias;
	private JPanel pnIdiomas;
	private JPanel pnBotonesP2;
	private JButton btnAniadirP2;
	private JButton btnModificarP2;
	private JButton btnLimpiarP2;
	private JButton btnBorrarP2;
	private JLabel lblListadoGuas;
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
	private JTextField txtfDisponibilidad;
	private JPanel panel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal ventana_principal = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setTitle("Manchatours");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/presentacion/imagenes/iconos/compass.png")));
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
		
		lblUsuario = new JLabel("Ultm vez: 18:00");
		pnHerramientas.add(lblUsuario);
		
		btnAyuda = new JButton("");
		btnAyuda.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/imagenes/iconos/info-32.png")));
		btnAyuda.setBorderPainted(false);
		btnAyuda.setContentAreaFilled(false);
		pnHerramientas.add(btnAyuda);
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
		pnCircuitosContratados.setPreferredSize(new Dimension(350, 10));
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
		pnCircuitos.add(pnCircuitoLugares, BorderLayout.EAST);
		pnCircuitoLugares.setLayout(new BorderLayout(0, 0));
		
		pnContratacionLugares = new JPanel();
		pnContratacionLugares.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnContratacionLugares.setPreferredSize(new Dimension(10, 36));
		pnCircuitoLugares.add(pnContratacionLugares, BorderLayout.SOUTH);
		
		btnContratar = new JButton("Contratar");
		btnContratar.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/imagenes/iconos/shopping-cart x16.png")));
		
		chckbxContratado = new JCheckBox("Contratado");
		chckbxContratado.setHorizontalAlignment(SwingConstants.RIGHT);
		chckbxContratado.setEnabled(false);
		chckbxContratado.setVerticalAlignment(SwingConstants.BOTTOM);
		GroupLayout gl_pnContratacionLugares = new GroupLayout(pnContratacionLugares);
		gl_pnContratacionLugares.setHorizontalGroup(
			gl_pnContratacionLugares.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnContratacionLugares.createSequentialGroup()
					.addGap(34)
					.addComponent(btnContratar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxContratado, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_pnContratacionLugares.setVerticalGroup(
			gl_pnContratacionLugares.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnContratacionLugares.createSequentialGroup()
					.addGroup(gl_pnContratacionLugares.createParallelGroup(Alignment.LEADING)
						.addComponent(btnContratar, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_pnContratacionLugares.createSequentialGroup()
							.addContainerGap()
							.addComponent(chckbxContratado)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pnContratacionLugares.setLayout(gl_pnContratacionLugares);
		
		spnListLugares = new JScrollPane();
		pnCircuitoLugares.add(spnListLugares, BorderLayout.CENTER);
		
		listLugares = new JList();
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
		gbl_pnInfoGeneral.columnWidths = new int[]{101, 101, 101, 0};
		gbl_pnInfoGeneral.rowHeights = new int[] {20, 0, 0, 0};
		gbl_pnInfoGeneral.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnInfoGeneral.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		pnInfoGeneral.setLayout(gbl_pnInfoGeneral);
		
		lblNombreCircuito = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombreCircuito = new GridBagConstraints();
		gbc_lblNombreCircuito.anchor = GridBagConstraints.EAST;
		gbc_lblNombreCircuito.fill = GridBagConstraints.VERTICAL;
		gbc_lblNombreCircuito.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreCircuito.gridx = 0;
		gbc_lblNombreCircuito.gridy = 0;
		pnInfoGeneral.add(lblNombreCircuito, gbc_lblNombreCircuito);
		
		txtfNombreCircuito = new JTextField();
		GridBagConstraints gbc_txtfNombreCircuito = new GridBagConstraints();
		gbc_txtfNombreCircuito.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfNombreCircuito.insets = new Insets(0, 0, 5, 5);
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
		
		txtfPersonasRealizado = new JTextField();
		GridBagConstraints gbc_txtfPersonasRealizado = new GridBagConstraints();
		gbc_txtfPersonasRealizado.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfPersonasRealizado.anchor = GridBagConstraints.NORTH;
		gbc_txtfPersonasRealizado.insets = new Insets(0, 0, 5, 5);
		gbc_txtfPersonasRealizado.gridx = 1;
		gbc_txtfPersonasRealizado.gridy = 1;
		pnInfoGeneral.add(txtfPersonasRealizado, gbc_txtfPersonasRealizado);
		txtfPersonasRealizado.setColumns(10);
		
		lblIncidencias = new JLabel("Incidencias:");
		GridBagConstraints gbc_lblIncidencias = new GridBagConstraints();
		gbc_lblIncidencias.anchor = GridBagConstraints.EAST;
		gbc_lblIncidencias.insets = new Insets(0, 0, 5, 5);
		gbc_lblIncidencias.gridx = 0;
		gbc_lblIncidencias.gridy = 2;
		pnInfoGeneral.add(lblIncidencias, gbc_lblIncidencias);
		
		txtfIncidencias = new JTextField();
		GridBagConstraints gbc_txtfIncidencias = new GridBagConstraints();
		gbc_txtfIncidencias.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfIncidencias.anchor = GridBagConstraints.NORTH;
		gbc_txtfIncidencias.insets = new Insets(0, 0, 5, 5);
		gbc_txtfIncidencias.gridx = 1;
		gbc_txtfIncidencias.gridy = 2;
		pnInfoGeneral.add(txtfIncidencias, gbc_txtfIncidencias);
		txtfIncidencias.setColumns(10);
		
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
		
		lblListadoGuas = new JLabel("Listado guías:");
		pnListadoGuias.add(lblListadoGuas, BorderLayout.NORTH);
		
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
		lblImagenGuia.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/imagenes/perfiles/user.png")));
		pnImagenGuia.add(lblImagenGuia);
		
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
		gbl_pnInfoGuia.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
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
		
		txtfDisponibilidad = new JTextField();
		GridBagConstraints gbc_txtfDisponibilidad = new GridBagConstraints();
		gbc_txtfDisponibilidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfDisponibilidad.insets = new Insets(0, 0, 0, 5);
		gbc_txtfDisponibilidad.gridx = 1;
		gbc_txtfDisponibilidad.gridy = 6;
		pnInfoGuia.add(txtfDisponibilidad, gbc_txtfDisponibilidad);
		txtfDisponibilidad.setColumns(10);
		
		pnGrupos = new JPanel();
		tbdPestanias.addTab("Grupos", null, pnGrupos, null);
		pnGrupos.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		pnGrupos.add(panel, BorderLayout.WEST);
		
		pnDisenioRuta = new JPanel();
		tbdPestanias.addTab("Diseño Ruta", null, pnDisenioRuta, null);
	}

	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// Se cierra la aplicacion
			System.exit(0);
		}
	}
}
