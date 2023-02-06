
import java.util.Scanner;

public class housePainting {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Please enter the cost per square foot: ");
		double costPerSqFt = scnr.nextInt();
		
		System.out.print("Please enter the length of the house: ");
		double houseLength = scnr.nextInt();
		
		System.out.print("Please enter the width of the house: ");
		double houseWidth = scnr.nextInt();
		
		System.out.print("Please enter the height of the house: ");
		double houseHeight = scnr.nextInt();
		
		System.out.print("Please enter the number of windows: ");
		double numWindows = scnr.nextInt();
		
		System.out.print("Please enter the length of a window: ");
		double windowLength = scnr.nextInt();
		
		System.out.print("Please enter the width of a window: ");
		double windowWidth = scnr.nextInt();
		
		System.out.print("Please enter the number of doors: ");
		double numDoors = scnr.nextInt();
		
		System.out.print("Please enter the length of a door: ");
		double doorLength = scnr.nextInt();
		
		System.out.print("Please enter the width of a door: ");
		double doorWidth = scnr.nextInt();
		
		double surfaceAreaPeak = houseLength * houseWidth + ((0.5) * (houseLength * (houseHeight - houseWidth)));
		
		double surfaceAreaNormal = houseLength * houseWidth;
		
		double surfaceAreaHouse = (2 * surfaceAreaPeak) + (2 * surfaceAreaNormal);
		
		double sqftWindows = numWindows * (windowLength * windowWidth);
		
		double sqftDoors = numDoors * (doorLength * doorWidth);
		
		double sqftNotPainted = sqftWindows + sqftDoors;
		
		double totalSurfaceArea = surfaceAreaHouse - sqftNotPainted;
		
		System.out.println("Your total paintable surface area is " + Math.round(totalSurfaceArea) + " square feet.");
		
		double totalCost = totalSurfaceArea * costPerSqFt;
		System.out.printf("Your estimate is " + Math.round(totalCost) + " dollars.");
		
		
		
		
		
		
		 
		

	}

}
