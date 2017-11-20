package menu;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BeMember {
		public static void main (String []args ) {
			
			
			Connection con = null;
	        PreparedStatement pst = null;
	        ResultSet rs = null;
	        ResultSet rss = null;
	        try {
	            
	            con = DriverManager.getConnection("jdbc:postgresql://localhost/KanBul", "postgres",
						"Aybike_95");
	            pst = con.prepareStatement("SELECT * FROM \"KAN_ARAYAN\"");
		         rs = pst.executeQuery();
		     
		         
		          while (rs.next()) {
		                System.out.print(rs.getBigDecimal(1)+" ");
		                System.out.print(rs.getString(2)+" ");
		                System.out.print(rs.getString(3)+" ");
		                System.out.print(rs.getString(4)+" ");
		                System.out.print(rs.getString(5)+" ");
		                System.out.print(rs.getString(6)+" ");
		                System.out.print(rs.getString(7)+" ");
		                System.out.println("");
		            }

	            while (rs.next()) {
	                System.out.print(rs.getInt(1));
	                System.out.print(": ");
	                System.out.println(rs.getString(2));
	            }

	        } catch (SQLException ex) {
	               Logger lgr = Logger.getLogger("Class");
	              lgr.log(Level.SEVERE, ex.getMessage(), ex);

	        } finally {

	            try {
	                if (rs != null) {
	                    rs.close();
	                }
	                if (pst != null) {
	                    pst.close();
	                }
	                if (con != null) {
	                    con.close();
	                }

	            } catch (SQLException ex) {
	           Logger lgr = Logger.getLogger("Class");
	             lgr.log(Level.WARNING, ex.getMessage(), ex);
	            }
	        }
	    }
	}

