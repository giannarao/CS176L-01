
public class Quiz implements Measurable{

	private int grade;
	
	
	public Quiz(int grade) {
		this.grade = grade;
	}
	
	@Override
	public double getMeasure() {
		
		return grade;
	}

}
