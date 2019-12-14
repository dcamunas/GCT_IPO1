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
	private JPanel pnBotones;
	private JButton btnAniadir;
	private JButton btnModificar;
	private JButton btnLimpiar;
	private JButton btnBorrar;
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
		setTitle("Manchatours");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/presentacion/imagenes/iconos/compass.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pnHerramientas = new JPanel();
		pnHerramientas.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
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
		
		pnCircuitos = new JPanel();
		tbdPestanias.addTab("Circuitos", null, pnCircuitos, null);
		pnCircuitos.setLayout(new BorderLayout(0, 0));
		
		pnCircuitosContratados = new JPanel();
		pnCircuitosContratados.setPreferredSize(new Dimension(350, 10));
		pnCircuitosContratados.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnCircuitos.add(pnCircuitosContratados, BorderLayout.WEST);
		pnCircuitosContratados.setLayout(new BorderLayout(0, 0));
		
		pnBotones = new JPanel();
		pnCircuitosContratados.add(pnBotones, BorderLayout.SOUTH);
		
		btnAniadir = new JButton("Añadir");
		pnBotones.add(btnAniadir);
		
		btnModificar = new JButton("Modificar");
		pnBotones.add(btnModificar);
		
		btnLimpiar = new JButton("Limpiar");
		pnBotones.add(btnLimpiar);
		
		btnBorrar = new JButton("Borrar");
		pnBotones.add(btnBorrar);
		
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
		pnCircuitoLugares.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnCircuitos.add(pnCircuitoLugares, BorderLayout.EAST);
		pnCircuitoLugares.setLayout(new BorderLayout(0, 0));
		
		pnContratacionLugares = new JPanel();
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
		
		pnCircuitoInfo = new JPanel();
		pnCircuitoInfo.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnCircuitos.add(pnCircuitoInfo, BorderLayout.CENTER);
		pnCircuitoInfo.setLayout(new BorderLayout(0, 0));
		
		spnSugerencias = new JScrollPane();
		pnCircuitoInfo.add(spnSugerencias, BorderLayout.SOUTH);
		
		lblSugerencias = new JLabel("Sugerencias:");
		//spnSugerencias.setViewportView(lblSugerencias);
		spnSugerencias.setColumnHeaderView(lblSugerencias);


		
		listSugerencias = new JList();
		spnSugerencias.setViewportView(listSugerencias);
		
		
		pnInfoGeneral = new JPanel();
		pnCircuitoInfo.add(pnInfoGeneral, BorderLayout.NORTH);
		GridBagLayout gbl_pnInfoGeneral = new GridBagLayout();
		gbl_pnInfoGeneral.columnWidths = new int[]{101, 101, 101, 0};
		gbl_pnInfoGeneral.rowHeights = new int[] {20, 0, 0, 0};
		gbl_pnInfoGeneral.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
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
		gbc_txtfNombreCircuito.insets = new Insets(0, 0, 5, 5);
		gbc_txtfNombreCircuito.fill = GridBagConstraints.HORIZONTAL;
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
		gbc_txtfPersonasRealizado.anchor = GridBagConstraints.NORTH;
		gbc_txtfPersonasRealizado.insets = new Insets(0, 0, 5, 5);
		gbc_txtfPersonasRealizado.fill = GridBagConstraints.HORIZONTAL;
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
		gbc_txtfIncidencias.anchor = GridBagConstraints.NORTH;
		gbc_txtfIncidencias.insets = new Insets(0, 0, 5, 5);
		gbc_txtfIncidencias.fill = GridBagConstraints.HORIZONTAL;
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
		gbc_txtfCosteCircuito.insets = new Insets(0, 0, 0, 5);
		gbc_txtfCosteCircuito.fill = GridBagConstraints.HORIZONTAL;
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
		
		pnGuias = new JPanel();
		tbdPestanias.addTab("Guias", null, pnGuias, null);
		
		pnGrupos = new JPanel();
		tbdPestanias.addTab("Grupos", null, pnGrupos, null);
		
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
