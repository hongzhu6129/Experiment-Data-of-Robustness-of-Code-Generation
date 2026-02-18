public class SubstringCounter {

    public boolean isAndTheEquality(String str) {
        int andCount = 0;
        int theCount = 0;

        // Handle null or empty input
        if (str == null || str.isEmpty()) {
            return false; // Or throw an exception if that's your preferred handling
        }


        // Efficiently count occurrences using indexOf
        int andIndex = str.indexOf("and");
        while (andIndex != -1) {
            andCount++;
            andIndex = str.indexOf("and", andIndex + 1);
        }

        int theIndex = str.indexOf("the");
        while (theIndex != -1) {
            theCount++;
            theIndex = str.indexOf("the", theIndex + 1);
        }

        return andCount == theCount ;
    }

    public static void main(String[] args) {
        SubstringCounter counter = new SubstringCounter();

        String str1 = "The dog and the cat and the mouse.";
        String str2 = "and the and";
        String str3 = "the and"; // Example where counts are different

        System.out.println("\"" + str1 + "\" - and/the counts equal: " + counter.isAndTheEquality(str1)); // Output: true
        System.out.println("\"" + str2 + "\" - and/the counts equal: " + counter.isAndTheEquality(str2)); // Output: true
        System.out.println("\"" + str3 + "\" - and/the counts equal: " + counter.isAndTheEquality(str3)); // Output: false
        System.out.println("\"" + "" + "\" - and/the counts equal: " + counter.isAndTheEquality(""));      // Output: false



    }
}
