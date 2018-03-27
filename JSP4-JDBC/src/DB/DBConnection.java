package DB;
import java.sql.*;

public class DBConnection {
	 private static String DB_URL = "jdbc:mysql://localhost:3306/jspbai4";
	    private static String USER_NAME = "root";
	    private static String PASSWORD = "1234";
	public static Connection createConnection() {
		Connection conn = null;
		 try {
	            Class.forName("com.mysql.jdbc.Driver");
	            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
	            System.out.println("connect successfully!");
	        } catch (Exception ex) {
	            System.out.println("connect failure!");
	            ex.printStackTrace();
	        }
		
		return conn;
	}
}
