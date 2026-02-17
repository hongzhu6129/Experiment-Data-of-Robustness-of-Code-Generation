public class Staircase {

    public static void main(String[] args) {
        int n = 10; // Example: Build a staircase with 10 coins

        int rows = 0;
        int coinsUsed = 0;
        int currentRowCoins = 1;

        while (coinsUsed + currentRowCoins <= n) {
            coinsUsed += currentRowCoins;
            currentRowCoins++; // Next row needs one more coin
            rows++;
        }


        // Print the staircase
        int coinsLeft = n;
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i && coinsLeft >0 ; j++) {
                System.out.print("* ");
                coinsLeft--;
            }

            System.out.println();
        }

        //Handle any remaining coins: This part prints the remaining coins on a new row if n is not a perfect "staircase number"
        if(coinsLeft>0)
        {
            for(int i = 0; i < coinsLeft; i++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
