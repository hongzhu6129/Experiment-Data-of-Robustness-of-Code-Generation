public class ExecutionTime {

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        // Code to be timed
        // Example: Calculate the sum of numbers from 1 to 1000000
        long sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);


        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Execution time in nanoseconds: " + executionTime);

        // Or in milliseconds:
        System.out.println("Execution time in milliseconds: " + executionTime / 1000000.0);  // Use a double for more precise ms
    }
}
