public class StringCompareIgnoreCase {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "apple";
        String str4 = "Banana";

        // Using compareToIgnoreCase()
        int result1 = str1.compareToIgnoreCase(str2);
        int result2 = str1.compareToIgnoreCase(str3);
        int result3 = str4.compareToIgnoreCase(str3);

        System.out.println("\"" + str1 + "\" compared to \"" + str2 + "\": " + result1); // Output: 0 (equal)
        System.out.println("\"" + str1 + "\" compared to \"" + str3 + "\": " + result2); // Output: > 0 (str1 comes after str3)
        System.out.println("\"" + str4 + "\" compared to \"" + str3 + "\": " + result3); // Output: < 0 (str4 comes before str3)


        // Illustrating how equalsIgnoreCase() relates to compareToIgnoreCase()
        if (str1.compareToIgnoreCase(str2) == 0) {
            System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\" (ignoring case)"); 
        }

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\" (ignoring case, using equalsIgnoreCase)"); 
        }



        // Demonstrating with user input (if needed - uncomment to use)
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String userInput1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String userInput2 = scanner.nextLine();

        int userComparisonResult = userInput1.compareToIgnoreCase(userInput2);
        System.out.println("Comparison result: " + userComparisonResult);

        scanner.close(); 
        */
    }
}
