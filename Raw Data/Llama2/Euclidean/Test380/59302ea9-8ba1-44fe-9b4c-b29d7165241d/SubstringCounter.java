public class SubstringCounter {

    public static void main(String[] args) {
        String mainStr = "This is a test string. This string is a test.";
        String subStr = "is";

        int count = count_sub_str_in_main_str(mainStr, subStr);
        System.out.println("The substring '" + subStr + "' appears " + count + " times.");


        mainStr = "abababababa";
        subStr = "aba";
        count = count_sub_str_in_main_str(mainStr, subStr);
        System.out.println("The substring '" + subStr + "' appears " + count + " times.");


        mainStr =  "aaaaa";
        subStr = "aa";
        count = count_sub_str_in_main_str(mainStr, subStr);
        System.out.println("The substring '" + subStr + "' appears " + count + " times.");


    }

    public static int count_sub_str_in_main_str(String mainStr, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // Move past the found substring to avoid overlapping
        }

        return count;
    }
}

