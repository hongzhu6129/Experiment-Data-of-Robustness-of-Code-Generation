public class StringLength {

    public static void main(String[] args) {
        String givenString = "example"; // Replace with your desired string

        int length = givenString.length();

        System.out.println("The length of the string \"" + givenString + "\" is: " + length);


        // Additional examples
        System.out.println("The length of \"Hello World\" is: " + "Hello World".length());
        System.out.println("The length of an empty string is: " + "".length());

        // Using command-line arguments (if provided)
        if (args.length > 0) {
            System.out.println("The length of the string provided as a command-line argument is: " + args[0].length());
        }


    }
}
