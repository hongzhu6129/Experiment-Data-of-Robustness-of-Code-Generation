public class StringLength {

    public static void main(String[] args) {
        String str = "example string"; // The input string
        int length = str.length(); // Get the length of the string
        System.out.println("The length of the string is: " + length);


        // Demonstrating with command-line arguments (if provided)
        if (args.length > 0) { 
            String argString = args[0];
            int argLength = argString.length();
            System.out.println("The length of the string passed as an argument is: " + argLength);
        }
    }
}
