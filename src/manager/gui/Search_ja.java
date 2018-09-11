package manager.gui;

import custom_classes.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import custom_classes.Lists;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Search_ja extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Search_ja dialog = new Search_ja();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Search_ja() {
		setResizable(false);
		setTitle("Search journal articles");
		setBounds(100, 100, 435, 275);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 429, 246);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Article title:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 8, 59, 14);
		contentPanel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField.setBounds(79, 4, 242, 23);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String looking_for = textField.getText();
				int index = 0, found = 0;
				for (int i = 0; i < Lists.journal_list.size(); i++) {
					if (looking_for.equals(Lists.journal_list.get(i).title)) {
						index = i;
						found = 1;
					}
				}
				
				if (found == 1) {
					Journal_article found_item = Lists.journal_list.get(index);
					textField_1.setText("Yes");
					textField_2.setText(String.valueOf(index));
					textField_3.setText(found_item.title);
					textField_4.setText(found_item.main_author);
					textField_5.setText(found_item.journal_name);
					textField_6.setText(String.valueOf(found_item.year_of_acceptance));
					textField_7.setText(String.valueOf(found_item.volume));
					textField_8.setText(String.valueOf(found_item.sci_hub));
					textField_9.setText(String.valueOf(found_item.open_access));	
				}
				else {
					textField_1.setText("No");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
					textField_7.setText("");
					textField_8.setText("");
					textField_9.setText("");
				}
				
			}
		});
		btnNewButton.setBounds(331, 4, 88, 23);
		contentPanel.add(btnNewButton);
		
		Button button = new Button("");
		button.setEnabled(false);
		button.setBounds(0, 28, 429, 5);
		contentPanel.add(button);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTitle.setBounds(79, 71, 25, 14);
		contentPanel.add(lblTitle);
		
		JLabel lblMainAuthor = new JLabel("Main author:");
		lblMainAuthor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblMainAuthor.setBounds(46, 96, 70, 14);
		contentPanel.add(lblMainAuthor);
		
		JLabel lblJournalName = new JLabel("Journal name:");
		lblJournalName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblJournalName.setBounds(38, 124, 70, 14);
		contentPanel.add(lblJournalName);
		
		JLabel lblYearOfAcceptance = new JLabel("Year of acceptance:");
		lblYearOfAcceptance.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblYearOfAcceptance.setBounds(11, 149, 97, 14);
		contentPanel.add(lblYearOfAcceptance);
		
		JLabel lblVolume = new JLabel("Volume:");
		lblVolume.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblVolume.setBounds(70, 174, 38, 14);
		contentPanel.add(lblVolume);
		
		JLabel lblAvaliableAtScihub = new JLabel("Avaliable at Sci-hub:");
		lblAvaliableAtScihub.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAvaliableAtScihub.setBounds(10, 199, 98, 14);
		contentPanel.add(lblAvaliableAtScihub);
		
		JLabel lblOpenAccess = new JLabel("Open Access:");
		lblOpenAccess.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblOpenAccess.setBounds(42, 224, 66, 14);
		contentPanel.add(lblOpenAccess);
		
		JLabel lblNewLabel_1 = new JLabel("Found:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(70, 46, 38, 14);
		contentPanel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("Index:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label.setBounds(226, 46, 34, 14);
		contentPanel.add(label);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_1.setEditable(false);
		textField_1.setBounds(114, 43, 86, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_2.setEditable(false);
		textField_2.setBounds(270, 43, 86, 20);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_3.setEditable(false);
		textField_3.setBounds(114, 71, 242, 20);
		contentPanel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_4.setEditable(false);
		textField_4.setBounds(114, 96, 242, 20);
		contentPanel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_5.setEditable(false);
		textField_5.setBounds(114, 124, 242, 20);
		contentPanel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_6.setEditable(false);
		textField_6.setBounds(114, 149, 242, 20);
		contentPanel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_7.setEditable(false);
		textField_7.setBounds(114, 174, 242, 20);
		contentPanel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_8.setEditable(false);
		textField_8.setBounds(114, 199, 242, 20);
		contentPanel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_9.setEditable(false);
		textField_9.setBounds(114, 224, 242, 20);
		contentPanel.add(textField_9);
		textField_9.setColumns(10);
	}
}
