import java.util.TreeMap;

public class TreeMapGraduate {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> studentGrades = new TreeMap<>();

        // Add some initial grades
        studentGrades.put(101, "C");
        studentGrades.put(102, "B");
        studentGrades.put(103, "A");
        studentGrades.put(104, "B");
        studentGrades.put(105, "C");

        // Specify the key (student ID) and the new grade
        int studentId = 102;
        String newGrade = "A";


        // Graduate the grade
        graduateGrade(studentGrades, studentId, newGrade);

        // Print the updated TreeMap
        System.out.println("Updated TreeMap: " + studentGrades);

         //Example demonstrating graduation with an invalid key
        studentId = 109;  // Non-existent key
        newGrade = "A+";
        graduateGrade(studentGrades, studentId,newGrade);
        System.out.println("Updated TreeMap (after invalid key): " + studentGrades);


        // Example showing graduation to a lower grade (which is prevented)
        studentId = 103;  // Existing student
        newGrade = "B"; // Lower grade - won't update.
        graduateGrade(studentGrades, studentId, newGrade);
        System.out.println("Updated TreeMap (after attempted downgrade): " + studentGrades);


    }


    public static void graduateGrade(TreeMap<Integer, String> grades, int key, String newGrade) {
        if (!grades.containsKey(key)) {
            System.out.println("Student with ID " + key + " not found.");
            return; // or throw an exception if you prefer.
        }

        String currentGrade = grades.get(key);

        // Define grade precedence (you might want to make this more robust)
        if (newGrade.equals("A") && !currentGrade.equals("A")) {
            grades.put(key, newGrade);
            System.out.println("Student " + key + " graduated to " + newGrade);
        } else if (newGrade.equals("B") && currentGrade.equals("C")) {  // Allow graduation from C to B
             grades.put(key, newGrade);
             System.out.println("Student " + key + " graduated to " + newGrade);
        } else if( newGrade.compareTo(currentGrade) > 0){ //Allows graduation to a higher grade
            grades.put(key, newGrade);
            System.out.println("Student " + key + " graduated to " + newGrade);

        }
        else {
            System.out.println("Student " + key + " already has an equal or higher grade.  No change made.");

        }


    }
}
