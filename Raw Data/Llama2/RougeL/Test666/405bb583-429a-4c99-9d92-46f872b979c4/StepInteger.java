public class StepInteger {

    public static void main(String[] args) {
        // Example usage:
        int number = 5;
        int step = 2;

        System.out.println("Stepping " + number + " by " + step + ":");

        for (int i = 0; i <= number; i += step) {
            System.out.println(i);
        }

        // Another Example with a negative step:
        number = 10;
        step = -3; // Negative step

        System.out.println("\nStepping " + number + " by " + step + ":");
        for (int i = number; i >= 0; i += step) { // Adjust loop condition for negative step
            System.out.println(i);
        }



        // Example using a while loop and handling potential infinite loops with negative steps:
        number = 7;
        step = -1;

        System.out.println("\nStepping " + number + " by " + step + " (using while loop):");
        int i = number;
        while ( (step > 0 && i <= number) || (step < 0 && i >=0)  ) { // Condition for both positive and negative steps

                System.out.println(i);
            
                i += step;
                if (step ==0) break; // Important for step 0.


        }
        
    }
}
