public class GetCharacterBeforeIndex {

    public static void main(String[] args) {
        String str = "Hello World";
        int index = 6; // Example index

        if (index > 0 && index <= str.length()) {
            int codePoint = str.codePointBefore(index);
            System.out.println("Character before index " + index + ": " + (char) codePoint); // Cast to char for printing
        } else {
            System.out.println("Invalid index.");
        }


        // More examples
        str = "Java Exercises";
        index = 5; 
        if (index > 0 && index <= str.length()) {
            int codePoint = str.codePointBefore(index);
            System.out.println("Character before index " + index + ": " + (char) codePoint); // Cast to char for printing
        } else {
            System.out.println("Invalid index.");
        }

        str =  "w3resource.com";
        index = 1;
        if (index > 0 && index <= str.length()) {
            int codePoint = str.codePointBefore(index);
            System.out.println("Character before index " + index + ": " + (char) codePoint); // Cast to char for printing
        } else {
            System.out.println("Invalid index.");
        }
    }
}
