package customExceptions;

public class OutOfRangeGradeException extends IllegalArgumentException{
	public final static String OVER_EXCEED = "OVER EXCEED";
	public final static String UNDER_EXCEED = "UNDER EXCEED";
	public final static String UNKNOWN = "UNKNOWN";
	
	private String typeOfOut;
	private double grade;
	private String customMessage;
	
	public OutOfRangeGradeException(double g, double max, double min) {
		super("The grade is out of range. ");

		grade = g;
		calculateTypeOfOut(max, min);
		
		customMessage = "The type of Out is "+typeOfOut;
	}
	
	private void calculateTypeOfOut(double mx, double mn) {
		if(grade<mn) {
			typeOfOut = UNDER_EXCEED;
		}else if(grade>mx){
			typeOfOut = OVER_EXCEED;
		}else {
			typeOfOut = UNKNOWN;
		}
	}
	
	@Override
	public String getMessage() {
		String msg;
		msg = super.getMessage() + customMessage;
		return msg;
	}
	
	public double getGrade() {
		return grade;
	}
	
	public String getTypeString() {
		return typeOfOut;
	}
}
