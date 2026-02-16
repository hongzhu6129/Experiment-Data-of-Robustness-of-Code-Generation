public class PrintFacing {

    public static void main(String[] args) {
        printFace(":|"); // Standard face
        printFace(":)"); // Happy face
        printFace(":("); // Sad face
        printFace(":O"); // Surprised face
        printFace("");   // Empty face - corner case
        printFace(" ");  // Single space face - corner case
        printFace(null); // Null face - corner case, handles gracefully.
        printFace(":-)"); // Winking happy face.
        printFace(":-("); // Sad face variant.
        printFace(":D"); // Big grin.



    }

    public static void printFace(String face) {
        if (face == null) {
            System.out.println("  _  ");
            System.out.println(" ( ) ");
            System.out.println("  -  ");
            System.out.println("  ~  ");
            return; // Exit early to avoid NullPointerException.
        }



        System.out.println("  _  ");
        System.out.println(" (" + face + ") ");
        System.out.println("  -  ");
        System.out.println("  ~  ");




    }
}
