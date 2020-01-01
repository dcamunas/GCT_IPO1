package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class EditorGrafico {

	private JFrame frame;
	private JPanel pnPrincipal;
	private JToolBar toolBar;
	private JButton btnUbicacion;

	/**
	 * Create the application.
	 */
	public EditorGrafico() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 700);
		
		pnPrincipal = new JPanel();
		frame.getContentPane().add(pnPrincipal, BorderLayout.CENTER);
		pnPrincipal.setLayout(new BorderLayout(0, 0));
		
		toolBar = new JToolBar();
		toolBar.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnPrincipal.add(toolBar, BorderLayout.NORTH);
		
		btnUbicacion = new JButton("Ubicacion");
		toolBar.add(btnUbicacion);
	}

}
