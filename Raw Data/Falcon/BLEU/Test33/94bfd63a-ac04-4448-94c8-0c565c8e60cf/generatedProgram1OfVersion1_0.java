import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayListEducational {

    public static void main(String[] args) {

        // 1. Creating an ArrayList
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);
        numbers.add(4);


        System.out.println("Original ArrayList: " + numbers);

        // 2. Sorting using Collections.sort() - Natural Ordering (Ascending)
        Collections.sort(numbers); 

        System.out.println("Sorted ArrayList (Ascending): " + numbers);


        // 3. Sorting using Collections.sort() with a Comparator (Descending)
        Collections.sort(numbers, Collections.reverseOrder()); // Use reverseOrder for descending

        System.out.println("Sorted ArrayList (Descending): " + numbers);



        // Example with Strings:
        List<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("Bob");
        names.add("Alice");
        names.add("David");

        System.out.println("\nOriginal String ArrayList: " + names);

        Collections.sort(names);  // Sorts strings alphabetically (lexicographically)

        System.out.println("Sorted String ArrayList: " + names);


        // 4. Custom Sorting (Example: Sorting objects by a specific field)
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 20));
        people.add(new Person("Charlie", 30));

        System.out.println("\nOriginal People ArrayList: " + people);

        // Sort by age (using a custom Comparator with a lambda expression) � Ascending
        Collections.sort(people, (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge())); 

        System.out.println("Sorted People ArrayList by Age (Ascending): " + people);

          // Sort by age (using a custom Comparator with a lambda expression) � Descending
        Collections.sort(people, (p1, p2) -> Integer.compare(p2.getAge(), p1.getAge())); 

        System.out.println("Sorted People ArrayList by Age (Descending): " + people);



        // Sort by Name
        Collections.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println("Sorted People ArrayList by Name: " + people);

    }


}


class Person {  // Simple example class
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{" + name + ", " + age + "}";
    }

}
