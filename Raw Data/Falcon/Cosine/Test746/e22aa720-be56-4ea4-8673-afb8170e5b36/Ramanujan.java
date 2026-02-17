public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; // Example upper limit (Ramanujan's number)

        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int a = 1; a * a * a < i; a++) {
                for (int b = a + 1; a * a * a + b * b * b <= i; b++) { // b starts from a+1 to avoid duplicates and ensure distinct pairs
                    if (a * a * a + b * b * b == i) {
                        count++;
                    }
                }
            }

            if (count >= 2) { // Check if the number is the sum of two cubes in at least two different ways
                System.out.println(i + " can be expressed as the sum of two cubes in " + count + " different ways.");


                // Print the pairs for demonstration:
                System.out.print("Pairs: ");
                for (int a = 1; a * a * a < i; a++) {
                    for (int b = a + 1; a * a * a + b * b * b <= i; b++) {
                        if (a * a * a + b * b * b == i) {
                           System.out.print("(" + a + "," + b + ") ");
                        }
                    }
                }
                System.out.println(); // Newline after printing pairs
                return; // Exit after finding the first such number

            }

        }

    }
}
