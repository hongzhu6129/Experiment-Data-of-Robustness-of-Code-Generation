import java.util.InputMismatchException; // Import for exception handling
// ... (rest of the code)

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num;

    while (true) {  // Loop until valid input
        System.out.print("Enter an integer: ");
        try {
            num = scanner.nextInt();
            break; // Exit loop if input is valid
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // Clear the invalid input from the scanner
        }
    }

    printMultiplicationTable(num);
    scanner.close();
}

// ... (rest of the code)
