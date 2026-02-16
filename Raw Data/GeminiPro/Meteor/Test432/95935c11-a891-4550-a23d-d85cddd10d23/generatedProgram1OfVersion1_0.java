import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SumEvenOdd {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        // Example list � populate as needed
        for (int i = 1; i <= 20; i++) {
            numbers.add(i);
        }

        ForkJoinPool forkJoinPool = new ForkJoinPool();

        SumCalculator sumCalculator = new SumCalculator(numbers, 0, numbers.size());

        Result result = forkJoinPool.invoke(sumCalculator);

        System.out.println("Sum of even numbers: " + result.evenSum);
        System.out.println("Sum of odd numbers: " + result.oddSum);

    }


    private static class SumCalculator extends RecursiveTask<Result> {
        private final List<Integer> numbers;
        private final int start;
        private final int end;

        public SumCalculator(List<Integer> numbers, int start, int end) {
            this.numbers = numbers;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Result compute() {
            if (end - start <= 10) {  // Threshold for sequential processing
                int evenSum = 0;
                int oddSum = 0;

                for (int i = start; i < end; i++) {
                    if (numbers.get(i) % 2 == 0) {
                        evenSum += numbers.get(i);
                    } else {
                        oddSum += numbers.get(i);
                    }
                }

                return new Result(evenSum, oddSum);
            } else {  // Recursive split
                int mid = (start + end) / 2;

                SumCalculator leftTask = new SumCalculator(numbers, start, mid);
                SumCalculator rightTask = new SumCalculator(numbers, mid, end);


                rightTask.fork();  // Asynchronous execution


                Result leftResult = leftTask.compute();
                Result rightResult = rightTask.join();

                return new Result(
                        leftResult.evenSum + rightResult.evenSum,
                        leftResult.oddSum + rightResult.oddSum
                );


            }

        }


    }

    private static class Result {  // Helper class to hold both sums
        int evenSum;
        int oddSum;

        public Result(int evenSum, int oddSum) {
            this.evenSum = evenSum;
            this.oddSum = oddSum;
        }
    }

}
