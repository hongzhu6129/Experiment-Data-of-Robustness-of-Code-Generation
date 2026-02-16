public class CheckInteger {

    public static void main(String[] args) {
        double num1 = 5.0;
        double num2 = 5.5;
        double num3 = -3.0;
        double num4 = 0.0;

        System.out.println(num1 + " is an integer: " + isInteger(num1));
        System.out.println(num2 + " is an integer: " + isInteger(num2));
        System.out.println(num3 + " is an integer: " + isInteger(num3));
        System.out.println(num4 + " is an integer: " + isInteger(num4));
    }


    private static boolean isInteger(double num) {
        return num == (int) num; 
    }
}
