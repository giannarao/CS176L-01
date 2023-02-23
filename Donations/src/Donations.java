

public class Donations {

	private int numIndividual;
	private double amtIndividual;
	private int numBusiness;
	private double amtBusiness;
	private int numOther;
	private double amtOther;

	
	
	public void processDonation(String cat, double donation) {
		if (cat.equals ("<business donation")) {
			cat = "Business";
			
			if (donation > 0) {
				numBusiness = numBusiness + 1;
				amtBusiness = amtBusiness + donation;
			}
			else if (donation < 0) {
				numBusiness = numBusiness - 1;
				amtBusiness = amtBusiness + donation;
			}
		}
		
		else if (cat.equals("<other donation")) {
			cat = "Other";
			if (donation > 0) {
				numOther = numOther + 1;
				amtOther = amtOther + donation;
			}
			else if (donation < 0) {
				numOther = numOther - 1;
				amtOther = amtOther + donation;
			}
	
		}
		
		else if (cat.equals("<individual donation")) {
			cat = "Individual";
			if (donation > 0) {
				numIndividual = numIndividual + 1;
				amtIndividual = amtIndividual + donation;
			}
			else if (donation < 0) {
				numIndividual = numIndividual - 1;
				amtIndividual = amtIndividual + donation;
			}
		}
		
	}
	
	public void getStatistics() {
		System.out.println("Individual: " + "#:" + numIndividual  + " $" + amtIndividual);
		System.out.println("Business: " + "#:" + numBusiness  + " $" + amtBusiness);
		System.out.println("Other: " + "#:" + numOther + " $" + amtOther);
		
				
				
	}

	
	
	
	
}
