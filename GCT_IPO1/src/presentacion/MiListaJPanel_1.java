package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import oracle.jrockit.jfr.JFR;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MiListaJPanel_1 extends JPanel {
	private JPanel pnBotones;
	private JButton btnAniadir;
	private JButton btnLimpiar;
	private JScrollPane scrollPane;
	private JList<String> list;
	private JButton btnModificar;
	private JButton btnEliminar;
	private DefaultListModel<String> modelo_lista;
	private List lista;
	private VentanaPrincipal vp;

	/**
	 * Create the panel.
	 */
	public MiListaJPanel_1(List lista, VentanaPrincipal vp) {
		this.vp = vp;
		this.lista = lista;
		setLayout(new BorderLayout(0, 0));

		pnBotones = new JPanel();
		pnBotones.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		add(pnBotones, BorderLayout.SOUTH);

		btnAniadir = new JButton("Añadir");
		pnBotones.add(btnAniadir);

		btnModificar = new JButton("Modificar");
		pnBotones.add(btnModificar);

		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		pnBotones.add(btnLimpiar);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new BtnEliminarActionListener());
		pnBotones.add(btnEliminar);

		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		list = new JList();
		list.addMouseListener(new ListMouseListener());
		modelo_lista = new DefaultListModel();
		list.setModel(modelo_lista);
		/*ListSelectionModel pos = list.getSelectionModel();
		pos.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				ListSelectionModel lsm = (ListSelectionModel) e.getSource();
				if (!lsm.isSelectionEmpty()) {
					String aux = list.getSelectedValue();
					switch (aux.charAt(1)) {
					case 'i':
						vp.mostrar_circuito(list.getSelectedIndex());
						break;
					case 'u':
						vp.limpiar_guias();
						// mostrarguia
						break;

					default:
						// por defecto grupos

						break;
					}

				}
			}
		});*/
		scrollPane.setViewportView(list);

	}

	public JPanel getPnBotones() {
		return pnBotones;
	}

	public void setPnBotones(JPanel pnBotones) {
		this.pnBotones = pnBotones;
	}

	public JButton getBtnAniadir() {
		return btnAniadir;
	}

	public void setBtnAniadir(JButton btnAniadir) {
		this.btnAniadir = btnAniadir;
	}

	public JButton getBtnLimpiar() {
		return btnLimpiar;
	}

	public void setBtnLimpiar(JButton btnLimpiar) {
		this.btnLimpiar = btnLimpiar;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public JList<String> getList() {
		return list;
	}

	public void setList(JList<String> listGuias) {
		this.list = listGuias;
	}

	public DefaultListModel<String> getModelolista() {
		return modelo_lista;
	}

	public void setLista(ArrayList lista) {
		this.lista = lista;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public List getLista() {
		return lista;
	}

	public void setLista(List lista) {
		this.lista = lista;
	}

	private class BtnEliminarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// lista.remove(list.getSelectedIndex());
			modelo_lista.remove(list.getSelectedIndex());
			vp.limpiar_circuito();

		}
	}

	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			vp.limpiar_circuito();
			vp.limpiar_guias();

		}
	}

	private class ListMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			if (!list.isSelectionEmpty()) {
				String aux = list.getSelectedValue();
				switch (aux.charAt(1)) {
				case 'i':
					vp.mostrar_circuito(list.getSelectedIndex());
					break;
				case 'u':
					// mostrarguia
					break;

				default:
					// por defecto grupos

					break;
				}
			}
		}
	}

}
