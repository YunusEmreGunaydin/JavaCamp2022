package methodOverloading;

public class Main {

	public static void main(String[] args) {
		
		Process process = new Process();
		int result1 = process.sum(1,2);
		int resutl2 = process.sum(1,2,3);
		
		System.out.println(result1);
		System.out.println(resutl2);
		
	}

}
