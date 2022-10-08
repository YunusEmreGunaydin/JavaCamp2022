package reCapDemo2;

public class Main {

	public static void main(String[] args) {
	
		double[] myList = {1.2,2.4,3.2,5.6};
		
		double total = 0;
		double maxNumber = myList[0];
		
		for (double number : myList) {
			
			if (number>maxNumber) {
				maxNumber = number;
			}
			System.out.println(number);
			total += number;
		}
		
		
		System.out.println(total);
		System.out.println(maxNumber);
		
		
		

	}

}
