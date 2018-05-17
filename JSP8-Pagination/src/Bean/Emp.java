package Bean;

public class Emp {
	private int id;
	private String name;
	private float salary;

	public Emp() {
		this.id = 0;
		this.name = "";
		this.salary = 0.0f;
	}
	public Emp(int int1, String string, float float1) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}
