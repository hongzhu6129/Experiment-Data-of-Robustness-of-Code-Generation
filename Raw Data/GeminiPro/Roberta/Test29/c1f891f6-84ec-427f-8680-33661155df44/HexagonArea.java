import java.util.Scanner;

public class HexagonArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of a side of the hexagon: ");
        double s = input.nextDouble();

        // Input validation: Side length must be positive
        if (s <= 0) {
            System.out.println("Side length must be a positive value.");
            return; // Exit the program if input is invalid
        }


        double area = (3 * Math.sqrt(3) * s * s) / 2;

        System.out.println("The area of the hexagon is: " + area);


        // Test Cases (demonstrated through direct input for simplicity - ideally, automated tests would be preferred)
        System.out.println("\n--- Test Cases ---");


        System.out.print("Enter side length (Test 1 - Regular Value): ");
        s = input.nextDouble();
        if (s <= 0) {System.out.println("Side length must be a positive value."); return;}
        area = (3 * Math.sqrt(3) * s * s) / 2; System.out.println("Area: " + area);

        System.out.print("Enter side length (Test 2 - Small Value): ");
        s = input.nextDouble();
        if (s <= 0) {System.out.println("Side length must be a positive value."); return;}
        area = (3 * Math.sqrt(3) * s * s) / 2; System.out.println("Area: " + area);


        System.out.print("Enter side length (Test 3 - Large Value): ");
        s = input.nextDouble();
        if (s <= 0) {System.out.println("Side length must be a positive value."); return;}
        area = (3 * Math.sqrt(3) * s * s) / 2; System.out.println("Area: " + area);


        System.out.print("Enter side length (Test 4 - Zero/Negative): ");  // Corner case
        s = input.nextDouble();
        if (s <= 0) {System.out.println("Side length must be a positive value."); return;}
        area = (3 * Math.sqrt(3) * s * s) / 2; System.out.println("Area: " + area);
        
        input.close();


    }
}
