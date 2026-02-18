   import java.util.InputMismatchException; // Import for InputMismatchException

   // ... (rest of the code)

       try {
           int num = scanner.nextInt();
           printMultiplicationTable(num);
       } catch (InputMismatchException e) {
           System.out.println("Invalid input. Please enter an integer.");
       }

       scanner.close(); 
   