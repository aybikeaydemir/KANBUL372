package MenuGuý;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import sqlTable.KanVerici;

public class DonorPage {

	private JFrame frame;
	private JTextField KullaniciAdi_textField;
	private JTextField Sifre_textField;
	public KanVerici person = new KanVerici ();
	public 	ArrayList<String> kullaniciPage=new ArrayList <String>();
	/**
	 * Launch the application.
	 */
	public void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DonorPage window = new DonorPage();
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
	public DonorPage() {
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
		
		JLabel KullancAd_Label = new JLabel("Kullan\u0131c\u0131 Ad\u0131");
		KullancAd_Label.setBounds(37, 50, 97, 20);
		KullancAd_Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.getContentPane().add(KullancAd_Label);
		
		JLabel Sifre_Label = new JLabel("\u015Eifre");
		Sifre_Label.setBounds(37, 90, 97, 20);
		Sifre_Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.getContentPane().add(Sifre_Label);
		
		KullaniciAdi_textField = new JTextField();
		KullaniciAdi_textField.setBounds(176, 50, 178, 20);
		frame.getContentPane().add(KullaniciAdi_textField);
		KullaniciAdi_textField.setColumns(10);
		
		Sifre_textField = new JTextField();
		Sifre_textField.setBounds(176, 90, 178, 20);
		frame.getContentPane().add(Sifre_textField);
		Sifre_textField.setColumns(10);
		
		JButton UyeOlmakIstiyorum_Button = new JButton("\u00DCye Olmak \u0130stiyorum");
		UyeOlmakIstiyorum_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnrollPage enrollPage = new EnrollPage();
				enrollPage.newScreen();
				frame.dispose();
			}
		});
		UyeOlmakIstiyorum_Button.setBounds(103, 237, 184, 23);
		frame.getContentPane().add(UyeOlmakIstiyorum_Button);
		
		JRadioButton Kizilay_RadioButton = new JRadioButton("K\u0131z\u0131lay");
		Kizilay_RadioButton.setBounds(155, 130, 68, 23);
		frame.getContentPane().add(Kizilay_RadioButton);
		
		JRadioButton Hastane_RadioButton = new JRadioButton("Hastane");
		Hastane_RadioButton.setBounds(85, 130, 79, 23);
		frame.getContentPane().add(Hastane_RadioButton);
		
		JRadioButton Kisi_RadioButton = new JRadioButton("Kisi");
		Kisi_RadioButton.setBounds(31, 130, 57, 23);
		frame.getContentPane().add(Kisi_RadioButton);
		
		JRadioButton KizilayOtobus_RadioButton = new JRadioButton("K\u0131z\u0131lay Otob\u00FCs\u00FC");
		KizilayOtobus_RadioButton.setBounds(221, 130, 133, 23);
		frame.getContentPane().add(KizilayOtobus_RadioButton);
		
		JButton Giris_Button = new JButton("Giri\u015F");
		Giris_Button.setBounds(214, 160, 89, 23);
		Giris_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					// Kullanýcý adý ve sifre alýnarak veritabanýna bir query atýlacak 
					// Kýzýlay Kiþi Hastane ve Otobus ýcýn ayrý mý atýlacak yoksa hepsi içib bir tane mi ?				
					String kullaniciAdi = KullaniciAdi_textField.getText(); 
					String sifre = Sifre_textField.getText(); 
					// Eger query sonucu kisi kayýtlýysa
					if(Kisi_RadioButton.isSelected()) {
						// Kisi ekranýný açacak
						try {
						   // EXIST METODUNU DUZELT !!! 
							
							kullaniciPage=person.SearchEnter( kullaniciAdi, sifre);
							
							//System.out.print(kullaniciPage.toString());
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if(kullaniciPage==null) {
							ErrorPage errorPage = new ErrorPage();
							errorPage.newScreen("Girilen kullanýcý adý veya þifre hatalý/geçersiz.");
						}
						else {
							KisiPage kp=new KisiPage();
							// Kullanýcý adýyla  þifreyi parametre olarak geçir
							kp.newScreen(kullaniciPage);
							frame.dispose();
						}
					}
					if(Kizilay_RadioButton.isSelected()) {
						try {
							kullaniciPage=person.SearchEnter( kullaniciAdi, sifre);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if(kullaniciPage==null) {
							ErrorPage errorPage = new ErrorPage();
							errorPage.newScreen("Girilen kullanýcý adý veya þifre hatalý/geçersiz.");
						}
						else {
						KizilayPage kizilayPage = new KizilayPage();
						kizilayPage.newScreen(kullaniciAdi,sifre);
						frame.dispose();
						}
					}
					if(Hastane_RadioButton.isSelected()) {
						try {
							kullaniciPage=person.SearchEnterHospital(kullaniciAdi, sifre);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						if(kullaniciPage==null) {
							ErrorPage errorPage = new ErrorPage();
							errorPage.newScreen("Girilen kullanýcý adý veya þifre hatalý/geçersiz.");
						}
						else {
						HospitalPage hospitalPage = new HospitalPage();
						hospitalPage.hospitalMemberScreen(kullaniciAdi,kullaniciPage);
						frame.dispose();
						}
					}
					if(KizilayOtobus_RadioButton.isSelected()) {
						try {
							kullaniciPage=person.SearchEnterBus(kullaniciAdi, sifre);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if(kullaniciPage==null) {
							ErrorPage errorPage = new ErrorPage();
							errorPage.newScreen("Girilen kullanýcý adý veya þifre hatalý/geçersiz.");
						}
						else {
						BusPage busPage = new BusPage();
						busPage.busMemberScreen(kullaniciAdi,kullaniciPage);
						frame.dispose();
						}
					}	
											
			}
		});
		frame.getContentPane().add(Giris_Button);
		
		
		
		JButton Geri_Button = new JButton("Geri");
		Geri_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ApplicationPage appPage = new ApplicationPage();
				appPage.newScreen();
				frame.dispose();
			}
		});
		Geri_Button.setBounds(12, 237, 79, 24);
		frame.getContentPane().add(Geri_Button);
	}
}