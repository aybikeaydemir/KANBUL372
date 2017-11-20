package sqlTable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

import MenuGuý.BloodTypeResultPage;

public class KanVerici {
	/*
	 To do list :
	 * Add Update method, for each userType 
	 ALTER TABLE KIZILAY RENAME COLUMN HospitalCity TO City;
	 */

        private int _flag ;
 		private int _age; 
 		private int _raport;
 		private char _sex;
 		private String _TELEPHONE;  
 		private String _EMAIL;
 		private String _fname;
        private String _mname;
        private String _lname;
        private String _userPassword;
        private String _bloodType;
        private String _PLATE;
        private String _address;
        private String _city ;
        private String _town;
        private String _bloodTypeNum ;
        public Connection con = null;
    	public PreparedStatement pst = null;
        public ResultSet rs = null;
        public Statement stmt = null;
        public Connection con2 = null;
    	public PreparedStatement pst2 = null;
        public ResultSet rs2 = null;
        public Statement stmt2 = null;
        public ResultSetMetaData metadata =null ;
        public ResultSetMetaData metadata2 =null ;
        public String sql=null;
        public int columnCount;
        public int columnCount2;
        BloodTypeResultPage resultPage = new  BloodTypeResultPage();
        ArrayList<String> resultArray  =new ArrayList<String>();
        ArrayList<String> resultArrayHospital  =new ArrayList<String>();
        public ArrayList< String> KullaniciPage = new ArrayList<>();
        public static String  [][]  bloodTable = new String [8][8];
        BloodTypeResultPage text = new BloodTypeResultPage();
        
        public KanVerici() {
        	
        	
        }
        
        // if(flag 1) DONOR
        public KanVerici( int flag,String telephone,String email,String fname,
		String mname,String lname,String pass,
	   String bloodType,String town,String city,int raport,char sex,int age) throws SQLException {
        	
        	 _flag=flag;
         	_TELEPHONE=telephone;
         	_EMAIL=email;
         	_fname = fname;
         	_mname=mname;
         	_lname=lname;
         	_userPassword=pass;
         	_bloodType=bloodType;
         	_town=town;
         	_city = city;
        	_raport =raport;
        	_sex=sex;
        	_age = age;
        	//System.out.println(flag);
        	Insert(_flag);
        	
        }
         //if(flag 2) HASTANE
        public KanVerici ( int flag,String telephone,String email,String fname,String pass,
      		   String bloodType,String town,String city,String bloodTypeNum,String address) throws SQLException {
        	 
        	_flag=flag;
          	_TELEPHONE=telephone;
          	_EMAIL=email;
          	_fname = fname;
          	_userPassword=pass;
          	_bloodType=bloodType;
          	_town=town;
          	_city = city;
        	_address = address;
        	_bloodTypeNum=bloodTypeNum;
        	
        	System.out.println(flag);
        	Insert(_flag);
       
        }
        
        //if(flag 3 ) KIZILAY OTOBUSU
        public KanVerici  ( int flag,String telephone,String email,String fname,String pass,
       		   String bloodType,String town,String city,String plate,String bloodTypeNum,String address) throws SQLException {
        	_fname=fname;
        	_flag=flag;
          	_TELEPHONE=telephone;
          	_EMAIL=email;
          	_bloodType=bloodType;
          	_userPassword=pass;
          	_town=town;
          	_city = city;
        	_PLATE=plate;
        	_address=address;
        	_bloodTypeNum=bloodTypeNum;
        	//System.out.println(otobus._EMAIL);
            	System.out.println(flag);
            	Insert(_flag);
  	
            }
  
            private void Connection () {

				try {

					con = DriverManager.getConnection(
							"jdbc:postgresql://localhost/KanBul", "postgres",
						"Aybike_95");
					con2 = DriverManager.getConnection(
							"jdbc:postgresql://localhost/KanBul", "postgres",
						"Aybike_95");
				
			} catch (SQLException e) {

				System.out.println("Connection Failed! Check output console");
				e.printStackTrace();
				return;
			}
			if (con != null&& con2!=null) {
				System.out.println("You made it, take control your database now!");
			} else {
				System.out.println("Failed to make connection!");
			}
        	
        	
        	
        }
        public boolean Exist(String _TELEPHONE,String _EMAIL) throws SQLException {
        	
        	Connection ();
        	pst = con.prepareStatement("SELECT * FROM \"kan_verici\" WHERE telephone='"+_TELEPHONE+"' "
        			+ "and email='"+_EMAIL+"'");
	        rs = pst.executeQuery();
	        String check=null;
	          while (rs.next()) {
	               check=rs.getString(2)+" ";
	            }
	          
	          if(check==null) {
	                	return false;
	                 }
	                else 
	                	return true;

        }
 public boolean Exist(String _EMAIL) throws SQLException {
        	
        	Connection ();
        	pst = con.prepareStatement("SELECT * FROM \"kan_verici\" WHERE "
        			+ " email='"+_EMAIL+"'");
	        rs = pst.executeQuery();
	        String check=null;
	          while (rs.next()) {
	               check=rs.getString(2)+" ";
	            }
	          
	          if(check==null) {
	                	return false;
	                 }
	                else 
	                	return true;

        }
    public boolean InvalidAddress(String _EMAIL,String Password) throws SQLException {
        	
        	Connection ();
        	
        	pst = con.prepareStatement("SELECT * FROM \"kan_verici\" WHERE "
        			+ " email='"+_EMAIL+"'"+ " and userpassword='"+Password+"'");
	        rs = pst.executeQuery();
	        String check=null;
	          while (rs.next()) {
	               check=rs.getString(2)+" ";
	            }
	          
	          if(check==null) {
	                	return false;
	                 }
	                else 
	                	return true;

        }
    
    	
    			
