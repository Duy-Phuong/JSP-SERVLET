package Bean;

public class Province {
	public Province(int provinceid, String provincename) {
		
		this.provinceid = provinceid;
		this.provincename = provincename;
	}
	private int provinceid;
	public int getProvinceid() {
		return provinceid;
	}
	public void setProvinceid(int provinceid) {
		this.provinceid = provinceid;
	}
	private String provincename;
	public String getProvincename() {
		return provincename;
	}
	public void setProvincename(String provincename) {
		this.provincename = provincename;
	}
	
}
