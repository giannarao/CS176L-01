import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Scanner;
import java.util.Set;

public class MeasurableViewer {
	
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 200;
	

	public static void main(String[] args) {
		System.out.println("Enter metric to use, 1 for maximum, 2 for minimum, 3 for average: ");
		
		
	    
		
		JFrame frame = new JFrame();
	    JPanel panel = new JPanel();
	    frame.add(panel);
	    
	    Measurable[] countries = new Measurable[3];
	    countries[0] = new Country("Uruguay", 176220);
	    countries[1] = new Country("Thailand", 513120);
	    countries[2] = new Country("Belgium", 30510);
	   // double avg=Data.average(countries);
	    
	    Measurable[] bank = new Measurable[3];
	    bank[0] = new BankAccount(176220);
	    bank[1] = new BankAccount(513120);
	    bank[2] = new BankAccount(30510);
	   // avg=Data.average(bank);
	    
	    Measurable[] quiz = new Quiz[5];
	    quiz[0] = new Quiz(95);
	    quiz[1] = new Quiz(80);
	    quiz[2] = new Quiz(90);      
	    quiz[3] = new Quiz(50);
	    quiz[4] = new Quiz(75);
	   // int averageQuiz;
	    //averageQuiz = (int) Data.average(quiz);
	    
	    
	    Scanner scnr = new Scanner(System.in);
	    int metricToUse = scnr.nextInt();
	    

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
	    
	    JButton button1 = new JButton("Get " + buttonText + " Balance");
	   	panel.add(button1);
	    
	   	JButton button2 = new JButton("Get " + buttonText + " Area");
	   	panel.add(button2);
	    
	   	JButton button3 = new JButton("Get " + buttonText + " Score");
    	panel.add(button3);
	    
	    
	    ActionListener listener1 = new ClickListener(bank, metricToUse);      
	    button1.addActionListener(listener1);
	    
	    ActionListener listener2 = new ClickListener(countries, metricToUse);      
	    button2.addActionListener(listener2);
	    
	    ActionListener listener3 = new ClickListener(quiz, metricToUse);      
	    button3.addActionListener(listener3);
	    
	    
	    
	    frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	    
	    
	    
	    

	}

}
