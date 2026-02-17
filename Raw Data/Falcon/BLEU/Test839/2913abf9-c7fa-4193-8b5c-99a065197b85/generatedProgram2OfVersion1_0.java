try {
    values[0] = scanner.nextInt();
} catch (InputMismatchException e) {
    System.err.println("Invalid input. Please enter an integer.");
    scanner.next(); // Clear the invalid input from the scanner
    // You might want to re-prompt the user or exit the program here.
} 
// Similar try-catch for values[1]
