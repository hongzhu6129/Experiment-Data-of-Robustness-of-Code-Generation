public class DivisibleBy3And5 {

    public static void main(String[] args) {

        System.out.println("Numbers divisible by 3:");
        printDivisibleBy(3, 1, 100);

        System.out.println("\nNumbers divisible by 5:");
        printDivisibleBy(5, 1, 100);

        System.out.println("\nNumbers divisible by both 3 and 5:");
        printDivisibleByBoth(3, 5, 1, 100);
    }

    public static void printDivisibleBy(int divisor, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % divisor == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // New line for readability
    }

    public static void printDivisibleByBoth(int divisor1, int divisor2, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % divisor1 == 0 && i % divisor2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // New line for readability
    }
}



