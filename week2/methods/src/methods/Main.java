package methods;

public class Main {

	public static void main(String[] args) {
		
		findingNumber();
	}
	
	public static void findingNumber() {
		int[] numbers = {1,2,3,4,5,6};
		int number1 = 5;
		
		boolean isThere = false;
		
		for (int number : numbers) {
			if (number == number1 ) {
				isThere = true;
				break;
			}
		}
		
		if (isThere) {
			sendMessage("Sayı dizide bulundu.");
		} else {
			sendMessage("Sayı dizide bulunamadı.");
		}
	}
	
	public static void sendMessage(String message) {
		System.out.println(message);
	}
	

}
