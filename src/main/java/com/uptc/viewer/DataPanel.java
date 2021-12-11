package view.body;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class DataPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTableData table;
	private MenuBarArchive menuBarArchive;

	public DataPanel(ActionListener actionListener) {
		this.setLayout(new BorderLayout(20, 20));
		this.setBackground(Color.WHITE);
		this.addComponents(actionListener);
		this.setVisible(true);
	}

	private void addComponents(ActionListener actionListener) {
		menuBarArchive = new MenuBarArchive(actionListener);
		this.add(menuBarArchive, BorderLayout.NORTH);

		table = new JTableData();
		this.add(table, BorderLayout.CENTER);
	}
	
	public void cleanRowsTable() {
		table.cleanRowsTable();
	}
	
	public void addElementToTable(ArrayList<Object[]> datasList) {
		table.addElementToTable(datasList);
	}

}