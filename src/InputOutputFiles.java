import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;

public class InputOutputFiles{
	
	   
   public static void main(String[] args) throws FileNotFoundException {
	   
	   //File inputFile = new File("C:\\Users\\geckert\\Downloads\\e02\\student\\lines.txt");
       PrintWriter outputFile = new PrintWriter(System.out);
       
       
       Scanner inputFile = new Scanner(System.in);
       System.out.println("Please enter the path to open the input file for example C:\\\\Downloads\\\\lines.txt : ");
       
       
       while (inputFile.hasNext()) {
    	   
    try {
    	 File file = new File(inputFile.nextLine());
    	 inputFile = new Scanner(file);
         while (inputFile.hasNext()) {
             String what = inputFile.next();
             outputFile.println(what);
         }
         
         outputFile.close();
         }
     
     catch(Exception exception) {
       System.out.println("File not found, please try again");
       System.out.println("Please enter the path to open the input file for example C:\\\\Downloads\\\\lines.txt : ");
     
     }
       }
       
     
     PrintWriter writer1 =null;      
     writer1 = new PrintWriter(new File("output.txt"));  
     writer1.write(inputFile.nextLine());
     
     while (inputFile.hasNext()) {
    	 outputFile.write(inputFile.nextLine());
     }
      
      
       
     
   }
   
   
   
}
