package presentacion;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MiEditorGrafico extends JPanel {

	VentanaPrincipal vp;
	private JToolBar toolBar;
	private JScrollPane scrollPane;
	private JButton btnNatural;
	private JButton btnMapa;
	private JButton btnDeportes;
	private JButton btnGastronomia;
	private JButton btnNota;
	private JButton btnMonumento;
	private JButton btnRectangulo;

	// Area de dibujo personalizada (creada extendiendo de JLabel)
	private MiAreaDibujo miAreaDibujo;
	// Imagen en la que se cargará el fichero seleccionado por el usuario
	private ImageIcon imagen;

	// Variable que almacena el modo de dibujado seleccionado por el usuario
	int modo = -1;
	private final int MONUMENTO = 1;
	private final int NATURAL = 2;
	private final int DEPORTE = 3;
	private final int GASTRONOMIA = 4;
	private final int NOTA = 5;
	private final int RECTANGULO = 6;
	private final int TEXTO = 7;
	private final int CURSOR_POR_DEFECTO = 8;

	// Cursores e imagenes
	private Toolkit toolkit;
	private Image imag_monumento;
	private Image imag_natural;
	private Image imag_rectangulo;
	private Image imag_deporte;
	private Image imag_gastronomia;
	private Image imag_nota;

	private Cursor cursor_monumento;
	private Cursor cursor_natural;
	private Cursor cursor_rectangulo;
	private Cursor cursor_deporte;
	private Cursor cursor_gastronomia;
	private Cursor cursor_nota;

	private int x, y;

	private JTextField txtTexto;
	private JButton btnLimpiar;
	private JButton btnPorDefecto;

	/**
	 * Create the panel.
	 */
	public MiEditorGrafico(VentanaPrincipal vp) {
		this.vp = vp;
		txtTexto = new JTextField();
		imagen = new ImageIcon(
				MiEditorGrafico.class.getResource("/presentacion/imagenes/lugares/MapPrincCiudadReal.gif"));

		setLayout(new BorderLayout(0, 0));
		toolBar = new JToolBar();
		toolBar.setBorder(new LineBorder(new Color(0, 0, 0)));
		add(toolBar, BorderLayout.NORTH);

		btnMapa = new JButton("");
		btnMapa.addActionListener(new BtnMapaActionListener());
		btnMapa.setIcon(
				new ImageIcon(MiEditorGrafico.class.getResource("/presentacion/imagenes/iconos/add_mapa-32.png")));
		btnMapa.setBorderPainted(false);
		btnMapa.setContentAreaFilled(false);
		toolBar.add(btnMapa);

		btnMonumento = new JButton("");
		btnMonumento.addActionListener(new BtnMonumentoActionListener());
		btnMonumento
				.setIcon(new ImageIcon(MiEditorGrafico.class.getResource("/presentacion/imagenes/iconos/castle.png")));
		btnMonumento.setBorderPainted(false);
		btnMonumento.setContentAreaFilled(false);
		toolBar.add(btnMonumento);

		btnNatural = new JButton("");
		btnNatural.addActionListener(new BtnNaturalActionListener());
		btnNatural.setIcon(
				new ImageIcon(MiEditorGrafico.class.getResource("/presentacion/imagenes/iconos/mountains.png")));
		btnNatural.setBorderPainted(false);
		btnNatural.setContentAreaFilled(false);
		toolBar.add(btnNatural);

		btnGastronomia = new JButton("");
		btnGastronomia.addActionListener(new BtnGastronomiaActionListener());
		btnGastronomia.setIcon(
				new ImageIcon(MiEditorGrafico.class.getResource("/presentacion/imagenes/iconos/couscous.png")));
		btnGastronomia.setBorderPainted(false);
		btnGastronomia.setContentAreaFilled(false);
		toolBar.add(btnGastronomia);

		btnDeportes = new JButton("");
		btnDeportes.addActionListener(new BtnDeportesActionListener());
		btnDeportes
				.setIcon(new ImageIcon(MiEditorGrafico.class.getResource("/presentacion/imagenes/iconos/stadium.png")));
		btnDeportes.setBorderPainted(false);
		btnDeportes.setContentAreaFilled(false);
		toolBar.add(btnDeportes);

		btnNota = new JButton("");
		btnNota.addActionListener(new BtnNotaActionListener());

		btnRectangulo = new JButton("");
		btnRectangulo.addActionListener(new BtnRectanguloActionListener());
		btnRectangulo.setIcon(
				new ImageIcon(MiEditorGrafico.class.getResource("/presentacion/imagenes/iconos/rectangulo.png")));
		btnRectangulo.setBorderPainted(false);
		btnRectangulo.setContentAreaFilled(false);
		toolBar.add(btnRectangulo);
		btnNota.setIcon(
				new ImageIcon(MiEditorGrafico.class.getResource("/presentacion/imagenes/iconos/add_note-32.png")));
		btnNota.setBorderPainted(false);
		btnNota.setContentAreaFilled(false);

		toolBar.add(btnNota);

		btnPorDefecto = new JButton("");
		btnPorDefecto
				.setIcon(new ImageIcon(MiEditorGrafico.class.getResource("/presentacion/imagenes/iconos/cursor.png")));
		btnPorDefecto.addActionListener(new BtnPorDefectoActionListener());
		btnPorDefecto.setBorderPainted(false);
		btnPorDefecto.setContentAreaFilled(false);
		toolBar.add(btnPorDefecto);

		btnLimpiar = new JButton("");
		btnLimpiar
				.setIcon(new ImageIcon(MiEditorGrafico.class.getResource("/presentacion/imagenes/iconos/eraser.png")));
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		btnLimpiar.setBorderPainted(false);
		btnLimpiar.setContentAreaFilled(false);
		toolBar.add(btnLimpiar);

		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		// Creación del área de dibujo personalizada
		miAreaDibujo = new MiAreaDibujo();
		miAreaDibujo.addMouseMotionListener(new MiAreaDibujoMouseMotionListener());
		miAreaDibujo.addMouseListener(new MiAreaDibujoMouseListener());
		miAreaDibujo.setIcon(imagen);
		scrollPane.setViewportView(miAreaDibujo);

		// Creación de imágenes y cursores
		toolkit = Toolkit.getDefaultToolkit();
		imag_monumento = toolkit
				.getImage(getClass().getClassLoader().getResource("presentacion/imagenes/iconos/castle.png"));
		imag_deporte = toolkit
				.getImage(getClass().getClassLoader().getResource("presentacion/imagenes/iconos/stadium.png"));
		imag_gastronomia = toolkit
				.getImage(getClass().getClassLoader().getResource("presentacion/imagenes/iconos/couscous.png"));
		imag_natural = toolkit
				.getImage(getClass().getClassLoader().getResource("presentacion/imagenes/iconos/mountains.png"));
		imag_nota = toolkit
				.getImage(getClass().getClassLoader().getResource("presentacion/imagenes/iconos/add_note-32.png"));
		imag_rectangulo = toolkit
				.getImage(getClass().getClassLoader().getResource("presentacion/imagenes/iconos/rectangulo-32.png"));

		cursor_deporte = toolkit.createCustomCursor(imag_deporte, new Point(0, 0), "CURSOR_DEPORTE");
		cursor_gastronomia = toolkit.createCustomCursor(imag_gastronomia, new Point(0, 0), "CURSOR_GASTRONOMIA");
		cursor_monumento = toolkit.createCustomCursor(imag_monumento, new Point(0, 0), "CURSOR_MONUMENTO");
		cursor_natural = toolkit.createCustomCursor(imag_natural, new Point(0, 0), "CURSOR_NATURAL");
		cursor_nota = toolkit.createCustomCursor(imag_nota, new Point(0, 0), "CURSOR_NOTA");
		cursor_rectangulo = toolkit.createCustomCursor(imag_rectangulo, new Point(0, 0), "CURSOR_RECTANGULO");

	}

	private class BtnMapaActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			JFileChooser fcAbrir = new JFileChooser();
			int valorDevuelto = fcAbrir.showOpenDialog(vp.getFrame());
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				imagen = new ImageIcon(file.getAbsolutePath());
				miAreaDibujo.setIcon(imagen);
			}
		}
	}

	private class BtnMonumentoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = MONUMENTO;
			vp.getFrame().setCursor(cursor_monumento);
		}
	}

	private class BtnNaturalActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = NATURAL;
			vp.getFrame().setCursor(cursor_natural);
		}
	}

	private class BtnGastronomiaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = GASTRONOMIA;
			vp.getFrame().setCursor(cursor_gastronomia);
		}
	}

	private class BtnDeportesActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = DEPORTE;
			vp.getFrame().setCursor(cursor_deporte);
		}
	}

	private class BtnNotaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = NOTA;
			vp.getFrame().setCursor(cursor_nota);
		}
	}

	private class BtnRectanguloActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = RECTANGULO;
			vp.getFrame().setCursor(cursor_rectangulo);
		}
	}

	private class MiAreaDibujoMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();

			switch (modo) {
			case MONUMENTO:
				miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imag_monumento));
				miAreaDibujo.repaint();
				break;
			case NATURAL:
				miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imag_natural));
				miAreaDibujo.repaint();
				break;
			case DEPORTE:
				miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imag_deporte));
				miAreaDibujo.repaint();
				break;
			case GASTRONOMIA:
				miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imag_gastronomia));
				miAreaDibujo.repaint();
				break;

			case RECTANGULO:
				miAreaDibujo.addObjetoGrafico(new RectanguloGrafico(x, y, x, y, Color.RED));
				break;
			case NOTA:
				txtTexto.setBounds(x, y, 200, 30);
				txtTexto.setVisible(true);
				txtTexto.requestFocus();
				txtTexto.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (!txtTexto.getText().equalsIgnoreCase(""))
							miAreaDibujo.addObjetoGrafico(new TextoGrafico(x, y + 15, txtTexto.getText(), Color.BLUE));
						txtTexto.setText("");
						txtTexto.setVisible(false);
						miAreaDibujo.repaint();
					}
				});
				miAreaDibujo.add(txtTexto);
			}

		}
	}

	private class MiAreaDibujoMouseMotionListener extends MouseMotionAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			if (modo == RECTANGULO && imagen != null) {
				((RectanguloGrafico) miAreaDibujo.getUltimoObjetoGrafico()).setX1(e.getX());
				((RectanguloGrafico) miAreaDibujo.getUltimoObjetoGrafico()).setY1(e.getY());
				miAreaDibujo.repaint();
			}
		}
	}

	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			imagen = new ImageIcon(
					MiEditorGrafico.class.getResource("/presentacion/imagenes/lugares/MapPrincCiudadReal.gif"));
			miAreaDibujo.setIcon(imagen);
			miAreaDibujo.limpiar_mapa();

		}
	}

	private class BtnPorDefectoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = CURSOR_POR_DEFECTO;
			vp.getFrame().setCursor(null);

		}
	}

}
