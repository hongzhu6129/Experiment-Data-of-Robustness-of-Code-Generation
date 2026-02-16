public class Faces {

    public static void printFace(int faceType) {
        switch (faceType) {
            case 1: // Smiling face
                System.out.println("  _,-._");
                System.out.println(" / \_/ \\");
                System.out.println("| ( o o ) |");
                System.out.println(" \\  ^  /");
                System.out.println("  `--' ");
                break;
            case 2: // Frowning face
                System.out.println("  _,-._");
                System.out.println(" / \_/ \\");
                System.out.println("| ( o o ) |");
                System.out.println(" \\  v  /");
                System.out.println("  `--' ");
                break;
            case 3: // Surprised face
                System.out.println("  _,-._");
                System.out.println(" / \_/ \\");
                System.out.println("| ( o o ) |");
                System.out.println(" \\  -  /");
                System.out.println("  `--' ");

                break;
            default: // Default face (Neutral)
                System.out.println("  _,-._");
                System.out.println(" / \_/ \\");
                System.out.println("| ( - - ) |");
                System.out.println(" \\  -  /");
                System.out.println("  `--' ");
                break;

        }
    }


    public static void main(String[] args) {
        // Test cases
        System.out.println("Smiling Face:");
        printFace(1);
        System.out.println("\nFrowning Face:");
        printFace(2);
        System.out.println("\nSurprised Face:");
        printFace(3);
        System.out.println("\nDefault/Neutral Face:");
        printFace(0); // Testing the default case
        System.out.println("\nInvalid Input:");
        printFace(4); // Testing an invalid input (should default)
        System.out.println("\nAnother Invalid Input:");
        printFace(-1);  // Testing another invalid input (should default)

    }
}

