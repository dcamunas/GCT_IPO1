package presentacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class DialogoSeleccionIdioma extends JDialog {

	private final JPanel contentPanel = new JPanel();
	JRadioButton rdbtnEspaniol;
	JLabel lblSeleccioneElIdioma;
	JRadioButton rdbtnIngles;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnAceptar;
	private JPanel buttonPane;
	private JLabel lblEspaniol;
	private JLabel lblIngles;

	/**
	 * Create the dialog.
	 */
	public DialogoSeleccionIdioma() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DialogoSeleccionIdioma.class.getResource("/presentacion/imagenes/iconos/worldwide.png")));
		setBounds(100, 100, 492, 163);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblSeleccioneElIdioma = new JLabel("Selección de idioma:");
			lblSeleccioneElIdioma.setBounds(10, 24, 113, 14);
			contentPanel.add(lblSeleccioneElIdioma);
		}
		{
			rdbtnEspaniol = new JRadioButton("Español");
			rdbtnEspaniol.setBounds(129, 20, 86, 23);
			buttonGroup.add(rdbtnEspaniol);
			contentPanel.add(rdbtnEspaniol);
		}
		{
			rdbtnIngles = new JRadioButton("Inglés");
			rdbtnIngles.setBounds(277, 15, 77, 23);
			buttonGroup.add(rdbtnIngles);
			contentPanel.add(rdbtnIngles);
		}
		
		lblEspaniol = new JLabel("");
		lblEspaniol.setIcon(new ImageIcon(DialogoSeleccionIdioma.class.getResource("/presentacion/imagenes/iconos/spain.png")));
		lblEspaniol.setBounds(214, 11, 32, 32);
		contentPanel.add(lblEspaniol);
		
		lblIngles = new JLabel("");
		lblIngles.setIcon(new ImageIcon(DialogoSeleccionIdioma.class.getResource("/presentacion/imagenes/iconos/united-kingdom.png")));
		lblIngles.setBounds(354, 6, 38, 32);
		contentPanel.add(lblIngles);
		{
			buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnAceptar = new JButton("Aceptar");
				btnAceptar.addActionListener(new BtnAceptarActionListener());
				buttonPane.add(btnAceptar);
				getRootPane().setDefaultButton(btnAceptar);
			}
		}
	}

	private void seleccionar_idioma() {
		if (rdbtnIngles.isSelected()) {
			MessagesGCT.setIdioma("inglés");
		}
	}

	private class BtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			seleccionar_idioma();
			dispose();
		}
	}
}
