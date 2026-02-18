import java.util.ArrayList;
import java.util.List;

public class IterateArrayList {

    public static void main(String[] args) {

        // Create an ArrayList of strings
        List<String> forms = new ArrayList<>();
        forms.add("Circle");
        forms.add("Square");
        forms.add("Triangle");
        forms.add("Rectangle");

        // Method 1: Using a basic for loop (index-based)
        System.out.println("Using basic for loop:");
        for (int i = 0; i < forms.size(); i++) {
            System.out.println(forms.get(i));
        }

        // Method 2: Using an enhanced for loop (for-each loop)
        System.out.println("\nUsing enhanced for loop:");
        for (String form : forms) {
            System.out.println(form);
        }


        // Method 3: Using a while loop (index-based)
        System.out.println("\nUsing while loop:");
        int i = 0;
        while (i < forms.size()) {
            System.out.println(forms.get(i));
            i++;
        }



        // Method 4: Using Java 8 streams and forEach
        System.out.println("\nUsing Java 8 Stream forEach:");
        forms.stream().forEach(System.out::println);



        // Method 5: Using an Iterator
        System.out.println("\nUsing Iterator:");
        java.util.Iterator<String> iterator = forms.iterator();
        while (iterator.hasNext()) {
            String form = iterator.next();
            System.out.println(form);
        }


        //Example with different data type (Integer)
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("\nIterating through Integer ArrayList:");
        for(Integer num : numbers) {
            System.out.println(num);
        }


    }
}