       public int convertToIndex(String BloodType) {
    	 //O- O+ A- A+ B- B+ AB- AB+
    	   if ( BloodType =="0Rh-") 
    		   return 0;
    	   else if ( BloodType =="0Rh+")
    		   return 1;
    	   else if ( BloodType =="ARh-")
    		   return 2;
    	   else if ( BloodType =="ARh+")
    		   return 3;
    	   else if ( BloodType =="BRh-")
    		   return 4;
    	   else if ( BloodType =="BRh+")
    		   return 5;
    	   else if ( BloodType =="ABRh-")
    		   return 6;
    	   else 
    		   return 7;
    	   
    	
      }
       public String convertToString(int BloodType) {
      	 //O- O+ A- A+ B- B+ AB- AB+ 0Rh+
  
      	   if ( BloodType ==0) 
      		   return "0Rh-";
      	   else if ( BloodType ==1)
      		   return "0Rh+";
      	   else if ( BloodType ==2)
      		   return "ARh-";
      	   else if ( BloodType ==3)
      		   return "ARh+";
      	   else if ( BloodType ==4)
      		   return "BRh-";
      	   else if ( BloodType ==5)
      		   return"BRh+";
      	   else if ( BloodType ==6)
      		   return "ABRh-";
      	   else 
      		   return "ABRh+";
      	   
      	
        }
        public  void SearchBlood (String BloodType,String HospitalName)  throws SQLException {
        	String type="";
    		CreateBloodTable();
        	int rowi =convertToIndex( BloodType);      
        	//O- O+ A- A+ B- B+ AB- AB+
        	//System.out.println(rowi);
        	for(int j =0;j <bloodTable.length;j++) {
        		//System.out.println((bloodTable[rowi][j]));
        		if(bloodTable[rowi][j]=="X") {
        			
        			 type=convertToString(j);
        	//	  System.out.println( "Kanverici :"+SearchBloodSql(type).toString());
        			  SearchBloodSql(type);
        			  if (!HospitalName.equals("Hastane kalmýyoruz.")) {
        			//	  System.out.println("Hastane kalýyoruz "+HospitalName);
        				  SearchBloodSqlHospital(type,HospitalName);
        			  }
        		}
        	}
        	System.out.println(resultArrayHospital.toString()+"SearchBlood");
        	text.newScreen(resultArray,resultArrayHospital);
        }
        public static void CreateBloodTable() {
        	//O- O+ A- A+ B- B+ AB- AB+
        	
        	     for (int i = 0 ; i<bloodTable.length ;i++) {
        	    	 for (int j = 0 ; j<bloodTable.length ;j++)
        	    	 {
        	    		 if(i==0 && j== 0)
        	    			 bloodTable[0][0]="X";
        	    		 else if( (i==1 && (j==0 || j== 1) )) 
        	    			 bloodTable[1][j]="X";
        	    		 else if (i==2 && (j==0 || j==2)) 
        	    			 bloodTable[2][j]="X";
        	    		 else if (i == 3 && (j==0 || j==1 || j==2 || j==3))
        	    			 bloodTable[3][j]="X";
        	    		 else if (i == 4 && (j==0 || j==4))
        	    		     bloodTable[4][j]="X";
        	    		 else if (i == 5 && (j==0 || j==1 || j==4 || j==5))
        	    			 bloodTable[5][j]="X";
        	    		 else if (i == 6 && (j==0 || j==2 || j==4 || j==6))
        	    			 bloodTable[6][j]="X";
        	    		 else if(i==7) 
        	    			 bloodTable[7][j]="X";
        	    		 else 
        	    			 bloodTable[i][j]="O";
        	    		 
        	    	 }
        	     }
        	
        }
        public void  SearchBloodSql(String BloodType) throws SQLException {
        	String result="" ;
        	Connection();
        
        	pst = con.prepareStatement("SELECT * FROM \"kan_verici\" WHERE bloodtype= '"+BloodType+"'");
	        rs = pst.executeQuery();
	        metadata = rs.getMetaData();
            columnCount = metadata.getColumnCount();
            String row = "";
            while(rs.next()) {
            	
            	
            	 for (int i = 2; i <= columnCount; i++) {
                 	if( i!=3 && i!=7 && i!=8 && i!=12) {
                 		if(rs.getString(i)!=null  ) {
                 			//System.out.print(rs.getString(i)+" ");
                 		    result =result +rs.getString(i)+" ";
                 		}
                     		if(i==columnCount) {
                     		//System.out.println();
                     		//System.out.println(result);
                     		resultArray.add(result);
                     		result ="";
                     		}
                 		
                 	}
                 	}
            	 }
                
                }
        public void  SearchBloodSqlHospital(String BloodType,String HospitalName) throws SQLException {
        	String result="" ;
        	Connection();
         //   System.out.println("girdin mi");
        	pst2 = con2.prepareStatement("SELECT * FROM kan_verici WHERE flagnum=2 and bloodtype like '%"+BloodType+"%'  and  fname like '%"+HospitalName+"%'" );
	  //     System.out.println(pst2.toString());
        	rs2 = pst2.executeQuery();
	        metadata2 = rs2.getMetaData();
            columnCount2 = metadata2.getColumnCount();
            String row = "";
            while(rs2.next()) {
            	
            	
            	 for (int i = 2; i <= columnCount2; i++) {
                 	if( i==2||i==4||i==10 || i==11 || i==12||i==14 ) {
                 		if(rs2.getString(i)!=null  ) {
                 			System.out.print(rs2.getString(i)+" ");
                 		    result =result +rs2.getString(i)+" ";
                 		}
                     	
                 		
                 	}
                	if(i==columnCount2) {
                     	//	System.out.println(result);
                     	System.out.println("Colum");
                     		resultArrayHospital.add(result);
                     		result ="";
                     		}
                 	}
            	 }
                
                }
            public  ArrayList<String> SearchEnterHospital(String Email,String password) throws SQLException {
                
            	Connection ();
            	
            	if(InvalidAddress(Email,password)) {
            	pst = con.prepareStatement("SELECT * FROM \"kan_verici\" WHERE email='"+Email+"' and userpassword='"+password+"'" );
    	        rs = pst.executeQuery();
    	        metadata = rs.getMetaData();
                columnCount = metadata.getColumnCount();
                while(rs.next()) {
                	
                for (int i = 2; i <= columnCount; i++) {
                	if(i==4 || i==13 || i==15) {
                			KullaniciPage.add(rs.getString(i));
                			System.out.println(rs.getString(i)+"sadsdqsd");
    		            }
                    }
                }
                return KullaniciPage;
            	}
				return null;
           }
            
public  ArrayList<String> SearchEnter(String Email,String password) throws SQLException {
                
            	Connection ();
            	
            	if(InvalidAddress(Email,password)) {
            	pst = con.prepareStatement("SELECT * FROM \"kan_verici\" WHERE email='"+Email+"' and userpassword='"+password+"'" );
    	        rs = pst.executeQuery();
    	        metadata = rs.getMetaData();
                columnCount = metadata.getColumnCount();
                while(rs.next()) {
                	
                for (int i = 2; i <= columnCount; i++) {
                	if( i!=8 && i!=12 && i!=13) {
                			KullaniciPage.add(rs.getString(i));
    		            }
                    }
                    }
                return KullaniciPage;
            	}
				return null;
           }
             

