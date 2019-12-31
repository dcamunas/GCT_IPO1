package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.border.MatteBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ListSelectionModel;

public class MiListaJPanel_2 extends JPanel {
	private JPanel pnBotones;
	private JButton btnAniadir;
	private JButton btnEliminar;
	private JScrollPane spnLista;
	private JList<String> list;
	private DefaultListModel<String> modelo_lista;
	private boolean mostrar_lista;
	private ImageIcon icono_aniadir = new ImageIcon(
			VentanaPrincipal.class.getResource("/presentacion/imagenes/iconos/plus-24.png"));
	private String[] valores;
	private List<String> lista;

	/**
	 * Create the panel.
	 */
	public MiListaJPanel_2(String[] valores, boolean mostrar_lista) {
		this.lista = new ArrayList<String>();
		this.mostrar_lista = mostrar_lista;
		this.valores = valores;
		setLayout(new BorderLayout(0, 0));

		pnBotones = new JPanel();
		add(pnBotones, BorderLayout.EAST);
		pnBotones.setLayout(new GridLayout(0, 1, 0, 0));

		btnAniadir = new JButton("");
		btnAniadir.addActionListener(new BtnAniadirActionListener());
		btnAniadir
				.setIcon(new ImageIcon(MiListaJPanel_2.class.getResource("/presentacion/imagenes/iconos/plus-24.png")));
		btnAniadir.setBorderPainted(false);
		btnAniadir.setContentAreaFilled(false);
		pnBotones.add(btnAniadir);

		btnEliminar = new JButton("");
		btnEliminar.addActionListener(new BtnEliminarActionListener());
		btnEliminar.setEnabled(false);
		btnEliminar.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		btnEliminar.setIcon(
				new ImageIcon(MiListaJPanel_2.class.getResource("/presentacion/imagenes/iconos/remove-24.png")));
		btnEliminar.setBorderPainted(false);
		btnEliminar.setContentAreaFilled(false);
		pnBotones.add(btnEliminar);

		spnLista = new JScrollPane();
		add(spnLista, BorderLayout.CENTER);

		list = new JList<String>();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		modelo_lista = new DefaultListModel<String>();
		list.setModel(modelo_lista);
		spnLista.setViewportView(list);

		ListSelectionModel pos = list.getSelectionModel();
		pos.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				ListSelectionModel lsm = (ListSelectionModel) e.getSource();
				if (!lsm.isSelectionEmpty()) {
					btnEliminar.setEnabled(true);
				}
			}
		});

	}

	public JPanel getPnBotones() {
		return pnBotones;
	}

	public JButton getBtnAniadir() {
		return btnAniadir;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public JList<String> getList() {
		return list;
	}

	public void setList(JList<String> list) {
		this.list = list;
	}

	public DefaultListModel<String> getModeloLista() {
		return modelo_lista;
	}

	public List<String> getLista() {
		return lista;
	}

	public void setLista(ArrayList<String> lista) {
		this.lista = lista;
	}

	

	public void setModelolista(DefaultListModel<String> modelo_lista) {
		this.modelo_lista = modelo_lista;
	}



	public JScrollPane getSpnLista() {
		return spnLista;
	}



	private class BtnAniadirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (mostrar_lista) {
				VentanaLista vl = new VentanaLista(lista, valores, modelo_lista, null);
				vl.getFrame().setVisible(true);
			} else {
				VentanaIncidencia vi;

				// True == Text activado (introducir incidencia) | False == Text desactivado
				// (ver informacion)
				vi = new VentanaIncidencia(lista, modelo_lista, list, true);
				vi.getFrame().setVisible(true);
				btnAniadir.setIcon(icono_aniadir);
				btnEliminar.setEnabled(false);
			}

		}
	}

	private class BtnEliminarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int indice = list.getSelectedIndex();
			modelo_lista.remove(indice);
		}
	}
}
