public class SumNumbersInString {

    public int sumOfTheNumbers(String str) {
        int sum = 0;
        String numStr = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                numStr += c;
            } else {
                if (!numStr.isEmpty()) {
                    sum += Integer.parseInt(numStr);
                    numStr = "";
                }
            }
        }

        // Handle any remaining digits at the end of the string
        if (!numStr.isEmpty()) {
            sum += Integer.parseInt(numStr);
        }

        return sum;
    }


    public static void main(String[] args) {
        SumNumbersInString sns = new SumNumbersInString();

        String str1 = "abc123xyz45";
        int sum1 = sns.sumOfTheNumbers(str1);
        System.out.println("Sum of numbers in \"" + str1 + "\": " + sum1); // Output: 168

        String str2 = "1a2b3c";
        int sum2 = sns.sumOfTheNumbers(str2);
        System.out.println("Sum of numbers in \"" + str2 + "\": " + sum2); // Output: 6

        String str3 = "hello12world34"; // Example with multiple number sequences
        int sum3 = sns.sumOfTheNumbers(str3);
        System.out.println("Sum of numbers in \"" + str3 + "\": " + sum3); // Output: 46

        String str4 = ""; // Empty String test case
        int sum4 = sns.sumOfTheNumbers(str4);
        System.out.println("Sum of numbers in \"" + str4 + "\": " + sum4); // Output: 0

         String str5 = "noNumbersHere"; // String with no numbers
        int sum5 = sns.sumOfTheNumbers(str5);
        System.out.println("Sum of numbers in \"" + str5 + "\": " + sum5); // Output: 0

        String str6 = "12345"; // String with only numbers
        int sum6 = sns.sumOfTheNumbers(str6);
        System.out.println("Sum of numbers in \"" + str6 + "\": " + sum6); // Output: 12345


    }
}
