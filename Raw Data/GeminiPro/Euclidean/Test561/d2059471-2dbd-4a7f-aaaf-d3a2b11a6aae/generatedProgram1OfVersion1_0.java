import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> names = new ArrayList<>();
        names.add("Zara");
        names.add("Mahnaz");
        names.add("Ayan");
        names.add("Daisy");

        System.out.println("Unsorted ArrayList: " + names);

        // Sort the ArrayList using Collections.sort()
        Collections.sort(names);


        System.out.println("Sorted ArrayList: " + names);


         // Example with integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);
        numbers.add(9);
        numbers.add(2);
        numbers.add(6);

        System.out.println("\nUnsorted Integer ArrayList: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted Integer ArrayList: " + numbers);

        // Example with custom objects (requires implementing Comparable interface)
         ArrayList<Person> people = new ArrayList<>();
         people.add(new Person("Bob", 30));
         people.add(new Person("Alice", 25));
         people.add(new Person("Charlie", 35));


        System.out.println("\nUnsorted Person ArrayList: " + people);
        Collections.sort(people); // This will work if Person implements Comparable
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
        return "{" + name + ", " + age + "}"; 
    }

    @Override
    public int compareTo(Person other) {
        // Sort by age (ascending). You can change this to sort by name or other criteria.
         return this.age - other.age; // Or:  this.name.compareTo(other.name) for name sorting

        // For descending order, reverse the comparison: return other.age - this.age;
    }
}




