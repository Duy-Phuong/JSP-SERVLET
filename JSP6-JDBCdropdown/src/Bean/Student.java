package Bean;

public class Student {
public Student(String studentname, int provinceid) {
		this.studentname = studentname;
		this.provinceid = provinceid;
	}
	public Student(int studentid, String studentname, int provinceid) {
		
		this.studentid = studentid;
		this.studentname = studentname;
		this.provinceid = provinceid;
	}
	private int studentid;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getProvinceid() {
		return provinceid;
	}
	public void setProvinceid(int provinceid) {
		this.provinceid = provinceid;
	}
	private String studentname;
	private int provinceid;
	
}
