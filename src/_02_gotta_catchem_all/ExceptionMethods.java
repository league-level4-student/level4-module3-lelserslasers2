package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	double divide(double num, double num2) throws IllegalArgumentException{
		
		if (num2 == 0) {
			throw new IllegalArgumentException();
		}
		double quo = num / num2;
		return quo;
		
		
	}
	
	String reverseString(String str) throws IllegalStateException {
		
		if (str.equals("")) {
			throw new IllegalStateException();
		}
		String fred = "";
		
		
		for (int i = str.length() - 1; i >= 0; i--) {
			fred = fred + str.toCharArray()[i];
		}
		
		return fred;
		
	}
	
	
}
