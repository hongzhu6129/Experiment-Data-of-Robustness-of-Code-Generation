public class SumNumbersInString {

    public int sumOfTheNumbers(String str) {
        int sum = 0;
        String currentNumber = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                currentNumber += c;
            } else {
                if (!currentNumber.isEmpty()) {
                    sum += Integer.parseInt(currentNumber);
                    currentNumber = "";
                }
            }
        }

        // Handle any remaining number at the end of the string
        if (!currentNumber.isEmpty()) {
            sum += Integer.parseInt(currentNumber);
        }

        return sum;
    }

    public static void main(String[] args) {
        SumNumbersInString sns = new SumNumbersInString();

        String str1 = "abc123xyz45";
        int sum1 = sns.sumOfTheNumbers(str1);
        System.out.println("Sum of numbers in \"" + str1 + "\": " + sum1); // Output: 168

        String str2 = "aa11b33";
        int sum2 = sns.sumOfTheNumbers(str2);
        System.out.println("Sum of numbers in \"" + str2 + "\": " + sum2); // Output: 44

        String str3 = "77abc88def9";
        int sum3 = sns.sumOfTheNumbers(str3);
        System.out.println("Sum of numbers in \"" + str3 + "\": " + sum3); // Output: 174


         String str4 = ""; // Empty string
        int sum4 = sns.sumOfTheNumbers(str4);
        System.out.println("Sum of numbers in \"" + str4 + "\": " + sum4); // Output: 0

        String str5 = "NoNumbersHere"; // String with no numbers
        int sum5 = sns.sumOfTheNumbers(str5);
        System.out.println("Sum of numbers in \"" + str5 + "\": " + sum5); // Output: 0


    }
}
