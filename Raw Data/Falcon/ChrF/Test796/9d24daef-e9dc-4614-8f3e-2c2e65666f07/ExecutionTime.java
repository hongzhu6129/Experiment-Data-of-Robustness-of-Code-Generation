public class ExecutionTime {

    public static void main(String[] args) {
        // Record the start time in nanoseconds
        long startTime = System.nanoTime();

        // The code to be measured goes here
        // Example: Calculate the sum of numbers from 1 to 1000000
        long sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum); // Print the result (optional)


        // More code to be measured could go here...
        String testString = "";
        for (int i = 0; i < 100000; i++) {
            testString += "a"; // Simulate some string operations
        }

        // Record the end time in nanoseconds
        long endTime = System.nanoTime();

        // Calculate the elapsed time in nanoseconds
        long elapsedTime = endTime - startTime;

        System.out.println("Execution time in nanoseconds: " + elapsedTime);



    }
}
