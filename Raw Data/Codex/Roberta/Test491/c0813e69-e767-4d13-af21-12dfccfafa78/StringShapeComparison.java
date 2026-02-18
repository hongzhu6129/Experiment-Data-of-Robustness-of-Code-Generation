public class StringShapeComparison {

    public static void main(String[] args) {
        String shape1 = "  *  \n *** \n*****";
        String shape2 = "  *  \n *** \n*****";
        String shape3 = "  *  \n  *  \n  *  ";

        System.out.println("Shape 1 and Shape 2 are the same: " + compareShapes(shape1, shape2)); // Output: true
        System.out.println("Shape 1 and Shape 3 are the same: " + compareShapes(shape1, shape3)); // Output: false
        System.out.println("Shape 2 and Shape 3 are the same: " + compareShapes(shape2, shape3)); // Output: false

        // Test with nulls and empty strings
        System.out.println("Shape 1 and null are the same: " + compareShapes(shape1, null)); // Output: false
        System.out.println("null and Shape 2 are the same: " + compareShapes(null, shape2)); // Output: false
        System.out.println("null and null are the same: " + compareShapes(null, null)); // Output: true  (Considered same for this problem)

        System.out.println("Shape 1 and empty string are the same: " + compareShapes(shape1, "")); // Output: false
        System.out.println("Empty string and Shape 2 are the same: " + compareShapes("", shape2)); // Output: false
        System.out.println("Empty string and empty string are the same: " + compareShapes("", "")); // Output: true


    }



    public static boolean compareShapes(String shape1, String shape2) {
        if (shape1 == null || shape2 == null) {
            return shape1 == shape2;  // Handles null cases gracefully
        }

        // Normalize the strings by removing leading/trailing whitespace and line breaks:
        String normalizedShape1 = shape1.trim().replaceAll("\\s+", "");
        String normalizedShape2 = shape2.trim().replaceAll("\\s+", "");


        return normalizedShape1.equals(normalizedShape2);
    }
}
