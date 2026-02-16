public class TimeMeasurement {

    public static void main(String[] args) {

        // Record the start time in nanoseconds
        long startTime = System.nanoTime();

        // The code to be measured
        // Example: Calculate the sum of numbers from 1 to 1000000
        long sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum); // Print the result (optional)


        // Other code to be measured could go here...
        // Example: String concatenation
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += "a";
        }


        // Record the end time in nanoseconds
        long endTime = System.nanoTime();

        // Calculate the elapsed time in nanoseconds
        long elapsedTime = endTime - startTime;

        // Print the elapsed time
        System.out.println("Elapsed time: " + elapsedTime + " nanoseconds");


    }
}
