public class DoubleArray {

    public static void main(String[] args) {
        int n = 10; // Example: Create an array with 10 elements (0 to 9)
        if (n <= 0) {
            System.out.println("Array length must be greater than 0.");
            return;
        }

        double[] myArray = new double[n];

        for (int i = 0; i < n; i++) {
            myArray[i] = i; 
        }

        // Print the array to verify (optional)
        System.out.print("Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
