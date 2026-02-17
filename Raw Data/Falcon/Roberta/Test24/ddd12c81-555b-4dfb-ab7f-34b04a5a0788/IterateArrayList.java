import java.util.ArrayList;
import java.util.List;

public class IterateArrayList {

    public static void main(String[] args) {

        // Create an ArrayList of strings
        List<String> forms = new ArrayList<>();

        // Add some forms to the list
        forms.add("Circle");
        forms.add("Square");
        forms.add("Triangle");
        forms.add("Rectangle");
        forms.add("Pentagon");


        // Method 1: Using a basic for loop (index-based)
        System.out.println("Iterating using a basic for loop:");
        for (int i = 0; i < forms.size(); i++) {
            System.out.println(forms.get(i));
        }

        System.out.println(); // Add a newline for clarity


        // Method 2: Using an enhanced for loop (for-each loop)
        System.out.println("Iterating using an enhanced for loop:");
        for (String form : forms) {
            System.out.println(form);
        }

        System.out.println(); // Add a newline for clarity

        // Method 3: Using a while loop
        System.out.println("Iterating using a while loop:");
        int i = 0;
        while (i < forms.size()) {
            System.out.println(forms.get(i));
            i++;
        }
        
        System.out.println();

        // Method 4: Using the forEach method with a lambda expression (Java 8+)
        System.out.println("Iterating using forEach and a lambda expression:");
        forms.forEach(form -> System.out.println(form));



        // You can also use an Iterator explicitly, though the above methods are generally preferred for simplicity:
        // Method 5 : Using Iterator
         System.out.println();
        System.out.println("Iterating using an Iterator:");
        java.util.Iterator<String> iterator = forms.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
