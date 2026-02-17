import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// ... (rest of your code)

public static void main(String[] args) throws FileNotFoundException {

     if (args.length > 0) { // Check for filename argument
         File inputFile = new File(args[0]);
         Scanner fileScanner = new Scanner(inputFile);


         while (fileScanner.hasNextDouble()) { // Process each line in the file
             double lat1 = Math.toRadians(fileScanner.nextDouble());
             double lon1 = Math.toRadians(fileScanner.nextDouble());
             double lat2 = Math.toRadians(fileScanner.nextDouble());
             double lon2 = Math.toRadians(fileScanner.nextDouble());

              // ... (rest of your distance calculation and output)
         }
         fileScanner.close(); 
     } else {  // Use standard input if no file specified
        Scanner input = new Scanner(System.in);
        // ... (your original code for interactive input) 
        input.close();
     }



}
