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
	private JPanel pnCirContratados;
	private JPanel pnCirLugares;
	private JPanel pnCirInfo;
	private JPanel pnCirConBotones;
	private JButton btnAniadir;
	private JButton btnModificar;
	private JButton btnLimpiar;
	private JButton btnBorrar;
	private JScrollPane spListaCircuitos;
	private JList listCircuitos;
	private JPanel pnCirLugaresContratar;
	private JButton btnContratar;
	private JCheckBox chckbxContratado;
	private JScrollPane spListLugares;
	private JList listLugares;

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
		setBounds(100, 100, 900, 600);
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
		
		pnCirContratados = new JPanel();
		pnCirContratados.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnCircuitos.add(pnCirContratados, BorderLayout.WEST);
		pnCirContratados.setLayout(new BorderLayout(0, 0));
		
		pnCirConBotones = new JPanel();
		pnCirContratados.add(pnCirConBotones, BorderLayout.SOUTH);
		
		btnAniadir = new JButton("Añadir");
		pnCirConBotones.add(btnAniadir);
		
		btnModificar = new JButton("Modificar");
		pnCirConBotones.add(btnModificar);
		
		btnLimpiar = new JButton("Limpiar");
		pnCirConBotones.add(btnLimpiar);
		
		btnBorrar = new JButton("Borrar");
		pnCirConBotones.add(btnBorrar);
		
		spListaCircuitos = new JScrollPane();
		pnCirContratados.add(spListaCircuitos, BorderLayout.CENTER);
		
		listCircuitos = new JList();
		spListaCircuitos.setViewportView(listCircuitos);
		
		pnCirLugares = new JPanel();
		pnCirLugares.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnCircuitos.add(pnCirLugares, BorderLayout.EAST);
		pnCirLugares.setLayout(new BorderLayout(0, 0));
		
		pnCirLugaresContratar = new JPanel();
		pnCirLugares.add(pnCirLugaresContratar, BorderLayout.SOUTH);
		
		btnContratar = new JButton("Contratar");
		btnContratar.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/imagenes/iconos/shopping-cart x16.png")));
		
		chckbxContratado = new JCheckBox("Contratado");
		chckbxContratado.setHorizontalAlignment(SwingConstants.RIGHT);
		chckbxContratado.setEnabled(false);
		chckbxContratado.setVerticalAlignment(SwingConstants.BOTTOM);
		GroupLayout gl_pnCirLugaresContratar = new GroupLayout(pnCirLugaresContratar);
		gl_pnCirLugaresContratar.setHorizontalGroup(
			gl_pnCirLugaresContratar.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnCirLugaresContratar.createSequentialGroup()
					.addContainerGap(129, Short.MAX_VALUE)
					.addComponent(chckbxContratado, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(39))
				.addGroup(Alignment.LEADING, gl_pnCirLugaresContratar.createSequentialGroup()
					.addGap(91)
					.addComponent(btnContratar, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(64, Short.MAX_VALUE))
		);
		gl_pnCirLugaresContratar.setVerticalGroup(
			gl_pnCirLugaresContratar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnCirLugaresContratar.createSequentialGroup()
					.addComponent(btnContratar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxContratado)
					.addContainerGap())
		);
		pnCirLugaresContratar.setLayout(gl_pnCirLugaresContratar);
		
		spListLugares = new JScrollPane();
		pnCirLugares.add(spListLugares, BorderLayout.CENTER);
		
		listLugares = new JList();
		spListLugares.setViewportView(listLugares);
		
		pnCirInfo = new JPanel();
		pnCirInfo.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnCircuitos.add(pnCirInfo, BorderLayout.CENTER);
		
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
