public class Print2DBooleanArray {

    public static void main(String[] args) {
        boolean[][] sophisticated = {
                {true, false, true},
                {false, true, false},
                {true, true, false}
        };

        print2DBooleanArray(sophisticated);


        // Another Example
        boolean[][] anotherSophisticated = {
                {false, false},
                {true, true, true},
                {false}
        }; // This demonstrates handling jagged arrays

        System.out.println("\nAnother Example (Jagged Array):");
        print2DBooleanArray(anotherSophisticated);
    }

    public static void print2DBooleanArray(boolean[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { // Iterate based on each row's length
                System.out.print(arr[i][j] ? "t " : "f "); // Print "t" for true, "f" for false
            }
            System.out.println(); // New line after each row
        }
    }
}
