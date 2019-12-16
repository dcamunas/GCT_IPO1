package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class MiListaJPanel extends JPanel {
	private JPanel pnBotones;
	private JButton btnAniadir;
	private JButton btnEliminar;
	private JScrollPane spnLista;
	private JList list;

	/**
	 * Create the panel.
	 */
	public MiListaJPanel() {
		setLayout(new BorderLayout(0, 0));
		
		this.pnBotones = new JPanel();
		add(pnBotones, BorderLayout.EAST);
		pnBotones.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.btnAniadir = new JButton("");
		btnAniadir.setIcon(new ImageIcon(MiListaJPanel.class.getResource("/presentacion/imagenes/iconos/plus24.png")));
		pnBotones.add(btnAniadir);
		
		this.btnEliminar = new JButton("");
		btnEliminar.setIcon(new ImageIcon(MiListaJPanel.class.getResource("/presentacion/imagenes/iconos/remove24.png")));
		pnBotones.add(btnEliminar);
		
		this.spnLista = new JScrollPane();
		add(spnLista, BorderLayout.CENTER);
		
		this.list = new JList();
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
