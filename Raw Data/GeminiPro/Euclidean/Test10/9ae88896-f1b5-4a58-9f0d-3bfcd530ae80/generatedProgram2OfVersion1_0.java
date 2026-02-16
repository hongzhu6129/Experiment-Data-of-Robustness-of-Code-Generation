public class TestableFacePrinter {

    public static String getFaceString() {
        return "  +\"\"\"\"\"+\n [| o o |] \n  |  ^  | \n  | '-' | \n  +-----+";
    }

    public static void printFace() {
        System.out.println(getFaceString());
    }


    public static void main(String[] args) {
        printFace();
    }
}
