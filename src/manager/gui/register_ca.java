package manager.gui;

import custom_classes.*;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JSeparator;
import java.awt.Font;

public class register_ca extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_ti;
	private JTextField textField_ma;
	private JTextField textField_cn;
	private JTextField textField_yc;
	private JTextField textField_cl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			register_ca dialog = new register_ca();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Create the dialog.
	 */
	public register_ca(){
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Conference article registration");
		setResizable(false);
		setBounds(100, 100, 343, 250);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("Title");
			label.setFont(new Font("Tahoma", Font.PLAIN, 11));
			label.setBounds(94, 14, 20, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("Main author");
			label.setFont(new Font("Tahoma", Font.PLAIN, 11));
			label.setBounds(57, 39, 57, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("Avaliable at Sci-hub");
			label.setFont(new Font("Tahoma", Font.PLAIN, 11));
			label.setBounds(20, 142, 94, 14);
			contentPanel.add(label);
		}
		{
			JLabel lblConferenceName = new JLabel("Conference name");
			lblConferenceName.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblConferenceName.setBounds(29, 67, 85, 14);
			contentPanel.add(lblConferenceName);
		}
		{
			JLabel lblYearOfConference = new JLabel("Year of conference");
			lblYearOfConference.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblYearOfConference.setBounds(20, 117, 94, 14);
			contentPanel.add(lblYearOfConference);
		}
		{
			JLabel lblConferenceLocation = new JLabel("Conference location");
			lblConferenceLocation.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblConferenceLocation.setBounds(20, 92, 104, 14);
			contentPanel.add(lblConferenceLocation);
		}
		{
			textField_ti = new JTextField();
			textField_ti.setFont(new Font("Tahoma", Font.PLAIN, 11));
			textField_ti.setColumns(10);
			textField_ti.setBounds(124, 8, 201, 20);
			contentPanel.add(textField_ti);
		}
		{
			textField_ma = new JTextField();
			textField_ma.setFont(new Font("Tahoma", Font.PLAIN, 11));
			textField_ma.setColumns(10);
			textField_ma.setBounds(124, 33, 201, 20);
			contentPanel.add(textField_ma);
		}
		{
			textField_cn = new JTextField();
			textField_cn.setFont(new Font("Tahoma", Font.PLAIN, 11));
			textField_cn.setColumns(10);
			textField_cn.setBounds(124, 61, 201, 20);
			contentPanel.add(textField_cn);
		}
		{
			textField_yc = new JTextField();
			textField_yc.setFont(new Font("Tahoma", Font.PLAIN, 11));
			textField_yc.setColumns(10);
			textField_yc.setBounds(124, 114, 50, 20);
			contentPanel.add(textField_yc);
		}
		{
			textField_cl = new JTextField();
			textField_cl.setColumns(10);
			textField_cl.setBounds(124, 86, 201, 20);
			contentPanel.add(textField_cl);
		}
		{
			JLabel label = new JLabel("Open Access");
			label.setFont(new Font("Tahoma", Font.PLAIN, 11));
			label.setBounds(52, 167, 62, 14);
			contentPanel.add(label);
		}
		final JCheckBox checkBox_sh = new JCheckBox("");
		checkBox_sh.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
			}
		});
		checkBox_sh.setBounds(120, 138, 20, 23);
		contentPanel.add(checkBox_sh);
		
		final JCheckBox checkBox_oa = new JCheckBox("");
		checkBox_oa.setBounds(120, 164, 20, 23);
		contentPanel.add(checkBox_oa);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0)  {
						String title = textField_ti.getText();
						String main_author = textField_ma.getText();
						String conference_name = textField_cn.getText();
						String conference_location = textField_cl.getText();
						int year_of_conference;
						
						boolean sci_hub = checkBox_sh.isSelected();
						//boolean open_access = checkBox.isSelected();
						boolean open_access = checkBox_oa.isSelected();
						try {
							if (NotANaturalNumberException.isValid(textField_yc.getText())) {
								year_of_conference = Integer.parseInt(textField_yc.getText());
								Conference_article paper = new Conference_article(title, main_author, sci_hub, open_access, conference_name,
										year_of_conference, conference_location);
								Lists.conference_list.add(paper);
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
