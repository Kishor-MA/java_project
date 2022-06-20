package Class;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student mark = new Student();//mark -> object or instance
		
		mark.setId(5);
		mark.setName("Mark");
		mark.setAge(15);
		
	Student tom = new Student();//tom -> object or instance
		
	tom.setId(4);
	tom.setName("Tom");
	tom.setAge(14);
		

		System.out.println(mark.getName() + " is " + mark.getAge() + " years old");
		System.out.println(tom.getName() + " is " + tom.getAge() + " years old");

		
		

	}

}
