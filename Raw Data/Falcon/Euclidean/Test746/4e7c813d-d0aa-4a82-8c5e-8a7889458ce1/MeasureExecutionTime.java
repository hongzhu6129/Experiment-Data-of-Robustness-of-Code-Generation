public class MeasureExecutionTime {

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        // Code to measure execution time of
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum); // Print the result (optional)


        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Execution time in nanoseconds: " + duration);
    }
}
