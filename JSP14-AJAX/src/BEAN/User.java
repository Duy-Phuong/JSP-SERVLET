package BEAN;

public class User {
	private int stt;
	private String name;
	private int pass;
	public User(int int1, String string, int int2) {
		stt = int1;
		name = string;
		pass = int2;
	}
	public User() {
		
	}
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
}
