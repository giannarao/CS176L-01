import java.util.ArrayList;

public class Medals {
	public static void main(String[] args) {
		
		
		final int COUNTRIES = 8;
		final int MEDALS = 3;
		
		int acrossTotals = 0;
		
		String[] countries = {
				"Canada",
				"Italy",
				"Germany",
				"Japan",
				"Kazakhstan",
				"Russia",
				"South Korea",
				"United States"
		};
				
		
		int [][] counts = {
				{0, 3, 0},
				{0, 0, 1},
				{0, 0, 1},
				{1, 0, 0},
				{0, 0, 1},
				{3, 1, 1},
				{0, 1, 0},
				{1, 0, 1}
		};
		
		
		
		System.out.println("        Country    Gold    Silver   Bronze   Total");
		
		
		for (int i = 0; i < COUNTRIES; i++){
	         System.out.printf("%15s", countries[i]);
	         
	         for (int j = 0; j < MEDALS; j++){
	        	 System.out.printf("%8d", counts[i][j]);
	  			}
	         System.out.printf("%8d", counts[i][0] + counts[i][1] + counts[i][2]);
	         System.out.println();
	  			
	  			
	  		}
         
		System.out.print("          Total       ");
	
		for (int j = 0; j < MEDALS; j++){
			acrossTotals = counts[0][j] + counts[1][j] + counts[2][j] + counts[3][j] + counts [4][j] + counts[5][j] + counts[6][j] + counts[7][j];
			System.out.print(acrossTotals + "       ");
			
		}
		
		System.out.print("15");
		

	}
}
