package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	double testDivideByZeroException(double num, double num2) {
		
		try {
			double quo = num / num2;
		}
		catch (IllegalArgumentException e){
			System.out.println("THATS BAD");
		}
		
		return 0.0;
	}
}
