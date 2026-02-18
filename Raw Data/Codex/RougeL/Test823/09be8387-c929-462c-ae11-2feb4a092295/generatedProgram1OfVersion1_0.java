public class CompareNumbers {

    public static void main(String[] args) {
        // Input data (hardcoded for this example, could be taken from user input)
        int num1 = 25;
        int num2 = 39;

        // Comparison
        if (num1 == num2) {
            System.out.println(num1 + " = " + num2);
        } else if (num1 != num2) {
            System.out.println(num1 + " != " + num2); 
            if (num1 < num2) {
                System.out.println(num1 + " < " + num2);
            } else { // num1 > num2
                System.out.println(num1 + " > " + num2);
            }

            if (num1 <= num2) {
                System.out.println(num1 + " <= " + num2);
            } else { // num1 > num2 (already checked above)
                System.out.println(num1 + " > " + num2); // Or just omit this as we printed > before.
            }

        }
    }
}
