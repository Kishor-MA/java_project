
public class switch_condition {
	public static void main(String[] args) {
		//bytes, short, int, char
		
		int score = 40;
		
		switch (score) {
		
		case 90:
			System.out.println("Very good");
			break;
		case 60:
			System.out.println("Good");
			break;
		case 20:	
		case 40:
			System.out.println("OK");
			break;
		default:
			System.out.println("The grades are not defined");
			break;
			
		}
	}
}
