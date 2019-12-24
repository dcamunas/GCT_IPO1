package presentacion;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaIncidencia {

	private JFrame frmRegistroDeIncidencia;
	private MiJPanel panel;
	private JPanel panel_1;
	private JLabel lblIncidencia;
	private JTextPane textPane;
	private DefaultListModel<String> modelo_lista;
	private JList<String> lista;

	/**
	 * Create the application.
	 */
	public VentanaIncidencia(DefaultListModel<String> modelo_lista, JList<String> lista, boolean modo) {
		this.modelo_lista = modelo_lista;
		this.lista = lista;
		initialize(modelo_lista, modo);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(DefaultListModel<String> modelo_lista, boolean modo) {
		frmRegistroDeIncidencia = new JFrame();
		frmRegistroDeIncidencia.setTitle("Registro de incidencia");
		frmRegistroDeIncidencia.setResizable(false);
		frmRegistroDeIncidencia.setBounds(100, 100, 325, 169);

		JLabel imagen = new JLabel();
		panel = new MiJPanel(imagen);
		panel.getBtnAceptar().addActionListener(new PanelBtnAceptarActionListener());
		frmRegistroDeIncidencia.getContentPane().add(panel, BorderLayout.CENTER);

		panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);

		lblIncidencia = new JLabel("Incidencia :");
		lblIncidencia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIncidencia.setBounds(20, 11, 63, 14);
		panel_1.add(lblIncidencia);

		textPane = new JTextPane();
		textPane.setBounds(20, 36, 275, 56);
		panel_1.add(textPane);
		panel.getBtnAceptar().setText("Añadir");
		if (!modo) {
			textPane.setEnabled(false);
			textPane.setText((String) lista.getSelectedValue());
			panel.getBtnAceptar().setText("Aceptar");
		}
	}

	public JFrame getFrame() {
		return frmRegistroDeIncidencia;
	}

	private boolean comprobarElementos() {
		boolean esta = false;
		for (int i = modelo_lista.size() - 1; i >= 0 && !esta; i--) {
			esta = modelo_lista.getElementAt(i).equals((String) textPane.getText());
		}
		return esta;
	}

	private class PanelBtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (panel.getBtnAceptar().getText().equals("Añadir")) {
				if (comprobarElementos()) {
					JOptionPane.showMessageDialog(null, "Esta incidencia ya ha sido añadida.", "",
							JOptionPane.ERROR_MESSAGE);
				} else {
					modelo_lista.addElement((String) textPane.getText());
					JOptionPane.showMessageDialog(null, "Incidencia añadida.", "", JOptionPane.INFORMATION_MESSAGE);
					getFrame().dispose();
					
				}
			}
		}
	}
}
