public class LowercaseString {

    public static void main(String[] args) {
        String inputString = "ThIs Is A MiXeD CaSe StRiNg."; // Example string

        String lowercaseString = inputString.toLowerCase();

        System.out.println("Original string: " + inputString);
        System.out.println("Lowercase string: " + lowercaseString);


        //  Handling null or empty input (good practice):
        String possiblyNullString = null; 
        String anotherString = "";  // Empty

        // Safe approach:
        if (possiblyNullString != null) {
           System.out.println("Lowercase (null handled): " + possiblyNullString.toLowerCase());
        } else {
           System.out.println("Input string is null.");
        }

       if (!anotherString.isEmpty()) {  // Check if not empty
          System.out.println("Lowercase (empty handled): " + anotherString.toLowerCase());
       } else {
          System.out.println("Input string is empty.");
       }



       //  Working with command-line arguments if provided:
        if (args.length > 0) {
            String commandLineString = String.join(" ", args); // Combine arguments
            System.out.println("Lowercase (from command line): " + commandLineString.toLowerCase());
        }



    }
}
