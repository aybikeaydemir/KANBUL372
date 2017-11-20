package MenuGu�;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import sqlTable.KanArayan;


public class KanArayanPage {

	private JFrame frame;
	private JTextField Ad_textField;
	private JTextField Soyad_textField;
	private JTextField TelNo_textField;
	private JComboBox<String> HastaneninAd�;

	/**
	 * Launch the application.
	 */
	public void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KanArayanPage window = new KanArayanPage();
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
	public KanArayanPage() {
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
		
		JLabel HastaninBulunduguIl_Label = new JLabel("Hastan\u0131n Bulundu\u011Fu  \u0130l:");
		HastaninBulunduguIl_Label.setFont(new Font("Dialog", Font.PLAIN, 12));
		HastaninBulunduguIl_Label.setBounds(36, 102, 172, 29);
		frame.getContentPane().add(HastaninBulunduguIl_Label);
		
		JComboBox<String> HastaninBulunduguIl_List = new JComboBox<>();
		HastaninBulunduguIl_List.setBounds(270, 107, 130, 20);
		HastaninBulunduguIl_List.addItem("Ankara");
		frame.getContentPane().add(HastaninBulunduguIl_List);
		
		JLabel HastaninBulunduguIlce_Label = new JLabel("Hastan\u0131n Bulundu\u011Fu \u0130l\u00E7e:");
		HastaninBulunduguIlce_Label.setFont(new Font("Dialog", Font.PLAIN, 12));
		HastaninBulunduguIlce_Label.setBounds(36, 128, 172, 29);
		frame.getContentPane().add(HastaninBulunduguIlce_Label);
		
		JComboBox<String> HastaninBulunduguIlce_List = new JComboBox<>();
		HastaninBulunduguIlce_List.setBounds(270, 133, 130, 20);
		HastaninBulunduguIlce_List.addItem("Akyurt");
		HastaninBulunduguIlce_List.addItem("Alt�nda�");
		HastaninBulunduguIlce_List.addItem("Aya�");
		HastaninBulunduguIlce_List.addItem("Bala");
		HastaninBulunduguIlce_List.addItem("Beypazar�");
		HastaninBulunduguIlce_List.addItem("�aml�dere");
		HastaninBulunduguIlce_List.addItem("�ankaya");
		HastaninBulunduguIlce_List.addItem("�ubuk");
		HastaninBulunduguIlce_List.addItem("Elmada�");
		HastaninBulunduguIlce_List.addItem("Etimesgut");
		HastaninBulunduguIlce_List.addItem("Evren");
		HastaninBulunduguIlce_List.addItem("G�lba��");
		HastaninBulunduguIlce_List.addItem("G�d�l");
		HastaninBulunduguIlce_List.addItem("Haymana");
		HastaninBulunduguIlce_List.addItem("KahramanKazan");
		HastaninBulunduguIlce_List.addItem("Kalecik");
		HastaninBulunduguIlce_List.addItem("Ke�i�ren");
		HastaninBulunduguIlce_List.addItem("K�z�lcahamam");
		HastaninBulunduguIlce_List.addItem("Mamak");
		HastaninBulunduguIlce_List.addItem("Nall�han");
		HastaninBulunduguIlce_List.addItem("Polatl�");
		HastaninBulunduguIlce_List.addItem("Pursaklar");
		HastaninBulunduguIlce_List.addItem("Sincan");
		HastaninBulunduguIlce_List.addItem("�erefliko�hisar");
		HastaninBulunduguIlce_List.addItem("Yenimahalle");
		frame.getContentPane().add(HastaninBulunduguIlce_List);
		
		JComboBox<String> ArananKanGrubu_List = new JComboBox<String>();
		ArananKanGrubu_List.setBounds(270, 83, 130, 20);
		ArananKanGrubu_List.addItem("0Rh+");
		ArananKanGrubu_List.addItem("0Rh-");
		ArananKanGrubu_List.addItem("ARh+");
		ArananKanGrubu_List.addItem("ARh-");
		ArananKanGrubu_List.addItem("BRh+");
		ArananKanGrubu_List.addItem("BRh-");
		ArananKanGrubu_List.addItem("ABRh+");
		ArananKanGrubu_List.addItem("ABRh-");


		frame.getContentPane().add(ArananKanGrubu_List);
		
		JButton KanAra_Button = new JButton("Kan Ara");
		KanAra_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			String bloodType = ArananKanGrubu_List.getSelectedItem().toString();
			String city = HastaninBulunduguIl_List.getSelectedItem().toString();
			String town = HastaninBulunduguIlce_List.getSelectedItem().toString();
			String hospitalName=HastaneninAd�.getSelectedItem().toString();
			
			System.out.println(bloodType);
			// Yukar�daki 3 bilgiye g�re Kan Verici tablosuna query g�nderilecek
			
			// Gelen Bilgiler yeni bir ekran �zerinde g�sterilecek.
			//frame.dispose();
			KanArayan test = new KanArayan();
			try {
				 ArrayList <String> result =new ArrayList <String>();
				 System.out.println(result.toString());
				      test.Search(bloodType,hospitalName);
			
				 
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		});
		KanAra_Button.setBounds(294, 228, 130, 23);
		frame.getContentPane().add(KanAra_Button);
		
