
public class Microwave {
	int power = 1;
	int time = 0;
	
	

	public void power() {
		power = power + 1;
		System.out.println("Power button was pressed. Power level is " + power + ".");
		
		
	}
	
	public void time() {
		time = time + 30;
		System.out.println("Time button was pressed. Time is " + time + " seconds.");
		
	}
	
	public void reset() {
		power = 1;
		time = 0;
		System.out.println("Reset button was pressed. Power level is " + power + ". Time is " + time + " seconds.");
		
	}
	
	public void start() {
		System.out.println("Cooking for " + time + " seconds at level " + power + ".");
		
		
	}
	
}
