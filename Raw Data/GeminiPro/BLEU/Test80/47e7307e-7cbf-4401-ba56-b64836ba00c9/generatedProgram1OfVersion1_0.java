public class TimeExecution {

    public static void main(String[] args) {

        // Method 1: Using System.nanoTime()

        long startTime = System.nanoTime();

        // Code to be measured
        long sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum); // Print the result to prevent optimization

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Execution time (nanoseconds): " + duration);



        // Method 2: Demonstrating potential issues with very short executions

        startTime = System.nanoTime();

        // Very fast code - may show 0 execution time
        int x = 10;
        int y = 20;
        int z = x + y;
        System.out.println("z: " + z); // Print to prevent optimization


        endTime = System.nanoTime();
        duration = endTime - startTime;

        System.out.println("Very fast code execution time (nanoseconds, potentially inaccurate): " + duration);

        // Suggestion for very fast code: Run it multiple times in a loop and average the results.


        // Method 3: Illustrating using System.currentTimeMillis() (less precise, in milliseconds)

        long startMillis = System.currentTimeMillis();

        //Some longer operation - to show difference between nanoTime and currentTimeMillis
         sum = 0;
        for (int i = 0; i < 100000000; i++) {  // Larger loop for demonstration
            sum += i;
        }
         System.out.println("Larger Sum: " + sum);

        long endMillis = System.currentTimeMillis();
        long durationMillis = endMillis - startMillis;

        System.out.println("Execution time (milliseconds): " + durationMillis);


    }
}
