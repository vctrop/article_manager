package manager.gui;

import custom_classes.*;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Font;

public class register_ja extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_ti;
	private JTextField textField_ma;
	private JTextField textField_jn;
	private JTextField textField_ya;
	private JTextField textField_vo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			register_ja dialog = new register_ja();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public register_ja() {
		setResizable(false);
		setTitle("Journal article registration");
		setBounds(100, 100, 331, 253);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Title");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNewLabel.setBounds(84, 11, 20, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblMainAuthor = new JLabel("Main author");
			lblMainAuthor.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblMainAuthor.setBounds(47, 36, 57, 14);
			contentPanel.add(lblMainAuthor);
		}
		{
			JLabel lblAvaliableAtScihub = new JLabel("Avaliable at Sci-hub");
			lblAvaliableAtScihub.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblAvaliableAtScihub.setBounds(10, 145, 94, 14);
			contentPanel.add(lblAvaliableAtScihub);
		}
		{
			JLabel lblOpenAccess = new JLabel("Open Access");
			lblOpenAccess.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblOpenAccess.setBounds(42, 170, 62, 14);
			contentPanel.add(lblOpenAccess);
		}
		{
			JLabel lblJournalName = new JLabel("Journal name");
			lblJournalName.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblJournalName.setBounds(34, 64, 70, 14);
			contentPanel.add(lblJournalName);
		}
		{
			JLabel lblYearOfAcceptance = new JLabel("Year of acceptance");
			lblYearOfAcceptance.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblYearOfAcceptance.setBounds(10, 92, 94, 14);
			contentPanel.add(lblYearOfAcceptance);
		}
		{
			JLabel lblVolume = new JLabel("Volume");
			lblVolume.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblVolume.setBounds(70, 120, 34, 14);
			contentPanel.add(lblVolume);
		}
		
		textField_ti = new JTextField();
		textField_ti.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_ti.setBounds(114, 8, 201, 20);
		contentPanel.add(textField_ti);
		textField_ti.setColumns(10);
		{
			textField_ma = new JTextField();
			textField_ma.setFont(new Font("Tahoma", Font.PLAIN, 11));
			textField_ma.setColumns(10);
			textField_ma.setBounds(114, 33, 201, 20);
			contentPanel.add(textField_ma);
		}
		{
			textField_jn = new JTextField();
			textField_jn.setFont(new Font("Tahoma", Font.PLAIN, 11));
			textField_jn.setColumns(10);
			textField_jn.setBounds(114, 61, 201, 20);
			contentPanel.add(textField_jn);
		}
		
		textField_ya = new JTextField();
		textField_ya.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_ya.setBounds(114, 89, 50, 20);
		contentPanel.add(textField_ya);
		textField_ya.setColumns(10);
		
		textField_vo = new JTextField();
		textField_vo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_vo.setColumns(10);
		textField_vo.setBounds(114, 117, 50, 20);
		contentPanel.add(textField_vo);
		
		final JCheckBox checkBox_sh = new JCheckBox("");
		checkBox_sh.setBounds(114, 141, 97, 23);
		contentPanel.add(checkBox_sh);
		
		final JCheckBox checkBox_oa = new JCheckBox("");
		checkBox_oa.setBounds(114, 166, 97, 23);
		contentPanel.add(checkBox_oa);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String title = textField_ti.getText();
						String main_author = textField_ma.getText();
						String journal_name = textField_jn.getText();
						boolean sci_hub = checkBox_sh.isSelected();
						boolean open_access = checkBox_oa.isSelected();
						
						int year_of_acceptance;
						int volume;
						
						try {
							if (NotANaturalNumberException.isValid(textField_ya.getText()) && 
									NotANaturalNumberException.isValid(textField_vo.getText())) {
								year_of_acceptance = Integer.parseInt(textField_ya.getText());
								volume = Integer.parseInt(textField_vo.getText());
								
								Journal_article paper = new Journal_article(title, main_author, sci_hub, open_access, journal_name,
										year_of_acceptance, volume);
								Lists.journal_list.add(paper);
							}
							else
								throw new NotANaturalNumberException("Not a natural number");
						}
						catch (NotANaturalNumberException e){
							final JPanel error_panel = new JPanel();
						    JOptionPane.showMessageDialog(error_panel, "ERROR: Not a natural number");
						}
						
						
						dispose();
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
