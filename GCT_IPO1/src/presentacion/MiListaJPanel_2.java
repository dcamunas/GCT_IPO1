package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiListaJPanel_2 extends JPanel {
	private JPanel pnBotones;
	private JButton btnAniadir;
	private JButton btnEliminar;
	private JScrollPane spnLista;
	private JList list;

	/**
	 * Create the panel.
	 */
	public MiListaJPanel_2() {
		setLayout(new BorderLayout(0, 0));
		
		pnBotones = new JPanel();
		add(pnBotones, BorderLayout.EAST);
		pnBotones.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnAniadir = new JButton("");
		btnAniadir.setIcon(new ImageIcon(MiListaJPanel_2.class.getResource("/presentacion/imagenes/iconos/plus-24.png")));
		btnAniadir.setBorderPainted(false);
		btnAniadir.setContentAreaFilled(false);
		pnBotones.add(btnAniadir);
		
		btnEliminar = new JButton("");
		btnEliminar.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		btnEliminar.setIcon(new ImageIcon(MiListaJPanel_2.class.getResource("/presentacion/imagenes/iconos/remove-24.png")));
		btnEliminar.setBorderPainted(false);
		btnEliminar.setContentAreaFilled(false);
		pnBotones.add(btnEliminar);
		
		spnLista = new JScrollPane();
		add(spnLista, BorderLayout.CENTER);
		
		list = new JList();
		spnLista.setViewportView(list);

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

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public JScrollPane getSpnLista() {
		return spnLista;
	}

	public void setSpnLista(JScrollPane spnLista) {
		this.spnLista = spnLista;
	}

	public JList getList() {
		return list;
	}

	public void setList(JList list) {
		this.list = list;
	}
	
	
}
