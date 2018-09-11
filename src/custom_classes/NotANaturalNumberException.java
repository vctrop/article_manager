package custom_classes;

public class NotANaturalNumberException extends Exception {
	public NotANaturalNumberException(String message) {
		super(message);
		
	}
	public static boolean isValid(String num) {
	    try {
	        int i = Integer.parseInt(num);
	        if (i < 0) {
	            return false;
	        }
	    } catch (NumberFormatException e) {
	        return false;
	    }
	    return true;
	}
}
