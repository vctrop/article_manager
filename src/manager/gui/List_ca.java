package manager.gui;

import custom_classes.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import custom_classes.Journal_article;
import custom_classes.Lists;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;

public class List_ca extends JDialog {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			List_ca dialog = new List_ca();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public List_ca() {
		setTitle("List of conference articles");
		setBounds(100, 100, 672, 300);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 656, 261);
		getContentPane().add(scrollPane);
		
		DefaultTableModel model = new DefaultTableModel();
		
		model.addColumn("Title");
		model.addColumn("Main author");
		model.addColumn("Conference");
		model.addColumn("Location");
		model.addColumn("Year");
		model.addColumn("On Sci-hub");
		model.addColumn("Open access");
		
		for (int i = 0; i < Lists.conference_list.size(); i++) {
			Conference_article paper = Lists.conference_list.get(i);
			
			model.addRow(new String[] {paper.title, paper.main_author, paper.conference_name, paper.conference_location,
					String.valueOf(paper.year_of_conference), String.valueOf(paper.sci_hub), String.valueOf(paper.open_access)});
 		}
		
		table = new JTable(model);
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table.setRowSelectionAllowed(false);
		scrollPane.setViewportView(table);
	}

}