			public  ArrayList<String> SearchEnterBus(String Email,String password) throws SQLException {
			    
				Connection ();
				System.out.println("email"+Email+" psaaa"+password);
				if(InvalidAddress(Email,password)) {
				pst = con.prepareStatement("SELECT * FROM \"kan_verici\" WHERE email='"+Email+"' and userpassword='"+password+"'" );
			    rs = pst.executeQuery();
			    metadata = rs.getMetaData();
			    columnCount = metadata.getColumnCount();
			    while(rs.next()) {
			    	
			    for (int i = 2; i <= columnCount; i++) {
			    	if( i==4 || i==10|| i==11 || i==13 || i==14 || i==15 || i==16) {
			    			KullaniciPage.add(rs.getString(i));
			        }
			    }
			    return KullaniciPage;
				}}
				return null;
				
			}
 
            public void Delete(String _TELEPHONE,String _EMAIL) throws SQLException {
           
            	Connection();
            	if(Exist(_TELEPHONE, _EMAIL)) {
            	stmt = con.createStatement();
		        stmt.executeUpdate("DELETE FROM \"kan_verici\" WHERE telephone='"+_TELEPHONE+"' and email='"+_EMAIL+"'");
        	}
        	else 
        		System.out.println("there is no person to (Delete)");
        }
       public void UpdatePerson (String Email,String telephone,String fname,String lname,String userPassword,int age,String city,String town ) throws SQLException {
        	Connection();
        	stmt = con.createStatement();
        	//System.out.println("UPDATE \"kan_verici\" SET  telephone="+"'"+telephone+"',"+"fname='"+fname+"', lname='"+lname+"', userpassword='"+userPassword+"',  age='"+age+"', city='"+city+"', town='"+town+"'"+" WHERE email='"+Email+"'");
        	stmt.executeUpdate("UPDATE \"kan_verici\" SET  telephone="+"'"+telephone+"',"+"fname='"+fname+"', lname='"+lname+"', userpassword='"+userPassword+"',  age='"+age+"', city='"+city+"', town='"+town+"'"+" WHERE email='"+Email+"'");
        }
       
