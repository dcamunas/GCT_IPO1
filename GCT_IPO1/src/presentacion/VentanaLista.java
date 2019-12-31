package presentacion;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class VentanaLista {

	private JFrame frame;
	private JPanel panel;
	private JButton btnAadir;
	private JPanel panel_1;
	private JScrollPane scrollPane;
	private JList list;
	private List<String> lista;
	private DefaultListModel<String> modelo_lista;
	private JTextField txtf;

	/**
	 * Create the application.
	 */
	public VentanaLista(List<String> lista, String[] valores, DefaultListModel<String> modelo_lista, JTextField txtf) {
		this.modelo_lista = modelo_lista;
		this.lista = lista;
		this.txtf = txtf;
		initialize(lista, valores, modelo_lista);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(List<String> lista, String[] valores, DefaultListModel<String> modelo_lista) {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 300, 434);

		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);

		btnAadir = new JButton("Añadir");
		btnAadir.addActionListener(new BtnAadirActionListener());
		panel.add(btnAadir);

		panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));

		scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);

		list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = valores;

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);
	}

	public JFrame getFrame() {
		return frame;
	}

	private boolean comprobarElementos() {
		boolean esta = false;
		for (int i = modelo_lista.size() - 1; i >= 0 && !esta; i--) {
			esta = modelo_lista.getElementAt(i).equals((String) list.getSelectedValue());
		}
		return esta;
	}

	private class BtnAadirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (txtf != null) {
				txtf.setText((String) list.getSelectedValue());
				String mensaje = ("Se ha seleccionado al guía: '" + list.getSelectedValue() + "' ");
				JOptionPane.showMessageDialog(null, mensaje, "", JOptionPane.INFORMATION_MESSAGE);
				getFrame().dispose();
				
			} else {
				if (list.isSelectionEmpty()) {
					JOptionPane.showMessageDialog(null, "Error, debe de seleccionar un elemento de la lista.", "",
							JOptionPane.ERROR_MESSAGE);
				} else {
					if (comprobarElementos()) {
						String mensaje = ("'" + list.getSelectedValue() + "' ya ha sido seleccionado.");
						JOptionPane.showMessageDialog(null, mensaje, "", JOptionPane.WARNING_MESSAGE);
					} else {
						// lista.add((String) list.getSelectedValue());
						modelo_lista.addElement((String) list.getSelectedValue());

						String mensaje = ("Se ha seleccionado: '" + list.getSelectedValue() + "' ");
						JOptionPane.showMessageDialog(null, mensaje, "", JOptionPane.INFORMATION_MESSAGE);
						getFrame().dispose();
					}
				}
			}
		}
	}
}
