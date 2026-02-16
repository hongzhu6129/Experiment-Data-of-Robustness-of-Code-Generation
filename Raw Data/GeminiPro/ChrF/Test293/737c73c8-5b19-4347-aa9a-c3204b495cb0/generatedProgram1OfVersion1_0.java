import java.lang.Math;

public class LogarithmFloor {

    public static void main(String[] args) {
        int originalNumber = 2350;
        int result = (int) (Math.log(originalNumber) / Math.log(2)); // Calculate base-2 logarithm and floor it
		System.out.println("Original Number: " + originalNumber + " Result: " + result);

		originalNumber = 2350;
		result = (int)Math.floor(Math.log(originalNumber)/Math.log(2));
        System.out.println("Original Number: " + originalNumber + " Result: " + result);


    }
}