       public void UpdateHospital (String Email,String bloodtype,String bloodtypenum ) throws SQLException {
          	Connection();
          	stmt = con.createStatement();
          	//System.out.println("UPDATE \"kan_verici\" SET  telephone="+"'"+telephone+"',"+"fname='"+fname+"', lname='"+lname+"', userpassword='"+userPassword+"',  age='"+age+"', city='"+city+"', town='"+town+"'"+" WHERE email='"+Email+"'");
          	stmt.executeUpdate("UPDATE \"kan_verici\" SET  bloodtype="+"'"+bloodtype+"',"+"bloodtypenum='"+bloodtypenum+"'  WHERE email='"+Email+"'");
          }
       
       public void UpdateBus (String Email,String city,String town,String bloodtype,String plate,String bloodtypenum,String address) throws SQLException {
       	Connection();
       	stmt = con.createStatement();
       	System.out.println("UPDATE \"kan_verici\" SET  bloodtype="+"'"+bloodtype+"',"+"bloodtypenum='"+bloodtypenum+"' ,plaka='"+plate+"', city='"+ city+"', town='"+town+"', address='"+address+"'  WHERE email='"+Email+"'");
       	stmt.executeUpdate("UPDATE \"kan_verici\" SET  bloodtype="+"'"+bloodtype+"',"+"bloodtypenum='"+bloodtypenum+"' ,plaka='"+plate+"', city='"+ city+"', town='"+town+"', address='"+address+"'  WHERE email='"+Email+"'");
       }
       
        private void Insert(int flag) throws SQLException {
        	
        	Connection();
        	stmt = con.createStatement();
        	
        	if(flag==1) {        		
                sql="INSERT INTO \"kan_verici\" VALUES"
        			+" ("+"'"+_flag+"' ,"+"'"+_TELEPHONE+"' ,"+"'"+_EMAIL+"',"+"'"+
        			     _fname+"'," +"'"+_mname+"',"+"'"+_lname+"',"+"'"+_userPassword+"', '"+_sex+"', '"+_age+"', '"
        			      +_city+"', '"+_town+"', '"+_raport+"', '"+_bloodType+"',"+null+","+""+null+","+""+null+")";
           //     System.out.println(sql);
                stmt.executeUpdate(sql);
                stmt.close();
        	}
        	//
        	else if (flag==2)
        	{
        		
        		sql="INSERT INTO \"kan_verici\" VALUES"
            			+" ("+"'"+_flag+"' ,"+"'"+_TELEPHONE+"' ,"+"'"+_EMAIL+"',"+"'"+
            			     _fname+"'," +""+null+","+""+null+","+"'"+_userPassword+"',"+null+","+null+",'"
            			      +_city+"', '"+_town+"',"+null+", '"+_bloodType+"',"+null+","+"'"+_bloodTypeNum+"',"+"'"+_address+"')";
        		System.out.println(sql);
        		stmt.executeUpdate(sql);
        		
                stmt.close();
        	}
        	
        	else {
        		
        		sql="INSERT INTO \"kan_verici\" VALUES"
            			+" ("+"'"+_flag+"' ,"+"'"+_TELEPHONE+"' ,"+"'"+_EMAIL+"',"+"'"+
            			     _fname+"'," +""+null+","+""+null+","+""+_userPassword+","+null+","+null+",'"
            			      +_city+"', '"+_town+"',"+null+", '"+_bloodType+"','"+_PLATE+"',"+"'"+_bloodTypeNum+"',"+"'"+_address+"')";
        		System.out.println(sql);
        		stmt.executeUpdate(sql);
        		
                stmt.close();
        		
        	}
        	
        }
        

        
        
		public static void main(String [] args) throws SQLException {
           
	

			}
}
