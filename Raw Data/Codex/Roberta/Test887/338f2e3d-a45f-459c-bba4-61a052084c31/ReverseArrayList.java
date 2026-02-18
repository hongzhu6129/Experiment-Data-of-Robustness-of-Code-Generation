import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {

    public static void main(String[] args) {

        // 1. Creating an ArrayList
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Original ArrayList: " + numbers);


        // 2. Reversing using Collections.reverse()
        Collections.reverse(numbers); 
        System.out.println("Reversed using Collections.reverse(): " + numbers);



        // 3. Reversing using a loop (manual reversal)
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(10);
        numbers2.add(20);
        numbers2.add(30);
        numbers2.add(40);
        numbers2.add(50);

        List<Integer> reversedNumbers2 = new ArrayList<>();

        for (int i = numbers2.size() - 1; i >= 0; i--) {
            reversedNumbers2.add(numbers2.get(i));
        }

        System.out.println("Original ArrayList: " + numbers2);
        System.out.println("Reversed using a loop: " + reversedNumbers2);




        // 4. Reversing part of an ArrayList (using subList and Collections.reverse())
        List<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        letters.add("F");


        // Reverse only elements from index 1 (inclusive) to 4 (exclusive)
        Collections.reverse(letters.subList(1, 4)); // Reverses "B", "C", "D"

        System.out.println("Original ArrayList: " + letters);  // Output will be [A, D, C, B, E]
        System.out.println("Partially reversed (indices 1 to 3): " + letters); 




       //5. Reversing using a custom method within main (not ideal, but demonstrates the logic):
        List<Integer> numbers3 = new ArrayList<>();
        numbers3.add(100);
        numbers3.add(200);
        numbers3.add(300);

        reverseArrayListInPlace(numbers3);  //modifies the original list

        System.out.println("Original ArrayList: " + numbers3);
        System.out.println("Reversed In-place using custom method: " + numbers3);


    }

    //Custom method to reverse in place (within main - not a best practice generally but OK for this educational example)
    public static void reverseArrayListInPlace(List<Integer> list) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            Integer temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }



}
