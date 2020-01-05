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

public class DialogoSeleccionIdioma extends JDialog {

	private final JPanel contentPanel = new JPanel();
	JRadioButton rdbtnEspaniol;
	JLabel lblSeleccioneElIdioma;
	JRadioButton rdbtnIngles;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnAceptar;
	private JPanel buttonPane;

	/**
	 * Create the dialog.
	 */
	public DialogoSeleccionIdioma() {
		setBounds(100, 100, 449, 159);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			lblSeleccioneElIdioma = new JLabel("Seleccione el idioma deseado:");
			contentPanel.add(lblSeleccioneElIdioma);
		}
		{
			rdbtnEspaniol = new JRadioButton("Español");
			buttonGroup.add(rdbtnEspaniol);
			contentPanel.add(rdbtnEspaniol);
		}
		{
			rdbtnIngles = new JRadioButton("Inglés");
			buttonGroup.add(rdbtnIngles);
			contentPanel.add(rdbtnIngles);
		}
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
