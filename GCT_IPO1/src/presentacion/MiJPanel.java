package presentacion;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.BorderLayout;
import java.awt.Window;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiJPanel extends JPanel {
	private JPanel pnimagen;
	private JLabel lblImagen;
	private JFrame frame;
	private JPanel pnAceptar;
	private JButton btnAceptar;

	/**
	 * Create the panel.
	 */
	
	public MiJPanel(JLabel lblImagen) {
		setLayout(new BorderLayout(0, 0));
		frame = (JFrame) SwingUtilities.getWindowAncestor(this);
		
		pnimagen = new JPanel();
		add(pnimagen, BorderLayout.WEST);
		pnimagen.setLayout(new BorderLayout(0, 0));
		this.lblImagen = lblImagen;
		pnimagen.add(lblImagen);
		
		pnAceptar = new JPanel();
		add(pnAceptar, BorderLayout.SOUTH);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new BtnAceptarActionListener());
		pnAceptar.add(btnAceptar);

	}
	
	
	public JLabel getLblImagen() {
		return lblImagen;
	}


	public void setLblImagen(JLabel lblImagen) {
		this.lblImagen = lblImagen;
	}
	
	


	public JPanel getPnimagen() {
		return pnimagen;
	}


	public void setPnimagen(JPanel pnimagen) {
		this.pnimagen = pnimagen;
	}

	



	public JPanel getPnAceptar() {
		return pnAceptar;
	}


	public JButton getBtnAceptar() {
		return btnAceptar;
	}


	public void setBtnAceptar(JButton btnAceptar) {
		this.btnAceptar = btnAceptar;
	}





	private class BtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Window parentWindow = SwingUtilities.getWindowAncestor(MiJPanel.this);	
			//parentWindow.setVisible(false);
		}
	}
}
