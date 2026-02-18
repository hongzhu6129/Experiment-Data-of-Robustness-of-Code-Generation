import java.util.*;

public class ReverseOddLengthWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 == 1) {
                StringBuilder sb = new StringBuilder(words[i]);
                words[i] = sb.reverse().toString();
            }
        }

        System.out.println(String.join(" ", words));
    }
}
