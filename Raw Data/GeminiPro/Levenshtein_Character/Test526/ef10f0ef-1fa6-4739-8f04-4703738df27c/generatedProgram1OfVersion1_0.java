public class DiophantineNumbers {

    public static void main(String[] args) {
        // Diophantine numbers are numbers that can be expressed as the difference of two perfect squares.
        //  n = a^2 - b^2 = (a+b)(a-b)
        //  If we let a-b = 1, then a+b = n, so a = (n+1)/2 and b = (n-1)/2.
        //  Thus, any odd number greater than 1 is a Diophantine number.

        //  If we let a-b = 2, then a+b = n/2, so a = (n/2 + 2)/2 = (n+4)/4 and b = (n-4)/4
        //  Thus, any number divisible by 4, n, where n > 4 is also Diophantine.

        // A more efficient way to generate is to iterate through odd and multiples of 4

        int count = 0;
        int num = 3; // Start with the first odd number greater than 1

        while (count < 10) {
            if (num % 2 != 0 || num % 4 == 0) {
                System.out.println(num);
                count++;
            }
            num++;
        }

    }
}
