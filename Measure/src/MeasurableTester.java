
/**
   This program demonstrates the measurable Country class.
*/
public class MeasurableTester
{
   public static void main(String[] args)
   {
     
	  //Countries
	  System.out.println("Countries Data");
	  Measurable[] countries = new Measurable[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);
      double avg=Data.average(countries);
      System.out.println("Average area: " + avg);
      System.out.println("Expected: 239950");
      System.out.println("");
      double maxData = Data.max(countries);
      System.out.println("Maximum area: " + maxData);
      System.out.println("Expected: 513120");
      System.out.println("");
      double minData = Data.min(countries);
      System.out.println("Minimim area: " + minData);
      System.out.println("Expected: 30510");
      System.out.println("");
      
     
      //Bank Accounts
      System.out.println("Bank account data");
      Measurable[] bank = new Measurable[3];
      bank[0] = new BankAccount(176220);
      bank[1] = new BankAccount(513120);
      bank[2] = new BankAccount(30510);
      avg=Data.average(bank);
      System.out.println("Average balance: " + avg);
      System.out.println("Expected: 239950");
      System.out.println("");
      maxData = Data.max(bank);
      System.out.println("Maximum balance: " + maxData);
      System.out.println("Expected: 513120");
      System.out.println("");
      minData = Data.min(bank);
      System.out.println("Minimim area: " + minData);
      System.out.println("Expected: 30510");
      System.out.println("");

      System.out.println();
      System.out.println("Quiz Data");
      Measurable[] quiz = new Quiz[5];
      quiz[0] = new Quiz(95);
      quiz[1] = new Quiz(80);
      quiz[2] = new Quiz(90);
      quiz[3] = new Quiz(50);
      quiz[4] = new Quiz(75);
      
      int averageQuiz;
      averageQuiz = (int) Data.average(quiz);
      System.out.println("Average grade: " + averageQuiz);
      System.out.println("Expected average: 78");
      System.out.println("");
      int maxGrade;
      maxGrade = (int) Data.max(quiz);
      System.out.println("Maximum grade: " + maxGrade);
      System.out.println("Expected max: 95");
      System.out.println("");
      int minGrade = (int) Data.min(quiz);
      System.out.println("Minimum grade: " + minGrade);
      System.out.println("Expected: 50");
   }
}
