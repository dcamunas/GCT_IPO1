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
	private JButton btnModificar;
	private JButton btnLimpiar;
	private JButton btnBorrar;
	private JScrollPane scrollPane;
	private JList listGuias;

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
		
		btnModificar = new JButton("Modificar");
		pnBotones.add(btnModificar);
		
		btnLimpiar = new JButton("Limpiar");
		pnBotones.add(btnLimpiar);
		
		btnBorrar = new JButton("Borrar");
		pnBotones.add(btnBorrar);
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		listGuias = new JList();
		scrollPane.setViewportView(listGuias);

	}

}
