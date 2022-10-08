package vowelsProject2;

public class Main {

	public static void main(String[] args) {
		
		char character = 'E';
		
		switch (character) {
		case 'A','O','U':
			System.out.println("Kalın sesli harftir.");
			break;
		case 'E','İ','Ü':
			System.out.println("İnce sesli harftir.");
			break;
		default:
			System.out.println("İnce veya Kalın sesli bir harf değildir.");
			break;
		}

	}

}
