public class StringAdder {

    /**
     * Adds a string to itself a specified number of times, separated by a given substring.
     *
     * @param str       The string to be repeated.
     * @param separator The substring to be used as a separator.
     * @param count     The number of times the string should be repeated.
     * @return The resulting string with repetitions and separators, or an empty string if the count is less than or equal to 0.
     */
    public String addBySeparator(String str, String separator, int count) {
        if (count <= 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(str);
            if (i < count - 1) {
                result.append(separator);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        StringAdder adder = new StringAdder();

        String str1 = "Hello";
        String separator1 = "-";
        int count1 = 3;
        String result1 = adder.addBySeparator(str1, separator1, count1);
        System.out.println(result1); // Output: Hello-Hello-Hello

        String str2 = "World";
        String separator2 = "_";
        int count2 = 5;
        String result2 = adder.addBySeparator(str2, separator2, count2);
        System.out.println(result2); // Output: World_World_World_World_World


        String str3 = "Test";
        String separator3 = "*";
        int count3 = 0; //Test for zero count
        String result3 = adder.addBySeparator(str3, separator3, count3);
        System.out.println(result3); // Output: "" (empty string)


         String str4 = "Java";
        String separator4 = "+";
        int count4 = 1; // Test for count of 1
        String result4 = adder.addBySeparator(str4, separator4, count4);
        System.out.println(result4); // Output: Java
    }
}
