public class ExtractFirstHalf {

    public static void main(String[] args) {
        String str = "pythonpyt"; // Example string - you can change this

        if (str.length() % 2 == 0) {  // Check if the string has an even number of characters
            String firstHalf = str.substring(0, str.length() / 2);
            System.out.println(firstHalf);
        } else {
            System.out.println("The string must have an even number of characters.");
        }
    }
}
