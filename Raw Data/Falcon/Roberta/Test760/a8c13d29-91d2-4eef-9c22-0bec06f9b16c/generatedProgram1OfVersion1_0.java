import java.util.ArrayList;
import java.util.List;

public class LastNVowels {

    public static void main(String[] args) {
        String str1 = "aeiou";
        int n = 3;
        System.out.println(validate(str1, n)); // Output: iou

        String str2 = "programming";
        n = 2;
        System.out.println(validate(str2, n)); // Output: ai
        
        String str3 = "hello world";
        n= 4;
        System.out.println(validate(str3,n)); // Output: oeo


    }

    public static String validate(String str, int n) {
        List<Character> vowels = new ArrayList<>();
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels.add(c);
            }
        }

        StringBuilder result = new StringBuilder();
        int numVowels = vowels.size();

        if (n > numVowels) {
            for(char vowel : vowels){
                result.append(vowel);
            }
        } else {
            for (int i = numVowels - n; i < numVowels; i++) {
                result.append(vowels.get(i));
            }
        }


        return result.toString();

    }

}
