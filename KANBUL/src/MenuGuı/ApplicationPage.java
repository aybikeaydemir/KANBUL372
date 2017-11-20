package MenuGuý;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.Popup;
import javax.swing.PopupFactory;

import sqlTable.KanArayan;
import sqlTable.KanVerici;

import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Color;

public class ApplicationPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					ApplicationPage window = new ApplicationPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	public void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationPage window = new ApplicationPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public ApplicationPage() {
		initialize();		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton Donor_Button = new JButton("DON\u00D6R");
		Donor_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DonorPage donorPage = new DonorPage();
				donorPage.newScreen();
				frame.dispose();
			}
		});
		
		JTextArea txtrKan = new JTextArea();
		txtrKan.setForeground(new Color(220, 20, 60));
		txtrKan.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		txtrKan.setText("KANBUL S\u0130STEM\u0130NE \r\n     HO\u015EGELD\u0130N\u0130Z");
		txtrKan.setBounds(93, 100, 221, 71);
		frame.getContentPane().add(txtrKan);
		Donor_Button.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Donor_Button.setBounds(55, 228, 108, 23);
		frame.getContentPane().add(Donor_Button);
		
		JButton KanArayan_Button = new JButton("KAN ARAYAN");
		KanArayan_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				KanArayanPage kanArayanPage = new KanArayanPage();
				kanArayanPage.newScreen();
				frame.dispose();
			}
		});
		KanArayan_Button.setFont(new Font("Tahoma", Font.PLAIN, 16));
		KanArayan_Button.setBounds(55, 194, 141, 23);
		frame.getContentPane().add(KanArayan_Button);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon(ApplicationPage.class.getResource("/Kanbul_image/Kanbul_image.jpg")));
		lblNewLabel.setBounds(-86, 0, 561, 272);
		frame.getContentPane().add(lblNewLabel);
	}
}