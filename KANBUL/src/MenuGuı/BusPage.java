package MenuGuý;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import sqlTable.KanVerici;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class BusPage {

	private JFrame frame;
	private JTextField KizilayOtobusAdi_textField;
	private JTextField Plaka_textField;
	private JTextField UniteSayisi_textField;
	private JTextField OtobusunBulunduguAdres_textField;
	JRadioButton ZeroPos_RadioButton;
	JRadioButton ZeroNeg_RadioButton;
	JRadioButton APos_RadioButton;
	JRadioButton ANeg_RadioButton;
	JRadioButton BPos_RadioButton;
	JRadioButton BNeg_RadioButton;
	JRadioButton ABPos_RadioButton;
	JRadioButton ABNeg_RadioButton;
	JComboBox<String> OtobusunBulunduguIlce_List;
	JComboBox<String> OtobusunBulunduguIl_List;
	public static String otobusEmail="";
	private JLabel lblNewLabel;
	private JLabel ayýnOtobüsAdý_label;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel ayýnOtobüsüPlaka_Label;
	private JLabel ayinOtobüsililçe_Label;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public void busMemberScreen(String kullaniciAdi,ArrayList<String> kullaniciPage) { // Uye ile ilgili spesifik bilgiler ekrana verilecek
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					BusPage window = new BusPage();
					otobusEmail = kullaniciAdi;
					
					window.KizilayOtobusAdi_textField.setText(kullaniciPage.get(0));
					window.OtobusunBulunduguIl_List.setSelectedItem(kullaniciPage.get(1));
					window.OtobusunBulunduguIlce_List.setSelectedItem(kullaniciPage.get(2));
					String bloodType = kullaniciPage.get(3);
					window.Plaka_textField.setText(kullaniciPage.get(4));
					window.UniteSayisi_textField.setText(kullaniciPage.get(5));
					window.OtobusunBulunduguAdres_textField.setText(kullaniciPage.get(6));
					
					
					if(bloodType.contains("0Rh+"))
						window.ZeroPos_RadioButton.setSelected(true);
					if(bloodType.contains("0Rh-"))
						window.ZeroNeg_RadioButton.setSelected(true);
					if(bloodType.contains("ARh+"))
						window.APos_RadioButton.setSelected(true);
					if(bloodType.contains("ARh-"))
						window.ANeg_RadioButton.setSelected(true);
					if(bloodType.contains("BRh+"))
						window.BPos_RadioButton.setSelected(true);
					if(bloodType.contains("BRh-"))
						window.BNeg_RadioButton.setSelected(true);
					if(bloodType.contains("ABRh+"))
						window.ABPos_RadioButton.setSelected(true);
					if(bloodType.contains("ABRh-"))
						window.ABNeg_RadioButton.setSelected(true);
					
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
	public BusPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\red_bus_logo.jpg"));
		frame.setBounds(100, 100, 924, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel KizilayOtobusuAdi_Label = new JLabel("K\u0131z\u0131lay Otob\u00FCs\u00FC Ad\u0131:");
		KizilayOtobusuAdi_Label.setBounds(49, 12, 113, 14);
		frame.getContentPane().add(KizilayOtobusuAdi_Label);
		
		JLabel Plaka_Label = new JLabel("Plaka:");
		Plaka_Label.setBounds(49, 37, 113, 14);
		frame.getContentPane().add(Plaka_Label);
		
		JLabel KanGrubu_Label = new JLabel("Kan Grubu :");
		KanGrubu_Label.setBounds(49, 123, 113, 14);
		frame.getContentPane().add(KanGrubu_Label);
		
		JLabel UniteSayisi_Label = new JLabel("\u00DCnite Say\u0131s\u0131 :");
		UniteSayisi_Label.setBounds(49, 181, 113, 14);
		frame.getContentPane().add(UniteSayisi_Label);
		
		JLabel OtobusunBulunduguIlIlce_Label = new JLabel("Otobüsün Bulunduðu Ýl/Ýlçe :");
		OtobusunBulunduguIlIlce_Label.setBounds(49, 63, 134, 14);
		frame.getContentPane().add(OtobusunBulunduguIlIlce_Label);
		
		JLabel OtobusunBulunduguAdres_Label = new JLabel("Otob\u00FCs\u00FCn Bulundu\u011Fu Adres :");
		OtobusunBulunduguAdres_Label.setBounds(49, 86, 156, 14);
		frame.getContentPane().add(OtobusunBulunduguAdres_Label);
		
		KizilayOtobusAdi_textField = new JTextField();
		KizilayOtobusAdi_textField.setBounds(197, 10, 113, 20);
		frame.getContentPane().add(KizilayOtobusAdi_textField);
		KizilayOtobusAdi_textField.setColumns(10);
		
		Plaka_textField = new JTextField();
		Plaka_textField.setBounds(197, 35, 113, 20);
		frame.getContentPane().add(Plaka_textField);
		Plaka_textField.setColumns(10);
		
		UniteSayisi_textField = new JTextField();
		UniteSayisi_textField.setBounds(197, 179, 113, 20);
		frame.getContentPane().add(UniteSayisi_textField);
		UniteSayisi_textField.setColumns(10);
		
		OtobusunBulunduguIl_List = new JComboBox<>();
		OtobusunBulunduguIl_List.setBounds(197, 60, 113, 20);
		OtobusunBulunduguIl_List.addItem("Ankara");
		frame.getContentPane().add(OtobusunBulunduguIl_List);
		
		OtobusunBulunduguIlce_List = new JComboBox<>();
		OtobusunBulunduguIlce_List.setBounds(322, 60, 113, 20);
		OtobusunBulunduguIlce_List.addItem("Akyurt");
		OtobusunBulunduguIlce_List.addItem("Altýndað");
		OtobusunBulunduguIlce_List.addItem("Ayaþ");
		OtobusunBulunduguIlce_List.addItem("Bala");
		OtobusunBulunduguIlce_List.addItem("Beypazarý");
		OtobusunBulunduguIlce_List.addItem("Çamlýdere");
		OtobusunBulunduguIlce_List.addItem("Çankaya");
		OtobusunBulunduguIlce_List.addItem("Çubuk");
		OtobusunBulunduguIlce_List.addItem("Elmadað");
		OtobusunBulunduguIlce_List.addItem("Etimesgut");
		OtobusunBulunduguIlce_List.addItem("Evren");
		OtobusunBulunduguIlce_List.addItem("Gölbaþý");
		OtobusunBulunduguIlce_List.addItem("Güdül");
		OtobusunBulunduguIlce_List.addItem("Haymana");
		OtobusunBulunduguIlce_List.addItem("KahramanKazan");
		OtobusunBulunduguIlce_List.addItem("Kalecik");
		OtobusunBulunduguIlce_List.addItem("Keçiören");
		OtobusunBulunduguIlce_List.addItem("Kýzýlcahamam");
		OtobusunBulunduguIlce_List.addItem("Mamak");
		OtobusunBulunduguIlce_List.addItem("Nallýhan");
		OtobusunBulunduguIlce_List.addItem("Polatlý");
		OtobusunBulunduguIlce_List.addItem("Pursaklar");
		OtobusunBulunduguIlce_List.addItem("Sincan");
		OtobusunBulunduguIlce_List.addItem("Þereflikoçhisar");
		OtobusunBulunduguIlce_List.addItem("Yenimahalle");
		frame.getContentPane().add(OtobusunBulunduguIlce_List);
		
		OtobusunBulunduguAdres_textField = new JTextField();
		OtobusunBulunduguAdres_textField.setBounds(197, 84, 112, 20);
		frame.getContentPane().add(OtobusunBulunduguAdres_textField);
		OtobusunBulunduguAdres_textField.setColumns(10);
		
		JButton Geri_Button = new JButton("Geri");
		Geri_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DonorPage donorPage = new DonorPage();
				donorPage.newScreen();
				frame.dispose();
			}
		});
		Geri_Button.setBounds(49, 243, 83, 25);
		frame.getContentPane().add(Geri_Button);
		
		ZeroPos_RadioButton = new JRadioButton("0Rh+");
		ZeroPos_RadioButton.setBounds(197, 119, 62, 23);
		frame.getContentPane().add(ZeroPos_RadioButton);
		
		ZeroNeg_RadioButton = new JRadioButton("0Rh-");
		ZeroNeg_RadioButton.setBounds(269, 119, 62, 23);
		frame.getContentPane().add(ZeroNeg_RadioButton);
		
		APos_RadioButton = new JRadioButton("ARh+");
		APos_RadioButton.setBounds(344, 119, 62, 23);
		frame.getContentPane().add(APos_RadioButton);
		
		ANeg_RadioButton = new JRadioButton("ARh-");
		ANeg_RadioButton.setBounds(49, 145, 62, 23);
		frame.getContentPane().add(ANeg_RadioButton);
		
		BPos_RadioButton = new JRadioButton("BRh+");
		BPos_RadioButton.setBounds(121, 145, 62, 23);
		frame.getContentPane().add(BPos_RadioButton);
		
		 BNeg_RadioButton = new JRadioButton("BRh-");
		BNeg_RadioButton.setBounds(197, 146, 62, 23);
		frame.getContentPane().add(BNeg_RadioButton);
		
		 ABPos_RadioButton = new JRadioButton("ABRh+");
		ABPos_RadioButton.setBounds(269, 146, 70, 23);
		frame.getContentPane().add(ABPos_RadioButton);
		
		 ABNeg_RadioButton = new JRadioButton("ABRh-");
		ABNeg_RadioButton.setBounds(344, 145, 70, 23);
		frame.getContentPane().add(ABNeg_RadioButton);
		
		JButton Kaydet_Button = new JButton("Deðiþtir/Kaydet");
		Kaydet_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				int flagNum = 2;
				//int telephone
				//String email
				String fname = KizilayOtobusAdi_textField.getText().toString();
				// mname
				//String userPassword = HastaneSifreEkle_textField.toString();
				// sex
				// age
				String city = OtobusunBulunduguIl_List.getSelectedItem().toString();
				String town = OtobusunBulunduguIlce_List.getSelectedItem().toString();
				// report
				String bloodType="";
				if(ZeroPos_RadioButton.isSelected()) bloodType += "0Rh+ ";  
				if(ZeroNeg_RadioButton.isSelected()) bloodType += "0Rh- ";  
				if(APos_RadioButton.isSelected()) bloodType += "ARh+ ";  
				if(ANeg_RadioButton.isSelected()) bloodType += "ARh- ";  
				if(BPos_RadioButton.isSelected()) bloodType += "BRh+ ";  
				if(BNeg_RadioButton.isSelected()) bloodType += "BRh- ";  
				if(ABPos_RadioButton.isSelected()) bloodType += "ABRh+ ";  
				if(ABNeg_RadioButton.isSelected()) bloodType += "ABRh- ";	
				String plaka = Plaka_textField.getText().toString();
				String bloodTypeNum = UniteSayisi_textField.getText().toString();
				
				String address = OtobusunBulunduguAdres_textField.getText().toString();
				
				// Bilgiler UPDATE edilecek veritabanýnda
				
				 try {
						Update(otobusEmail,city, town, bloodType,plaka, bloodTypeNum,address);
						otobusEmail="";
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		Kaydet_Button.setBounds(296, 244, 139, 23);
		frame.getContentPane().add(Kaydet_Button);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\otobus.png"));
		lblNewLabel.setBounds(674, 12, 139, 92);
		frame.getContentPane().add(lblNewLabel);
		
		ayýnOtobüsAdý_label = new JLabel("K\u0131z\u0131lay Otob\u00FCs\u00FC Ad\u0131:");
		ayýnOtobüsAdý_label.setBounds(603, 149, 113, 14);
		frame.getContentPane().add(ayýnOtobüsAdý_label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(749, 146, 149, 20);
		frame.getContentPane().add(textField);
		
		lblNewLabel_1 = new JLabel("En \u00C7ok Kan Toplayan Otob\u00FCs");
		lblNewLabel_1.setBounds(664, 119, 199, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(748, 178, 150, 20);
		frame.getContentPane().add(textField_1);
		
		ayýnOtobüsüPlaka_Label = new JLabel("Plaka:");
		ayýnOtobüsüPlaka_Label.setBounds(603, 181, 113, 14);
		frame.getContentPane().add(ayýnOtobüsüPlaka_Label);
		
		ayinOtobüsililçe_Label = new JLabel("Otob\u00FCs\u00FCn Bulundu\u011Fu \u0130l/\u0130l\u00E7e :");
		ayinOtobüsililçe_Label.setBounds(603, 221, 156, 14);
		frame.getContentPane().add(ayinOtobüsililçe_Label);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(748, 218, 150, 20);
		frame.getContentPane().add(textField_2);
		}
	
		public void Update (String Email,String city,String town,String bloodtype,String plate,String bloodtypenum,String address) throws SQLException {
			KanVerici otobus = new KanVerici ();
			otobus.UpdateBus(Email,city, town, bloodtype,plate, bloodtypenum,address);
		}
	}
