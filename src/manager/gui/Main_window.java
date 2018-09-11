package manager.gui;

import java.awt.EventQueue;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Main_window {

	private JFrame frmArticleManager;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_window window = new Main_window();
					window.frmArticleManager.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main_window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmArticleManager = new JFrame();
		Image icon = Toolkit.getDefaultToolkit().getImage("V:\\UFSM\\2017 - 2\\Programação Orientada a Objetos\\Eclipse workspace\\Article Manager\\Academia.ico");
		frmArticleManager.setResizable(false);
		frmArticleManager.setTitle("Article Manager");
		frmArticleManager.setBounds(100, 100, 538, 273);
		frmArticleManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmArticleManager.getContentPane().setLayout(null);
		frmArticleManager.setIconImage(icon);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("V:\\UFSM\\2017 - 2\\Programa\u00E7\u00E3o Orientada a Objetos\\Eclipse workspace\\Article Manager\\raven.png"));
		lblNewLabel.setBounds(10, 11, 126, 218);
		frmArticleManager.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Journal Article");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				register_ja dialog = new register_ja();
				dialog.setVisible(true);
			}
		});
		btnNewButton.setBounds(146, 11, 178, 23);
		frmArticleManager.getContentPane().add(btnNewButton);
		
		JButton btnAddConferenceArticle = new JButton("Add Conference Article");
		btnAddConferenceArticle.setForeground(Color.BLACK);
		btnAddConferenceArticle.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAddConferenceArticle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				register_ca dialog = new register_ca();
				dialog.setVisible(true);
			}
		});
		btnAddConferenceArticle.setBounds(345, 11, 178, 23);
		frmArticleManager.getContentPane().add(btnAddConferenceArticle);
		
		JButton btnListConferenceArticles = new JButton("List Journal Articles");
		btnListConferenceArticles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List_ja dialog = new List_ja();
				dialog.setVisible(true);
			}
		});
		btnListConferenceArticles.setForeground(Color.BLACK);
		btnListConferenceArticles.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnListConferenceArticles.setBounds(146, 79, 178, 23);
		frmArticleManager.getContentPane().add(btnListConferenceArticles);
		
		JButton btnListConferenceArticles_1 = new JButton("List Conference Articles");
		btnListConferenceArticles_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List_ca dialog = new List_ca();
				dialog.setVisible(true);
			}
		});
		btnListConferenceArticles_1.setForeground(Color.BLACK);
		btnListConferenceArticles_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnListConferenceArticles_1.setBounds(345, 79, 178, 23);
		frmArticleManager.getContentPane().add(btnListConferenceArticles_1);
		
		JButton btnRemoveArticle = new JButton("Remove Article");
		btnRemoveArticle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Remove dialog = new Remove();
				dialog.setVisible(true);
			}
		});
		btnRemoveArticle.setForeground(Color.BLACK);
		btnRemoveArticle.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRemoveArticle.setBounds(243, 119, 163, 23);
		frmArticleManager.getContentPane().add(btnRemoveArticle);
		
		JLabel lblToRemoveAl = new JLabel("\"To remove all the brarriers in the way of science\"");
		lblToRemoveAl.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblToRemoveAl.setLabelFor(frmArticleManager);
		lblToRemoveAl.setHorizontalAlignment(SwingConstants.CENTER);
		lblToRemoveAl.setBounds(146, 221, 363, 14);
		frmArticleManager.getContentPane().add(lblToRemoveAl);
		
		JButton btnSearchJournalArticles = new JButton("Search Journal Articles");
		btnSearchJournalArticles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Search_ja dialog = new Search_ja();
				dialog.setVisible(true);
			}
		});
		btnSearchJournalArticles.setForeground(Color.BLACK);
		btnSearchJournalArticles.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSearchJournalArticles.setBounds(146, 45, 178, 23);
		frmArticleManager.getContentPane().add(btnSearchJournalArticles);
		
		JButton btnSearchConferenceArticles = new JButton("Search Conference Articles");
		btnSearchConferenceArticles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search_ca dialog = new Search_ca();
				dialog.setVisible(true);
			}
		});
		btnSearchConferenceArticles.setForeground(Color.BLACK);
		btnSearchConferenceArticles.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSearchConferenceArticles.setBounds(345, 45, 178, 23);
		frmArticleManager.getContentPane().add(btnSearchConferenceArticles);
		
		JButton btnNewButton_1 = new JButton("Save data");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1.setBounds(243, 187, 163, 23);
		frmArticleManager.getContentPane().add(btnNewButton_1);
		
		JButton btnLoadData = new JButton("Load data");
		btnLoadData.setForeground(Color.BLACK);
		btnLoadData.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnLoadData.setBounds(243, 153, 163, 23);
		frmArticleManager.getContentPane().add(btnLoadData);
		
		
	}
}
