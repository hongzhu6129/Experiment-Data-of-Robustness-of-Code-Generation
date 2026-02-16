public class AbsoluteValueConverter {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = -10;
        int num3 = 0;

        System.out.println("Absolute value of " + num1 + " is: " + convert(num1));
        System.out.println("Absolute value of " + num2 + " is: " + convert(num2));
        System.out.println("Absolute value of " + num3 + " is: " + convert(num3)); 
    }

    public static int convert(int num) {
        if (num < 0) {
            return -num; // If negative, multiply by -1 to get positive
        } else {
            return num; // If positive or zero, return the original number
        }
    }
}
