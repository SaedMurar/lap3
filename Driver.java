package lap3;

public class Driver {

	public static void main(String[] args) {
		Student student = new Student("saed","ali",20,"main St","ramallah","12345",2.90);
		System.out.println(student.toString());
		
		Instructor instructor = new Instructor(100.00,"hr","ahmed","omer",20,"main St", "ramallah");
		System.out.println(instructor.toString());

	}

}
