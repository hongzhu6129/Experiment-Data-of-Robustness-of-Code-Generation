public class Main {
    public static void main(String[] args) {
        System.out.println("a\ta^2\ta^3\ta^4"); // Print the header row

        for (int a = 1; a <= 4; a++) {
            System.out.print(a + "\t"); // Print the value of 'a'
            System.out.print((int) Math.pow(a, 2) + "\t"); // Print a^2
            System.out.print((int) Math.pow(a, 3) + "\t"); // Print a^3
            System.out.print((int) Math.pow(a, 4) + "\t"); // Print a^4
            System.out.println(); // Move to the next line for the next row
        }
    }
}
