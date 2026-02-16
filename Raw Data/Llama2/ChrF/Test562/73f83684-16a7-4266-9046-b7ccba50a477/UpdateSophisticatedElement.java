import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpdateSophisticatedElement {

    public static void main(String[] args) {
        // Example usage with Lists (sophisticated elements)
        List<Integer> originalList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int indexToUpdate = 2; // Update the element at index 2 (which is 3)
        int newValue = 10;

        updateListElement(originalList, indexToUpdate, newValue);
        System.out.println("Updated List: " + originalList);


        // Example usage with arrays (another type of sophisticated element)
        int[] originalArray = {1, 2, 3, 4, 5};
        indexToUpdate = 1; // Update the element at index 1 (which is 2)
        newValue = 20;

        updateArrayElement(originalArray, indexToUpdate, newValue);
        System.out.println("Updated Array: " + Arrays.toString(originalArray));



         // Example with a custom sophisticated object (e.g., a Person object)
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        List<Person> people = new ArrayList<>(Arrays.asList(person1, person2));

        Person updatedPerson = new Person("Alice", 35); // Update Alice's age

        updateSophisticatedObject(people, person1, updatedPerson); // Find and update Alice
        System.out.println("Updated People: " + people);





    }


    // Method to update a list element
    public static void updateListElement(List<Integer> list, int index, int newValue) {
        if (index >= 0 && index < list.size()) {
            list.set(index, newValue);
        } else {
            System.out.println("Invalid index for list update.");
        }
    }



    // Method to update an array element
    public static void updateArrayElement(int[] array, int index, int newValue) {
        if (index >= 0 && index < array.length) {
            array[index] = newValue;
        } else {
            System.out.println("Invalid index for array update.");
        }
    }


    public static <T> void updateSophisticatedObject(List<T> list, T oldObject, T newObject) {
        int index = list.indexOf(oldObject);  // Find the index of the object to replace
        if (index != -1) {
            list.set(index, newObject);
        } else {
            System.out.println("Object not found in the list.");
        }
    }


}


class Person {  // Example of a custom class (sophisticated object)
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" + name + ", " + age + "}"; // For printing the Person object neatly
    }

    @Override
    public boolean equals(Object obj) {  // Needed for indexOf() to work correctly
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name); // Compare based on name and age
    }

}
