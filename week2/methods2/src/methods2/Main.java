package methods2;

public class Main {

	public static void main(String[] args) {

		add();
		delete();
		
		int total = sum(1, 2);
		System.out.println(total);
		
		int total2 = sum2(1,2,3,4,5,6);
		System.out.println(total2);
		
	}
	
	public static void add() {
		System.out.println("added");
	}
	public static void delete() {
		System.out.println("deleted");
	}
	public static void update() {
		System.out.println("updated");
	}
	
	public static int sum(int number1,int number2) {
		return number1+number2;
	}
	
	//Variables Arguments
	public static int sum2(int... numbers) {
		int total = 0;
		for(int number: numbers) {
			total+=number;
		}
		
		return total;
		
	}

}
