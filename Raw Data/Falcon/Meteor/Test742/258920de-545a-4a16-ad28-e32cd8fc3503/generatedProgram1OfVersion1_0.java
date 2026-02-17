class Solution {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]);
            int reversedNum = 0;

            while (num != 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }

            System.out.println("Reversed number: " + reversedNum);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid integer.");
        }

    }
}
