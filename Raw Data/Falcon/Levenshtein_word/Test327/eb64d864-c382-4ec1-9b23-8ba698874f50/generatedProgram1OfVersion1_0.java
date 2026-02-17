import java.util.Arrays;

public class MagazineFace {

    public static char[][] createFace(int width, int height) {
        if (width < 3 || height < 3) {
            return null; // Invalid dimensions
        }

        char[][] face = new char[height][width];

        // Fill with spaces
        for (char[] row : face) {
            Arrays.fill(row, ' ');
        }

        // Draw the outline
        for (int i = 0; i < width; i++) {
            face[0][i] = '*'; // Top border
            face[height - 1][i] = '*'; // Bottom border
        }
        for (int i = 1; i < height - 1; i++) {
            face[i][0] = '*'; // Left border
            face[i][width - 1] = '*'; // Right border
        }


        // Draw the eyes
        int eyeY = height / 2;
        int eyeX1 = width / 4;
        int eyeX2 = (3 * width) / 4;
        face[eyeY][eyeX1] = 'O';
        face[eyeY][eyeX2] = 'O';

        // Draw the mouth (simple smile)
        int mouthY = (2 * height) / 3;  // Adjust for better positioning
        int mouthStart = width / 3;
        int mouthEnd = (2 * width) / 3;

        for (int i = mouthStart; i <= mouthEnd; i++) {
            face[mouthY][i] = (i == mouthStart || i == mouthEnd) ? '*' : '-'; // Add * at the corner of the smile
        }



        return face;
    }


    public static void printFace(char[][] face) {
        if (face == null) {
            System.out.println("Invalid face.");
            return;
        }
        for (char[] row : face) {
            System.out.println(new String(row));
        }
    }

    public static void main(String[] args) {
        // Test cases
        printFace(createFace(5, 5)); // Small face
        System.out.println();
        printFace(createFace(10, 7)); // Larger face
        System.out.println();
        printFace(createFace(2, 2)); // Invalid dimensions (too small)
        System.out.println();
        printFace(createFace(1, 5)); // Invalid dimensions
        System.out.println();
        printFace(createFace(3,3));  // Minimum valid size
        System.out.println();
        printFace(createFace(15, 9)); // Larger, odd dimensions
        System.out.println();
        printFace(createFace(12, 6)); // Larger, even dimensions



    }
}


