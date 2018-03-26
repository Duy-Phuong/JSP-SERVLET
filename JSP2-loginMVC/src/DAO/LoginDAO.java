package DAO;

public class LoginDAO {
	public static boolean Check(String name, String pass) {
		boolean t = false;
		if(name.equalsIgnoreCase("admin") == true && pass.equalsIgnoreCase("admin") == true) {
			t = true;
		}
		return t;
	}
}
