public class SumOfDigits {

    void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        String sumString = String.valueOf(sum);
        for (int i = 0; i < sumString.length(); i++) {
            print_number(Character.getNumericValue(sumString.charAt(i)));
        }

        scanner.close();
    }



    void print_number(int digit) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        if (digit >= 0 && digit <= 9) {
            System.out.print(words[digit] + " ");
        } else {
            System.out.println("Invalid digit"); // Handle invalid input if needed
        }
    }



}
