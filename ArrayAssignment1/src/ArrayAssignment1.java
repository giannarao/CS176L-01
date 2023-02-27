
public class ArrayAssignment1 {

	public static void main(String[] args) {
		double largestNumber = 0;
		int negativeNumbers = 0;
		int index;
		index = 0;
		double number1 = 0;
		
		
		
		
		double [] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		
		while (index != values.length ) {
			System.out.print(values[index] + " ");
			index = index + 1;
		}
		System.out.println(" ");
		
		for (double x: values) {
			if (number1 < x) {
				number1 = x;
			}
			
			largestNumber = number1;
			
		}
		
		System.out.println("The largest element in the array is " + largestNumber);
		
		for (double x: values) {
			if (x < 0) {
				negativeNumbers = negativeNumbers + 1;
				
			}
		}
		
		System.out.println("There are " + negativeNumbers + " negative numbers in the array");
		
		
		
	}

}
