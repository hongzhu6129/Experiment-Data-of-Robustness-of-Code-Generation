   import java.util.Scanner; // Import the Scanner class

   public static void main(String[] args) {
       Scanner input = new Scanner(System.in); // Create a Scanner object

       System.out.print("Enter the first number: ");
       double num1 = input.nextDouble();

       System.out.print("Enter the second number: ");
       double num2 = input.nextDouble();

       System.out.print("Enter the third number: ");
       double num3 = input.nextDouble();

       // ... rest of the code (calculate and print average)
       input.close(); // Close the scanner when done
   }
   