		JLabel Ad_Label = new JLabel("Ad:");
		Ad_Label.setBounds(36, 11, 46, 14);
		frame.getContentPane().add(Ad_Label);
		
		Ad_textField = new JTextField();
		Ad_textField.setBounds(270, 8, 130, 20);
		frame.getContentPane().add(Ad_textField);
		Ad_textField.setColumns(10);
		
		JLabel Soyad_Label = new JLabel("Soyad:");
		Soyad_Label.setBounds(36, 36, 46, 14);
		frame.getContentPane().add(Soyad_Label);
		
		Soyad_textField = new JTextField();
		Soyad_textField.setBounds(270, 33, 130, 20);
		frame.getContentPane().add(Soyad_textField);
		Soyad_textField.setColumns(10);
		
		JLabel TelNo_Label = new JLabel("Telefon Numaras\u0131:");
		TelNo_Label.setBounds(36, 61, 95, 14);
		frame.getContentPane().add(TelNo_Label);
		
		TelNo_textField = new JTextField();
		TelNo_textField.setBounds(270, 58, 130, 20);
		frame.getContentPane().add(TelNo_textField);
		TelNo_textField.setColumns(10);
		
		JLabel ArananKanGrubu_Label = new JLabel("Aranan Kan Grubu:");
		ArananKanGrubu_Label.setBounds(36, 86, 95, 14);
		frame.getContentPane().add(ArananKanGrubu_Label);
		
		
		
		JButton Geri_Button = new JButton("Geri");
		Geri_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ApplicationPage appPage = new ApplicationPage();
				appPage.newScreen();
				frame.dispose();
			}
		});
		Geri_Button.setBounds(12, 235, 85, 25);
		frame.getContentPane().add(Geri_Button);
		
		JLabel lblHastaneninAd = new JLabel("Hastan\u0131n Bulundu\u011Fu Hastanenin Ad\u0131:");
		lblHastaneninAd.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblHastaneninAd.setBounds(36, 157, 224, 29);
		frame.getContentPane().add(lblHastaneninAd);
		
		 HastaneninAd� = new JComboBox<String>();
		HastaneninAd�.setBounds(12, 197, 412, 20);
		frame.getContentPane().add(HastaneninAd�);
		HastaneninAd�.addItem("Hastane kalm�yoruz.");
		HastaneninAd�.addItem("AKYURT DEVLET HASTANES�");
		HastaneninAd�.addItem("ANKARA E��T�M VE ARA�TIRMA HASTANES�");
		HastaneninAd�.addItem("ANKARA NUMUNE E��T�M VE ARA�TIRMA HASTANES�");
		HastaneninAd�.addItem("ANKARA ULUS DEVLET HASTANES�");
		HastaneninAd�.addItem("DI�KAPI YILDIRIM BEYAZIT E��T�M VE ARA�TIRMA HASTANES�");
		HastaneninAd�.addItem("BEYPAZARI DEVLET HASTANES�");
		HastaneninAd�.addItem("ANKARA 29 MAYIS DEVLET HASTANES�");
		HastaneninAd�.addItem("T�RK�YE Y�KSEK �HT�SAS E��T�M VE ARA�TIRMA HASTANES�");
		HastaneninAd�.addItem("BEYTEPE MURAT ERD� EKER DEVLET HASTANES�");
		HastaneninAd�.addItem("HAL�L �IVGIN �UBUK DEVLET HASTANES�");
		HastaneninAd�.addItem("DR. HULUS� ALATA� ELMADA� DEVLET HASTANES�");
		HastaneninAd�.addItem("ET�MESGUT SA�T ERT�RK DEVLET HASTANES�");
		HastaneninAd�.addItem("G�LBA�I HASVAK DEVLET HASTANES�");
		HastaneninAd�.addItem("HAYMANA DEVLET HASTANES�");
		HastaneninAd�.addItem("KALEC�K DEVLET HASTANES�");
		HastaneninAd�.addItem("HAMD� ER�� KAZAN DEVLET HASTANES�");
		HastaneninAd�.addItem("ANKARA MESLEK HASTALIKLARI HASTANES�");
		HastaneninAd�.addItem("KE���REN E��T�M ARA�TIRMA HASTANES�");
		HastaneninAd�.addItem("ANKARA G�LHANE E��T�M VE ARA�TIRMA HASTANES�");
		HastaneninAd�.addItem("Ulus Devlet Hastanesi");
		HastaneninAd�.addItem("KIZILCAHAMAM DEVLET HASTANES�");
		HastaneninAd�.addItem("NALLIHAN DEVLET HASTANES�");
		HastaneninAd�.addItem("POLATLI DEVLET HASTANES�");
		HastaneninAd�.addItem("�EREFL�KO�H�SAR DEVLET HASTANES�");
		HastaneninAd�.addItem("DR. NAF�Z K�REZ S�NCAN DEVLET HASTANES�");
		HastaneninAd�.addItem("ANKARA GAZ� MUSTAFA KEMAL DEVLET HASTANES�");
		HastaneninAd�.addItem("YEN�MAHALLE E��T�M VE ARA�TIRMA HASTANES�");

	}
	
	private Object makeObj(final String item)  {
	     return new Object() { public String toString() { return item; } };
	   }
}
