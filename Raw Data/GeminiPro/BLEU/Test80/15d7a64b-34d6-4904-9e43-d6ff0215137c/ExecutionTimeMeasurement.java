public class ExecutionTimeMeasurement {

    public static void main(String[] args) {
        // Get the starting time in nanoseconds (higher precision)
        long startTime = System.nanoTime();

        // Code to be measured
        // Example: calculating the sum of numbers from 1 to 1000000
        long sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum); // Print the result (optional)

        // Get the ending time in nanoseconds
        long endTime = System.nanoTime();

        // Calculate the elapsed time in nanoseconds
        long elapsedTimeNano = endTime - startTime;

        // Convert nanoseconds to microseconds
        long elapsedTimeMicro = elapsedTimeNano / 1000;

        System.out.println("Execution time: " + elapsedTimeMicro + " microseconds");


        // Alternative, less precise way using milliseconds:
        long startTimeMillis = System.currentTimeMillis();
        // Your code here... (same code as above)
        long endTimeMillis = System.currentTimeMillis();
        long elapsedTimeMillis = endTimeMillis - startTimeMillis;
        System.out.println("Execution time (milliseconds): " + elapsedTimeMillis +" milliseconds");


    }
}
