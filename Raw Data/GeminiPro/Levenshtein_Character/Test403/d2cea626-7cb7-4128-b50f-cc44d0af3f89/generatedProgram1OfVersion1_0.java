import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TripleCounter {

    public int noOfTriples(String str) {
        if (str == null || str.length() < 3) {
            return 0;
        }

        int count = 0;
        // Using regex for a more concise solution
        Pattern pattern = Pattern.compile("(.)\\1{2}"); // Matches any character followed by itself twice
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            count++;
        }
       
        return count;


    }

    public static void main(String[] args) {
        TripleCounter tc = new TripleCounter();
        System.out.println(tc.noOfTriples("aaabbccc"));      // Output: 2
        System.out.println(tc.noOfTriples("xxxabyyyycd"));  // Output: 2
        System.out.println(tc.noOfTriples("a"));           // Output: 0
        System.out.println(tc.noOfTriples(""));            // Output: 0
        System.out.println(tc.noOfTriples(null));          // Output: 0
        System.out.println(tc.noOfTriples("ababa"));       // Output: 0
        System.out.println(tc.noOfTriples("aaaa"));        // Output: 1 (only counts non-overlapping triples)
        System.out.println(tc.noOfTriples("aaaaaa"));       // Output: 2
        System.out.println(tc.noOfTriples("abcXXXabc"));   // Output: 1
        System.out.println(tc.noOfTriples("xxxabyyyycdddd"));// Output: 3


    }
}
