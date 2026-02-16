// Example of an improved version with a variable face part

public class FacePrinterImproved {

    public static void main(String[] args) {
        String eyes = "| o o |";  // Store the eyes in a variable
        printFace(eyes);

        eyes = "| x x |"; // Change the eyes
        printFace(eyes); // Print a different face
    }

    public static void printFace(String eyes) { // Take the eyes as a parameter
        System.out.println("  +\"\"\"\"+");
        System.out.println(" [" + eyes + "]"); // Use the eyes variable
        System.out.println("  |  ^  |");
        System.out.println("  | '-' |");
        System.out.println("  +-----+");
    }
}
