public class PrintChars {

    public static void main(String[] args) {
        // Example usage:
        print_Chars('a', 'f', 3);  // Prints a, d
        print_Chars('x', 'z', 1);  // Prints x, y, z 
        print_Chars('Z', 'A', 2);  // Prints Z, X, V... (backwards)
        print_Chars('m', 'j', 2); // Prints m, k, i... (backwards)
    }

    public static void print_Chars(char ch1, char ch2, int n) {
        if (ch1 < ch2) {
            for (char ch = ch1; ch <= ch2; ch += n) {
                System.out.print(ch + ", ");
            }
        } else {
            for (char ch = ch1; ch >= ch2; ch -= n) {
                System.out.print(ch + ", ");
            }
        }
        System.out.println(); // Add a newline for cleaner output
    }
}
