package findNumberMiniProject5;

public class Main {

	public static void main(String[] args) {
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
			System.out.println("Sayı dizide bulundu.");
		} else {
			System.out.println("Sayı dizide bulunamadı.");
		}

	}

}
