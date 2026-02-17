import java.util.TreeMap;

public class GraduateTreeMap {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> studentGrades = new TreeMap<>();

        // Add some initial entries
        studentGrades.put(101, "C");
        studentGrades.put(102, "B");
        studentGrades.put(103, "A");
        studentGrades.put(104, "D");

        // Key (student ID) to graduate
        int studentIdToGraduate = 102;

        // Graduate the specified student by updating their grade 
        graduateStudent(studentGrades, studentIdToGraduate);


        // Print the updated TreeMap
        System.out.println("Updated TreeMap: " + studentGrades);


         // Example demonstrating graduating a student who doesn't exist.
        studentIdToGraduate = 105; // Non-existent student
        graduateStudent(studentGrades, studentIdToGraduate);
        System.out.println("Updated TreeMap (after attempting to graduate non-existent student): " + studentGrades);


    }

    private static void graduateStudent(TreeMap<Integer, String> grades, int studentId) {
        if (grades.containsKey(studentId)) {
            String currentGrade = grades.get(studentId);

            // Define graduation logic (example: A- becomes A, B+ becomes A-, etc.)
            String graduatedGrade = graduateGrade(currentGrade);

            grades.put(studentId, graduatedGrade); // Update the grade
            System.out.println("Student " + studentId + " graduated. Grade updated from " + currentGrade + " to " + graduatedGrade);
        } else {
            System.out.println("Student " + studentId + " not found in the records.");
        }
    }



     private static String graduateGrade(String currentGrade) {
        switch (currentGrade) {
            case "A-": return "A";
            case "B+": return "A-";
            case "B": return "B+";
            case "B-": return "B";
            case "C+": return "B-";
            case "C": return "C+";
            case "C-": return "C";
            case "D+": return "C-";
            case "D": return "D+";
            case "F": return "D"; // Example: Even F can be graduated to D in some systems.
            default: return currentGrade; // Already the highest grade or an invalid grade format. 
        }
    }



}
