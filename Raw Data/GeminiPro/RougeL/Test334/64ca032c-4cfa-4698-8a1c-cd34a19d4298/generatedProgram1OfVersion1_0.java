public class StringToArray {

    public static void main(String[] args) {
        String str = "This is a sample string"; // Example string

        // Method 1: Using toCharArray() method
        char[] charArray1 = str.toCharArray(); 

        System.out.println("Character array using toCharArray():");
        for (char c : charArray1) {
            System.out.print(c);
        }
        System.out.println(); // Newline


        // Method 2: Iterating through the string and assigning to an array
        char[] charArray2 = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray2[i] = str.charAt(i);
        }

        System.out.println("Character array using charAt():");
        for (char c : charArray2) {
            System.out.print(c);
        }
        System.out.println(); // Newline

         //Example with a string from the command line arguments
        if(args.length > 0) {
            String argString = args[0];
            char[] argCharArray = argString.toCharArray();
            System.out.println("Character array from command line argument:");
             for (char c : argCharArray) {
                 System.out.print(c);
             }
            System.out.println();
        }


    }
}
