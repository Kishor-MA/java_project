package Static;

public class StaticKeywordExample {
	public static void main(String[] args) {
		
		Student mark = new Student();
		System.out.println(mark.getNoOfStudents());

		Student tom = new Student();
		System.out.println(tom.getNoOfStudents());

		
		System.out.println(Student.getNoOfStudents());

		
		
		
	}

}
