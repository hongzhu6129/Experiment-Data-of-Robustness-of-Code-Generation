public class DivisibleBy3And5 {

    public static void printDivisibleBy3And5(int start, int end) {
        if (start > end) {
            System.out.println("Invalid range: Start must be less than or equal to end.");
            return;
        }

        System.out.println("Numbers between " + start + " and " + end + " divisible by 3:");
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Numbers between " + start + " and " + end + " divisible by 5:");
        for (int i = start; i <= end; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Numbers between " + start + " and " + end + " divisible by both 3 and 5:");
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printDivisibleBy3And5(1, 100);
    }
}
