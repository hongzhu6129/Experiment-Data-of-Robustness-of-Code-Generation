public class IterateMultiplicationList {

    public static void main(String[] args) {

        // Example multiplication list (you can change this to any list you want)
        int[][] multiplicationTable = new int[10][10];

        // Populate the multiplication table
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        // Iterate and print the elements
        System.out.println("Multiplication Table:");
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                System.out.print(multiplicationTable[i][j] + "\t"); // \t adds a tab for formatting
            }
            System.out.println(); // Newline after each row
        }


        // Example with an ArrayList (if you prefer using ArrayLists):
        java.util.ArrayList<java.util.ArrayList<Integer>> multiplicationList = new java.util.ArrayList<>();
        for (int i = 1; i <= 5; i++) { // Example: multiplication list up to 5
            java.util.ArrayList<Integer> row = new java.util.ArrayList<>();
            for (int j = 1; j <= 5; j++) {
                row.add(i * j);
            }
            multiplicationList.add(row);
        }
        
        System.out.println("\nMultiplication List (using ArrayList):");
        for (java.util.ArrayList<Integer> row : multiplicationList) {
            for (Integer num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }



    }
}
