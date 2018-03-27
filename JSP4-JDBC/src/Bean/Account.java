package Bean;

public class Account {
	public Account(String uname, String pass) {
		super();
		this.uname = uname;
		this.pass = pass;
	}
	private String uname;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	private String pass;
	
}
