package MenuGuý;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ErrorPage {
    
	private JFrame frame;
	private JTextField Error_textField;

	/**
	 * Launch the application.
	 */
	public  void newScreen(String message) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					ErrorPage window = new ErrorPage();
					window.Error_textField.setText(message);
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

	public ErrorPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 382, 177);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton Geri_Button = new JButton("Tamam");
		Geri_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		Geri_Button.setBounds(271, 99, 85, 29);
		frame.getContentPane().add(Geri_Button);
		
		Error_textField = new JTextField();
		Error_textField.setBackground(SystemColor.menu);
		Error_textField.setBounds(10, 40, 346, 35);
		frame.getContentPane().add(Error_textField);
		Error_textField.setColumns(10);
	}
}
