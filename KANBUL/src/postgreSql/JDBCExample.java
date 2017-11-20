package postgreSql;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
public class JDBCExample {
/*
 * INSERT into KAN_VERICI values ('1','5359624652','mericbalgamis@gmail.com','Meriç',' ','Balgamýþ','meric123','M','21','Ankara','Etimesgut','1',' ','0Rh+',' ');
INSERT into KAN_VERICI values ('1','5056584287','beyzaolmez@gmail.com','Beyza',' ','Olmez','beyza123','F','21','Ankara','Kýzýlay','1',' ','BRh+',' ');
INSERT into KAN_VERICI values ('1','5058308030','benanbardak@gmail.com','Benan',' ','Bardak','benan123','F','21','Ankara','Çankaya','1',' ','ARh+',' ');
INSERT into KAN_VERICI values ('1','5058564822','bikemgüven@gmail.com','Bikem','Simge','Güven','bikem123','F','22','Ankara','Etimesgut','1',' ','ABRh-',' ');
INSERT into KAN_VERICI values ('1','5058177345','ozancancinar@gmail.com','Ozan','Can','Çýnar','ozan123','M','21','Ankara','Çubuk','1',' ','0Rh+',' ');
INSERT into KAN_VERICI values ('2','3128567341','beypazaridevlethastanesi@gmail.com',' ',' ',' ','beypazari123',' ',' ','Ankara','Beypazari',' ',' ');
INSERT into KAN_VERICI values ('2','3128484141','@gmail.com');
INSERT into KAN_VERICI values ('2','3122447542','@gmail.com');
INSERT into KAN_VERICI values ('2','3129186298','@gmail.com');
INSERT into KAN_VERICI values ('2','3124922902','@gmail.com');
INSERT into KAN_VERICI values ('3','');
INSERT into KAN_VERICI values ('3','');
INSERT into KAN_VERICI values ('3','');
INSERT into KAN_VERICI values ('3','');
INSERT into KAN_VERICI values ('3','');
 */
	public static void main(String[] argv) {
		PreparedStatement pst = null;
        ResultSet rs = null;
		System.out.println("-------- PostgreSQL "
				+ "JDBC Connection Testing ------------");

		try {

			Class.forName("org.postgresql.Driver");

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your PostgreSQL JDBC Driver? "
					+ "Include in your library path!");
			e.printStackTrace();
			return;

		}

		System.out.println("PostgreSQL JDBC Driver Registered!");

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(
					"jdbc:postgresql://localhost/KanBul", "postgres",
					"Aybike_95");
			


		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;

		}
		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
	}

}