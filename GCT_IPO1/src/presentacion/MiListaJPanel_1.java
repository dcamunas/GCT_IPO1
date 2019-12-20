package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.border.BevelBorder;

public class MiListaJPanel_1 extends JPanel {
	private JPanel pnBotones;
	private JButton btnAniadir;
	private JButton btnLimpiar;
	private JScrollPane scrollPane;
	private JList list;

	/**
	 * Create the panel.
	 */
	public MiListaJPanel_1() {
		setLayout(new BorderLayout(0, 0));
		
		pnBotones = new JPanel();
		pnBotones.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		add(pnBotones, BorderLayout.SOUTH);
		
		btnAniadir = new JButton("Añadir");
		pnBotones.add(btnAniadir);
		
		btnLimpiar = new JButton("Limpiar");
		pnBotones.add(btnLimpiar);
		
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
	
	

}
