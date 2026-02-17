// Java program to solve Knight's Tour problem using recursion

public class KnightsTour {

    private int N;  // Chessboard size
    private int[][] solution;  // Solution matrix

    public KnightsTour(int N) {
        this.N = N;
        solution = new int[N][N];
    }

    // Function to check if the current position is valid
    private boolean isValid(int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N && solution[x][y] == 0);
    }

    // Function to find a valid move for the knight
    private boolean findValidMove(int x, int y, int moveCount) {
        if (moveCount == N * N) {
            return true;
        }

        for (int[] move : moves) {
            int nextX = x + move[0];
            int nextY = y + move[1];

            if (isValid(nextX, nextY)) {
                solution[nextX][nextY] = moveCount + 1;
                if (findValidMove(nextX, nextY, moveCount + 1)) {
                    return true;
                } else {
                    solution[nextX][nextY] = 0;
                }
            }
        }

        return false;
    }

    // Function to solve the Knight's Tour problem
    public boolean solve() {
        // Start from the top-left corner
        solution[0][0] = 1;

        // Make a recursive call to find a valid move
        return findValidMove(0, 0, 1);
    }

    // Function to print the solution
    public void printSolution() {
        for (int[] row : solution) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    // Driver code
    public static void main(String[] args) {
        int N = 8;
        KnightsTour kt = new KnightsTour(N);
        if (kt.solve()) {
            kt.printSolution();
        } else {
            System.out.println("No solution exists for this board size.");
        }
    }

    // Possible moves for the knight
    private static int[][] moves = {
        {1, 2},
        {1, -2},
        {2, 1},
        {2, -1},
        {-1, 2},
        {-1, -2},
        {-2, 1},
        {-2, -1}
    };
}
