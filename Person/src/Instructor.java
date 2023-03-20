
public class Instructor extends Person {
	double salary; 
	 

	/**
	   An instructor is represented by a name, a birth year, and a salary.
	   You must enter the class name, instance variable(s), and constructor below
	*/

	public Instructor(String name, int birthYear, double salary){
		super(name, birthYear);
		this.salary = salary;
	}

	
	
	   /**
	      Returns the string representation of the object.
	      @return a string representation of the object
	   */

	public String toString()
	   {
	      return "Instructor[super=" + super.toString() + ",salary=" + salary + "]";
	   }
}
