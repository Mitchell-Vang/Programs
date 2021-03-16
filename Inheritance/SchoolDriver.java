
public class SchoolDriver {

	public static void main(String[] args) {
		School School1 = new School("Somewhere East", "Amy Hope", 35000);
		School School2 = new School("Somewhere West", "John Hawlks", 48000);
		Student Student1 = new Student("Jimmy", 3.5);
		Student Student2 = new Student("Jenny", 3.8);
		Student Student3 = new Student("Billy", 3.8);
		
		School1.addStudent(Student1);
		School2.addStudent(Student2);
		School1.addStudent(Student3);
		School2.addStudent(Student3);
		
		School1.schoolAudit();
		School2.schoolAudit();
	}

}
