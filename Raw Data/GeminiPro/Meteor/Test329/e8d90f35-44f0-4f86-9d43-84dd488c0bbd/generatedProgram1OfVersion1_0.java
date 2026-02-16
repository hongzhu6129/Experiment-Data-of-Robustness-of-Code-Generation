public class StringEndsWith {

    public static void main(String[] args) {
        String str1 = "Python Exercises";
        String str2 = "ses";
        String str3 = "abc";

        // Check if str1 ends with str2
        boolean endsWithStr2 = str1.endsWith(str2);

        // Check if str1 ends with str3
        boolean endsWithStr3 = str1.endsWith(str3);


        System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\"? " + endsWithStr2);
        System.out.println("\"" + str1 + "\" ends with \"" + str3 + "\"? " + endsWithStr3);



        // More examples using command line arguments if provided:

        if (args.length >= 2) {  // Check if at least two arguments are provided.
             String arg1 = args[0]; 
             String arg2 = args[1];

            boolean endsWithArg2 = arg1.endsWith(arg2);
             System.out.println("\"" + arg1 + "\" ends with \"" + arg2 + "\"? " + endsWithArg2);
         } else {
             System.out.println("Please provide two string arguments to check.");
        }


    }
}
