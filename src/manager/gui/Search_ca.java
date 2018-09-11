package manager.gui;

import custom_classes.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Search_ca extends JDialog {

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
			Search_ca dialog = new Search_ca();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Search_ca() {
		setResizable(false);
		setTitle("Search conference articles");
		setBounds(100, 100, 430, 284);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblArticleTitle = new JLabel("Article title:");
			lblArticleTitle.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblArticleTitle.setBounds(10, 10, 59, 14);
			contentPanel.add(lblArticleTitle);
		}
		{
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.PLAIN, 11));
			textField.setColumns(10);
			textField.setBounds(79, 6, 242, 23);
			contentPanel.add(textField);
		}
		{
			JButton button = new JButton("SEARCH");
			button.setFont(new Font("Tahoma", Font.PLAIN, 11));
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					String looking_for = textField.getText();
					int index = 0, found = 0;
					for (int i = 0; i < Lists.conference_list.size(); i++) {
						if (looking_for.equals(Lists.conference_list.get(i).title)) {
							index = i;
							found = 1;
						}
					}
					
					if (found == 1) {
						Conference_article found_item = Lists.conference_list.get(index);
						textField_1.setText("Yes");
						textField_2.setText(String.valueOf(index));
						textField_3.setText(found_item.title);
						textField_4.setText(found_item.main_author);
						textField_5.setText(found_item.conference_name);
						textField_6.setText(found_item.conference_location);
						textField_7.setText(String.valueOf(found_item.year_of_conference));
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
			button.setBounds(331, 6, 83, 23);
			contentPanel.add(button);
		}
		{
			Button button = new Button("");
			button.setEnabled(false);
			button.setBounds(0, 30, 429, 5);
			contentPanel.add(button);
		}
		{
			JLabel label = new JLabel("Index:");
			label.setFont(new Font("Tahoma", Font.PLAIN, 11));
			label.setBounds(246, 51, 34, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("Title:");
			label.setFont(new Font("Tahoma", Font.PLAIN, 11));
			label.setBounds(83, 76, 25, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("Main author:");
			label.setFont(new Font("Tahoma", Font.PLAIN, 11));
			label.setBounds(46, 98, 70, 14);
			contentPanel.add(label);
		}
		{
			JLabel lblConferenceName = new JLabel("Conference name:");
			lblConferenceName.setHorizontalAlignment(SwingConstants.LEFT);
			lblConferenceName.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblConferenceName.setBounds(19, 123, 89, 14);
			contentPanel.add(lblConferenceName);
		}
		{
			JLabel lblYearOfConference = new JLabel("Year of conference:");
			lblYearOfConference.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblYearOfConference.setBounds(10, 176, 97, 14);
			contentPanel.add(lblYearOfConference);
		}
		{
			JLabel label = new JLabel("Avaliable at Sci-hub:");
			label.setFont(new Font("Tahoma", Font.PLAIN, 11));
			label.setBounds(10, 201, 98, 14);
			contentPanel.add(label);
		}
		{
			JLabel lblConferenceLocation = new JLabel("Conference location:");
			lblConferenceLocation.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblConferenceLocation.setBounds(8, 148, 100, 14);
			contentPanel.add(lblConferenceLocation);
		}
		{
			JLabel label = new JLabel("Open Access:");
			label.setFont(new Font("Tahoma", Font.PLAIN, 11));
			label.setBounds(42, 226, 66, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("Found:");
			label.setFont(new Font("Tahoma", Font.PLAIN, 11));
			label.setBounds(70, 51, 38, 14);
			contentPanel.add(label);
		}
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(133, 48, 86, 20);
		contentPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(289, 48, 86, 20);
		contentPanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(133, 73, 242, 20);
		contentPanel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(133, 98, 242, 20);
		contentPanel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(133, 126, 242, 20);
		contentPanel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(133, 151, 242, 20);
		contentPanel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(133, 176, 242, 20);
		contentPanel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(133, 201, 242, 20);
		contentPanel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(133, 226, 242, 20);
		contentPanel.add(textField_9);
	}
}
