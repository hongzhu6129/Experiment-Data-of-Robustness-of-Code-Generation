 public static double getDoubleInput(Scanner scanner) {
    double number = 0;
    boolean validInput = false;
    while (!validInput) {
        System.out.print("Enter a double: ");
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
            validInput = true;
        } else {
            System.out.println("Invalid input. Please enter a valid double.");
            scanner.next(); 
        }
    }
    return number;
}
