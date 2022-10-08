package switchDemo;

public class Main {

	public static void main(String[] args) {
		
		char grade = 'F';
		
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Pekiyi : Geçtiniz");
		case 'C':
			System.out.println("İyi : Geçtiniz");
		case 'D':
			System.out.println("Orta : Geçtiniz");
		case 'F':
			System.out.println("Kötü : Kaldınız");
		default:
			System.out.println("Lütfen bir harf giriniz.");
			break;
		}

	}

}
