import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of integers (you can change the type as needed)
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some elements to the ArrayList
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);
        numbers.add(4);


        // Sort the ArrayList using Collections.sort() - natural ordering (ascending for Integer)
        Collections.sort(numbers);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList: " + numbers);


        // Example of sorting in descending order using a Comparator (for Integer type)
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted ArrayList (Descending): " + numbers);



        // Example with Strings (natural ordering - alphabetical)
        ArrayList<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("Bob");
        names.add("Alice");
        Collections.sort(names);
        System.out.println("Sorted Strings: " + names);


        //Example with custom objects (requires implementing Comparable interface or providing a Comparator)
         ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 20));

        //Sort by age (ascending) using a Comparator
        Collections.sort(people, (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));  // Lambda expression for Comparator

        System.out.println("Sorted People by age: " + people);


    }
}


class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }
}
