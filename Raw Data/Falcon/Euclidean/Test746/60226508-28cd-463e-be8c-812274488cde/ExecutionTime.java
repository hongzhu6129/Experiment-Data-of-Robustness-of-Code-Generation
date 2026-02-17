public class ExecutionTime {

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        // Code to measure execution time for
        long sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum); //  Include output from the timed code

        long endTime = System.nanoTime();

        long duration = (endTime - startTime);

        System.out.println("Execution time in nanoseconds: " + duration);


    }
}
