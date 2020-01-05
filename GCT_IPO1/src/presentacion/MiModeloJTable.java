package presentacion;

import java.util.Vector;
import javax.swing.table.*;

public class MiModeloJTable extends AbstractTableModel {
	private String nombre = MessagesGCT.getString("MiModeloJTable.nombre.text");
	private String apellidos = MessagesGCT.getString("MiModeloJTable.apellidos.text");
	private String edad = MessagesGCT.getString("MiModeloJTable.edad.text");
	private String num_telefono = MessagesGCT.getString("MiModeloJTable.num_telefono.text");
	private String foto = MessagesGCT.getString("MiModeloJTable.foto.text");
	
	private String[] nombreColumnas = { nombre, apellidos, edad, num_telefono, foto};
	private Vector datos = new Vector();

	public MiModeloJTable() {
	}
	public int getColumnCount() {
		return nombreColumnas.length;
	}

	public int getRowCount() {
		return datos.size();
	}

	public String getColumnName(int col) {
		return nombreColumnas[col];
	}

	public Object getValueAt(int row, int col) {
		Object[] fila = (Object[]) datos.elementAt(row);
		return fila[col];
	}

	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}

	public boolean isCellEditable(int row, int col) {
		return true;
	}

	public void setValueAt(Object value, int row, int col) {
		if (row < getRowCount() && col < getColumnCount()) {
			Object[] fila = (Object[]) datos.elementAt(row);
			fila[col] = value;
			fireTableCellUpdated(row, col);
		}
	}
	public void eliminaFila(int row) {
		datos.remove(row);
	}

	public void aniadeFila(Object[] row) {
		datos.add(row);
	}
	
	public void limpiar() {
		datos.removeAllElements();
	}

}
