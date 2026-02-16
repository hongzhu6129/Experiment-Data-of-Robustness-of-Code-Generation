public class CheckEmptyArray {

    public static void main(String[] args) {
        // Example arrays
        String[] names1 = {}; // Empty array
        String[] names2 = {"Alice", "Bob", "Charlie"}; // Non-empty array
        String[] names3 = null; // Null array (not empty in the strictest sense, but handled similarly)

        // Test and print results for each array
        System.out.println("Is names1 empty? " + isEmpty(names1));
        System.out.println("Is names2 empty? " + isEmpty(names2));
        System.out.println("Is names3 empty? " + isEmpty(names3));

    }

    // Helper method to check if an array is empty (or null)
    private static boolean isEmpty(String[] arr) {
        return arr == null || arr.length == 0;
    }
}
