import java.util.InputMismatchException;
// ... (rest of the code)

        try {
            int num = scanner.nextInt();
           // ... (rest of the multiplication logic)
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }

// ... (rest of the code)
