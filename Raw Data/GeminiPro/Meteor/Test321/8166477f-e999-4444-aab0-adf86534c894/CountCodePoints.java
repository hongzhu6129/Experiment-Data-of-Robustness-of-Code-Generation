public class CountCodePoints {

    public static void main(String[] args) {
        String text = "This is a string with some special characters \uD83D\uDE0A and \uD83C\uDF0E.";
        int startIndex = 10; // Starting index of the range
        int endIndex = text.length() - 5; // Ending index of the range (arbitrary example)

        System.out.println("Original String: " + text);
        System.out.println("Range to check: from index " + startIndex + " to index " + endIndex);

        // Use the codePointCount method to count code points in the specified range
        int codePointCount = text.codePointCount(startIndex, endIndex);

        System.out.println("Number of Unicode code points in the specified range: " + codePointCount);
    }
}
