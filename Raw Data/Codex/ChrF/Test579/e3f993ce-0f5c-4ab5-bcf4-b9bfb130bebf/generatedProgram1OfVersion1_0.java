class Solution {

    void print_number(int n) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if (n >= 0 && n <= 9) {
            System.out.print(words[n] + " ");
        }
    }


    public void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int num = scanner.nextInt();

        int sumOfDigits = 0;
        int temp = num;

        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }


        temp = sumOfDigits;
        String sumString = String.valueOf(sumOfDigits);
        for (int i = 0; i < sumString.length(); i++){
            print_number(Character.getNumericValue(sumString.charAt(i)));
        }
        
        System.out.println(); // Add a newline for better output formatting


    }
}
