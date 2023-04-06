import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
   An action listener that prints a message.
*/
public class ClickListener implements ActionListener{
	
	private Measurable[] objects;
	private int metricToUse;
	

   
   public ClickListener(Measurable[] objects, int metricToUse){
	   this.objects = objects;
	   this.metricToUse = metricToUse; 
      
   }

   public void actionPerformed(ActionEvent event){
	   double result = 0;
	   if (metricToUse == 1) {
		   result = Data.max(objects);
		   
	      
	   }
	   
	   if (metricToUse == 2) {
		   result = Data.min(objects);
		   
	   }
	   
	   if (metricToUse == 3) {
		   result = Data.average(objects);
		   /*System.out.println("Average Account Balance is " + result);
		   System.out.println("Average Country Area is " + result);
		   System.out.println("Average Quiz Score is " + result);
		   System.out.println();*/
	   }
	   
	   String buttonText = " ";
	    
		if (metricToUse == 1) {
	    	buttonText = "Maximum";
	    }
	    
	    else if (metricToUse == 2) {
	    	buttonText = "Minimum";
	    }
		
	    else {
	    	buttonText = "Average";
	    
	    }
		
	   if (objects[0].getClass().getName().equals("BankAccount")) {
		   System.out.println(buttonText + " Account Balance is " + result);
		   
	   }
	   
	   else if (objects[0].getClass().getName().equals("Country")) {
		   System.out.println(buttonText + " Country Area is " + result);
		   
	   }
	   
	   else if (objects[0].getClass().getName().equals("Quiz")) {
		   System.out.println(buttonText + " Quiz Score is " + result);
		   
	   }
	   

   }
   
}