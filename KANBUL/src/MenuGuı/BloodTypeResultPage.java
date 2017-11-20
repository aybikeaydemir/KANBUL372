package MenuGuý;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class BloodTypeResultPage {

	private JFrame frame;
	JTextPane textPane;
	/**
	 * Launch the application.
	 */
	public  void newScreen(ArrayList<String> result,ArrayList<String> result2) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BloodTypeResultPage window = new BloodTypeResultPage();
					//System.out.println(result.toString());
					String s="";
					String t="";
					for(int i = 0 ; i<result.size();i++)
					       s +="   "+ result.get(i)+"\n";
					
				           String mes ="UYARI : Hastaneden aldýðýnýz kan ünite sayýsý kadar kan baðýþý yaptýðýnýz takdirde bu hastanededen kan alabilirsiniz \n";
					       t ="   "+ result2.get(0)+"\n";
					//System.out.println(t);
					
					window.textPane.setText(s+mes+t);
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
	public BloodTypeResultPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 648, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textPane = new JTextPane();
		textPane.setForeground(Color.RED);
		textPane.setEditable(false);
		textPane.setBounds(0, 35, 632, 394);
		frame.getContentPane().add(textPane);
		
		JTextPane txtpnTelefonAd = new JTextPane();
		txtpnTelefonAd.setText("        TELEFON    ADI - SOYADI      YA\u015E       \u0130L   \u0130L\u00C7E      KAN GRUBU");
		txtpnTelefonAd.setForeground(SystemColor.windowText);
		txtpnTelefonAd.setBounds(0, 0, 632, 36);
		frame.getContentPane().add(txtpnTelefonAd);
		
	}
}
