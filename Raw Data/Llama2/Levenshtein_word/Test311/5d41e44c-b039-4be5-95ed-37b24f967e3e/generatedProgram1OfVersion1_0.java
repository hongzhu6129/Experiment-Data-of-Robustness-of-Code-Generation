import java.util.HashMap;
import java.util.Map;

public class SecondMostFrequentChar {

    static char get2ndMostFreq(String str) {
        if (str == null || str.length() < 2) {
            return '\0'; // Return null character if string is too short
        }

        Map<Character, Integer> charFrequency = new HashMap<>();

        for (char c : str.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        int highestFreq = 0;
        int secondHighestFreq = 0;
        char secondMostFreqChar = '\0';

        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > highestFreq) {
                secondHighestFreq = highestFreq;
                secondMostFreqChar = entry.getKey(); // Previous highest becomes 2nd
                highestFreq = frequency;
            
             } else if (frequency > secondHighestFreq && frequency < highestFreq) {
                secondHighestFreq = frequency;
                secondMostFreqChar = entry.getKey();
            }
        }


        return secondMostFreqChar;
    }


    public static void main(String[] args) {
        String str1 = "aabbbcccc";
        char secondMostFreq1 = get2ndMostFreq(str1);
        System.out.println("Second most frequent character in \"" + str1 + "\": " + secondMostFreq1); // Output: b

        String str2 = "aabb";
        char secondMostFreq2 = get2ndMostFreq(str2);
        System.out.println("Second most frequent character in \"" + str2 + "\": " + secondMostFreq2); // Output: a


        String str3 = "bananas";
        char secondMostFreq3 = get2ndMostFreq(str3);
        System.out.println("Second most frequent character in \"" + str3 + "\": " + secondMostFreq3);// Output: b

          String str4 = "a";
        char secondMostFreq4 = get2ndMostFreq(str4);
        System.out.println("Second most frequent character in \"" + str4 + "\": " + secondMostFreq4);// Output: 

    }
}
