import java.util.Random;

// ... (rest of the code)

public static void printMatrix(int n) {
    Random random = new Random();
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(random.nextInt(100) + " "); // Prints random numbers 0-99
        }
        System.out.println();
    }
}
