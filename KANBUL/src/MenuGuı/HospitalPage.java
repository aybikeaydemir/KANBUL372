package MenuGuý;

import java.awt.EventQueue;
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

public class HospitalPage {

	private JFrame frame;
	private JLabel UniteSayisi_Label;
	private JTextField UniteSayisi_textField;
	private JTextField HastaneAdi_textField;
	public static String  hastaneEmail="";
	JRadioButton ZeroPos_radioButton;
	JRadioButton ZeroNeg_radioButton;
	JRadioButton APos_radioButton;
	JRadioButton ANeg_radioButton;
	JRadioButton BPos_radioButton;
	JRadioButton BNeg_radioButton;
	JRadioButton ABPos_radioButton;
	JRadioButton ABNeg_radioButton;

	/**
	 * Launch the application.
	 */
	public void hospitalMemberScreen(String kullaniciAdi,ArrayList<String> kullaniciPage) {  
		EventQueue.invokeLater(new Runnable() {				
			public void run() {
				try {
					hastaneEmail = kullaniciAdi;
					HospitalPage window = new HospitalPage();
					window.HastaneAdi_textField.setText(kullaniciPage.get(0));
					window.UniteSayisi_textField.setText(kullaniciPage.get(2));
					String bloodType = kullaniciPage.get(1);
					
					if(bloodType.contains("0Rh+"))
						window.ZeroPos_radioButton.setSelected(true);
					if(bloodType.contains("0Rh-"))
						window.ZeroNeg_radioButton.setSelected(true);
					if(bloodType.contains("ARh+"))
						window.APos_radioButton.setSelected(true);
					if(bloodType.contains("ARh-"))
						window.ANeg_radioButton.setSelected(true);
					if(bloodType.contains("BRh+"))
						window.BPos_radioButton.setSelected(true);
					if(bloodType.contains("BRh-"))
						window.BNeg_radioButton.setSelected(true);
					if(bloodType.contains("ABRh+"))
						window.ABPos_radioButton.setSelected(true);
					if(bloodType.contains("ABRh-"))
						window.ABNeg_radioButton.setSelected(true);
			
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
	public HospitalPage() {
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
		
		JLabel HastanedeBulunaKanGruplari_Label = new JLabel("Hastanede Bulunan Kan Gruplar\u0131:");
		HastanedeBulunaKanGruplari_Label.setBounds(40, 57, 182, 14);
		frame.getContentPane().add(HastanedeBulunaKanGruplari_Label);
		
		UniteSayisi_Label = new JLabel("Ünite Sayýlarý:");
		UniteSayisi_Label.setBounds(40, 138, 97, 14);
		frame.getContentPane().add(UniteSayisi_Label);
		
		UniteSayisi_textField = new JTextField();
		UniteSayisi_textField.setBounds(147, 135, 130, 20);
		frame.getContentPane().add(UniteSayisi_textField);
		UniteSayisi_textField.setColumns(10);
		
		JLabel HastaneAdi_Label = new JLabel("Hastane Adý:");
		HastaneAdi_Label.setBounds(40, 30, 123, 15);
		frame.getContentPane().add(HastaneAdi_Label);
		
		HastaneAdi_textField = new JTextField();
		HastaneAdi_textField.setBounds(147, 27, 130, 19);
		frame.getContentPane().add(HastaneAdi_textField);
		HastaneAdi_textField.setColumns(10);
		
		ZeroPos_radioButton = new JRadioButton("0Rh+");
		ZeroPos_radioButton.setBounds(40, 79, 62, 23);
		frame.getContentPane().add(ZeroPos_radioButton);
		
		ZeroNeg_radioButton = new JRadioButton("0Rh-");
		ZeroNeg_radioButton.setBounds(118, 79, 62, 23);
		frame.getContentPane().add(ZeroNeg_radioButton);
		
		APos_radioButton = new JRadioButton("ARh+");
		APos_radioButton.setBounds(196, 79, 62, 23);
		frame.getContentPane().add(APos_radioButton);
		
		ANeg_radioButton = new JRadioButton("ARh-");
		ANeg_radioButton.setBounds(267, 79, 62, 23);
		frame.getContentPane().add(ANeg_radioButton);
		
		BPos_radioButton = new JRadioButton("BRh+");
		BPos_radioButton.setBounds(40, 105, 62, 23);
		frame.getContentPane().add(BPos_radioButton);
		
		BNeg_radioButton = new JRadioButton("BRh-");
		BNeg_radioButton.setBounds(118, 105, 62, 23);
		frame.getContentPane().add(BNeg_radioButton);
		
		ABPos_radioButton = new JRadioButton("ABRh+");
		ABPos_radioButton.setBounds(196, 105, 69, 23);
		frame.getContentPane().add(ABPos_radioButton);
		
		ABNeg_radioButton = new JRadioButton("ABRh-");
		ABNeg_radioButton.setBounds(267, 105, 62, 23);
		frame.getContentPane().add(ABNeg_radioButton);
		
		JButton Kaydet_Button = new JButton("Degistir/Kaydet");
		Kaydet_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int flagNum = 2;
				String fname = HastaneAdi_textField.getText().toString();
				String bloodType ="";				
				if(ZeroPos_radioButton.isSelected()) bloodType += "0Rh+ ";  
				if(ZeroNeg_radioButton.isSelected()) bloodType += "0Rh- ";  
				if(APos_radioButton.isSelected()) bloodType += "ARh+ ";  
				if(ANeg_radioButton.isSelected()) bloodType += "ARh- ";  
				if(BPos_radioButton.isSelected()) bloodType += "BRh+ ";  
				if(BNeg_radioButton.isSelected()) bloodType += "BRh- ";  
				if(ABPos_radioButton.isSelected()) bloodType += "ABRh+ ";  
				if(ABNeg_radioButton.isSelected()) bloodType += "ABRh- ";
				// plaka
				String bloodTypeNum = UniteSayisi_textField.getText().toString();
				//String address
				
				// Bilgiler UPDATE edilecek veritabanýnda
				//frame.dispose();
				 try {
					Update(hastaneEmail,bloodType,bloodTypeNum);
					 hastaneEmail="";
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				}
		});
		Kaydet_Button.setBounds(274, 222, 139, 23);
		frame.getContentPane().add(Kaydet_Button);
		
		JButton btnGeri = new JButton("Geri");
		btnGeri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DonorPage donorPage = new DonorPage();
				donorPage.newScreen();
				frame.dispose();
			}
		});
		btnGeri.setBounds(27, 221, 89, 25);
		frame.getContentPane().add(btnGeri);
		
		
	}
	public void Update (String hastaneEmail ,String bloodType,String bloodTypeNum) throws SQLException {
		KanVerici hastane = new KanVerici ();
		hastane.UpdateHospital(hastaneEmail, bloodType, bloodTypeNum);
	}
}