import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {
        // Example usage:
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3, 6, 5));

        List<Integer> distinctNumbers = numbers.stream()
                .distinct() // Removes duplicate elements
                .collect(Collectors.toList()); // Collects the distinct elements into a new list


        System.out.println("Original list: " + numbers);
        System.out.println("List with duplicates removed: " + distinctNumbers);


        // Example with Strings:
        List<String> words = new ArrayList<>(Arrays.asList("hello", "world", "hello", "java", "world", "coding"));

        List<String> distinctWords = words.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("\nOriginal list: " + words);
        System.out.println("List with duplicates removed: " + distinctWords);


         // Example with custom objects (requires overriding equals() and hashCode() if necessary):
         class Person {
            String name;
            int age;
            public Person (String n, int a) {
                name = n; age = a;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) return true;
                if (obj == null || getClass() != obj.getClass()) return false;
                Person person = (Person) obj;
                return age == person.age && name.equals(person.name);
            }
            @Override
            public int hashCode() {
                return Objects.hash(name, age);
            }

            @Override
            public String toString() {
                return name + " " +age; // Used in printing the list, etc.
            }

         }
        import java.util.Objects;  // Needed for Objects.hash

        List<Person> people = new ArrayList<>(Arrays.asList(new Person("Alice", 30), new Person("Bob", 25), new Person("Alice", 30), new Person("Charlie", 35)));

        List<Person> distinctPeople = people.stream().distinct().collect(Collectors.toList());
        System.out.println("\nOriginal list: " + people);
        System.out.println("List with duplicates removed: " + distinctPeople);
    }
}
