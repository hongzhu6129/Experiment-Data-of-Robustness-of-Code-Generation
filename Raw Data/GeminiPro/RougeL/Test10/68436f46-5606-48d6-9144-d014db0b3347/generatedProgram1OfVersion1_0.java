import java.util.Scanner;

public class Facing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the direction (N, S, E, W): ");
        String direction = scanner.nextLine().toUpperCase();

        String facingDirection = getFacingDirection(direction);

        if (facingDirection != null) {
            System.out.println("You are facing " + facingDirection);
        } else {
            System.out.println("Invalid direction input. Please enter N, S, E, or W.");
        }
        scanner.close();
    }


    public static String getFacingDirection(String direction) {
        switch (direction) {
            case "N":
                return "North";
            case "S":
                return "South";
            case "E":
                return "East";
            case "W":
                return "West";
            default:
                return null;  // Indicates invalid input
        }
    }
}
