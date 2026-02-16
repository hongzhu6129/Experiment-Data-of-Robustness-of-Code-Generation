import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
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
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Banana");
        strings.add("Apple");
        strings.add("Orange");
        strings.add("Grape");

        System.out.println("\nUnsorted String ArrayList: " + strings);

        Collections.sort(strings);

        System.out.println("Sorted String ArrayList: " + strings);



        // Example with custom objects (requires implementing Comparable interface)
         ArrayList<Person> people = new ArrayList<>();
         people.add(new Person("Bob", 30));
         people.add(new Person("Alice", 25));
         people.add(new Person("Charlie", 35));

         System.out.println("\nUnsorted Person ArrayList: " + people);

         Collections.sort(people); // This will sort by age because Person implements Comparable

         System.out.println("Sorted Person ArrayList: " + people);



    }
}



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
        // Sort by age (ascending)
        return this.age - other.age;

        // Or sort by name (alphabetical)
        // return this.name.compareTo(other.name);
    }
}

