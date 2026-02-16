import java.util.PriorityQueue;

public class EditPriorityQueue {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);
        pq.add(9);

        System.out.println("Original PriorityQueue: " + pq);

        // Element to edit (replace)
        int oldElement = 2;
        int newElement = 7;

        // Edit the element (no direct way, so remove and add)
        if (pq.remove(oldElement)) { // Remove the old element
            pq.add(newElement);     // Add the new element
            System.out.println("PriorityQueue after editing: " + pq);
        } else {
            System.out.println("Element " + oldElement + " not found in PriorityQueue.");
        }


        // Example with a custom object and Comparator:
        PriorityQueue<Student> studentPQ = new PriorityQueue<>((s1, s2) -> s1.id - s2.id); // Compare by ID

        studentPQ.add(new Student(101, "Alice"));
        studentPQ.add(new Student(103, "Charlie"));
        studentPQ.add(new Student(102, "Bob"));


        System.out.println("Original Student PriorityQueue: " + studentPQ);

        Student studentToEdit = new Student(102, "Bob"); // Object to edit
        Student updatedStudent = new Student(102, "Robert"); // Updated object



        // Editing custom objects requires iterating to find and then removing and adding. Less efficient
        for(Student s : studentPQ){
            if(s.id == studentToEdit.id){
                studentPQ.remove(s);
                studentPQ.add(updatedStudent);
                break;  // Important: exit the loop after editing
            }
        }

        System.out.println("Updated Student PriorityQueue: " + studentPQ);





    }

    static class Student {
        int id;
        String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }


        @Override
        public String toString() {
            return "{" + id + ", " + name + "}";
        }



        @Override
        public boolean equals(Object o){ // Essential for removal to work based on ID
           if(this == o) return true;
            if(!(o instanceof Student)) return false;

           Student other = (Student) o;
           return id == other.id;

        }




    }



}



