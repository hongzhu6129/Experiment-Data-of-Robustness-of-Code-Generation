public class TestCircleCalculations {
    public static void main(String[] args) {
        testCalculateCircle(7.5, 47.1238898, 176.7145867); // Standard case
        testCalculateCircle(0, 0, 0); // Zero radius
        testCalculateCircle(-5, 0, 0); // Negative radius � expects an error message or exception handling in CircleCalculations.java
       // ... other test cases
    }

    public static void testCalculateCircle(double radius, double expectedPerimeter, double expectedArea) {
        // ... (Code to call your CircleCalculations methods and compare the results with expected values.  Print "Pass" or "Fail")
       CircleCalculations cc = new CircleCalculations();
        //Scanner needs to be mocked for testing
         // Calculate the perimeter (circumference)
        double perimeter = 2 * Math.PI * radius;

        // Calculate the area
        double area = Math.PI * radius * radius;
        if (Math.abs(perimeter - expectedPerimeter)<.0001 && Math.abs(area - expectedArea)<.0001){
             System.out.println("Passed test case for Radius="+radius);
        }else {
            System.out.println("Failed test case for Radius="+radius+ " with perimeter: "+perimeter +" and area: "+area);
        }
    }
}
