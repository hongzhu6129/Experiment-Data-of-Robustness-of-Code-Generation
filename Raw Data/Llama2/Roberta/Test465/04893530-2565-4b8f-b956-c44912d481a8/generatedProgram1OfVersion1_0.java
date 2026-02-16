public class StringEndsWith {

    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "World";
        String str3 = "world"; // Case-sensitive check

        // Using endsWith() method
        boolean endsWithStr2 = str1.endsWith(str2);
        boolean endsWithStr3 = str1.endsWith(str3);

        System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\"? " + endsWithStr2);
        System.out.println("\"" + str1 + "\" ends with \"" + str3 + "\"? " + endsWithStr3);


        // Demonstrating alternative approach (without endsWith()) - Useful for understanding
        if (args.length == 2) {  // Taking input from command-line arguments
            str1 = args[0];
            str2 = args[1];

            if (str1.length() >= str2.length()) {
                boolean match = true;
                for (int i = 0; i < str2.length(); i++) {
                    if (str1.charAt(str1.length() - str2.length() + i) != str2.charAt(i)) {
                        match = false;
                        break;
                    }
                }
                System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\"? " + match);


            } else {
                System.out.println("\"" + str1 + "\" cannot end with \"" + str2 + "\" because it's shorter.");
            }
        } else {
            System.out.println("Please provide two strings as command-line arguments.");
        }

    }
}
