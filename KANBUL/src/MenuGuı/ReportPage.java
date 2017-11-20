package MenuGuý;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Panel;

public class ReportPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReportPage window = new ReportPage();
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
	public ReportPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 751, 809);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("KAN BA\u011EI\u015E\u00C7ISI SORGULAMA FORMU ");
		lblNewLabel.setBounds(164, 4, 326, 30);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel NewLabel_1 = new JLabel("1-Kendinizi sa\u011Fl\u0131kl\u0131 ve iyi hissediyor musunuz?");
		NewLabel_1.setBounds(8, 31, 448, 11);
		NewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_2 = new JLabel("2-Daha \u00F6nce yapt\u0131\u011F\u0131n\u0131z bir kan ba\u011F\u0131\u015F\u0131 m\u00FCracaat\u0131 herhangi bir nedenle geri \u00E7evrildi mi?");
		NewLabel_2.setBounds(8, 50, 448, 11);
		NewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_3 = new JLabel("3-Prostat b\u00FCy\u00FCmesi, sivilce, sedef hastal\u0131\u011F\u0131 veya kellik i\u00E7in herhangi bir ila\u00E7 kullan\u0131yor?");
		NewLabel_3.setBounds(8, 69, 448, 11);
		NewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_4 = new JLabel("4-Herhangi bir enfeksiyon hastal\u0131\u011F\u0131 i\u00E7in ila\u00E7 (Antibiyotik, Ate\u015F d\u00FC\u015F\u00FCr\u00FCc\u00FC gibi) ald\u0131n\u0131z m\u0131?");
		NewLabel_4.setBounds(8, 88, 448, 11);
		NewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_5 = new JLabel("5-Son 5 g\u00FCn i\u00E7inde aspirin, herhangi bir a\u011Fr\u0131 kesici veya romatizma ilac\u0131 ald\u0131n\u0131z m\u0131?");
		NewLabel_5.setBounds(8, 107, 448, 14);
		NewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_6 = new JLabel("6-Allerjik reaksiyon ge\u00E7irdiniz mi, buna y\u00F6nelik tedavi ald\u0131n\u0131z m\u0131?");
		NewLabel_6.setBounds(8, 129, 448, 14);
		NewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_7 = new JLabel("7-Son 12 ay i\u00E7inde di\u015F tedavisi oldunuz mu?");
		NewLabel_7.setBounds(8, 151, 448, 11);
		NewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_8 = new JLabel("8-Son 1 hafta i\u00E7inde ishal (Diare) oldunuz mu?");
		NewLabel_8.setBounds(8, 170, 448, 11);
		NewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_9 = new JLabel("9-Son 1 ay i\u00E7inde herhangi bir a\u015F\u0131 oldunuz mu?");
		NewLabel_9.setBounds(8, 189, 448, 11);
		NewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_10 = new JLabel("10-Kad\u0131nlar i\u00E7in;  hamilelik ge\u00E7irdiniz mi veya \u015Fuan hamile misiniz?(Erkekler bu kutuyu bo\u015F b\u0131rakacakt\u0131r)");
		NewLabel_10.setBounds(8, 208, 502, 14);
		NewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_11 = new JLabel("11-Kronik (M\u00FCzmin) bir hastal\u0131\u011F\u0131n\u0131z var m\u0131?");
		NewLabel_11.setBounds(8, 230, 448, 11);
		NewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_12 = new JLabel("12-Frengi (Sifiliz) veya bel so\u011Fuklu\u011Fu (Gonore) nedeni ile tedavi oldunuz mu?");
		NewLabel_12.setBounds(8, 249, 448, 11);
		NewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_13 = new JLabel("13-AIDS hastal\u0131\u011F\u0131n\u0131z var m\u0131, kendiniz de b\u00F6yle bir hastal\u0131k oldu\u011Funa dair bir \u015F\u00FCpheniz var?");
		NewLabel_13.setBounds(8, 268, 448, 11);
		NewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_14 = new JLabel("14-AIDS hastas\u0131 oldu\u011Funu bildi\u011Finiz biri ile cinsel ili\u015Fkiniz oldu mu?");
		NewLabel_14.setBounds(8, 287, 448, 11);
		NewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_15 = new JLabel("15-Kan ve kan \u00FCr\u00FCn\u00FC alan, diyalize giren veya hemofili hastas\u0131 biri ile cinsel ili\u015Fkiniz oldu?");
		NewLabel_15.setBounds(8, 306, 448, 14);
		NewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_16 = new JLabel("16-Hi\u00E7 uyu\u015Fturucu kulland\u0131n\u0131z m\u0131?");
		NewLabel_16.setBounds(8, 328, 448, 11);
		NewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_17 = new JLabel("17-\u0130ns\u00FClin, b\u00FCy\u00FCme hormonu, imm\u00FCnglobulin, tamoksifen kulland\u0131n\u0131z m\u0131?");
		NewLabel_17.setBounds(8, 347, 448, 14);
		NewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_18 = new JLabel("18-Son 12 ay i\u00E7inde ameliyat veya endoskopik muayene oldunuz mu?");
		NewLabel_18.setBounds(8, 369, 448, 11);
		NewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_19 = new JLabel("19-Kalp-damar, akci\u011Fer, mide \u2013 ba\u011F\u0131rsak, b\u00F6brek hastal\u0131\u011F\u0131n\u0131z var m\u0131?");
		NewLabel_19.setBounds(8, 388, 448, 14);
		NewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_20 = new JLabel("20-Bug\u00FCne kadar hi\u00E7 n\u00F6bet, sara (Epilepsi) krizi veya fel\u00E7 ge\u00E7irdiniz mi?");
		NewLabel_20.setBounds(8, 410, 448, 11);
		NewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_21 = new JLabel("21-Bug\u00FCne kadar hi\u00E7 kanser tan\u0131s\u0131 ald\u0131n\u0131z m\u0131, kanser tedavisi g\u00F6rd\u00FCn\u00FCz m\u00FC?");
		NewLabel_21.setBounds(8, 429, 448, 11);
		NewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_22 = new JLabel("22-\u015Eeker hastal\u0131\u011F\u0131n\u0131z ya da yayg\u0131n romatizmal bir hastal\u0131\u011F\u0131n\u0131z var m\u0131?");
		NewLabel_22.setBounds(8, 448, 448, 11);
		NewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_23 = new JLabel("23-Kanamal\u0131 bir hastal\u0131k veya kan hastal\u0131\u011F\u0131n\u0131z var m\u0131?");
		NewLabel_23.setBounds(8, 467, 448, 14);
		NewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_24 = new JLabel("24-S\u0131tma (malarya), Verem (t\u00FCberk\u00FCloz), Malta hummas\u0131 (peynir hastal\u0131\u011F\u0131, brucella),");
		NewLabel_24.setBounds(8, 489, 448, 11);
		NewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblNewLabel_5 = new JLabel("Kemik iltihab\u0131 (osteomyelit) veya Kara humma (kala\u2013azar) ge\u00E7irdiniz mi?");
		lblNewLabel_5.setBounds(8, 508, 448, 11);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_25 = new JLabel("25-Hepatit (Sar\u0131l\u0131k) olan biriyle ayn\u0131 evde ya\u015F\u0131yor musunuz veya cinsel ili\u015Fkiniz oldu mu?");
		NewLabel_25.setBounds(8, 527, 448, 11);
		NewLabel_25.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_26 = new JLabel("26-Toksoplazma ge\u00E7irdiniz mi?");
		NewLabel_26.setBounds(8, 546, 448, 11);
		NewLabel_26.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_27 = new JLabel("27-Kamerun, Orta Afrika, \u00C7ad, Kongo, Ekvatoryal Gine, Gabon, Nijer ya da Nijerya\u2019da hi\u00E7 bulundunuz mu?");
		NewLabel_27.setBounds(8, 565, 513, 11);
		NewLabel_27.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_28 = new JLabel("28-Son 3 y\u0131l i\u00E7inde yukar\u0131daki \u00FClkeler d\u0131\u015F\u0131nda ba\u015Fka \u00FClkelerde bulundunuz mu?");
		NewLabel_28.setBounds(8, 584, 448, 14);
		NewLabel_28.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_29 = new JLabel("29-Ailenizde Deli Dana Hastal\u0131\u011F\u0131 (Creutzfeldt \u2013 Jacob Hastal\u0131\u011F\u0131) olan birisi oldu mu?");
		NewLabel_29.setBounds(8, 606, 448, 11);
		NewLabel_29.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_30 = new JLabel("30-Size dura mater (Beyin zar\u0131) veya kornea nakli yap\u0131ld\u0131 m\u0131?");
		NewLabel_30.setBounds(8, 625, 448, 11);
		NewLabel_30.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_31 = new JLabel("31-Son 12 ay i\u00E7inde size kan, doku veya organ nakli yap\u0131ld\u0131 m\u0131?");
		NewLabel_31.setBounds(8, 644, 448, 11);
		NewLabel_31.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_32 = new JLabel("32-Son 12 ay i\u00E7inde bir ba\u015Fkas\u0131n\u0131n kan\u0131 ile temas\u0131n\u0131z oldu mu?");
		NewLabel_32.setBounds(8, 663, 448, 14);
		NewLabel_32.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_33 = new JLabel("33-Son 12 ay i\u00E7inde hayvan \u0131s\u0131r\u0131\u011F\u0131 nedeni ile kuduz a\u015F\u0131s\u0131 oldunuz mu?");
		NewLabel_33.setBounds(8, 685, 448, 14);
		NewLabel_33.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_34 = new JLabel("34-Son 12 ay i\u00E7inde akupunktur, botoks, d\u00F6vme, hacamat,");
		NewLabel_34.setBounds(8, 707, 448, 11);
		NewLabel_34.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_34d = new JLabel("tak\u0131 i\u00E7in cilt deldirme, sa\u00E7 ekimi veya estetik m\u00FCdahaleler yapt\u0131rd\u0131n\u0131z m\u0131?");
		NewLabel_34d.setBounds(8, 726, 448, 14);
		NewLabel_34d.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setBounds(540, 28, 80, 15);
		comboBox1.addItem("Evet");
		comboBox1.addItem("Hayýr");
		
		JComboBox comboBox2 = new JComboBox();
		comboBox2.setBounds(540, 46, 80, 15);
		comboBox2.addItem("Evet");
		comboBox2.addItem("Hayýr");
		
		JComboBox comboBox3 = new JComboBox();
		comboBox3.setBounds(540, 65, 80, 15);
		comboBox3.addItem("Evet");
		comboBox3.addItem("Hayýr");
		
		JComboBox comboBox4 = new JComboBox();
		comboBox4.setBounds(540, 84, 80, 15);
		comboBox4.addItem("Evet");
		comboBox4.addItem("Hayýr");
		
		JComboBox comboBox5 = new JComboBox();
		comboBox5.setBounds(540, 105, 80, 15);
		comboBox5.addItem("Evet");
		comboBox5.addItem("Hayýr");
		
		JComboBox comboBox6= new JComboBox();
		comboBox6.setBounds(540, 127, 80, 15);
		comboBox6.addItem("Evet");
		comboBox6.addItem("Hayýr");
		
		JComboBox comboBox7= new JComboBox();
		comboBox7.setBounds(540, 147, 80, 15);
		comboBox7.addItem("Evet");
		comboBox7.addItem("Hayýr");
		
		JComboBox comboBox8 = new JComboBox();
		comboBox8.setBounds(540, 166, 80, 15);
		comboBox8.addItem("Evet");
		comboBox8.addItem("Hayýr");
		
		JComboBox comboBox9 = new JComboBox();
		comboBox9.setBounds(540, 185, 80, 15);
		comboBox9.addItem("Evet");
		comboBox9.addItem("Hayýr");
		
		JComboBox comboBox10 = new JComboBox();
		comboBox10.setBounds(540, 206, 80, 15);
		comboBox10.addItem("Evet");
		comboBox10.addItem("Hayýr");
		
		JComboBox comboBox11 = new JComboBox();
		comboBox11.setBounds(540, 226, 80, 15);
		comboBox11.addItem("Evet");
		comboBox11.addItem("Hayýr");
		
		JComboBox comboBox12= new JComboBox();
		comboBox12.setBounds(540, 245, 80, 15);
		comboBox12.addItem("Evet");
		comboBox12.addItem("Hayýr");
		
		JComboBox comboBox13 = new JComboBox();
		comboBox13.setBounds(540, 264, 80, 15);
		comboBox13.addItem("Evet");
		comboBox13.addItem("Hayýr");
		
		JComboBox comboBox14 = new JComboBox();
		comboBox14.setBounds(540, 283, 80, 15);
		comboBox14.addItem("Evet");
		comboBox14.addItem("Hayýr");
		
		JComboBox comboBox15 = new JComboBox();
		comboBox15.setBounds(540, 304, 80, 15);
		comboBox15.addItem("Evet");
		comboBox15.addItem("Hayýr");
		
		JComboBox comboBox16 = new JComboBox();
		comboBox16.setBounds(540, 324, 80, 15);
		comboBox16.addItem("Evet");
		comboBox16.addItem("Hayýr");
		
		JComboBox comboBox17= new JComboBox();
		comboBox17.setBounds(540, 345, 80, 15);
		comboBox17.addItem("Evet");
		comboBox17.addItem("Hayýr");
		
		JComboBox comboBox18 = new JComboBox();
		comboBox18.setBounds(540, 365, 80, 15);
		comboBox18.addItem("Evet");
		comboBox18.addItem("Hayýr");
		
		JComboBox comboBox19 = new JComboBox();
		comboBox19.setBounds(540, 386, 80, 15);
		comboBox19.addItem("Evet");
		comboBox19.addItem("Hayýr");
		
		JComboBox comboBox20 = new JComboBox();
		comboBox20.setBounds(540, 406, 80, 15);
		comboBox20.addItem("Evet");
		comboBox20.addItem("Hayýr");
		
		JComboBox comboBox21 = new JComboBox();
		comboBox21.setBounds(540, 425, 80, 15);
		comboBox21.addItem("Evet");
		comboBox21.addItem("Hayýr");
		
		JComboBox comboBox22 = new JComboBox();
		comboBox22.setBounds(540, 444, 80, 15);
		comboBox22.addItem("Evet");
		comboBox22.addItem("Hayýr");
		
		JComboBox comboBox23 = new JComboBox();
		comboBox23.setBounds(540, 465, 80, 15);
		comboBox23.addItem("Evet");
		comboBox2.addItem("Hayýr");
		
		JComboBox comboBox24 = new JComboBox();
		comboBox24.setBounds(540, 485, 80, 15);
		comboBox24.addItem("Evet");
		comboBox24.addItem("Hayýr");
		
		JComboBox comboBox25 = new JComboBox();
		comboBox25.setBounds(540, 523, 80, 15);
		comboBox25.addItem("Evet");
		comboBox25.addItem("Hayýr");
		
		JComboBox comboBox26 = new JComboBox();
		comboBox26.setBounds(540, 542, 80, 15);
		comboBox26.addItem("Evet");
		comboBox26.addItem("Hayýr");
		
		JComboBox comboBox27 = new JComboBox();
		comboBox27.setBounds(540, 561, 80, 15);
		comboBox27.addItem("Evet");
		comboBox27.addItem("Hayýr");
		
		JComboBox comboBox28 = new JComboBox();
		comboBox28.setBounds(540, 582, 80, 15);
		comboBox28.addItem("Evet");
		comboBox28.addItem("Hayýr");
		
		JComboBox comboBox29 = new JComboBox();
		comboBox29.setBounds(540, 602, 80, 15);
		comboBox29.addItem("Evet");
		comboBox29.addItem("Hayýr");
		
		JComboBox comboBox30 = new JComboBox();
		comboBox30.setBounds(540, 621, 80, 15);
		comboBox30.addItem("Evet");
		comboBox30.addItem("Hayýr");
		
		JComboBox comboBox31 = new JComboBox();
		comboBox31.setBounds(540, 640, 80, 15);
		comboBox31.addItem("Evet");
		comboBox31.addItem("Hayýr");
		
		JComboBox comboBox32 = new JComboBox();
		comboBox32.setBounds(540, 661, 80, 15);
		comboBox32.addItem("Evet");
		comboBox32.addItem("Hayýr");
		
		JComboBox comboBox33 = new JComboBox();
		comboBox33.setBounds(540, 683, 80, 15);
		comboBox33.addItem("Evet");
		comboBox33.addItem("Hayýr");
		
		JComboBox comboBox34 = new JComboBox();
		comboBox34.setBounds(540, 704, 80, 15);
		comboBox34.addItem("Evet");
		comboBox34.addItem("Hayýr");
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(NewLabel_1);
		frame.getContentPane().add(NewLabel_2);
		frame.getContentPane().add(NewLabel_3);
		frame.getContentPane().add(NewLabel_4);
		frame.getContentPane().add(NewLabel_5);
		frame.getContentPane().add(NewLabel_6);
		frame.getContentPane().add(NewLabel_7);
		frame.getContentPane().add(NewLabel_8);
		frame.getContentPane().add(NewLabel_9);
		frame.getContentPane().add(NewLabel_10);
		frame.getContentPane().add(NewLabel_11);
		frame.getContentPane().add(NewLabel_12);
		frame.getContentPane().add(NewLabel_13);
		frame.getContentPane().add(NewLabel_14);
		frame.getContentPane().add(NewLabel_15);
		frame.getContentPane().add(NewLabel_16);
		frame.getContentPane().add(NewLabel_17);
		frame.getContentPane().add(NewLabel_18);
		frame.getContentPane().add(NewLabel_19);
		frame.getContentPane().add(NewLabel_20);
		frame.getContentPane().add(NewLabel_21);
		frame.getContentPane().add(NewLabel_22);
		frame.getContentPane().add(NewLabel_23);
		frame.getContentPane().add(NewLabel_24);
		frame.getContentPane().add(lblNewLabel_5);
		frame.getContentPane().add(NewLabel_25);
		frame.getContentPane().add(NewLabel_26);
		frame.getContentPane().add(NewLabel_27);
		frame.getContentPane().add(NewLabel_28);
		frame.getContentPane().add(NewLabel_29);
		frame.getContentPane().add(NewLabel_30);
		frame.getContentPane().add(NewLabel_31);
		frame.getContentPane().add(NewLabel_32);
		frame.getContentPane().add(NewLabel_33);
		frame.getContentPane().add(NewLabel_34);
		frame.getContentPane().add(NewLabel_34d);
		frame.getContentPane().add(comboBox1);
		frame.getContentPane().add(comboBox2);
		frame.getContentPane().add(comboBox3);
		frame.getContentPane().add(comboBox4);
		frame.getContentPane().add(comboBox5);
		frame.getContentPane().add(comboBox6);
		frame.getContentPane().add(comboBox7);
		frame.getContentPane().add(comboBox8);
		frame.getContentPane().add(comboBox9);
		frame.getContentPane().add(comboBox10);
		frame.getContentPane().add(comboBox11);
		frame.getContentPane().add(comboBox12);
		frame.getContentPane().add(comboBox13);
		frame.getContentPane().add(comboBox14);
		frame.getContentPane().add(comboBox15);
		frame.getContentPane().add(comboBox16);
		frame.getContentPane().add(comboBox17);
		frame.getContentPane().add(comboBox18);
		frame.getContentPane().add(comboBox19);
		frame.getContentPane().add(comboBox20);
		frame.getContentPane().add(comboBox21);
		frame.getContentPane().add(comboBox22);
		frame.getContentPane().add(comboBox23);
		frame.getContentPane().add(comboBox24);
		frame.getContentPane().add(comboBox25);
		frame.getContentPane().add(comboBox26);
		frame.getContentPane().add(comboBox27);
		frame.getContentPane().add(comboBox28);
		frame.getContentPane().add(comboBox29);
		frame.getContentPane().add(comboBox30);
		frame.getContentPane().add(comboBox31);
		frame.getContentPane().add(comboBox32);
		frame.getContentPane().add(comboBox33);
		frame.getContentPane().add(comboBox34);
		
	
	}
}
