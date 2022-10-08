package loopDemo;


public class Main {

	public static void main(String[] args) {
		
		//For Loop
		 for(int i = 1; i<10; i++) {
			 System.out.println(i);
		 }
		 
		 System.out.println("LOOP FİNİSH");
		 
		 int[] numbers = {1,2,3,4,5};
		
		 for (int i = 0; i < numbers.length; i++) {
			System.out.println(i);
		}
		 
		 System.out.println("For Loop Finish");
		 
		 //While Loop
		 int i = 0;
		 while(i<10) {
			 
			 System.out.println(i);
			 i+=2;
		 }
		 
		 System.out.println("While Loop Finish");
		 
		 //Do-While Loop
		 int j = 2;
		 do {
			 System.out.println(j);
			 j+=3;
		} while (j<10);
		
		 System.out.println("Do-While Loop Finish");
		 
	}
	

}
