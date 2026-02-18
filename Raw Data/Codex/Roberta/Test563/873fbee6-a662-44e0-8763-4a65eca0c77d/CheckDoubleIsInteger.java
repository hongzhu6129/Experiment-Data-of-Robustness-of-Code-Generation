public class CheckDoubleIsInteger {

    public static void main(String[] args) {
        // Test cases
        double num1 = 10.0;
        double num2 = 10.5;
        double num3 = -5.0;
        double num4 = -5.7;
        double num5 = 0.0;


        System.out.println(num1 + " is an integer: " + isInteger(num1)); // Output: true
        System.out.println(num2 + " is an integer: " + isInteger(num2)); // Output: false
        System.out.println(num3 + " is an integer: " + isInteger(num3)); // Output: true
        System.out.println(num4 + " is an integer: " + isInteger(num4)); // Output: false
        System.out.println(num5 + " is an integer: " + isInteger(num5)); // Output: true


    }

    public static boolean isInteger(double num) {
        return num == (int) num; 
    }
}
