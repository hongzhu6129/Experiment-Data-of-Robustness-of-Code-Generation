public class DivideTwoNumbers {

    public static void main(String[] args) {
        int numerator = 50;
        int denominator = 3;

        if (denominator == 0) {
            System.out.println("Error: Division by zero.");
        } else {
            int result = numerator / denominator;
            System.out.println(result); // Output: 16
        }
    }
}
