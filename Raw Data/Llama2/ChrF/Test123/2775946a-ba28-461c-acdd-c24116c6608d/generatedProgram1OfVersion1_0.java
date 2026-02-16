import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static void main(String[] args) {
        // Example usage:
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);

        System.out.println("Unsorted list: " + numbers);

        // Sort the ArrayList using Collections.sort()
        Collections.sort(numbers); 

        System.out.println("Sorted list: " + numbers);


        // Example with Strings:
        ArrayList<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");
        names.add("David");

        System.out.println("\nUnsorted names: " + names);
        Collections.sort(names);
        System.out.println("Sorted names: " + names);


        // Example with custom objects (requires implementing Comparable)
         ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Bob", 25));
        people.add(new Person("Alice", 20));
        people.add(new Person("Charlie", 30));

        System.out.println("\nUnsorted people: " + people);
        Collections.sort(people); // Sorts based on age because Person implements Comparable
        System.out.println("Sorted people: " + people);

    }
}

// Example of a custom class that implements Comparable for sorting
class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        // Sort by age (ascending). You can change this to sort by other fields
        return Integer.compare(this.age, other.age); 
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

}
