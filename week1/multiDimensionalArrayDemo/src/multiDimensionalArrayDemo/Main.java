package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] cities = new String[3][3];
		
		cities[0][0]="İstanbul";
		cities[0][1]="Balıkesir";
		cities[0][2]="Bursa"; 
		cities[1][0]="Ankara";
		cities[1][1]="Konya";
		cities[1][2]="Eskişehir";
		cities[2][0]="İzmir";
		cities[2][1]="Muğla";
		cities[2][2]="Uşak";
		
		for(int i = 0; i<=2; i++) {
			System.out.println("-----------");
			for (int j = 0; j <=2; j++) {
				System.out.println(cities[i][j]);
			}
		}
	

	}

}
