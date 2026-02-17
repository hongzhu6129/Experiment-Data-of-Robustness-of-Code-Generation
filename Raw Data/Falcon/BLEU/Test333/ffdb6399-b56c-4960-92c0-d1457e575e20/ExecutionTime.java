public class ExecutionTime {

    public static void main(String[] args) {

        // Record the start time in nanoseconds
        long startTime = System.nanoTime();

        // Code to be measured
        // Example: Calculating the sum of numbers from 1 to 1000000
        long sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum); // Print the result (optional)


        // Record the end time in nanoseconds
        long endTime = System.nanoTime();

        // Calculate the execution time in nanoseconds
        long executionTime = endTime - startTime;

        // Print the execution time
        System.out.println("Execution time: " + executionTime + " nanoseconds");


        //Another slightly more accurate way is to use System.currentTimeMillis to measure execution time in milliseconds
        //This is generally preferred over nanoTime for benchmarking as it's less susceptible to issues
        long startMillis = System.currentTimeMillis();
        //The code you want to measure the execution time of goes here:
         sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            sum += i;
        }
        long endMillis = System.currentTimeMillis();
        long timeTakenMillis = endMillis - startMillis;

        System.out.println("Time taken in milliseconds: " + timeTakenMillis);



    }
}
