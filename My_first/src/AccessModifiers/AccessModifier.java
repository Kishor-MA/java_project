package AccessModifiers;

public class AccessModifier {
	
	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.setName("Mark");
		stu.setAge(15);
		
		System.out.println(stu.getName());
		System.out.println(stu.getAge());

		
	}

}
