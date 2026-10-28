package lap3;

public class Student extends Person {
	private String id;
	private double gpa;
	public Student() {
		super();
	}
	public Student(String id, double gpa,Name name ,  int age, Address address) {
		super(name , age , address);
		this.id = id;
		this.gpa = gpa;
	}
	
	public Student(String first, String last,int age, String street, String city, String id, double gpa) {
		super(new Name(first,last),age,new Address(street,city));
		this.id = id;
		this.gpa = gpa;
	}
	public Student ( Name name, Address address,int age , String id, double gpa){
		super(name,age,address);
		this.id = id;
		this.gpa = gpa;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return super.toString() + "Student [id=" + id + ", gpa=" + gpa + "]";
	}
	
	

}
