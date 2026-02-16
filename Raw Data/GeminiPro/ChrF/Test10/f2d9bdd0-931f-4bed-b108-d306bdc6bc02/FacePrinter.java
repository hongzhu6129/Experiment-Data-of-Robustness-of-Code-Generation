public class FacePrinter {

    public static void printFace() {
        System.out.println("  +'''''+ ");
        System.out.println(" [ | o o | ]");
        System.out.println("  |   ^   |");
        System.out.println("  |  '-'  |");
        System.out.println("  +-------+");

    }


    public static void main(String[] args) {
        printFace();


       // Test cases (though for simple output, visual inspection is usually sufficient)
        //  You could redirect output to a file and compare against expected output for more automated tests. 
        //  Example: java FacePrinter > output.txt  then compare output.txt with expected_output.txt using a diff tool.

       // Corner cases:  There aren't really corner cases for this particular problem as there's no input.  The output is fixed.
       //  If the face was parameterized (e.g., different eye types, mouth shapes), then you would test those variations.

    }
}
