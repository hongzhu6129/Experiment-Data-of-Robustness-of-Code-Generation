public class DiophantineNumbers {

    public static void main(String[] args) {
        // Diophantine numbers are numbers that can be expressed as the difference of two positive integer squares.
        //  x = a^2 - b^2

        // We'll generate and display the first 10 such numbers efficiently:

        int count = 0;
        int n = 1;

        while (count < 10) {
            for (int a = n + 1; ; a++) { // Start 'a' from n+1 to ensure a positive difference
                int diff = a * a - n * n;

                //Check if the difference is a Diophantine number
                if (diff > 0) {
                    System.out.println(diff);
                    count++;
                    if (count >= 10) {
                        break;
                    }
                 }
            }

            n++; 
        }
    }
}
