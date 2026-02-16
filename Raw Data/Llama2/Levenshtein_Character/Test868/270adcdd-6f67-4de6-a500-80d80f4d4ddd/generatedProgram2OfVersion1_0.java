public class TwinkleTwinkleModified {

    public static void printTwinkleTwinkle(String line1, String line2, String line3, String line4) {
        System.out.println(line1);
        System.out.println("\t" + line2);
        System.out.println("\t\t" + line3);
        System.out.println("\t\t" + line4);
        System.out.println(line1);
        System.out.println("\t" + line2);
    }

    public static void main(String[] args) {
        // Normal case
        printTwinkleTwinkle("Twinkle, twinkle, little star,", "How I wonder what you are!", "Up above the world so high,", "Like a diamond in the sky.");

        // Empty string test cases
        System.out.println("\nTest with empty strings:");
        printTwinkleTwinkle("", "", "", "");
        printTwinkleTwinkle("First line", "", "Third line", "");
        printTwinkleTwinkle(null, null, null, null); //Null string test case
    }
}

