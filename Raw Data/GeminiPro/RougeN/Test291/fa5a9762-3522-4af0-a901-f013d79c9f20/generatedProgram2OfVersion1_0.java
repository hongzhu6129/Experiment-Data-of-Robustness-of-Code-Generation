public class PrintBooleanArraySingleMain {

    public static void main(String[] args) {
        boolean[][] boolArray = {
                {true, false, true},
                {false, true, false},
                {true, true, false}
        };


        for (int i = 0; i < boolArray.length; i++) {
            for (int j = 0; j < boolArray[i].length; j++) {
                System.out.print(boolArray[i][j] ? "t " : "f ");
            }
            System.out.println();
        }

    }
}
