import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some numbers to the ArrayList
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);
        numbers.add(4);


        System.out.println("Unsorted ArrayList: " + numbers);

        // Sort the ArrayList using Collections.sort()
        Collections.sort(numbers);

        System.out.println("Sorted ArrayList: " + numbers);


        // Example with Strings:
        ArrayList<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");
        names.add("David");

        System.out.println("\nUnsorted String ArrayList: " + names);
        Collections.sort(names);  // Sorts alphabetically (natural ordering for Strings)
        System.out.println("Sorted String ArrayList: " + names);


         //Example with custom objects (you'll need to implement Comparable or use a Comparator):

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 20));



        System.out.println("\nUnsorted People ArrayList: " + people);
        Collections.sort(people); // This assumes Person implements Comparable (see the Person class below)

        System.out.println("Sorted People ArrayList (by age): " + people);


    }
}


// Example of a custom class that implements Comparable to allow sorting
class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }


    @Override
    public int compareTo(Person other) {
        // Sort by age (ascending).  For descending, reverse the order (other.age - this.age)
        return this.age - other.age; 
    }
}


