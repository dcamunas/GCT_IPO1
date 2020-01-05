package presentacion;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class VentanaIncidencia {

	private JFrame frmRegistroDeIncidencia;
	private MiJPanel panel;
	private JPanel panel_1;
	private JLabel lblIncidencia;
	private JTextPane textPane;
	private DefaultListModel<String> modelo_lista;
	private JList<String> list;
	private List<String> lista;
	private final int DIA = 0;
	private Color color_dia = new Color(240, 240, 240);
	private Color color_noche = new Color(51,51,51);


	/**
	 * Create the application.
	 */
	public VentanaIncidencia(List<String> lista, DefaultListModel<String> modelo_lista, JList<String> list, boolean modo, int tema) {
		this.modelo_lista = modelo_lista;
		this.list = list;
		this.lista = lista;
		initialize(modelo_lista, modo, tema);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(DefaultListModel<String> modelo_lista, boolean modo, int tema) {
		frmRegistroDeIncidencia = new JFrame();
		frmRegistroDeIncidencia.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaIncidencia.class.getResource("/presentacion/imagenes/iconos/compass.png")));
		frmRegistroDeIncidencia.setTitle(MessagesGCT.getString("VentanaIncidencia.tituloVentana.text"));
		frmRegistroDeIncidencia.setResizable(false);
		frmRegistroDeIncidencia.setBounds(100, 100, 325, 169);

		JLabel imagen = new JLabel();
		panel = new MiJPanel(imagen);
		panel.getBtnAceptar().addActionListener(new PanelBtnAceptarActionListener());
		frmRegistroDeIncidencia.getContentPane().add(panel, BorderLayout.CENTER);

		panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);

		lblIncidencia = new JLabel(MessagesGCT.getString("VentanaIncidencia.titulo.text"));
		lblIncidencia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIncidencia.setBounds(20, 11, 169, 14);
		panel_1.add(lblIncidencia);

		textPane = new JTextPane();
		textPane.setBounds(20, 36, 275, 56);
		panel_1.add(textPane);
		panel.getBtnAceptar().setText(MessagesGCT.getString("VentanaIncidencia.btnAniadir.text"));
		
		if (!modo) {
			textPane.setEnabled(false);
			textPane.setText((String) list.getSelectedValue());
			panel.getBtnAceptar().setText(MessagesGCT.getString("VentanaIncidencia.btnAceptar.text"));
			
		}
		
		if(tema != DIA) {
			lblIncidencia.setForeground(Color.WHITE);
			panel_1.setBackground(color_noche);
			textPane.setBackground(Color.DARK_GRAY);
			textPane.setForeground(Color.WHITE);
			panel.getPnAceptar().setBackground(color_noche);
		} else {
			lblIncidencia.setForeground(Color.BLACK);
			panel_1.setBackground(color_dia);
			textPane.setBackground(Color.WHITE);
			textPane.setForeground(Color.BLACK);
			panel.getPnAceptar().setBackground(color_dia);
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
					JOptionPane.showMessageDialog(null, "Este dato ya ha sido registrado", "",
							JOptionPane.ERROR_MESSAGE);
				} else {
					modelo_lista.addElement((String) textPane.getText());
					lista.add((String)textPane.getText());
					JOptionPane.showMessageDialog(null, "Información añadida", "", JOptionPane.INFORMATION_MESSAGE);
					getFrame().dispose();
					
				}
			}
		}
	}
}
