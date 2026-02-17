public static void main(String[] args) {
    // ... existing code ...

    // Example test case:
    System.out.println("\nTest case: Divisible by 150:"); // Expecting no output between 1 and 100
    printDivisibleBy(150);

   // Example test case:
    System.out.println("\nTest case: Divisible by 0 (should not crash):"); 
    printDivisibleBy(0); // This will throw ArithmeticException, so you need to modify printDivisibleBy to handle that.

}
