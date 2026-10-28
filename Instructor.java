package lap3;

public class Instructor extends Person {
	private double salary;
	private String dept;
	public Instructor() {
		super();
	}
	public Instructor(double salary, String dept , Name name, int age, Address address) {
		super(name , age , address);
		this.salary = salary;
		this.dept = dept;
	}
	
	public Instructor(double salary, String dept,String first, String last,int age, String street, String city) {
		super(new Name(first,last),age,new Address(street,city));
		this.salary = salary;
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDebt() {
		return dept;
	}
	public void setDebt(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return super.toString() + "Instructor [salary=" + salary + ", debt=" + dept + "]";
	}
	
	
	

}
