package sqlTable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class Rapor {
	
	private String _TELEPHONE;  
	private String _EMAIL;
	private ArrayList<Boolean> kan_bagis_form=new ArrayList<Boolean>();
	private boolean _result;
	public  Connection con = null;
	public  PreparedStatement pst = null;
	public  ResultSet rs = null;
	public Rapor() {}
	public Rapor(String tel,String email,boolean result,ArrayList kan_bagis_formu) {
		this._TELEPHONE=tel;
		this._EMAIL=email;
		this._result=result;
		this.kan_bagis_form=kan_bagis_formu;
		
	}
	public ArrayList<Boolean> getKan_bagis_formu() {
		return kan_bagis_form;
	}
	public void setKan_bagis_formu(ArrayList<Boolean> kan_bagis_formu) {
		this.kan_bagis_form = kan_bagis_formu;
	}
	public String get_TELEPHONE() {
		return _TELEPHONE;
	}
	public void set_TELEPHONE(String _TELEPHONE) {
		this._TELEPHONE = _TELEPHONE;
	}
	public String get_EMAIL() {
		return _EMAIL;
	}
	public void set_EMAIL(String _EMAIL) {
		this._EMAIL = _EMAIL;
	}
	public boolean get_result() {
		return _result;
	}
	public void set_result(boolean _result) {
		this._result = _result;
	}
	private  void Connection() {
		try {
	
			con = DriverManager.getConnection(
					"jdbc:postgresql://localhost/KANBUL", "postgres",
					"123456");
			
	
	
		} catch (SQLException e) {
	
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
	
		}
		if (con == null) {
				System.out.println("Failed to make connection!");
		}
	}
	public String Exist(String email) throws SQLException {
		Connection();
		String s=null;
	        pst = con.prepareStatement("SELECT * FROM \"rapor\" WHERE email='"+email+"'");
	        rs = pst.executeQuery();
	        while (rs.next()) {
	        	s=rs.getString(2);
	        	System.out.println(s);
	       	}
	   return s;
	}
	public ArrayList Search(String email) throws SQLException {
		Connection();
		ArrayList<Boolean>form=new ArrayList<Boolean>();
	        pst = con.prepareStatement("SELECT * FROM \"rapor\" WHERE email='"+email+"'");
	        rs = pst.executeQuery();
	        while (rs.next()) {
	        	for(int i=3;i<37;i++) {
	        		form.add(rs.getBoolean(i));
	        	}
	       	}
	   return form;
	}
	public  void Insert(String tel,String email,boolean sonuc,ArrayList<Boolean> kan_bagis_formu) throws SQLException {
		Connection();
	    String s=Exist(email);
		if(s!=null) {
			System.out.println("The persons report is already exist");
		}
		else
		{		          
			Statement st = con.createStatement();
			st.executeUpdate("INSERT INTO rapor" + " VALUES ('"
					+tel+"' ,"+"'"+email+"' ,"+"'"+sonuc+"',"+"'"+
   			     kan_bagis_formu.get(0)+"'," +"'"+kan_bagis_formu.get(1)+"',"+"'"+kan_bagis_formu.get(2)+"','"+kan_bagis_formu.get(3)+"', '"+kan_bagis_formu.get(4)+"', '"+kan_bagis_formu.get(5)
   			     +"', '"+kan_bagis_formu.get(6)+"', '"+kan_bagis_formu.get(7)+"', '"+kan_bagis_formu.get(8)+"', '"+kan_bagis_formu.get(9)+"', '"+kan_bagis_formu.get(10)+"', '"+kan_bagis_formu.get(11)+"', '"+kan_bagis_formu.get(12)
   			     +"', '"+kan_bagis_formu.get(13)+"', '"+kan_bagis_formu.get(14)+"', '"+kan_bagis_formu.get(15)+"', '"+kan_bagis_formu.get(16)+"', '"+kan_bagis_formu.get(17)+"', '"+kan_bagis_formu.get(18)+"', '"+kan_bagis_formu.get(19)+"', '"
   			     +kan_bagis_formu.get(20)+"', '"+kan_bagis_formu.get(21)+"', '"+kan_bagis_formu.get(22)+"', '"+kan_bagis_formu.get(23)+"', '"+kan_bagis_formu.get(24)+"', '"+kan_bagis_formu.get(25)+"', '"+kan_bagis_formu.get(26)+"', '"+kan_bagis_formu.get(27)
   			     +"', '"+kan_bagis_formu.get(28)+"', '"+kan_bagis_formu.get(29)+"', '"+kan_bagis_formu.get(30)+"', '"+kan_bagis_formu.get(31)+"', '"+kan_bagis_formu.get(32)+"', '"+kan_bagis_formu.get(33)+"')");			                
			System.out.println(st.toString());
			System.out.println("RAPOR SÝSTEME EKLENDÝ");
		    }
	}
	public  void Update(String tel,String email,Boolean sonuc,ArrayList<Boolean> kan_bagis) throws SQLException {
		Connection();
	    String s=Exist(email);
		if(s!=null) { // st.executeUpdate(UPDATE table SET column1 = value1, column2 = value2 ,... WHERE condition;
			Statement st = con.createStatement();
			st.executeUpdate("UPDATE rapor SET "
			+"\"1\"="+"'"+kan_bagis.get(0)+"'"+",\"2\"="+"'"+kan_bagis.get(1)+"'"+",\"3\"="+"'"+kan_bagis.get(2)+"'"+",\"4\"="+"'"+kan_bagis.get(3)+"'"+",\"5\"="+"'"+kan_bagis.get(4)+"'"+",\"6\"="+"'"+kan_bagis.get(5)+"'"+",\"7\"="+"'"+kan_bagis.get(6)+"'"+",\"8\"="+"'"+kan_bagis.get(7)+"'"+",\"9\"="+"'"+kan_bagis.get(8)+"'"+",\"10\"="+"'"+kan_bagis.get(9)+"'"+",\"11\"="+"'"+kan_bagis.get(10)+"'"+",\"12\"="+"'"+kan_bagis.get(11)
			+"'"+",\"13\"="+"'"+kan_bagis.get(12)+"'"+",\"14\"="+"'"+kan_bagis.get(13)+"'"+",\"15\"="+"'"+kan_bagis.get(14)+"'"+",\"16\"="+"'"+kan_bagis.get(15)+"'"+",\"17\"="+"'"+kan_bagis.get(16)+"'"+",\"18\"="+"'"+kan_bagis.get(17)+"'"+",\"19\"="+"'"+kan_bagis.get(18)+"'"+",\"20\"="+"'"+kan_bagis.get(19)+"'"+",\"21\"="+"'"+kan_bagis.get(20)+"'"+",\"22\"="+"'"+kan_bagis.get(21)+"'"+",\"23\"="+"'"+kan_bagis.get(22)
			+"'"+",\"24\"="+"'"+kan_bagis.get(23)+"'"+",\"25\"="+"'"+kan_bagis.get(24)+"'"+",\"26\"="+"'"+kan_bagis.get(25)+"'"+",\"27\"="+"'"+kan_bagis.get(26)+"'"+",\"28\"="+"'"+kan_bagis.get(27)+"'"+",\"29\"="+"'"+kan_bagis.get(28)+"'"+",\"30\"="+"'"+kan_bagis.get(29)+"'"+",\"31\"="+"'"+kan_bagis.get(30)+"'"+",\"32\"="+"'"+kan_bagis.get(31)+"'"+",\"33\"="+"'"+kan_bagis.get(32)+"'"+",\"34\"="+"'"+kan_bagis.get(33)
			+"'"+" WHERE email="+"'"+email+"'"+";");
			System.out.println("RAPOR SÝSTEMDE GÜNCELLENDÝ");
		}
		else
		{		          
			System.out.println("RAPOR SÝSTEMDE YOK");
		    }
	}
	public static void main(String[]args) throws SQLException {
		Rapor a = new Rapor();
		ArrayList<Boolean> soru=new ArrayList<Boolean>();
		for(int i=0;i<34;i++) {
			soru.add(i,false);
		}
		a.Update("85","ba",false,soru);
		//a.Insert("85","ba",false,soru);
//		ArrayList<Boolean> sonuc=a.Search("b");
//		for(int i=0;i<34;i++)
//			System.out.println(i +" "+ sonuc.get(i));
		}
}
