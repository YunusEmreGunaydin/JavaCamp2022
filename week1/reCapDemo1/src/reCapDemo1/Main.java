package reCapDemo1;

public class Main {

	public static void main(String[] args) {
		
		int number1 = 21;
		int number2 = 34;
		int number3 = 12;
		
		int bigNumber = number1;
		
		
		if(bigNumber<number2) {
			bigNumber = number2;
		}
		
		if(bigNumber<number3) {
			bigNumber = number3;
		}
		
		
		System.out.println("Big Number :"+ bigNumber);

	}

}
