package MenuGuý;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import sqlTable.Kýzýlay;

import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

import sqlTable.Kýzýlay;


public class OtobusEklePage {
	public Kýzýlay otobus = new Kýzýlay();
	private JFrame frame;
	private JTextField Ad_textField;
	private JLabel Telefon_Label;
	private JTextField Telefon_textField;
	private JLabel Email_Label;
	private JTextField Email_textField;
	private JLabel Sifre_Label;
	private JTextField Sifre_textField;
	private JLabel IlIlce_Label;
	private JLabel Adres_Label;
	private JTextField Adres_textField;
	private JLabel Plaka_Label;
	private JTextField Plaka_textField;
	private JButton Kaydet_NewButton;
	private JButton Geri_Button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OtobusEklePage window = new OtobusEklePage();
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
					OtobusEklePage window = new OtobusEklePage();
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
	public OtobusEklePage() {
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
		
		JLabel Ad_Label = new JLabel("Ad:");
		Ad_Label.setBounds(27, 24, 89, 21);
		frame.getContentPane().add(Ad_Label);
		
		Ad_textField = new JTextField();
		Ad_textField.setBounds(135, 24, 120, 21);
		frame.getContentPane().add(Ad_textField);
		Ad_textField.setColumns(10);
		
		Telefon_Label = new JLabel("Telefon:");
		Telefon_Label.setBounds(27, 51, 89, 21);
		frame.getContentPane().add(Telefon_Label);
		
		Telefon_textField = new JTextField();
		Telefon_textField.setColumns(10);
		Telefon_textField.setBounds(135, 51, 120, 21);
		frame.getContentPane().add(Telefon_textField);
		
		Email_Label = new JLabel("E-mail:");
		Email_Label.setBounds(27, 78, 89, 21);
		frame.getContentPane().add(Email_Label);
		
		Email_textField = new JTextField();
		Email_textField.setColumns(10);
		Email_textField.setBounds(135, 78, 120, 21);
		frame.getContentPane().add(Email_textField);
		
		Sifre_Label = new JLabel("\u015Eifre:");
		Sifre_Label.setBounds(27, 105, 89, 21);
		frame.getContentPane().add(Sifre_Label);
		
		Sifre_textField = new JTextField();
		Sifre_textField.setColumns(10);
		Sifre_textField.setBounds(135, 105, 120, 21);
		frame.getContentPane().add(Sifre_textField);
		
		IlIlce_Label = new JLabel("\u0130l/\u0130l\u00E7e:");
		IlIlce_Label.setBounds(27, 131, 89, 21);
		frame.getContentPane().add(IlIlce_Label);
		
		Adres_Label = new JLabel("Adres:");
		Adres_Label.setBounds(27, 161, 89, 21);
		frame.getContentPane().add(Adres_Label);
		
		Adres_textField = new JTextField();
		Adres_textField.setColumns(10);
		Adres_textField.setBounds(135, 161, 120, 21);
		frame.getContentPane().add(Adres_textField);
		
		Plaka_Label = new JLabel("Plaka:");
		Plaka_Label.setBounds(27, 188, 89, 21);
		frame.getContentPane().add(Plaka_Label);
		
		JComboBox<String> Il_List = new JComboBox<>();
		Il_List.setBounds(135, 131, 120, 20);
		Il_List.addItem("Ankara");
		frame.getContentPane().add(Il_List);
		
		JComboBox<String> Ilce_List = new JComboBox<>();
		Ilce_List.setBounds(265, 131, 120, 20);
		Ilce_List.addItem("Akyurt");
		Ilce_List.addItem("Altýndað");
		Ilce_List.addItem("Ayaþ");
		Ilce_List.addItem("Bala");
		Ilce_List.addItem("Beypazarý");
		Ilce_List.addItem("Çamlýdere");
		Ilce_List.addItem("Çankaya");
		Ilce_List.addItem("Çubuk");
		Ilce_List.addItem("Elmadað");
		Ilce_List.addItem("Etimesgut");
		Ilce_List.addItem("Evren");
		Ilce_List.addItem("Gölbaþý");
		Ilce_List.addItem("Güdül");
		Ilce_List.addItem("Haymana");
		Ilce_List.addItem("KahramanKazan");
		Ilce_List.addItem("Kalecik");
		Ilce_List.addItem("Keçiören");
		Ilce_List.addItem("Kýzýlcahamam");
		Ilce_List.addItem("Mamak");
		Ilce_List.addItem("Nallýhan");
		Ilce_List.addItem("Polatlý");
		Ilce_List.addItem("Pursaklar");
		Ilce_List.addItem("Sincan");
		Ilce_List.addItem("Þereflikoçhisar");
		Ilce_List.addItem("Yenimahalle");
		frame.getContentPane().add(Ilce_List);
		
		Plaka_textField = new JTextField();
		Plaka_textField.setColumns(10);
		Plaka_textField.setBounds(135, 188, 120, 21);
		frame.getContentPane().add(Plaka_textField);
		
		Kaydet_NewButton = new JButton("Kaydet");
		Kaydet_NewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int flagNum = 3;
				String telephone = Telefon_textField.getText().toString();
				String email =Email_textField.getText().toString();
				String fname = Ad_textField.getText().toString();
				// mname
				String userPassword = Sifre_textField.getText().toString();
				// sex
				// age
				String city = Il_List.getSelectedItem().toString();
				String town = Ilce_List.getSelectedItem().toString();
				// report
				//String bloodType="";
				//if(ZeroPos_RadioButton.isSelected()) bloodType += "0Rh+ ";  
				//if(ZeroNeg_RadioButton.isSelected()) bloodType += "0Rh- ";  
				//if(APos_RadioButton.isSelected()) bloodType += "ARh+ ";  
				//if(ANeg_RadioButton.isSelected()) bloodType += "ARh- ";  
				//if(BPos_RadioButton.isSelected()) bloodType += "BRh+ ";  
				//if(BNeg_RadioButton.isSelected()) bloodType += "BRh- ";  
				//if(ABPos_RadioButton.isSelected()) bloodType += "ABRh+ ";  
				//if(ABNeg_RadioButton.isSelected()) bloodType += "ABRh- ";  
				String  plaka = Plaka_textField.getText().toString();
				//String bloodTypeNum = UniteSayisi_textField.toString();
				String address = Adres_textField.getText().toString();
				
				// KanVERÝCÝ tablosuna INSERT edilecek.
				// frame.dispose();
				
				try {
					Insert(telephone,email,fname,userPassword,
					   		  null,town,city,null, address, plaka);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   		  
			}
		});
		Kaydet_NewButton.setBounds(283, 228, 105, 23);
		frame.getContentPane().add(Kaydet_NewButton);
		
		Geri_Button = new JButton("Geri");
		Geri_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KizilayPage kizilayPage = new KizilayPage();
				kizilayPage.backScreen();
				frame.dispose();
			}
		});
		Geri_Button.setBounds(27, 228, 79, 23);
		frame.getContentPane().add(Geri_Button);
		
		
	}
	public void Insert( String telephone,String email,String fname,String pass,
	   		   String bloodType,String town,String city,String bloodTypeNum,String address,String plate) throws SQLException {
			   otobus = new Kýzýlay(fname,telephone,pass,town,city,plate,address,email,bloodType, bloodTypeNum);
}
}
