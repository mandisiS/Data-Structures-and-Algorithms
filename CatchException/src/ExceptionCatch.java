//Demonstrating exception catching
public class ExceptionCatch {

	public static void main(String[] args) {
		int n = 14;					//default n value
		try {
			n = Integer.parseInt(args[0]);
			if (n <= 0) {
				System.out.println("n must be positive. Using default.");
				n = 14;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No argument specified for n. Using default.");
		} catch (NumberFormatException e) {
			System.out.println("Invalid integer argument. Using default.");
		}
	}// end main
}// end class
