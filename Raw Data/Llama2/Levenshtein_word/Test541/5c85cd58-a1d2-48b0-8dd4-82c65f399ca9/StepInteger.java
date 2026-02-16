public class StepInteger {

    public static void main(String[] args) {
        // Example usage:
        int number = 5;
        step(number); // Output: 0 1 2 3 4 5

        number = -3;
        step(number); // Output: -3 -2 -1 0


        number = 0;
        step(number);  // Output: 0
    }


    public static void step(int number) {
        if (number >= 0) {
            for (int i = 0; i <= number; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = number; i <= 0; i++) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Add a newline for cleaner output
    }
}
