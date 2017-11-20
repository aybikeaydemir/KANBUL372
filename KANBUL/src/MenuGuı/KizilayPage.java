package MenuGuý;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KizilayPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KizilayPage window = new KizilayPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public  void newScreen(String kullaniciAdi, String password) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KizilayPage window = new KizilayPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public  void backScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KizilayPage window = new KizilayPage();
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
	public KizilayPage() {
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
		
		JButton HastaneEkle_Button = new JButton("Hastane Ekle");
		HastaneEkle_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HastaneEklePage hastanePage=new HastaneEklePage();
				hastanePage.newScreen();
				frame.dispose();
			}
		});
		HastaneEkle_Button.setBounds(35, 29, 117, 23);
		frame.getContentPane().add(HastaneEkle_Button);
		
		JButton OtobusEkle_Button = new JButton("Otob\u00FCs Ekle");
		OtobusEkle_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OtobusEklePage otobusEkle=new OtobusEklePage();
				otobusEkle.newScreen();
				frame.dispose();
			}
		});
		OtobusEkle_Button.setBounds(35, 74, 117, 23);
		frame.getContentPane().add(OtobusEkle_Button);
		
		JButton Geri_Button = new JButton("Geri");
		Geri_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DonorPage donorPage = new DonorPage();
				donorPage.newScreen();
				frame.dispose();
			}
		});
		Geri_Button.setBounds(35, 228, 71, 23);
		frame.getContentPane().add(Geri_Button);
	}

}
