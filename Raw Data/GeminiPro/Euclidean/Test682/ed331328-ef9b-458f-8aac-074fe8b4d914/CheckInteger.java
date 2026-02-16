public class CheckInteger {

    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 10.5;
        double num3 = -3.0;
        double num4 = 0.0;
        double num5 = -2.7;

        System.out.println(num1 + " is integer? " + isInteger(num1)); // Output: true
        System.out.println(num2 + " is integer? " + isInteger(num2)); // Output: false
        System.out.println(num3 + " is integer? " + isInteger(num3)); // Output: true
        System.out.println(num4 + " is integer? " + isInteger(num4)); // Output: true
        System.out.println(num5 + " is integer? " + isInteger(num5)); // Output: false



    }
    
    //Since we can't create helper methods outside main in this exercise, we need to inline the logic:
    public static boolean isInteger(double num) {
        return num == (int) num; 
    }

}
