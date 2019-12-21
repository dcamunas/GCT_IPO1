package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiListaJPanel_1 extends JPanel {
	private JPanel pnBotones;
	private JButton btnAniadir;
	private JButton btnLimpiar;
	private JScrollPane scrollPane;
	private JList list;
	private JButton btnModificar;
	private JButton btnEliminar;

	/**
	 * Create the panel.
	 */
	public MiListaJPanel_1() {
		setLayout(new BorderLayout(0, 0));
		
		pnBotones = new JPanel();
		pnBotones.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		add(pnBotones, BorderLayout.SOUTH);
		
		btnAniadir = new JButton("Añadir");
		btnAniadir.addActionListener(new BtnAniadirActionListener());
		pnBotones.add(btnAniadir);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setEnabled(false);
		pnBotones.add(btnModificar);
		
		btnLimpiar = new JButton("Limpiar");
		pnBotones.add(btnLimpiar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new BtnEliminarActionListener());
		btnEliminar.setEnabled(false);
		pnBotones.add(btnEliminar);
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		list = new JList();
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

	public JList getListGuias() {
		return list;
	}

	public void setListGuias(JList listGuias) {
		this.list = listGuias;
	}
	
	

	private class BtnEliminarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//HACER LISTA REMOVE
		}
	}
}
