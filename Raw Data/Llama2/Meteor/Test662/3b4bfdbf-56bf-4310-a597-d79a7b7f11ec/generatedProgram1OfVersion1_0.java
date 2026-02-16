public class StringArray {

    public static void main(String[] args) {
        int n = 10; // Example length, change as needed

        String[] stringArray = new String[n];

        for (int i = 0; i < n; i++) {
            stringArray[i] = String.valueOf(i);
        }

        // Print the array (optional) to verify the output
        for (String element : stringArray) {
            System.out.print(element + " ");
        }
    }
}
