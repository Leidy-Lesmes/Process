package view.body;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controller.Commands;
import view.constants.ConstantsWindow;
import view.utilities.Utilities;

public class MenuBarArchive extends JMenuBar {

	private static final long serialVersionUID = 1L;

	private JMenu report;
	private JMenuItem report1, report2, report3, report4, report5, report6, report7, report8, report9, report10;
	private JButton exportArchive;

	public MenuBarArchive(ActionListener actionListener) {
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 350, 20));
		this.setBackground(ConstantsWindow.COLOR_MENUBAR);
		this.initComponents(actionListener);
	}

	private void initComponents(ActionListener actionListener) {
		exportArchive = new JButton();
		exportArchive.setBorder(null);
		exportArchive.setBackground(ConstantsWindow.COLOR_MENUBAR);
		exportArchive.setFont(ConstantsWindow.FONT_MENUBAR);
		exportArchive.addActionListener(actionListener);
		exportArchive.setActionCommand(Commands.C_EXPORT_ARCHIVE.toString());
		this.add(Utilities.button(exportArchive, 420, 50, "EXPORTAR"));

		report = new JMenu(ConstantsWindow.CENTER_PANEL_MENU_PRINCIPAL_REPORT);
		report.setFont(ConstantsWindow.FONT_MENUBAR);
		report.setForeground(Color.BLACK);

		report1 = new JMenuItem(ConstantsWindow.TOP_T_MENUITEM_REPORT1);
		report1.setFont(ConstantsWindow.FONT_MENUBAR);
		report1.addActionListener(actionListener);
		report1.setActionCommand(Commands.C_REPORT1.toString());
		report.add(report1);
		this.add(report);
		report.addSeparator();

		report2 = new JMenuItem(ConstantsWindow.TOP_T_MENUITEM_REPORT2);
		report2.setFont(ConstantsWindow.FONT_MENUBAR);
		report2.addActionListener(actionListener);
		report2.setActionCommand(Commands.C_REPORT2.toString());
		report.add(report2);
		this.add(report);
		report.addSeparator();

		report3 = new JMenuItem(ConstantsWindow.TOP_T_MENUITEM_REPORT3);
		report3.setFont(ConstantsWindow.FONT_MENUBAR);
		report3.addActionListener(actionListener);
		report3.setActionCommand(Commands.C_REPORT3.toString());
		report.add(report3);
		this.add(report);
		report.addSeparator();

		report4 = new JMenuItem(ConstantsWindow.TOP_T_MENUITEM_REPORT4);
		report4.setFont(ConstantsWindow.FONT_MENUBAR);
		report4.addActionListener(actionListener);
		report4.setActionCommand(Commands.C_REPORT4.toString());
		report.add(report4);
		this.add(report);
		report.addSeparator();

		report5 = new JMenuItem(ConstantsWindow.TOP_T_MENUITEM_REPORT5);
		report5.setFont(ConstantsWindow.FONT_MENUBAR);
		report5.addActionListener(actionListener);
		report5.setActionCommand(Commands.C_REPORT5.toString());
		report.add(report5);
		this.add(report);
		report.addSeparator();

		report6 = new JMenuItem(ConstantsWindow.TOP_T_MENUITEM_REPORT6);
		report6.setFont(ConstantsWindow.FONT_MENUBAR);
		report6.addActionListener(actionListener);
		report6.setActionCommand(Commands.C_REPORT6.toString());
		report.add(report6);
		this.add(report);
		report.addSeparator();

		report7 = new JMenuItem(ConstantsWindow.TOP_T_MENUITEM_REPORT7);
		report7.setFont(ConstantsWindow.FONT_MENUBAR);
		report7.addActionListener(actionListener);
		report7.setActionCommand(Commands.C_REPORT7.toString());
		report.add(report7);
		this.add(report);
		report.addSeparator();

		report8 = new JMenuItem(ConstantsWindow.TOP_T_MENUITEM_REPORT8);
		report8.setFont(ConstantsWindow.FONT_MENUBAR);
		report8.addActionListener(actionListener);
		report8.setActionCommand(Commands.C_REPORT8.toString());
		report.add(report8);
		this.add(report);
		report.addSeparator();

		report9 = new JMenuItem(ConstantsWindow.TOP_T_MENUITEM_REPORT9);
		report9.setFont(ConstantsWindow.FONT_MENUBAR);
		report9.addActionListener(actionListener);
		report9.setActionCommand(Commands.C_REPORT9.toString());
		report.add(report9);
		this.add(report);
		report.addSeparator();

		report10 = new JMenuItem(ConstantsWindow.TOP_T_MENUITEM_REPORT10);
		report10.setFont(ConstantsWindow.FONT_MENUBAR);
		report10.addActionListener(actionListener);
		report10.setActionCommand(Commands.C_REPORT10.toString());
		report.add(report10);
		this.add(report);
	}
}
