package Static;

public class StaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello hello = new Hello();
		Hello.age = 10;
		System.out.println(hello.age);
		Hello hello1 = new Hello();
		Hello.age = 15;
		System.out.println(hello1.age);

		Hello hello2= new Hello();
		Hello hello3 =  new Hello();


	}

}
