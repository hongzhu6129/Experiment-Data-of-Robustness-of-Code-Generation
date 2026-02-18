public class FacePrinterExtended {

    public static void printFace(String type) {
        if (type == null) {
            System.out.println("Error: Face type cannot be null.");
            return; 
        }

        switch (type.toLowerCase()) {
            case "happy":
                System.out.println("  +\"\"\"\"\"+\n [| ^ ^ |]\n  |  -  |\n  | \\_/ |\n  +-----+");
                break;
            case "sad":
                System.out.println("  +\"\"\"\"\"+\n [| o o |]\n  |  ^  |\n  |  _  |\n  +-----+");
                break;
            default:
                System.out.println("Error: Unknown face type: " + type);
        }
    }

    public static void main(String[] args) {
        printFace("happy");
        printFace("sad");
        printFace(null);        // Test null input
        printFace("angry");   // Test invalid input
    }
}
