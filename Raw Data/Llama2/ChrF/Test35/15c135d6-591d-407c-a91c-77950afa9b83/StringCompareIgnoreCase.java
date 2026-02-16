public class StringCompareIgnoreCase {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";
        String str3 = "World";

        // Using equalsIgnoreCase()
        boolean areEqual12 = str1.equalsIgnoreCase(str2);
        boolean areEqual13 = str1.equalsIgnoreCase(str3);

        System.out.println("\"" + str1 + "\" equalsIgnoreCase \"" + str2 + "\": " + areEqual12); // Output: true
        System.out.println("\"" + str1 + "\" equalsIgnoreCase \"" + str3 + "\": " + areEqual13); // Output: false


        // Demonstrating with command-line arguments (optional)
        if (args.length == 2) {
            boolean areEqualArgs = args[0].equalsIgnoreCase(args[1]);
            System.out.println("\"" + args[0] + "\" equalsIgnoreCase \"" + args[1] + "\": " + areEqualArgs);
        } else {
            System.out.println("To compare strings from command-line arguments, provide exactly two arguments.");
        }
    }
}
