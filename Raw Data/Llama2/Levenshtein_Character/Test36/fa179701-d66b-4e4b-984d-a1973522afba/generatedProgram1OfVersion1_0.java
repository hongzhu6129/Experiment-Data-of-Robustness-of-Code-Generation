import java.util.Scanner;

public class PrintFacing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter facing direction (N, S, E, W): ");
        String facing = scanner.nextLine().toUpperCase();

        String direction;

        switch (facing) {
            case "N":
                direction = "North";
                break;
            case "S":
                direction = "South";
                break;
            case "E":
                direction = "East";
                break;
            case "W":
                direction = "West";
                break;
            default:
                direction = "Invalid Input";
                break; // Important: Handle invalid input!
        }

        System.out.println(direction);
        scanner.close(); 
    }
}
