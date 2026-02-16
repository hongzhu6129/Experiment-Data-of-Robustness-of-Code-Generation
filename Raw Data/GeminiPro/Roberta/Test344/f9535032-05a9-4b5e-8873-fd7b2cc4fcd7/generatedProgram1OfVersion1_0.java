public class SubstringAtPositions {

    public static void main(String[] args) {
        String str = "This is a test string";
        int start1 = 10;
        int length1 = 4; // Length of the first substring
        int start2 = 2;
        int length2 = 4; // Length of the second substring

        if (start1 >= 0 && start1 + length1 <= str.length() && start2 >= 0 && start2 + length2 <= str.length()) {
            String sub1 = str.substring(start1, start1 + length1);
            String sub2 = str.substring(start2, start2 + length2);


            if (sub1.equals(sub2)) {
                System.out.println("Same substring found at both positions:");
                System.out.println("Substring 1: " + sub1);
                System.out.println("Substring 2: " + sub2);
            } else {
                System.out.println("Substrings at specified positions are different.");
                System.out.println("Substring 1: " + sub1);
                System.out.println("Substring 2: " + sub2);
            }


        } else {
            System.out.println("Invalid start position or length.");
        }


        // Additional examples:
        checkSubstrings("example string", 0, 2, 8, 2);    // Same: "ex"
        checkSubstrings("another test", 3, 4, 0, 4);      // Different
        checkSubstrings("programming", 7, 2, 10, 1);     // Invalid (goes beyond string length)



    }


    // Helper method to encapsulate the substring comparison logic
    // (Strictly speaking not needed for the original problem,
    // but good practice for reusability)
    public static void checkSubstrings(String str, int start1, int length1, int start2, int length2) {
       if (start1 >= 0 && start1 + length1 <= str.length() && start2 >= 0 && start2 + length2 <= str.length()) {
            String sub1 = str.substring(start1, start1 + length1);
            String sub2 = str.substring(start2, start2 + length2);

            if (sub1.equals(sub2)) {
                System.out.println("Same substring found at both positions ("+ start1 + ", " + start2 + "): " + sub1);
            } else {
                System.out.println("Substrings at specified positions (" + start1 + ", " + start2 + ") are different: " + sub1 + ", " + sub2);
            }

        } else {
            System.out.println("Invalid start position or length for string '" + str + "'.");
        }
    }
}


