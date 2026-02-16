public class IterateMultiplicationList {

    public static void main(String[] args) {

        // Example multiplication list (you can change this to any list)
        int[][] multiplicationTable = new int[10][10];

        // Populate the multiplication table (example)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        // Iterate and print elements using nested loops (traditional approach)
        System.out.println("Iterating using nested loops:");
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                System.out.print(multiplicationTable[i][j] + "\t"); // Print with tab spacing
            }
            System.out.println(); // Newline after each row
        }


        // Iterate using enhanced for loop (for simpler iteration)
        System.out.println("\nIterating using enhanced for loop:");
        for (int[] row : multiplicationTable) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }


         // Example with a different kind of list (a list of lists - more flexible)
        java.util.List<java.util.List<Integer>> dynamicMultiplicationList = new java.util.ArrayList<>();
        for(int i = 1; i <= 5; i++){  // Example: up to 5x5
            java.util.List<Integer> row = new java.util.ArrayList<>();
            for(int j = 1; j <=5; j++){
                row.add(i*j);
            }
            dynamicMultiplicationList.add(row);
        }

        System.out.println("\nIterating through a List of Lists:");
        for(java.util.List<Integer> row : dynamicMultiplicationList){
            for(int element : row){
                System.out.print(element + "\t");
            }
            System.out.println();
        }

    }
}
