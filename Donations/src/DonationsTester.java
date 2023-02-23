import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DonationsTester {

	public static void main(String[] args)throws FileNotFoundException {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Would you like to process donations now? (enter ‘Yes’ to continue): ");
		
		String response;
		response = scnr.next().toLowerCase();
		
		if (!response.equals ("yes")) {
			System.out.println("Ending now without processing donations");
			
		}
		
		else {
		
		
		
		File inputFile = new File("Donations.txt");
		Scanner in = new Scanner(inputFile);
		
		Donations giveToMe = new Donations();
		
		while (in.hasNextLine()) {
			String what = in.nextLine();
			
			String [] result = what.split(">");
			
			if (result[0].equals("<EOF")) {
				break;
			}
			
			double num = Double.parseDouble(result[1]);
			giveToMe.processDonation(result[0], num); 
			
		}
		giveToMe.getStatistics();
		
		}

	}

}
