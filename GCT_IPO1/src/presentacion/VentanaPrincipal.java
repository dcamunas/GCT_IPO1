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
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pnHerramientas = new JPanel();
		pnHerramientas.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnHerramientas.setPreferredSize(new Dimension(0, 40));
		contentPane.add(pnHerramientas, BorderLayout.NORTH);
		pnHerramientas.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.addActionListener(new BtnNewButtonActionListener());
		
		lblUsuario = new JLabel("Usuario Inicio");
		pnHerramientas.add(lblUsuario);
		
		btnAyuda = new JButton("");
		btnAyuda.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/imagenes/iconos/info.png")));
		btnAyuda.setContentAreaFilled(false);
		btnAyuda.setBorderPainted(false);
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
		GridBagLayout gbl_pnCircuitos = new GridBagLayout();
		gbl_pnCircuitos.columnWidths = new int[]{0};
		gbl_pnCircuitos.rowHeights = new int[]{0};
		gbl_pnCircuitos.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_pnCircuitos.rowWeights = new double[]{Double.MIN_VALUE};
		pnCircuitos.setLayout(gbl_pnCircuitos);
		
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
