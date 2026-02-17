public class SubstringCounter {

    public static void main(String[] args) {
        String mainString = "This is a test string. This string is a test.";
        String subString = "is";

        int count = count_sub_str_in_main_str(mainString, subString);

        System.out.println("The substring '" + subString + "' appears " + count + " times in the main string.");


        mainString = "abababa";
        subString = "aba";
        count = count_sub_str_in_main_str(mainString, subString);
        System.out.println("The substring '" + subString + "' appears " + count + " times in the main string.");


        mainString = "aaaaa";
        subString = "aa";
        count = count_sub_str_in_main_str(mainString, subString);
        System.out.println("The substring '" + subString + "' appears " + count + " times in the main string.");


        mainString = "abc";
        subString = "d";
        count = count_sub_str_in_main_str(mainString, subString);
        System.out.println("The substring '" + subString + "' appears " + count + " times in the main string.");

    }

    public static int count_sub_str_in_main_str(String mainStr, String subStr) {
        int count = 0;
        int index = 0;

        if (subStr == null || subStr.length() == 0) { // Handle empty or null substring
            return 0;
        }


        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // Move past the found substring to avoid overlapping matches. 
        }

        return count;
    }
}
