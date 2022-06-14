
public class for_loop {
	public static void main(String[] args) {
		int[] myintarray = {100, 50, 63, 43, 54};
		
		for (int index = 0; index < 5; index++) {
			System.out.println(myintarray[index]);

		}
		System.out.println("--------");

		
		for (int element : myintarray){
			System.out.println(element);

			
			
		}
				
	}

}
