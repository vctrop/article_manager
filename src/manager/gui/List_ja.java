package manager.gui;

import custom_classes.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;

public class List_ja extends JDialog {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			List_ja dialog = new List_ja();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public List_ja() {
		setResizable(false);
		setTitle("List of journal articles");
		setBounds(100, 100, 630, 300);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 624, 271);
		getContentPane().add(scrollPane);
		
DefaultTableModel model = new DefaultTableModel();
		
		model.addColumn("Title");
		model.addColumn("Main author");
		model.addColumn("Journal");
		model.addColumn("Year");
		model.addColumn("Volume");
		model.addColumn("On Sci-hub");
		model.addColumn("Open access");
		
		for (int i = 0; i < Lists.journal_list.size(); i++) {
			Journal_article paper = Lists.journal_list.get(i);
			
			model.addRow(new String[] {paper.title, paper.main_author, paper.journal_name, String.valueOf(paper.year_of_acceptance),
					String.valueOf(paper.volume), String.valueOf(paper.sci_hub), String.valueOf(paper.open_access)});
 		}
		
		table = new JTable(model);
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table.setRowSelectionAllowed(false);
		scrollPane.setViewportView(table);
		
		//String[] columns = new String[] {"Title","Main author","Journal","Year","Volume","On Sci-hub","Open access"};
		
		
		
	}
}
