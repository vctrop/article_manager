package manager.gui;

import custom_classes.*;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Remove extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Remove dialog = new Remove();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Remove() {
		setTitle("Remove article");
		setResizable(false);
		setBounds(100, 100, 247, 160);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		final JRadioButton rdbtnJournalArticle = new JRadioButton("Journal article");
		rdbtnJournalArticle.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnJournalArticle.setSelected(true);
		rdbtnJournalArticle.setBounds(126, 7, 109, 23);
		contentPanel.add(rdbtnJournalArticle);
		
		final JRadioButton rdbtnConferenceArticle = new JRadioButton("Conference article");
		rdbtnConferenceArticle.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnConferenceArticle.setBounds(126, 33, 119, 23);
		contentPanel.add(rdbtnConferenceArticle);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnConferenceArticle);
		group.add(rdbtnJournalArticle);
		
		JButton btnRemove = new JButton("Confirm");
		btnRemove.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRemove.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int index;
				
				try {
					if (NotANaturalNumberException.isValid(textField.getText())) {
						index = Integer.parseInt(textField.getText());
						
						if (rdbtnJournalArticle.isSelected()) {
							if(index < Lists.journal_list.size()) {
								Lists.journal_list.remove(index);
								textField_1.setText("Success: index found");
							}
							else
								textField_1.setText("Failure: index not found");
						}
						else {
							if(index < Lists.conference_list.size()) {
								Lists.conference_list.remove(index);
								textField_1.setText("Success: index found");
							}
							else
								textField_1.setText("Failure: index not found");		
						}
					}
					else
						throw new NotANaturalNumberException("Not a natural number");						
				}
				catch (NotANaturalNumberException ex){
					final JPanel error_panel = new JPanel();
				    JOptionPane.showMessageDialog(error_panel, "ERROR: Not a natural number");
				}
				
				
					
			}
		});
		btnRemove.setBounds(73, 63, 89, 23);
		contentPanel.add(btnRemove);
		
		JLabel lblIndex = new JLabel("Index: ");
		lblIndex.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblIndex.setBounds(24, 25, 35, 14);
		contentPanel.add(lblIndex);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_1.setEditable(false);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(24, 100, 187, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField.setBounds(64, 22, 35, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
	}
}
