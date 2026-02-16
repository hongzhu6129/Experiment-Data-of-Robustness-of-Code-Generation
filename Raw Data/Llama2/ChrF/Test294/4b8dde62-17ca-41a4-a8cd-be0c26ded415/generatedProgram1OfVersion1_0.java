public class EmptyArray {

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};

        System.out.println("Original array:");
        printArray(names);

        // Method 1: Create a new empty array
        names = new String[0]; 

        System.out.println("\nArray after emptying (method 1):");
        printArray(names);

        // Method 2:  If you want to keep the same array object but remove all elements (set to null)
        String[] names2 = {"Alice", "Bob", "Charlie", "David"};
        for(int i=0; i < names2.length; i++) {
            names2[i] = null;
        }

        System.out.println("\nArray after emptying (method 2):");
        printArray(names2);



    }

    // Helper function to print the array contents
    public static void printArray(String[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty.");
        } else {
            for (String name : arr) {
                System.out.print(name + " ");
            }
            System.out.println();
        }
    }
}
